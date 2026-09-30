package d;

import Yb.C0312j0;
import androidx.recyclerview.widget.RecyclerView;
import bz.AbstractC0779d;
import com.airbnb.lottie.compose.LottieConstants;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Ref;
import pf.C2359i;
import s6.AbstractC2645e7;
import s6.AbstractC2770s7;
import t6.AbstractC3017k3;

/* loaded from: classes3.dex */
public final class J {
    public final C1548o0 alpha;
    public final com.google.android.material.internal.s bravo;
    public final P.c charlie;
    public Q0.d delta;
    public boolean foxtrot;
    public vf.Y golf;
    public final xf.e echo = AbstractC3017k3.bravo(LottieConstants.IterateForever, 6, null);
    public final J2.c hotel = new J2.c(29);

    public J(C1548o0 c1548o0, com.google.android.material.internal.s sVar, P.c cVar, Q0.d dVar) {
        this.alpha = c1548o0;
        this.bravo = sVar;
        this.charlie = cVar;
        this.delta = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011a, code lost:
    
        if (r16.charlie.invoke(r0, r9) != r10) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.internal.r, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object alpha(J j5, C1548o0 c1548o0, ay ayVar, float f5, float f10, Pd.c cVar) {
        B b2;
        int i4;
        kotlin.jvm.internal.r rVar;
        float f11;
        C1548o0 c1548o02;
        long alpha;
        long alpha2;
        j5.getClass();
        if (cVar instanceof B) {
            b2 = (B) cVar;
            int i5 = b2.white;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                b2.white = i5 - RecyclerView.UNDEFINED_DURATION;
                B b4 = b2;
                Object obj = b4.silver;
                Object obj2 = Od.a.alpha;
                i4 = b4.white;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    f11 = b4.red;
                    rVar = b4.purple;
                    c1548o02 = b4.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    Ref.ObjectRef objectRef = new Ref.ObjectRef();
                    objectRef.alpha = ayVar;
                    j5.echo(ayVar);
                    ay delta = delta(j5.echo);
                    if (delta != null) {
                        j5.echo(delta);
                        objectRef.alpha = ((ay) objectRef.alpha).alpha(delta);
                    }
                    ?? obj3 = new Object();
                    float golf = c1548o0.golf(c1548o0.echo(((ay) objectRef.alpha).alpha));
                    obj3.alpha = golf;
                    if (ax.alpha(golf)) {
                        return Unit.INSTANCE;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.alpha = AbstractC0779d.bravo(30, 0.0f, 0.0f);
                    C c3 = new C(obj3, objectRef2, objectRef, f5, j5, f10, c1548o0, null);
                    b4.alpha = c1548o0;
                    b4.purple = obj3;
                    b4.red = f10;
                    b4.white = 1;
                    if (j5.foxtrot(c1548o0, c3, b4) != obj2) {
                        rVar = obj3;
                        f11 = f10;
                        c1548o02 = c1548o0;
                    }
                    return obj2;
                }
                J2.c cVar2 = j5.hotel;
                alpha = AbstractC2645e7.alpha(((n0.c) cVar2.purple).bravo(Float.MAX_VALUE), ((n0.c) cVar2.red).bravo(Float.MAX_VALUE));
                if (alpha == 0) {
                    float delta2 = c1548o02.delta(Math.signum(rVar.alpha)) * Math.min(Math.abs(rVar.alpha) / 100, f11) * 1000;
                    if (delta2 == 0.0f) {
                        alpha = 0;
                    } else {
                        if (c1548o02.delta == K.purple) {
                            alpha2 = AbstractC2645e7.alpha(delta2, 0.0f);
                        } else {
                            alpha2 = AbstractC2645e7.alpha(0.0f, delta2);
                        }
                        alpha = alpha2;
                    }
                }
                Q0.r rVar2 = new Q0.r(alpha);
                b4.alpha = null;
                b4.purple = null;
                b4.white = 2;
            }
        }
        b2 = new B(j5, cVar);
        B b42 = b2;
        Object obj4 = b42.silver;
        Object obj22 = Od.a.alpha;
        i4 = b42.white;
        if (i4 == 0) {
        }
        J2.c cVar22 = j5.hotel;
        alpha = AbstractC2645e7.alpha(((n0.c) cVar22.purple).bravo(Float.MAX_VALUE), ((n0.c) cVar22.red).bravo(Float.MAX_VALUE));
        if (alpha == 0) {
        }
        Q0.r rVar22 = new Q0.r(alpha);
        b42.alpha = null;
        b42.purple = null;
        b42.white = 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(J j5, Ref.ObjectRef objectRef, kotlin.jvm.internal.r rVar, C1548o0 c1548o0, Ref.ObjectRef objectRef2, long j6, Pd.c cVar) {
        D d4;
        int i4;
        C1548o0 c1548o02;
        Ref.ObjectRef objectRef3;
        Ref.ObjectRef objectRef4;
        kotlin.jvm.internal.r rVar2;
        ay ayVar;
        boolean z2;
        if (cVar instanceof D) {
            D d9 = (D) cVar;
            int i5 = d9.yellow;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                d9.yellow = i5 - RecyclerView.UNDEFINED_DURATION;
                d4 = d9;
                Object obj = d4.white;
                Od.a aVar = Od.a.alpha;
                i4 = d4.yellow;
                if (i4 == 0) {
                    if (i4 == 1) {
                        Ref.ObjectRef objectRef5 = d4.teal;
                        C1548o0 c1548o03 = d4.silver;
                        rVar2 = d4.red;
                        objectRef4 = d4.purple;
                        J j7 = d4.alpha;
                        ResultKt.alpha(obj);
                        objectRef3 = objectRef5;
                        c1548o02 = c1548o03;
                        j5 = j7;
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    if (j6 < 0) {
                        return Boolean.FALSE;
                    }
                    E e = new E(j5, null);
                    d4.alpha = j5;
                    d4.purple = objectRef;
                    d4.red = rVar;
                    c1548o02 = c1548o0;
                    d4.silver = c1548o02;
                    objectRef3 = objectRef2;
                    d4.teal = objectRef3;
                    d4.yellow = 1;
                    obj = vf.f0.bravo(j6, e, d4);
                    if (obj == aVar) {
                        return aVar;
                    }
                    objectRef4 = objectRef;
                    rVar2 = rVar;
                }
                ayVar = (ay) obj;
                if (ayVar == null) {
                    boolean z10 = ((ay) objectRef4.alpha).charlie;
                    long j10 = ayVar.alpha;
                    objectRef4.alpha = new ay(j10, ayVar.bravo, z10);
                    rVar2.alpha = c1548o02.golf(c1548o02.echo(j10));
                    objectRef3.alpha = AbstractC0779d.bravo(30, 0.0f, 0.0f);
                    j5.echo(ayVar);
                    z2 = !ax.alpha(rVar2.alpha);
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            }
        }
        d4 = new Pd.c(cVar);
        Object obj2 = d4.white;
        Od.a aVar2 = Od.a.alpha;
        i4 = d4.yellow;
        if (i4 == 0) {
        }
        ayVar = (ay) obj2;
        if (ayVar == null) {
        }
        return Boolean.valueOf(z2);
    }

    public static ay delta(xf.e eVar) {
        ay ayVar = null;
        C2359i bravo = AbstractC2770s7.bravo(new G(new C0312j0(21, eVar), null));
        while (bravo.hasNext()) {
            ay ayVar2 = (ay) bravo.next();
            if (ayVar != null) {
                ayVar2 = ayVar.alpha(ayVar2);
            }
            ayVar = ayVar2;
        }
        return ayVar;
    }

    public final float charlie(C1542l0 c1542l0, float f5) {
        C1548o0 c1548o0 = this.alpha;
        long hotel = c1548o0.hotel(c1548o0.delta(f5));
        C1548o0 c1548o02 = c1542l0.alpha;
        return c1548o0.golf(c1548o0.echo(c1548o02.charlie(c1548o02.kilo, hotel, 1)));
    }

    public final void echo(ay ayVar) {
        long j5 = ayVar.bravo;
        J2.c cVar = this.hotel;
        cVar.getClass();
        long j6 = ayVar.alpha;
        ((n0.c) cVar.purple).alpha(Float.intBitsToFloat((int) (j6 >> 32)), j5);
        ((n0.c) cVar.red).alpha(Float.intBitsToFloat((int) (j6 & 4294967295L)), j5);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object foxtrot(C1548o0 c1548o0, C c3, Pd.c cVar) {
        H h4;
        int i4;
        if (cVar instanceof H) {
            h4 = (H) cVar;
            int i5 = h4.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                h4.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = h4.alpha;
                Od.a aVar = Od.a.alpha;
                i4 = h4.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    this.foxtrot = true;
                    I i10 = new I(c1548o0, c3, null);
                    h4.red = 1;
                    vf.Z z2 = new vf.Z(h4.getContext(), h4, 0);
                    if (s6.B0.bravo(z2, true, z2, i10) == aVar) {
                        return aVar;
                    }
                }
                this.foxtrot = false;
                return Unit.INSTANCE;
            }
        }
        h4 = new H(this, cVar);
        Object obj2 = h4.alpha;
        Od.a aVar2 = Od.a.alpha;
        i4 = h4.red;
        if (i4 == 0) {
        }
        this.foxtrot = false;
        return Unit.INSTANCE;
    }
}
