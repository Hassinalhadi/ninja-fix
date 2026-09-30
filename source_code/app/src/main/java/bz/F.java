package bz;

import Yb.C0312j0;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import fe.C1715g;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import s6.J4;
import s6.J6;
import vf.C3207k;

/* loaded from: classes3.dex */
public final class F extends G3.a {

    /* renamed from: k, reason: collision with root package name */
    public static final C0789n f3436k = new C0789n(0.0f);

    /* renamed from: l, reason: collision with root package name */
    public static final C0789n f3437l = new C0789n(1.0f);

    /* renamed from: a, reason: collision with root package name */
    public final androidx.compose.runtime.aw f3438a;

    /* renamed from: b, reason: collision with root package name */
    public C3207k f3439b;

    /* renamed from: c, reason: collision with root package name */
    public final Ef.c f3440c;

    /* renamed from: d, reason: collision with root package name */
    public final ar f3441d;
    public long e;

    /* renamed from: f, reason: collision with root package name */
    public final bv.ah f3442f;

    /* renamed from: g, reason: collision with root package name */
    public av f3443g;

    /* renamed from: h, reason: collision with root package name */
    public final au f3444h;

    /* renamed from: i, reason: collision with root package name */
    public float f3445i;

    /* renamed from: j, reason: collision with root package name */
    public final au f3446j;
    public final androidx.compose.runtime.ax purple;
    public final androidx.compose.runtime.ax red;
    public Object silver;
    public a0 teal;
    public long white;
    public final C0312j0 yellow;

