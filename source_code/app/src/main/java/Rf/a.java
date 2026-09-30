package Rf;

import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.telephony.TelephonyManager;
import bd.ScheduledExecutorServiceC0750c;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.concurrent.ForkJoinPool;
import javax.net.ssl.SNIHostName;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class a {
    public static /* bridge */ /* synthetic */ int alpha(TelephonyManager telephonyManager) {
        return telephonyManager.getDataNetworkType();
    }

    public static /* bridge */ /* synthetic */ OutputConfiguration delta(Object obj) {
        return (OutputConfiguration) obj;
    }

    public static /* synthetic */ PriorityQueue oscar(Comparator comparator) {
        return new PriorityQueue(comparator);
    }

    public static /* bridge */ /* synthetic */ SNIHostName papa(Object obj) {
        return (SNIHostName) obj;
    }

    public static /* synthetic */ void victor(ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c) {
        if (Build.VERSION.SDK_INT <= 23 || scheduledExecutorServiceC0750c != ForkJoinPool.commonPool()) {
            scheduledExecutorServiceC0750c.shutdown();
            throw null;
        }
    }
}
