package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.address.AddressComponent;
import com.checkout.address.AddressComponentViewRenderer;
import com.checkout.components.card.ui.component.base.InputComponentViewKt;
import com.checkout.components.card.ui.component.cardnumber.CardNumberViewModel;
import com.checkout.components.core.ui.FlowComponent;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.view.common.ContainerDividerViewKt;
import com.checkout.components.rememberme.R0;
import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.wallet.WalletComponent;
import com.checkout.components.wallet.ui.WalletComponentViewRenderer;
import db.C1602b;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class ar implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ ar(Object obj, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.purple = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit a6;
        Unit AuthenticationView$lambda$4;
        Unit a8;
        Unit a10;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        Integer num = (Integer) obj2;
        switch (this.alpha) {
            case 0:
                num.getClass();
                t.delta(this.purple, (Function1) this.red, interfaceC0581m, C0564b.cyan(49));
                return Unit.INSTANCE;
            case 1:
                a6 = FlowComponent.a((FlowComponent) this.red, this.purple, interfaceC0581m, num.intValue());
                return a6;
            case 2:
                return ContainerDividerViewKt.alpha((DesignTokens) this.red, this.purple, interfaceC0581m, num.intValue());
            case 3:
                return R0.a((DiComponent) this.red, this.purple, interfaceC0581m, num.intValue());
            case 4:
                AuthenticationView$lambda$4 = CheckoutKMPRememberMe.AuthenticationView$lambda$4((CheckoutKMPRememberMe) this.red, this.purple, interfaceC0581m, num.intValue());
                return AuthenticationView$lambda$4;
            case 5:
                a8 = AddressComponent.a((AddressComponent) this.red, this.purple, interfaceC0581m, num.intValue());
                return a8;
            case 6:
                return AddressComponentViewRenderer.alpha((AddressComponentViewRenderer) this.red, this.purple, interfaceC0581m, num.intValue());
            case 7:
                num.intValue();
                db.l.echo((C1602b) this.red, interfaceC0581m, C0564b.cyan(this.purple | 1));
                return Unit.INSTANCE;
            case 8:
                num.getClass();
                db.l.hotel(this.purple, (T.p) this.red, interfaceC0581m, C0564b.cyan(1));
                return Unit.INSTANCE;
            case 9:
                num.intValue();
                ga.e.foxtrot((ga.f) this.red, interfaceC0581m, C0564b.cyan(this.purple | 1));
                return Unit.INSTANCE;
            case 10:
                return WalletComponent.delta((WalletComponent) this.red, this.purple, interfaceC0581m, num.intValue());
            case 11:
                return WalletComponentViewRenderer.alpha((WalletComponentViewRenderer) this.red, this.purple, interfaceC0581m, num.intValue());
            default:
                a10 = InputComponentViewKt.a((CardNumberViewModel) this.red, this.purple, interfaceC0581m, num.intValue());
                return a10;
        }
    }

    public /* synthetic */ ar(Object obj, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = i4;
        this.red = obj;
    }
}
