package zendesk.support;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import ao.ad;
import com.zendesk.logger.Logger;
import com.zendesk.util.LocaleUtil;
import com.zendesk.util.StringUtils;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SupportSdkMetadata {
    private static final int BAD_VALUE = -1;
    private static final long BYTES_MULTIPLIER = 1024;
    private static final String DEVICE_INFO_API_VERSION = "device_api";
    private static final String DEVICE_INFO_BATTERY = "device_battery";
    private static final String DEVICE_INFO_DEVICE_NAME = "device_name";
    private static final String DEVICE_INFO_LOW_MEMORY = "device_low_memory";
    private static final String DEVICE_INFO_MANUFACTURER = "device_manufacturer";
    private static final String DEVICE_INFO_MODEL_TYPE = "device_model";
    private static final String DEVICE_INFO_OS_VERSION = "device_os";
    private static final String DEVICE_INFO_TOTAL_MEMORY = "device_total_memory";
    private static final String DEVICE_INFO_USED_MEMORY = "device_used_memory";
    private static final int EXPECTED_TOKEN_COUNT = 3;
    private static final String LOG_TAG = "SupportSdkMetadata";
    private final ActivityManager activityManager;
    private final Context context;

    public SupportSdkMetadata(Context context) {
        this.context = context;
        this.activityManager = (ActivityManager) context.getSystemService("activity");
    }

    private int getBatteryLevel() {
        Intent registerReceiver = this.context.getApplicationContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver == null) {
            return -1;
        }
        return registerReceiver.getIntExtra("level", -1);
    }

    private String getBytesInMb(long j5) {
        return String.valueOf(j5 / 1048576);
    }

    private String getManufacturer() {
        String str = Build.MANUFACTURER;
        if (!"unknown".equals(str) && !StringUtils.isEmpty(str)) {
            return str;
        }
        return "";
    }

    private String getModel() {
        boolean z2;
        String str = Build.MODEL;
        boolean z10 = true;
        if (!"unknown".equals(str) && !StringUtils.isEmpty(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        String str2 = Build.DEVICE;
        if (!"unknown".equals(str2) && !StringUtils.isEmpty(str2)) {
            z10 = false;
        }
        if (z2 && z10) {
            return "";
        }
        if (str.equals(str2)) {
            return str;
        }
        Locale locale = Locale.US;
        return ad.amber(str, "/", str2);
    }

    private String getModelDeviceName() {
        return Build.DEVICE;
    }

    private long getTotalMemory() {
        Logger.d(LOG_TAG, "Using getTotalMemoryApi() to determine memory", new Object[0]);
        return getTotalMemoryApi();
    }

    private long getTotalMemoryApi() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.totalMem;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0081 A[Catch: NumberFormatException -> 0x0095, NoSuchElementException -> 0x0097, TRY_LEAVE, TryCatch #9 {NumberFormatException -> 0x0095, NoSuchElementException -> 0x0097, blocks: (B:11:0x007a, B:13:0x0081), top: B:10:0x007a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private long getTotalMemoryCompat() {
        BufferedReader bufferedReader;
        IOException e;
        String str;
        StringTokenizer stringTokenizer;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/proc/meminfo"));
            try {
                try {
                    str = bufferedReader.readLine();
                    try {
                        bufferedReader.close();
                    } catch (IOException e4) {
                        Logger.w(LOG_TAG, "Failed to close /proc/meminfo file stream: " + e4.getMessage(), e4, new Object[0]);
                    }
                } catch (IOException e5) {
                    e = e5;
                    Logger.e(LOG_TAG, "Failed to determine total memory from /proc/meminfo: " + e.getMessage(), e, new Object[0]);
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        } catch (IOException e10) {
                            Logger.w(LOG_TAG, "Failed to close /proc/meminfo file stream: " + e10.getMessage(), e10, new Object[0]);
                        }
                    }
                    str = "";
                    stringTokenizer = new StringTokenizer(str);
                    if (stringTokenizer.countTokens() == 3) {
                    }
                }
            } catch (Throwable th) {
                th = th;
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (IOException e11) {
                        Logger.w(LOG_TAG, "Failed to close /proc/meminfo file stream: " + e11.getMessage(), e11, new Object[0]);
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            bufferedReader = null;
            e = e12;
        } catch (Throwable th2) {
            th = th2;
            if (bufferedReader2 != null) {
            }
            throw th;
        }
        stringTokenizer = new StringTokenizer(str);
        try {
            if (stringTokenizer.countTokens() == 3) {
                return -1L;
            }
            stringTokenizer.nextToken();
            return Long.valueOf(stringTokenizer.nextToken()).longValue() * 1024;
        } catch (NumberFormatException e13) {
            Logger.e(LOG_TAG, "Error reading memory size from proc/meminfo", e13, new Object[0]);
            return -1L;
        } catch (NoSuchElementException e14) {
            Logger.e(LOG_TAG, "Error reading tokens from the /proc/meminfo", e14, new Object[0]);
            return -1L;
        }
    }

    private long getUsedMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return getTotalMemory() - memoryInfo.availMem;
    }

    private int getVersionCode() {
        return Build.VERSION.SDK_INT;
    }

    private String getVersionName() {
        return Build.VERSION.RELEASE;
    }

    private boolean isLowMemory() {
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        this.activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.lowMemory;
    }

    public Map<String, String> getDeviceInfoAsMapForMetaData() {
        HashMap hashMap = new HashMap();
        hashMap.put(DEVICE_INFO_OS_VERSION, getVersionName());
        hashMap.put(DEVICE_INFO_API_VERSION, String.valueOf(getVersionCode()));
        hashMap.put(DEVICE_INFO_MODEL_TYPE, getModel());
        hashMap.put(DEVICE_INFO_DEVICE_NAME, getModelDeviceName());
        hashMap.put(DEVICE_INFO_MANUFACTURER, getManufacturer());
        hashMap.put(DEVICE_INFO_TOTAL_MEMORY, getBytesInMb(getTotalMemory()));
        hashMap.put(DEVICE_INFO_USED_MEMORY, getBytesInMb(getUsedMemory()));
        hashMap.put(DEVICE_INFO_LOW_MEMORY, String.valueOf(isLowMemory()));
        hashMap.put(DEVICE_INFO_BATTERY, String.valueOf(getBatteryLevel()));
        return hashMap;
    }

    public String getLocale() {
        return LocaleUtil.toLanguageTag(Locale.getDefault());
    }
}
