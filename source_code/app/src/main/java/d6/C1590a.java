package d6;

import V5.ae;
import V5.x;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Build;
import android.util.Log;
import g6.C1754b;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* renamed from: d6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1590a {
    public static final Object bravo = new Object();
    public static volatile C1590a charlie;
    public final ConcurrentHashMap alpha = new ConcurrentHashMap();

    public static C1590a bravo() {
        if (charlie == null) {
            synchronized (bravo) {
                try {
                    if (charlie == null) {
                        charlie = new C1590a();
                    }
                } finally {
                }
            }
        }
        C1590a c1590a = charlie;
        x.hotel(c1590a);
        return c1590a;
    }

    public final boolean alpha(Context context, Intent intent, ServiceConnection serviceConnection, int i4) {
        return delta(context, context.getClass().getName(), intent, serviceConnection, i4, null);
    }

    public final void charlie(Context context, ServiceConnection serviceConnection) {
        if (!(serviceConnection instanceof ae)) {
            ConcurrentHashMap concurrentHashMap = this.alpha;
            if (concurrentHashMap.containsKey(serviceConnection)) {
                try {
                    try {
                        context.unbindService((ServiceConnection) concurrentHashMap.get(serviceConnection));
                    } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
                    }
                    return;
                } finally {
                    concurrentHashMap.remove(serviceConnection);
                }
            }
        }
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused2) {
        }
    }

    public final boolean delta(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i4, Executor executor) {
        boolean bindService;
        boolean bindService2;
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C1754b.alpha(context).bravo(0, packageName).flags & 2097152) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!(serviceConnection instanceof ae)) {
            ConcurrentHashMap concurrentHashMap = this.alpha;
            ServiceConnection serviceConnection2 = (ServiceConnection) concurrentHashMap.putIfAbsent(serviceConnection, serviceConnection);
            if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
                Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction()));
            }
            if (executor == null) {
                executor = null;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29 && executor != null) {
                    bindService2 = context.bindService(intent, i4, executor, serviceConnection);
                } else {
                    bindService2 = context.bindService(intent, serviceConnection, i4);
                }
                if (!bindService2) {
                    return false;
                }
                return bindService2;
            } finally {
                concurrentHashMap.remove(serviceConnection, serviceConnection);
            }
        }
        if (executor == null) {
            executor = null;
        }
        if (Build.VERSION.SDK_INT >= 29 && executor != null) {
            bindService = context.bindService(intent, i4, executor, serviceConnection);
            return bindService;
        }
        return context.bindService(intent, serviceConnection, i4);
    }
}
