package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.lifecycle.RunnableC0643m;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.pushnotification.PushConstants;
import com.google.android.gms.internal.measurement.zzdj;
import java.util.ArrayDeque;
import java.util.Objects;
import s6.AbstractC2629d0;

/* renamed from: com.google.android.gms.measurement.internal.m0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1457m0 implements Application.ActivityLifecycleCallbacks {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public C1457m0(C1459n0 c1459n0) {
        this.alpha = 0;
        this.purple = c1459n0;
    }

    private final void bravo(Activity activity) {
    }

    private final void charlie(Activity activity) {
    }

    private final void delta(Activity activity) {
    }

    private final void echo(Activity activity, Bundle bundle) {
    }

    private final void foxtrot(Activity activity) {
    }

    private final void golf(Activity activity) {
    }

    private final void hotel(Activity activity) {
    }

    private final void india(Activity activity) {
    }

    public void alpha(Intent intent) {
        boolean equals;
        Bundle bundle = null;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString("google.message_id");
                if (string == null) {
                    string = extras.getString("message_id");
                }
                if (!TextUtils.isEmpty(string)) {
                    ArrayDeque arrayDeque = (ArrayDeque) this.purple;
                    if (!arrayDeque.contains(string)) {
                        arrayDeque.add(string);
                    } else {
                        return;
                    }
                }
                bundle = extras.getBundle("gcm.n.analytics_data");
            }
        } catch (RuntimeException e) {
            Log.w("FirebaseMessaging", "Failed trying to get analytics data from Intent extras.", e);
        }
        if (bundle == null) {
            equals = false;
        } else {
            equals = "1".equals(bundle.getString("google.c.a.e"));
        }
        if (equals) {
            if (bundle != null) {
                if ("1".equals(bundle.getString("google.c.a.tc"))) {
                    F7.b bVar = (F7.b) B7.g.charlie().bravo(F7.b.class);
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
                    }
                    if (bVar != null) {
                        String string2 = bundle.getString("google.c.a.c_id");
                        F7.c cVar = (F7.c) bVar;
                        if (G7.a.charlie(PushConstants.FCM_DELIVERY_TYPE) && G7.a.delta(PushConstants.FCM_DELIVERY_TYPE, "_ln")) {
                            com.google.android.gms.internal.measurement.J j5 = (com.google.android.gms.internal.measurement.J) cVar.alpha.purple;
                            j5.getClass();
                            j5.bravo(new com.google.android.gms.internal.measurement.aw(j5, PushConstants.FCM_DELIVERY_TYPE, "_ln", string2, true, 0));
                        }
                        Bundle bundle2 = new Bundle();
                        bundle2.putString("source", "Firebase");
                        bundle2.putString("medium", "notification");
                        bundle2.putString("campaign", string2);
                        cVar.alpha(PushConstants.FCM_DELIVERY_TYPE, "_cmp", bundle2);
                    } else {
                        Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
                    }
                } else if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                }
            }
            AbstractC2629d0.charlie(bundle, "_no");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0049 A[Catch: all -> 0x0028, RuntimeException -> 0x002b, TryCatch #1 {RuntimeException -> 0x002b, blocks: (B:3:0x0009, B:5:0x0019, B:7:0x001f, B:12:0x0049, B:15:0x0050, B:17:0x0063, B:19:0x006b, B:24:0x007b, B:28:0x0088, B:35:0x002e, B:37:0x0035, B:39:0x0041), top: B:2:0x0009, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void juliet(zzdj zzdjVar, Bundle bundle) {
        Intent intent;
        Uri uri;
        String stringExtra;
        String str;
        boolean z2;
        G g2 = (G) ((C1459n0) this.purple).alpha;
        try {
            try {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7636g.alpha("onActivityCreated");
                intent = zzdjVar.red;
            } catch (RuntimeException e) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.bravo(e, "Throwable caught in onActivityCreated");
            }
            if (intent != null) {
                Uri data = intent.getData();
                if (data != null) {
                    if (!data.isHierarchical()) {
                    }
                    uri = data;
                    if (uri != null && uri.isHierarchical()) {
                        G.delta(g2.e);
                        stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"https://www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
                            str = "auto";
                            String str2 = str;
                            String queryParameter = uri.getQueryParameter("referrer");
                            if (bundle != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            boolean z10 = z2;
                            E e4 = g2.f7508c;
                            G.foxtrot(e4);
                            e4.g0(new RunnableC1449i0(this, z10, uri, str2, queryParameter));
                            C1480y0 c1480y0 = g2.f7512h;
                            G.echo(c1480y0);
                            c1480y0.f0(zzdjVar, bundle);
                            return;
                        }
                        str = "gs";
                        String str22 = str;
                        String queryParameter2 = uri.getQueryParameter("referrer");
                        if (bundle != null) {
                        }
                        boolean z102 = z2;
                        E e42 = g2.f7508c;
                        G.foxtrot(e42);
                        e42.g0(new RunnableC1449i0(this, z102, uri, str22, queryParameter2));
                        C1480y0 c1480y02 = g2.f7512h;
                        G.echo(c1480y02);
                        c1480y02.f0(zzdjVar, bundle);
                        return;
                    }
                }
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    String string = extras.getString("com.android.vending.referral_url");
                    if (!TextUtils.isEmpty(string)) {
                        data = Uri.parse(string);
                        uri = data;
                        if (uri != null) {
                            G.delta(g2.e);
                            stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
                            if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra)) {
                                str = "auto";
                                String str222 = str;
                                String queryParameter22 = uri.getQueryParameter("referrer");
                                if (bundle != null) {
                                }
                                boolean z1022 = z2;
                                E e422 = g2.f7508c;
                                G.foxtrot(e422);
                                e422.g0(new RunnableC1449i0(this, z1022, uri, str222, queryParameter22));
                                C1480y0 c1480y022 = g2.f7512h;
                                G.echo(c1480y022);
                                c1480y022.f0(zzdjVar, bundle);
                                return;
                            }
                            str = "gs";
                            String str2222 = str;
                            String queryParameter222 = uri.getQueryParameter("referrer");
                            if (bundle != null) {
                            }
                            boolean z10222 = z2;
                            E e4222 = g2.f7508c;
                            G.foxtrot(e4222);
                            e4222.g0(new RunnableC1449i0(this, z10222, uri, str2222, queryParameter222));
                            C1480y0 c1480y0222 = g2.f7512h;
                            G.echo(c1480y0222);
                            c1480y0222.f0(zzdjVar, bundle);
                            return;
                        }
                    }
                }
                uri = null;
                if (uri != null) {
                }
            }
        } finally {
            C1480y0 c1480y03 = g2.f7512h;
            G.echo(c1480y03);
            c1480y03.f0(zzdjVar, bundle);
        }
    }

    public void kilo(zzdj zzdjVar) {
        C1480y0 c1480y0 = ((G) ((C1459n0) this.purple).alpha).f7512h;
        G.echo(c1480y0);
        synchronized (c1480y0.e) {
            try {
                if (Objects.equals(c1480y0.yellow, zzdjVar)) {
                    c1480y0.yellow = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!((G) c1480y0.alpha).yellow.k0()) {
            return;
        }
        c1480y0.white.remove(Integer.valueOf(zzdjVar.alpha));
    }

    public void lima(zzdj zzdjVar) {
        G g2 = (G) ((C1459n0) this.purple).alpha;
        C1480y0 c1480y0 = g2.f7512h;
        G.echo(c1480y0);
        synchronized (c1480y0.e) {
            c1480y0.f7692d = false;
            c1480y0.f7689a = true;
        }
        G g5 = (G) c1480y0.alpha;
        g5.f7511g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!g5.yellow.k0()) {
            c1480y0.red = null;
            E e = g5.f7508c;
            G.foxtrot(e);
            e.g0(new RunnableC1462p(c1480y0, elapsedRealtime, 1));
        } else {
            C1474v0 g02 = c1480y0.g0(zzdjVar);
            c1480y0.silver = c1480y0.red;
            c1480y0.red = null;
            E e4 = g5.f7508c;
            G.foxtrot(e4);
            e4.g0(new RunnableC1437c0(c1480y0, g02, elapsedRealtime));
        }
        O0 o02 = g2.f7509d;
        G.echo(o02);
        G g10 = (G) o02.alpha;
        g10.f7511g.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        E e5 = g10.f7508c;
        G.foxtrot(e5);
        e5.g0(new L0(o02, elapsedRealtime2, 1));
    }

    public void mike(zzdj zzdjVar) {
        G g2 = (G) ((C1459n0) this.purple).alpha;
        O0 o02 = g2.f7509d;
        G.echo(o02);
        G g5 = (G) o02.alpha;
        g5.f7511g.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        E e = g5.f7508c;
        G.foxtrot(e);
        e.g0(new L0(o02, elapsedRealtime, 0));
        C1480y0 c1480y0 = g2.f7512h;
        G.echo(c1480y0);
        Object obj = c1480y0.e;
        synchronized (obj) {
            c1480y0.f7692d = true;
            if (!Objects.equals(zzdjVar, c1480y0.yellow)) {
                synchronized (obj) {
                    c1480y0.yellow = zzdjVar;
                    c1480y0.f7689a = false;
                    G g10 = (G) c1480y0.alpha;
                    if (g10.yellow.k0()) {
                        c1480y0.f7690b = null;
                        E e4 = g10.f7508c;
                        G.foxtrot(e4);
                        e4.g0(new RunnableC1478x0(c1480y0, 1));
                    }
                }
            }
        }
        G g11 = (G) c1480y0.alpha;
        if (!g11.yellow.k0()) {
            c1480y0.red = c1480y0.f7690b;
            E e5 = g11.f7508c;
            G.foxtrot(e5);
            e5.g0(new RunnableC1478x0(c1480y0, 0));
            return;
        }
        c1480y0.a0(zzdjVar.purple, c1480y0.g0(zzdjVar), false);
        C1464q c1464q = ((G) c1480y0.alpha).f7514j;
        G.charlie(c1464q);
        G g12 = (G) c1464q.alpha;
        g12.f7511g.getClass();
        long elapsedRealtime2 = SystemClock.elapsedRealtime();
        E e10 = g12.f7508c;
        G.foxtrot(e10);
        e10.g0(new RunnableC1462p(c1464q, elapsedRealtime2, 0));
    }

    public void november(zzdj zzdjVar, Bundle bundle) {
        C1474v0 c1474v0;
        C1480y0 c1480y0 = ((G) ((C1459n0) this.purple).alpha).f7512h;
        G.echo(c1480y0);
        if (((G) c1480y0.alpha).yellow.k0() && bundle != null && (c1474v0 = (C1474v0) c1480y0.white.get(Integer.valueOf(zzdjVar.alpha))) != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putLong(Constants.KEY_ID, c1474v0.charlie);
            bundle2.putString("name", c1474v0.alpha);
            bundle2.putString("referrer_name", c1474v0.bravo);
            bundle.putBundle("com.google.app_measurement.screen_service", bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        switch (this.alpha) {
            case 0:
                juliet(zzdj.o(activity), bundle);
                return;
            default:
                Intent intent = activity.getIntent();
                if (intent != null) {
                    if (Build.VERSION.SDK_INT <= 25) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0643m(16, this, intent));
                        return;
                    } else {
                        alpha(intent);
                        return;
                    }
                }
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        switch (this.alpha) {
            case 0:
                kilo(zzdj.o(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        switch (this.alpha) {
            case 0:
                lima(zzdj.o(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        switch (this.alpha) {
            case 0:
                mike(zzdj.o(activity));
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        switch (this.alpha) {
            case 0:
                november(zzdj.o(activity), bundle);
                return;
            default:
                return;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        int i4 = this.alpha;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        int i4 = this.alpha;
    }

    public C1457m0() {
        this.alpha = 1;
        this.purple = new ArrayDeque(10);
    }
}
