package com.google.firebase.perf.metrics;

import A8.h;
import Y5.a;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.appcompat.widget.P0;
import av.q;
import com.google.firebase.perf.session.PerfSession;
import com.google.firebase.perf.session.SessionManager;
import com.google.firebase.perf.session.gauges.GaugeManager;
import com.google.firebase.perf.util.Timer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import r8.C2508c;
import r8.d;
import s8.C2837a;
import tg.b;
import u8.C3146a;
import w8.e;
import y8.InterfaceC3402a;

/* loaded from: classes2.dex */
public class Trace extends d implements Parcelable, InterfaceC3402a {

    @Keep
    public static final Parcelable.Creator<Trace> CREATOR;

    /* renamed from: f, reason: collision with root package name */
    public static final C3146a f8299f = C3146a.delta();

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f8300a;
    public final WeakReference alpha;

    /* renamed from: b, reason: collision with root package name */
    public final h f8301b;

    /* renamed from: c, reason: collision with root package name */
    public final g8.d f8302c;

    /* renamed from: d, reason: collision with root package name */
    public Timer f8303d;
    public Timer e;
    public final Trace purple;
    public final GaugeManager red;
    public final String silver;
    public final ConcurrentHashMap teal;
    public final ConcurrentHashMap white;
    public final List yellow;

