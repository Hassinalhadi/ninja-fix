package j4;

import Xd.l;
import com.checkout.components.address.AbstractC0881v;
import com.checkout.components.address.M;
import com.checkout.components.ui.view.field.PaymentMethodPhoneFieldViewKt;
import com.checkout.components.ui.view.field.PhoneFieldViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ l purple;
    public final /* synthetic */ int red;

    public /* synthetic */ a(l lVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = lVar;
        this.red = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit PhoneFieldView$lambda$4$lambda$3$lambda$2$lambda$1;
        switch (this.alpha) {
            case 0:
                return M.a(this.purple, this.red, (String) obj);
            case 1:
                return AbstractC0881v.a(this.purple, this.red, (String) obj);
            case 2:
                return PaymentMethodPhoneFieldViewKt.bravo(this.purple, this.red, (String) obj);
            default:
                PhoneFieldView$lambda$4$lambda$3$lambda$2$lambda$1 = PhoneFieldViewKt.PhoneFieldView$lambda$4$lambda$3$lambda$2$lambda$1(this.purple, this.red, (String) obj);
                return PhoneFieldView$lambda$4$lambda$3$lambda$2$lambda$1;
        }
    }
}
