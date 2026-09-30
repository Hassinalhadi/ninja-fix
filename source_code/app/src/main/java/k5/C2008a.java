package k5;

import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.ui.view.CheckboxLabelViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import w.C3227e;
import yf.as;
import yf.az;

/* renamed from: k5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2008a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ boolean red;

    public /* synthetic */ C2008a(Function1 function1, boolean z2, int i4) {
        this.alpha = i4;
        this.purple = function1;
        this.red = z2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit CheckboxLabelView_sTxsimY$lambda$2$lambda$1;
        Unit b2;
        as india;
        switch (this.alpha) {
            case 0:
                CheckboxLabelView_sTxsimY$lambda$2$lambda$1 = CheckboxLabelViewKt.CheckboxLabelView_sTxsimY$lambda$2$lambda$1((Function1) this.purple, this.red);
                return CheckboxLabelView_sTxsimY$lambda$2$lambda$1;
            case 1:
                ((Function1) this.purple).invoke(Boolean.valueOf(!this.red));
                return Unit.INSTANCE;
            case 2:
                b2 = AddressViewKt.b((Function1) this.purple, this.red);
                return b2;
            case 3:
                ((Function1) this.purple).invoke(Boolean.valueOf(!this.red));
                return Unit.INSTANCE;
            default:
                if (this.red && (india = ((C3227e) this.purple).india()) != null) {
                    ((az) india).alpha(Unit.INSTANCE);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C2008a(boolean z2, C3227e c3227e) {
        this.alpha = 4;
        this.red = z2;
        this.purple = c3227e;
    }
}
