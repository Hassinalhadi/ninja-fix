package j4;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.address.W;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.view.field.PickerFieldViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InputComponentState purple;
    public final /* synthetic */ InputComponentViewStyle red;
    public final /* synthetic */ Function0 silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ int white;

    public /* synthetic */ d(InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle, Function0 function0, String str, int i4, int i5) {
        this.alpha = i5;
        this.purple = inputComponentState;
        this.red = inputComponentViewStyle;
        this.silver = function0;
        this.teal = str;
        this.white = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit PickerFieldView$lambda$7;
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return W.a(this.purple, this.red, this.silver, this.teal, this.white, (InterfaceC0581m) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                PickerFieldView$lambda$7 = PickerFieldViewKt.PickerFieldView$lambda$7(this.purple, this.red, this.silver, this.teal, this.white, (InterfaceC0581m) obj, intValue2);
                return PickerFieldView$lambda$7;
        }
    }
}
