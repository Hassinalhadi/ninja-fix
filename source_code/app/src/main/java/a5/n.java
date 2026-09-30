package a5;

import Y1.ag;
import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.rememberme.R0;
import com.checkout.components.ui.model.CountryPickerType;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ag purple;

    public /* synthetic */ n(ag agVar, int i4) {
        this.alpha = i4;
        this.purple = agVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return R0.a(this.purple, (String) obj);
            default:
                return AbstractC0870k.a(this.purple, (CountryPickerType) obj);
        }
    }
}
