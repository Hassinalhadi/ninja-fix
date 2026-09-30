package com.clevertap.android.sdk;

import android.app.Activity;
import android.location.Location;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class CoreMetaData extends CleverTapMetaData {
    private static int activityCount;
    private static boolean appForeground;
    private static WeakReference<Activity> currentActivity;
    private static int initialAppEnteredForegroundTime;
    private WeakReference<Activity> appInboxActivity;
    private boolean isProductConfigRequested;
    private boolean offline;
    private boolean webInterfaceInitializedExternally;
    private long appInstallTime = 0;
    private boolean appLaunchPushed = false;
    private final Object appLaunchPushedLock = new Object();
    private String currentScreenName = null;
    private int currentSessionId = 0;
    private boolean currentUserOptedOut = false;
    private boolean allowSystemEvents = true;
    private boolean firstRequestInSession = false;
    private boolean firstSession = false;
    private int geofenceSDKVersion = 0;
    private boolean installReferrerDataSent = false;
    private boolean isBgPing = false;
    private boolean isLocationForGeofence = false;
    private int lastSessionLength = 0;
    private Location locationFromUser = null;
    private final Object optOutFlagLock = new Object();
    private HashMap<String, Integer> customSdkVersions = new HashMap<>();
    private long referrerClickTime = 0;
    private String source = null;
    private String medium = null;
    private String campaign = null;
    private JSONObject wzrkParams = null;
    private boolean relaxNetwork = false;

    public static int getActivityCount() {
        return activityCount;
    }

    public static Activity getCurrentActivity() {
        WeakReference<Activity> weakReference = currentActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public static String getCurrentActivityName() {
        Activity currentActivity2 = getCurrentActivity();
        if (currentActivity2 != null) {
            return currentActivity2.getLocalClassName();
        }
        return null;
    }

    public static int getInitialAppEnteredForegroundTime() {
        return initialAppEnteredForegroundTime;
    }

    public static void incrementActivityCount() {
        activityCount++;
    }

    public static boolean isAppForeground() {
        return appForeground;
    }

    public static void setActivityCount(int i4) {
        activityCount = i4;
    }

    public static void setAppForeground(boolean z2) {
        appForeground = z2;
    }

    public static void setCurrentActivity(Activity activity) {
        if (activity == null) {
            currentActivity = null;
        } else if (!activity.getLocalClassName().contains("InAppNotificationActivity")) {
            currentActivity = new WeakReference<>(activity);
        }
    }

    public static void setInitialAppEnteredForegroundTime(int i4) {
        initialAppEnteredForegroundTime = i4;
    }

    public synchronized void clearCampaign() {
        this.campaign = null;
    }

    public synchronized void clearMedium() {
        this.medium = null;
    }

    public synchronized void clearSource() {
        this.source = null;
    }

    public synchronized void clearWzrkParams() {
        this.wzrkParams = null;
    }

    public HashMap<String, Integer> getAllCustomSdkVersions() {
        return this.customSdkVersions;
    }

    public Activity getAppInboxActivity() {
        WeakReference<Activity> weakReference = this.appInboxActivity;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public long getAppInstallTime() {
        return this.appInstallTime;
    }

    public synchronized String getCampaign() {
        return this.campaign;
    }

    public int getCurrentSessionId() {
        return this.currentSessionId;
    }

    public int getCustomSdkVersion(String str) {
        Integer num = this.customSdkVersions.get(str);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public boolean getEnabledSystemEvents() {
        boolean z2;
        synchronized (this.optOutFlagLock) {
            z2 = this.allowSystemEvents;
        }
        return z2;
    }

    public int getGeofenceSDKVersion() {
        return this.geofenceSDKVersion;
    }

    public int getLastSessionLength() {
        return this.lastSessionLength;
    }

    public Location getLocationFromUser() {
        return this.locationFromUser;
    }

    public synchronized String getMedium() {
        return this.medium;
    }

    public long getReferrerClickTime() {
        return this.referrerClickTime;
    }

    public String getScreenName() {
        return this.currentScreenName;
    }

    public synchronized String getSource() {
        return this.source;
    }

    public synchronized JSONObject getWzrkParams() {
        return this.wzrkParams;
    }

    public boolean inCurrentSession() {
        if (this.currentSessionId > 0) {
            return true;
        }
        return false;
    }

    public boolean isAppLaunchPushed() {
        boolean z2;
        synchronized (this.appLaunchPushedLock) {
            z2 = this.appLaunchPushed;
        }
        return z2;
    }

    public boolean isBgPing() {
        return this.isBgPing;
    }

    public boolean isCurrentUserOptedOut() {
        boolean z2;
        synchronized (this.optOutFlagLock) {
            z2 = this.currentUserOptedOut;
        }
        return z2;
    }

    public boolean isFirstRequestInSession() {
        return this.firstRequestInSession;
    }

    public boolean isFirstSession() {
        return this.firstSession;
    }

    public boolean isInstallReferrerDataSent() {
        return this.installReferrerDataSent;
    }

    public boolean isLocationForGeofence() {
        return this.isLocationForGeofence;
    }

    public boolean isOffline() {
        return this.offline;
    }

    public boolean isProductConfigRequested() {
        return this.isProductConfigRequested;
    }

    public boolean isRelaxNetwork() {
        return this.relaxNetwork;
    }

    public boolean isWebInterfaceInitializedExternally() {
        return this.webInterfaceInitializedExternally;
    }

    public void setAppInboxActivity(Activity activity) {
        this.appInboxActivity = new WeakReference<>(activity);
    }

    public void setAppInstallTime(long j5) {
        this.appInstallTime = j5;
    }

    public void setAppLaunchPushed(boolean z2) {
        synchronized (this.appLaunchPushedLock) {
            this.appLaunchPushed = z2;
        }
    }

    public void setBgPing(boolean z2) {
        this.isBgPing = z2;
    }

    public synchronized void setCampaign(String str) {
        if (this.campaign == null) {
            this.campaign = str;
        }
    }

    public void setCurrentScreenName(String str) {
        this.currentScreenName = str;
    }

    public void setCurrentSessionId(int i4) {
        this.currentSessionId = i4;
    }

    public void setCurrentUserOptedOut(boolean z2) {
        synchronized (this.optOutFlagLock) {
            this.currentUserOptedOut = z2;
        }
    }

    public void setCustomSdkVersion(String str, int i4) {
        this.customSdkVersions.put(str, Integer.valueOf(i4));
    }

    public void setEnabledSystemEvents(boolean z2) {
        synchronized (this.optOutFlagLock) {
            this.allowSystemEvents = z2;
        }
    }

    public void setFirstRequestInSession(boolean z2) {
        this.firstRequestInSession = z2;
    }

    public void setFirstSession(boolean z2) {
        this.firstSession = z2;
    }

    public void setGeofenceSDKVersion(int i4) {
        this.geofenceSDKVersion = i4;
    }

    public void setInstallReferrerDataSent(boolean z2) {
        this.installReferrerDataSent = z2;
    }

    public void setLastSessionLength(int i4) {
        this.lastSessionLength = i4;
    }

    public void setLocationForGeofence(boolean z2) {
        this.isLocationForGeofence = z2;
    }

    public void setLocationFromUser(Location location) {
        this.locationFromUser = location;
    }

    public synchronized void setMedium(String str) {
        if (this.medium == null) {
            this.medium = str;
        }
    }

    public void setOffline(boolean z2) {
        this.offline = z2;
    }

    public void setProductConfigRequested(boolean z2) {
        this.isProductConfigRequested = z2;
    }

    public void setReferrerClickTime(long j5) {
        this.referrerClickTime = j5;
    }

    public void setRelaxNetwork(boolean z2) {
        this.relaxNetwork = z2;
    }

    public synchronized void setSource(String str) {
        if (this.source == null) {
            this.source = str;
        }
    }

    public void setWebInterfaceInitializedExternally(boolean z2) {
        this.webInterfaceInitializedExternally = z2;
    }

    public synchronized void setWzrkParams(JSONObject jSONObject) {
        if (this.wzrkParams == null) {
            this.wzrkParams = jSONObject;
        }
    }
}
