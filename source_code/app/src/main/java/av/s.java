package av;

import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.C0496c;
import androidx.camera.core.C0497d;
import androidx.camera.core.InterfaceC0528j;
import androidx.camera.core.J;
import androidx.camera.core.O;
import androidx.camera.core.impl.AbstractC0512j;
import androidx.camera.core.impl.AbstractC0521t;
import androidx.camera.core.impl.C0503a;
import androidx.camera.core.impl.C0505c;
import androidx.camera.core.impl.C0509g;
import androidx.camera.core.impl.C0510h;
import androidx.camera.core.impl.EnumC0524w;
import androidx.camera.core.impl.InterfaceC0522u;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.InterfaceC0525x;
import androidx.camera.core.impl.P;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.Z;
import androidx.camera.core.impl.b0;
import androidx.lifecycle.RunnableC0643m;
import bd.ScheduledExecutorServiceC0750c;
import com.clevertap.android.sdk.Constants;
import id.C1915c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicInteger;
import s6.T7;
import t6.AbstractC3003i;
import t6.AbstractC3066u3;
import t6.K3;
import t6.N3;
import t6.P2;

/* loaded from: classes3.dex */
public final class s implements InterfaceC0525x {
    public volatile int A = 3;

    /* renamed from: a, reason: collision with root package name */
    public final r f3260a;
    public final J2.c alpha;

    /* renamed from: b, reason: collision with root package name */
    public final u f3261b;

    /* renamed from: c, reason: collision with root package name */
    public CameraDevice f3262c;

    /* renamed from: d, reason: collision with root package name */
    public int f3263d;
    public aj e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f3264f;

    /* renamed from: g, reason: collision with root package name */
    public int f3265g;

    /* renamed from: h, reason: collision with root package name */
    public final o f3266h;

    /* renamed from: i, reason: collision with root package name */
    public final Be.e f3267i;

    /* renamed from: j, reason: collision with root package name */
    public final androidx.camera.core.impl.ab f3268j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f3269k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f3270l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f3271m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f3272n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f3273o;

    /* renamed from: p, reason: collision with root package name */
    public ao f3274p;
    public final androidx.camera.camera2.internal.compat.q purple;

    /* renamed from: q, reason: collision with root package name */
    public final ao f3275q;

    /* renamed from: r, reason: collision with root package name */
    public final ao f3276r;
    public final bd.h red;

    /* renamed from: s, reason: collision with root package name */
    public final HashSet f3277s;
    public final ScheduledExecutorServiceC0750c silver;

    /* renamed from: t, reason: collision with root package name */
    public O7.l f3278t;
    public final w.o teal;

    /* renamed from: u, reason: collision with root package name */
    public final Object f3279u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f3280v;

    /* renamed from: w, reason: collision with root package name */
    public final ak f3281w;
    public final J2.l white;

    /* renamed from: x, reason: collision with root package name */
    public final androidx.core.widget.f f3282x;

    /* renamed from: y, reason: collision with root package name */
    public final ar f3283y;
    public final h yellow;

