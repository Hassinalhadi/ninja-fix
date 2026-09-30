package G4;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.core.ui.content.PaymentComponentContainerViewKt;
import com.checkout.components.kmp.rememberme.view.ui.EnvironmentProviderViewKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ l purple;
    public final /* synthetic */ int red;

    public /* synthetic */ b(l lVar, int i4, int i5) {
        this.alpha = i5;
        this.purple = lVar;
        this.red = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                return PaymentComponentContainerViewKt.alpha(this.purple, this.red, interfaceC0581m, intValue);
            default:
                return EnvironmentProviderViewKt.bravo(this.purple, this.red, interfaceC0581m, intValue);
        }
    }
}
