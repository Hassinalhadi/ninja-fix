package W4;

import Xd.m;
import androidx.compose.foundation.layout.as;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.dialog.InfoDialogViewKt;
import com.checkout.components.kmp.rememberme.view.otp.OTPCountDownViewKt;
import i.InterfaceC1854c;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class d implements m {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ ResourceProvider purple;
    public final /* synthetic */ DesignTokens red;
    public final /* synthetic */ Function0 silver;

    public /* synthetic */ d(DesignTokens designTokens, Function0 function0, ResourceProvider resourceProvider) {
        this.red = designTokens;
        this.silver = function0;
        this.purple = resourceProvider;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Unit InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4;
        Unit OTPCountDownView$lambda$2;
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj3).intValue();
                Function0 function0 = this.silver;
                ResourceProvider resourceProvider = this.purple;
                InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4 = InfoDialogViewKt.InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4(this.red, function0, resourceProvider, (InterfaceC1854c) obj, (InterfaceC0581m) obj2, intValue);
                return InfoDialogView$lambda$7$lambda$6$lambda$5$lambda$4;
            default:
                int intValue2 = ((Integer) obj3).intValue();
                OTPCountDownView$lambda$2 = OTPCountDownViewKt.OTPCountDownView$lambda$2(this.purple, this.red, this.silver, (as) obj, (InterfaceC0581m) obj2, intValue2);
                return OTPCountDownView$lambda$2;
        }
    }

    public /* synthetic */ d(ResourceProvider resourceProvider, DesignTokens designTokens, Function0 function0) {
        this.purple = resourceProvider;
        this.red = designTokens;
        this.silver = function0;
    }
}
