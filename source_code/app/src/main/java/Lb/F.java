package Lb;

import F.C0103e2;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.CheckoutKMPRememberMe;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.otp.OTPCountDownViewKt;
import com.checkout.components.rememberme.AbstractC0942g;
import com.checkout.components.rememberme.J1;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s6.G0;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ F(int i4, int i5, String str, D0.an anVar, D0.an anVar2, int i10) {
        this.alpha = 6;
        this.red = i4;
        this.silver = i5;
        this.purple = str;
        this.teal = anVar;
        this.white = anVar2;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit InfoDialogView$lambda$9;
        Unit OTPCountDownView$lambda$3;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.red | 1);
                T.p pVar = (T.p) this.white;
                AbstractC0220c.azure((Function0) this.teal, (String) this.purple, pVar, (InterfaceC0581m) obj, cyan, this.silver);
                return Unit.INSTANCE;
            case 1:
                return J1.a((T.s) this.teal, (String) this.purple, (Xd.l) this.white, this.red, this.silver, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 2:
                return AbstractC0942g.a((String) this.purple, (Function0) this.teal, (C0103e2) this.white, this.red, this.silver, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 3:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.silver | 1);
                P.d dVar = (P.d) this.white;
                androidx.compose.foundation.lazy.layout.j.bravo(this.teal, this.red, (androidx.compose.foundation.lazy.layout.ae) this.purple, dVar, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            case 4:
                int intValue = ((Integer) obj2).intValue();
                CheckoutKMPRememberMe checkoutKMPRememberMe = (CheckoutKMPRememberMe) this.purple;
                Function0 function0 = (Function0) this.teal;
                int i4 = this.red;
                int i5 = this.silver;
                InfoDialogView$lambda$9 = CheckoutKMPRememberMe.InfoDialogView$lambda$9(checkoutKMPRememberMe, function0, (T.s) this.white, i4, i5, (InterfaceC0581m) obj, intValue);
                return InfoDialogView$lambda$9;
            case 5:
                int intValue2 = ((Integer) obj2).intValue();
                ResourceProvider resourceProvider = (ResourceProvider) this.purple;
                DesignTokens designTokens = (DesignTokens) this.white;
                Function0 function02 = (Function0) this.teal;
                int i10 = this.silver;
                OTPCountDownView$lambda$3 = OTPCountDownViewKt.OTPCountDownView$lambda$3(resourceProvider, designTokens, this.red, function02, i10, (InterfaceC0581m) obj, intValue2);
                return OTPCountDownView$lambda$3;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(1);
                D0.an anVar = (D0.an) this.teal;
                D0.an anVar2 = (D0.an) this.white;
                G0.charlie(this.red, this.silver, (String) this.purple, anVar, anVar2, (InterfaceC0581m) obj, cyan3);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ F(ResourceProvider resourceProvider, DesignTokens designTokens, int i4, Function0 function0, int i5) {
        this.alpha = 5;
        this.purple = resourceProvider;
        this.white = designTokens;
        this.red = i4;
        this.teal = function0;
        this.silver = i5;
    }

    public /* synthetic */ F(Object obj, int i4, androidx.compose.foundation.lazy.layout.ae aeVar, P.d dVar, int i5) {
        this.alpha = 3;
        this.teal = obj;
        this.red = i4;
        this.purple = aeVar;
        this.white = dVar;
        this.silver = i5;
    }

    public /* synthetic */ F(Object obj, String str, Object obj2, int i4, int i5, int i10) {
        this.alpha = i10;
        this.teal = obj;
        this.purple = str;
        this.white = obj2;
        this.red = i4;
        this.silver = i5;
    }

    public /* synthetic */ F(Object obj, Function0 function0, Object obj2, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = obj;
        this.teal = function0;
        this.white = obj2;
        this.red = i4;
        this.silver = i5;
    }
}
