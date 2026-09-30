package com.clevertap.android.sdk.product_config;

import Q0.c;
import android.content.Context;
import android.text.TextUtils;
import com.clevertap.android.sdk.BaseAnalyticsManager;
import com.clevertap.android.sdk.BaseCallbackManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.OnSuccessListener;
import com.clevertap.android.sdk.utils.FileUtils;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class CTProductConfigController {
    private final BaseAnalyticsManager analyticsManager;
    private final BaseCallbackManager callbackManager;
    private final CleverTapInstanceConfig config;
    private final Context context;
    private final CoreMetaData coreMetaData;
    final FileUtils fileUtils;

    @Deprecated
    private final ProductConfigSettings settings;

    @Deprecated
    final Map<String, String> activatedConfigs = Collections.synchronizedMap(new HashMap());

    @Deprecated
    final Map<String, String> defaultConfigs = Collections.synchronizedMap(new HashMap());
    AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final AtomicBoolean isFetchAndActivating = new AtomicBoolean(false);
    private final Map<String, String> waitingTobeActivatedConfig = Collections.synchronizedMap(new HashMap());

    /* loaded from: classes3.dex */
    public enum PROCESSING_STATE {
        INIT,
        FETCHED,
        ACTIVATED
    }

    @Deprecated
    public CTProductConfigController(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, BaseAnalyticsManager baseAnalyticsManager, CoreMetaData coreMetaData, BaseCallbackManager baseCallbackManager, ProductConfigSettings productConfigSettings, FileUtils fileUtils) {
        this.context = context;
        this.config = cleverTapInstanceConfig;
        this.coreMetaData = coreMetaData;
        this.callbackManager = baseCallbackManager;
        this.analyticsManager = baseAnalyticsManager;
        this.settings = productConfigSettings;
        this.fileUtils = fileUtils;
        initAsync();
    }

    private boolean canRequest(long j5) {
        if (TextUtils.isEmpty(this.settings.getGuid())) {
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "Product Config: Throttled due to empty Guid");
            return false;
        }
        long lastFetchTimeStampInMillis = this.settings.getLastFetchTimeStampInMillis();
        long currentTimeMillis = (System.currentTimeMillis() - lastFetchTimeStampInMillis) - TimeUnit.SECONDS.toMillis(j5);
        if (currentTimeMillis > 0) {
            return true;
        }
        Logger logger = this.config.getLogger();
        String logTag = ProductConfigUtil.getLogTag(this.config);
        StringBuilder sb2 = new StringBuilder("Throttled since you made frequent request- [Last Request Time-");
        sb2.append(new Date(lastFetchTimeStampInMillis));
        sb2.append("], Try again in ");
        logger.verbose(logTag, c.mike((-currentTimeMillis) / 1000, " seconds", sb2));
        return false;
    }

    private HashMap<String, String> convertServerJsonToMap(JSONObject jSONObject) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONArray jSONArray = jSONObject.getJSONArray(Constants.KEY_KV);
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i4 = 0; i4 < jSONArray.length(); i4++) {
                    try {
                        JSONObject jSONObject2 = (JSONObject) jSONArray.get(i4);
                        if (jSONObject2 != null) {
                            String string = jSONObject2.getString(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY);
                            String string2 = jSONObject2.getString(CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_VALUE);
                            if (!TextUtils.isEmpty(string)) {
                                hashMap.put(string, string2);
                            }
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "ConvertServerJsonToMap failed: " + e.getLocalizedMessage());
                    }
                }
            }
            return hashMap;
        } catch (JSONException e4) {
            e4.printStackTrace();
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "ConvertServerJsonToMap failed - " + e4.getLocalizedMessage());
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap<String, String> getStoredValues(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            String readFromFile = this.fileUtils.readFromFile(str);
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "GetStoredValues reading file success:[ " + str + "]--[Content]" + readFromFile);
            if (!TextUtils.isEmpty(readFromFile)) {
                try {
                    JSONObject jSONObject = new JSONObject(readFromFile);
                    Iterator<String> keys = jSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        if (!TextUtils.isEmpty(next)) {
                            try {
                                String valueOf = String.valueOf(jSONObject.get(next));
                                if (!TextUtils.isEmpty(valueOf)) {
                                    hashMap.put(next, valueOf);
                                }
                            } catch (Exception e) {
                                e.printStackTrace();
                                Logger logger = this.config.getLogger();
                                String logTag = ProductConfigUtil.getLogTag(this.config);
                                StringBuilder victor = c.victor("GetStoredValues for key ", next, " while parsing json: ");
                                victor.append(e.getLocalizedMessage());
                                logger.verbose(logTag, victor.toString());
                            }
                        }
                    }
                } catch (Exception e4) {
                    e4.printStackTrace();
                    this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "GetStoredValues failed due to malformed json: " + e4.getLocalizedMessage());
                }
            }
            return hashMap;
        } catch (Exception e5) {
            e5.printStackTrace();
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "GetStoredValues reading file failed: " + e5.getLocalizedMessage());
            return hashMap;
        }
    }

    private void onActivated() {
        if (this.callbackManager.getProductConfigListener() != null) {
            this.callbackManager.getProductConfigListener().onActivated();
        }
    }

    private void onFetched() {
        if (this.callbackManager.getProductConfigListener() != null) {
            this.callbackManager.getProductConfigListener().onFetched();
        }
    }

    private void onInit() {
        if (this.callbackManager.getProductConfigListener() != null) {
            this.config.getLogger().verbose(this.config.getAccountId(), "Product Config initialized");
            this.callbackManager.getProductConfigListener().onInit();
        }
    }

    private synchronized void parseFetchedResponse(JSONObject jSONObject) {
        Integer num;
        HashMap<String, String> convertServerJsonToMap = convertServerJsonToMap(jSONObject);
        this.waitingTobeActivatedConfig.clear();
        this.waitingTobeActivatedConfig.putAll(convertServerJsonToMap);
        this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "Product Config: Fetched response:" + jSONObject);
        try {
            num = (Integer) jSONObject.get(CTProductConfigConstants.KEY_LAST_FETCHED_TIMESTAMP);
        } catch (Exception e) {
            e.printStackTrace();
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "ParseFetchedResponse failed: " + e.getLocalizedMessage());
            num = null;
        }
        if (num != null) {
            this.settings.setLastFetchTimeStampInMillis(num.intValue() * 1000);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendCallback(PROCESSING_STATE processing_state) {
        if (processing_state != null) {
            int ordinal = processing_state.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        onActivated();
                        return;
                    }
                    return;
                }
                onFetched();
                return;
            }
            onInit();
        }
    }

    @Deprecated
    public void activate() {
        if (TextUtils.isEmpty(this.settings.getGuid())) {
            return;
        }
        CTExecutorFactory.executors(this.config).ioTask().addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.2
            @Override // com.clevertap.android.sdk.task.OnSuccessListener
            public void onSuccess(Void r22) {
                CTProductConfigController.this.sendCallback(PROCESSING_STATE.ACTIVATED);
            }
        }).execute("activateProductConfigs", new Callable<Void>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.1
            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (this) {
                    try {
                        try {
                            HashMap hashMap = new HashMap();
                            if (!CTProductConfigController.this.waitingTobeActivatedConfig.isEmpty()) {
                                hashMap.putAll(CTProductConfigController.this.waitingTobeActivatedConfig);
                                CTProductConfigController.this.waitingTobeActivatedConfig.clear();
                            } else {
                                CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                                hashMap = cTProductConfigController.getStoredValues(cTProductConfigController.getActivatedFullPath());
                            }
                            CTProductConfigController.this.activatedConfigs.clear();
                            if (!CTProductConfigController.this.defaultConfigs.isEmpty()) {
                                CTProductConfigController cTProductConfigController2 = CTProductConfigController.this;
                                cTProductConfigController2.activatedConfigs.putAll(cTProductConfigController2.defaultConfigs);
                            }
                            CTProductConfigController.this.activatedConfigs.putAll(hashMap);
                            CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Activated successfully with configs: " + CTProductConfigController.this.activatedConfigs);
                        } catch (Exception e) {
                            e.printStackTrace();
                            CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Activate failed: " + e.getLocalizedMessage());
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            }
        });
    }

    @Deprecated
    public void eraseStoredConfigFiles() {
        CTExecutorFactory.executors(this.config).ioTask().execute("eraseStoredConfigs", new Callable<Void>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.6
            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (this) {
                    try {
                        String productConfigDirName = CTProductConfigController.this.getProductConfigDirName();
                        CTProductConfigController.this.fileUtils.deleteDirectory(productConfigDirName);
                        CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Reset Deleted Dir: " + productConfigDirName);
                    } catch (Exception e) {
                        e.printStackTrace();
                        CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Reset failed: " + e.getLocalizedMessage());
                    }
                }
                return null;
            }
        });
    }

    @Deprecated
    public void fetch() {
        fetch(this.settings.getNextFetchIntervalInSeconds());
    }

    @Deprecated
    public void fetchAndActivate() {
        fetch();
        this.isFetchAndActivating.set(true);
    }

    @Deprecated
    public void fetchProductConfig() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("t", 0);
            jSONObject.put(Constants.KEY_EVT_NAME, Constants.WZRK_FETCH);
            jSONObject.put(Constants.KEY_EVT_DATA, jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.analyticsManager.sendFetchEvent(jSONObject);
        this.coreMetaData.setProductConfigRequested(true);
        this.config.getLogger().verbose(this.config.getAccountId(), "Product Config : Fetching product config");
    }

    public String getActivatedFullPath() {
        return getProductConfigDirName() + "/activated.json";
    }

    public BaseAnalyticsManager getAnalyticsManager() {
        return this.analyticsManager;
    }

    @Deprecated
    public Boolean getBoolean(String str) {
        if (this.isInitialized.get() && !TextUtils.isEmpty(str)) {
            String str2 = this.activatedConfigs.get(str);
            if (!TextUtils.isEmpty(str2)) {
                return Boolean.valueOf(Boolean.parseBoolean(str2));
            }
        }
        return CTProductConfigConstants.DEFAULT_VALUE_FOR_BOOLEAN;
    }

    public BaseCallbackManager getCallbackManager() {
        return this.callbackManager;
    }

    public CleverTapInstanceConfig getConfig() {
        return this.config;
    }

    public CoreMetaData getCoreMetaData() {
        return this.coreMetaData;
    }

    @Deprecated
    public Double getDouble(String str) {
        if (this.isInitialized.get() && !TextUtils.isEmpty(str)) {
            try {
                String str2 = this.activatedConfigs.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    return Double.valueOf(Double.parseDouble(str2));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Logger logger = this.config.getLogger();
                String logTag = ProductConfigUtil.getLogTag(this.config);
                StringBuilder victor = c.victor("Error getting Double for Key-", str, " ");
                victor.append(e.getLocalizedMessage());
                logger.verbose(logTag, victor.toString());
            }
        }
        return CTProductConfigConstants.DEFAULT_VALUE_FOR_DOUBLE;
    }

    @Deprecated
    public long getLastFetchTimeStampInMillis() {
        return this.settings.getLastFetchTimeStampInMillis();
    }

    @Deprecated
    public Long getLong(String str) {
        if (this.isInitialized.get() && !TextUtils.isEmpty(str)) {
            try {
                String str2 = this.activatedConfigs.get(str);
                if (!TextUtils.isEmpty(str2)) {
                    return Long.valueOf(Long.parseLong(str2));
                }
            } catch (Exception e) {
                e.printStackTrace();
                Logger logger = this.config.getLogger();
                String logTag = ProductConfigUtil.getLogTag(this.config);
                StringBuilder victor = c.victor("Error getting Long for Key-", str, " ");
                victor.append(e.getLocalizedMessage());
                logger.verbose(logTag, victor.toString());
            }
        }
        return CTProductConfigConstants.DEFAULT_VALUE_FOR_LONG;
    }

    public String getProductConfigDirName() {
        return "Product_Config_" + this.config.getAccountId() + "_" + this.settings.getGuid();
    }

    @Deprecated
    public ProductConfigSettings getSettings() {
        return this.settings;
    }

    @Deprecated
    public String getString(String str) {
        if (this.isInitialized.get() && !TextUtils.isEmpty(str)) {
            String str2 = this.activatedConfigs.get(str);
            if (!TextUtils.isEmpty(str2)) {
                return str2;
            }
            return "";
        }
        return "";
    }

    public void initAsync() {
        if (TextUtils.isEmpty(this.settings.getGuid())) {
            return;
        }
        CTExecutorFactory.executors(this.config).ioTask().addOnSuccessListener(new OnSuccessListener<Boolean>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.8
            @Override // com.clevertap.android.sdk.task.OnSuccessListener
            public void onSuccess(Boolean bool) {
                CTProductConfigController.this.sendCallback(PROCESSING_STATE.INIT);
            }
        }).execute("ProductConfig#initAsync", new Callable<Boolean>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.7
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                Boolean bool;
                synchronized (this) {
                    try {
                        try {
                            if (!CTProductConfigController.this.defaultConfigs.isEmpty()) {
                                CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                                cTProductConfigController.activatedConfigs.putAll(cTProductConfigController.defaultConfigs);
                            }
                            CTProductConfigController cTProductConfigController2 = CTProductConfigController.this;
                            HashMap storedValues = cTProductConfigController2.getStoredValues(cTProductConfigController2.getActivatedFullPath());
                            if (!storedValues.isEmpty()) {
                                CTProductConfigController.this.waitingTobeActivatedConfig.putAll(storedValues);
                            }
                            CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Loaded configs ready to be applied: " + CTProductConfigController.this.waitingTobeActivatedConfig);
                            CTProductConfigController.this.settings.loadSettings(CTProductConfigController.this.fileUtils);
                            CTProductConfigController.this.isInitialized.set(true);
                            bool = Boolean.TRUE;
                        } catch (Exception e) {
                            e.printStackTrace();
                            CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "InitAsync failed - " + e.getLocalizedMessage());
                            return Boolean.FALSE;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return bool;
            }
        });
    }

    public boolean isFetchAndActivating() {
        return this.isFetchAndActivating.get();
    }

    @Deprecated
    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    @Deprecated
    public void onFetchFailed() {
        this.isFetchAndActivating.compareAndSet(true, false);
        this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "Fetch Failed");
    }

    @Deprecated
    public void onFetchSuccess(JSONObject jSONObject) {
        if (!TextUtils.isEmpty(this.settings.getGuid())) {
            synchronized (this) {
                if (jSONObject != null) {
                    try {
                        parseFetchedResponse(jSONObject);
                        this.fileUtils.writeJsonToFile(getProductConfigDirName(), CTProductConfigConstants.FILE_NAME_ACTIVATED, new JSONObject(this.waitingTobeActivatedConfig));
                        this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "Fetch file-[" + getActivatedFullPath() + "] write success: " + this.waitingTobeActivatedConfig);
                        CTExecutorFactory.executors(this.config).mainTask().execute("sendPCFetchSuccessCallback", new Callable<Void>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.3
                            @Override // java.util.concurrent.Callable
                            public Void call() {
                                CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Product Config: fetch Success");
                                CTProductConfigController.this.sendCallback(PROCESSING_STATE.FETCHED);
                                return null;
                            }
                        });
                        if (this.isFetchAndActivating.getAndSet(false)) {
                            activate();
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "Product Config: fetch Failed");
                        sendCallback(PROCESSING_STATE.FETCHED);
                        this.isFetchAndActivating.compareAndSet(true, false);
                    }
                }
            }
        }
    }

    @Deprecated
    public void reset() {
        this.defaultConfigs.clear();
        this.activatedConfigs.clear();
        this.settings.initDefaults();
        eraseStoredConfigFiles();
    }

    @Deprecated
    public void resetSettings() {
        this.settings.reset(this.fileUtils);
    }

    @Deprecated
    public void setArpValue(JSONObject jSONObject) {
        this.settings.setARPValue(jSONObject);
    }

    @Deprecated
    public void setDefaults(int i4) {
        setDefaultsWithXmlParser(i4, new DefaultXmlParser());
    }

    public void setDefaultsWithXmlParser(final int i4, final DefaultXmlParser defaultXmlParser) {
        CTExecutorFactory.executors(this.config).ioTask().addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.10
            @Override // com.clevertap.android.sdk.task.OnSuccessListener
            public void onSuccess(Void r12) {
                CTProductConfigController.this.initAsync();
            }
        }).execute("PCController#setDefaultsWithXmlParser", new Callable<Void>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.9
            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (this) {
                    CTProductConfigController cTProductConfigController = CTProductConfigController.this;
                    cTProductConfigController.defaultConfigs.putAll(defaultXmlParser.getDefaultsFromXml(cTProductConfigController.context, i4));
                    CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Product Config: setDefaults Completed with: " + CTProductConfigController.this.defaultConfigs);
                }
                return null;
            }
        });
    }

    @Deprecated
    public void setGuidAndInit(String str) {
        if (!isInitialized() && !TextUtils.isEmpty(str)) {
            this.settings.setGuid(str);
            initAsync();
        }
    }

    @Deprecated
    public void setMinimumFetchIntervalInSeconds(long j5) {
        this.settings.setMinimumFetchIntervalInSeconds(j5);
    }

    @Deprecated
    public void fetch(long j5) {
        if (canRequest(j5)) {
            fetchProductConfig();
        }
    }

    @Deprecated
    public void setDefaults(final HashMap<String, Object> hashMap) {
        CTExecutorFactory.executors(this.config).ioTask().addOnSuccessListener(new OnSuccessListener<Void>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.5
            @Override // com.clevertap.android.sdk.task.OnSuccessListener
            public void onSuccess(Void r12) {
                CTProductConfigController.this.initAsync();
            }
        }).execute("ProductConfig#setDefaultsUsingHashMap", new Callable<Void>() { // from class: com.clevertap.android.sdk.product_config.CTProductConfigController.4
            @Override // java.util.concurrent.Callable
            public Void call() {
                synchronized (this) {
                    HashMap hashMap2 = hashMap;
                    if (hashMap2 != null && !hashMap2.isEmpty()) {
                        for (Map.Entry entry : hashMap.entrySet()) {
                            if (entry != null) {
                                String str = (String) entry.getKey();
                                Object value = entry.getValue();
                                try {
                                    if (!TextUtils.isEmpty(str) && ProductConfigUtil.isSupportedDataType(value)) {
                                        CTProductConfigController.this.defaultConfigs.put(str, String.valueOf(value));
                                    }
                                } catch (Exception e) {
                                    CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Product Config: setDefaults Failed for Key: " + str + " with Error: " + e.getLocalizedMessage());
                                }
                            }
                        }
                    }
                    CTProductConfigController.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(CTProductConfigController.this.config), "Product Config: setDefaults Completed with: " + CTProductConfigController.this.defaultConfigs);
                }
                return null;
            }
        });
    }
}
