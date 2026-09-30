package s0;

import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import q0.AbstractC2367C;
import q0.C2396o;
import t0.C2946x;

/* loaded from: classes3.dex */
public final class ay extends AbstractC2367C implements q0.ao, InterfaceC2542b, G {

    /* renamed from: d, reason: collision with root package name */
    public boolean f13324d;
    public boolean e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13325f;

    /* renamed from: g, reason: collision with root package name */
    public Q0.a f13326g;

    /* renamed from: i, reason: collision with root package name */
    public Function1 f13328i;

    /* renamed from: n, reason: collision with root package name */
    public boolean f13333n;

    /* renamed from: p, reason: collision with root package name */
    public Object f13335p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f13336q;
    public final ap white;
    public boolean yellow;

    /* renamed from: a, reason: collision with root package name */
    public int f13321a = LottieConstants.IterateForever;

    /* renamed from: b, reason: collision with root package name */
    public int f13322b = LottieConstants.IterateForever;

    /* renamed from: c, reason: collision with root package name */
    public ai f13323c = ai.red;

    /* renamed from: h, reason: collision with root package name */
    public long f13327h = 0;

    /* renamed from: j, reason: collision with root package name */
    public av f13329j = av.red;

    /* renamed from: k, reason: collision with root package name */
    public final am f13330k = new am(this, 1);

    /* renamed from: l, reason: collision with root package name */
    public final J.e f13331l = new J.e(new ay[16]);

    /* renamed from: m, reason: collision with root package name */
    public boolean f13332m = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13334o = true;

    public ay(ap apVar) {
        this.white = apVar;
        this.f13335p = apVar.papa.f13225k;
    }

    public final void b(boolean z2) {
        ap apVar = this.white;
        if (!z2 || !apVar.charlie) {
            if (z2 || apVar.charlie) {
                this.f13329j = av.red;
                J.e zulu = apVar.alpha.zulu();
                Object[] objArr = zulu.alpha;
                int i4 = zulu.red;
                for (int i5 = 0; i5 < i4; i5++) {
                    ay ayVar = ((al) objArr[i5]).f13306y.quebec;
                    Intrinsics.checkNotNull(ayVar);
                    ayVar.b(true);
                }
            }
        }
    }

    @Override // s0.G
    public final void black(boolean z2) {
        Boolean bool;
        au y10;
        ap apVar = this.white;
        au y11 = apVar.alpha().y();
        if (y11 != null) {
            bool = Boolean.valueOf(y11.f13310b);
        } else {
            bool = null;
        }
        if (!Intrinsics.areEqual(Boolean.valueOf(z2), bool) && (y10 = apVar.alpha().y()) != null) {
            y10.f13310b = z2;
        }
    }

    @Override // s0.InterfaceC2542b
    public final void bronze() {
        Q0.a aVar;
        this.f13333n = true;
        am amVar = this.f13330k;
        amVar.hotel();
        ap apVar = this.white;
        boolean z2 = apVar.foxtrot;
        al alVar = apVar.alpha;
        if (z2) {
            J.e zulu = alVar.zulu();
            Object[] objArr = zulu.alpha;
            int i4 = zulu.red;
            for (int i5 = 0; i5 < i4; i5++) {
                al alVar2 = (al) objArr[i5];
                if (alVar2.f13306y.echo && alVar2.tango() == ai.alpha) {
                    ap apVar2 = alVar2.f13306y;
                    ay ayVar = apVar2.quebec;
                    Intrinsics.checkNotNull(ayVar);
                    ay ayVar2 = apVar2.quebec;
                    if (ayVar2 != null) {
                        aVar = ayVar2.f13326g;
                    } else {
                        aVar = null;
                    }
                    Intrinsics.checkNotNull(aVar);
                    if (ayVar.h(aVar.alpha)) {
                        al.navy(alVar, false, 7);
                    }
                }
            }
        }
        C2562w c2562w = golf().f13352L;
        Intrinsics.checkNotNull(c2562w);
        if (apVar.golf || (!this.f13324d && !c2562w.f13312d && apVar.foxtrot)) {
            apVar.foxtrot = false;
            ag agVar = apVar.delta;
            apVar.delta = ag.silver;
            W alpha = ao.alpha(alVar);
            apVar.india(false);
            Y snapshotObserver = ((C2946x) alpha).getSnapshotObserver();
            qa.j jVar = new qa.j(1, this, c2562w);
            snapshotObserver.getClass();
            if (alVar.yellow != null) {
                snapshotObserver.alpha(alVar, snapshotObserver.hotel, jVar);
            } else {
                snapshotObserver.alpha(alVar, snapshotObserver.echo, jVar);
            }
            apVar.delta = agVar;
            if (apVar.mike && c2562w.f13312d) {
                requestLayout();
            }
            apVar.golf = false;
        }
        if (amVar.delta) {
            amVar.echo = true;
        }
        if (amVar.bravo && amVar.echo()) {
            amVar.golf();
        }
        this.f13333n = false;
    }

