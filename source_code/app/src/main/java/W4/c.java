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
public final /* synthetic */ class c implements l {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ ResourceProvider purple;
    public final /* synthetic */ DesignTokens red;
    public final /* synthetic */ s silver;
    public final /* synthetic */ Function0 teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ int yellow;

    public /* synthetic */ c(s sVar, DesignTokens designTokens, ResourceProvider resourceProvider, Function0 function0, int i4, int i5) {
        this.silver = sVar;
        this.red = designTokens;
        this.purple = resourceProvider;
        this.teal = function0;
        this.white = i4;
        this.yellow = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit InfoTextView$lambda$4;
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                DesignTokens designTokens = this.red;
                ResourceProvider resourceProvider = this.purple;
                Function0 function0 = this.teal;
                int i4 = this.white;
                int i5 = this.yellow;
                return InfoDialogViewKt.foxtrot(this.silver, designTokens, resourceProvider, function0, i4, i5, (InterfaceC0581m) obj, intValue);
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ResourceProvider resourceProvider2 = this.purple;
                DesignTokens designTokens2 = this.red;
                Function0 function02 = this.teal;
                int i10 = this.white;
                int i11 = this.yellow;
                InfoTextView$lambda$4 = InfoTextViewKt.InfoTextView$lambda$4(resourceProvider2, designTokens2, this.silver, function02, i10, i11, (InterfaceC0581m) obj, intValue2);
                return InfoTextView$lambda$4;
        }
    }

    public /* synthetic */ c(ResourceProvider resourceProvider, DesignTokens designTokens, s sVar, Function0 function0, int i4, int i5) {
        this.purple = resourceProvider;
        this.red = designTokens;
        this.silver = sVar;
        this.teal = function0;
        this.white = i4;
        this.yellow = i5;
    }
}
