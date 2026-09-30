package com.clevertap.android.sdk.product_config;

import android.text.TextUtils;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.OnSuccessListener;
import com.clevertap.android.sdk.utils.FileUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes3.dex */
public class ProductConfigSettings {
    private final CleverTapInstanceConfig config;
    private final FileUtils fileUtils;
    private String guid;
    private final Map<String, String> settingsMap = Collections.synchronizedMap(new HashMap());

    @Deprecated
    public ProductConfigSettings(String str, CleverTapInstanceConfig cleverTapInstanceConfig, FileUtils fileUtils) {
        this.guid = str;
        this.config = cleverTapInstanceConfig;
        this.fileUtils = fileUtils;
        initDefaults();
    }

    private long getMinFetchIntervalInSeconds() {
        long j5 = CTProductConfigConstants.DEFAULT_MIN_FETCH_INTERVAL_SECONDS;
        String str = this.settingsMap.get(CTProductConfigConstants.PRODUCT_CONFIG_MIN_INTERVAL_IN_SECONDS);
        try {
            if (!TextUtils.isEmpty(str)) {
                return (long) Double.parseDouble(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "GetMinFetchIntervalInSeconds failed: " + e.getLocalizedMessage());
        }
        return j5;
    }

    private synchronized int getNoOfCallsInAllowedWindow() {
        int i4;
        String str = this.settingsMap.get(CTProductConfigConstants.PRODUCT_CONFIG_NO_OF_CALLS);
        i4 = 5;
        try {
            if (!TextUtils.isEmpty(str)) {
                i4 = (int) Double.parseDouble(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "GetNoOfCallsInAllowedWindow failed: " + e.getLocalizedMessage());
        }
        return i4;
    }

    private synchronized int getWindowIntervalInMinutes() {
        int i4;
        String str = this.settingsMap.get(CTProductConfigConstants.PRODUCT_CONFIG_WINDOW_LENGTH_MINS);
        i4 = 60;
        try {
            if (!TextUtils.isEmpty(str)) {
                i4 = (int) Double.parseDouble(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "GetWindowIntervalInMinutes failed: " + e.getLocalizedMessage());
        }
        return i4;
    }

    private synchronized void setNoOfCallsInAllowedWindow(int i4) {
        long noOfCallsInAllowedWindow = getNoOfCallsInAllowedWindow();
        if (i4 > 0 && noOfCallsInAllowedWindow != i4) {
            this.settingsMap.put(CTProductConfigConstants.PRODUCT_CONFIG_NO_OF_CALLS, String.valueOf(i4));
            updateConfigToFile();
        }
    }

    private void setProductConfigValuesFromARP(String str, int i4) {
        str.getClass();
        if (!str.equals(CTProductConfigConstants.PRODUCT_CONFIG_NO_OF_CALLS)) {
            if (!str.equals(CTProductConfigConstants.PRODUCT_CONFIG_WINDOW_LENGTH_MINS)) {
                return;
            }
            setWindowIntervalInMinutes(i4);
            return;
        }
        setNoOfCallsInAllowedWindow(i4);
    }

    private synchronized void setWindowIntervalInMinutes(int i4) {
        int windowIntervalInMinutes = getWindowIntervalInMinutes();
        if (i4 > 0 && windowIntervalInMinutes != i4) {
            this.settingsMap.put(CTProductConfigConstants.PRODUCT_CONFIG_WINDOW_LENGTH_MINS, String.valueOf(i4));
            updateConfigToFile();
        }
    }

    private synchronized void updateConfigToFile() {
        CTExecutorFactory.executors(this.config).ioTask().addOnSuccessListener(new OnSuccessListener<Boolean>() { // from class: com.clevertap.android.sdk.product_config.ProductConfigSettings.3
            @Override // com.clevertap.android.sdk.task.OnSuccessListener
            public void onSuccess(Boolean bool) {
                if (bool.booleanValue()) {
                    ProductConfigSettings.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(ProductConfigSettings.this.config), "Product Config settings: writing Success " + ProductConfigSettings.this.settingsMap);
                    return;
                }
                ProductConfigSettings.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(ProductConfigSettings.this.config), "Product Config settings: writing Failed");
            }
        }).execute("ProductConfigSettings#updateConfigToFile", new Callable<Boolean>() { // from class: com.clevertap.android.sdk.product_config.ProductConfigSettings.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.concurrent.Callable
            public Boolean call() {
                try {
                    HashMap hashMap = new HashMap(ProductConfigSettings.this.settingsMap);
                    hashMap.remove(CTProductConfigConstants.PRODUCT_CONFIG_MIN_INTERVAL_IN_SECONDS);
                    ProductConfigSettings.this.fileUtils.writeJsonToFile(ProductConfigSettings.this.getDirName(), CTProductConfigConstants.FILE_NAME_CONFIG_SETTINGS, new JSONObject(hashMap));
                    return Boolean.TRUE;
                } catch (Exception e) {
                    e.printStackTrace();
                    ProductConfigSettings.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(ProductConfigSettings.this.config), "UpdateConfigToFile failed: " + e.getLocalizedMessage());
                    return Boolean.FALSE;
                }
            }
        });
    }

