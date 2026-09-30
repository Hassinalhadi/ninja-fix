package com.google.firebase.perf.metrics;

import A8.h;
import B7.a;
import B7.g;
import B8.b;
import B8.c;
import B8.f;
import C8.aa;
import C8.i;
import C8.w;
import C8.x;
import android.R;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import androidx.annotation.Keep;
import androidx.appcompat.widget.P0;
import androidx.lifecycle.B;
import androidx.lifecycle.G;
import androidx.lifecycle.RunnableC0643m;
import androidx.lifecycle.ak;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import g8.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s1.af;
import s8.C2837a;
import u8.C3146a;
import v8.ViewTreeObserverOnDrawListenerC3177b;

/* loaded from: classes2.dex */
public class AppStartTrace implements Application.ActivityLifecycleCallbacks, ak {

    /* renamed from: o, reason: collision with root package name */
    public static final Timer f8282o = new Timer();

    /* renamed from: p, reason: collision with root package name */
    public static final long f8283p = TimeUnit.MINUTES.toMicros(1);

    /* renamed from: q, reason: collision with root package name */
    public static volatile AppStartTrace f8284q;

    /* renamed from: r, reason: collision with root package name */
    public static ThreadPoolExecutor f8285r;

    /* renamed from: a, reason: collision with root package name */
    public final Timer f8286a;

    /* renamed from: j, reason: collision with root package name */
    public PerfSession f8294j;
    public final h purple;
    public final C2837a red;
    public final x silver;
    public Application teal;
    public final Timer yellow;
    public boolean alpha = false;
    public boolean white = false;

    /* renamed from: b, reason: collision with root package name */
    public Timer f8287b = null;

    /* renamed from: c, reason: collision with root package name */
    public Timer f8288c = null;

    /* renamed from: d, reason: collision with root package name */
    public Timer f8289d = null;
    public Timer e = null;

    /* renamed from: f, reason: collision with root package name */
    public Timer f8290f = null;

    /* renamed from: g, reason: collision with root package name */
    public Timer f8291g = null;

    /* renamed from: h, reason: collision with root package name */
    public Timer f8292h = null;

    /* renamed from: i, reason: collision with root package name */
    public Timer f8293i = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8295k = false;

    /* renamed from: l, reason: collision with root package name */
    public int f8296l = 0;

    /* renamed from: m, reason: collision with root package name */
    public final ViewTreeObserverOnDrawListenerC3177b f8297m = new ViewTreeObserverOnDrawListenerC3177b(this);

    /* renamed from: n, reason: collision with root package name */
    public boolean f8298n = false;

    public AppStartTrace(h hVar, d dVar, C2837a c2837a, ThreadPoolExecutor threadPoolExecutor) {
        Timer timer;
        Timer timer2 = null;
        this.purple = hVar;
        this.red = c2837a;
        f8285r = threadPoolExecutor;
        x gold = aa.gold();
        gold.november("_experiment_app_start_ttid");
        this.silver = gold;
        if (Build.VERSION.SDK_INT >= 24) {
            long alpha = af.alpha();
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long micros = timeUnit.toMicros(alpha);
            timer = new Timer((micros - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit.toMicros(System.currentTimeMillis()), micros);
        } else {
            timer = null;
        }
        this.yellow = timer;
        a aVar = (a) g.charlie().bravo(a.class);
        if (aVar != null) {
            TimeUnit timeUnit2 = TimeUnit.MILLISECONDS;
            long micros2 = timeUnit2.toMicros(aVar.bravo);
            timer2 = new Timer((micros2 - TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos())) + timeUnit2.toMicros(System.currentTimeMillis()), micros2);
        }
        this.f8286a = timer2;
    }

    public static AppStartTrace bravo() {
        if (f8284q != null) {
            return f8284q;
        }
        h hVar = h.f18l;
        d dVar = new d(1);
        if (f8284q == null) {
            synchronized (AppStartTrace.class) {
                try {
                    if (f8284q == null) {
                        f8284q = new AppStartTrace(hVar, dVar, C2837a.echo(), new ThreadPoolExecutor(0, 1, 10 + f8283p, TimeUnit.SECONDS, new LinkedBlockingQueue()));
                    }
                } finally {
                }
            }
        }
        return f8284q;
    }