    public final void c() {
        av avVar = this.f13329j;
        ap apVar = this.white;
        if (apVar.charlie) {
            this.f13329j = av.purple;
        } else {
            this.f13329j = av.alpha;
        }
        av avVar2 = av.alpha;
        al alVar = apVar.alpha;
        if (avVar != avVar2 && apVar.echo) {
            al.navy(alVar, true, 6);
        }
        J.e zulu = alVar.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            al alVar2 = (al) objArr[i5];
            ay ayVar = alVar2.f13306y.quebec;
            if (ayVar != null) {
                if (ayVar.f13322b != Integer.MAX_VALUE) {
                    ayVar.c();
                    al.orange(alVar2);
                }
            } else {
                throw new IllegalArgumentException("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
            }
        }
    }

    @Override // s0.InterfaceC2542b
    public final am charlie() {
        return this.f13330k;
    }

    @Override // s0.InterfaceC2542b
    public final boolean coral() {
        if (this.f13329j != av.red) {
            return true;
        }
        return false;
    }

    public final void d() {
        ap apVar = this.white;
        if (apVar.oscar > 0) {
            J.e zulu = apVar.alpha.zulu();
            Object[] objArr = zulu.alpha;
            int i4 = zulu.red;
            for (int i5 = 0; i5 < i4; i5++) {
                al alVar = (al) objArr[i5];
                ap apVar2 = alVar.f13306y;
                if ((apVar2.mike || apVar2.november) && !apVar2.foxtrot) {
                    alVar.maroon(false);
                }
                ay ayVar = apVar2.quebec;
                if (ayVar != null) {
                    ayVar.d();
                }
            }
        }
    }

    @Override // q0.InterfaceC2401t
    public final int delta(int i4) {
        e();
        au y10 = this.white.alpha().y();
        Intrinsics.checkNotNull(y10);
        return y10.delta(i4);
    }

    public final void e() {
        ai aiVar;
        ap apVar = this.white;
        al.navy(apVar.alpha, false, 7);
        al alVar = apVar.alpha;
        al victor = alVar.victor();
        if (victor != null && alVar.f13302u == ai.red) {
            int ordinal = victor.f13306y.delta.ordinal();
            if (ordinal != 0) {
                if (ordinal != 2) {
                    aiVar = victor.f13302u;
                } else {
                    aiVar = ai.purple;
                }
            } else {
                aiVar = ai.alpha;
            }
            alVar.f13302u = aiVar;
        }
    }

    public final void f() {
        ap apVar;
        ag agVar;
        this.f13336q = true;
        ap apVar2 = this.white;
        al victor = apVar2.alpha.victor();
        av avVar = this.f13329j;
        if ((avVar != av.alpha && !apVar2.charlie) || (avVar != av.purple && apVar2.charlie)) {
            c();
            if (this.yellow && victor != null) {
                victor.maroon(false);
            }
        }
        if (victor != null) {
            if (!this.yellow && ((agVar = (apVar = victor.f13306y).delta) == ag.red || agVar == ag.silver)) {
                if (this.f13322b != Integer.MAX_VALUE) {
                    AbstractC2264a.bravo("Place was called on a node which was placed already");
                }
                int i4 = apVar.hotel;
                this.f13322b = i4;
                apVar.hotel = i4 + 1;
            }
        } else {
            this.f13322b = 0;
        }
        bronze();
    }

    @Override // s0.InterfaceC2542b
    public final void fuchsia(Function1 function1) {
        J.e zulu = this.white.alpha.zulu();
        Object[] objArr = zulu.alpha;
        int i4 = zulu.red;
        for (int i5 = 0; i5 < i4; i5++) {
            ay ayVar = ((al) objArr[i5]).f13306y.quebec;
            Intrinsics.checkNotNull(ayVar);
            function1.invoke(ayVar);
        }
    }

