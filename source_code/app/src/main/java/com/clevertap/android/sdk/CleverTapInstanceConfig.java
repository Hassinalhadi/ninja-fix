package com.clevertap.android.sdk;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.P0;
import ao.ad;
import com.checkout.components.card.utils.constants.ExpiryDateConstantsKt;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.cryption.EncryptionLevel;
import com.clevertap.android.sdk.login.LoginConstants;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import com.clevertap.android.sdk.pushnotification.PushType;
import com.clevertap.android.sdk.utils.CTJsonConverter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CleverTapInstanceConfig implements Parcelable {
    public static final Parcelable.Creator<CleverTapInstanceConfig> CREATOR = new Parcelable.Creator<CleverTapInstanceConfig>() { // from class: com.clevertap.android.sdk.CleverTapInstanceConfig.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CleverTapInstanceConfig createFromParcel(Parcel parcel) {
            return new CleverTapInstanceConfig(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CleverTapInstanceConfig[] newArray(int i4) {
            return new CleverTapInstanceConfig[i4];
        }
    };
    private static final String KEY_ACCOUNT_ID = "accountId";
    private static final String KEY_ACCOUNT_REGION = "accountRegion";
    private static final String KEY_ACCOUNT_TOKEN = "accountToken";
    private static final String KEY_ANALYTICS_ONLY = "analyticsOnly";
    private static final String KEY_BACKGROUND_SYNC = "backgroundSync";
    private static final String KEY_BETA = "beta";
    private static final String KEY_CREATED_POST_APP_LAUNCH = "createdPostAppLaunch";
    private static final String KEY_CUSTOM_HANDSHAKE_DOMAIN = "customHandshakeDomain";
    private static final String KEY_DEBUG_LEVEL = "debugLevel";
    private static final String KEY_DEFAULT_INSTANCE = "isDefaultInstance";
    private static final String KEY_DISABLE_APP_LAUNCHED = "disableAppLaunchedEvent";
    private static final String KEY_ENABLE_CUSTOM_CT_ID = "getEnableCustomCleverTapId";
    private static final String KEY_ENCRYPTION_IN_TRANSIT = "encryptionInTransit";
    public static final String KEY_ENCRYPTION_LEVEL = "encryptionLevel";
    private static final String KEY_FCM_SENDER_ID = "fcmSenderId";
    private static final String KEY_IDENTITY_TYPES = "identityTypes";
    private static final String KEY_PACKAGE_NAME = "packageName";
    private static final String KEY_PERSONALIZATION = "personalization";
    private static final String KEY_PROXY_DOMAIN = "proxyDomain";
    private static final String KEY_PUSH_TYPES = "allowedPushTypes";
    private static final String KEY_SPIKY_PROXY_DOMAIN = "spikyProxyDomain";
    private static final String KEY_SSL_PINNING = "sslPinning";
    private static final String KEY_USE_GOOGLE_AD_ID = "useGoogleAdId";
    private String accountId;
    private String accountRegion;
    private String accountToken;
    private boolean analyticsOnly;
    private boolean backgroundSync;
    private boolean beta;
    private boolean createdPostAppLaunch;
    private String customHandshakeDomain;
    private int debugLevel;
    private boolean disableAppLaunchedEvent;
    private boolean enableCustomCleverTapId;
    private String encryptionInTransit;
    private int encryptionLevel;
    private String fcmSenderId;
    private String[] identityKeys;
    private boolean isDefaultInstance;
    private Logger logger;
    private String packageName;
    private boolean personalization;
    private String proxyDomain;
    private final ArrayList<PushType> pushTypes;
    private String spikyProxyDomain;
    private boolean sslPinning;
    private boolean useGoogleAdId;

    private void buildPushProvidersFromManifest(ManifestInfo manifestInfo) {
        String[] split;
        String[] split2;
        try {
            String vendorOneProvider = manifestInfo.getVendorOneProvider();
            if (vendorOneProvider != null && (split2 = vendorOneProvider.split(Constants.SEPARATOR_COMMA)) != null && split2.length == 4) {
                addPushType(new PushType(split2[0].trim(), split2[1].trim(), split2[2].trim(), split2[3].trim()));
            }
            String vendorTwoProvider = manifestInfo.getVendorTwoProvider();
            if (vendorTwoProvider != null && (split = vendorTwoProvider.split(Constants.SEPARATOR_COMMA)) != null && split.length == 4) {
                addPushType(new PushType(split[0].trim(), split[1].trim(), split[2].trim(), split[3].trim()));
            }
        } catch (Exception unused) {
            Logger.v("There was some problem in loading push providers from manifest");
        }
    }

    public static CleverTapInstanceConfig createDefaultInstance(Context context, String str, String str2, String str3) {
        return createInstanceWithManifest(ManifestInfo.getInstance(context), str, str2, str3, true);
    }

    public static CleverTapInstanceConfig createInstance(Context context, String str, String str2) {
        return createInstance(context, str, str2, null);
    }

    public static CleverTapInstanceConfig createInstanceWithManifest(ManifestInfo manifestInfo, String str, String str2, String str3, boolean z2) {
        return new CleverTapInstanceConfig(manifestInfo, str, str2, str3, z2);
    }

    public static CleverTapInstanceConfig getDefaultInstance(Context context) {
        ManifestInfo manifestInfo = ManifestInfo.getInstance(context);
        return createInstanceWithManifest(manifestInfo, manifestInfo.getAccountId(), manifestInfo.getAccountToken(), manifestInfo.getAccountRegion(), true);
    }

    private String getDefaultSuffix(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder(Constants.AES_PREFIX);
        if (!TextUtils.isEmpty(str)) {
            str2 = av.q.echo(":", str);
        } else {
            str2 = "";
        }
        sb2.append(str2);
        sb2.append(":");
        return P0.gold(sb2, this.accountId, Constants.AES_SUFFIX);
    }

    private JSONArray getPushTypesArray() {
        JSONArray jSONArray = new JSONArray();
        Iterator<PushType> it = getPushTypes().iterator();
        while (it.hasNext()) {
            PushType next = it.next();
            if (next != PushConstants.FCM) {
                jSONArray.put(next.toJSONObject());
            }
        }
        return jSONArray;
    }

    public void addPushType(PushType pushType) {
        if (!this.pushTypes.contains(pushType)) {
            this.pushTypes.add(pushType);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void enablePersonalization(boolean z2) {
        this.personalization = z2;
    }

    public String getAccountId() {
        return this.accountId;
    }

    public String getAccountRegion() {
        return this.accountRegion;
    }

    public String getAccountToken() {
        return this.accountToken;
    }

    public String getCustomHandshakeDomain() {
        return this.customHandshakeDomain;
    }

    public int getDebugLevel() {
        return this.debugLevel;
    }

    public boolean getEnableCustomCleverTapId() {
        return this.enableCustomCleverTapId;
    }

    public int getEncryptionLevel() {
        return this.encryptionLevel;
    }

    public String getFcmSenderId() {
        return this.fcmSenderId;
    }

    public String[] getIdentityKeys() {
        return this.identityKeys;
    }

    public Logger getLogger() {
        if (this.logger == null) {
            this.logger = new Logger(this.debugLevel);
        }
        return this.logger;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getProxyDomain() {
        return this.proxyDomain;
    }

    public ArrayList<PushType> getPushTypes() {
        return this.pushTypes;
    }

    public String getSpikyProxyDomain() {
        return this.spikyProxyDomain;
    }

    public boolean isAnalyticsOnly() {
        return this.analyticsOnly;
    }

    public boolean isBackgroundSync() {
        return this.backgroundSync;
    }

    public boolean isBeta() {
        return this.beta;
    }

    public boolean isCreatedPostAppLaunch() {
        return this.createdPostAppLaunch;
    }

    public boolean isDefaultInstance() {
        return this.isDefaultInstance;
    }

    public boolean isDisableAppLaunchedEvent() {
        return this.disableAppLaunchedEvent;
    }

    public boolean isEncryptionInTransitEnabled() {
        try {
            if (Integer.parseInt(this.encryptionInTransit) <= 0) {
                return false;
            }
            return true;
        } catch (NumberFormatException unused) {
            Logger.v("Invalid value passed in manifest for encryption in transit");
            return false;
        }
    }

    public boolean isPersonalizationEnabled() {
        return this.personalization;
    }

    public boolean isSslPinningEnabled() {
        return this.sslPinning;
    }

    public boolean isUseGoogleAdId() {
        return this.useGoogleAdId;
    }

    public void log(String str, String str2) {
        this.logger.verbose(getDefaultSuffix(str), str2);
    }

    public void setAnalyticsOnly(boolean z2) {
        this.analyticsOnly = z2;
    }

    public void setBackgroundSync(boolean z2) {
        this.backgroundSync = z2;
    }

    public void setCreatedPostAppLaunch() {
        this.createdPostAppLaunch = true;
    }

    public void setCustomHandshakeDomain(String str) {
        this.customHandshakeDomain = str;
    }

    public void setDebugLevel(CleverTapAPI.LogLevel logLevel) {
        setDebugLevel(logLevel.intValue());
    }

    public void setDisableAppLaunchedEvent(boolean z2) {
        this.disableAppLaunchedEvent = z2;
    }

    public void setEnableCustomCleverTapId(boolean z2) {
        this.enableCustomCleverTapId = z2;
    }

    public void setEncryptionInTransit(boolean z2) {
        String str;
        if (z2) {
            str = "1";
        } else {
            str = ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO;
        }
        this.encryptionInTransit = str;
    }

    public void setEncryptionLevel(EncryptionLevel encryptionLevel) {
        this.encryptionLevel = encryptionLevel.getValue();
    }

    public void setIdentityKeys(String... strArr) {
        if (!this.isDefaultInstance) {
            this.identityKeys = strArr;
            log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "Setting Profile Keys via setter: " + Arrays.toString(this.identityKeys));
        }
    }

    public void setProxyDomain(String str) {
        this.proxyDomain = str;
    }

    public void setSpikyProxyDomain(String str) {
        this.spikyProxyDomain = str;
    }

    public String toJSONString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(KEY_ACCOUNT_ID, getAccountId());
            jSONObject.put(KEY_ACCOUNT_TOKEN, getAccountToken());
            jSONObject.put(KEY_ACCOUNT_REGION, getAccountRegion());
            jSONObject.put(KEY_PROXY_DOMAIN, getProxyDomain());
            jSONObject.put(KEY_SPIKY_PROXY_DOMAIN, getSpikyProxyDomain());
            jSONObject.put(KEY_CUSTOM_HANDSHAKE_DOMAIN, getCustomHandshakeDomain());
            jSONObject.put(KEY_FCM_SENDER_ID, getFcmSenderId());
            jSONObject.put(KEY_ANALYTICS_ONLY, isAnalyticsOnly());
            jSONObject.put(KEY_DEFAULT_INSTANCE, isDefaultInstance());
            jSONObject.put(KEY_USE_GOOGLE_AD_ID, isUseGoogleAdId());
            jSONObject.put(KEY_DISABLE_APP_LAUNCHED, isDisableAppLaunchedEvent());
            jSONObject.put(KEY_PERSONALIZATION, isPersonalizationEnabled());
            jSONObject.put(KEY_DEBUG_LEVEL, getDebugLevel());
            jSONObject.put(KEY_CREATED_POST_APP_LAUNCH, isCreatedPostAppLaunch());
            jSONObject.put(KEY_SSL_PINNING, isSslPinningEnabled());
            jSONObject.put(KEY_BACKGROUND_SYNC, isBackgroundSync());
            jSONObject.put(KEY_ENABLE_CUSTOM_CT_ID, getEnableCustomCleverTapId());
            jSONObject.put(KEY_PACKAGE_NAME, getPackageName());
            jSONObject.put(KEY_BETA, isBeta());
            jSONObject.put(KEY_ENCRYPTION_LEVEL, getEncryptionLevel());
            jSONObject.put(KEY_ENCRYPTION_IN_TRANSIT, this.encryptionInTransit);
            jSONObject.put(KEY_PUSH_TYPES, getPushTypesArray());
            return jSONObject.toString();
        } catch (Throwable th) {
            Logger.v("Unable to convert config to JSON : ", th.getCause());
            return null;
        }
    }

    public void useGoogleAdId(boolean z2) {
        this.useGoogleAdId = z2;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.accountId);
        parcel.writeString(this.accountToken);
        parcel.writeString(this.accountRegion);
        parcel.writeString(this.proxyDomain);
        parcel.writeString(this.spikyProxyDomain);
        parcel.writeString(this.customHandshakeDomain);
        parcel.writeByte(this.analyticsOnly ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isDefaultInstance ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.useGoogleAdId ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.disableAppLaunchedEvent ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.personalization ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.debugLevel);
        parcel.writeByte(this.createdPostAppLaunch ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.sslPinning ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.backgroundSync ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.enableCustomCleverTapId ? (byte) 1 : (byte) 0);
        parcel.writeString(this.fcmSenderId);
        parcel.writeString(this.packageName);
        parcel.writeByte(this.beta ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.identityKeys);
        parcel.writeInt(this.encryptionLevel);
        parcel.writeString(this.encryptionInTransit);
        parcel.writeString(getPushTypesArray().toString());
    }

    public CleverTapInstanceConfig(CleverTapInstanceConfig cleverTapInstanceConfig) {
        this.pushTypes = PushNotificationUtil.getDefaultPushTypes();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = cleverTapInstanceConfig.accountId;
        this.accountToken = cleverTapInstanceConfig.accountToken;
        this.accountRegion = cleverTapInstanceConfig.accountRegion;
        this.proxyDomain = cleverTapInstanceConfig.proxyDomain;
        this.spikyProxyDomain = cleverTapInstanceConfig.spikyProxyDomain;
        this.customHandshakeDomain = cleverTapInstanceConfig.customHandshakeDomain;
        this.isDefaultInstance = cleverTapInstanceConfig.isDefaultInstance;
        this.analyticsOnly = cleverTapInstanceConfig.analyticsOnly;
        this.personalization = cleverTapInstanceConfig.personalization;
        this.debugLevel = cleverTapInstanceConfig.debugLevel;
        this.logger = cleverTapInstanceConfig.logger;
        this.useGoogleAdId = cleverTapInstanceConfig.useGoogleAdId;
        this.disableAppLaunchedEvent = cleverTapInstanceConfig.disableAppLaunchedEvent;
        this.createdPostAppLaunch = cleverTapInstanceConfig.createdPostAppLaunch;
        this.sslPinning = cleverTapInstanceConfig.sslPinning;
        this.backgroundSync = cleverTapInstanceConfig.backgroundSync;
        this.enableCustomCleverTapId = cleverTapInstanceConfig.enableCustomCleverTapId;
        this.fcmSenderId = cleverTapInstanceConfig.fcmSenderId;
        this.packageName = cleverTapInstanceConfig.packageName;
        this.beta = cleverTapInstanceConfig.beta;
        this.identityKeys = cleverTapInstanceConfig.identityKeys;
        this.encryptionLevel = cleverTapInstanceConfig.encryptionLevel;
        Iterator<PushType> it = cleverTapInstanceConfig.pushTypes.iterator();
        while (it.hasNext()) {
            addPushType(it.next());
        }
        this.encryptionInTransit = cleverTapInstanceConfig.encryptionInTransit;
    }

    public static CleverTapInstanceConfig createInstance(Context context, String str, String str2, String str3) {
        if (str != null && str2 != null) {
            return createInstanceWithManifest(ManifestInfo.getInstance(context), str, str2, str3, false);
        }
        Logger.i("CleverTap accountId and accountToken cannot be null");
        return null;
    }

    public void log(String str, String str2, Throwable th) {
        this.logger.verbose(getDefaultSuffix(str), str2, th);
    }

    public void setDebugLevel(int i4) {
        this.debugLevel = i4;
        Logger logger = this.logger;
        if (logger != null) {
            logger.setDebugLevel(i4);
        }
    }

    public static CleverTapInstanceConfig createInstance(String str) {
        try {
            return new CleverTapInstanceConfig(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    private CleverTapInstanceConfig(ManifestInfo manifestInfo, String str, String str2, String str3, boolean z2) {
        this.pushTypes = PushNotificationUtil.getDefaultPushTypes();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = str;
        this.accountToken = str2;
        this.accountRegion = str3;
        this.isDefaultInstance = z2;
        this.analyticsOnly = false;
        this.personalization = true;
        int intValue = CleverTapAPI.LogLevel.INFO.intValue();
        this.debugLevel = intValue;
        this.logger = new Logger(intValue);
        this.createdPostAppLaunch = false;
        this.useGoogleAdId = manifestInfo.useGoogleAdId();
        this.disableAppLaunchedEvent = manifestInfo.isAppLaunchedDisabled();
        this.sslPinning = manifestInfo.isSSLPinningEnabled();
        this.backgroundSync = manifestInfo.isBackgroundSync();
        this.fcmSenderId = manifestInfo.getFCMSenderId();
        this.packageName = manifestInfo.getPackageName();
        this.enableCustomCleverTapId = manifestInfo.useCustomId();
        this.beta = manifestInfo.enableBeta();
        if (this.isDefaultInstance) {
            this.encryptionLevel = manifestInfo.getEncryptionLevel();
            this.identityKeys = manifestInfo.getProfileKeys();
            log(LoginConstants.LOG_TAG_ON_USER_LOGIN, "Setting Profile Keys from Manifest: " + Arrays.toString(this.identityKeys));
        } else {
            this.encryptionLevel = 0;
        }
        buildPushProvidersFromManifest(manifestInfo);
        String encryptionInTransit = manifestInfo.getEncryptionInTransit();
        this.encryptionInTransit = encryptionInTransit == null ? ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO : encryptionInTransit;
    }

    private CleverTapInstanceConfig(String str) throws Throwable {
        this.pushTypes = PushNotificationUtil.getDefaultPushTypes();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(KEY_ACCOUNT_ID)) {
                this.accountId = jSONObject.getString(KEY_ACCOUNT_ID);
            }
            if (jSONObject.has(KEY_ACCOUNT_TOKEN)) {
                this.accountToken = jSONObject.getString(KEY_ACCOUNT_TOKEN);
            }
            if (jSONObject.has(KEY_PROXY_DOMAIN)) {
                this.proxyDomain = jSONObject.getString(KEY_PROXY_DOMAIN);
            }
            if (jSONObject.has(KEY_SPIKY_PROXY_DOMAIN)) {
                this.spikyProxyDomain = jSONObject.getString(KEY_SPIKY_PROXY_DOMAIN);
            }
            if (jSONObject.has(KEY_CUSTOM_HANDSHAKE_DOMAIN)) {
                this.customHandshakeDomain = jSONObject.optString(KEY_CUSTOM_HANDSHAKE_DOMAIN, null);
            }
            if (jSONObject.has(KEY_ACCOUNT_REGION)) {
                this.accountRegion = jSONObject.getString(KEY_ACCOUNT_REGION);
            }
            if (jSONObject.has(KEY_ANALYTICS_ONLY)) {
                this.analyticsOnly = jSONObject.getBoolean(KEY_ANALYTICS_ONLY);
            }
            if (jSONObject.has(KEY_DEFAULT_INSTANCE)) {
                this.isDefaultInstance = jSONObject.getBoolean(KEY_DEFAULT_INSTANCE);
            }
            if (jSONObject.has(KEY_USE_GOOGLE_AD_ID)) {
                this.useGoogleAdId = jSONObject.getBoolean(KEY_USE_GOOGLE_AD_ID);
            }
            if (jSONObject.has(KEY_DISABLE_APP_LAUNCHED)) {
                this.disableAppLaunchedEvent = jSONObject.getBoolean(KEY_DISABLE_APP_LAUNCHED);
            }
            if (jSONObject.has(KEY_PERSONALIZATION)) {
                this.personalization = jSONObject.getBoolean(KEY_PERSONALIZATION);
            }
            if (jSONObject.has(KEY_DEBUG_LEVEL)) {
                this.debugLevel = jSONObject.getInt(KEY_DEBUG_LEVEL);
            }
            this.logger = new Logger(this.debugLevel);
            if (jSONObject.has(KEY_PACKAGE_NAME)) {
                this.packageName = jSONObject.getString(KEY_PACKAGE_NAME);
            }
            if (jSONObject.has(KEY_CREATED_POST_APP_LAUNCH)) {
                this.createdPostAppLaunch = jSONObject.getBoolean(KEY_CREATED_POST_APP_LAUNCH);
            }
            if (jSONObject.has(KEY_SSL_PINNING)) {
                this.sslPinning = jSONObject.getBoolean(KEY_SSL_PINNING);
            }
            if (jSONObject.has(KEY_BACKGROUND_SYNC)) {
                this.backgroundSync = jSONObject.getBoolean(KEY_BACKGROUND_SYNC);
            }
            if (jSONObject.has(KEY_ENABLE_CUSTOM_CT_ID)) {
                this.enableCustomCleverTapId = jSONObject.getBoolean(KEY_ENABLE_CUSTOM_CT_ID);
            }
            if (jSONObject.has(KEY_FCM_SENDER_ID)) {
                this.fcmSenderId = jSONObject.getString(KEY_FCM_SENDER_ID);
            }
            if (jSONObject.has(KEY_BETA)) {
                this.beta = jSONObject.getBoolean(KEY_BETA);
            }
            if (jSONObject.has(KEY_IDENTITY_TYPES)) {
                this.identityKeys = (String[]) CTJsonConverter.toArray(jSONObject.getJSONArray(KEY_IDENTITY_TYPES));
            }
            if (jSONObject.has(KEY_ENCRYPTION_LEVEL)) {
                this.encryptionLevel = jSONObject.getInt(KEY_ENCRYPTION_LEVEL);
            }
            if (jSONObject.has(KEY_PUSH_TYPES)) {
                JSONArray jSONArray = jSONObject.getJSONArray(KEY_PUSH_TYPES);
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    PushType fromJSONObject = PushType.fromJSONObject(jSONArray.getJSONObject(i4));
                    if (fromJSONObject != null) {
                        addPushType(fromJSONObject);
                    }
                }
            }
            this.encryptionInTransit = jSONObject.optString(KEY_ENCRYPTION_IN_TRANSIT, ExpiryDateConstantsKt.EXPIRY_DATE_PREFIX_ZERO);
        } catch (Throwable th) {
            Logger.v(ad.gray("Error constructing CleverTapInstanceConfig from JSON: ", str, ": "), th.getCause());
            throw th;
        }
    }

    private CleverTapInstanceConfig(Parcel parcel) {
        this.pushTypes = PushNotificationUtil.getDefaultPushTypes();
        this.identityKeys = Constants.NULL_STRING_ARRAY;
        this.accountId = parcel.readString();
        this.accountToken = parcel.readString();
        this.accountRegion = parcel.readString();
        this.proxyDomain = parcel.readString();
        this.spikyProxyDomain = parcel.readString();
        this.customHandshakeDomain = parcel.readString();
        this.analyticsOnly = parcel.readByte() != 0;
        this.isDefaultInstance = parcel.readByte() != 0;
        this.useGoogleAdId = parcel.readByte() != 0;
        this.disableAppLaunchedEvent = parcel.readByte() != 0;
        this.personalization = parcel.readByte() != 0;
        this.debugLevel = parcel.readInt();
        this.createdPostAppLaunch = parcel.readByte() != 0;
        this.sslPinning = parcel.readByte() != 0;
        this.backgroundSync = parcel.readByte() != 0;
        this.enableCustomCleverTapId = parcel.readByte() != 0;
        this.fcmSenderId = parcel.readString();
        this.packageName = parcel.readString();
        this.logger = new Logger(this.debugLevel);
        this.beta = parcel.readByte() != 0;
        this.identityKeys = parcel.createStringArray();
        this.encryptionLevel = parcel.readInt();
        this.encryptionInTransit = parcel.readString();
        try {
            JSONArray jSONArray = new JSONArray(parcel.readString());
            for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                PushType fromJSONObject = PushType.fromJSONObject(jSONArray.getJSONObject(i4));
                if (fromJSONObject != null) {
                    addPushType(fromJSONObject);
                }
            }
        } catch (JSONException unused) {
            Logger.v("Error in loading push providers from parcel, using firebase");
        }
    }
}