    public static boolean delta(Application application) {
        ActivityManager activityManager = (ActivityManager) application.getSystemService("activity");
        if (activityManager != null) {
            List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
            if (runningAppProcesses != null) {
                String packageName = application.getPackageName();
                String crimson = P0.crimson(packageName, ":");
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo.importance == 100 && (runningAppProcessInfo.processName.equals(packageName) || runningAppProcessInfo.processName.startsWith(crimson))) {
                        return true;
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Keep
    public static void setLauncherActivityOnCreateTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnResumeTime(String str) {
    }

    @Keep
    public static void setLauncherActivityOnStartTime(String str) {
    }

    public final Timer alpha() {
        Timer timer = this.f8286a;
        if (timer != null) {
            return timer;
        }
        return f8282o;
    }

    public final Timer charlie() {
        Timer timer = this.yellow;
        if (timer != null) {
            return timer;
        }
        return alpha();
    }

    public final void echo(x xVar) {
        if (this.f8291g != null && this.f8292h != null && this.f8293i != null) {
            f8285r.execute(new RunnableC0643m(28, this, xVar));
            golf();
        }
    }

    public final synchronized void foxtrot(Context context) {
        boolean z2;
        if (this.alpha) {
            return;
        }
        G.f3128b.white.alpha(this);
        Context applicationContext = context.getApplicationContext();
        if (applicationContext instanceof Application) {
            ((Application) applicationContext).registerActivityLifecycleCallbacks(this);
            if (!this.f8298n && !delta((Application) applicationContext)) {
                z2 = false;
                this.f8298n = z2;
                this.alpha = true;
                this.teal = (Application) applicationContext;
            }
            z2 = true;
            this.f8298n = z2;
            this.alpha = true;
            this.teal = (Application) applicationContext;
        }
    }

    public final synchronized void golf() {
        if (!this.alpha) {
            return;
        }
        G.f3128b.white.charlie(this);
        this.teal.unregisterActivityLifecycleCallbacks(this);
        this.alpha = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b A[Catch: all -> 0x001a, TRY_LEAVE, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000a, B:10:0x000f, B:14:0x001d, B:16:0x003b), top: B:2:0x0001 }] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void onActivityCreated(Activity activity, Bundle bundle) {
        boolean z2;
        try {
            if (!this.f8295k && this.f8287b == null) {
                if (!this.f8298n && !delta(this.teal)) {
                    z2 = false;
                    this.f8298n = z2;
                    new WeakReference(activity);
                    this.f8287b = new Timer();
                    if (charlie().delta(this.f8287b) > f8283p) {
                        this.white = true;
                    }
                }
                z2 = true;
                this.f8298n = z2;
                new WeakReference(activity);
                this.f8287b = new Timer();
                if (charlie().delta(this.f8287b) > f8283p) {
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        View findViewById;
        if (!this.f8295k && !this.white && this.red.foxtrot() && (findViewById = activity.findViewById(R.id.content)) != null) {
            findViewById.getViewTreeObserver().removeOnDrawListener(this.f8297m);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [v8.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [v8.a] */
    /* JADX WARN: Type inference failed for: r4v5, types: [v8.a] */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        View findViewById;
        try {
            if (!this.f8295k && !this.white) {
                boolean foxtrot = this.red.foxtrot();
                if (foxtrot && (findViewById = activity.findViewById(R.id.content)) != null) {
                    findViewById.getViewTreeObserver().addOnDrawListener(this.f8297m);
                    final int i4 = 0;
                    c cVar = new c(findViewById, new Runnable(this) { // from class: v8.a
                        public final /* synthetic */ AppStartTrace purple;

                        {
                            this.purple = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.purple;
                            switch (i4) {
                                case 0:
                                    if (appStartTrace.f8293i == null) {
                                        appStartTrace.f8293i = new Timer();
                                        x gold = aa.gold();
                                        gold.november("_experiment_onDrawFoQ");
                                        gold.lima(appStartTrace.charlie().alpha);
                                        gold.mike(appStartTrace.charlie().delta(appStartTrace.f8293i));
                                        aa aaVar = (aa) gold.golf();
                                        x xVar = appStartTrace.silver;
                                        xVar.juliet(aaVar);
                                        if (appStartTrace.yellow != null) {
                                            x gold2 = aa.gold();
                                            gold2.november("_experiment_procStart_to_classLoad");
                                            gold2.lima(appStartTrace.charlie().alpha);
                                            gold2.mike(appStartTrace.charlie().delta(appStartTrace.alpha()));
                                            xVar.juliet((aa) gold2.golf());
                                        }
                                        if (appStartTrace.f8298n) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        xVar.india();
                                        aa.whiskey((aa) xVar.purple).put("systemDeterminedForeground", str);
                                        xVar.kilo(appStartTrace.f8296l, "onDrawCount");
                                        w charlie = appStartTrace.f8294j.charlie();
                                        xVar.india();
                                        aa.xray((aa) xVar.purple, charlie);
                                        appStartTrace.echo(xVar);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f8291g == null) {
                                        appStartTrace.f8291g = new Timer();
                                        long j5 = appStartTrace.charlie().alpha;
                                        x xVar2 = appStartTrace.silver;
                                        xVar2.lima(j5);
                                        xVar2.mike(appStartTrace.charlie().delta(appStartTrace.f8291g));
                                        appStartTrace.echo(xVar2);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f8292h == null) {
                                        appStartTrace.f8292h = new Timer();
                                        x gold3 = aa.gold();
                                        gold3.november("_experiment_preDrawFoQ");
                                        gold3.lima(appStartTrace.charlie().alpha);
                                        gold3.mike(appStartTrace.charlie().delta(appStartTrace.f8292h));
                                        aa aaVar2 = (aa) gold3.golf();
                                        x xVar3 = appStartTrace.silver;
                                        xVar3.juliet(aaVar2);
                                        appStartTrace.echo(xVar3);
                                        return;
                                    }
                                    return;
                                default:
                                    Timer timer = AppStartTrace.f8282o;
                                    x gold4 = aa.gold();
                                    gold4.november("_as");
                                    gold4.lima(appStartTrace.alpha().alpha);
                                    gold4.mike(appStartTrace.alpha().delta(appStartTrace.f8289d));
                                    ArrayList arrayList = new ArrayList(3);
                                    x gold5 = aa.gold();
                                    gold5.november("_astui");
                                    gold5.lima(appStartTrace.alpha().alpha);
                                    gold5.mike(appStartTrace.alpha().delta(appStartTrace.f8287b));
                                    arrayList.add((aa) gold5.golf());
                                    if (appStartTrace.f8288c != null) {
                                        x gold6 = aa.gold();
                                        gold6.november("_astfd");
                                        gold6.lima(appStartTrace.f8287b.alpha);
                                        gold6.mike(appStartTrace.f8287b.delta(appStartTrace.f8288c));
                                        arrayList.add((aa) gold6.golf());
                                        x gold7 = aa.gold();
                                        gold7.november("_asti");
                                        gold7.lima(appStartTrace.f8288c.alpha);
                                        gold7.mike(appStartTrace.f8288c.delta(appStartTrace.f8289d));
                                        arrayList.add((aa) gold7.golf());
                                    }
                                    gold4.india();
                                    aa.victor((aa) gold4.purple, arrayList);
                                    w charlie2 = appStartTrace.f8294j.charlie();
                                    gold4.india();
                                    aa.xray((aa) gold4.purple, charlie2);
                                    appStartTrace.purple.charlie((aa) gold4.golf(), i.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    });
                    if (Build.VERSION.SDK_INT < 26 && (!findViewById.getViewTreeObserver().isAlive() || !findViewById.isAttachedToWindow())) {
                        findViewById.addOnAttachStateChangeListener(new b(0, cVar));
                        final int i5 = 1;
                        final int i10 = 2;
                        findViewById.getViewTreeObserver().addOnPreDrawListener(new f(findViewById, new Runnable(this) { // from class: v8.a
                            public final /* synthetic */ AppStartTrace purple;

                            {
                                this.purple = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                AppStartTrace appStartTrace = this.purple;
                                switch (i5) {
                                    case 0:
                                        if (appStartTrace.f8293i == null) {
                                            appStartTrace.f8293i = new Timer();
                                            x gold = aa.gold();
                                            gold.november("_experiment_onDrawFoQ");
                                            gold.lima(appStartTrace.charlie().alpha);
                                            gold.mike(appStartTrace.charlie().delta(appStartTrace.f8293i));
                                            aa aaVar = (aa) gold.golf();
                                            x xVar = appStartTrace.silver;
                                            xVar.juliet(aaVar);
                                            if (appStartTrace.yellow != null) {
                                                x gold2 = aa.gold();
                                                gold2.november("_experiment_procStart_to_classLoad");
                                                gold2.lima(appStartTrace.charlie().alpha);
                                                gold2.mike(appStartTrace.charlie().delta(appStartTrace.alpha()));
                                                xVar.juliet((aa) gold2.golf());
                                            }
                                            if (appStartTrace.f8298n) {
                                                str = "true";
                                            } else {
                                                str = "false";
                                            }
                                            xVar.india();
                                            aa.whiskey((aa) xVar.purple).put("systemDeterminedForeground", str);
                                            xVar.kilo(appStartTrace.f8296l, "onDrawCount");
                                            w charlie = appStartTrace.f8294j.charlie();
                                            xVar.india();
                                            aa.xray((aa) xVar.purple, charlie);
                                            appStartTrace.echo(xVar);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.f8291g == null) {
                                            appStartTrace.f8291g = new Timer();
                                            long j5 = appStartTrace.charlie().alpha;
                                            x xVar2 = appStartTrace.silver;
                                            xVar2.lima(j5);
                                            xVar2.mike(appStartTrace.charlie().delta(appStartTrace.f8291g));
                                            appStartTrace.echo(xVar2);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.f8292h == null) {
                                            appStartTrace.f8292h = new Timer();
                                            x gold3 = aa.gold();
                                            gold3.november("_experiment_preDrawFoQ");
                                            gold3.lima(appStartTrace.charlie().alpha);
                                            gold3.mike(appStartTrace.charlie().delta(appStartTrace.f8292h));
                                            aa aaVar2 = (aa) gold3.golf();
                                            x xVar3 = appStartTrace.silver;
                                            xVar3.juliet(aaVar2);
                                            appStartTrace.echo(xVar3);
                                            return;
                                        }
                                        return;
                                    default:
                                        Timer timer = AppStartTrace.f8282o;
                                        x gold4 = aa.gold();
                                        gold4.november("_as");
                                        gold4.lima(appStartTrace.alpha().alpha);
                                        gold4.mike(appStartTrace.alpha().delta(appStartTrace.f8289d));
                                        ArrayList arrayList = new ArrayList(3);
                                        x gold5 = aa.gold();
                                        gold5.november("_astui");
                                        gold5.lima(appStartTrace.alpha().alpha);
                                        gold5.mike(appStartTrace.alpha().delta(appStartTrace.f8287b));
                                        arrayList.add((aa) gold5.golf());
                                        if (appStartTrace.f8288c != null) {
                                            x gold6 = aa.gold();
                                            gold6.november("_astfd");
                                            gold6.lima(appStartTrace.f8287b.alpha);
                                            gold6.mike(appStartTrace.f8287b.delta(appStartTrace.f8288c));
                                            arrayList.add((aa) gold6.golf());
                                            x gold7 = aa.gold();
                                            gold7.november("_asti");
                                            gold7.lima(appStartTrace.f8288c.alpha);
                                            gold7.mike(appStartTrace.f8288c.delta(appStartTrace.f8289d));
                                            arrayList.add((aa) gold7.golf());
                                        }
                                        gold4.india();
                                        aa.victor((aa) gold4.purple, arrayList);
                                        w charlie2 = appStartTrace.f8294j.charlie();
                                        gold4.india();
                                        aa.xray((aa) gold4.purple, charlie2);
                                        appStartTrace.purple.charlie((aa) gold4.golf(), i.FOREGROUND_BACKGROUND);
                                        return;
                                }
                            }
                        }, new Runnable(this) { // from class: v8.a
                            public final /* synthetic */ AppStartTrace purple;

                            {
                                this.purple = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                String str;
                                AppStartTrace appStartTrace = this.purple;
                                switch (i10) {
                                    case 0:
                                        if (appStartTrace.f8293i == null) {
                                            appStartTrace.f8293i = new Timer();
                                            x gold = aa.gold();
                                            gold.november("_experiment_onDrawFoQ");
                                            gold.lima(appStartTrace.charlie().alpha);
                                            gold.mike(appStartTrace.charlie().delta(appStartTrace.f8293i));
                                            aa aaVar = (aa) gold.golf();
                                            x xVar = appStartTrace.silver;
                                            xVar.juliet(aaVar);
                                            if (appStartTrace.yellow != null) {
                                                x gold2 = aa.gold();
                                                gold2.november("_experiment_procStart_to_classLoad");
                                                gold2.lima(appStartTrace.charlie().alpha);
                                                gold2.mike(appStartTrace.charlie().delta(appStartTrace.alpha()));
                                                xVar.juliet((aa) gold2.golf());
                                            }
                                            if (appStartTrace.f8298n) {
                                                str = "true";
                                            } else {
                                                str = "false";
                                            }
                                            xVar.india();
                                            aa.whiskey((aa) xVar.purple).put("systemDeterminedForeground", str);
                                            xVar.kilo(appStartTrace.f8296l, "onDrawCount");
                                            w charlie = appStartTrace.f8294j.charlie();
                                            xVar.india();
                                            aa.xray((aa) xVar.purple, charlie);
                                            appStartTrace.echo(xVar);
                                            return;
                                        }
                                        return;
                                    case 1:
                                        if (appStartTrace.f8291g == null) {
                                            appStartTrace.f8291g = new Timer();
                                            long j5 = appStartTrace.charlie().alpha;
                                            x xVar2 = appStartTrace.silver;
                                            xVar2.lima(j5);
                                            xVar2.mike(appStartTrace.charlie().delta(appStartTrace.f8291g));
                                            appStartTrace.echo(xVar2);
                                            return;
                                        }
                                        return;
                                    case 2:
                                        if (appStartTrace.f8292h == null) {
                                            appStartTrace.f8292h = new Timer();
                                            x gold3 = aa.gold();
                                            gold3.november("_experiment_preDrawFoQ");
                                            gold3.lima(appStartTrace.charlie().alpha);
                                            gold3.mike(appStartTrace.charlie().delta(appStartTrace.f8292h));
                                            aa aaVar2 = (aa) gold3.golf();
                                            x xVar3 = appStartTrace.silver;
                                            xVar3.juliet(aaVar2);
                                            appStartTrace.echo(xVar3);
                                            return;
                                        }
                                        return;
                                    default:
                                        Timer timer = AppStartTrace.f8282o;
                                        x gold4 = aa.gold();
                                        gold4.november("_as");
                                        gold4.lima(appStartTrace.alpha().alpha);
                                        gold4.mike(appStartTrace.alpha().delta(appStartTrace.f8289d));
                                        ArrayList arrayList = new ArrayList(3);
                                        x gold5 = aa.gold();
                                        gold5.november("_astui");
                                        gold5.lima(appStartTrace.alpha().alpha);
                                        gold5.mike(appStartTrace.alpha().delta(appStartTrace.f8287b));
                                        arrayList.add((aa) gold5.golf());
                                        if (appStartTrace.f8288c != null) {
                                            x gold6 = aa.gold();
                                            gold6.november("_astfd");
                                            gold6.lima(appStartTrace.f8287b.alpha);
                                            gold6.mike(appStartTrace.f8287b.delta(appStartTrace.f8288c));
                                            arrayList.add((aa) gold6.golf());
                                            x gold7 = aa.gold();
                                            gold7.november("_asti");
                                            gold7.lima(appStartTrace.f8288c.alpha);
                                            gold7.mike(appStartTrace.f8288c.delta(appStartTrace.f8289d));
                                            arrayList.add((aa) gold7.golf());
                                        }
                                        gold4.india();
                                        aa.victor((aa) gold4.purple, arrayList);
                                        w charlie2 = appStartTrace.f8294j.charlie();
                                        gold4.india();
                                        aa.xray((aa) gold4.purple, charlie2);
                                        appStartTrace.purple.charlie((aa) gold4.golf(), i.FOREGROUND_BACKGROUND);
                                        return;
                                }
                            }
                        }));
                    }
                    findViewById.getViewTreeObserver().addOnDrawListener(cVar);
                    final int i52 = 1;
                    final int i102 = 2;
                    findViewById.getViewTreeObserver().addOnPreDrawListener(new f(findViewById, new Runnable(this) { // from class: v8.a
                        public final /* synthetic */ AppStartTrace purple;

                        {
                            this.purple = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.purple;
                            switch (i52) {
                                case 0:
                                    if (appStartTrace.f8293i == null) {
                                        appStartTrace.f8293i = new Timer();
                                        x gold = aa.gold();
                                        gold.november("_experiment_onDrawFoQ");
                                        gold.lima(appStartTrace.charlie().alpha);
                                        gold.mike(appStartTrace.charlie().delta(appStartTrace.f8293i));
                                        aa aaVar = (aa) gold.golf();
                                        x xVar = appStartTrace.silver;
                                        xVar.juliet(aaVar);
                                        if (appStartTrace.yellow != null) {
                                            x gold2 = aa.gold();
                                            gold2.november("_experiment_procStart_to_classLoad");
                                            gold2.lima(appStartTrace.charlie().alpha);
                                            gold2.mike(appStartTrace.charlie().delta(appStartTrace.alpha()));
                                            xVar.juliet((aa) gold2.golf());
                                        }
                                        if (appStartTrace.f8298n) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        xVar.india();
                                        aa.whiskey((aa) xVar.purple).put("systemDeterminedForeground", str);
                                        xVar.kilo(appStartTrace.f8296l, "onDrawCount");
                                        w charlie = appStartTrace.f8294j.charlie();
                                        xVar.india();
                                        aa.xray((aa) xVar.purple, charlie);
                                        appStartTrace.echo(xVar);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f8291g == null) {
                                        appStartTrace.f8291g = new Timer();
                                        long j5 = appStartTrace.charlie().alpha;
                                        x xVar2 = appStartTrace.silver;
                                        xVar2.lima(j5);
                                        xVar2.mike(appStartTrace.charlie().delta(appStartTrace.f8291g));
                                        appStartTrace.echo(xVar2);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f8292h == null) {
                                        appStartTrace.f8292h = new Timer();
                                        x gold3 = aa.gold();
                                        gold3.november("_experiment_preDrawFoQ");
                                        gold3.lima(appStartTrace.charlie().alpha);
                                        gold3.mike(appStartTrace.charlie().delta(appStartTrace.f8292h));
                                        aa aaVar2 = (aa) gold3.golf();
                                        x xVar3 = appStartTrace.silver;
                                        xVar3.juliet(aaVar2);
                                        appStartTrace.echo(xVar3);
                                        return;
                                    }
                                    return;
                                default:
                                    Timer timer = AppStartTrace.f8282o;
                                    x gold4 = aa.gold();
                                    gold4.november("_as");
                                    gold4.lima(appStartTrace.alpha().alpha);
                                    gold4.mike(appStartTrace.alpha().delta(appStartTrace.f8289d));
                                    ArrayList arrayList = new ArrayList(3);
                                    x gold5 = aa.gold();
                                    gold5.november("_astui");
                                    gold5.lima(appStartTrace.alpha().alpha);
                                    gold5.mike(appStartTrace.alpha().delta(appStartTrace.f8287b));
                                    arrayList.add((aa) gold5.golf());
                                    if (appStartTrace.f8288c != null) {
                                        x gold6 = aa.gold();
                                        gold6.november("_astfd");
                                        gold6.lima(appStartTrace.f8287b.alpha);
                                        gold6.mike(appStartTrace.f8287b.delta(appStartTrace.f8288c));
                                        arrayList.add((aa) gold6.golf());
                                        x gold7 = aa.gold();
                                        gold7.november("_asti");
                                        gold7.lima(appStartTrace.f8288c.alpha);
                                        gold7.mike(appStartTrace.f8288c.delta(appStartTrace.f8289d));
                                        arrayList.add((aa) gold7.golf());
                                    }
                                    gold4.india();
                                    aa.victor((aa) gold4.purple, arrayList);
                                    w charlie2 = appStartTrace.f8294j.charlie();
                                    gold4.india();
                                    aa.xray((aa) gold4.purple, charlie2);
                                    appStartTrace.purple.charlie((aa) gold4.golf(), i.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    }, new Runnable(this) { // from class: v8.a
                        public final /* synthetic */ AppStartTrace purple;

                        {
                            this.purple = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str;
                            AppStartTrace appStartTrace = this.purple;
                            switch (i102) {
                                case 0:
                                    if (appStartTrace.f8293i == null) {
                                        appStartTrace.f8293i = new Timer();
                                        x gold = aa.gold();
                                        gold.november("_experiment_onDrawFoQ");
                                        gold.lima(appStartTrace.charlie().alpha);
                                        gold.mike(appStartTrace.charlie().delta(appStartTrace.f8293i));
                                        aa aaVar = (aa) gold.golf();
                                        x xVar = appStartTrace.silver;
                                        xVar.juliet(aaVar);
                                        if (appStartTrace.yellow != null) {
                                            x gold2 = aa.gold();
                                            gold2.november("_experiment_procStart_to_classLoad");
                                            gold2.lima(appStartTrace.charlie().alpha);
                                            gold2.mike(appStartTrace.charlie().delta(appStartTrace.alpha()));
                                            xVar.juliet((aa) gold2.golf());
                                        }
                                        if (appStartTrace.f8298n) {
                                            str = "true";
                                        } else {
                                            str = "false";
                                        }
                                        xVar.india();
                                        aa.whiskey((aa) xVar.purple).put("systemDeterminedForeground", str);
                                        xVar.kilo(appStartTrace.f8296l, "onDrawCount");
                                        w charlie = appStartTrace.f8294j.charlie();
                                        xVar.india();
                                        aa.xray((aa) xVar.purple, charlie);
                                        appStartTrace.echo(xVar);
                                        return;
                                    }
                                    return;
                                case 1:
                                    if (appStartTrace.f8291g == null) {
                                        appStartTrace.f8291g = new Timer();
                                        long j5 = appStartTrace.charlie().alpha;
                                        x xVar2 = appStartTrace.silver;
                                        xVar2.lima(j5);
                                        xVar2.mike(appStartTrace.charlie().delta(appStartTrace.f8291g));
                                        appStartTrace.echo(xVar2);
                                        return;
                                    }
                                    return;
                                case 2:
                                    if (appStartTrace.f8292h == null) {
                                        appStartTrace.f8292h = new Timer();
                                        x gold3 = aa.gold();
                                        gold3.november("_experiment_preDrawFoQ");
                                        gold3.lima(appStartTrace.charlie().alpha);
                                        gold3.mike(appStartTrace.charlie().delta(appStartTrace.f8292h));
                                        aa aaVar2 = (aa) gold3.golf();
                                        x xVar3 = appStartTrace.silver;
                                        xVar3.juliet(aaVar2);
                                        appStartTrace.echo(xVar3);
                                        return;
                                    }
                                    return;
                                default:
                                    Timer timer = AppStartTrace.f8282o;
                                    x gold4 = aa.gold();
                                    gold4.november("_as");
                                    gold4.lima(appStartTrace.alpha().alpha);
                                    gold4.mike(appStartTrace.alpha().delta(appStartTrace.f8289d));
                                    ArrayList arrayList = new ArrayList(3);
                                    x gold5 = aa.gold();
                                    gold5.november("_astui");
                                    gold5.lima(appStartTrace.alpha().alpha);
                                    gold5.mike(appStartTrace.alpha().delta(appStartTrace.f8287b));
                                    arrayList.add((aa) gold5.golf());
                                    if (appStartTrace.f8288c != null) {
                                        x gold6 = aa.gold();
                                        gold6.november("_astfd");
                                        gold6.lima(appStartTrace.f8287b.alpha);
                                        gold6.mike(appStartTrace.f8287b.delta(appStartTrace.f8288c));
                                        arrayList.add((aa) gold6.golf());
                                        x gold7 = aa.gold();
                                        gold7.november("_asti");
                                        gold7.lima(appStartTrace.f8288c.alpha);
                                        gold7.mike(appStartTrace.f8288c.delta(appStartTrace.f8289d));
                                        arrayList.add((aa) gold7.golf());
                                    }
                                    gold4.india();
                                    aa.victor((aa) gold4.purple, arrayList);
                                    w charlie2 = appStartTrace.f8294j.charlie();
                                    gold4.india();
                                    aa.xray((aa) gold4.purple, charlie2);
                                    appStartTrace.purple.charlie((aa) gold4.golf(), i.FOREGROUND_BACKGROUND);
                                    return;
                            }
                        }
                    }));
                }
                if (this.f8289d != null) {
                    return;
                }
                new WeakReference(activity);
                this.f8289d = new Timer();
                this.f8294j = SessionManager.getInstance().perfSession();
                C3146a.delta().alpha("onResume(): " + activity.getClass().getName() + ": " + alpha().delta(this.f8289d) + " microseconds");
                final int i11 = 3;
                f8285r.execute(new Runnable(this) { // from class: v8.a
                    public final /* synthetic */ AppStartTrace purple;

                    {
                        this.purple = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        String str;
                        AppStartTrace appStartTrace = this.purple;
                        switch (i11) {
                            case 0:
                                if (appStartTrace.f8293i == null) {
                                    appStartTrace.f8293i = new Timer();
                                    x gold = aa.gold();
                                    gold.november("_experiment_onDrawFoQ");
                                    gold.lima(appStartTrace.charlie().alpha);
                                    gold.mike(appStartTrace.charlie().delta(appStartTrace.f8293i));
                                    aa aaVar = (aa) gold.golf();
                                    x xVar = appStartTrace.silver;
                                    xVar.juliet(aaVar);
                                    if (appStartTrace.yellow != null) {
                                        x gold2 = aa.gold();
                                        gold2.november("_experiment_procStart_to_classLoad");
                                        gold2.lima(appStartTrace.charlie().alpha);
                                        gold2.mike(appStartTrace.charlie().delta(appStartTrace.alpha()));
                                        xVar.juliet((aa) gold2.golf());
                                    }
                                    if (appStartTrace.f8298n) {
                                        str = "true";
                                    } else {
                                        str = "false";
                                    }
                                    xVar.india();
                                    aa.whiskey((aa) xVar.purple).put("systemDeterminedForeground", str);
                                    xVar.kilo(appStartTrace.f8296l, "onDrawCount");
                                    w charlie = appStartTrace.f8294j.charlie();
                                    xVar.india();
                                    aa.xray((aa) xVar.purple, charlie);
                                    appStartTrace.echo(xVar);
                                    return;
                                }
                                return;
                            case 1:
                                if (appStartTrace.f8291g == null) {
                                    appStartTrace.f8291g = new Timer();
                                    long j5 = appStartTrace.charlie().alpha;
                                    x xVar2 = appStartTrace.silver;
                                    xVar2.lima(j5);
                                    xVar2.mike(appStartTrace.charlie().delta(appStartTrace.f8291g));
                                    appStartTrace.echo(xVar2);
                                    return;
                                }
                                return;
                            case 2:
                                if (appStartTrace.f8292h == null) {
                                    appStartTrace.f8292h = new Timer();
                                    x gold3 = aa.gold();
                                    gold3.november("_experiment_preDrawFoQ");
                                    gold3.lima(appStartTrace.charlie().alpha);
                                    gold3.mike(appStartTrace.charlie().delta(appStartTrace.f8292h));
                                    aa aaVar2 = (aa) gold3.golf();
                                    x xVar3 = appStartTrace.silver;
                                    xVar3.juliet(aaVar2);
                                    appStartTrace.echo(xVar3);
                                    return;
                                }
                                return;
                            default:
                                Timer timer = AppStartTrace.f8282o;
                                x gold4 = aa.gold();
                                gold4.november("_as");
                                gold4.lima(appStartTrace.alpha().alpha);
                                gold4.mike(appStartTrace.alpha().delta(appStartTrace.f8289d));
                                ArrayList arrayList = new ArrayList(3);
                                x gold5 = aa.gold();
                                gold5.november("_astui");
                                gold5.lima(appStartTrace.alpha().alpha);
                                gold5.mike(appStartTrace.alpha().delta(appStartTrace.f8287b));
                                arrayList.add((aa) gold5.golf());
                                if (appStartTrace.f8288c != null) {
                                    x gold6 = aa.gold();
                                    gold6.november("_astfd");
                                    gold6.lima(appStartTrace.f8287b.alpha);
                                    gold6.mike(appStartTrace.f8287b.delta(appStartTrace.f8288c));
                                    arrayList.add((aa) gold6.golf());
                                    x gold7 = aa.gold();
                                    gold7.november("_asti");
                                    gold7.lima(appStartTrace.f8288c.alpha);
                                    gold7.mike(appStartTrace.f8288c.delta(appStartTrace.f8289d));
                                    arrayList.add((aa) gold7.golf());
                                }
                                gold4.india();
                                aa.victor((aa) gold4.purple, arrayList);
                                w charlie2 = appStartTrace.f8294j.charlie();
                                gold4.india();
                                aa.xray((aa) gold4.purple, charlie2);
                                appStartTrace.purple.charlie((aa) gold4.golf(), i.FOREGROUND_BACKGROUND);
                                return;
                        }
                    }
                });
                if (!foxtrot) {
                    golf();
                }
            }
        } finally {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        if (!this.f8295k && this.f8288c == null && !this.white) {
            this.f8288c = new Timer();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @B(androidx.lifecycle.aa.ON_STOP)
    @Keep
    public void onAppEnteredBackground() {
        if (!this.f8295k && !this.white && this.f8290f == null) {
            this.f8290f = new Timer();
            x gold = aa.gold();
            gold.november("_experiment_firstBackgrounding");
            gold.lima(charlie().alpha);
            gold.mike(charlie().delta(this.f8290f));
            this.silver.juliet((aa) gold.golf());
        }
    }

    @B(androidx.lifecycle.aa.ON_START)
    @Keep
    public void onAppEnteredForeground() {
        if (!this.f8295k && !this.white && this.e == null) {
            this.e = new Timer();
            x gold = aa.gold();
            gold.november("_experiment_firstForegrounding");
            gold.lima(charlie().alpha);
            gold.mike(charlie().delta(this.e));
            this.silver.juliet((aa) gold.golf());
        }
    }
}
