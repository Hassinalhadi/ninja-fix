package cd;

import Dd.f;
import Pd.i;
import Xd.l;
import Xd.m;
import Xd.o;
import com.checkout.components.card.U;
import d.C1534h0;
import dd.C1614e;
import hd.ah;
import hd.ai;
import hd.n;
import hd.v;
import id.C1914b;
import io.ktor.utils.io.ak;
import io.ktor.utils.io.t;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import od.C2226c;
import pd.AbstractC2304b;
import pd.C2303a;
import pd.C2305c;
import s6.AbstractC2790v0;
import vf.C3215t;
import vf.H;
import vf.I;
import vf.J;
import vf.ab;
import vf.r;
import yf.InterfaceC3440j;

/* loaded from: classes2.dex */
public final class a extends i implements m {
    public final /* synthetic */ int alpha;
    public int purple;
    public /* synthetic */ Object red;
    public Object silver;
    public /* synthetic */ Object teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(int i4, Nd.c cVar) {
        super(i4, cVar);
        this.alpha = 2;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r1v17, types: [Xd.m, Pd.i] */
    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.alpha) {
            case 0:
                a aVar = new a((c) this.teal, (Nd.c) obj3, 0);
                aVar.red = (f) obj;
                aVar.silver = obj2;
                return aVar.invokeSuspend(Unit.INSTANCE);
            case 1:
                a aVar2 = new a((l) this.teal, (Nd.c) obj3, 1);
                aVar2.red = (f) obj;
                aVar2.silver = (AbstractC2304b) obj2;
                return aVar2.invokeSuspend(Unit.INSTANCE);
            case 2:
                a aVar3 = new a(3, (Nd.c) obj3);
                aVar3.red = (f) obj;
                aVar3.teal = (AbstractC2304b) obj2;
                return aVar3.invokeSuspend(Unit.INSTANCE);
            case 3:
                a aVar4 = new a((List) this.teal, (Nd.c) obj3, 3);
                aVar4.red = (id.f) obj;
                aVar4.silver = (C2226c) obj2;
                return aVar4.invokeSuspend(Unit.INSTANCE);
            case 4:
                a aVar5 = new a((C1914b) this.teal, (Nd.c) obj3, 4);
                aVar5.red = (id.f) obj;
                aVar5.silver = (C2226c) obj2;
                return aVar5.invokeSuspend(Unit.INSTANCE);
            case 5:
                a aVar6 = new a((C1914b) this.teal, (Nd.c) obj3, 5);
                aVar6.silver = (C2226c) obj;
                aVar6.red = (Function1) obj2;
                return aVar6.invokeSuspend(Unit.INSTANCE);
            case 6:
                a aVar7 = new a((o) this.teal, (Nd.c) obj3, 6);
                aVar7.red = (f) obj;
                return aVar7.invokeSuspend(Unit.INSTANCE);
            case 7:
                a aVar8 = new a((l) this.teal, (Nd.c) obj3);
                aVar8.red = (InterfaceC3440j) obj;
                aVar8.silver = obj2;
                return aVar8.invokeSuspend(Unit.INSTANCE);
            case 8:
                a aVar9 = new a((Nd.c) obj3, (U) this.teal);
                aVar9.red = (InterfaceC3440j) obj;
                aVar9.silver = (Object[]) obj2;
                return aVar9.invokeSuspend(Unit.INSTANCE);
            default:
                a aVar10 = new a((m) this.teal, (Nd.c) obj3);
                aVar10.red = (InterfaceC3440j) obj;
                aVar10.silver = (Object[]) obj2;
                return aVar10.invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:148|(1:(1:(3:152|153|154)(2:155|156))(4:157|158|159|160))(2:186|(4:188|(1:190)|191|192)(5:193|194|(1:196)|197|(1:200)(1:199)))|161|162|163|164|(1:166)|167|(1:169)|153|154) */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0393, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0394, code lost:
    
