package s0;

import androidx.recyclerview.widget.RecyclerView;
import ja.burhanrashid52.photoeditor.shape.ShapeBuilder;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC2264a;
import q0.AbstractC2367C;
import q0.C2396o;
import q0.C2398q;
import s6.AbstractC2609a7;
import t0.C2946x;

/* loaded from: classes3.dex */
public abstract class at extends AbstractC2367C implements D, G {

    /* renamed from: h, reason: collision with root package name */
    public static final C2546f f13308h = C2546f.silver;

    /* renamed from: a, reason: collision with root package name */
    public a0 f13309a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f13310b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13311c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f13312d;
    public final q0.am e = new q0.am(0, this);

    /* renamed from: f, reason: collision with root package name */
    public com.google.android.material.datepicker.c f13313f;

    /* renamed from: g, reason: collision with root package name */
    public bv.al f13314g;
    public aq white;
    public Function1 yellow;

    public static void m(L l10) {
        al alVar;
        am amVar;
        L l11 = l10.f13252j;
        if (l11 != null) {
            alVar = l11.f13251i;
        } else {
            alVar = null;
        }
        al alVar2 = l10.f13251i;
        if (!Intrinsics.areEqual(alVar, alVar2)) {
            alVar2.f13306y.papa.f13231q.foxtrot();
            return;
        }
        InterfaceC2542b hotel = alVar2.f13306y.papa.hotel();
        if (hotel != null && (amVar = ((C) hotel).f13231q) != null) {
            amVar.foxtrot();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0175  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(al alVar, C2398q c2398q) {
        char c3;
        long j5;
        long j6;
        long j7;
        bv.al alVar2;
        bv.al alVar3;
        Object golf;
        long[] jArr;
        long[] jArr2;
        long j10;
        int i4;
        char c4;
        long j11;
        long j12;
        int i5;
        int i10;
        int i11;
        bv.al alVar4 = this.f13314g;
        char c10 = 7;
        long j13 = -9187201950435737472L;
        int i12 = 8;
        if (alVar4 != null) {
            Object[] objArr = alVar4.charlie;
            long[] jArr3 = alVar4.alpha;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i13 = 0;
                long j14 = 128;
                while (true) {
                    long j15 = jArr3[i13];
                    j6 = 255;
                    if ((((~j15) << c10) & j15 & j13) != j13) {
                        int i14 = 8 - ((~(i13 - length)) >>> 31);
                        int i15 = 0;
                        while (i15 < i14) {
                            if ((j15 & 255) < j14) {
                                c4 = c10;
                                bv.am amVar = (bv.am) objArr[(i13 << 3) + i15];
                                j11 = j13;
                                Object[] objArr2 = amVar.bravo;
                                long[] jArr4 = amVar.alpha;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j12 = j14;
                                    int i16 = 0;
                                    int i17 = i12;
                                    while (true) {
                                        int i18 = length2;
                                        long j16 = jArr4[i16];
                                        jArr2 = jArr3;
                                        j10 = j15;
                                        if ((((~j16) << c4) & j16 & j11) != j11) {
                                            int i19 = 8 - ((~(i16 - i18)) >>> 31);
                                            int i20 = 0;
                                            while (i20 < i19) {
                                                if ((j16 & 255) < j12) {
                                                    int i21 = (i16 << 3) + i20;
                                                    al alVar5 = (al) ((k0) objArr2[i21]).get();
                                                    i10 = i20;
                                                    if (alVar5 != null) {
                                                        boolean cyan = alVar5.cyan();
                                                        i11 = i15;
                                                        if (cyan) {
                                                        }
                                                    } else {
                                                        i11 = i15;
                                                    }
                                                    amVar.mike(i21);
                                                } else {
                                                    i10 = i20;
                                                    i11 = i15;
                                                }
                                                j16 >>= i17;
                                                i20 = i10 + 1;
                                                i15 = i11;
                                            }
                                            i4 = i15;
                                            if (i19 != i17) {
                                                break;
                                            }
                                        } else {
                                            i4 = i15;
                                        }
                                        length2 = i18;
                                        if (i16 == length2) {
                                            break;
                                        }
                                        i16++;
                                        jArr3 = jArr2;
                                        j15 = j10;
                                        i15 = i4;
                                        i17 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j10 = j15;
                                    i4 = i15;
                                    j12 = j14;
                                }
                                i5 = 8;
                            } else {
                                jArr2 = jArr3;
                                j10 = j15;
                                i4 = i15;
                                c4 = c10;
                                j11 = j13;
                                j12 = j14;
                                i5 = i12;
                            }
                            i12 = i5;
                            j15 = j10 >> i5;
                            c10 = c4;
                            j13 = j11;
                            j14 = j12;
                            i15 = i4 + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c3 = c10;
                        j5 = j13;
                        j7 = j14;
                        if (i14 != i12) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c3 = c10;
                        j5 = j13;
                        j7 = j14;
                    }
                    if (i13 == length) {
                        break;
                    }
                    i13++;
                    c10 = c3;
                    j13 = j5;
                    j14 = j7;
                    jArr3 = jArr;
                    i12 = 8;
                }
                alVar2 = this.f13314g;
                if (alVar2 != null) {
                    long[] jArr5 = alVar2.alpha;
                    int length3 = jArr5.length - 2;
                    if (length3 >= 0) {
                        int i22 = 0;
                        while (true) {
                            long j17 = jArr5[i22];
                            if ((((~j17) << c3) & j17 & j5) != j5) {
                                int i23 = 8 - ((~(i22 - length3)) >>> 31);
                                for (int i24 = 0; i24 < i23; i24++) {
                                    if ((j17 & j6) < j7) {
                                        int i25 = (i22 << 3) + i24;
                                        if (((bv.am) alVar2.charlie[i25]).golf()) {
                                            alVar2.lima(i25);
                                        }
                                    }
                                    j17 >>= 8;
                                }
                                if (i23 != 8) {
                                    break;
                                }
                            }
                            if (i22 == length3) {
                                break;
                            } else {
                                i22++;
                            }
                        }
                    }
                }
                alVar3 = this.f13314g;
                if (alVar3 == null) {
                    alVar3 = new bv.al();
                    this.f13314g = alVar3;
                }
                golf = alVar3.golf(c2398q);
                if (golf == null) {
                    golf = new bv.am();
                    alVar3.mike(c2398q, golf);
                }
                ((bv.am) golf).kilo(new WeakReference(alVar));
            }
        }
        c3 = 7;
        j5 = -9187201950435737472L;
        j6 = 255;
        j7 = 128;
        alVar2 = this.f13314g;
        if (alVar2 != null) {
        }
        alVar3 = this.f13314g;
        if (alVar3 == null) {
        }
        golf = alVar3.golf(c2398q);
        if (golf == null) {
        }
        ((bv.am) golf).kilo(new WeakReference(alVar));
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return Q0.c.hotel(this, gold(f5));
    }

    @Override // s0.G
    public final void black(boolean z2) {
        al alVar;
        ag agVar;
        at j5 = j();
        ag agVar2 = null;
        if (j5 != null) {
            alVar = j5.plum();
        } else {
            alVar = null;
        }
        if (Intrinsics.areEqual(alVar, plum())) {
            this.f13310b = z2;
            return;
        }
        if (alVar != null) {
            agVar = alVar.f13306y.delta;
        } else {
            agVar = null;
        }
        if (agVar != ag.red) {
            if (alVar != null) {
                agVar2 = alVar.f13306y.delta;
            }
            if (agVar2 != ag.silver) {
                return;
            }
        }
        this.f13310b = z2;
    }

    public abstract int c(C2396o c2396o);

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(a0 a0Var, long j5, long j6) {
        bv.am amVar;
        bv.am amVar2;
        boolean z2;
        char c3;
        long j7;
        long j10;
        long j11;
        al alVar;
        boolean z10;
        int i4;
        char c4;
        long j12;
        at atVar;
        bv.am amVar3;
        Y snapshotObserver;
        bv.al alVar2 = this.f13314g;
        com.google.android.material.datepicker.c cVar = this.f13313f;
        if (cVar == null) {
            cVar = new com.google.android.material.datepicker.c();
            this.f13313f = cVar;
        }
        com.google.android.material.datepicker.c cVar2 = cVar;
        C2946x c2946x = plum().f13287f;
        if (c2946x != null && (snapshotObserver = c2946x.getSnapshotObserver()) != null) {
            snapshotObserver.alpha(a0Var, f13308h, new ar(this, j5, j6, a0Var));
        }
        boolean ivory = ivory();
        int i5 = cVar2.alpha;
        int i10 = 0;
        while (true) {
            amVar = (bv.am) cVar2.echo;
            amVar2 = (bv.am) cVar2.foxtrot;
            if (i10 >= i5) {
                break;
            }
            byte b2 = ((byte[]) cVar2.delta)[i10];
            if (b2 == 3) {
                C2398q c2398q = ((C2398q[]) cVar2.bravo)[i10];
                Intrinsics.checkNotNull(c2398q);
                amVar2.kilo(c2398q);
            } else if (b2 != 0 && alVar2 != null) {
                C2398q c2398q2 = ((C2398q[]) cVar2.bravo)[i10];
                Intrinsics.checkNotNull(c2398q2);
                bv.am amVar4 = (bv.am) alVar2.kilo(c2398q2);
                if (amVar4 != null) {
                    amVar.juliet(amVar4);
                }
            }
            i10++;
        }
        int i11 = cVar2.alpha;
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            byte[] bArr = (byte[]) cVar2.delta;
            if (bArr[i13] == 2) {
                i12++;
            } else if (i12 > 0) {
                C2398q[] c2398qArr = (C2398q[]) cVar2.bravo;
                c2398qArr[i13 - i12] = c2398qArr[i13];
            }
            bArr[i13] = 2;
        }
        int i14 = cVar2.alpha;
        for (int i15 = i14 - i12; i15 < i14; i15++) {
            ((C2398q[]) cVar2.bravo)[i15] = null;
        }
        cVar2.alpha -= i12;
        at j13 = j();
        Object[] objArr = amVar2.bravo;
        long[] jArr = amVar2.alpha;
        int length = jArr.length - 2;
        char c10 = 7;
        long j14 = -9187201950435737472L;
        int i16 = 8;
        if (length >= 0) {
            j10 = 128;
            int i17 = 0;
            while (true) {
                long j15 = jArr[i17];
                j11 = 255;
                if ((((~j15) << c10) & j15 & j14) != j14) {
                    int i18 = 8 - ((~(i17 - length)) >>> 31);
                    int i19 = 0;
                    while (i19 < i18) {
                        if ((j15 & 255) < 128) {
                            c4 = c10;
                            C2398q c2398q3 = (C2398q) objArr[(i17 << 3) + i19];
                            j12 = j14;
                            if (j13 == null) {
                                atVar = this;
                            } else {
                                atVar = j13;
                            }
                            i4 = i16;
                            at atVar2 = atVar;
                            while (true) {
                                com.google.android.material.datepicker.c cVar3 = atVar2.f13313f;
                                if (cVar3 != null) {
                                    z10 = ivory;
                                    if (ArraysKt.whiskey((C2398q[]) cVar3.bravo, c2398q3)) {
                                        break;
                                    }
                                } else {
                                    z10 = ivory;
                                }
                                at j16 = atVar2.j();
                                if (j16 == null) {
                                    break;
                                }
                                atVar2 = j16;
                                ivory = z10;
                            }
                            bv.al alVar3 = atVar2.f13314g;
                            if (alVar3 != null) {
                                amVar3 = (bv.am) alVar3.kilo(c2398q3);
                            } else {
                                amVar3 = null;
                            }
                            if (amVar3 != null) {
                                atVar.n(amVar3);
                            }
                        } else {
                            z10 = ivory;
                            i4 = i16;
                            c4 = c10;
                            j12 = j14;
                        }
                        j15 >>= i4;
                        i19++;
                        c10 = c4;
                        j14 = j12;
                        i16 = i4;
                        ivory = z10;
                    }
                    z2 = ivory;
                    c3 = c10;
                    j7 = j14;
                    if (i18 != i16) {
                        break;
                    }
                } else {
                    z2 = ivory;
                    c3 = c10;
                    j7 = j14;
                }
                if (i17 == length) {
                    break;
                }
                i17++;
                c10 = c3;
                j14 = j7;
                ivory = z2;
                i16 = 8;
            }
        } else {
            z2 = ivory;
            c3 = 7;
            j7 = -9187201950435737472L;
            j10 = 128;
            j11 = 255;
        }
        amVar2.bravo();
        Object[] objArr2 = amVar.bravo;
        long[] jArr2 = amVar.alpha;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i20 = 0;
            while (true) {
                long j17 = jArr2[i20];
                if ((((~j17) << c3) & j17 & j7) != j7) {
                    int i21 = 8 - ((~(i20 - length2)) >>> 31);
                    for (int i22 = 0; i22 < i21; i22++) {
                        if ((j17 & j11) < j10 && (alVar = (al) ((k0) objArr2[(i20 << 3) + i22]).get()) != null) {
                            if (z2) {
                                alVar.maroon(false);
                            } else {
                                alVar.ochre(false);
                            }
                        }
                        j17 >>= 8;
                    }
                    if (i21 != 8) {
                        break;
                    }
                }
                if (i20 == length2) {
                    break;
                } else {
                    i20++;
                }
            }
        }
        amVar.bravo();
    }

