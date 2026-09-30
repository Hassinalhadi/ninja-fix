package F4;

import Of.ac;
import Of.af;
import Of.v;
import Of.y;
import com.checkout.components.core.ui.FlowComponentViewKt;
import com.checkout.components.core.ui.content.FlowComponentItemViewKt;
import com.checkout.components.core.ui.content.PaymentComponentHeaderViewKt;
import com.checkout.components.core.utils.extension.ExtensionsKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.OkHttpClient;

/* loaded from: classes3.dex */
public final /* synthetic */ class h implements Function0 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ h(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit a6;
        switch (this.alpha) {
            case 0:
                return FlowComponentViewKt.delta();
            case 1:
                return FlowComponentViewKt.alpha();
            case 2:
                return FlowComponentViewKt.november();
            case 3:
                return FlowComponentViewKt.echo();
            case 4:
                return FlowComponentItemViewKt.bravo();
            case 5:
                a6 = PaymentComponentHeaderViewKt.a();
                return a6;
            case 6:
                return ExtensionsKt.bravo();
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return Unit.INSTANCE;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return Unit.INSTANCE;
            case 15:
                return Unit.INSTANCE;
            case 16:
                return Unit.INSTANCE;
            case 17:
                return Unit.INSTANCE;
            case 18:
                return Unit.INSTANCE;
            case 19:
                return Unit.INSTANCE;
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                return Unit.INSTANCE;
            case 24:
                return new OkHttpClient();
            case 25:
                return null;
            case 26:
                return af.bravo;
            case 27:
                return y.bravo;
            case 28:
                return v.bravo;
            default:
                return ac.bravo;
        }
    }
}
