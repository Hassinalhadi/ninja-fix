package com.checkout.components.kmp.rememberme.view.otp;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.ui.CardPaymentViewKt;
import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.card.ui.component.cardholdername.CardHolderNameViewKt;
import com.checkout.components.card.ui.component.cvv.CVVViewKt;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewKt;
import com.checkout.components.ui.country.CountryListItemViewKt;
import com.checkout.components.ui.view.CheckboxLabelViewKt;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.checkout.components.ui.view.InputFieldViewKt;
import com.checkout.components.ui.view.InternalButtonViewKt;
import com.checkout.components.ui.view.ScreenHeaderViewKt;
import com.checkout.components.ui.view.TextLabelViewKt;
import com.checkout.components.ui.view.field.PhoneFieldViewKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;

    public /* synthetic */ c(int i4, int i5) {
        this.alpha = i5;
        this.purple = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit OTPView500Preview$lambda$22;
        Unit OTPView200Preview$lambda$16;
        Unit OTPView400Preview$lambda$20;
        Unit OTPView250Preview$lambda$17;
        Unit OTPView450Preview$lambda$21;
        Unit OTPView350Preview$lambda$19;
        Unit OTPViewPreview$lambda$31;
        Unit OTPView150Preview$lambda$15;
        Unit OTPView300Preview$lambda$18;
        Unit CountryListItemPreview$lambda$15;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                OTPView500Preview$lambda$22 = OTPViewKt.OTPView500Preview$lambda$22(this.purple, interfaceC0581m, intValue);
                return OTPView500Preview$lambda$22;
            case 1:
                OTPView200Preview$lambda$16 = OTPViewKt.OTPView200Preview$lambda$16(this.purple, interfaceC0581m, intValue);
                return OTPView200Preview$lambda$16;
            case 2:
                OTPView400Preview$lambda$20 = OTPViewKt.OTPView400Preview$lambda$20(this.purple, interfaceC0581m, intValue);
                return OTPView400Preview$lambda$20;
            case 3:
                OTPView250Preview$lambda$17 = OTPViewKt.OTPView250Preview$lambda$17(this.purple, interfaceC0581m, intValue);
                return OTPView250Preview$lambda$17;
            case 4:
                OTPView450Preview$lambda$21 = OTPViewKt.OTPView450Preview$lambda$21(this.purple, interfaceC0581m, intValue);
                return OTPView450Preview$lambda$21;
            case 5:
                OTPView350Preview$lambda$19 = OTPViewKt.OTPView350Preview$lambda$19(this.purple, interfaceC0581m, intValue);
                return OTPView350Preview$lambda$19;
            case 6:
                OTPViewPreview$lambda$31 = OTPViewKt.OTPViewPreview$lambda$31(this.purple, interfaceC0581m, intValue);
                return OTPViewPreview$lambda$31;
            case 7:
                OTPView150Preview$lambda$15 = OTPViewKt.OTPView150Preview$lambda$15(this.purple, interfaceC0581m, intValue);
                return OTPView150Preview$lambda$15;
            case 8:
                OTPView300Preview$lambda$18 = OTPViewKt.OTPView300Preview$lambda$18(this.purple, interfaceC0581m, intValue);
                return OTPView300Preview$lambda$18;
            case 9:
                CountryListItemPreview$lambda$15 = CountryListItemViewKt.CountryListItemPreview$lambda$15(this.purple, interfaceC0581m, intValue);
                return CountryListItemPreview$lambda$15;
            case 10:
                return CheckboxLabelViewKt.alpha(this.purple, interfaceC0581m, intValue);
            case 11:
                return InputContainerViewKt.echo(this.purple, interfaceC0581m, intValue);
            case 12:
                return InputFieldViewKt.delta(this.purple, interfaceC0581m, intValue);
            case 13:
                return InternalButtonViewKt.echo(this.purple, interfaceC0581m, intValue);
            case 14:
                return ScreenHeaderViewKt.golf(this.purple, interfaceC0581m, intValue);
            case 15:
                return TextLabelViewKt.bravo(this.purple, interfaceC0581m, intValue);
            case 16:
                return PhoneFieldViewKt.alpha(this.purple, interfaceC0581m, intValue);
            case 17:
                return CardPaymentViewKt.charlie(this.purple, interfaceC0581m, intValue);
            case 18:
                return AddressViewKt.hotel(this.purple, interfaceC0581m, intValue);
            case 19:
                return CardHolderNameViewKt.bravo(this.purple, interfaceC0581m, intValue);
            case 20:
                return CVVViewKt.alpha(this.purple, interfaceC0581m, intValue);
            default:
                return PayButtonViewKt.alpha(this.purple, interfaceC0581m, intValue);
        }
    }
}
