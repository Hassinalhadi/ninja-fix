package W4;

import T.s;
import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.utils.ResourceProvider;
import com.checkout.components.kmp.rememberme.view.dialog.InfoDialogViewKt;
import com.checkout.components.kmp.rememberme.view.ui.InfoTextViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ s purple;
    public final /* synthetic */ Function0 red;
    public final /* synthetic */ DesignTokens silver;
    public final /* synthetic */ ResourceProvider teal;

    public /* synthetic */ b(s sVar, DesignTokens designTokens, ResourceProvider resourceProvider, Function0 function0) {
        this.purple = sVar;
        this.silver = designTokens;
        this.teal = resourceProvider;
        this.red = function0;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit InfoDialogView$lambda$7;
        Unit InfoTextView$lambda$3;
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DesignTokens designTokens = this.silver;
                ResourceProvider resourceProvider = this.teal;
                Function0 function0 = this.red;
                InfoDialogView$lambda$7 = InfoDialogViewKt.InfoDialogView$lambda$7(this.purple, designTokens, resourceProvider, function0, (InterfaceC0581m) obj, intValue);
                return InfoDialogView$lambda$7;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                Function0 function02 = this.red;
                DesignTokens designTokens2 = this.silver;
                ResourceProvider resourceProvider2 = this.teal;
                InfoTextView$lambda$3 = InfoTextViewKt.InfoTextView$lambda$3(this.purple, function02, designTokens2, resourceProvider2, (InterfaceC0581m) obj, intValue2);
                return InfoTextView$lambda$3;
        }
    }

    public /* synthetic */ b(s sVar, Function0 function0, DesignTokens designTokens, ResourceProvider resourceProvider) {
        this.purple = sVar;
        this.red = function0;
        this.silver = designTokens;
        this.teal = resourceProvider;
    }
}