    public void eraseStoredSettingsFile(final FileUtils fileUtils) {
        if (fileUtils != null) {
            CTExecutorFactory.executors(this.config).ioTask().execute("ProductConfigSettings#eraseStoredSettingsFile", new Callable<Void>() { // from class: com.clevertap.android.sdk.product_config.ProductConfigSettings.1
                @Override // java.util.concurrent.Callable
                public Void call() {
                    synchronized (this) {
                        try {
                            String fullPath = ProductConfigSettings.this.getFullPath();
                            fileUtils.deleteFile(fullPath);
                            ProductConfigSettings.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(ProductConfigSettings.this.config), "Deleted settings file" + fullPath);
                        } catch (Exception e) {
                            e.printStackTrace();
                            ProductConfigSettings.this.config.getLogger().verbose(ProductConfigUtil.getLogTag(ProductConfigSettings.this.config), "Error while resetting settings" + e.getLocalizedMessage());
                        }
                    }
                    return null;
                }
            });
            return;
        }
        throw new IllegalArgumentException("FileUtils can't be null");
    }

    public String getDirName() {
        return "Product_Config_" + this.config.getAccountId() + "_" + this.guid;
    }

    public String getFullPath() {
        return getDirName() + "/config_settings.json";
    }

    @Deprecated
    public String getGuid() {
        return this.guid;
    }

    public JSONObject getJsonObject(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return new JSONObject(str);
            } catch (JSONException e) {
                e.printStackTrace();
                this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "LoadSettings failed: " + e.getLocalizedMessage());
                return null;
            }
        }
        return null;
    }

    public synchronized long getLastFetchTimeStampInMillis() {
        long j5;
        String str = this.settingsMap.get(CTProductConfigConstants.KEY_LAST_FETCHED_TIMESTAMP);
        j5 = 0;
        try {
            if (!TextUtils.isEmpty(str)) {
                j5 = (long) Double.parseDouble(str);
            }
        } catch (Exception e) {
            e.printStackTrace();
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "GetLastFetchTimeStampInMillis failed: " + e.getLocalizedMessage());
        }
        return j5;
    }

    public long getNextFetchIntervalInSeconds() {
        return Math.max(TimeUnit.MINUTES.toSeconds(getWindowIntervalInMinutes() / getNoOfCallsInAllowedWindow()), getMinFetchIntervalInSeconds());
    }

    public void initDefaults() {
        this.settingsMap.put(CTProductConfigConstants.PRODUCT_CONFIG_NO_OF_CALLS, String.valueOf(5));
        this.settingsMap.put(CTProductConfigConstants.PRODUCT_CONFIG_WINDOW_LENGTH_MINS, String.valueOf(60));
        this.settingsMap.put(CTProductConfigConstants.KEY_LAST_FETCHED_TIMESTAMP, String.valueOf(0));
        this.settingsMap.put(CTProductConfigConstants.PRODUCT_CONFIG_MIN_INTERVAL_IN_SECONDS, String.valueOf(CTProductConfigConstants.DEFAULT_MIN_FETCH_INTERVAL_SECONDS));
        this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "Settings loaded with default values: " + this.settingsMap);
    }

    public synchronized void loadSettings(FileUtils fileUtils) {
        if (fileUtils != null) {
            try {
                populateMapWithJson(getJsonObject(fileUtils.readFromFile(getFullPath())));
            } catch (Exception e) {
                e.printStackTrace();
                this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "LoadSettings failed while reading file: " + e.getLocalizedMessage());
            }
        } else {
            throw new IllegalArgumentException("fileutils can't be null");
        }
    }

    public synchronized void populateMapWithJson(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        String valueOf = String.valueOf(jSONObject.get(next));
                        if (!TextUtils.isEmpty(valueOf)) {
                            this.settingsMap.put(next, valueOf);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "Failed loading setting for key " + next + " Error: " + e.getLocalizedMessage());
                    }
                }
            }
            this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "LoadSettings completed with settings: " + this.settingsMap);
        } catch (Throwable th) {
            throw th;
        }
    }

    public void reset(FileUtils fileUtils) {
        initDefaults();
        eraseStoredSettingsFile(fileUtils);
    }

    public void setARPValue(JSONObject jSONObject) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                try {
                    if (!TextUtils.isEmpty(next)) {
                        Object obj = jSONObject.get(next);
                        if (obj instanceof Number) {
                            int doubleValue = (int) ((Number) obj).doubleValue();
                            if (!CTProductConfigConstants.PRODUCT_CONFIG_NO_OF_CALLS.equalsIgnoreCase(next) && !CTProductConfigConstants.PRODUCT_CONFIG_WINDOW_LENGTH_MINS.equalsIgnoreCase(next)) {
                            }
                            setProductConfigValuesFromARP(next, doubleValue);
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    this.config.getLogger().verbose(ProductConfigUtil.getLogTag(this.config), "Product Config setARPValue failed " + e.getLocalizedMessage());
                }
            }
        }
    }

    public void setGuid(String str) {
        this.guid = str;
    }

    public synchronized void setLastFetchTimeStampInMillis(long j5) {
        long lastFetchTimeStampInMillis = getLastFetchTimeStampInMillis();
        if (j5 >= 0 && lastFetchTimeStampInMillis != j5) {
            this.settingsMap.put(CTProductConfigConstants.KEY_LAST_FETCHED_TIMESTAMP, String.valueOf(j5));
            updateConfigToFile();
        }
    }

    public synchronized void setMinimumFetchIntervalInSeconds(long j5) {
        long minFetchIntervalInSeconds = getMinFetchIntervalInSeconds();
        if (j5 > 0 && minFetchIntervalInSeconds != j5) {
            this.settingsMap.put(CTProductConfigConstants.PRODUCT_CONFIG_MIN_INTERVAL_IN_SECONDS, String.valueOf(j5));
        }
    }
}
