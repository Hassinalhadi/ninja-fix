package com.checkout.components.card.ui.component.cardnumber;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.di.base.Injector;
import com.checkout.components.card.ui.component.address.AddressViewKt;
import com.checkout.components.card.ui.component.cardholdername.CardHolderNameViewKt;
import com.checkout.components.card.ui.component.cvv.CVVViewKt;
import com.checkout.components.card.ui.component.errorlabel.ErrorLabelViewKt;
import com.checkout.components.card.ui.component.expirydate.ExpiryDateViewKt;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewKt;
import com.checkout.components.card.ui.component.savecard.SaveCardContainerViewKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Injector purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ int silver;

    public /* synthetic */ a(Injector injector, String str, int i4, int i5) {
        this.alpha = i5;
        this.purple = injector;
        this.red = str;
        this.silver = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit a6;
        Unit a8;
        Unit a10;
        Unit a11;
        int i4 = this.alpha;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i4) {
            case 0:
                return CardNumberViewKt.bravo(this.purple, this.red, this.silver, interfaceC0581m, intValue);
            case 1:
                return ExpiryDateViewKt.alpha(this.purple, this.red, this.silver, interfaceC0581m, intValue);
            case 2:
                return SaveCardContainerViewKt.alpha(this.purple, this.red, this.silver, interfaceC0581m, intValue);
            case 3:
                a6 = AddressViewKt.a(this.purple, this.red, this.silver, interfaceC0581m, intValue);
                return a6;
            case 4:
                a8 = CardHolderNameViewKt.a(this.purple, this.red, this.silver, interfaceC0581m, intValue);
                return a8;
            case 5:
                a10 = CVVViewKt.a(this.purple, this.red, this.silver, interfaceC0581m, intValue);
                return a10;
            case 6:
                return ErrorLabelViewKt.alpha(this.purple, this.red, this.silver, interfaceC0581m, intValue);
            default:
                a11 = PayButtonViewKt.a(this.purple, this.red, this.silver, interfaceC0581m, intValue);
                return a11;
        }
    }
}