    public final void g(long j5, Function1 function1) {
        ag agVar;
        ap apVar = this.white;
        al alVar = apVar.alpha;
        al alVar2 = apVar.alpha;
        try {
            al victor = alVar.victor();
            if (victor != null) {
                agVar = victor.f13306y.delta;
            } else {
                agVar = null;
            }
            ag agVar2 = ag.silver;
            if (agVar == agVar2) {
                apVar.charlie = false;
            }
            if (alVar2.f13282I) {
                AbstractC2264a.alpha("place is called on a deactivated node");
            }
            apVar.delta = agVar2;
            this.e = true;
            this.f13336q = false;
            if (!Q0.k.alpha(j5, this.f13327h)) {
                if (apVar.november || apVar.mike) {
                    apVar.foxtrot = true;
                }
                d();
            }
            W alpha = ao.alpha(alVar2);
            if (!apVar.foxtrot && coral()) {
                au y10 = apVar.alpha().y();
                Intrinsics.checkNotNull(y10);
                y10.r(Q0.k.charlie(j5, y10.teal));
                f();
            } else {
                apVar.hotel(false);
                this.f13330k.golf = false;
                Y snapshotObserver = ((C2946x) alpha).getSnapshotObserver();
                ax axVar = new ax(this, alpha, j5);
                snapshotObserver.getClass();
                if (alVar2.yellow != null) {
                    snapshotObserver.alpha(alVar2, snapshotObserver.golf, axVar);
                } else {
                    snapshotObserver.alpha(alVar2, snapshotObserver.foxtrot, axVar);
                }
            }
            this.f13327h = j5;
            this.f13328i = function1;
            apVar.delta = ag.teal;
        } catch (Throwable th) {
            alVar.pink(th);
            throw null;
        }
    }

    @Override // s0.InterfaceC2542b
    public final C2563x golf() {
        return (C2563x) this.white.alpha.f13305x.echo;
    }

