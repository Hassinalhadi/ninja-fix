package j4;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.address.AbstractC0881v;
import com.checkout.components.address.M;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ InputComponentState red;
    public final /* synthetic */ InputComponentViewStyle silver;
    public final /* synthetic */ l teal;
    public final /* synthetic */ int white;

    public /* synthetic */ b(int i4, InputComponentState inputComponentState, InputComponentViewStyle inputComponentViewStyle, l lVar, int i5, int i10) {
        this.alpha = i10;
        this.purple = i4;
        this.red = inputComponentState;
        this.silver = inputComponentViewStyle;
        this.teal = lVar;
        this.white = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return M.a(this.purple, this.red, this.silver, this.teal, this.white, (InterfaceC0581m) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                return AbstractC0881v.a(this.purple, this.red, this.silver, this.teal, this.white, (InterfaceC0581m) obj, intValue2);
        }
    }
}