    /* renamed from: z, reason: collision with root package name */
    public final J2.c f3284z;

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, av.ao] */
    /* JADX WARN: Type inference failed for: r10v1, types: [J2.l, java.lang.Object] */
    public s(Context context, androidx.camera.camera2.internal.compat.q qVar, String str, u uVar, Be.e eVar, androidx.camera.core.impl.ab abVar, Executor executor, Handler handler, ak akVar, long j5) {
        w.o oVar = new w.o(21);
        this.teal = oVar;
        this.f3263d = 0;
        new AtomicInteger(0);
        this.f3264f = new LinkedHashMap();
        this.f3265g = 0;
        this.f3271m = false;
        this.f3272n = false;
        this.f3273o = true;
        this.f3277s = new HashSet();
        this.f3278t = AbstractC0521t.alpha;
        this.f3279u = new Object();
        this.f3280v = false;
        this.f3284z = new J2.c(this);
        this.purple = qVar;
        this.f3267i = eVar;
        this.f3268j = abVar;
        ScheduledExecutorServiceC0750c scheduledExecutorServiceC0750c = new ScheduledExecutorServiceC0750c(handler);
        this.silver = scheduledExecutorServiceC0750c;
        bd.h hVar = new bd.h(executor);
        this.red = hVar;
        this.f3260a = new r(this, hVar, scheduledExecutorServiceC0750c, j5);
        this.alpha = new J2.c(str, 20);
        ((androidx.lifecycle.az) oVar.purple).postValue(new androidx.camera.core.impl.au(EnumC0524w.CLOSED));
        ?? obj = new Object();
        obj.alpha = abVar;
        androidx.lifecycle.au auVar = new androidx.lifecycle.au();
        obj.purple = auVar;
        auVar.postValue(new C0496c(5, null));
        this.white = obj;
        ?? obj2 = new Object();
        obj2.purple = new Object();
        obj2.red = new LinkedHashSet();
        obj2.silver = new LinkedHashSet();
        obj2.teal = new LinkedHashSet();
        obj2.white = new ac((ao) obj2);
        obj2.alpha = hVar;
        this.f3275q = obj2;
        this.f3281w = akVar;
        try {
            androidx.camera.camera2.internal.compat.j bravo = qVar.bravo(str);
            h hVar2 = new h(bravo, scheduledExecutorServiceC0750c, hVar, new androidx.core.widget.f(2, this), uVar.hotel);
            this.yellow = hVar2;
            this.f3261b = uVar;
            uVar.kilo(hVar2);
            uVar.foxtrot.charlie((androidx.lifecycle.az) obj.purple);
            this.f3282x = androidx.core.widget.f.azure(bravo);
            this.e = amber();
            this.f3276r = new ao(hVar, scheduledExecutorServiceC0750c, handler, obj2, uVar.hotel, ax.b.alpha);
            this.f3269k = uVar.hotel.alpha(LegacyCameraOutputConfigNullPointerQuirk.class);
            this.f3270l = uVar.hotel.alpha(LegacyCameraSurfaceCleanupQuirk.class);
            o oVar2 = new o(this, str);
            this.f3266h = oVar2;
            O7.l lVar = new O7.l(29, this);
            synchronized (abVar.bravo) {
                T7.golf("Camera is already registered: " + this, !abVar.echo.containsKey(this));
                abVar.echo.put(this, new androidx.camera.core.impl.aa(hVar, lVar, oVar2));
            }
            qVar.alpha.I(hVar, oVar2);
            this.f3283y = new ar(context, str, qVar, new g8.d(15));
        } catch (CameraAccessExceptionCompat e) {
            throw N3.bravo(e);
        }
    }

    public static String whiskey(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return "UNKNOWN ERROR";
                            }
                            return "ERROR_CAMERA_SERVICE";
                        }
                        return "ERROR_CAMERA_DEVICE";
                    }
                    return "ERROR_CAMERA_DISABLED";
                }
                return "ERROR_MAX_CAMERAS_IN_USE";
            }
            return "ERROR_CAMERA_IN_USE";
        }
        return "ERROR_NONE";
    }

    public static String xray(ao aoVar) {
        StringBuilder sb2 = new StringBuilder("MeteringRepeating");
        aoVar.getClass();
        sb2.append(aoVar.hashCode());
        return sb2.toString();
    }

    public static String yankee(O o5) {
        return o5.foxtrot() + o5.hashCode();
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x, androidx.camera.core.InterfaceC0528j
    public final InterfaceC0523v alpha() {
        return oscar();
    }

    public final aj amber() {
        aj ajVar;
        synchronized (this.f3279u) {
            ajVar = new aj(this.f3282x, this.f3261b.hotel, false);
        }
        return ajVar;
    }

    public final void azure(boolean z2) {
        if (!z2) {
            this.f3260a.echo.bravo = -1L;
        }
        this.f3260a.alpha();
        this.f3284z.juliet();
        uniform("Opening camera.", null);
        coral(8);
        try {
            this.purple.alpha.G(this.f3261b.alpha, this.red, tango());
        } catch (CameraAccessExceptionCompat e) {
            uniform("Unable to open camera due to " + e.getMessage(), null);
            if (e.getReason() != 10001) {
                J2.c cVar = this.f3284z;
                if (((s) cVar.red).A != 8) {
                    ((s) cVar.red).uniform("Don't need the onError timeout handler.", null);
                    return;
                }
                ((s) cVar.red).uniform("Camera waiting for onError.", null);
                cVar.juliet();
                cVar.purple = new C1915c(cVar);
                return;
            }
            bronze(3, new C0497d(7, e), true);
        } catch (SecurityException e4) {
            uniform("Unable to open camera due to " + e4.getMessage(), null);
            coral(7);
            this.f3260a.bravo();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void beige() {
        boolean z2;
        boolean z10 = false;
        if (this.A == 9) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf(null, z2);
        androidx.camera.core.impl.O papa = this.alpha.papa();
        if (papa.kilo && papa.juliet) {
            if (!this.f3268j.echo(this.f3262c.getId(), this.f3267i.hotel(this.f3262c.getId()))) {
                uniform("Unable to create capture session in camera operating mode = " + this.f3267i.alpha, null);
                return;
            }
            HashMap hashMap = new HashMap();
            Collection<P> quebec = this.alpha.quebec();
            Collection romeo = this.alpha.romeo();
            C0505c c0505c = aq.alpha;
            ArrayList arrayList = new ArrayList(romeo);
            Iterator it = quebec.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                P p4 = (P) it.next();
                androidx.camera.core.impl.B b2 = p4.golf.bravo;
                C0505c c0505c2 = aq.alpha;
                if (b2.alpha.containsKey(c0505c2) && p4.bravo().size() != 1) {
                    AbstractC3066u3.charlie("StreamUseCaseUtil", String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Integer.valueOf(p4.bravo().size())));
                    break;
                }
                if (p4.golf.bravo.alpha.containsKey(c0505c2)) {
                    int i4 = 0;
                    for (P p5 : quebec) {
                        if (((Z) arrayList.get(i4)).emerald() == b0.white) {
                            T7.golf("MeteringRepeating should contain a surface", !p5.bravo().isEmpty());
                            hashMap.put((androidx.camera.core.impl.ah) p5.bravo().get(0), 1L);
                        } else if (p5.golf.bravo.alpha.containsKey(c0505c2) && !p5.bravo().isEmpty()) {
                            hashMap.put((androidx.camera.core.impl.ah) p5.bravo().get(0), (Long) p5.golf.bravo.quebec(c0505c2));
                        }
                        i4++;
                    }
                }
            }
            aj ajVar = this.e;
            synchronized (ajVar.alpha) {
                ajVar.lima = hashMap;
            }
            aj ajVar2 = this.e;
            P bravo = papa.bravo();
            CameraDevice cameraDevice = this.f3262c;
            cameraDevice.getClass();
            ao aoVar = this.f3276r;
            com.google.common.util.concurrent.e mike = ajVar2.mike(bravo, cameraDevice, new aw((Q3.c) aoVar.teal, (Q3.c) aoVar.white, (ao) aoVar.silver, (bd.h) aoVar.alpha, (ScheduledExecutorServiceC0750c) aoVar.purple, (Handler) aoVar.red));
            mike.foxtrot(new be.g(null == true ? 1 : 0, mike, new w.o(23, this, ajVar2, z10)), this.red);
            return;
        }
        uniform("Unable to create capture session due to conflicting configurations", null);
    }

    public final void black() {
        if (this.f3274p != null) {
            StringBuilder sb2 = new StringBuilder("MeteringRepeating");
            this.f3274p.getClass();
            sb2.append(this.f3274p.hashCode());
            String sb3 = sb2.toString();
            J2.c cVar = this.alpha;
            LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.red;
            if (linkedHashMap.containsKey(sb3)) {
                X x4 = (X) linkedHashMap.get(sb3);
                x4.echo = false;
                if (!x4.foxtrot) {
                    linkedHashMap.remove(sb3);
                }
            }
            StringBuilder sb4 = new StringBuilder("MeteringRepeating");
            this.f3274p.getClass();
            sb4.append(this.f3274p.hashCode());
            String sb5 = sb4.toString();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.red;
            if (linkedHashMap2.containsKey(sb5)) {
                X x5 = (X) linkedHashMap2.get(sb5);
                x5.foxtrot = false;
                if (!x5.echo) {
                    linkedHashMap2.remove(sb5);
                }
            }
            ao aoVar = this.f3274p;
            aoVar.getClass();
            AbstractC3066u3.bravo("MeteringRepeating", "MeteringRepeating clear!");
            J j5 = (J) aoVar.alpha;
            if (j5 != null) {
                j5.alpha();
            }
            aoVar.alpha = null;
            this.f3274p = null;
        }
    }

    public final void blue() {
        boolean z2;
        P p4;
        if (this.e != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf(null, z2);
        uniform("Resetting Capture Session", null);
        aj ajVar = this.e;
        synchronized (ajVar.alpha) {
            p4 = ajVar.foxtrot;
        }
        List echo = ajVar.echo();
        aj amber = amber();
        this.e = amber;
        amber.oscar(p4);
        this.e.kilo(echo);
        if (q.mike(this.A) != 8) {
            uniform("Skipping Capture Session state check due to current camera state: " + q.november(this.A) + " and previous session status: " + ajVar.india(), null);
        } else if (this.f3269k && ajVar.india()) {
            uniform("Close camera before creating new session", null);
            coral(6);
        }
        if (this.f3270l && ajVar.india()) {
            uniform("ConfigAndClose is required when close the camera.", null);
            this.f3271m = true;
        }
        ajVar.alpha();
        com.google.common.util.concurrent.e november = ajVar.november();
        uniform("Releasing session in state ".concat(q.lima(this.A)), null);
        this.f3264f.put(ajVar, november);
        november.foxtrot(new be.g(0, november, new J2.l((Object) this, (Object) ajVar, false)), tg.k.bravo());
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final boolean bravo() {
        if (((u) alpha()).echo() == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x019b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void bronze(int i4, C0497d c0497d, boolean z2) {
        EnumC0524w enumC0524w;
        EnumC0524w enumC0524w2;
        androidx.camera.core.impl.aa aaVar;
        int i5;
        HashMap hashMap = null;
        uniform("Transitioning camera internal state: " + q.november(this.A) + " --> " + q.november(i4), null);
        boolean z10 = false;
        if (P2.delta()) {
            P2.echo(q.mike(i4), "CX:C2State[" + this + Constants.AES_SUFFIX);
            if (c0497d != null) {
                this.f3265g++;
            }
            if (this.f3265g > 0) {
                String str = "CX:C2StateErrorCode[" + this + Constants.AES_SUFFIX;
                if (c0497d != null) {
                    i5 = c0497d.alpha;
                } else {
                    i5 = 0;
                }
                P2.echo(i5, str);
            }
        }
        this.A = i4;
        switch (q.mike(i4)) {
            case 0:
                enumC0524w = EnumC0524w.RELEASED;
                break;
            case 1:
                enumC0524w = EnumC0524w.RELEASING;
                break;
            case 2:
                enumC0524w = EnumC0524w.CLOSED;
                break;
            case 3:
                enumC0524w = EnumC0524w.PENDING_OPEN;
                break;
            case 4:
            case 5:
                enumC0524w = EnumC0524w.CLOSING;
                break;
            case 6:
            case 7:
                enumC0524w = EnumC0524w.OPENING;
                break;
            case 8:
                enumC0524w = EnumC0524w.OPEN;
                break;
            case 9:
                enumC0524w = EnumC0524w.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: ".concat(q.november(i4)));
        }
        androidx.camera.core.impl.ab abVar = this.f3268j;
        synchronized (abVar.bravo) {
            try {
                int i10 = abVar.foxtrot;
                if (enumC0524w == EnumC0524w.RELEASED) {
                    androidx.camera.core.impl.aa aaVar2 = (androidx.camera.core.impl.aa) abVar.echo.remove(this);
                    if (aaVar2 != null) {
                        abVar.bravo();
                        enumC0524w2 = aaVar2.alpha;
                    } else {
                        enumC0524w2 = null;
                    }
                } else {
                    androidx.camera.core.impl.aa aaVar3 = (androidx.camera.core.impl.aa) abVar.echo.get(this);
                    T7.foxtrot(aaVar3, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    EnumC0524w enumC0524w3 = aaVar3.alpha;
                    aaVar3.alpha = enumC0524w;
                    EnumC0524w enumC0524w4 = EnumC0524w.OPENING;
                    if (enumC0524w == enumC0524w4) {
                        if (enumC0524w.alpha || enumC0524w3 == enumC0524w4) {
                            z10 = true;
                        }
                        T7.golf("Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()", z10);
                    }
                    if (enumC0524w3 != enumC0524w) {
                        androidx.camera.core.impl.ab.charlie(this, enumC0524w);
                        abVar.bravo();
                    }
                    enumC0524w2 = enumC0524w3;
                }
                if (enumC0524w2 != enumC0524w) {
                    if (abVar.delta.alpha == 2 && enumC0524w == EnumC0524w.CONFIGURED) {
                        String hotel = abVar.delta.hotel(oscar().bravo());
                        if (hotel != null) {
                            aaVar = abVar.alpha(hotel);
                            if (i10 >= 1 && abVar.foxtrot > 0) {
                                hashMap = new HashMap();
                                for (Map.Entry entry : abVar.echo.entrySet()) {
                                    if (((androidx.camera.core.impl.aa) entry.getValue()).alpha == EnumC0524w.PENDING_OPEN) {
                                        hashMap.put((InterfaceC0528j) entry.getKey(), (androidx.camera.core.impl.aa) entry.getValue());
                                    }
                                }
                            } else if (enumC0524w == EnumC0524w.PENDING_OPEN && abVar.foxtrot > 0) {
                                hashMap = new HashMap();
                                hashMap.put(this, (androidx.camera.core.impl.aa) abVar.echo.get(this));
                            }
                            if (hashMap != null && !z2) {
                                hashMap.remove(this);
                            }
                            if (hashMap != null) {
                                for (androidx.camera.core.impl.aa aaVar4 : hashMap.values()) {
                                    aaVar4.getClass();
                                    try {
                                        aaVar4.bravo.execute(new A2.q(28, aaVar4.delta));
                                    } catch (RejectedExecutionException e) {
                                        AbstractC3066u3.delta("CameraStateRegistry", "Unable to notify camera to open.", e);
                                    }
                                }
                            }
                            if (aaVar != null) {
                                try {
                                    aaVar.bravo.execute(new A2.q(29, aaVar.charlie));
                                } catch (RejectedExecutionException e4) {
                                    AbstractC3066u3.delta("CameraStateRegistry", "Unable to notify camera to configure.", e4);
                                }
                            }
                        }
                    }
                    aaVar = null;
                    if (i10 >= 1) {
                    }
                    if (enumC0524w == EnumC0524w.PENDING_OPEN) {
                        hashMap = new HashMap();
                        hashMap.put(this, (androidx.camera.core.impl.aa) abVar.echo.get(this));
                    }
                    if (hashMap != null) {
                        hashMap.remove(this);
                    }
                    if (hashMap != null) {
                    }
                    if (aaVar != null) {
                    }
                }
            } finally {
            }
        }
        ((androidx.lifecycle.az) this.teal.purple).postValue(new androidx.camera.core.impl.au(enumC0524w));
        this.white.romeo(enumC0524w, c0497d);
    }

    @Override // androidx.camera.core.N
    public final void charlie(O o5) {
        P p4;
        ArrayList bronze;
        String yankee = yankee(o5);
        if (this.f3273o) {
            p4 = o5.mike;
        } else {
            p4 = o5.november;
        }
        P p5 = p4;
        Z z2 = o5.foxtrot;
        C0509g c0509g = o5.golf;
        if (o5.bravo() == null) {
            bronze = null;
        } else {
            bronze = bn.c.bronze(o5);
        }
        this.red.execute(new n(this, yankee, p5, z2, c0509g, bronze, 1));
    }

    public final void coral(int i4) {
        bronze(i4, null, true);
    }

    public final ArrayList crimson(ArrayList arrayList) {
        P p4;
        Size size;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            O o5 = (O) it.next();
            boolean z2 = this.f3273o;
            String yankee = yankee(o5);
            Class<?> cls = o5.getClass();
            if (z2) {
                p4 = o5.mike;
            } else {
                p4 = o5.november;
            }
            P p5 = p4;
            Z z10 = o5.foxtrot;
            C0509g c0509g = o5.golf;
            ArrayList arrayList3 = null;
            if (c0509g != null) {
                size = c0509g.alpha;
            } else {
                size = null;
            }
            if (o5.bravo() != null) {
                arrayList3 = bn.c.bronze(o5);
            }
            arrayList2.add(new C0682b(yankee, cls, p5, z10, size, c0509g, arrayList3));
        }
        return arrayList2;
    }

    public final void cyan(ArrayList arrayList) {
        boolean z2;
        Size size;
        boolean isEmpty = this.alpha.quebec().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            z2 = true;
            if (!it.hasNext()) {
                break;
            }
            C0682b c0682b = (C0682b) it.next();
            if (!this.alpha.whiskey(c0682b.alpha)) {
                J2.c cVar = this.alpha;
                String str = c0682b.alpha;
                P p4 = c0682b.charlie;
                Z z10 = c0682b.delta;
                C0509g c0509g = c0682b.foxtrot;
                ArrayList arrayList3 = c0682b.golf;
                LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.red;
                X x4 = (X) linkedHashMap.get(str);
                if (x4 == null) {
                    x4 = new X(p4, z10, c0509g, arrayList3);
                    linkedHashMap.put(str, x4);
                }
                x4.echo = true;
                cVar.blue(str, p4, z10, c0509g, arrayList3);
                arrayList2.add(c0682b.alpha);
                if (c0682b.bravo == androidx.camera.core.az.class && (size = c0682b.echo) != null) {
                    rational = new Rational(size.getWidth(), size.getHeight());
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            uniform("Use cases [" + TextUtils.join(", ", arrayList2) + "] now ATTACHED", null);
            if (isEmpty) {
                this.yellow.hotel(true);
                h hVar = this.yellow;
                synchronized (hVar.red) {
                    hVar.f3251h++;
                }
            }
            quebec();
            gray();
            gold();
            blue();
            if (this.A == 9) {
                beige();
            } else {
                int mike = q.mike(this.A);
                if (mike != 2 && mike != 3) {
                    if (mike != 4) {
                        uniform("open() ignored due to being in state: ".concat(q.november(this.A)), null);
                    } else {
                        coral(7);
                        if (!this.f3264f.isEmpty() && !this.f3272n && this.f3263d == 0) {
                            if (this.f3262c == null) {
                                z2 = false;
                            }
                            T7.golf("Camera Device should be open if session close is not complete", z2);
                            coral(9);
                            beige();
                        }
                    }
                } else {
                    emerald(false);
                }
            }
            if (rational != null) {
                this.yellow.yellow.getClass();
            }
        }
    }

    @Override // androidx.camera.core.N
    public final void delta(O o5) {
        P p4;
        ArrayList bronze;
        o5.getClass();
        if (this.f3273o) {
            p4 = o5.mike;
        } else {
            p4 = o5.november;
        }
        P p5 = p4;
        Z z2 = o5.foxtrot;
        C0509g c0509g = o5.golf;
        if (o5.bravo() == null) {
            bronze = null;
        } else {
            bronze = bn.c.bronze(o5);
        }
        this.red.execute(new k(this, yankee(o5), p5, z2, c0509g, bronze, 0));
    }

    @Override // androidx.camera.core.N
    public final void echo(O o5) {
        P p4;
        ArrayList bronze;
        String yankee = yankee(o5);
        if (this.f3273o) {
            p4 = o5.mike;
        } else {
            p4 = o5.november;
        }
        P p5 = p4;
        Z z2 = o5.foxtrot;
        C0509g c0509g = o5.golf;
        if (o5.bravo() == null) {
            bronze = null;
        } else {
            bronze = bn.c.bronze(o5);
        }
        this.red.execute(new n(this, yankee, p5, z2, c0509g, bronze, 0));
    }

    public final void emerald(boolean z2) {
        uniform("Attempting to force open the camera.", null);
        if (!this.f3268j.delta(this)) {
            uniform("No cameras available. Waiting for available camera before opening camera.", null);
            coral(4);
        } else {
            azure(z2);
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final androidx.camera.core.impl.A foxtrot() {
        return this.teal;
    }

    public final void fuchsia(boolean z2) {
        uniform("Attempting to open the camera.", null);
        if (this.f3266h.bravo && this.f3268j.delta(this)) {
            azure(z2);
        } else {
            uniform("No cameras available. Waiting for available camera before opening camera.", null);
            coral(4);
        }
    }

    public final void gold() {
        boolean z2;
        J2.c cVar = this.alpha;
        cVar.getClass();
        androidx.camera.core.impl.O o5 = new androidx.camera.core.impl.O();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) cVar.red).entrySet()) {
            X x4 = (X) entry.getValue();
            if (x4.foxtrot && x4.echo) {
                String str = (String) entry.getKey();
                o5.alpha(x4.alpha);
                arrayList.add(str);
            }
        }
        AbstractC3066u3.bravo("UseCaseAttachState", "Active and attached use case: " + arrayList + " for camera: " + ((String) cVar.purple));
        if (o5.kilo && o5.juliet) {
            z2 = true;
        } else {
            z2 = false;
        }
        h hVar = this.yellow;
        if (z2) {
            int i4 = o5.bravo().golf.charlie;
            hVar.f3257n = i4;
            hVar.yellow.charlie = i4;
            hVar.f3249f.getClass();
            o5.alpha(hVar.delta());
            this.e.oscar(o5.bravo());
            return;
        }
        hVar.f3257n = 1;
        hVar.yellow.charlie = 1;
        hVar.f3249f.getClass();
        this.e.oscar(hVar.delta());
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final InterfaceC0522u golf() {
        return this.yellow;
    }

    public final void gray() {
        Iterator it = this.alpha.romeo().iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= ((Z) it.next()).orange();
        }
        this.yellow.f3248d.charlie = z2;
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final androidx.camera.core.impl.r hotel() {
        return this.f3278t;
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final void india(boolean z2) {
        this.red.execute(new l(this, z2, 0));
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final void juliet(O7.l lVar) {
        if (lVar == null) {
            lVar = AbstractC0521t.alpha;
        }
        lVar.e();
        this.f3278t = lVar;
        synchronized (this.f3279u) {
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final void kilo(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (arrayList2.isEmpty()) {
            return;
        }
        ArrayList arrayList3 = new ArrayList(crimson(arrayList2));
        Iterator it = new ArrayList(arrayList2).iterator();
        while (it.hasNext()) {
            O o5 = (O) it.next();
            String yankee = yankee(o5);
            HashSet hashSet = this.f3277s;
            if (hashSet.contains(yankee)) {
                o5.tango();
                hashSet.remove(yankee);
            }
        }
        this.red.execute(new j(this, arrayList3, 0));
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final void lima(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(arrayList);
        if (!arrayList2.isEmpty()) {
            h hVar = this.yellow;
            synchronized (hVar.red) {
                hVar.f3251h++;
            }
            Iterator it = new ArrayList(arrayList2).iterator();
            while (it.hasNext()) {
                O o5 = (O) it.next();
                String yankee = yankee(o5);
                HashSet hashSet = this.f3277s;
                if (!hashSet.contains(yankee)) {
                    hashSet.add(yankee);
                    o5.sierra();
                    o5.quebec();
                }
            }
            try {
                this.red.execute(new j(this, new ArrayList(crimson(arrayList2)), 1));
            } catch (RejectedExecutionException e) {
                uniform("Unable to attach use cases.", e);
                hVar.bravo();
            }
        }
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final /* synthetic */ boolean mike() {
        return true;
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final void november(boolean z2) {
        this.f3273o = z2;
    }

    @Override // androidx.camera.core.impl.InterfaceC0525x
    public final InterfaceC0523v oscar() {
        return this.f3261b;
    }

    @Override // androidx.camera.core.N
    public final void papa(O o5) {
        this.red.execute(new RunnableC0643m(7, this, yankee(o5)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0108, code lost:
    
        r4 = (android.util.Size) r6.get(r4);
     */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, av.ao] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void quebec() {
        List list;
        int i4;
        Size size;
        J2.c cVar = this.alpha;
        P bravo = cVar.papa().bravo();
        androidx.camera.core.impl.ad adVar = bravo.golf;
        int size2 = Collections.unmodifiableList(adVar.alpha).size();
        int size3 = bravo.bravo().size();
        if (!bravo.bravo().isEmpty()) {
            if (Collections.unmodifiableList(adVar.alpha).isEmpty()) {
                if (this.f3274p == null) {
                    androidx.camera.camera2.internal.compat.j jVar = this.f3261b.bravo;
                    m mVar = new m(this, 1);
                    ak akVar = this.f3281w;
                    ?? obj = new Object();
                    ay.b bVar = new ay.b();
                    Size size4 = null;
                    obj.white = null;
                    obj.red = new an();
                    obj.teal = mVar;
                    Size[] november = jVar.bravo().november(34);
                    int i5 = 0;
                    if (november == null) {
                        AbstractC3066u3.charlie("MeteringRepeating", "Can not get output size list.");
                        size = new Size(0, 0);
                    } else {
                        if (bVar.alpha != null && "Huawei".equalsIgnoreCase(Build.BRAND) && "mha-l29".equalsIgnoreCase(Build.MODEL)) {
                            ArrayList arrayList = new ArrayList();
                            for (Size size5 : november) {
                                if (ay.b.charlie.compare(size5, ay.b.bravo) >= 0) {
                                    arrayList.add(size5);
                                }
                            }
                            november = (Size[]) arrayList.toArray(new Size[0]);
                        }
                        List asList = Arrays.asList(november);
                        Collections.sort(asList, new E0.k(9));
                        Size echo = akVar.echo();
                        long min = Math.min(echo.getWidth() * echo.getHeight(), 307200L);
                        int length = november.length;
                        int i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                Size size6 = november[i10];
                                List list2 = asList;
                                long j5 = min;
                                long width = size6.getWidth() * size6.getHeight();
                                if (width == j5) {
                                    size = size6;
                                    break;
                                }
                                if (width > j5) {
                                    if (size4 != null) {
                                        size = size4;
                                    } else {
                                        list = list2;
                                        i4 = 0;
                                    }
                                } else {
                                    i10++;
                                    size4 = size6;
                                    asList = list2;
                                    min = j5;
                                    i5 = 0;
                                }
                            } else {
                                list = asList;
                                i4 = i5;
                                break;
                            }
                        }
                    }
                    obj.silver = size;
                    AbstractC3066u3.bravo("MeteringRepeating", "MeteringSession SurfaceTexture size: " + size);
                    obj.purple = obj.papa();
                    this.f3274p = obj;
                }
                if (zulu()) {
                    ao aoVar = this.f3274p;
                    if (aoVar != null) {
                        String xray = xray(aoVar);
                        ao aoVar2 = this.f3274p;
                        P p4 = (P) aoVar2.purple;
                        b0 b0Var = b0.white;
                        List singletonList = Collections.singletonList(b0Var);
                        LinkedHashMap linkedHashMap = (LinkedHashMap) cVar.red;
                        X x4 = (X) linkedHashMap.get(xray);
                        an anVar = (an) aoVar2.red;
                        if (x4 == null) {
                            x4 = new X(p4, anVar, null, singletonList);
                            linkedHashMap.put(xray, x4);
                        }
                        x4.echo = true;
                        cVar.blue(xray, p4, anVar, null, singletonList);
                        ao aoVar3 = this.f3274p;
                        P p5 = (P) aoVar3.purple;
                        List singletonList2 = Collections.singletonList(b0Var);
                        LinkedHashMap linkedHashMap2 = (LinkedHashMap) cVar.red;
                        X x5 = (X) linkedHashMap2.get(xray);
                        if (x5 == null) {
                            x5 = new X(p5, (an) aoVar3.red, null, singletonList2);
                            linkedHashMap2.put(xray, x5);
                        }
                        x5.foxtrot = true;
                        return;
                    }
                    return;
                }
                AbstractC3066u3.charlie("Camera2CameraImpl", "Failed to add a repeating surface, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
                return;
            }
            if (size3 == 1 && size2 == 1) {
                black();
                return;
            }
            if (size2 >= 2) {
                black();
                return;
            }
            if (this.f3274p != null && !zulu()) {
                black();
                return;
            }
            AbstractC3066u3.bravo("Camera2CameraImpl", "No need to remove a previous mMeteringRepeating, SessionConfig Surfaces: " + size3 + ", CaptureConfig Surfaces: " + size2);
        }
    }

    public final void romeo() {
        boolean z2;
        ArrayList<androidx.camera.core.impl.ad> arrayList;
        int intValue;
        if (this.A != 5 && this.A != 2 && (this.A != 7 || this.f3263d == 0)) {
            z2 = false;
        } else {
            z2 = true;
        }
        T7.golf("closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + q.november(this.A) + " (error: " + whiskey(this.f3263d) + ")", z2);
        blue();
        aj ajVar = this.e;
        synchronized (ajVar.alpha) {
            try {
                if (!ajVar.bravo.isEmpty()) {
                    arrayList = new ArrayList(ajVar.bravo);
                    ajVar.bravo.clear();
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (arrayList != null) {
            for (androidx.camera.core.impl.ad adVar : arrayList) {
                for (AbstractC0512j abstractC0512j : adVar.delta) {
                    Object obj = adVar.foxtrot.alpha.get("CAPTURE_CONFIG_ID_KEY");
                    if (obj == null) {
                        intValue = -1;
                    } else {
                        intValue = ((Integer) obj).intValue();
                    }
                    abstractC0512j.alpha(intValue);
                }
            }
        }
    }

    public final void sierra() {
        boolean z2;
        if (this.A != 2 && this.A != 5) {
            z2 = false;
        } else {
            z2 = true;
        }
        T7.golf(null, z2);
        T7.golf(null, this.f3264f.isEmpty());
        if (!this.f3271m) {
            victor();
            return;
        }
        if (this.f3272n) {
            uniform("Ignored since configAndClose is processing", null);
            return;
        }
        if (!this.f3266h.bravo) {
            this.f3271m = false;
            victor();
            uniform("Ignore configAndClose and finish the close flow directly since camera is unavailable.", null);
        } else {
            uniform("Open camera to configAndClose", null);
            V0.k alpha = AbstractC3003i.alpha(new m(this, 0));
            this.f3272n = true;
            alpha.purple.foxtrot(new androidx.camera.core.impl.ai(2, this), this.red);
        }
    }

    public final CameraDevice.StateCallback tango() {
        ArrayList arrayList = new ArrayList(this.alpha.papa().bravo().charlie);
        arrayList.add((ac) this.f3275q.white);
        arrayList.add(this.f3260a);
        return K3.alpha(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f3261b.alpha);
    }

    public final void uniform(String str, Throwable th) {
        String foxtrot = q.foxtrot("{", toString(), "} ", str);
        String hotel = AbstractC3066u3.hotel("Camera2CameraImpl");
        if (AbstractC3066u3.foxtrot(3, hotel)) {
            Log.d(hotel, foxtrot, th);
        }
    }

    public final void victor() {
        boolean z2;
        if (this.A != 2 && this.A != 5) {
            z2 = false;
        } else {
            z2 = true;
        }
        T7.golf(null, z2);
        T7.golf(null, this.f3264f.isEmpty());
        this.f3262c = null;
        if (this.A == 5) {
            coral(3);
            return;
        }
        this.purple.alpha.M(this.f3266h);
        coral(1);
    }

    public final boolean zulu() {
        int i4;
        ArrayList arrayList = new ArrayList();
        synchronized (this.f3279u) {
            try {
                if (this.f3267i.alpha == 2) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
            } finally {
            }
        }
        J2.c cVar = this.alpha;
        cVar.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : ((LinkedHashMap) cVar.red).entrySet()) {
            if (((X) entry.getValue()).echo) {
                arrayList2.add((X) entry.getValue());
            }
        }
        for (X x4 : Collections.unmodifiableCollection(arrayList2)) {
            List list = x4.delta;
            if (list == null || list.get(0) != b0.white) {
                if (x4.charlie != null && x4.delta != null) {
                    P p4 = x4.alpha;
                    Z z2 = x4.bravo;
                    for (androidx.camera.core.impl.ah ahVar : p4.bravo()) {
                        ar arVar = this.f3283y;
                        int oscar = z2.oscar();
                        C0510h bravo = C0510h.bravo(i4, oscar, ahVar.hotel, arVar.india(oscar));
                        int oscar2 = z2.oscar();
                        Size size = ahVar.hotel;
                        C0509g c0509g = x4.charlie;
                        arrayList.add(new C0503a(bravo, oscar2, size, c0509g.bravo, x4.delta, c0509g.delta, z2.november()));
                    }
                } else {
                    AbstractC3066u3.india("Camera2CameraImpl", "Invalid stream spec or capture types in " + x4);
                    return false;
                }
            }
        }
        this.f3274p.getClass();
        HashMap hashMap = new HashMap();
        ao aoVar = this.f3274p;
        hashMap.put((an) aoVar.red, Collections.singletonList((Size) aoVar.silver));
        try {
            this.f3283y.golf(i4, arrayList, hashMap, false, false);
            uniform("Surface combination with metering repeating supported!", null);
            return true;
        } catch (IllegalArgumentException e) {
            uniform("Surface combination with metering repeating  not supported!", e);
            return false;
        }
    }
}
