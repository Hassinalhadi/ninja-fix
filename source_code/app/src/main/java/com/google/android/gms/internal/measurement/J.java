package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import e6.C1629a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class J {
    public static volatile J india;
    public final String alpha = "FA";
    public final C1629a bravo = C1629a.alpha;
    public final ExecutorService charlie;
    public final Aa.m delta;
    public final ArrayList echo;
    public int foxtrot;
    public boolean golf;
    public volatile am hotel;

    public J(Context context, Bundle bundle) {
        int i4 = 0;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new E());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.charlie = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.delta = new Aa.m(1, this);
        this.echo = new ArrayList();
        try {
            if (com.google.android.gms.measurement.internal.W.golf(context, com.google.android.gms.measurement.internal.W.bravo(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, J.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.golf = true;
                    Log.w(this.alpha, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        bravo(new A(this, context, bundle, i4));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.alpha, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new I(this));
        }
    }

    public static J delta(Context context, Bundle bundle) {
        V5.x.hotel(context);
        if (india == null) {
            synchronized (J.class) {
                try {
                    if (india == null) {
                        india = new J(context, bundle);
                    }
                } finally {
                }
            }
        }
        return india;
    }

    public final void alpha(Exception exc, boolean z2, boolean z10) {
        this.golf |= z2;
        String str = this.alpha;
        if (z2) {
            Log.w(str, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z10) {
            bravo(new ax(this, exc));
        }
        Log.w(str, "Error with data collection. Data lost.", exc);
    }

    public final void bravo(F f5) {
        this.charlie.execute(f5);
    }

    public final int charlie(String str) {
        aj ajVar = new aj();
        bravo(new A(this, str, ajVar, 1));
        Integer num = (Integer) aj.delta(ajVar.charlie(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final List echo(String str, String str2) {
        aj ajVar = new aj();
        bravo(new ay(this, str, str2, ajVar, 1));
        List list = (List) aj.delta(ajVar.charlie(5000L), List.class);
        if (list == null) {
            return Collections.EMPTY_LIST;
        }
        return list;
    }

    public final Map foxtrot(String str, String str2, boolean z2) {
        aj ajVar = new aj();
        bravo(new aw(this, str, str2, z2, ajVar));
        Bundle charlie = ajVar.charlie(5000L);
        if (charlie != null && charlie.size() != 0) {
            HashMap hashMap = new HashMap(charlie.size());
            for (String str3 : charlie.keySet()) {
                Object obj = charlie.get(str3);
                if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                    hashMap.put(str3, obj);
                }
            }
            return hashMap;
        }
        return Collections.EMPTY_MAP;
    }
}
