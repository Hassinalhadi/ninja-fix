package a5;

import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.rememberme.AbstractC0926a1;

/* loaded from: classes3.dex */
public final /* synthetic */ class u implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ CheckoutKMPRememberMe purple;
    public final /* synthetic */ T.s red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;

    public /* synthetic */ u(CheckoutKMPRememberMe checkoutKMPRememberMe, T.s sVar, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = checkoutKMPRememberMe;
        this.red = sVar;
        this.silver = i4;
        this.teal = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return AbstractC0926a1.a(this.purple, this.red, this.silver, this.teal, (InterfaceC0581m) obj, intValue);
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                CheckoutKMPRememberMe checkoutKMPRememberMe = this.purple;
                int i4 = this.silver;
                int i5 = this.teal;
                return CheckoutKMPRememberMe.india(checkoutKMPRememberMe, this.red, i4, i5, (InterfaceC0581m) obj, intValue2);
            default:
                int intValue3 = ((Integer) obj2).intValue();
                CheckoutKMPRememberMe checkoutKMPRememberMe2 = this.purple;
                int i10 = this.silver;
                int i11 = this.teal;
                return CheckoutKMPRememberMe.bravo(checkoutKMPRememberMe2, this.red, i10, i11, (InterfaceC0581m) obj, intValue3);
        }
    }
}