        r1 = kotlin.Result.INSTANCE;
        r0 = kotlin.Result.m206constructorimpl(kotlin.ResultKt.createFailure(r0));
     */
    /* JADX WARN: Removed duplicated region for block: B:180:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v23, types: [Xd.l, Pd.i] */
    /* JADX WARN: Type inference failed for: r4v25, types: [Xd.m, Pd.i] */
    /* JADX WARN: Type inference failed for: r5v19, types: [vf.a0, vf.P, java.lang.Object, vf.J] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        f fVar;
        f fVar2;
        zd.i beige;
        Throwable th;
        AbstractC2304b abstractC2304b;
        f fVar3;
        Object m206constructorimpl;
        Throwable m207exceptionOrNullimpl;
        C2226c c2226c;
        id.f fVar4;
        Throwable th2;
        r rVar;
        f fVar5;
        Ed.a aVar;
        InterfaceC3440j interfaceC3440j;
        InterfaceC3440j interfaceC3440j2;
        a aVar2;
        InterfaceC3440j interfaceC3440j3;
        switch (this.alpha) {
            case 0:
                Od.a aVar3 = Od.a.alpha;
                int i4 = this.purple;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj2 = this.silver;
                    fVar = (f) this.red;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    f fVar6 = (f) this.red;
                    obj2 = this.silver;
                    if (obj2 instanceof C1614e) {
                        C2303a c2303a = ((c) this.teal).yellow;
                        Unit unit = Unit.INSTANCE;
                        AbstractC2304b echo = ((C1614e) obj2).echo();
                        this.red = fVar6;
                        this.silver = obj2;
                        this.purple = 1;
                        Object alpha = c2303a.alpha(unit, echo, this);
                        if (alpha != aVar3) {
                            fVar = fVar6;
                            obj = alpha;
                        } else {
                            return aVar3;
                        }
                    } else {
                        throw new IllegalStateException(("Error: HttpClientCall expected, but found " + obj2 + '(' + u.alpha.bravo(obj2.getClass()) + ").").toString());
                    }
                }
                AbstractC2304b response = (AbstractC2304b) obj;
                C1614e c1614e = (C1614e) obj2;
                c1614e.getClass();
                Intrinsics.echo(response, "response");
                c1614e.red = response;
                this.red = null;
                this.silver = null;
                this.purple = 2;
                if (fVar.echo(this, obj2) == aVar3) {
                    return aVar3;
                }
                return Unit.INSTANCE;
            case 1:
                Od.a aVar4 = Od.a.alpha;
                int i5 = this.purple;
                if (i5 != 0) {
                    if (i5 != 1) {
                        if (i5 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    fVar2 = (f) this.red;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    fVar2 = (f) this.red;
                    AbstractC2304b abstractC2304b2 = (AbstractC2304b) this.silver;
                    this.red = fVar2;
                    this.purple = 1;
                    obj = ((l) this.teal).invoke(abstractC2304b2, this);
                    if (obj == aVar4) {
                        return aVar4;
                    }
                }
                AbstractC2304b abstractC2304b3 = (AbstractC2304b) obj;
                if (abstractC2304b3 != null) {
                    this.red = null;
                    this.purple = 2;
                    if (fVar2.echo(this, abstractC2304b3) == aVar4) {
                        return aVar4;
                    }
                }
                return Unit.INSTANCE;
            case 2:
                Od.a aVar5 = Od.a.alpha;
                int i10 = this.purple;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zd.i iVar = (zd.i) this.silver;
                    abstractC2304b = (AbstractC2304b) this.teal;
                    fVar3 = (f) this.red;
                    try {
                        ResultKt.alpha(obj);
                        beige = iVar;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            Result.Companion companion = Result.INSTANCE;
                            ak.bravo(abstractC2304b.delta());
                            m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                        } catch (Throwable th4) {
                            Result.Companion companion2 = Result.INSTANCE;
                            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th4));
                        }
                        m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                        if (m207exceptionOrNullimpl == null) {
                            n.alpha().golf(m207exceptionOrNullimpl);
                            throw th;
                        }
                        throw th;
                    }
                } else {
                    ResultKt.alpha(obj);
                    f fVar7 = (f) this.red;
                    AbstractC2304b abstractC2304b4 = (AbstractC2304b) this.teal;
                    C1614e bravo = abstractC2304b4.bravo();
                    beige = bravo.beige();
                    if (beige.bravo(n.alpha)) {
                        rg.b alpha2 = n.alpha();
                        Intrinsics.echo(alpha2, "<this>");
                        if (alpha2.foxtrot()) {
                            alpha2.hotel("Skipping body saving for " + bravo.delta().getUrl());
                        }
                        return Unit.INSTANCE;
                    }
                    try {
                        rg.b alpha3 = n.alpha();
                        Intrinsics.echo(alpha3, "<this>");
                        if (alpha3.foxtrot()) {
                            alpha3.hotel("Saving body for " + bravo.delta().getUrl());
                        }
                        this.red = fVar7;
                        this.teal = abstractC2304b4;
                        this.silver = beige;
                        this.purple = 1;
                        Object bravo2 = AbstractC2790v0.bravo(bravo, this);
                        if (bravo2 != aVar5) {
                            fVar3 = fVar7;
                            obj = bravo2;
                            abstractC2304b = abstractC2304b4;
                        } else {
                            return aVar5;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        abstractC2304b = abstractC2304b4;
                        Result.Companion companion3 = Result.INSTANCE;
                        ak.bravo(abstractC2304b.delta());
                        m206constructorimpl = Result.m206constructorimpl(Unit.INSTANCE);
                        m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m206constructorimpl);
                        if (m207exceptionOrNullimpl == null) {
                        }
                    }
                }
                AbstractC2304b echo2 = ((C1614e) obj).echo();
                Result.Companion companion4 = Result.INSTANCE;
                ak.bravo(abstractC2304b.delta());
                Object m206constructorimpl2 = Result.m206constructorimpl(Unit.INSTANCE);
                Throwable m207exceptionOrNullimpl2 = Result.m207exceptionOrNullimpl(m206constructorimpl2);
                if (m207exceptionOrNullimpl2 != null) {
                    n.alpha().golf(m207exceptionOrNullimpl2);
                }
                beige.foxtrot(n.bravo, Unit.INSTANCE);
                this.red = null;
                this.teal = null;
                this.silver = null;
                this.purple = 2;
                if (fVar3.echo(this, echo2) == aVar5) {
                    return aVar5;
                }
                return Unit.INSTANCE;
            case 3:
                Od.a aVar6 = Od.a.alpha;
                int i11 = this.purple;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 == 2) {
                            C1614e c1614e2 = (C1614e) ((ab) this.red);
                            ResultKt.alpha(obj);
                            return c1614e2;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    id.f fVar8 = (id.f) ((ab) this.red);
                    C2226c c2226c2 = (C2226c) this.silver;
                    this.red = null;
                    this.purple = 1;
                    obj = fVar8.alpha.alpha(c2226c2, this);
                    if (obj == aVar6) {
                        return aVar6;
                    }
                }
                C1614e c1614e3 = (C1614e) obj;
                AbstractC2304b echo3 = c1614e3.echo();
                this.red = c1614e3;
                this.purple = 2;
                if (v.bravo((List) this.teal, echo3, this) != aVar6) {
                    return c1614e3;
                }
                return aVar6;
            case 4:
                Od.a aVar7 = Od.a.alpha;
                int i12 = this.purple;
                if (i12 != 0) {
                    if (i12 != 1) {
                        if (i12 == 2) {
                            ResultKt.alpha(obj);
                            return obj;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c2226c = (C2226c) this.silver;
                    fVar4 = (id.f) this.red;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    id.f fVar9 = (id.f) this.red;
                    c2226c = (C2226c) this.silver;
                    this.red = fVar9;
                    this.silver = c2226c;
                    this.purple = 1;
                    Object alpha4 = fVar9.alpha.alpha(c2226c, this);
                    if (alpha4 != aVar7) {
                        fVar4 = fVar9;
                        obj = alpha4;
                    }
                    return aVar7;
                }
                C1614e c1614e4 = (C1614e) obj;
                if (ah.alpha.contains(c1614e4.delta().uniform())) {
                    c cVar = ((C1914b) this.teal).alpha;
                    this.red = null;
                    this.silver = null;
                    this.purple = 2;
                    Object alpha5 = ah.alpha(fVar4, c2226c, c1614e4, cVar, this);
                    if (alpha5 != aVar7) {
                        return alpha5;
                    }
                    return aVar7;
                }
                return c1614e4;
            case 5:
                Od.a aVar8 = Od.a.alpha;
                int i13 = this.purple;
                if (i13 != 0) {
                    if (i13 == 1) {
                        rVar = (r) this.silver;
                        try {
                            ResultKt.alpha(obj);
                        } catch (Throwable th6) {
                            th2 = th6;
                            try {
                                J j5 = (J) rVar;
                                j5.getClass();
                                j5.magenta(new C3215t(th2, false));
                                throw th2;
                            } catch (Throwable th7) {
                                ((J) rVar).yellow();
                                throw th7;
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    C2226c c2226c3 = (C2226c) this.silver;
                    Function1 function1 = (Function1) this.red;
                    ?? j6 = new J(c2226c3.echo);
                    Nd.f fVar10 = ((C1914b) this.teal).alpha.red.get(H.alpha);
                    Intrinsics.checkNotNull(fVar10);
                    rg.b bVar = ai.alpha;
                    j6.crimson(new C1534h0(11, ((I) fVar10).crimson(new C1534h0(10, (Object) j6))));
                    try {
                        c2226c3.echo = j6;
                        this.silver = j6;
                        this.purple = 1;
                        if (function1.invoke(this) != aVar8) {
                            rVar = j6;
                        } else {
                            return aVar8;
                        }
                    } catch (Throwable th8) {
                        th2 = th8;
                        rVar = j6;
                        J j52 = (J) rVar;
                        j52.getClass();
                        j52.magenta(new C3215t(th2, false));
                        throw th2;
                    }
                }
                ((J) rVar).yellow();
                return Unit.INSTANCE;
            case 6:
                Od.a aVar9 = Od.a.alpha;
                int i14 = this.purple;
                if (i14 != 0) {
                    if (i14 != 1) {
                        if (i14 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (Ed.a) this.silver;
                    fVar5 = (f) this.red;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    f fVar11 = (f) this.red;
                    C2305c c2305c = (C2305c) fVar11.bravo();
                    Ed.a aVar10 = c2305c.alpha;
                    Object obj3 = c2305c.bravo;
                    if (!(obj3 instanceof t)) {
                        return Unit.INSTANCE;
                    }
                    Object obj4 = new Object();
                    AbstractC2304b echo4 = ((C1614e) fVar11.alpha).echo();
                    this.red = fVar11;
                    this.silver = aVar10;
                    this.purple = 1;
                    Object golf = ((o) this.teal).golf(obj4, echo4, obj3, aVar10, this);
                    if (golf != aVar9) {
                        fVar5 = fVar11;
                        obj = golf;
                        aVar = aVar10;
                    } else {
                        return aVar9;
                    }
                }
                if (obj == null) {
                    return Unit.INSTANCE;
                }
                if (!(obj instanceof vd.b) && !aVar.alpha.november(obj)) {
                    throw new IllegalStateException("transformResponseBody returned " + obj + " but expected value of type " + aVar);
                }
                C2305c c2305c2 = new C2305c(aVar, obj);
                this.red = null;
                this.silver = null;
                this.purple = 2;
                if (fVar5.echo(this, c2305c2) == aVar9) {
                    return aVar9;
                }
                return Unit.INSTANCE;
            case 7:
                Od.a aVar11 = Od.a.alpha;
                int i15 = this.purple;
                if (i15 != 0) {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3440j = (InterfaceC3440j) this.red;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    interfaceC3440j = (InterfaceC3440j) this.red;
                    Object obj5 = this.silver;
                    this.red = interfaceC3440j;
                    this.purple = 1;
                    obj = ((i) this.teal).invoke(obj5, this);
                    if (obj == aVar11) {
                        return aVar11;
                    }
                }
                this.red = null;
                this.purple = 2;
                if (interfaceC3440j.emit(obj, this) == aVar11) {
                    return aVar11;
                }
                return Unit.INSTANCE;
            case 8:
                Od.a aVar12 = Od.a.alpha;
                int i16 = this.purple;
                if (i16 != 0) {
                    if (i16 != 1) {
                        if (i16 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3440j2 = (InterfaceC3440j) this.red;
                    ResultKt.alpha(obj);
                    aVar2 = this;
                } else {
                    ResultKt.alpha(obj);
                    interfaceC3440j2 = (InterfaceC3440j) this.red;
                    Object[] objArr = (Object[]) this.silver;
                    Object obj6 = objArr[0];
                    Object obj7 = objArr[1];
                    Object obj8 = objArr[2];
                    Object obj9 = objArr[3];
                    Object obj10 = objArr[4];
                    this.red = interfaceC3440j2;
                    this.purple = 1;
                    obj = ((U) this.teal).invoke(obj6, obj7, obj8, obj9, obj10, this);
                    aVar2 = this;
                    if (obj == aVar12) {
                        return aVar12;
                    }
                }
                aVar2.red = null;
                aVar2.purple = 2;
                if (interfaceC3440j2.emit(obj, this) == aVar12) {
                    return aVar12;
                }
                return Unit.INSTANCE;
            default:
                Od.a aVar13 = Od.a.alpha;
                int i17 = this.purple;
                if (i17 != 0) {
                    if (i17 != 1) {
                        if (i17 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC3440j3 = (InterfaceC3440j) this.red;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    interfaceC3440j3 = (InterfaceC3440j) this.red;
                    Object[] objArr2 = (Object[]) this.silver;
                    Object obj11 = objArr2[0];
                    Object obj12 = objArr2[1];
                    this.red = interfaceC3440j3;
                    this.purple = 1;
                    obj = ((i) this.teal).invoke(obj11, obj12, this);
                    if (obj == aVar13) {
                        return aVar13;
                    }
                }
                this.red = null;
                this.purple = 2;
                if (interfaceC3440j3.emit(obj, this) == aVar13) {
                    return aVar13;
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(Nd.c cVar, U u4) {
        super(3, cVar);
        this.alpha = 8;
        this.teal = u4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(l lVar, Nd.c cVar) {
        super(3, cVar);
        this.alpha = 7;
        this.teal = (i) lVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(m mVar, Nd.c cVar) {
        super(3, cVar);
        this.alpha = 9;
        this.teal = (i) mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, Nd.c cVar, int i4) {
        super(3, cVar);
        this.alpha = i4;
        this.teal = obj;
    }
}
