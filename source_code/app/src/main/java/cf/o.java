package cf;

import A2.aj;
import B9.K;
import Ie.ag;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import pe.InterfaceC2335k;

/* loaded from: classes2.dex */
public final class o extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ q purple;
    public final /* synthetic */ ag red;
    public final /* synthetic */ ef.q silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(q qVar, ag agVar, ef.q qVar2, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = qVar;
        this.red = agVar;
        this.silver = qVar2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                q qVar = this.purple;
                aj alpha = qVar.alpha((InterfaceC2335k) qVar.alpha.charlie);
                Intrinsics.checkNotNull(alpha);
                InterfaceC0845a interfaceC0845a = (InterfaceC0845a) ((K) qVar.alpha.alpha).echo;
                kotlin.reflect.jvm.internal.impl.types.y returnType = this.silver.getReturnType();
                Intrinsics.delta(returnType, "property.returnType");
                return (Se.g) interfaceC0845a.bravo(alpha, this.red, returnType);
            case 1:
                q qVar2 = this.purple;
                ff.l lVar = (ff.l) ((K) qVar2.alpha.alpha).alpha;
                o oVar = new o(qVar2, this.red, this.silver, 0);
                lVar.getClass();
                return new ff.h(lVar, oVar);
            case 2:
                q qVar3 = this.purple;
                aj alpha2 = qVar3.alpha((InterfaceC2335k) qVar3.alpha.charlie);
                Intrinsics.checkNotNull(alpha2);
                InterfaceC0845a interfaceC0845a2 = (InterfaceC0845a) ((K) qVar3.alpha.alpha).echo;
                kotlin.reflect.jvm.internal.impl.types.y returnType2 = this.silver.getReturnType();
                Intrinsics.delta(returnType2, "property.returnType");
                return (Se.g) interfaceC0845a2.juliet(alpha2, this.red, returnType2);
            default:
                q qVar4 = this.purple;
                ff.l lVar2 = (ff.l) ((K) qVar4.alpha.alpha).alpha;
                o oVar2 = new o(qVar4, this.red, this.silver, 2);
                lVar2.getClass();
                return new ff.h(lVar2, oVar2);
        }
    }
}