    public final void e(q0.aq aqVar) {
        boolean z2;
        long j5;
        long j6;
        bv.al alVar = this.f13314g;
        if (!this.f13312d) {
            Function1 echo = aqVar.echo();
            boolean z10 = false;
            if (echo == null) {
                if (alVar != null) {
                    Object[] objArr = alVar.charlie;
                    long[] jArr = alVar.alpha;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i4 = 0;
                        while (true) {
                            long j7 = jArr[i4];
                            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i5 = 8 - ((~(i4 - length)) >>> 31);
                                for (int i10 = 0; i10 < i5; i10++) {
                                    if ((255 & j7) < 128) {
                                        n((bv.am) objArr[(i4 << 3) + i10]);
                                    }
                                    j7 >>= 8;
                                }
                                if (i5 != 8) {
                                    break;
                                }
                            }
                            if (i4 == length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                    alVar.alpha();
                }
            } else {
                if (this.yellow != echo) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2 && l().alpha) {
                    q0.z g2 = g();
                    long charlie = AbstractC2609a7.charlie(g2.tango(0L));
                    long kilo = g2.kilo();
                    if (!Q0.k.alpha(charlie, l().purple) || !Q0.m.alpha(kilo, l().red)) {
                        z10 = true;
                    }
                    j6 = charlie;
                    j5 = kilo;
                    z2 = z10;
                } else {
                    j5 = 0;
                    j6 = 9223372034707292159L;
                }
                if (z2) {
                    a0 a0Var = this.f13309a;
                    if (a0Var != null) {
                        a0Var.alpha = aqVar;
                    } else {
                        a0Var = new a0(aqVar, this);
                        this.f13309a = a0Var;
                    }
                    d(a0Var, j6, j5);
                    this.yellow = aqVar.echo();
                }
            }
        }
    }