    static {
        new ConcurrentHashMap();
        CREATOR = new a(28);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Trace(String str, h hVar, g8.d dVar, C2508c c2508c) {
        super(c2508c);
        GaugeManager gaugeManager = GaugeManager.getInstance();
        this.alpha = new WeakReference(this);
        this.purple = null;
        this.silver = str.trim();
        this.f8300a = new ArrayList();
        this.teal = new ConcurrentHashMap();
        this.white = new ConcurrentHashMap();
        this.f8302c = dVar;
        this.f8301b = hVar;
        this.yellow = Collections.synchronizedList(new ArrayList());
        this.red = gaugeManager;
    }

    @Override // y8.InterfaceC3402a
    public final void charlie(PerfSession perfSession) {
        if (perfSession == null) {
            f8299f.foxtrot("Unable to add new SessionId to the Trace. Continuing without it.");
        } else if (this.f8303d != null && !echo()) {
            this.yellow.add(perfSession);
        }
    }

    public final void delta(String str, String str2) {
        if (!echo()) {
            ConcurrentHashMap concurrentHashMap = this.white;
            if (!concurrentHashMap.containsKey(str) && concurrentHashMap.size() >= 5) {
                Locale locale = Locale.ENGLISH;
                throw new IllegalArgumentException("Exceeds max limit of number of attributes - 5");
            }
            e.bravo(str, str2);
            return;
        }
        Locale locale2 = Locale.ENGLISH;
        throw new IllegalArgumentException(P0.gold(new StringBuilder("Trace '"), this.silver, "' has been stopped"));
    }

    @Override // android.os.Parcelable
    @Keep
    public int describeContents() {
        return 0;
    }

    public final boolean echo() {
        if (this.e != null) {
            return true;
        }
        return false;
    }

    public final void finalize() {
        boolean z2;
        try {
            if (this.f8303d != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && !echo()) {
                f8299f.golf("Trace '%s' is started but not stopped when it is destructed!", this.silver);
                incrementTsnsCount(1);
            }
        } finally {
            super.finalize();
        }
    }

    @Keep
    public String getAttribute(String str) {
        return (String) this.white.get(str);
    }

    @Keep
    public Map<String, String> getAttributes() {
        return new HashMap(this.white);
    }

    @Keep
    public long getLongMetric(String str) {
        Counter counter;
        if (str != null) {
            counter = (Counter) this.teal.get(str.trim());
        } else {
            counter = null;
        }
        if (counter == null) {
            return 0L;
        }
        return counter.purple.get();
    }

    @Keep
    public void incrementMetric(String str, long j5) {
        boolean z2;
        String charlie = e.charlie(str);
        C3146a c3146a = f8299f;
        if (charlie != null) {
            c3146a.charlie("Cannot increment metric '%s'. Metric name is invalid.(%s)", str, charlie);
            return;
        }
        if (this.f8303d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = this.silver;
        if (!z2) {
            c3146a.golf("Cannot increment metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (echo()) {
            c3146a.golf("Cannot increment metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.teal;
        Counter counter = (Counter) concurrentHashMap.get(trim);
        if (counter == null) {
            counter = new Counter(trim);
            concurrentHashMap.put(trim, counter);
        }
        AtomicLong atomicLong = counter.purple;
        atomicLong.addAndGet(j5);
        c3146a.bravo("Incrementing metric '%s' to %d on trace '%s'", str, Long.valueOf(atomicLong.get()), str2);
    }

    @Keep
    public void putAttribute(String str, String str2) {
        boolean z2 = true;
        C3146a c3146a = f8299f;
        try {
            str = str.trim();
            str2 = str2.trim();
            delta(str, str2);
            c3146a.bravo("Setting attribute '%s' to '%s' on trace '%s'", str, str2, this.silver);
        } catch (Exception e) {
            c3146a.charlie("Can not set attribute '%s' with value '%s' (%s)", str, str2, e.getMessage());
            z2 = false;
        }
        if (z2) {
            this.white.put(str, str2);
        }
    }

    @Keep
    public void putMetric(String str, long j5) {
        boolean z2;
        String charlie = e.charlie(str);
        C3146a c3146a = f8299f;
        if (charlie != null) {
            c3146a.charlie("Cannot set value for metric '%s'. Metric name is invalid.(%s)", str, charlie);
            return;
        }
        if (this.f8303d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str2 = this.silver;
        if (!z2) {
            c3146a.golf("Cannot set value for metric '%s' for trace '%s' because it's not started", str, str2);
            return;
        }
        if (echo()) {
            c3146a.golf("Cannot set value for metric '%s' for trace '%s' because it's been stopped", str, str2);
            return;
        }
        String trim = str.trim();
        ConcurrentHashMap concurrentHashMap = this.teal;
        Counter counter = (Counter) concurrentHashMap.get(trim);
        if (counter == null) {
            counter = new Counter(trim);
            concurrentHashMap.put(trim, counter);
        }
        counter.purple.set(j5);
        c3146a.bravo("Setting metric '%s' to '%s' on trace '%s'", str, Long.valueOf(j5), str2);
    }

    @Keep
    public void removeAttribute(String str) {
        if (echo()) {
            C3146a c3146a = f8299f;
            if (c3146a.bravo) {
                c3146a.alpha.getClass();
                Log.e("FirebasePerformance", "Can't remove a attribute from a Trace that's stopped.");
                return;
            }
            return;
        }
        this.white.remove(str);
    }

    @Keep
    public void start() {
        String str;
        String str2 = null;
        boolean tango = C2837a.echo().tango();
        C3146a c3146a = f8299f;
        if (!tango) {
            c3146a.alpha("Trace feature is disabled.");
            return;
        }
        String str3 = this.silver;
        if (str3 == null) {
            str2 = "Trace name must not be null";
        } else if (str3.length() > 100) {
            Locale locale = Locale.US;
            str2 = "Trace name must not exceed 100 characters";
        } else if (str3.startsWith("_")) {
            int[] papa = q.papa(6);
            int length = papa.length;
            int i4 = 0;
            while (true) {
                if (i4 < length) {
                    switch (papa[i4]) {
                        case 1:
                            str = "_as";
                            break;
                        case 2:
                            str = "_astui";
                            break;
                        case 3:
                            str = "_astfd";
                            break;
                        case 4:
                            str = "_asti";
                            break;
                        case 5:
                            str = "_fs";
                            break;
                        case 6:
                            str = "_bs";
                            break;
                        default:
                            throw null;
                    }
                    if (!str.equals(str3)) {
                        i4++;
                    }
                } else if (!str3.startsWith("_st_")) {
                    str2 = "Trace name must not start with '_'";
                }
            }
        }
        if (str2 != null) {
            c3146a.charlie("Cannot start trace '%s'. Trace name is invalid.(%s)", str3, str2);
            return;
        }
        if (this.f8303d != null) {
            c3146a.charlie("Trace '%s' has already started, should not start again!", str3);
            return;
        }
        this.f8302c.getClass();
        this.f8303d = new Timer();
        registerForAppState();
        PerfSession perfSession = SessionManager.getInstance().perfSession();
        SessionManager.getInstance().registerForSessionUpdates(this.alpha);
        charlie(perfSession);
        if (perfSession.red) {
            this.red.collectGaugeMetricOnce(perfSession.purple);
        }
    }

    @Keep
    public void stop() {
        boolean z2;
        if (this.f8303d != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        String str = this.silver;
        C3146a c3146a = f8299f;
        if (!z2) {
            c3146a.charlie("Trace '%s' has not been started so unable to stop!", str);
            return;
        }
        if (echo()) {
            c3146a.charlie("Trace '%s' has already stopped, should not stop again!", str);
            return;
        }
        SessionManager.getInstance().unregisterForSessionUpdates(this.alpha);
        unregisterForAppState();
        this.f8302c.getClass();
        Timer timer = new Timer();
        this.e = timer;
        if (this.purple == null) {
            ArrayList arrayList = this.f8300a;
            if (!arrayList.isEmpty()) {
                Trace trace = (Trace) P0.amber(1, arrayList);
                if (trace.e == null) {
                    trace.e = timer;
                }
            }
            if (!str.isEmpty()) {
                this.f8301b.charlie(new b(2, this).alpha(), getAppState());
                if (SessionManager.getInstance().perfSession().red) {
                    this.red.collectGaugeMetricOnce(SessionManager.getInstance().perfSession().purple);
                    return;
                }
                return;
            }
            if (c3146a.bravo) {
                c3146a.alpha.getClass();
                Log.e("FirebasePerformance", "Trace name is empty, no log is sent to server");
            }
        }
    }

    @Override // android.os.Parcelable
    @Keep
    public void writeToParcel(Parcel parcel, int i4) {
        parcel.writeParcelable(this.purple, 0);
        parcel.writeString(this.silver);
        parcel.writeList(this.f8300a);
        parcel.writeMap(this.teal);
        parcel.writeParcelable(this.f8303d, 0);
        parcel.writeParcelable(this.e, 0);
        synchronized (this.yellow) {
            parcel.writeList(this.yellow);
        }
    }

    public Trace(Parcel parcel, boolean z2) {
        super(z2 ? null : C2508c.alpha());
        this.alpha = new WeakReference(this);
        this.purple = (Trace) parcel.readParcelable(Trace.class.getClassLoader());
        this.silver = parcel.readString();
        ArrayList arrayList = new ArrayList();
        this.f8300a = arrayList;
        parcel.readList(arrayList, Trace.class.getClassLoader());
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.teal = concurrentHashMap;
        this.white = new ConcurrentHashMap();
        parcel.readMap(concurrentHashMap, Counter.class.getClassLoader());
        this.f8303d = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        this.e = (Timer) parcel.readParcelable(Timer.class.getClassLoader());
        List synchronizedList = Collections.synchronizedList(new ArrayList());
        this.yellow = synchronizedList;
        parcel.readList(synchronizedList, PerfSession.class.getClassLoader());
        if (z2) {
            this.f8301b = null;
            this.f8302c = null;
            this.red = null;
        } else {
            this.f8301b = h.f18l;
            this.f8302c = new g8.d(1);
            this.red = GaugeManager.getInstance();
        }
    }
}
