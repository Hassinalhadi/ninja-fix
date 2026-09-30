package yf;

import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import java.io.Serializable;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import s6.AbstractC2689j6;
import xf.EnumC3340a;

/* renamed from: yf.A, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3428A {
    public static final Af.t alpha = new Af.t("NO_VALUE", 0);
    public static final Af.t bravo;
    public static final Af.t charlie;

    static {
        int i4 = 0;
        bravo = new Af.t("NONE", i4);
        charlie = new Af.t("PENDING", i4);
    }

    public static final az alpha(int i4, int i5, EnumC3340a enumC3340a) {
        if (i4 >= 0) {
            if (i5 >= 0) {
                if (i4 <= 0 && i5 <= 0 && enumC3340a != EnumC3340a.alpha) {
                    throw new IllegalArgumentException(("replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy " + enumC3340a).toString());
                }
                int i10 = i5 + i4;
                if (i10 < 0) {
                    i10 = LottieConstants.IterateForever;
                }
                return new az(i4, i10, enumC3340a);
            }
            throw new IllegalArgumentException(ao.ad.zulu(i5, "extraBufferCapacity cannot be negative, but was ").toString());
        }
        throw new IllegalArgumentException(ao.ad.zulu(i4, "replay cannot be negative, but was ").toString());
    }

    public static /* synthetic */ az bravo(int i4, int i5, EnumC3340a enumC3340a, int i10) {
        if ((i10 & 1) != 0) {
            i4 = 0;
        }
        if ((i10 & 2) != 0) {
            i5 = 0;
        }
        if ((i10 & 4) != 0) {
            enumC3340a = EnumC3340a.alpha;
        }
        return alpha(i4, i5, enumC3340a);
    }

    public static final N charlie(Object obj) {
        if (obj == null) {
            obj = zf.b.bravo;
        }
        return new N(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void delta(InterfaceC3440j interfaceC3440j, Object obj, Object obj2, Pd.c cVar) {
        y yVar;
        int i4;
        if (cVar instanceof y) {
            y yVar2 = (y) cVar;
            int i5 = yVar2.red;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                yVar2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                yVar = yVar2;
                Object obj3 = yVar.purple;
                Object obj4 = Od.a.alpha;
                i4 = yVar.red;
                if (i4 == 0) {
                    if (i4 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = yVar.alpha;
                    ResultKt.alpha(obj3);
                } else {
                    ResultKt.alpha(obj3);
                    yVar.alpha = obj2;
                    yVar.red = 1;
                    if (interfaceC3440j.emit(obj, yVar) == obj4) {
                        return;
                    }
                }
                throw new AbortFlowException(obj2);
            }
        }
        yVar = new Pd.c(cVar);
        Object obj32 = yVar.purple;
        Object obj42 = Od.a.alpha;
        i4 = yVar.red;
        if (i4 == 0) {
        }
        throw new AbortFlowException(obj2);
    }

    public static final Object echo(Object[] objArr, long j5) {
        return objArr[((int) j5) & (objArr.length - 1)];
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object foxtrot(P p4, Xd.m mVar, Throwable th, Pd.c cVar) {
        C3444n c3444n;
        int i4;
        try {
            if (cVar instanceof C3444n) {
                C3444n c3444n2 = (C3444n) cVar;
                int i5 = c3444n2.red;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c3444n2.red = i5 - RecyclerView.UNDEFINED_DURATION;
                    c3444n = c3444n2;
                    Object obj = c3444n.purple;
                    Object obj2 = Od.a.alpha;
                    i4 = c3444n.red;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            th = c3444n.alpha;
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        c3444n.alpha = th;
                        c3444n.red = 1;
                        if (mVar.invoke(p4, th, c3444n) == obj2) {
                            return obj2;
                        }
                    }
                    return Unit.INSTANCE;
                }
            }
            if (i4 == 0) {
            }
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                AbstractC2689j6.charlie(th2, th);
            }
            throw th2;
        }
        c3444n = new Pd.c(cVar);
        Object obj3 = c3444n.purple;
        Object obj22 = Od.a.alpha;
        i4 = c3444n.red;
    }

    public static final void golf(Object[] objArr, long j5, Object obj) {
        objArr[((int) j5) & (objArr.length - 1)] = obj;
    }

    public static InterfaceC3439i hotel(InterfaceC3439i interfaceC3439i, int i4) {
        EnumC3340a enumC3340a = EnumC3340a.alpha;
        if (i4 < 0 && i4 != -2 && i4 != -1) {
            throw new IllegalArgumentException(ao.ad.zulu(i4, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was ").toString());
        }
        if (i4 == -1) {
            enumC3340a = EnumC3340a.purple;
            i4 = 0;
        }
        int i5 = i4;
        EnumC3340a enumC3340a2 = enumC3340a;
        if (interfaceC3439i instanceof zf.v) {
            return zf.b.bravo((zf.v) interfaceC3439i, null, i5, enumC3340a2, 1);
        }
        return new zf.i(interfaceC3439i, null, i5, enumC3340a2, 2);
    }

    public static final C3433c india(Xd.l lVar) {
        return new C3433c(lVar, Nd.i.alpha, -2, EnumC3340a.alpha);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Serializable juliet(InterfaceC3439i interfaceC3439i, InterfaceC3440j interfaceC3440j, Pd.c cVar) {
        t tVar;
        int i4;
        Ref.ObjectRef objectRef;
        Throwable th;
        vf.I i5;
        CancellationException quebec;
        if (cVar instanceof t) {
            t tVar2 = (t) cVar;
            int i10 = tVar2.red;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                tVar2.red = i10 - RecyclerView.UNDEFINED_DURATION;
                tVar = tVar2;
                Object obj = tVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = tVar.red;
                if (i4 == 0) {
                    if (i4 == 1) {
                        objectRef = tVar.alpha;
                        try {
                            ResultKt.alpha(obj);
                            return null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        InterfaceC3440j vVar = new v(interfaceC3440j, objectRef2);
                        tVar.alpha = objectRef2;
                        tVar.red = 1;
                        if (interfaceC3439i.collect(vVar, tVar) == aVar) {
                            return aVar;
                        }
                        return null;
                    } catch (Throwable th3) {
                        th = th3;
                        objectRef = objectRef2;
                    }
                }
                th = (Throwable) objectRef.alpha;
                if ((th == null && Intrinsics.areEqual(th, th)) || ((i5 = (vf.I) tVar.getContext().get(vf.H.alpha)) != null && i5.isCancelled() && (quebec = i5.quebec()) != null && Intrinsics.areEqual(quebec, th))) {
                    throw th;
                }
                if (th != null) {
                    return th;
                }
                if (th instanceof CancellationException) {
                    AbstractC2689j6.charlie(th, th);
                    throw th;
                }
                AbstractC2689j6.charlie(th, th);
                throw th;
            }
        }
        tVar = new Pd.c(cVar);
        Object obj2 = tVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = tVar.red;
        if (i4 == 0) {
        }
        th = (Throwable) objectRef.alpha;
        if (th == null) {
        }
        if (th != null) {
        }
    }

    public static final Object kilo(InterfaceC3439i interfaceC3439i, Xd.l lVar, Nd.c cVar) {
        int i4 = ae.alpha;
        Object collect = hotel(new zf.n(new cd.a(lVar, (Nd.c) null), interfaceC3439i, Nd.i.alpha, -2, EnumC3340a.alpha), 0).collect(zf.x.alpha, cVar);
        Od.a aVar = Od.a.alpha;
        if (collect != aVar) {
            collect = Unit.INSTANCE;
        }
        if (collect == aVar) {
            return collect;
        }
        return Unit.INSTANCE;
    }

    public static final InterfaceC3439i lima(InterfaceC3439i interfaceC3439i) {
        if (interfaceC3439i instanceof L) {
            return interfaceC3439i;
        }
        if (interfaceC3439i instanceof C3437g) {
            ((C3437g) interfaceC3439i).getClass();
            return interfaceC3439i;
        }
        return new C3437g(interfaceC3439i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0085, code lost:
    
        if (r10 == r1) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #1 {all -> 0x0035, blocks: (B:12:0x002f, B:14:0x0056, B:20:0x006b, B:22:0x0073, B:32:0x0047, B:35:0x0052), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0085 -> B:13:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object mike(InterfaceC3440j interfaceC3440j, xf.t tVar, boolean z2, Nd.c cVar) {
        C3442l c3442l;
        int i4;
        CancellationException cancellationException;
        xf.b bVar;
        InterfaceC3440j interfaceC3440j2;
        xf.b bVar2;
        Object charlie2;
        try {
            if (cVar instanceof C3442l) {
                C3442l c3442l2 = (C3442l) cVar;
                int i5 = c3442l2.white;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    c3442l2.white = i5 - RecyclerView.UNDEFINED_DURATION;
                    c3442l = c3442l2;
                    Object obj = c3442l.teal;
                    Object obj2 = Od.a.alpha;
                    i4 = c3442l.white;
                    cancellationException = null;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                z2 = c3442l.silver;
                                bVar = c3442l.red;
                                tVar = c3442l.purple;
                                InterfaceC3440j interfaceC3440j3 = c3442l.alpha;
                                ResultKt.alpha(obj);
                                InterfaceC3440j interfaceC3440j4 = interfaceC3440j3;
                                bVar2 = bVar;
                                interfaceC3440j = interfaceC3440j4;
                                c3442l.alpha = interfaceC3440j;
                                c3442l.purple = tVar;
                                c3442l.red = bVar2;
                                c3442l.silver = z2;
                                c3442l.white = 1;
                                charlie2 = bVar2.charlie(c3442l);
                                if (charlie2 == obj2) {
                                    interfaceC3440j2 = interfaceC3440j;
                                    bVar = bVar2;
                                    obj = charlie2;
                                    if (!((Boolean) obj).booleanValue()) {
                                        Object delta = bVar.delta();
                                        c3442l.alpha = interfaceC3440j2;
                                        c3442l.purple = tVar;
                                        c3442l.red = bVar;
                                        c3442l.silver = z2;
                                        c3442l.white = 2;
                                        Object emit = interfaceC3440j2.emit(delta, c3442l);
                                        interfaceC3440j4 = interfaceC3440j2;
                                    } else {
                                        if (z2) {
                                            tVar.foxtrot(null);
                                        }
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    return obj2;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            z2 = c3442l.silver;
                            bVar = c3442l.red;
                            tVar = c3442l.purple;
                            InterfaceC3440j interfaceC3440j5 = c3442l.alpha;
                            ResultKt.alpha(obj);
                            interfaceC3440j2 = interfaceC3440j5;
                            if (!((Boolean) obj).booleanValue()) {
                            }
                        }
                    } else {
                        ResultKt.alpha(obj);
                        if (!(interfaceC3440j instanceof P)) {
                            bVar2 = tVar.iterator();
                            c3442l.alpha = interfaceC3440j;
                            c3442l.purple = tVar;
                            c3442l.red = bVar2;
                            c3442l.silver = z2;
                            c3442l.white = 1;
                            charlie2 = bVar2.charlie(c3442l);
                            if (charlie2 == obj2) {
                            }
                        } else {
                            throw ((P) interfaceC3440j).alpha;
                        }
                    }
                }
            }
            if (i4 == 0) {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (z2) {
                    if (th instanceof CancellationException) {
                        cancellationException = th;
                    }
                    if (cancellationException == null) {
                        cancellationException = vf.ad.alpha("Channel was consumed, consumer had failed", th);
                    }
                    tVar.foxtrot(cancellationException);
                }
                throw th2;
            }
        }
        c3442l = new Pd.c(cVar);
        Object obj3 = c3442l.teal;
        Object obj22 = Od.a.alpha;
        i4 = c3442l.white;
        cancellationException = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object november(InterfaceC3439i interfaceC3439i, Nd.c cVar) {
        ah ahVar;
        int i4;
        Af.t tVar;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        Ba.e eVar;
        Object obj;
        if (cVar instanceof ah) {
            ah ahVar2 = (ah) cVar;
            int i5 = ahVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                ahVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                ahVar = ahVar2;
                Object obj2 = ahVar.red;
                Object obj3 = Od.a.alpha;
                i4 = ahVar.silver;
                tVar = zf.b.bravo;
                if (i4 == 0) {
                    if (i4 == 1) {
                        eVar = ahVar.purple;
                        objectRef = ahVar.alpha;
                        try {
                            ResultKt.alpha(obj2);
                        } catch (AbortFlowException e4) {
                            e = e4;
                            if (e.owner != eVar) {
                                vf.ad.oscar(ahVar.getContext());
                                obj = objectRef.alpha;
                                if (obj != tVar) {
                                }
                            } else {
                                throw e;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.alpha = tVar;
                    Ba.e eVar2 = new Ba.e(13, objectRef2);
                    try {
                        ahVar.alpha = objectRef2;
                        ahVar.purple = eVar2;
                        ahVar.silver = 1;
                        if (interfaceC3439i.collect(eVar2, ahVar) == obj3) {
                            return obj3;
                        }
                        objectRef = objectRef2;
                    } catch (AbortFlowException e5) {
                        objectRef = objectRef2;
                        e = e5;
                        eVar = eVar2;
                        if (e.owner != eVar) {
                        }
                    }
                }
                obj = objectRef.alpha;
                if (obj != tVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element");
            }
        }
        ahVar = new Pd.c(cVar);
        Object obj22 = ahVar.red;
        Object obj32 = Od.a.alpha;
        i4 = ahVar.silver;
        tVar = zf.b.bravo;
        if (i4 == 0) {
        }
        obj = objectRef.alpha;
        if (obj != tVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object oscar(InterfaceC3439i interfaceC3439i, Xd.l lVar, Pd.c cVar) {
        ai aiVar;
        int i4;
        Af.t tVar;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        ag agVar;
        Object obj;
        if (cVar instanceof ai) {
            ai aiVar2 = (ai) cVar;
            int i5 = aiVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aiVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                aiVar = aiVar2;
                Object obj2 = aiVar.red;
                Object obj3 = Od.a.alpha;
                i4 = aiVar.silver;
                tVar = zf.b.bravo;
                if (i4 == 0) {
                    if (i4 == 1) {
                        agVar = aiVar.purple;
                        objectRef = aiVar.alpha;
                        try {
                            ResultKt.alpha(obj2);
                        } catch (AbortFlowException e4) {
                            e = e4;
                            if (e.owner != agVar) {
                                vf.ad.oscar(aiVar.getContext());
                                obj = objectRef.alpha;
                                if (obj != tVar) {
                                }
                            } else {
                                throw e;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    objectRef2.alpha = tVar;
                    ag agVar2 = new ag(lVar, objectRef2, 0);
                    try {
                        aiVar.alpha = objectRef2;
                        aiVar.purple = agVar2;
                        aiVar.silver = 1;
                        if (interfaceC3439i.collect(agVar2, aiVar) == obj3) {
                            return obj3;
                        }
                        objectRef = objectRef2;
                    } catch (AbortFlowException e5) {
                        objectRef = objectRef2;
                        e = e5;
                        agVar = agVar2;
                        if (e.owner != agVar) {
                        }
                    }
                }
                obj = objectRef.alpha;
                if (obj != tVar) {
                    return obj;
                }
                throw new NoSuchElementException("Expected at least one element matching the predicate");
            }
        }
        aiVar = new Pd.c(cVar);
        Object obj22 = aiVar.red;
        Object obj32 = Od.a.alpha;
        i4 = aiVar.silver;
        tVar = zf.b.bravo;
        if (i4 == 0) {
        }
        obj = objectRef.alpha;
        if (obj != tVar) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object papa(InterfaceC3439i interfaceC3439i, Xd.l lVar, Pd.c cVar) {
        ak akVar;
        int i4;
        Ref.ObjectRef objectRef;
        AbortFlowException e;
        ag agVar;
        if (cVar instanceof ak) {
            ak akVar2 = (ak) cVar;
            int i5 = akVar2.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                akVar2.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                akVar = akVar2;
                Object obj = akVar.red;
                Object obj2 = Od.a.alpha;
                i4 = akVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        agVar = akVar.purple;
                        objectRef = akVar.alpha;
                        try {
                            ResultKt.alpha(obj);
                        } catch (AbortFlowException e4) {
                            e = e4;
                            if (e.owner != agVar) {
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    ag agVar2 = new ag(lVar, objectRef2, 1);
                    try {
                        akVar.alpha = objectRef2;
                        akVar.purple = agVar2;
                        akVar.silver = 1;
                        if (interfaceC3439i.collect(agVar2, akVar) == obj2) {
                            return obj2;
                        }
                        objectRef = objectRef2;
                    } catch (AbortFlowException e5) {
                        objectRef = objectRef2;
                        e = e5;
                        agVar = agVar2;
                        if (e.owner != agVar) {
                            vf.ad.oscar(akVar.getContext());
                            return objectRef.alpha;
                        }
                        throw e;
                    }
                }
                return objectRef.alpha;
            }
        }
        akVar = new Pd.c(cVar);
        Object obj3 = akVar.red;
        Object obj22 = Od.a.alpha;
        i4 = akVar.silver;
        if (i4 == 0) {
        }
        return objectRef.alpha;
    }

    public static final InterfaceC3439i quebec(aw awVar, Nd.h hVar, int i4, EnumC3340a enumC3340a) {
        if ((i4 == 0 || i4 == -3) && enumC3340a == EnumC3340a.alpha) {
            return awVar;
        }
        return new zf.h(awVar, hVar, i4, enumC3340a);
    }

    public static final av romeo(InterfaceC3439i interfaceC3439i, vf.ab abVar, E e, Object obj) {
        com.google.android.play.core.integrity.c cVar;
        vf.ac acVar;
        zf.f fVar;
        InterfaceC3439i foxtrot;
        int i4 = 14;
        xf.i.pink.getClass();
        xf.h hVar = xf.h.alpha;
        if ((interfaceC3439i instanceof zf.f) && (foxtrot = (fVar = (zf.f) interfaceC3439i).foxtrot()) != null) {
            int i5 = fVar.purple;
            if (i5 == -3 || i5 == -2 || i5 == 0) {
                EnumC3340a enumC3340a = EnumC3340a.alpha;
            }
            cVar = new com.google.android.play.core.integrity.c(i4, foxtrot, fVar.alpha);
        } else {
            EnumC3340a enumC3340a2 = EnumC3340a.alpha;
            cVar = new com.google.android.play.core.integrity.c(i4, interfaceC3439i, Nd.i.alpha);
        }
        N charlie2 = charlie(obj);
        if (Intrinsics.areEqual(e, D.alpha)) {
            acVar = vf.ac.alpha;
        } else {
            acVar = vf.ac.silver;
        }
        vf.ad.yankee(abVar, (Nd.h) cVar.red, acVar, new an(e, (InterfaceC3439i) cVar.purple, charlie2, obj, null));
        return new av(charlie2);
    }
}
