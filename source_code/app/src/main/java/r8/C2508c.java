package r8;

import A8.h;
import C8.aa;
import C8.i;
import C8.w;
import C8.x;
import android.app.Activity;
import android.app.Application;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.E;
import androidx.fragment.app.L;
import androidx.fragment.app.an;
import androidx.fragment.app.ao;
import androidx.fragment.app.av;
import av.ah;
import com.google.android.gms.measurement.internal.r;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import s8.C2837a;
import u8.C3146a;
import v8.C3178c;

/* renamed from: r8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2508c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: k, reason: collision with root package name */
    public static final C3146a f13200k = C3146a.delta();

    /* renamed from: l, reason: collision with root package name */
    public static volatile C2508c f13201l;

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f13202a;
    public final WeakHashMap alpha;

    /* renamed from: b, reason: collision with root package name */
    public final h f13203b;

    /* renamed from: c, reason: collision with root package name */
    public final C2837a f13204c;

    /* renamed from: d, reason: collision with root package name */
    public final g8.d f13205d;
    public final boolean e;

    /* renamed from: f, reason: collision with root package name */
    public Timer f13206f;

    /* renamed from: g, reason: collision with root package name */
    public Timer f13207g;

    /* renamed from: h, reason: collision with root package name */
    public i f13208h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f13209i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f13210j;
    public final WeakHashMap purple;
    public final WeakHashMap red;
    public final WeakHashMap silver;
    public final HashMap teal;
    public final HashSet white;
    public final HashSet yellow;

    public C2508c(h hVar, g8.d dVar) {
        C2837a echo = C2837a.echo();
        C3146a c3146a = f.echo;
        this.alpha = new WeakHashMap();
        this.purple = new WeakHashMap();
        this.red = new WeakHashMap();
        this.silver = new WeakHashMap();
        this.teal = new HashMap();
        this.white = new HashSet();
        this.yellow = new HashSet();
        this.f13202a = new AtomicInteger(0);
        this.f13208h = i.BACKGROUND;
        this.f13209i = false;
        this.f13210j = true;
        this.f13203b = hVar;
        this.f13205d = dVar;
        this.f13204c = echo;
        this.e = true;
    }

    public static C2508c alpha() {
        if (f13201l == null) {
            synchronized (C2508c.class) {
                try {
                    if (f13201l == null) {
                        f13201l = new C2508c(h.f18l, new g8.d(1));
                    }
                } finally {
                }
            }
        }
        return f13201l;
    }

    public final void bravo(String str) {
        synchronized (this.teal) {
            try {
                Long l10 = (Long) this.teal.get(str);
                if (l10 == null) {
                    this.teal.put(str, 1L);
                } else {
                    this.teal.put(str, Long.valueOf(l10.longValue() + 1));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void charlie(q8.c cVar) {
        synchronized (this.yellow) {
            this.yellow.add(cVar);
        }
    }

    public final void delta(WeakReference weakReference) {
        synchronized (this.white) {
            this.white.add(weakReference);
        }
    }

    public final void echo() {
        synchronized (this.yellow) {
            try {
                Iterator it = this.yellow.iterator();
                while (it.hasNext()) {
                    if (((InterfaceC2506a) it.next()) != null) {
                        try {
                            C3146a c3146a = q8.b.bravo;
                        } catch (IllegalStateException e) {
                            q8.c.alpha.golf("FirebaseApp is not initialized. Firebase Performance will not be collecting any performance metrics until initialized. %s", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void foxtrot(Activity activity) {
        B8.e eVar;
        WeakHashMap weakHashMap = this.silver;
        Trace trace = (Trace) weakHashMap.get(activity);
        if (trace == null) {
            return;
        }
        weakHashMap.remove(activity);
        f fVar = (f) this.purple.get(activity);
        ah ahVar = fVar.bravo;
        boolean z2 = fVar.delta;
        C3146a c3146a = f.echo;
        if (!z2) {
            c3146a.alpha("Cannot stop because no recording was started");
            eVar = new B8.e();
        } else {
            HashMap hashMap = fVar.charlie;
            if (!hashMap.isEmpty()) {
                c3146a.alpha("Sub-recordings are still ongoing! Sub-recordings should be stopped first before stopping Activity screen trace.");
                hashMap.clear();
            }
            B8.e alpha = fVar.alpha();
            try {
                ((r) ahVar.purple).echo(fVar.alpha);
            } catch (IllegalArgumentException | NullPointerException e) {
                if ((e instanceof NullPointerException) && Build.VERSION.SDK_INT > 28) {
                    throw e;
                }
                c3146a.golf("View not hardware accelerated. Unable to collect FrameMetrics. %s", e.toString());
                alpha = new B8.e();
            }
            ((r) ahVar.purple).foxtrot();
            fVar.delta = false;
            eVar = alpha;
        }
        if (!eVar.bravo()) {
            f13200k.golf("Failed to record frame data for %s.", activity.getClass().getSimpleName());
        } else {
            B8.i.alpha(trace, (C3178c) eVar.alpha());
            trace.stop();
        }
    }

    public final void golf(String str, Timer timer, Timer timer2) {
        if (!this.f13204c.tango()) {
            return;
        }
        x gold = aa.gold();
        gold.november(str);
        gold.lima(timer.alpha);
        gold.mike(timer.delta(timer2));
        w charlie = SessionManager.getInstance().perfSession().charlie();
        gold.india();
        aa.xray((aa) gold.purple, charlie);
        int andSet = this.f13202a.getAndSet(0);
        synchronized (this.teal) {
            try {
                HashMap hashMap = this.teal;
                gold.india();
                aa.tango((aa) gold.purple).putAll(hashMap);
                if (andSet != 0) {
                    gold.kilo(andSet, "_tsns");
                }
                this.teal.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f13203b.charlie((aa) gold.golf(), i.FOREGROUND_BACKGROUND);
    }

    public final void hotel(Activity activity) {
        if (this.e && this.f13204c.tango()) {
            f fVar = new f(activity);
            this.purple.put(activity, fVar);
            if (activity instanceof an) {
                e eVar = new e(this.f13205d, this.f13203b, this, fVar);
                this.red.put(activity, eVar);
                ao aoVar = ((an) activity).getSupportFragmentManager().papa;
                aoVar.getClass();
                ((CopyOnWriteArrayList) aoVar.bravo).add(new av(eVar));
            }
        }
    }

    public final void india(i iVar) {
        this.f13208h = iVar;
        synchronized (this.white) {
            try {
                Iterator it = this.white.iterator();
                while (it.hasNext()) {
                    InterfaceC2507b interfaceC2507b = (InterfaceC2507b) ((WeakReference) it.next()).get();
                    if (interfaceC2507b != null) {
                        interfaceC2507b.onUpdateAppState(this.f13208h);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        hotel(activity);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
    
        ((java.util.concurrent.CopyOnWriteArrayList) r0.bravo).remove(r3);
     */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onActivityDestroyed(Activity activity) {
        this.purple.remove(activity);
        if (this.red.containsKey(activity)) {
            L supportFragmentManager = ((an) activity).getSupportFragmentManager();
            E cb2 = (E) this.red.remove(activity);
            ao aoVar = supportFragmentManager.papa;
            aoVar.getClass();
            Intrinsics.echo(cb2, "cb");
            synchronized (((CopyOnWriteArrayList) aoVar.bravo)) {
                int size = ((CopyOnWriteArrayList) aoVar.bravo).size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size) {
                        break;
                    } else if (((av) ((CopyOnWriteArrayList) aoVar.bravo).get(i4)).alpha == cb2) {
                        break;
                    } else {
                        i4++;
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityResumed(Activity activity) {
        try {
            if (this.alpha.isEmpty()) {
                this.f13205d.getClass();
                this.f13206f = new Timer();
                this.alpha.put(activity, Boolean.TRUE);
                if (this.f13210j) {
                    india(i.FOREGROUND);
                    echo();
                    this.f13210j = false;
                } else {
                    golf("_bs", this.f13207g, this.f13206f);
                    india(i.FOREGROUND);
                }
            } else {
                this.alpha.put(activity, Boolean.TRUE);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStarted(Activity activity) {
        try {
            if (this.e && this.f13204c.tango()) {
                if (!this.purple.containsKey(activity)) {
                    hotel(activity);
                }
                f fVar = (f) this.purple.get(activity);
                boolean z2 = fVar.delta;
                Activity activity2 = fVar.alpha;
                if (z2) {
                    f.echo.bravo("FrameMetricsAggregator is already recording %s", activity2.getClass().getSimpleName());
                } else {
                    ((r) fVar.bravo.purple).charlie(activity2);
                    fVar.delta = true;
                }
                Trace trace = new Trace("_st_".concat(activity.getClass().getSimpleName()), this.f13203b, this.f13205d, this);
                trace.start();
                this.silver.put(activity, trace);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final synchronized void onActivityStopped(Activity activity) {
        try {
            if (this.e) {
                foxtrot(activity);
            }
            if (this.alpha.containsKey(activity)) {
                this.alpha.remove(activity);
                if (this.alpha.isEmpty()) {
                    this.f13205d.getClass();
                    Timer timer = new Timer();
                    this.f13207g = timer;
                    golf("_fs", this.f13206f, timer);
                    india(i.BACKGROUND);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
