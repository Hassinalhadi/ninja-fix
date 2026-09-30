package t4;

import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.card.ui.component.address.AddressViewModel;
import com.checkout.components.interfaces.model.contact.ContactData;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AddressViewModel purple;

    public /* synthetic */ b(AddressViewModel addressViewModel, int i4) {
        this.alpha = i4;
        this.purple = addressViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit a6;
        switch (this.alpha) {
            case 0:
                a6 = AddressViewKt.a(this.purple, ((Boolean) obj).booleanValue());
                return a6;
            default:
                return AddressViewModel.alpha(this.purple, (ContactData) obj);
        }
    }
}
