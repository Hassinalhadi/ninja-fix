package d;

import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class I0 extends Pd.h implements Xd.l {
    public Object purple;
    public Object red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Pd.i f11977s;
    public m0.r silver;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function1 f11978t;
    public int teal;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ N f11979u;
    public /* synthetic */ Object white;
    public final /* synthetic */ vf.ab yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public I0(vf.ab abVar, Xd.m mVar, b.ag agVar, b.ag agVar2, Function1 function1, N n5, Nd.c cVar) {
        super(2, cVar);
        this.yellow = abVar;
        this.f11977s = (Pd.i) mVar;
        this.f11978t = function1;
        this.f11979u = n5;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        Function1 function1 = this.f11978t;
        N n5 = this.f11979u;
        I0 i02 = new I0(this.yellow, this.f11977s, null, null, function1, n5, cVar);
        i02.white = obj;
        return i02;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((I0) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x0144, code lost:
    
        if (r13 == r1) goto L60;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0011. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0183  */
    /* JADX WARN: Type inference failed for: r4v0, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        m0.af afVar;
        vf.I i4;
        m0.r rVar;
        vf.I i5;
        m0.r rVar2;
        m0.r rVar3;
        Od.a aVar = Od.a.alpha;
        int i10 = this.teal;
        av avVar = av.alpha;
        ?? r4 = this.f11977s;
        Function1 function1 = this.f11978t;
        N n5 = this.f11979u;
        vf.ab abVar = this.yellow;
        switch (i10) {
            case 0:
                ResultKt.alpha(obj);
                afVar = (m0.af) this.white;
                this.white = afVar;
                this.teal = 1;
                obj = O0.charlie(afVar, this, 3);
                break;
            case 1:
                afVar = (m0.af) this.white;
                ResultKt.alpha(obj);
                m0.r rVar4 = (m0.r) obj;
                rVar4.alpha();
                ak akVar = O0.alpha;
                vf.Y zulu = vf.ad.zulu(abVar, null, vf.ac.silver, new G0(n5, null), 1);
                if (r4 != O0.alpha) {
                    O0.foxtrot(abVar, zulu, new y0(r4, n5, rVar4, null));
                }
                this.white = afVar;
                this.purple = zulu;
                this.teal = 2;
                obj = O0.hotel(afVar, m0.l.purple, this);
                if (obj != aVar) {
                    i4 = zulu;
                    rVar = (m0.r) obj;
                    if (rVar == null) {
                        O0.foxtrot(abVar, i4, new A0(n5, null));
                    } else {
                        rVar.alpha();
                        O0.foxtrot(abVar, i4, new B0(n5, null));
                    }
                    if (rVar != null) {
                        function1.invoke(new Z.b(rVar.charlie));
                    }
                    return Unit.INSTANCE;
                }
                return aVar;
            case 2:
                i4 = (vf.I) this.purple;
                ResultKt.alpha(obj);
                rVar = (m0.r) obj;
                if (rVar == null) {
                }
                if (rVar != null) {
                }
                return Unit.INSTANCE;
            case 3:
                i4 = (vf.I) this.red;
                m0.r rVar5 = (m0.r) this.purple;
                ResultKt.alpha(obj);
                aw awVar = (aw) obj;
                if (!Intrinsics.areEqual(awVar, avVar)) {
                    if (awVar instanceof au) {
                        rVar = ((au) awVar).alpha;
                    } else if (awVar instanceof at) {
                        rVar = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (rVar == null) {
                    }
                    if (rVar != null) {
                    }
                    return Unit.INSTANCE;
                }
                long j5 = rVar5.charlie;
                throw null;
            case 4:
                vf.I i11 = (vf.I) this.white;
                ResultKt.alpha(obj);
                O0.foxtrot(abVar, i11, new z0(n5, null));
                return Unit.INSTANCE;
            case 5:
                vf.I i12 = (vf.I) this.red;
                m0.r rVar6 = (m0.r) this.purple;
                m0.af afVar2 = (m0.af) this.white;
                ResultKt.alpha(obj);
                m0.r rVar7 = (m0.r) obj;
                if (rVar7 == null) {
                    function1.invoke(new Z.b(rVar6.charlie));
                    return Unit.INSTANCE;
                }
                ak akVar2 = O0.alpha;
                vf.Y zulu2 = vf.ad.zulu(abVar, null, vf.ac.silver, new C0(i12, n5, null), 1);
                if (r4 != O0.alpha) {
                    O0.foxtrot(abVar, zulu2, new D0(r4, n5, rVar7, null));
                }
                this.white = zulu2;
                this.purple = rVar6;
                this.red = null;
                this.teal = 6;
                obj = O0.hotel(afVar2, m0.l.purple, this);
                if (obj != aVar) {
                    i5 = zulu2;
                    rVar2 = rVar6;
                    rVar3 = (m0.r) obj;
                    if (rVar3 == null) {
                        O0.foxtrot(abVar, i5, new F0(n5, null));
                        function1.invoke(new Z.b(rVar2.charlie));
                        return Unit.INSTANCE;
                    }
                    rVar3.alpha();
                    O0.foxtrot(abVar, i5, new E0(n5, null));
                    throw null;
                }
                return aVar;
            case 6:
                m0.r rVar8 = (m0.r) this.purple;
                vf.I i13 = (vf.I) this.white;
                ResultKt.alpha(obj);
                i5 = i13;
                rVar2 = rVar8;
                rVar3 = (m0.r) obj;
                if (rVar3 == null) {
                }
                break;
            case 7:
                m0.r rVar9 = this.silver;
                rVar2 = (m0.r) this.red;
                i5 = (vf.I) this.purple;
                ResultKt.alpha(obj);
                aw awVar2 = (aw) obj;
                if (!Intrinsics.areEqual(awVar2, avVar)) {
                    if (awVar2 instanceof au) {
                        rVar3 = ((au) awVar2).alpha;
                    } else if (awVar2 instanceof at) {
                        rVar3 = null;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (rVar3 == null) {
                    }
                } else {
                    long j6 = rVar9.charlie;
                    throw null;
                }
                break;
            case 8:
                vf.I i14 = (vf.I) this.white;
                ResultKt.alpha(obj);
                O0.foxtrot(abVar, i14, new H0(n5, null));
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
