package com.google.firebase.perf.config;

import B7.a;
import B7.g;
import E8.b;
import E8.e;
import E8.j;
import F8.r;
import G6.q;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import ao.ad;
import i8.InterfaceC1904b;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s8.d;
import s8.v;
import s8.w;
import u8.C3146a;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, e> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final v cache;
    private final Executor executor;
    private b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private InterfaceC1904b firebaseRemoteConfigProvider;
    private static final C3146a logger = C3146a.delta();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(v.bravo(), new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ad.tango(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS) + 5000, getInitialStartupMillis());
    }

    public static long getInitialStartupMillis() {
        a aVar;
        try {
            aVar = (a) g.charlie().bravo(a.class);
        } catch (IllegalStateException unused) {
            logger.alpha("Unable to get StartupTime instance.");
            aVar = null;
        }
        if (aVar != null) {
            return aVar.alpha;
        }
        return System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private e getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (isFirebaseRemoteConfigAvailable() && this.allRcConfigMap.containsKey(str)) {
            e eVar = this.allRcConfigMap.get(str);
            r rVar = (r) eVar;
            if (rVar.bravo == 2) {
                logger.bravo("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", rVar.delta(), str);
                return eVar;
            }
            return null;
        }
        return null;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j5) {
        if (j5 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs) {
            return true;
        }
        return false;
    }

    private boolean hasLastFetchBecomeStale(long j5) {
        if (j5 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS) {
            return true;
        }
        return false;
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.bravo());
    }

    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.golf("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        if (hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis)) {
            return true;
        }
        return false;
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        q alpha = this.firebaseRemoteConfig.alpha();
        alpha.echo(this.executor, new w(this));
        alpha.delta(this.executor, new w(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.bravo());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public B8.e getBoolean(String str) {
        if (str == null) {
            logger.alpha("The key to get Remote Config boolean value is null.");
            return new B8.e();
        }
        e remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new B8.e(Boolean.valueOf(((r) remoteConfigValue).alpha()));
            } catch (IllegalArgumentException unused) {
                r rVar = (r) remoteConfigValue;
                if (!rVar.delta().isEmpty()) {
                    logger.bravo("Could not parse value: '%s' for key: '%s'.", rVar.delta(), str);
                }
            }
        }
        return new B8.e();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public B8.e getDouble(String str) {
        if (str == null) {
            logger.alpha("The key to get Remote Config double value is null.");
            return new B8.e();
        }
        e remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new B8.e(Double.valueOf(((r) remoteConfigValue).bravo()));
            } catch (IllegalArgumentException unused) {
                r rVar = (r) remoteConfigValue;
                if (!rVar.delta().isEmpty()) {
                    logger.bravo("Could not parse value: '%s' for key: '%s'.", rVar.delta(), str);
                }
            }
        }
        return new B8.e();
    }

    public B8.e getLong(String str) {
        if (str == null) {
            logger.alpha("The key to get Remote Config long value is null.");
            return new B8.e();
        }
        e remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new B8.e(Long.valueOf(((r) remoteConfigValue).charlie()));
            } catch (IllegalArgumentException unused) {
                r rVar = (r) remoteConfigValue;
                if (!rVar.delta().isEmpty()) {
                    logger.bravo("Could not parse value: '%s' for key: '%s'.", rVar.delta(), str);
                }
            }
        }
        return new B8.e();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t5) {
        e remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t5 instanceof Boolean) {
                    return (T) Boolean.valueOf(((r) remoteConfigValue).alpha());
                }
                if (t5 instanceof Double) {
                    return (T) Double.valueOf(((r) remoteConfigValue).bravo());
                }
                if (!(t5 instanceof Long) && !(t5 instanceof Integer)) {
                    if (t5 instanceof String) {
                        return (T) ((r) remoteConfigValue).delta();
                    }
                    T t10 = (T) ((r) remoteConfigValue).delta();
                    try {
                        logger.bravo("No matching type found for the defaultValue: '%s', using String.", t5);
                        return t10;
                    } catch (IllegalArgumentException unused) {
                        t5 = t10;
                        r rVar = (r) remoteConfigValue;
                        if (!rVar.delta().isEmpty()) {
                            logger.bravo("Could not parse value: '%s' for key: '%s'.", rVar.delta(), str);
                        }
                        return t5;
                    }
                }
                return (T) Long.valueOf(((r) remoteConfigValue).charlie());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t5;
    }

    public B8.e getString(String str) {
        if (str == null) {
            logger.alpha("The key to get Remote Config String value is null.");
            return new B8.e();
        }
        e remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            return new B8.e(((r) remoteConfigValue).delta());
        }
        return new B8.e();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        InterfaceC1904b interfaceC1904b;
        j jVar;
        if (this.firebaseRemoteConfig == null && (interfaceC1904b = this.firebaseRemoteConfigProvider) != null && (jVar = (j) interfaceC1904b.get()) != null) {
            this.firebaseRemoteConfig = jVar.bravo(FIREPERF_FRC_NAMESPACE_NAME);
        }
        if (this.firebaseRemoteConfig != null) {
            return true;
        }
        return false;
    }

    public boolean isLastFetchFailed() {
        b bVar = this.firebaseRemoteConfig;
        if (bVar == null || bVar.delta().alpha == 1 || this.firebaseRemoteConfig.delta().alpha == 2) {
            return true;
        }
        return false;
    }

    public void setFirebaseRemoteConfigProvider(InterfaceC1904b interfaceC1904b) {
        this.firebaseRemoteConfigProvider = interfaceC1904b;
    }

    public void syncConfigValues(Map<String, e> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d delta = d.delta();
        ConcurrentHashMap<String, e> concurrentHashMap = this.allRcConfigMap;
        delta.getClass();
        e eVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (eVar != null) {
            try {
                this.cache.golf("com.google.firebase.perf.ExperimentTTID", ((r) eVar).alpha());
                return;
            } catch (Exception unused) {
                logger.alpha("ExperimentTTID remote config flag has invalid value, expected boolean.");
                return;
            }
        }
        logger.alpha("ExperimentTTID remote config flag does not exist.");
    }

    public RemoteConfigManager(v vVar, Executor executor, b bVar, long j5, long j6) {
        ConcurrentHashMap<String, e> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = 0L;
        this.cache = vVar;
        this.executor = executor;
        this.firebaseRemoteConfig = bVar;
        if (bVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(bVar.bravo());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j6;
        this.appStartConfigFetchDelayInMs = j5;
    }
}
