package k5;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewKt;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.view.InternalButtonViewKt;
import kotlin.Unit;

/* renamed from: k5.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2011d implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ButtonStyle purple;

    public /* synthetic */ C2011d(ButtonStyle buttonStyle, int i4) {
        this.alpha = i4;
        this.purple = buttonStyle;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit ButtonPreview$lambda$9;
        Unit PayButtonComponentPreview$lambda$10;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                ButtonPreview$lambda$9 = InternalButtonViewKt.ButtonPreview$lambda$9(this.purple, interfaceC0581m, intValue);
                return ButtonPreview$lambda$9;
            default:
                PayButtonComponentPreview$lambda$10 = PayButtonViewKt.PayButtonComponentPreview$lambda$10(this.purple, interfaceC0581m, intValue);
                return PayButtonComponentPreview$lambda$10;
        }
    }
}