    public abstract at f();

    public abstract q0.z g();

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    public abstract boolean h();

    public abstract q0.aq i();

    @Override // q0.InterfaceC2402u
    public boolean ivory() {
        return false;
    }

    public abstract at j();

    public abstract long k();

    public final aq l() {
        aq aqVar = this.white;
        if (aqVar == null) {
            aq aqVar2 = new aq(this);
            this.white = aqVar2;
            return aqVar2;
        }
        return aqVar;
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return alpha() * f5;
    }

    @Override // q0.AbstractC2367C
    public final int magenta(C2396o c2396o) {
        int c3;
        if (!h() || (c3 = c(c2396o)) == Integer.MIN_VALUE) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        return c3 + ((int) (this.teal & 4294967295L));
    }

    @Override // Q0.d
    public final /* synthetic */ long mike(long j5) {
        return Q0.c.echo(j5, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void n(bv.am amVar) {
        al alVar;
        Object[] objArr = amVar.bravo;
        long[] jArr = amVar.alpha;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i4 = 0;
            while (true) {
                long j5 = jArr[i4];
                if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i5 = 8 - ((~(i4 - length)) >>> 31);
                    for (int i10 = 0; i10 < i5; i10++) {
                        if ((255 & j5) < 128 && (alVar = (al) ((k0) objArr[(i4 << 3) + i10]).get()) != null) {
                            if (ivory()) {
                                alVar.maroon(false);
                            } else {
                                alVar.ochre(false);
                            }
                        }
                        j5 >>= 8;
                    }
                    if (i5 != 8) {
                        return;
                    }
                }
                if (i4 != length) {
                    i4++;
                } else {
                    return;
                }
            }
        }
    }

    public abstract void o();

    @Override // Q0.d
    public final /* synthetic */ int ochre(float f5) {
        return Q0.c.bravo(this, f5);
    }

    @Override // q0.ar
    public final q0.aq papa(int i4, int i5, Map map, Function1 function1) {
        return purple(i4, i5, map, null, function1);
    }

    public abstract al plum();

    @Override // q0.ar
    public final q0.aq purple(int i4, int i5, Map map, B2.ap apVar, Function1 function1) {
        if ((i4 & ShapeBuilder.DEFAULT_SHAPE_COLOR) != 0 || ((-16777216) & i5) != 0) {
            AbstractC2264a.bravo("Size(" + i4 + " x " + i5 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new as(i4, i5, map, apVar, function1, this);
    }

    @Override // Q0.d
    public final /* synthetic */ float quebec(long j5) {
        return Q0.c.delta(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ long red(long j5) {
        return Q0.c.golf(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ float teal(long j5) {
        return Q0.c.foxtrot(j5, this);
    }
}
