package com.clevertap.android.sdk;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.app.usage.UsageStatsManager;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.WindowMetrics;
import ao.ad;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.login.LoginInfoProvider;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.Task;
import com.clevertap.android.sdk.utils.CTJsonConverter;
import com.clevertap.android.sdk.validation.ValidationResult;
import com.clevertap.android.sdk.validation.ValidationResultFactory;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.reactivex.annotations.SchedulerSupport;
import java.util.ArrayList;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class DeviceInfo {
    private static final String GUID_PREFIX = "__";
    static final int NULL = -1;
    private static final String OS_NAME = "Android";
    public static final int SMART_PHONE = 1;
    public static final int TABLET = 2;
    static final int TV = 3;
    static final int UNKNOWN = 0;
    static int sDeviceType = -1;
    private DeviceCachedInfo cachedInfo;
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final CoreMetaData mCoreMetaData;
    private final Object adIDLock = new Object();
    private boolean adIdRun = false;
    private final Object deviceIDLock = new Object();
    private boolean enableNetworkInfoReporting = false;
    private String googleAdID = null;
    private boolean limitAdTracking = false;
    private final ArrayList<ValidationResult> validationResults = new ArrayList<>();
    private String library = null;
    private String customLocale = null;

    /* renamed from: com.clevertap.android.sdk.DeviceInfo$1 */
    /* loaded from: classes3.dex */
    public class AnonymousClass1 implements Callable<Void> {
        public AnonymousClass1() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            DeviceInfo.this.getDeviceCachedInfo();
            return null;
        }
    }

    /* renamed from: com.clevertap.android.sdk.DeviceInfo$2 */
    /* loaded from: classes3.dex */
    public class AnonymousClass2 implements Callable<String> {
        final /* synthetic */ String val$cleverTapID;

        public AnonymousClass2(String str) {
            r2 = str;
        }

        @Override // java.util.concurrent.Callable
        public String call() throws Exception {
            return DeviceInfo.this.initDeviceID(r2);
        }
    }

    /* loaded from: classes3.dex */
    public class DeviceCachedInfo {
        private static final String STANDBY_BUCKET_ACTIVE = "active";
        private static final String STANDBY_BUCKET_FREQUENT = "frequent";
        private static final String STANDBY_BUCKET_RARE = "rare";
        private static final String STANDBY_BUCKET_RESTRICTED = "restricted";
        private static final String STANDBY_BUCKET_WORKING_SET = "working_set";
        private final String appBucket;
        private final int dpi;
        private final double height;
        private int localInAppCount;
        private final String locale;
        private final double width;
        private final String versionName = getVersionName();
        private final String osName = getOsName();
        private final String osVersion = getOsVersion();
        private final String manufacturer = getManufacturer();
        private final String model = getModel();
        private final String carrier = getCarrier();
        private final int build = getBuild();
        private final String networkType = getNetworkType();
        private final String bluetoothVersion = getBluetoothVersion();
        private final String countryCode = getCountryCode();
        private final int sdkVersion = getSdkVersion();

        public DeviceCachedInfo() {
            WindowSize windowSizeData = getWindowSizeData();
            this.width = windowSizeData.width;
            this.height = windowSizeData.height;
            this.dpi = windowSizeData.localDpi;
            this.localInAppCount = DeviceInfo.this.getLocalInAppCountFromPreference();
            this.locale = getDeviceLocale();
            if (Build.VERSION.SDK_INT >= 28) {
                this.appBucket = getAppBucket();
            } else {
                this.appBucket = null;
            }
        }

        public static /* synthetic */ int access$1608(DeviceCachedInfo deviceCachedInfo) {
            int i4 = deviceCachedInfo.localInAppCount;
            deviceCachedInfo.localInAppCount = i4 + 1;
            return i4;
        }

        private String getAppBucket() {
            int appStandbyBucket;
            appStandbyBucket = ((UsageStatsManager) DeviceInfo.this.context.getSystemService("usagestats")).getAppStandbyBucket();
            if (appStandbyBucket != 10) {
                if (appStandbyBucket != 20) {
                    if (appStandbyBucket != 30) {
                        if (appStandbyBucket != 40) {
                            if (appStandbyBucket != 45) {
                                return "";
                            }
                            return STANDBY_BUCKET_RESTRICTED;
                        }
                        return STANDBY_BUCKET_RARE;
                    }
                    return STANDBY_BUCKET_FREQUENT;
                }
                return STANDBY_BUCKET_WORKING_SET;
            }
            return STANDBY_BUCKET_ACTIVE;
        }

        private String getBluetoothVersion() {
            if (DeviceInfo.this.context.getPackageManager().hasSystemFeature("android.hardware.bluetooth_le")) {
                return "ble";
            }
            if (DeviceInfo.this.context.getPackageManager().hasSystemFeature("android.hardware.bluetooth")) {
                return "classic";
            }
            return SchedulerSupport.NONE;
        }

        private int getBuild() {
            try {
                return DeviceInfo.this.context.getPackageManager().getPackageInfo(DeviceInfo.this.context.getPackageName(), 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Logger.d("Unable to get app build");
                return 0;
            }
        }

        private String getCarrier() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) DeviceInfo.this.context.getSystemService("phone");
                if (telephonyManager != null) {
                    return telephonyManager.getNetworkOperatorName();
                }
                return null;
            } catch (Exception unused) {
                return null;
            }
        }

        private String getCountryCode() {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) DeviceInfo.this.context.getSystemService("phone");
                if (telephonyManager == null) {
                    return "";
                }
                return telephonyManager.getSimCountryIso();
            } catch (Throwable unused) {
                return "";
            }
        }

        private String getDeviceLocale() {
            String language = Locale.getDefault().getLanguage();
            if ("".equals(language)) {
                language = "xx";
            }
            String country = Locale.getDefault().getCountry();
            if ("".equals(country)) {
                country = "XX";
            }
            return ad.amber(language, "_", country);
        }

        private String getManufacturer() {
            return Build.MANUFACTURER;
        }

        private String getModel() {
            return Build.MODEL.replace(getManufacturer(), "");
        }

        @SuppressLint({"MissingPermission"})
        private String getNetworkType() {
            return Utils.getDeviceNetworkType(DeviceInfo.this.context);
        }

        private String getOsName() {
            return "Android";
        }

        private String getOsVersion() {
            return Build.VERSION.RELEASE;
        }

        private int getSdkVersion() {
            return BuildConfig.VERSION_CODE;
        }

        private String getVersionName() {
            try {
                return DeviceInfo.this.context.getPackageManager().getPackageInfo(DeviceInfo.this.context.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException unused) {
                Logger.d("Unable to get app version");
                return null;
            }
        }

        private WindowSize getWindowSizeData() {
            int i4;
            int i5;
            float f5;
            int i10;
            float f10;
            WindowMetrics currentWindowMetrics;
            WindowInsets windowInsets;
            int systemGestures;
            Insets insetsIgnoringVisibility;
            Rect bounds;
            int i11;
            int i12;
            Rect bounds2;
            int i13;
            int i14;
            WindowManager windowManager = DeviceInfo.this.getWindowManager();
            if (windowManager == null) {
                Logger.v("WindowManager is null, returning zero dimension for width/height");
                return new WindowSize(0, 0.0d, 0.0d);
            }
            if (Build.VERSION.SDK_INT >= 30) {
                currentWindowMetrics = windowManager.getCurrentWindowMetrics();
                Configuration configuration = DeviceInfo.this.context.getResources().getConfiguration();
                windowInsets = currentWindowMetrics.getWindowInsets();
                systemGestures = WindowInsets.Type.systemGestures();
                insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(systemGestures);
                bounds = currentWindowMetrics.getBounds();
                int width = bounds.width();
                i11 = insetsIgnoringVisibility.right;
                int i15 = width - i11;
                i12 = insetsIgnoringVisibility.left;
                i4 = i15 - i12;
                bounds2 = currentWindowMetrics.getBounds();
                int height = bounds2.height();
                i13 = insetsIgnoringVisibility.top;
                i14 = insetsIgnoringVisibility.bottom;
                i5 = (height - i13) - i14;
                int i16 = configuration.densityDpi;
                f5 = i16;
                i10 = i16;
                f10 = f5;
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                windowManager.getDefaultDisplay().getMetrics(displayMetrics);
                i4 = displayMetrics.widthPixels;
                i5 = displayMetrics.heightPixels;
                float f11 = displayMetrics.xdpi;
                f5 = displayMetrics.ydpi;
                i10 = displayMetrics.densityDpi;
                f10 = f11;
            }
            return new WindowSize(i10, toTwoPlaces(i4 / f10), toTwoPlaces(i5 / f5));
        }

        private double toTwoPlaces(double d4) {
            return Math.round(d4 * 100.0d) / 100.0d;
        }
    }

    /* loaded from: classes3.dex */
    public static class WindowSize {
        public final double height;
        public final int localDpi;
        public final double width;

        public WindowSize(int i4, double d4, double d9) {
            this.localDpi = i4;
            this.width = d4;
            this.height = d9;
        }
    }

    public DeviceInfo(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, String str, CoreMetaData coreMetaData) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.mCoreMetaData = coreMetaData;
    }

    private String _getDeviceID() {
        String string = StorageHelper.getString(this.context, getDeviceIdStorageKey(), null);
        if (this.config.isDefaultInstance()) {
            if (string != null) {
                return string;
            }
            return StorageHelper.getString(this.context, Constants.DEVICE_ID_TAG, null);
        }
        return string;
    }

    private String allowedSystemEventsKey() {
        String deviceID = getDeviceID();
        if (deviceID == null) {
            return null;
        }
        return "allowSystemEvents:".concat(deviceID);
    }

    private synchronized void fetchGoogleAdID() {
        Object invoke;
        Boolean bool;
        boolean z2 = false;
        synchronized (this) {
            try {
                getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "fetchGoogleAdID() called!");
                if (getGoogleAdID() == null && !this.adIdRun) {
                    String str = null;
                    try {
                        this.adIdRun = true;
                        invoke = AdvertisingIdClient.class.getMethod("getAdvertisingIdInfo", Context.class).invoke(null, this.context);
                        bool = (Boolean) invoke.getClass().getMethod("isLimitAdTrackingEnabled", null).invoke(invoke, null);
                    } catch (Throwable th) {
                        if (th.getCause() != null) {
                            getConfigLogger().verbose(this.config.getAccountId(), "Failed to get Advertising ID: " + th + th.getCause().toString());
                        } else {
                            getConfigLogger().verbose(this.config.getAccountId(), "Failed to get Advertising ID: " + th);
                        }
                    }
                    synchronized (this.adIDLock) {
                        if (bool != null) {
                            try {
                                if (bool.booleanValue()) {
                                    z2 = true;
                                }
                            } finally {
                            }
                        }
                        this.limitAdTracking = z2;
                        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "limitAdTracking = " + this.limitAdTracking);
                        if (this.limitAdTracking) {
                            getConfigLogger().debug(this.config.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                            return;
                        }
                        str = (String) invoke.getClass().getMethod("getId", null).invoke(invoke, null);
                        if (str != null && str.trim().length() > 2) {
                            synchronized (this.adIDLock) {
                                if (str.contains("00000000")) {
                                    getConfigLogger().debug(this.config.getAccountId(), "Device user has opted out of sharing Advertising ID, falling back to random UUID for CleverTap ID generation");
                                    return;
                                }
                                this.googleAdID = str.replace("-", "");
                            }
                        }
                        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "fetchGoogleAdID() done executing!");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private synchronized String generateDeviceID() {
        String generateGUID;
        String str;
        try {
            getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "generateDeviceID() called!");
            String googleAdID = getGoogleAdID();
            if (googleAdID != null) {
                str = Constants.GUID_PREFIX_GOOGLE_AD_ID.concat(googleAdID);
            } else {
                synchronized (this.deviceIDLock) {
                    generateGUID = generateGUID();
                }
                str = generateGUID;
            }
            forceUpdateDeviceId(str);
            getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "generateDeviceID() done executing!");
        } catch (Throwable th) {
            throw th;
        }
        return str;
    }

    private synchronized String generateFallbackDeviceID() {
        String str;
        String fallBackDeviceID = getFallBackDeviceID();
        if (fallBackDeviceID != null) {
            return fallBackDeviceID;
        }
        synchronized (this.deviceIDLock) {
            str = Constants.ERROR_PROFILE_PREFIX + UUID.randomUUID().toString().replace("-", "");
            updateFallbackID(str);
        }
        return str;
    }

    private String generateGUID() {
        return GUID_PREFIX + UUID.randomUUID().toString().replace("-", "");
    }

    public static int getAppIconAsIntId(Context context) {
        return context.getApplicationInfo().icon;
    }

    private Logger getConfigLogger() {
        return this.config.getLogger();
    }

    public DeviceCachedInfo getDeviceCachedInfo() {
        if (this.cachedInfo == null) {
            this.cachedInfo = new DeviceCachedInfo();
        }
        return this.cachedInfo;
    }

    private String getDeviceIdStorageKey() {
        return "deviceId:" + this.config.getAccountId();
    }

    public static int getDeviceType(Context context) {
        int i4;
        if (sDeviceType == -1) {
            try {
                if (((UiModeManager) context.getSystemService("uimode")).getCurrentModeType() == 4) {
                    sDeviceType = 3;
                    return 3;
                }
            } catch (Exception e) {
                Logger.d("Failed to decide whether device is a TV!");
                e.printStackTrace();
            }
            try {
                if (context.getResources().getBoolean(R.bool.ctIsTablet)) {
                    i4 = 2;
                } else {
                    i4 = 1;
                }
                sDeviceType = i4;
            } catch (Exception e4) {
                Logger.d("Failed to decide whether device is a smart phone or tablet!");
                e4.printStackTrace();
                sDeviceType = 0;
            }
        }
        return sDeviceType;
    }

    private String getFallBackDeviceID() {
        return StorageHelper.getString(this.context, getFallbackIdStorageKey(), null);
    }

    private String getFallbackIdStorageKey() {
        return "fallbackId:" + this.config.getAccountId();
    }

    public int getLocalInAppCountFromPreference() {
        return StorageHelper.getInt(this.context, InAppController.LOCAL_INAPP_COUNT, 0);
    }

    public WindowManager getWindowManager() {
        Display display;
        Context createWindowContext;
        Context context = this.context;
        if (context == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                DisplayManager displayManager = (DisplayManager) context.getSystemService(DisplayManager.class);
                if (displayManager != null && (display = displayManager.getDisplay(0)) != null) {
                    createWindowContext = this.context.createDisplayContext(display).createWindowContext(2, null);
                    return (WindowManager) createWindowContext.getSystemService(WindowManager.class);
                }
            } catch (Exception e) {
                Logger.v("Window context creation failed: " + e.getMessage());
            }
        }
        return (WindowManager) this.context.getSystemService("window");
    }

    public String initDeviceID(String str) {
        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "Called initDeviceID()");
        if (this.config.getEnableCustomCleverTapId()) {
            if (str == null) {
                this.config.getLogger().info(recordDeviceError(18, new String[0]));
            }
        } else if (str != null) {
            this.config.getLogger().info(recordDeviceError(19, new String[0]));
        }
        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "Calling _getDeviceID");
        String _getDeviceID = _getDeviceID();
        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "Called _getDeviceID");
        if (_getDeviceID != null && _getDeviceID.trim().length() > 2) {
            getConfigLogger().verbose(this.config.getAccountId(), "CleverTap ID already present for profile");
            if (str != null) {
                getConfigLogger().info(this.config.getAccountId(), recordDeviceError(20, _getDeviceID, str));
            }
            return _getDeviceID;
        }
        if (this.config.getEnableCustomCleverTapId()) {
            return forceUpdateCustomCleverTapID(str);
        }
        if (!this.config.isUseGoogleAdId()) {
            getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "Calling generateDeviceID()");
            String generateDeviceID = generateDeviceID();
            getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "Called generateDeviceID()");
            return generateDeviceID;
        }
        fetchGoogleAdID();
        String generateDeviceID2 = generateDeviceID();
        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "initDeviceID() done executing!");
        return generateDeviceID2;
    }

    public /* synthetic */ void lambda$onInitDeviceInfo$0(String str) {
        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "DeviceID initialized successfully!" + Thread.currentThread());
        CleverTapAPI.instanceWithConfig(this.context, this.config).deviceIDCreated(str);
    }

    private String optOutKey() {
        String deviceID = getDeviceID();
        if (deviceID == null) {
            return null;
        }
        return "OptOut:".concat(deviceID);
    }

    private String recordDeviceError(int i4, String... strArr) {
        ValidationResult create = ValidationResultFactory.create(514, i4, strArr);
        this.validationResults.add(create);
        return create.getErrorDesc();
    }

    private void removeDeviceID() {
        StorageHelper.remove(this.context, getDeviceIdStorageKey());
    }

    private void updateFallbackID(String str) {
        getConfigLogger().verbose(this.config.getAccountId(), "Updating the fallback id - " + str);
        StorageHelper.putString(this.context, getFallbackIdStorageKey(), str);
    }

    public void enableDeviceNetworkInfoReporting(boolean z2) {
        this.enableNetworkInfoReporting = z2;
        StorageHelper.putBoolean(this.context, StorageHelper.storageKeyWithSuffix(this.config, Constants.NETWORK_INFO), this.enableNetworkInfoReporting);
        this.config.getLogger().verbose(this.config.getAccountId(), "Device Network Information reporting set to " + this.enableNetworkInfoReporting);
    }

    public void forceNewDeviceID() {
        forceUpdateDeviceId(generateGUID());
    }

    public String forceUpdateCustomCleverTapID(String str) {
        if (Utils.validateCTID(str)) {
            getConfigLogger().info(this.config.getAccountId(), "Setting CleverTap ID to custom CleverTap ID : " + str);
            String str2 = Constants.CUSTOM_CLEVERTAP_ID_PREFIX + str;
            forceUpdateDeviceId(str2);
            return str2;
        }
        String generateFallbackDeviceID = generateFallbackDeviceID();
        removeDeviceID();
        getConfigLogger().info(this.config.getAccountId(), recordDeviceError(21, str, getFallBackDeviceID()));
        return generateFallbackDeviceID;
    }

    @SuppressLint({"CommitPrefEdits"})
    public void forceUpdateDeviceId(String str) {
        getConfigLogger().verbose(this.config.getAccountId(), "Force updating the device ID to " + str);
        synchronized (this.deviceIDLock) {
            StorageHelper.putString(this.context, getDeviceIdStorageKey(), str);
        }
    }

    public String getAppBucket() {
        return getDeviceCachedInfo().appBucket;
    }

    public JSONObject getAppLaunchedFields() {
        boolean z2;
        try {
            if (getGoogleAdID() != null) {
                z2 = new LoginInfoProvider(this.context, this.config).deviceIsMultiUser();
            } else {
                z2 = false;
            }
            return CTJsonConverter.from(this, this.mCoreMetaData, this.enableNetworkInfoReporting, z2);
        } catch (Throwable th) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Failed to construct App Launched event", th);
            return new JSONObject();
        }
    }

    public String getAttributionID() {
        return getDeviceID();
    }

    public String getBluetoothVersion() {
        return getDeviceCachedInfo().bluetoothVersion;
    }

    public int getBuild() {
        return getDeviceCachedInfo().build;
    }

    public String getCarrier() {
        return getDeviceCachedInfo().carrier;
    }

    public Context getContext() {
        return this.context;
    }

    public String getCountryCode() {
        return getDeviceCachedInfo().countryCode;
    }

    public String getCustomLocale() {
        return this.customLocale;
    }

    public int getDPI() {
        return getDeviceCachedInfo().dpi;
    }

    public String getDeviceID() {
        String _getDeviceID = _getDeviceID();
        if (_getDeviceID != null) {
            return _getDeviceID;
        }
        return getFallBackDeviceID();
    }

    public String getDeviceLocale() {
        return getDeviceCachedInfo().locale;
    }

    public String getGoogleAdID() {
        String str;
        synchronized (this.adIDLock) {
            str = this.googleAdID;
        }
        return str;
    }

    public double getHeight() {
        return getDeviceCachedInfo().height;
    }

    public String getLibrary() {
        return this.library;
    }

    public int getLocalInAppCount() {
        return getDeviceCachedInfo().localInAppCount;
    }

    public String getLocale() {
        if (TextUtils.isEmpty(getCustomLocale())) {
            return getDeviceLocale();
        }
        return getCustomLocale();
    }

    public String getManufacturer() {
        return getDeviceCachedInfo().manufacturer;
    }

    public String getModel() {
        return getDeviceCachedInfo().model;
    }

    public String getNetworkType() {
        return getDeviceCachedInfo().networkType;
    }

    public String getOsName() {
        return getDeviceCachedInfo().osName;
    }

    public String getOsVersion() {
        return getDeviceCachedInfo().osVersion;
    }

    public int getSdkVersion() {
        return getDeviceCachedInfo().sdkVersion;
    }

    public ArrayList<ValidationResult> getValidationResults() {
        ArrayList<ValidationResult> arrayList = (ArrayList) this.validationResults.clone();
        this.validationResults.clear();
        return arrayList;
    }

    public String getVersionName() {
        return getDeviceCachedInfo().versionName;
    }

    public double getWidth() {
        return getDeviceCachedInfo().width;
    }

    public void incrementLocalInAppCount() {
        DeviceCachedInfo.access$1608(getDeviceCachedInfo());
    }

    @SuppressLint({"MissingPermission"})
    public Boolean isBluetoothEnabled() {
        BluetoothAdapter defaultAdapter;
        try {
            if (this.context.getPackageManager().checkPermission("android.permission.BLUETOOTH", this.context.getPackageName()) == 0 && (defaultAdapter = BluetoothAdapter.getDefaultAdapter()) != null) {
                return Boolean.valueOf(defaultAdapter.isEnabled());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean isErrorDeviceId() {
        String deviceID = getDeviceID();
        if (deviceID != null && deviceID.startsWith(Constants.ERROR_PROFILE_PREFIX)) {
            return true;
        }
        return false;
    }

    public boolean isLimitAdTrackingEnabled() {
        boolean z2;
        synchronized (this.adIDLock) {
            z2 = this.limitAdTracking;
        }
        return z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r0.isConnected() != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Boolean isWifiConnected() {
        ConnectivityManager connectivityManager;
        boolean z2;
        if (this.context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0 && (connectivityManager = (ConnectivityManager) this.context.getSystemService("connectivity")) != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                z2 = true;
                if (activeNetworkInfo.getType() == 1) {
                }
            }
            z2 = false;
            return Boolean.valueOf(z2);
        }
        return null;
    }

    public void onInitDeviceInfo(String str) {
        getConfigLogger().verbose(this.config.getAccountId() + ":async_deviceID", "DeviceInfo() called");
        CTExecutorFactory.executors(this.config).ioTask().execute("getDeviceCachedInfo", new Callable<Void>() { // from class: com.clevertap.android.sdk.DeviceInfo.1
            public AnonymousClass1() {
            }

            @Override // java.util.concurrent.Callable
            public Void call() throws Exception {
                DeviceInfo.this.getDeviceCachedInfo();
                return null;
            }
        });
        Task ioTask = CTExecutorFactory.executors(this.config).ioTask();
        ioTask.addOnSuccessListener(new h(this));
        ioTask.execute("initDeviceID", new Callable<String>() { // from class: com.clevertap.android.sdk.DeviceInfo.2
            final /* synthetic */ String val$cleverTapID;

            public AnonymousClass2(String str2) {
                r2 = str2;
            }

            @Override // java.util.concurrent.Callable
            public String call() throws Exception {
                return DeviceInfo.this.initDeviceID(r2);
            }
        });
    }

    public void saveAllowedSystemEventsState(boolean z2) {
        String allowedSystemEventsKey = allowedSystemEventsKey();
        if (allowedSystemEventsKey == null) {
            getConfigLogger().verbose(this.config.getAccountId(), "Unable to persist user allowed system events and communications flag state, storage key is null");
            return;
        }
        StorageHelper.putBoolean(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), allowedSystemEventsKey), z2);
        getConfigLogger().verbose(this.config.getAccountId(), "Set current user allowed system events and communications flag state to: " + z2);
    }

    public void saveOptOutState(boolean z2) {
        String optOutKey = optOutKey();
        if (optOutKey == null) {
            getConfigLogger().verbose(this.config.getAccountId(), "Unable to persist user OptOut state, storage key is null");
            return;
        }
        StorageHelper.putBoolean(this.context, StorageHelper.storageKeyWithSuffix(this.config.getAccountId(), optOutKey), z2);
        getConfigLogger().verbose(this.config.getAccountId(), "Set current user OptOut state to: " + z2);
    }

    public void setCurrentUserOptOutStateFromStorage() {
        String optOutKey = optOutKey();
        if (optOutKey == null) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Unable to set current user OptOut state from storage: storage key is null");
            return;
        }
        boolean booleanFromPrefs = StorageHelper.getBooleanFromPrefs(this.context, this.config, optOutKey);
        this.mCoreMetaData.setCurrentUserOptedOut(booleanFromPrefs);
        this.config.getLogger().verbose(this.config.getAccountId(), "Set current user OptOut state from storage to: " + booleanFromPrefs + " for key: " + optOutKey);
    }

    public void setCustomLocale(String str) {
        this.customLocale = str;
    }

    public void setDeviceNetworkInfoReportingFromStorage() {
        boolean booleanFromPrefs = StorageHelper.getBooleanFromPrefs(this.context, this.config, Constants.NETWORK_INFO);
        this.config.getLogger().verbose(this.config.getAccountId(), "Setting device network info reporting state from storage to " + booleanFromPrefs);
        this.enableNetworkInfoReporting = booleanFromPrefs;
    }

    public void setLibrary(String str) {
        this.library = str;
    }

    public void setSystemEventsAllowedStateFromStorage() {
        String allowedSystemEventsKey = allowedSystemEventsKey();
        if (allowedSystemEventsKey == null) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Unable to set current user allowed system events and communications flag from storage: storage key is null");
            return;
        }
        boolean booleanFromPrefs = StorageHelper.getBooleanFromPrefs(this.context, this.config, allowedSystemEventsKey);
        this.mCoreMetaData.setEnabledSystemEvents(booleanFromPrefs);
        this.config.getLogger().verbose(this.config.getAccountId(), "Set current user allowed system events and communications flag state from storage to: " + booleanFromPrefs + " for key: " + allowedSystemEventsKey);
    }
}
