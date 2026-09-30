package y;

import com.checkout.components.core.common.components.InternalCheckoutComponents;
import com.checkout.components.interfaces.model.paymentsession.PaymentMethod;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final /* synthetic */ class ar implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ ar(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                Of.i Json = (Of.i) obj;
                Intrinsics.echo(Json, "$this$Json");
                Json.alpha = true;
                Json.delta = true;
                Json.india = true;
                Json.juliet = true;
                return Unit.INSTANCE;
            case 2:
                A0.aa.echo((A0.ad) obj, 0);
                return Unit.INSTANCE;
            case 3:
                bz.al alVar = (bz.al) obj;
                alVar.alpha = 1332;
                alVar.alpha(0, Float.valueOf(0.0f)).bravo = z.y.bravo;
                alVar.alpha(666, Float.valueOf(290.0f));
                return Unit.INSTANCE;
            case 4:
                bz.al alVar2 = (bz.al) obj;
                alVar2.alpha = 1332;
                alVar2.alpha(666, Float.valueOf(0.0f)).bravo = z.y.bravo;
                alVar2.alpha(alVar2.alpha, Float.valueOf(290.0f));
                return Unit.INSTANCE;
            case 5:
                ge.v[] vVarArr = A0.aa.alpha;
                A0.ac acVar = A0.x.lima;
                ge.v vVar = A0.aa.alpha[5];
                acVar.alpha((A0.ad) obj, Boolean.TRUE);
                return Unit.INSTANCE;
            case 6:
                return InternalCheckoutComponents.mike((PaymentMethod) obj);
            case 7:
                return InternalCheckoutComponents.bravo((PaymentMethod) obj);
            case 8:
                Map.Entry DelegatingMutableSet = (Map.Entry) obj;
                Intrinsics.echo(DelegatingMutableSet, "$this$DelegatingMutableSet");
                return new zd.k(((zd.h) DelegatingMutableSet.getKey()).alpha, DelegatingMutableSet.getValue());
            case 9:
                Map.Entry DelegatingMutableSet2 = (Map.Entry) obj;
                Intrinsics.echo(DelegatingMutableSet2, "$this$DelegatingMutableSet");
                return new zd.k(x6.l.alpha((String) DelegatingMutableSet2.getKey()), DelegatingMutableSet2.getValue());
            case 10:
                zd.h DelegatingMutableSet3 = (zd.h) obj;
                Intrinsics.echo(DelegatingMutableSet3, "$this$DelegatingMutableSet");
                return DelegatingMutableSet3.alpha;
            default:
                String DelegatingMutableSet4 = (String) obj;
                Intrinsics.echo(DelegatingMutableSet4, "$this$DelegatingMutableSet");
                return x6.l.alpha(DelegatingMutableSet4);
        }
    }
}