    @Override // s0.InterfaceC2542b
    public final void green() {
        al.navy(this.white.alpha, false, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0067, B:30:0x0071, B:34:0x0082, B:35:0x0087, B:37:0x009d, B:42:0x006a), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0067 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0067, B:30:0x0071, B:34:0x0082, B:35:0x0087, B:37:0x009d, B:42:0x006a), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0082 A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0067, B:30:0x0071, B:34:0x0082, B:35:0x0087, B:37:0x009d, B:42:0x006a), top: B:2:0x0006 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006a A[Catch: all -> 0x0010, TryCatch #0 {all -> 0x0010, blocks: (B:3:0x0006, B:5:0x000a, B:6:0x0013, B:9:0x001f, B:13:0x0027, B:15:0x002f, B:20:0x003e, B:22:0x0042, B:23:0x0045, B:26:0x0035, B:27:0x0049, B:29:0x0067, B:30:0x0071, B:34:0x0082, B:35:0x0087, B:37:0x009d, B:42:0x006a), top: B:2:0x0006 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(long j5) {
        boolean z2;
        long j6;
        au y10;
        boolean z10;
        boolean bravo;
        ap apVar = this.white;
        al alVar = apVar.alpha;
        al alVar2 = apVar.alpha;
        try {
            if (alVar.f13282I) {
                AbstractC2264a.alpha("measure is called on a deactivated node");
            }
            al victor = alVar2.victor();
            if (!alVar2.f13304w && (victor == null || !victor.f13304w)) {
                z2 = false;
                alVar2.f13304w = z2;
                if (!alVar2.f13306y.echo) {
                    Q0.a aVar = this.f13326g;
                    if (aVar == null) {
                        bravo = false;
                    } else {
                        bravo = Q0.a.bravo(aVar.alpha, j5);
                    }
                    if (bravo) {
                        C2946x c2946x = alVar2.f13287f;
                        if (c2946x != null) {
                            c2946x.india(alVar2, true);
                        }
                        alVar2.peach();
                        return false;
                    }
                }
                this.f13326g = new Q0.a(j5);
                a(j5);
                this.f13330k.foxtrot = false;
                fuchsia(C2546f.yellow);
                if (!this.f13325f) {
                    j6 = this.red;
                } else {
                    long j7 = RecyclerView.UNDEFINED_DURATION;
                    j6 = (j7 & 4294967295L) | (j7 << 32);
                }
                this.f13325f = true;
                y10 = apVar.alpha().y();
                if (y10 == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    AbstractC2264a.bravo("Lookahead result from lookaheadRemeasure cannot be null");
                }
                apVar.charlie(j5);
                yellow((y10.purple & 4294967295L) | (y10.alpha << 32));
                if (((int) (j6 >> 32)) == y10.alpha || ((int) (j6 & 4294967295L)) != y10.purple) {
                    return true;
                }
                return false;
            }
            z2 = true;
            alVar2.f13304w = z2;
            if (!alVar2.f13306y.echo) {
            }
            this.f13326g = new Q0.a(j5);
            a(j5);
            this.f13330k.foxtrot = false;
            fuchsia(C2546f.yellow);
            if (!this.f13325f) {
            }
            this.f13325f = true;
            y10 = apVar.alpha().y();
            if (y10 == null) {
            }
            if (!z10) {
            }
            apVar.charlie(j5);
            yellow((y10.purple & 4294967295L) | (y10.alpha << 32));
            if (((int) (j6 >> 32)) == y10.alpha) {
            }
            return true;
        } catch (Throwable th) {
            alVar.pink(th);
            throw null;
        }
    }

    @Override // s0.InterfaceC2542b
    public final InterfaceC2542b hotel() {
        ap apVar;
        al victor = this.white.alpha.victor();
        if (victor != null && (apVar = victor.f13306y) != null) {
            return apVar.quebec;
        }
        return null;
    }

    @Override // q0.InterfaceC2401t
    public final int jade(int i4) {
        e();
        au y10 = this.white.alpha().y();
        Intrinsics.checkNotNull(y10);
        return y10.jade(i4);
    }

    @Override // q0.InterfaceC2401t
    public final int lima(int i4) {
        e();
        au y10 = this.white.alpha().y();
        Intrinsics.checkNotNull(y10);
        return y10.lima(i4);
    }

    @Override // q0.AbstractC2367C
    public final int magenta(C2396o c2396o) {
        ag agVar;
        ap apVar = this.white;
        al victor = apVar.alpha.victor();
        ag agVar2 = null;
        if (victor != null) {
            agVar = victor.f13306y.delta;
        } else {
            agVar = null;
        }
        ag agVar3 = ag.purple;
        am amVar = this.f13330k;
        if (agVar == agVar3) {
            amVar.charlie = true;
        } else {
            al victor2 = apVar.alpha.victor();
            if (victor2 != null) {
                agVar2 = victor2.f13306y.delta;
            }
            if (agVar2 == ag.silver) {
                amVar.delta = true;
            }
        }
        this.f13324d = true;
        au y10 = apVar.alpha().y();
        Intrinsics.checkNotNull(y10);
        int magenta = y10.magenta(c2396o);
        this.f13324d = false;
        return magenta;
    }

    @Override // q0.AbstractC2367C
    public final int maroon() {
        au y10 = this.white.alpha().y();
        Intrinsics.checkNotNull(y10);
        return y10.maroon();
    }

    @Override // q0.AbstractC2367C
    public final int navy() {
        au y10 = this.white.alpha().y();
        Intrinsics.checkNotNull(y10);
        return y10.navy();
    }

    @Override // s0.InterfaceC2542b
    public final void requestLayout() {
        al alVar = this.white.alpha;
        af afVar = al.f13273J;
        alVar.maroon(false);
    }

    @Override // q0.InterfaceC2401t
    public final int romeo(int i4) {
        e();
        au y10 = this.white.alpha().y();
        Intrinsics.checkNotNull(y10);
        return y10.romeo(i4);
    }

    @Override // q0.AbstractC2367C
    public final void silver(long j5, float f5, Function1 function1) {
        g(j5, function1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0023, code lost:
    
        if (r2 == s0.ag.silver) goto L13;
     */
    @Override // q0.ao
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final AbstractC2367C victor(long j5) {
        ag agVar;
        ai aiVar;
        ap apVar = this.white;
        al victor = apVar.alpha.victor();
        ag agVar2 = null;
        if (victor != null) {
            agVar = victor.f13306y.delta;
        } else {
            agVar = null;
        }
        if (agVar != ag.purple) {
            al victor2 = apVar.alpha.victor();
            if (victor2 != null) {
                agVar2 = victor2.f13306y.delta;
            }
        }
        apVar.bravo = false;
        al alVar = apVar.alpha;
        al victor3 = alVar.victor();
        if (victor3 != null) {
            if (this.f13323c != ai.red && !alVar.f13304w) {
                AbstractC2264a.bravo("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            ap apVar2 = victor3.f13306y;
            int ordinal = apVar2.delta.ordinal();
            if (ordinal != 0 && ordinal != 1) {
                if (ordinal != 2 && ordinal != 3) {
                    throw new IllegalStateException("Measurable could be only measured from the parent's measure or layout block. Parents state is " + apVar2.delta);
                }
                aiVar = ai.purple;
            } else {
                aiVar = ai.alpha;
            }
            this.f13323c = aiVar;
        } else {
            this.f13323c = ai.red;
        }
        al alVar2 = apVar.alpha;
        if (alVar2.f13302u == ai.red) {
            alVar2.echo();
        }
        h(j5);
        return this;
    }

    @Override // q0.AbstractC2367C, q0.InterfaceC2401t
    public final Object yankee() {
        return this.f13335p;
    }
}
