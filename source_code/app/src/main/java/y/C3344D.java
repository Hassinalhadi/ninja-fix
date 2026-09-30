package y;

import android.content.ClipData;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.C1290a1;
import g.AbstractC1719b;
import i0.InterfaceC1878a;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import n.e0;
import n.j0;
import n.k0;
import s0.AbstractC2557q;
import s1.C2576i;
import s6.J4;
import t.C2881g;
import t.C2882h;
import t0.C2896N;
import t0.C2916h;
import t0.InterfaceC2897O;
import t6.AbstractC3051r3;
import t6.AbstractC3066u3;
import u.AbstractC3134h;
import u.InterfaceC3133g;
import vf.Y;

/* renamed from: y.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3344D {
    public final j0 alpha;
    public final C1290a1 amber;
    public boolean azure;
    public n.ax delta;
    public Function0 golf;
    public InterfaceC2897O hotel;
    public vf.ab india;
    public C3379s juliet;
    public InterfaceC1878a kilo;
    public Y.s lima;
    public final androidx.compose.runtime.ax mike;
    public final androidx.compose.runtime.ax november;
    public long oscar;
    public D0.am papa;
    public long quebec;
    public final androidx.compose.runtime.ax romeo;
    public final androidx.compose.runtime.ax sierra;
    public int tango;
    public I0.aa uniform;
    public R3.s victor;
    public D0.am whiskey;
    public final androidx.compose.runtime.ax xray;
    public final C2576i yankee;
    public final ay zulu;
    public I0.t bravo = k0.alpha;
    public Function1 charlie = new ar(0);
    public final androidx.compose.runtime.ax echo = C0564b.zulu(new I0.aa(7, 0, (String) null));
    public I0.aj foxtrot = I0.ai.alpha;

    /* JADX WARN: Type inference failed for: r6v13, types: [java.lang.Object, s1.i] */
    public C3344D(j0 j0Var) {
        this.alpha = j0Var;
        Boolean bool = Boolean.TRUE;
        this.mike = C0564b.zulu(bool);
        this.november = C0564b.zulu(bool);
        this.oscar = 0L;
        this.quebec = 0L;
        this.romeo = C0564b.zulu(null);
        this.sierra = C0564b.zulu(null);
        this.tango = -1;
        this.uniform = new I0.aa(7, 0L, (String) null);
        this.xray = C0564b.zulu(null);
        this.yankee = new Object();
        this.zulu = new ay(this);
        this.amber = new C1290a1(this);
    }

    public static final void alpha(C3344D c3344d, D0.am amVar) {
        D0.g november;
        String str;
        vf.ab abVar;
        if (amVar == null) {
            c3344d.getClass();
            return;
        }
        C3379s c3379s = c3344d.juliet;
        if (c3379s != null && (november = c3344d.november()) != null && (str = november.purple) != null) {
            I0.t tVar = c3344d.bravo;
            long j5 = amVar.alpha;
            long bravo = D0.ae.bravo(tVar.originalToTransformed((int) (j5 >> 32)), tVar.originalToTransformed((int) (j5 & 4294967295L)));
            if (str.length() > 0 && !D0.am.charlie(bravo) && (abVar = c3344d.india) != null) {
                vf.ad.zulu(abVar, null, null, new az(c3379s, str, bravo, amVar, c3344d, tVar, null), 3);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(C3344D c3344d, Pd.c cVar) {
        C3341A c3341a;
        int i4;
        String str;
        D0.am amVar;
        C3379s c3379s;
        Object obj;
        if (cVar instanceof C3341A) {
            c3341a = (C3341A) cVar;
            int i5 = c3341a.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3341a.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = c3341a.alpha;
                Object obj3 = Od.a.alpha;
                i4 = c3341a.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    D0.g november = c3344d.november();
                    if (november != null && (str = november.purple) != null && (amVar = c3344d.whiskey) != null && (c3379s = c3344d.juliet) != null) {
                        I0.t tVar = c3344d.bravo;
                        long j5 = amVar.alpha;
                        long bravo = D0.ae.bravo(tVar.originalToTransformed((int) (j5 >> 32)), c3344d.bravo.originalToTransformed((int) (j5 & 4294967295L)));
                        c3341a.red = 1;
                        if (str.length() == 0 || D0.am.charlie(bravo)) {
                            obj = Unit.INSTANCE;
                        } else {
                            obj = vf.ad.blue(c3379s.alpha, new C3377q(c3379s, new C3374n(c3379s, str, bravo, null), null), c3341a);
                        }
                        if (obj == obj3) {
                            return obj3;
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        c3341a = new C3341A(c3344d, cVar);
        Object obj22 = c3341a.alpha;
        Object obj32 = Od.a.alpha;
        i4 = c3341a.red;
        if (i4 == 0) {
        }
        return Unit.INSTANCE;
    }

    public static final void charlie(C3344D c3344d, Z.b bVar) {
        ((t0) c3344d.sierra).setValue(bVar);
    }

    public static final void delta(C3344D c3344d, n.al alVar) {
        ((t0) c3344d.romeo).setValue(alVar);
    }

    public static final long echo(C3344D c3344d, I0.aa aaVar, long j5, boolean z2, boolean z10, InterfaceC3386z interfaceC3386z, boolean z11) {
        e0 delta;
        int i4;
        int i5;
        long j6;
        long j7;
        C3383w c3383w;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        InterfaceC1878a interfaceC1878a;
        n.ax axVar = c3344d.delta;
        if (axVar != null && (delta = axVar.delta()) != null) {
            I0.t tVar = c3344d.bravo;
            long j10 = aaVar.bravo;
            int i10 = D0.am.charlie;
            int originalToTransformed = tVar.originalToTransformed((int) (j10 >> 32));
            I0.t tVar2 = c3344d.bravo;
            long j11 = aaVar.bravo;
            long bravo = D0.ae.bravo(originalToTransformed, tVar2.originalToTransformed((int) (j11 & 4294967295L)));
            int bravo2 = delta.bravo(j5, false);
            if (!z10 && !z2) {
                i4 = (int) (bravo >> 32);
            } else {
                i4 = bravo2;
            }
            if (z10 && !z2) {
                i5 = (int) (bravo & 4294967295L);
            } else {
                i5 = bravo2;
            }
            R3.s sVar = c3344d.victor;
            int i11 = -1;
            if (!z2 && sVar != null) {
                j6 = 4294967295L;
                int i12 = c3344d.tango;
                if (i12 != -1) {
                    i11 = i12;
                }
            } else {
                j6 = 4294967295L;
            }
            D0.ak akVar = delta.alpha;
            if (z2) {
                c3383w = null;
                j7 = j11;
            } else {
                int i13 = (int) (bravo >> 32);
                j7 = j11;
                int i14 = (int) (bravo & j6);
                c3383w = new C3383w(new C3382v(AbstractC3051r3.alpha(akVar, i13), i13, 1L), new C3382v(AbstractC3051r3.alpha(akVar, i14), i14, 1L), D0.am.golf(bravo));
            }
            R3.s sVar2 = new R3.s(z10, c3383w, new I.al(i4, i5, i11, akVar));
            if (c3383w != null && sVar != null && z10 == sVar.purple) {
                I.al alVar = (I.al) sVar.silver;
                if (i4 == alVar.bravo && i5 == alVar.charlie) {
                    return j7;
                }
            }
            c3344d.victor = sVar2;
            c3344d.tango = bravo2;
            C3383w bravo3 = interfaceC3386z.bravo(sVar2);
            long bravo4 = D0.ae.bravo(c3344d.bravo.transformedToOriginal(bravo3.alpha.bravo), c3344d.bravo.transformedToOriginal(bravo3.bravo.bravo));
            long j12 = j7;
            if (D0.am.bravo(bravo4, j12)) {
                return j12;
            }
            if (D0.am.golf(bravo4) != D0.am.golf(j12) && D0.am.bravo(D0.ae.bravo((int) (bravo4 & j6), (int) (bravo4 >> 32)), j12)) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (D0.am.charlie(bravo4) && D0.am.charlie(j12)) {
                z13 = true;
            } else {
                z13 = false;
            }
            D0.g gVar = aaVar.alpha;
            if (z11 && gVar.purple.length() > 0 && !z12 && !z13 && (interfaceC1878a = c3344d.kilo) != null) {
                interfaceC1878a.alpha(9);
            }
            c3344d.charlie.invoke(golf(gVar, bravo4));
            c3344d.whiskey = new D0.am(bravo4);
            if (!z11) {
                c3344d.uniform(!D0.am.charlie(bravo4));
            }
            n.ax axVar2 = c3344d.delta;
            if (axVar2 != null) {
                ((t0) axVar2.quebec).setValue(Boolean.valueOf(z11));
            }
            n.ax axVar3 = c3344d.delta;
            if (axVar3 != null) {
                if (!D0.am.charlie(bravo4) && AbstractC3066u3.golf(c3344d, true)) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                ((t0) axVar3.mike).setValue(Boolean.valueOf(z17));
            }
            n.ax axVar4 = c3344d.delta;
            if (axVar4 != null) {
                if (!D0.am.charlie(bravo4)) {
                    z14 = false;
                    if (AbstractC3066u3.golf(c3344d, false)) {
                        z16 = true;
                        ((t0) axVar4.november).setValue(Boolean.valueOf(z16));
                    }
                } else {
                    z14 = false;
                }
                z16 = z14;
                ((t0) axVar4.november).setValue(Boolean.valueOf(z16));
            } else {
                z14 = false;
            }
            n.ax axVar5 = c3344d.delta;
            if (axVar5 != null) {
                if (D0.am.charlie(bravo4) && AbstractC3066u3.golf(c3344d, true)) {
                    z15 = true;
                } else {
                    z15 = z14;
                }
                ((t0) axVar5.oscar).setValue(Boolean.valueOf(z15));
            }
            return bravo4;
        }
        return D0.am.bravo;
    }

    public static I0.aa golf(D0.g gVar, long j5) {
        return new I0.aa(gVar, j5, (D0.am) null);
    }

    public final Y foxtrot(boolean z2) {
        vf.ab abVar = this.india;
        if (abVar == null) {
            return null;
        }
        return vf.ad.zulu(abVar, null, vf.ac.silver, new av(this, z2, null), 1);
    }

    public final void hotel() {
        vf.ab abVar = this.india;
        if (abVar != null) {
            vf.ad.zulu(abVar, null, vf.ac.silver, new ax(this, null), 1);
        }
    }

    public final void india(Z.b bVar) {
        n.am amVar;
        e0 e0Var;
        int echo;
        if (!D0.am.charlie(oscar().bravo)) {
            n.ax axVar = this.delta;
            if (axVar != null) {
                e0Var = axVar.delta();
            } else {
                e0Var = null;
            }
            if (bVar != null && e0Var != null) {
                echo = this.bravo.transformedToOriginal(e0Var.bravo(bVar.alpha, true));
            } else {
                echo = D0.am.echo(oscar().bravo);
            }
            I0.aa alpha = I0.aa.alpha(oscar(), null, D0.ae.bravo(echo, echo), 5);
            this.charlie.invoke(alpha);
            this.whiskey = new D0.am(alpha.bravo);
        }
        if (bVar != null && oscar().alpha.purple.length() > 0) {
            amVar = n.am.red;
        } else {
            amVar = n.am.alpha;
        }
        romeo(amVar);
        uniform(false);
    }

    public final void juliet(boolean z2) {
        Y.s sVar;
        n.ax axVar = this.delta;
        if (axVar != null && !axVar.bravo() && (sVar = this.lima) != null) {
            Y.s.bravo(sVar);
        }
        this.uniform = oscar();
        uniform(z2);
        romeo(n.am.purple);
    }

    public final Z.b kilo() {
        return (Z.b) ((t0) this.sierra).getValue();
    }

    public final boolean lima() {
        return ((Boolean) ((t0) this.november).getValue()).booleanValue();
    }

    public final long mike(boolean z2) {
        e0 delta;
        long j5;
        int max;
        int delta2;
        float india;
        boolean z10 = true;
        n.ax axVar = this.delta;
        if (axVar != null && (delta = axVar.delta()) != null) {
            D0.ak akVar = delta.alpha;
            D0.g november = november();
            if (november != null) {
                if (Intrinsics.areEqual(november.purple, akVar.alpha.alpha.purple)) {
                    I0.aa oscar = oscar();
                    if (z2) {
                        long j6 = oscar.bravo;
                        int i4 = D0.am.charlie;
                        j5 = j6 >> 32;
                    } else {
                        long j7 = oscar.bravo;
                        int i5 = D0.am.charlie;
                        j5 = j7 & 4294967295L;
                    }
                    int originalToTransformed = this.bravo.originalToTransformed((int) j5);
                    boolean golf = D0.am.golf(oscar().bravo);
                    D0.o oVar = akVar.bravo;
                    if (oVar.delta(originalToTransformed) < oVar.foxtrot) {
                        if ((z2 && !golf) || (!z2 && golf)) {
                            max = originalToTransformed;
                        } else {
                            max = Math.max(originalToTransformed - 1, 0);
                        }
                        if (akVar.alpha(max) != akVar.golf(originalToTransformed)) {
                            z10 = false;
                        }
                        oVar.lima(originalToTransformed);
                        int length = ((D0.g) oVar.alpha.purple).purple.length();
                        ArrayList arrayList = oVar.hotel;
                        if (originalToTransformed == length) {
                            delta2 = CollectionsKt.ivory(arrayList);
                        } else {
                            delta2 = D0.ae.delta(originalToTransformed, arrayList);
                        }
                        D0.q qVar = (D0.q) arrayList.get(delta2);
                        D0.a aVar = qVar.alpha;
                        int delta3 = qVar.delta(originalToTransformed);
                        E0.r rVar = aVar.delta;
                        if (z10) {
                            india = rVar.hotel(delta3, false);
                        } else {
                            india = rVar.india(delta3, false);
                        }
                        long j10 = akVar.charlie;
                        float charlie = J4.charlie(india, 0.0f, (int) (j10 >> 32));
                        return (Float.floatToRawIntBits(J4.charlie(oVar.bravo(r8), 0.0f, (int) (j10 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits(charlie) << 32);
                    }
                    return 9205357640488583168L;
                }
                return 9205357640488583168L;
            }
            return 9205357640488583168L;
        }
        return 9205357640488583168L;
    }

    public final D0.g november() {
        n.J j5;
        n.ax axVar = this.delta;
        if (axVar != null && (j5 = axVar.alpha) != null) {
            return j5.alpha;
        }
        return null;
    }

    public final I0.aa oscar() {
        return (I0.aa) ((t0) this.echo).getValue();
    }

    public final void papa() {
        Y y10;
        C2882h c2882h = (C2882h) this.yankee.alpha;
        if (c2882h != null && (y10 = c2882h.yellow) != null) {
            y10.foxtrot(null);
            c2882h.yellow = null;
        }
    }

    public final void quebec() {
        vf.ab abVar = this.india;
        if (abVar != null) {
            vf.ad.zulu(abVar, null, vf.ac.silver, new C3342B(this, null), 1);
        }
    }

    public final void romeo(n.am amVar) {
        n.ax axVar = this.delta;
        if (axVar != null) {
            if (axVar.alpha() == amVar) {
                axVar = null;
            }
            if (axVar != null) {
                ((t0) axVar.kilo).setValue(amVar);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0029, code lost:
    
        if (((java.lang.Boolean) ((androidx.compose.runtime.t0) r4.quebec).getValue()).booleanValue() == false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void sierra() {
        Function1 function1;
        InterfaceC3133g interfaceC3133g;
        S.g echo = r6.u.echo();
        if (echo != null) {
            function1 = echo.echo();
        } else {
            function1 = null;
        }
        S.g foxtrot = r6.u.foxtrot(echo);
        try {
            if (lima()) {
                n.ax axVar = this.delta;
                if (axVar != null) {
                }
                r6.u.juliet(echo, foxtrot, function1);
                C2882h c2882h = (C2882h) this.yankee.alpha;
                if (c2882h != null) {
                    if (c2882h.isAttached()) {
                        Y y10 = c2882h.yellow;
                        if ((y10 == null || !y10.echo()) && (interfaceC3133g = (InterfaceC3133g) AbstractC2557q.echo(c2882h, AbstractC3134h.bravo)) != null) {
                            c2882h.yellow = vf.ad.zulu(c2882h.getCoroutineScope(), null, vf.ac.silver, new C2881g(c2882h, interfaceC3133g, null), 1);
                            return;
                        }
                        return;
                    }
                    return;
                }
                AbstractC1719b.delta("ToolbarRequester is not initialized.");
                throw new KotlinNothingValueException();
            }
        } finally {
            r6.u.juliet(echo, foxtrot, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object tango(Pd.c cVar) {
        C3343C c3343c;
        int i4;
        C2896N c2896n;
        C3344D c3344d;
        if (cVar instanceof C3343C) {
            c3343c = (C3343C) cVar;
            int i5 = c3343c.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                c3343c.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = c3343c.purple;
                Od.a aVar = Od.a.alpha;
                i4 = c3343c.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        c3344d = c3343c.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    InterfaceC2897O interfaceC2897O = this.hotel;
                    c2896n = null;
                    if (interfaceC2897O != null) {
                        c3343c.alpha = this;
                        c3343c.silver = 1;
                        ClipData primaryClip = ((C2916h) interfaceC2897O).alpha.alpha.getPrimaryClip();
                        if (primaryClip != null) {
                            obj = new C2896N(primaryClip);
                        } else {
                            obj = null;
                        }
                        if (obj == aVar) {
                            return aVar;
                        }
                        c3344d = this;
                    } else {
                        c3344d = this;
                        ((t0) c3344d.xray).setValue(c2896n);
                        return Unit.INSTANCE;
                    }
                }
                c2896n = (C2896N) obj;
                ((t0) c3344d.xray).setValue(c2896n);
                return Unit.INSTANCE;
            }
        }
        c3343c = new C3343C(this, cVar);
        Object obj2 = c3343c.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = c3343c.silver;
        if (i4 == 0) {
        }
        c2896n = (C2896N) obj2;
        ((t0) c3344d.xray).setValue(c2896n);
        return Unit.INSTANCE;
    }

    public final void uniform(boolean z2) {
        n.ax axVar = this.delta;
        if (axVar != null) {
            ((t0) axVar.lima).setValue(Boolean.valueOf(z2));
        }
        if (z2) {
            sierra();
        } else {
            papa();
        }
    }
}
