package bz;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.t0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public abstract class P {
    public static final Object alpha(float f5, float f10, float f11, InterfaceC0787l interfaceC0787l, Xd.l lVar, Pd.i iVar) {
        g0 g0Var = AbstractC0779d.juliet;
        Float f12 = new Float(f5);
        Float f13 = new Float(f10);
        Float f14 = new Float(f11);
        Function1 function1 = g0Var.alpha;
        r rVar = (r) function1.invoke(f14);
        if (rVar == null) {
            rVar = ((r) function1.invoke(f12)).charlie();
        }
        r rVar2 = rVar;
        Object bravo = bravo(new C0788m(g0Var, f12, rVar2, 56), new Q(interfaceC0787l, g0Var, f12, f13, rVar2), Long.MIN_VALUE, new Ya.c(18, lVar), iVar);
        Od.a aVar = Od.a.alpha;
        if (bravo != aVar) {
            bravo = Unit.INSTANCE;
        }
        if (bravo == aVar) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x010e A[Catch: CancellationException -> 0x003b, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x003b, blocks: (B:13:0x0036, B:15:0x00f7, B:17:0x010e, B:22:0x0131, B:24:0x0144, B:31:0x0149), top: B:12:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0164 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object bravo(C0788m c0788m, InterfaceC0783h interfaceC0783h, long j5, final Function1 function1, Pd.c cVar) {
        Pd.c cVar2;
        Object obj;
        int i4;
        final Ref.ObjectRef objectRef;
        final C0788m c0788m2;
        C0788m c0788m3;
        final float golf;
        Ref.ObjectRef objectRef2;
        Object blue;
        Function1 function12;
        C0786k c0786k;
        C0786k c0786k2;
        Object obj2;
        Object blue2;
        final InterfaceC0783h interfaceC0783h2 = interfaceC0783h;
        if (cVar instanceof O) {
            O o5 = (O) cVar;
            int i5 = o5.white;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                o5.white = i5 - RecyclerView.UNDEFINED_DURATION;
                cVar2 = o5;
                O o10 = cVar2;
                Object obj3 = o10.teal;
                obj = Od.a.alpha;
                i4 = o10.white;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            objectRef = o10.silver;
                            function12 = o10.red;
                            interfaceC0783h2 = o10.purple;
                            c0788m3 = o10.alpha;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        objectRef = o10.silver;
                        function12 = o10.red;
                        interfaceC0783h2 = o10.purple;
                        c0788m3 = o10.alpha;
                    }
                    try {
                        ResultKt.alpha(obj3);
                    } catch (CancellationException e) {
                        e = e;
                        c0786k = (C0786k) objectRef.alpha;
                        if (c0786k != null) {
                            ((t0) c0786k.india).setValue(Boolean.FALSE);
                        }
                        c0786k2 = (C0786k) objectRef.alpha;
                        if (c0786k2 != null && c0786k2.golf == c0788m3.silver) {
                            c0788m3.white = false;
                        }
                        throw e;
                    }
                } else {
                    ResultKt.alpha(obj3);
                    final Object foxtrot = interfaceC0783h2.foxtrot(0L);
                    final r delta = interfaceC0783h2.delta(0L);
                    objectRef = new Ref.ObjectRef();
                    if (j5 == Long.MIN_VALUE) {
                        try {
                            golf = golf(o10.getContext());
                            c0788m2 = c0788m;
                        } catch (CancellationException e4) {
                            e = e4;
                            c0788m2 = c0788m;
                        }
                        try {
                            Function1 function13 = new Function1() { // from class: bz.L
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    long longValue = ((Long) obj4).longValue();
                                    InterfaceC0783h interfaceC0783h3 = interfaceC0783h2;
                                    g0 charlie = interfaceC0783h3.charlie();
                                    Object golf2 = interfaceC0783h3.golf();
                                    C0788m c0788m4 = c0788m2;
                                    C0786k c0786k3 = new C0786k(foxtrot, charlie, delta, longValue, golf2, longValue, new M(1, c0788m4));
                                    P.foxtrot(c0786k3, longValue, golf, interfaceC0783h3, c0788m4, function1);
                                    Ref.ObjectRef.this.alpha = c0786k3;
                                    return Unit.INSTANCE;
                                }
                            };
                            objectRef2 = objectRef;
                            try {
                                o10.alpha = c0788m2;
                                o10.purple = interfaceC0783h2;
                                o10.red = function1;
                                o10.silver = objectRef2;
                                o10.white = 1;
                                if (interfaceC0783h2.alpha()) {
                                    blue = AbstractC0779d.lima(function13, o10);
                                } else {
                                    blue = C0564b.sierra(o10.getContext()).blue(new N2.ae(6, function13), o10);
                                }
                                if (blue != obj) {
                                    function12 = function1;
                                    c0788m3 = c0788m2;
                                }
                                return obj;
                            } catch (CancellationException e5) {
                                e = e5;
                                c0788m3 = c0788m2;
                                objectRef = objectRef2;
                                c0786k = (C0786k) objectRef.alpha;
                                if (c0786k != null) {
                                }
                                c0786k2 = (C0786k) objectRef.alpha;
                                if (c0786k2 != null) {
                                }
                                throw e;
                            }
                        } catch (CancellationException e10) {
                            e = e10;
                            c0788m3 = c0788m2;
                            c0786k = (C0786k) objectRef.alpha;
                            if (c0786k != null) {
                            }
                            c0786k2 = (C0786k) objectRef.alpha;
                            if (c0786k2 != null) {
                            }
                            throw e;
                        }
                    }
                    objectRef2 = objectRef;
                    try {
                        C0786k c0786k3 = new C0786k(foxtrot, interfaceC0783h2.charlie(), delta, j5, interfaceC0783h2.golf(), j5, new M(0, c0788m));
                        foxtrot(c0786k3, j5, golf(o10.getContext()), interfaceC0783h2, c0788m, function1);
                        objectRef2.alpha = c0786k3;
                        c0788m3 = c0788m;
                        interfaceC0783h2 = interfaceC0783h;
                        function12 = function1;
                    } catch (CancellationException e11) {
                        e = e11;
                        c0788m3 = c0788m;
                        objectRef = objectRef2;
                        c0786k = (C0786k) objectRef.alpha;
                        if (c0786k != null) {
                        }
                        c0786k2 = (C0786k) objectRef.alpha;
                        if (c0786k2 != null) {
                        }
                        throw e;
                    }
                    objectRef = objectRef2;
                }
                do {
                    obj2 = objectRef.alpha;
                    Intrinsics.checkNotNull(obj2);
                    if (!((Boolean) ((t0) ((C0786k) obj2).india).getValue()).booleanValue()) {
                        final float golf2 = golf(o10.getContext());
                        final Ref.ObjectRef objectRef3 = objectRef;
                        final Function1 function14 = function12;
                        final InterfaceC0783h interfaceC0783h3 = interfaceC0783h2;
                        final C0788m c0788m4 = c0788m3;
                        try {
                            Function1 function15 = new Function1() { // from class: bz.N
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj4) {
                                    long longValue = ((Long) obj4).longValue();
                                    Object obj5 = Ref.ObjectRef.this.alpha;
                                    Intrinsics.checkNotNull(obj5);
                                    P.foxtrot((C0786k) obj5, longValue, golf2, interfaceC0783h3, c0788m4, function14);
                                    return Unit.INSTANCE;
                                }
                            };
                            objectRef = objectRef3;
                            interfaceC0783h2 = interfaceC0783h3;
                            c0788m3 = c0788m4;
                            function12 = function14;
                            o10.alpha = c0788m3;
                            o10.purple = interfaceC0783h2;
                            o10.red = function12;
                            o10.silver = objectRef;
                            o10.white = 2;
                            if (interfaceC0783h2.alpha()) {
                                blue2 = AbstractC0779d.lima(function15, o10);
                            } else {
                                blue2 = C0564b.sierra(o10.getContext()).blue(new N2.ae(6, function15), o10);
                            }
                        } catch (CancellationException e12) {
                            e = e12;
                            objectRef = objectRef3;
                            c0788m3 = c0788m4;
                            c0786k = (C0786k) objectRef.alpha;
                            if (c0786k != null) {
                            }
                            c0786k2 = (C0786k) objectRef.alpha;
                            if (c0786k2 != null) {
                                c0788m3.white = false;
                            }
                            throw e;
                        }
                    } else {
                        return Unit.INSTANCE;
                    }
                } while (blue2 != obj);
                return obj;
            }
        }
        cVar2 = new Pd.c(cVar);
        O o102 = cVar2;
        Object obj32 = o102.teal;
        obj = Od.a.alpha;
        i4 = o102.white;
        if (i4 == 0) {
        }
        do {
            obj2 = objectRef.alpha;
            Intrinsics.checkNotNull(obj2);
            if (!((Boolean) ((t0) ((C0786k) obj2).india).getValue()).booleanValue()) {
            }
        } while (blue2 != obj);
        return obj;
    }

    public static Object charlie(C0788m c0788m, C0797w c0797w, Function1 function1, Pd.c cVar) {
        Object bravo = bravo(c0788m, new C0796v(c0797w, c0788m.alpha, ((t0) c0788m.purple).getValue(), c0788m.red), Long.MIN_VALUE, function1, cVar);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    public static final Object delta(C0788m c0788m, Float f5, InterfaceC0787l interfaceC0787l, boolean z2, Function1 function1, Pd.c cVar) {
        long j5;
        Q q4 = new Q(interfaceC0787l, c0788m.alpha, ((t0) c0788m.purple).getValue(), f5, c0788m.red);
        if (z2) {
            j5 = c0788m.silver;
        } else {
            j5 = Long.MIN_VALUE;
        }
        Object bravo = bravo(c0788m, q4, j5, function1, cVar);
        if (bravo == Od.a.alpha) {
            return bravo;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ Object echo(C0788m c0788m, Float f5, InterfaceC0787l interfaceC0787l, A0.p pVar, Pd.c cVar, int i4) {
        boolean z2;
        if ((i4 & 4) != 0) {
            z2 = false;
        } else {
            z2 = true;
        }
        Function1 function1 = pVar;
        if ((i4 & 8) != 0) {
            function1 = new a5.c(15);
        }
        return delta(c0788m, f5, interfaceC0787l, z2, function1, cVar);
    }

    public static final void foxtrot(C0786k c0786k, long j5, float f5, InterfaceC0783h interfaceC0783h, C0788m c0788m, Function1 function1) {
        long j6;
        if (f5 == 0.0f) {
            j6 = interfaceC0783h.bravo();
        } else {
            j6 = ((float) (j5 - c0786k.charlie)) / f5;
        }
        c0786k.golf = j5;
        ((t0) c0786k.echo).setValue(interfaceC0783h.foxtrot(j6));
        c0786k.foxtrot = interfaceC0783h.delta(j6);
        if (interfaceC0783h.echo(j6)) {
            c0786k.hotel = c0786k.golf;
            ((t0) c0786k.india).setValue(Boolean.FALSE);
        }
        hotel(c0786k, c0788m);
        function1.invoke(c0786k);
    }

    public static final float golf(Nd.h hVar) {
        float f5;
        T.t tVar = (T.t) hVar.get(T.d.f2065i);
        if (tVar != null) {
            f5 = tVar.azure();
        } else {
            f5 = 1.0f;
        }
        if (f5 >= 0.0f) {
            return f5;
        }
        as.bravo("negative scale factor");
        return f5;
    }

    public static final void hotel(C0786k c0786k, C0788m c0788m) {
        ((t0) c0788m.purple).setValue(((t0) c0786k.echo).getValue());
        r rVar = c0788m.red;
        r rVar2 = c0786k.foxtrot;
        int bravo = rVar.bravo();
        for (int i4 = 0; i4 < bravo; i4++) {
            rVar.echo(rVar2.alpha(i4), i4);
        }
        c0788m.teal = c0786k.hotel;
        c0788m.silver = c0786k.golf;
        c0788m.white = ((Boolean) ((t0) c0786k.india).getValue()).booleanValue();
    }
}
