package d;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class w0 extends Pd.h implements Xd.l {
    public vf.Y purple;
    public int red;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ N f12004s;
    public /* synthetic */ Object silver;
    public final /* synthetic */ vf.ab teal;
    public final /* synthetic */ Pd.i white;
    public final /* synthetic */ Function1 yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public w0(vf.ab abVar, Xd.m mVar, Function1 function1, N n5, Nd.c cVar) {
        super(2, cVar);
        this.teal = abVar;
        this.white = (Pd.i) mVar;
        this.yellow = function1;
        this.f12004s = n5;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        Function1 function1 = this.yellow;
        N n5 = this.f12004s;
        w0 w0Var = new w0(this.teal, this.white, function1, n5, cVar);
        w0Var.silver = obj;
        return w0Var;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((w0) create((m0.af) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0077  */
    /* JADX WARN: Type inference failed for: r8v0, types: [Xd.m, Pd.i] */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vf.Y zulu;
        m0.af afVar;
        vf.I i4;
        m0.r rVar;
        Od.a aVar = Od.a.alpha;
        int i5 = this.red;
        N n5 = this.f12004s;
        vf.ab abVar = this.teal;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    i4 = (vf.I) this.silver;
                    ResultKt.alpha(obj);
                    rVar = (m0.r) obj;
                    if (rVar != null) {
                        O0.foxtrot(abVar, i4, new t0(n5, null));
                    } else {
                        rVar.alpha();
                        O0.foxtrot(abVar, i4, new u0(n5, null));
                        this.yellow.invoke(new Z.b(rVar.charlie));
                    }
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            zulu = this.purple;
            afVar = (m0.af) this.silver;
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            m0.af afVar2 = (m0.af) this.silver;
            ak akVar = O0.alpha;
            zulu = vf.ad.zulu(abVar, null, vf.ac.silver, new v0(n5, null), 1);
            this.silver = afVar2;
            this.purple = zulu;
            this.red = 1;
            Object charlie = O0.charlie(afVar2, this, 3);
            if (charlie != aVar) {
                afVar = afVar2;
                obj = charlie;
            }
            return aVar;
        }
        m0.r rVar2 = (m0.r) obj;
        rVar2.alpha();
        ak akVar2 = O0.alpha;
        ?? r82 = this.white;
        if (r82 != akVar2) {
            O0.foxtrot(abVar, zulu, new C1555s0(r82, n5, rVar2, null));
        }
        this.silver = zulu;
        this.purple = null;
        this.red = 2;
        obj = O0.hotel(afVar, m0.l.purple, this);
        if (obj != aVar) {
            i4 = zulu;
            rVar = (m0.r) obj;
            if (rVar != null) {
            }
            return Unit.INSTANCE;
        }
        return aVar;
    }
}
