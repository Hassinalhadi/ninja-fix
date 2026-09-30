package Y4;

import Y1.ad;
import Y1.ag;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.layout.C0549o;
import androidx.compose.runtime.ax;
import com.checkout.address.ui.edit.AddressEditViewModel;
import com.checkout.address.ui.state.StatePickerViewModel;
import com.checkout.components.interfaces.api.PaymentMethodComponent;
import com.checkout.components.interfaces.component.ComponentCallback;
import com.checkout.components.interfaces.insight.LogDetails;
import com.checkout.components.redirecthandler.RedirectDelegate;
import com.checkout.components.ui.country.CountryPickerViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s;
import q0.AbstractC2366B;
import q0.AbstractC2367C;
import q0.ao;
import q0.ar;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ a(RedirectDelegate redirectDelegate, PaymentMethodComponent paymentMethodComponent, String str, LogDetails logDetails, ComponentCallback componentCallback, String str2) {
        this.alpha = 0;
        this.purple = redirectDelegate;
        this.red = paymentMethodComponent;
        this.silver = str;
        this.white = logDetails;
        this.yellow = componentCallback;
        this.teal = str2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit a6;
        switch (this.alpha) {
            case 0:
                a6 = RedirectDelegate.a((RedirectDelegate) this.purple, (PaymentMethodComponent) this.red, (String) this.silver, (LogDetails) this.white, (ComponentCallback) this.yellow, (String) this.teal, (String) obj);
                return a6;
            case 1:
                AbstractC2366B abstractC2366B = (AbstractC2366B) obj;
                AbstractC2367C[] abstractC2367CArr = (AbstractC2367C[]) this.purple;
                int length = abstractC2367CArr.length;
                int i4 = 0;
                int i5 = 0;
                while (i5 < length) {
                    int i10 = i4;
                    AbstractC2367C abstractC2367C = abstractC2367CArr[i5];
                    Intrinsics.charlie(abstractC2367C, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    AbstractC0547m.bravo(abstractC2366B, abstractC2367C, (ao) ((List) this.red).get(i10), ((ar) this.silver).getLayoutDirection(), ((s) this.teal).alpha, ((s) this.white).alpha, ((C0549o) this.yellow).alpha);
                    i5++;
                    i4 = i10 + 1;
                }
                return Unit.INSTANCE;
            default:
                return com.checkout.address.ui.navigation.a.a((ag) this.purple, (AddressEditViewModel) this.red, (ax) this.silver, (ax) this.teal, (CountryPickerViewModel) this.white, (StatePickerViewModel) this.yellow, (ad) obj);
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i4) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
        this.white = obj5;
        this.yellow = obj6;
    }
}
