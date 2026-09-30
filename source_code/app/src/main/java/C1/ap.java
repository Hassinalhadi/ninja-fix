package C1;

import androidx.datastore.core.CorruptionException;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;
import s6.AbstractC2689j6;
import t6.AbstractC3017k3;
import vf.C3213q;
import vf.H;
import vf.I;
import vf.InterfaceC3212p;
import vf.Y;
import yf.InterfaceC3439i;

/* loaded from: classes3.dex */
public final class ap implements h {
    public final E1.f alpha;
    public final D8.c bravo;
    public final vf.ab charlie;
    public final t delta;
    public final Ef.c echo;
    public int foxtrot;
    public Y golf;
    public final D8.c hotel;
    public final com.google.firebase.messaging.o india;
    public final Lazy juliet;
    public final Lazy kilo;
    public final J2.i lima;

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.google.firebase.messaging.o] */
    /* JADX WARN: Type inference failed for: r4v9, types: [J2.i, java.lang.Object] */
    public ap(E1.f fVar, List list, D8.c cVar, vf.ab scope) {
        Intrinsics.echo(scope, "scope");
        this.alpha = fVar;
        this.bravo = cVar;
        this.charlie = scope;
        this.delta = new t(new u(this, null));
        this.echo = Ef.d.alpha();
        this.hotel = new D8.c(8);
        ?? obj = new Object();
        obj.delta = this;
        obj.alpha = Ef.d.alpha();
        obj.bravo = vf.ad.bravo();
        obj.charlie = CollectionsKt.z(list);
        this.india = obj;
        this.juliet = LazyKt.lazy(new m(this, 1));
        this.kilo = LazyKt.lazy(new m(this, 0));
        A0.p pVar = new A0.p(4, this);
        am amVar = new am(this, null);
        al onUndeliveredElement = al.alpha;
        Intrinsics.echo(scope, "scope");
        Intrinsics.echo(onUndeliveredElement, "onUndeliveredElement");
        ?? obj2 = new Object();
        obj2.alpha = scope;
        obj2.purple = amVar;
        obj2.red = AbstractC3017k3.bravo(LottieConstants.IterateForever, 6, null);
        obj2.silver = new Aa.m(6);
        I i4 = (I) scope.charlie().get(H.alpha);
        if (i4 != null) {
            i4.crimson(new av(pVar, obj2, onUndeliveredElement, 0));
        }
        this.lima = obj2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053 A[Catch: all -> 0x005d, TryCatch #0 {all -> 0x005d, blocks: (B:12:0x004b, B:14:0x0053, B:16:0x0057, B:17:0x005a), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object charlie(ap apVar, Pd.c cVar) {
        v vVar;
        int i4;
        Ef.c cVar2;
        int i5;
        apVar.getClass();
        try {
            if (cVar instanceof v) {
                vVar = (v) cVar;
                int i10 = vVar.teal;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    vVar.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = vVar.red;
                    Od.a aVar = Od.a.alpha;
                    i4 = vVar.teal;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            Ef.c cVar3 = vVar.purple;
                            ap apVar2 = vVar.alpha;
                            ResultKt.alpha(obj);
                            cVar2 = cVar3;
                            apVar = apVar2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        vVar.alpha = apVar;
                        cVar2 = apVar.echo;
                        vVar.purple = cVar2;
                        vVar.teal = 1;
                        if (cVar2.delta(vVar) == aVar) {
                            return aVar;
                        }
                    }
                    i5 = apVar.foxtrot - 1;
                    apVar.foxtrot = i5;
                    if (i5 == 0) {
                        Y y10 = apVar.golf;
                        if (y10 != null) {
                            y10.foxtrot(null);
                        }
                        apVar.golf = null;
                    }
                    cVar2.foxtrot(null);
                    return Unit.INSTANCE;
                }
            }
            i5 = apVar.foxtrot - 1;
            apVar.foxtrot = i5;
            if (i5 == 0) {
            }
            cVar2.foxtrot(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cVar2.foxtrot(null);
            throw th;
        }
        vVar = new v(apVar, cVar);
        Object obj2 = vVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = vVar.teal;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(7:(1:(1:(1:12)(2:23|24))(3:25|26|27))(1:39)|13|14|15|(1:17)(1:21)|18|19)(5:40|41|42|(3:44|45|46)(3:50|(1:52)(1:67)|(2:54|(2:56|(1:58))(2:59|60))(2:61|(2:63|64)(2:65|66)))|33)|28|29|30))|70|6|7|(0)(0)|28|29|30|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bf, code lost:
    
        if (r9 != r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        r8 = r11;
        r11 = r9;
        r9 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c7, code lost:
    
        r9 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x007b, code lost:
    
        if (r9 == r1) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0036, code lost:
    
        r10 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /* JADX WARN: Type inference failed for: r2v7, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r2v8, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r9v0, types: [C1.ap, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object delta(ap apVar, as asVar, Pd.c cVar) {
        x xVar;
        int i4;
        Object m206constructorimpl;
        C3213q c3213q;
        Throwable m207exceptionOrNullimpl;
        C3213q c3213q2;
        Object bravo;
        ap apVar2;
        InterfaceC3212p interfaceC3212p;
        apVar.getClass();
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i5 = xVar.white;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                xVar.white = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = xVar.silver;
                Od.a aVar = Od.a.alpha;
                i4 = xVar.white;
                boolean z2 = true;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                interfaceC3212p = (InterfaceC3212p) xVar.alpha;
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            C3213q c3213q3 = xVar.red;
                            ap apVar3 = xVar.purple;
                            as asVar2 = (as) xVar.alpha;
                            ResultKt.alpha(obj);
                            c3213q2 = c3213q3;
                            apVar2 = apVar3;
                            asVar = asVar2;
                        }
                    } else {
                        interfaceC3212p = (InterfaceC3212p) xVar.alpha;
                    }
                    ResultKt.alpha(obj);
                    apVar = interfaceC3212p;
                    m206constructorimpl = Result.m206constructorimpl(obj);
                    c3213q = apVar;
                    m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                    C3213q c3213q4 = c3213q;
                    if (m207exceptionOrNullimpl != null) {
                        c3213q4.magenta(m206constructorimpl);
                    } else {
                        c3213q4.yellow(m207exceptionOrNullimpl);
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.alpha(obj);
                c3213q2 = asVar.bravo;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    B echo = apVar.hotel.echo();
                    if (echo instanceof C0080b) {
                        ?? r22 = asVar.alpha;
                        Nd.h hVar = asVar.delta;
                        xVar.alpha = c3213q2;
                        xVar.white = 1;
                        try {
                            bravo = apVar.hotel().bravo(new aj(apVar, hVar, r22, null), xVar);
                        } catch (Throwable th) {
                            th = th;
                            th = th;
                            apVar = c3213q2;
                            Result.Companion companion2 = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                            c3213q = apVar;
                            m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                            C3213q c3213q42 = c3213q;
                            if (m207exceptionOrNullimpl != null) {
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (!(echo instanceof at)) {
                            z2 = echo instanceof C;
                        }
                        if (z2) {
                            if (echo == asVar.charlie) {
                                xVar.alpha = asVar;
                                xVar.purple = apVar;
                                xVar.red = c3213q2;
                                xVar.white = 2;
                                Object india = apVar.india(xVar);
                                apVar2 = apVar;
                                if (india == aVar) {
                                }
                            } else {
                                Intrinsics.charlie(echo, "null cannot be cast to non-null type androidx.datastore.core.ReadException<T of androidx.datastore.core.DataStoreImpl.handleUpdate$lambda$2>");
                                throw ((at) echo).bravo;
                            }
                        } else {
                            if (echo instanceof aq) {
                                throw ((aq) echo).bravo;
                            }
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                    return aVar;
                } catch (Throwable th2) {
                    th = th2;
                    apVar = c3213q2;
                    Result.Companion companion22 = Result.INSTANCE;
                    m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
                    c3213q = apVar;
                    m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                    C3213q c3213q422 = c3213q;
                    if (m207exceptionOrNullimpl != null) {
                    }
                    return Unit.INSTANCE;
                }
                ?? r23 = asVar.alpha;
                Nd.h hVar2 = asVar.delta;
                xVar.alpha = c3213q2;
                xVar.purple = null;
                xVar.red = null;
                xVar.white = 3;
                bravo = apVar2.hotel().bravo(new aj(apVar2, hVar2, r23, null), xVar);
            }
        }
        xVar = new x(apVar, cVar);
        Object obj2 = xVar.silver;
        Od.a aVar2 = Od.a.alpha;
        i4 = xVar.white;
        boolean z22 = true;
        if (i4 == 0) {
        }
        ?? r232 = asVar.alpha;
        Nd.h hVar22 = asVar.delta;
        xVar.alpha = c3213q2;
        xVar.purple = null;
        xVar.red = null;
        xVar.white = 3;
        bravo = apVar2.hotel().bravo(new aj(apVar2, hVar22, r232, null), xVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052 A[Catch: all -> 0x0061, TRY_LEAVE, TryCatch #0 {all -> 0x0061, blocks: (B:12:0x004b, B:14:0x0052), top: B:11:0x004b }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object echo(ap apVar, Pd.c cVar) {
        y yVar;
        int i4;
        Ef.c cVar2;
        int i5;
        apVar.getClass();
        try {
            if (cVar instanceof y) {
                yVar = (y) cVar;
                int i10 = yVar.teal;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    yVar.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = yVar.red;
                    Od.a aVar = Od.a.alpha;
                    i4 = yVar.teal;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            Ef.c cVar3 = yVar.purple;
                            ap apVar2 = yVar.alpha;
                            ResultKt.alpha(obj);
                            cVar2 = cVar3;
                            apVar = apVar2;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        yVar.alpha = apVar;
                        cVar2 = apVar.echo;
                        yVar.purple = cVar2;
                        yVar.teal = 1;
                        if (cVar2.delta(yVar) == aVar) {
                            return aVar;
                        }
                    }
                    i5 = apVar.foxtrot + 1;
                    apVar.foxtrot = i5;
                    if (i5 == 1) {
                        apVar.golf = vf.ad.zulu(apVar.charlie, null, null, new z(apVar, null), 3);
                    }
                    cVar2.foxtrot(null);
                    return Unit.INSTANCE;
                }
            }
            i5 = apVar.foxtrot + 1;
            apVar.foxtrot = i5;
            if (i5 == 1) {
            }
            cVar2.foxtrot(null);
            return Unit.INSTANCE;
        } catch (Throwable th) {
            cVar2.foxtrot(null);
            throw th;
        }
        yVar = new y(apVar, cVar);
        Object obj2 = yVar.red;
        Od.a aVar2 = Od.a.alpha;
        i4 = yVar.teal;
        if (i4 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object foxtrot(ap apVar, boolean z2, Nd.c cVar) {
        ab abVar;
        Od.a aVar;
        int i4;
        ap apVar2;
        B b2;
        boolean z10;
        int i5;
        ap apVar3;
        Pair pair;
        apVar.getClass();
        if (cVar instanceof ab) {
            abVar = (ab) cVar;
            int i10 = abVar.white;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                abVar.white = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj = abVar.silver;
                aVar = Od.a.alpha;
                i4 = abVar.white;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 == 3) {
                                apVar3 = abVar.alpha;
                                ResultKt.alpha(obj);
                                pair = (Pair) obj;
                                B b4 = (B) pair.first;
                                if (((Boolean) pair.second).booleanValue()) {
                                    apVar3.hotel.november(b4);
                                }
                                return b4;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        apVar3 = abVar.alpha;
                        ResultKt.alpha(obj);
                        pair = (Pair) obj;
                        B b42 = (B) pair.first;
                        if (((Boolean) pair.second).booleanValue()) {
                        }
                        return b42;
                    }
                    z2 = abVar.red;
                    b2 = abVar.purple;
                    apVar2 = abVar.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    B echo = apVar.hotel.echo();
                    if (!(echo instanceof C)) {
                        A hotel = apVar.hotel();
                        abVar.alpha = apVar;
                        abVar.purple = echo;
                        abVar.red = z2;
                        abVar.white = 1;
                        Integer alpha = hotel.alpha();
                        if (alpha != aVar) {
                            apVar2 = apVar;
                            b2 = echo;
                            obj = alpha;
                        }
                        return aVar;
                    }
                    throw new IllegalStateException("This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542");
                }
                int intValue = ((Number) obj).intValue();
                z10 = b2 instanceof C0080b;
                if (!z10) {
                    i5 = b2.alpha;
                } else {
                    i5 = -1;
                }
                if (!z10 && intValue == i5) {
                    return b2;
                }
                if (!z2) {
                    A hotel2 = apVar2.hotel();
                    ac acVar = new ac(apVar2, null);
                    abVar.alpha = apVar2;
                    abVar.purple = null;
                    abVar.white = 2;
                    obj = hotel2.bravo(acVar, abVar);
                    if (obj != aVar) {
                        apVar3 = apVar2;
                        pair = (Pair) obj;
                        B b422 = (B) pair.first;
                        if (((Boolean) pair.second).booleanValue()) {
                        }
                        return b422;
                    }
                } else {
                    A hotel3 = apVar2.hotel();
                    ad adVar = new ad(apVar2, i5, null);
                    abVar.alpha = apVar2;
                    abVar.purple = null;
                    abVar.white = 3;
                    obj = hotel3.charlie(adVar, abVar);
                    if (obj != aVar) {
                        apVar3 = apVar2;
                        pair = (Pair) obj;
                        B b4222 = (B) pair.first;
                        if (((Boolean) pair.second).booleanValue()) {
                        }
                        return b4222;
                    }
                }
                return aVar;
            }
        }
        abVar = new ab(apVar, cVar);
        Object obj2 = abVar.silver;
        aVar = Od.a.alpha;
        i4 = abVar.white;
        if (i4 == 0) {
        }
        int intValue2 = ((Number) obj2).intValue();
        z10 = b2 instanceof C0080b;
        if (!z10) {
        }
        if (!z10) {
        }
        if (!z2) {
        }
        return aVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(4:5|6|7|8))|72|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0062, code lost:
    
        r11 = e;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:8:0x0023. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0142 A[Catch: all -> 0x016e, TryCatch #2 {all -> 0x016e, blocks: (B:27:0x0130, B:29:0x0142, B:32:0x014a), top: B:26:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x014a A[Catch: all -> 0x016e, TRY_LEAVE, TryCatch #2 {all -> 0x016e, blocks: (B:27:0x0130, B:29:0x0142, B:32:0x014a), top: B:26:0x0130 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2 A[Catch: CorruptionException -> 0x0062, TryCatch #1 {CorruptionException -> 0x0062, blocks: (B:36:0x005d, B:37:0x0101, B:40:0x006b, B:41:0x00e3, B:56:0x0088, B:58:0x00a2, B:59:0x00a8, B:65:0x0091, B:68:0x00d0), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /* JADX WARN: Type inference failed for: r10v4, types: [kotlin.jvm.internal.s, java.lang.Object, java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object golf(ap apVar, boolean z2, Pd.c cVar) {
        ae aeVar;
        Ref.ObjectRef objectRef;
        CorruptionException corruptionException;
        ap apVar2;
        boolean z10;
        Ref.ObjectRef objectRef2;
        CorruptionException corruptionException2;
        Object bravo;
        kotlin.jvm.internal.s sVar;
        Ref.ObjectRef objectRef3;
        Object obj;
        int i4;
        Integer alpha;
        ap apVar3;
        int i5;
        Object obj2;
        apVar.getClass();
        if (cVar instanceof ae) {
            aeVar = (ae) cVar;
            int i10 = aeVar.f773t;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                aeVar.f773t = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj3 = aeVar.yellow;
                Object obj4 = Od.a.alpha;
                int i11 = 0;
                switch (aeVar.f773t) {
                    case 0:
                        ResultKt.alpha(obj3);
                        if (z2) {
                            aeVar.alpha = apVar;
                            aeVar.teal = z2;
                            aeVar.f773t = 1;
                            obj3 = apVar.juliet(aeVar);
                            if (obj3 == obj4) {
                            }
                            if (obj3 == null) {
                                i4 = obj3.hashCode();
                            } else {
                                i4 = 0;
                            }
                            A hotel = apVar.hotel();
                            aeVar.alpha = apVar;
                            aeVar.purple = obj3;
                            aeVar.teal = z2;
                            aeVar.white = i4;
                            aeVar.f773t = 2;
                            alpha = hotel.alpha();
                            if (alpha != obj4) {
                                apVar3 = apVar;
                                i5 = i4;
                                obj2 = obj3;
                                obj3 = alpha;
                                return new C0080b(obj2, i5, ((Number) obj3).intValue());
                            }
                        } else {
                            A hotel2 = apVar.hotel();
                            aeVar.alpha = apVar;
                            aeVar.teal = z2;
                            aeVar.f773t = 3;
                            obj3 = hotel2.alpha();
                            if (obj3 == obj4) {
                            }
                            int intValue = ((Number) obj3).intValue();
                            A hotel3 = apVar.hotel();
                            af afVar = new af(apVar, intValue, null);
                            aeVar.alpha = apVar;
                            aeVar.teal = z2;
                            aeVar.f773t = 4;
                            obj3 = hotel3.charlie(afVar, aeVar);
                            if (obj3 == obj4) {
                            }
                            return (C0080b) obj3;
                        }
                        return obj4;
                    case 1:
                        z2 = aeVar.teal;
                        apVar = (ap) aeVar.alpha;
                        ResultKt.alpha(obj3);
                        if (obj3 == null) {
                        }
                        A hotel4 = apVar.hotel();
                        aeVar.alpha = apVar;
                        aeVar.purple = obj3;
                        aeVar.teal = z2;
                        aeVar.white = i4;
                        aeVar.f773t = 2;
                        alpha = hotel4.alpha();
                        if (alpha != obj4) {
                        }
                        return obj4;
                    case 2:
                        i5 = aeVar.white;
                        z2 = aeVar.teal;
                        obj2 = aeVar.purple;
                        apVar3 = (ap) aeVar.alpha;
                        try {
                            ResultKt.alpha(obj3);
                            return new C0080b(obj2, i5, ((Number) obj3).intValue());
                        } catch (CorruptionException e) {
                            e = e;
                            apVar = apVar3;
                            objectRef = new Ref.ObjectRef();
                            D8.c cVar2 = apVar.bravo;
                            aeVar.alpha = apVar;
                            aeVar.purple = e;
                            aeVar.red = objectRef;
                            aeVar.silver = objectRef;
                            aeVar.teal = z2;
                            aeVar.f773t = 5;
                            Object invoke = ((Lambda) cVar2.purple).invoke(e);
                            if (invoke != obj4) {
                                corruptionException = e;
                                obj3 = invoke;
                                apVar2 = apVar;
                                z10 = z2;
                                objectRef2 = objectRef;
                                objectRef2.alpha = obj3;
                                ?? obj5 = new Object();
                                try {
                                    ag agVar = new ag(objectRef, apVar2, obj5, null);
                                    aeVar.alpha = corruptionException;
                                    aeVar.purple = objectRef;
                                    aeVar.red = obj5;
                                    aeVar.silver = null;
                                    aeVar.f773t = 6;
                                    if (!z10) {
                                    }
                                    if (bravo != obj4) {
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    corruptionException2 = corruptionException;
                                    AbstractC2689j6.charlie(corruptionException2, th);
                                    throw corruptionException2;
                                }
                            }
                            return obj4;
                        }
                    case 3:
                        z2 = aeVar.teal;
                        apVar = (ap) aeVar.alpha;
                        ResultKt.alpha(obj3);
                        int intValue2 = ((Number) obj3).intValue();
                        A hotel32 = apVar.hotel();
                        af afVar2 = new af(apVar, intValue2, null);
                        aeVar.alpha = apVar;
                        aeVar.teal = z2;
                        aeVar.f773t = 4;
                        obj3 = hotel32.charlie(afVar2, aeVar);
                        if (obj3 == obj4) {
                        }
                        return (C0080b) obj3;
                    case 4:
                        boolean z11 = aeVar.teal;
                        ResultKt.alpha(obj3);
                        return (C0080b) obj3;
                    case 5:
                        z10 = aeVar.teal;
                        objectRef2 = aeVar.silver;
                        objectRef = (Ref.ObjectRef) aeVar.red;
                        corruptionException = (CorruptionException) aeVar.purple;
                        apVar2 = (ap) aeVar.alpha;
                        ResultKt.alpha(obj3);
                        objectRef2.alpha = obj3;
                        ?? obj52 = new Object();
                        ag agVar2 = new ag(objectRef, apVar2, obj52, null);
                        aeVar.alpha = corruptionException;
                        aeVar.purple = objectRef;
                        aeVar.red = obj52;
                        aeVar.silver = null;
                        aeVar.f773t = 6;
                        if (!z10) {
                            apVar2.getClass();
                            bravo = agVar2.invoke(aeVar);
                        } else {
                            bravo = apVar2.hotel().bravo(new w(agVar2, null), aeVar);
                        }
                        if (bravo != obj4) {
                            sVar = obj52;
                            objectRef3 = objectRef;
                            obj = objectRef3.alpha;
                            if (obj != null) {
                                i11 = obj.hashCode();
                            }
                            obj4 = new C0080b(obj, i11, sVar.alpha);
                        }
                        return obj4;
                    case 6:
                        sVar = (kotlin.jvm.internal.s) aeVar.red;
                        objectRef3 = (Ref.ObjectRef) aeVar.purple;
                        corruptionException2 = (CorruptionException) aeVar.alpha;
                        try {
                            ResultKt.alpha(obj3);
                            obj = objectRef3.alpha;
                            if (obj != null) {
                            }
                            obj4 = new C0080b(obj, i11, sVar.alpha);
                            return obj4;
                        } catch (Throwable th2) {
                            th = th2;
                            AbstractC2689j6.charlie(corruptionException2, th);
                            throw corruptionException2;
                        }
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        aeVar = new ae(apVar, cVar);
        Object obj32 = aeVar.yellow;
        Object obj42 = Od.a.alpha;
        int i112 = 0;
        switch (aeVar.f773t) {
        }
    }

    @Override // C1.h
    public final InterfaceC3439i alpha() {
        return this.delta;
    }

    @Override // C1.h
    public final Object bravo(Xd.l lVar, Pd.c cVar) {
        E e = (E) cVar.getContext().get(D.alpha);
        if (e != null) {
            e.alpha(this);
        }
        return vf.ad.blue(new E(e, this), new ak(this, lVar, null), cVar);
    }

    public final A hotel() {
        return (A) this.kilo.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0063, code lost:
    
        if (r4.sierra(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object india(Pd.c cVar) {
        aa aaVar;
        int i4;
        ap apVar;
        int intValue;
        int i5;
        Throwable th;
        ap apVar2;
        try {
            if (cVar instanceof aa) {
                aaVar = (aa) cVar;
                int i10 = aaVar.teal;
                if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    aaVar.teal = i10 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = aaVar.red;
                    Object obj2 = Od.a.alpha;
                    i4 = aaVar.teal;
                    if (i4 == 0) {
                        if (i4 != 1) {
                            if (i4 == 2) {
                                i5 = aaVar.purple;
                                apVar2 = aaVar.alpha;
                                try {
                                    ResultKt.alpha(obj);
                                    return Unit.INSTANCE;
                                } catch (Throwable th2) {
                                    th = th2;
                                    apVar2.hotel.november(new at(i5, th));
                                    throw th;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        apVar = aaVar.alpha;
                        ResultKt.alpha(obj);
                    } else {
                        ResultKt.alpha(obj);
                        A hotel = hotel();
                        aaVar.alpha = this;
                        aaVar.teal = 1;
                        obj = hotel.alpha();
                        if (obj != obj2) {
                            apVar = this;
                        }
                        return obj2;
                    }
                    intValue = ((Number) obj).intValue();
                    com.google.firebase.messaging.o oVar = apVar.india;
                    aaVar.alpha = apVar;
                    aaVar.purple = intValue;
                    aaVar.teal = 2;
                }
            }
            com.google.firebase.messaging.o oVar2 = apVar.india;
            aaVar.alpha = apVar;
            aaVar.purple = intValue;
            aaVar.teal = 2;
        } catch (Throwable th3) {
            i5 = intValue;
            th = th3;
            apVar2 = apVar;
            apVar2.hotel.november(new at(i5, th));
            throw th;
        }
        aaVar = new aa(this, cVar);
        Object obj3 = aaVar.red;
        Object obj22 = Od.a.alpha;
        i4 = aaVar.teal;
        if (i4 == 0) {
        }
        intValue = ((Number) obj3).intValue();
    }

    public final Object juliet(Pd.c cVar) {
        return ((E1.i) this.juliet.getValue()).alpha(new q(3, (Nd.c) null), cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.jvm.internal.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object kilo(Object obj, boolean z2, Pd.c cVar) {
        an anVar;
        int i4;
        kotlin.jvm.internal.s sVar;
        if (cVar instanceof an) {
            anVar = (an) cVar;
            int i5 = anVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                anVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj2 = anVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = anVar.silver;
                if (i4 == 0) {
                    if (i4 == 1) {
                        sVar = anVar.alpha;
                        ResultKt.alpha(obj2);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj2);
                    ?? obj3 = new Object();
                    E1.i iVar = (E1.i) this.juliet.getValue();
                    ao aoVar = new ao(obj3, this, obj, z2, null);
                    anVar.alpha = obj3;
                    anVar.silver = 1;
                    if (iVar.bravo(aoVar, anVar) == aVar) {
                        return aVar;
                    }
                    sVar = obj3;
                }
                return new Integer(sVar.alpha);
            }
        }
        anVar = new an(this, cVar);
        Object obj22 = anVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = anVar.silver;
        if (i4 == 0) {
        }
        return new Integer(sVar.alpha);
    }
}