    /* JADX WARN: Type inference failed for: r3v7, types: [bz.au] */
    /* JADX WARN: Type inference failed for: r3v8, types: [bz.au] */
    public F(Y1.l lVar) {
        super(6);
        this.purple = C0564b.zulu(lVar);
        this.red = C0564b.zulu(lVar);
        this.silver = lVar;
        this.yellow = new C0312j0(12, this);
        this.f3438a = C0564b.victor(0.0f);
        this.f3440c = Ef.d.alpha();
        this.f3441d = new ar();
        this.e = Long.MIN_VALUE;
        this.f3442f = new bv.ah();
        final int i4 = 0;
        this.f3444h = new Function1(this) { // from class: bz.au
            public final /* synthetic */ F purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long l10 = (Long) obj;
                switch (i4) {
                    case 0:
                        this.purple.e = l10.longValue();
                        return Unit.INSTANCE;
                    default:
                        long longValue = l10.longValue();
                        F f5 = this.purple;
                        long j5 = longValue - f5.e;
                        f5.e = longValue;
                        long echo = Zd.a.echo(j5 / f5.f3445i);
                        bv.ah ahVar = f5.f3442f;
                        if (ahVar.echo()) {
                            Object[] objArr = ahVar.alpha;
                            int i5 = ahVar.bravo;
                            int i10 = 0;
                            for (int i11 = 0; i11 < i5; i11++) {
                                av avVar = (av) objArr[i11];
                                F.e0(avVar, echo);
                                avVar.charlie = true;
                            }
                            a0 a0Var = f5.teal;
                            if (a0Var != null) {
                                a0Var.papa();
                            }
                            int i12 = ahVar.bravo;
                            Object[] objArr2 = ahVar.alpha;
                            C1715g hotel = J4.hotel(0, i12);
                            int i13 = hotel.alpha;
                            int i14 = hotel.purple;
                            if (i13 <= i14) {
                                while (true) {
                                    objArr2[i13 - i10] = objArr2[i13];
                                    if (((av) objArr2[i13]).charlie) {
                                        i10++;
                                    }
                                    if (i13 != i14) {
                                        i13++;
                                    }
                                }
                            }
                            ArraysKt.coral(i12 - i10, i12, null, objArr2);
                            ahVar.bravo -= i10;
                        }
                        av avVar2 = f5.f3443g;
                        if (avVar2 != null) {
                            avVar2.golf = f5.white;
                            F.e0(avVar2, echo);
                            f5.h0(avVar2.delta);
                            if (avVar2.delta == 1.0f) {
                                f5.f3443g = null;
                            }
                            f5.g0();
                        }
                        return Unit.INSTANCE;
                }
            }
        };
        final int i5 = 1;
        this.f3446j = new Function1(this) { // from class: bz.au
            public final /* synthetic */ F purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Long l10 = (Long) obj;
                switch (i5) {
                    case 0:
                        this.purple.e = l10.longValue();
                        return Unit.INSTANCE;
                    default:
                        long longValue = l10.longValue();
                        F f5 = this.purple;
                        long j5 = longValue - f5.e;
                        f5.e = longValue;
                        long echo = Zd.a.echo(j5 / f5.f3445i);
                        bv.ah ahVar = f5.f3442f;
                        if (ahVar.echo()) {
                            Object[] objArr = ahVar.alpha;
                            int i52 = ahVar.bravo;
                            int i10 = 0;
                            for (int i11 = 0; i11 < i52; i11++) {
                                av avVar = (av) objArr[i11];
                                F.e0(avVar, echo);
                                avVar.charlie = true;
                            }
                            a0 a0Var = f5.teal;
                            if (a0Var != null) {
                                a0Var.papa();
                            }
                            int i12 = ahVar.bravo;
                            Object[] objArr2 = ahVar.alpha;
                            C1715g hotel = J4.hotel(0, i12);
                            int i13 = hotel.alpha;
                            int i14 = hotel.purple;
                            if (i13 <= i14) {
                                while (true) {
                                    objArr2[i13 - i10] = objArr2[i13];
                                    if (((av) objArr2[i13]).charlie) {
                                        i10++;
                                    }
                                    if (i13 != i14) {
                                        i13++;
                                    }
                                }
                            }
                            ArraysKt.coral(i12 - i10, i12, null, objArr2);
                            ahVar.bravo -= i10;
                        }
                        av avVar2 = f5.f3443g;
                        if (avVar2 != null) {
                            avVar2.golf = f5.white;
                            F.e0(avVar2, echo);
                            f5.h0(avVar2.delta);
                            if (avVar2.delta == 1.0f) {
                                f5.f3443g = null;
                            }
                            f5.g0();
                        }
                        return Unit.INSTANCE;
                }
            }
        };
    }

    public static final void X(F f5) {
        a0 a0Var = f5.teal;
        if (a0Var == null) {
            return;
        }
        av avVar = f5.f3443g;
        if (avVar == null) {
            if (f5.white > 0 && f5.d0() != 1.0f && !Intrinsics.areEqual(((t0) f5.red).getValue(), ((t0) f5.purple).getValue())) {
                avVar = new av();
                avVar.delta = f5.d0();
                long j5 = f5.white;
                avVar.golf = j5;
                avVar.hotel = Zd.a.echo((1.0d - f5.d0()) * j5);
                avVar.echo.echo(f5.d0(), 0);
            } else {
                avVar = null;
            }
        }
        if (avVar != null) {
            avVar.golf = f5.white;
            f5.f3442f.golf(avVar);
            a0Var.november(avVar);
        }
        f5.f3443g = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (androidx.compose.runtime.C0564b.sierra(r0.getContext()).blue(r10.f3444h, r0) == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Y(F f5, Pd.c cVar) {
        ay ayVar;
        Object obj;
        int i4;
        bv.ah ahVar;
        f5.getClass();
        if (cVar instanceof ay) {
            ayVar = (ay) cVar;
            int i5 = ayVar.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                ayVar.red = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = ayVar.alpha;
                obj = Od.a.alpha;
                i4 = ayVar.red;
                ahVar = f5.f3442f;
                if (i4 == 0) {
                    if (i4 != 1 && i4 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj2);
                } else {
                    ResultKt.alpha(obj2);
                    if (ahVar.delta() && f5.f3443g == null) {
                        return Unit.INSTANCE;
                    }
                    if (P.golf(ayVar.getContext()) == 0.0f) {
                        f5.c0();
                        f5.e = Long.MIN_VALUE;
                        return Unit.INSTANCE;
                    }
                    if (f5.e == Long.MIN_VALUE) {
                        ayVar.red = 1;
                    }
                }
                do {
                    if (ahVar.echo() && f5.f3443g == null) {
                        f5.e = Long.MIN_VALUE;
                        return Unit.INSTANCE;
                    }
                    ayVar.red = 2;
                } while (f5.b0(ayVar) != obj);
                return obj;
            }
        }
        ayVar = new ay(f5, cVar);
        Object obj22 = ayVar.alpha;
        obj = Od.a.alpha;
        i4 = ayVar.red;
        ahVar = f5.f3442f;
        if (i4 == 0) {
        }
        do {
            if (ahVar.echo()) {
            }
            ayVar.red = 2;
        } while (f5.b0(ayVar) != obj);
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0053, code lost:
    
        if (r3.delta(r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Z(F f5, Pd.c cVar) {
        D d4;
        Od.a aVar;
        int i4;
        Object value;
        Object sierra;
        Object obj;
        f5.getClass();
        if (cVar instanceof D) {
            d4 = (D) cVar;
            int i5 = d4.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                d4.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = d4.purple;
                aVar = Od.a.alpha;
                i4 = d4.silver;
                Ef.c cVar2 = f5.f3440c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            obj = d4.alpha;
                            ResultKt.alpha(obj2);
                            if (!Intrinsics.areEqual(obj2, obj)) {
                                return Unit.INSTANCE;
                            }
                            f5.e = Long.MIN_VALUE;
                            throw new CancellationException("targetState while waiting for composition");
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = d4.alpha;
                    ResultKt.alpha(obj2);
                    value = obj3;
                } else {
                    ResultKt.alpha(obj2);
                    value = ((t0) f5.purple).getValue();
                    d4.alpha = value;
                    d4.silver = 1;
                }
                d4.alpha = value;
                d4.silver = 2;
                C3207k c3207k = new C3207k(1, J6.delta(d4));
                c3207k.tango();
                f5.f3439b = c3207k;
                cVar2.foxtrot(null);
                sierra = c3207k.sierra();
                if (sierra != aVar) {
                    obj = value;
                    obj2 = sierra;
                    if (!Intrinsics.areEqual(obj2, obj)) {
                    }
                }
                return aVar;
            }
        }
        d4 = new D(f5, cVar);
        Object obj22 = d4.purple;
        aVar = Od.a.alpha;
        i4 = d4.silver;
        Ef.c cVar22 = f5.f3440c;
        if (i4 == 0) {
        }
        d4.alpha = value;
        d4.silver = 2;
        C3207k c3207k2 = new C3207k(1, J6.delta(d4));
        c3207k2.tango();
        f5.f3439b = c3207k2;
        cVar22.foxtrot(null);
        sierra = c3207k2.sierra();
        if (sierra != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0053, code lost:
    
        if (r3.delta(r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a0(F f5, Pd.c cVar) {
        E e;
        int i4;
        Object value;
        Object obj;
        f5.getClass();
        if (cVar instanceof E) {
            e = (E) cVar;
            int i5 = e.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                e.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = e.purple;
                Od.a aVar = Od.a.alpha;
                i4 = e.silver;
                Ef.c cVar2 = f5.f3440c;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            obj = e.alpha;
                            ResultKt.alpha(obj2);
                            if (!Intrinsics.areEqual(obj2, obj)) {
                                f5.e = Long.MIN_VALUE;
                                throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                            }
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Object obj3 = e.alpha;
                    ResultKt.alpha(obj2);
                    value = obj3;
                } else {
                    ResultKt.alpha(obj2);
                    value = ((t0) f5.purple).getValue();
                    e.alpha = value;
                    e.silver = 1;
                }
                if (!Intrinsics.areEqual(value, f5.silver)) {
                    cVar2.foxtrot(null);
                    return Unit.INSTANCE;
                }
                e.alpha = value;
                e.silver = 2;
                C3207k c3207k = new C3207k(1, J6.delta(e));
                c3207k.tango();
                f5.f3439b = c3207k;
                cVar2.foxtrot(null);
                Object sierra = c3207k.sierra();
                if (sierra != aVar) {
                    obj = value;
                    obj2 = sierra;
                    if (!Intrinsics.areEqual(obj2, obj)) {
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            }
        }
        e = new E(f5, cVar);
        Object obj22 = e.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = e.silver;
        Ef.c cVar22 = f5.f3440c;
        if (i4 == 0) {
        }
        if (!Intrinsics.areEqual(value, f5.silver)) {
        }
    }

    public static void e0(av avVar, long j5) {
        long j6 = avVar.alpha + j5;
        avVar.alpha = j6;
        long j7 = avVar.hotel;
        if (j6 >= j7) {
            avVar.delta = 1.0f;
            return;
        }
        l0 l0Var = avVar.bravo;
        if (l0Var != null) {
            C0789n c0789n = f3437l;
            C0789n c0789n2 = avVar.foxtrot;
            if (c0789n2 == null) {
                c0789n2 = f3436k;
            }
            avVar.delta = J4.charlie(((C0789n) l0Var.foxtrot(j6, avVar.echo, c0789n, c0789n2)).alpha(0), 0.0f, 1.0f);
            return;
        }
        float f5 = ((float) j6) / ((float) j7);
        avVar.delta = (f5 * 1.0f) + ((1 - f5) * avVar.echo.alpha(0));
    }

    @Override // G3.a
    public final Object L() {
        return ((t0) this.red).getValue();
    }

    @Override // G3.a
    public final Object N() {
        return ((t0) this.purple).getValue();
    }

    @Override // G3.a
    public final void Q(Object obj) {
        ((t0) this.red).setValue(obj);
    }

    @Override // G3.a
    public final void R(a0 a0Var) {
        boolean z2;
        a0 a0Var2 = this.teal;
        if (a0Var2 != null && !Intrinsics.areEqual(a0Var, a0Var2)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z2) {
            as.bravo("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.teal + ", new instance: " + a0Var);
        }
        this.teal = a0Var;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // G3.a
    public final void S() {
        this.teal = null;
        ((S.x) e0.bravo.getValue()).bravo(this);
    }

    public final Object b0(Pd.c cVar) {
        float golf = P.golf(cVar.getContext());
        if (golf <= 0.0f) {
            c0();
            return Unit.INSTANCE;
        }
        this.f3445i = golf;
        Object blue = C0564b.sierra(cVar.getContext()).blue(this.f3446j, cVar);
        if (blue == Od.a.alpha) {
            return blue;
        }
        return Unit.INSTANCE;
    }

    public final void c0() {
        a0 a0Var = this.teal;
        if (a0Var != null) {
            a0Var.charlie();
        }
        this.f3442f.india();
        if (this.f3443g != null) {
            this.f3443g = null;
            h0(1.0f);
            g0();
        }
    }

    public final float d0() {
        return ((androidx.compose.runtime.n0) this.f3438a).juliet();
    }

    public final Object f0(float f5, Object obj, Pd.i iVar) {
        if (0.0f > f5 || f5 > 1.0f) {
            as.alpha("Expecting fraction between 0 and 1. Got " + f5);
        }
        a0 a0Var = this.teal;
        if (a0Var == null) {
            return Unit.INSTANCE;
        }
        Object alpha = ar.alpha(this.f3441d, new B(obj, ((t0) this.purple).getValue(), this, a0Var, f5, null), iVar);
        if (alpha == Od.a.alpha) {
            return alpha;
        }
        return Unit.INSTANCE;
    }

    public final void g0() {
        a0 a0Var = this.teal;
        if (a0Var == null) {
            return;
        }
        a0Var.mike(Zd.a.echo(d0() * ((Number) a0Var.lima.getValue()).longValue()));
    }

    public final void h0(float f5) {
        ((androidx.compose.runtime.n0) this.f3438a).kilo(f5);
    }
}
