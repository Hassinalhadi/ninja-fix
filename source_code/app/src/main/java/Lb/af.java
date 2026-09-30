package Lb;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.ui.component.cardnumber.SchemeComponentViewKt;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.view.ui.SecuredTextViewKt;
import com.checkout.components.rememberme.model.CustomerInfo;
import com.checkout.components.rememberme.rememberme.RememberMeViewRenderer;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.view.StyledImageViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class af implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ af(int i4, int i5, String str, Function0 function0) {
        this.alpha = 2;
        this.purple = str;
        this.red = i4;
        this.teal = function0;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit SecuredTextView$lambda$0;
        Unit a6;
        Unit StyledImageView$lambda$8;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.red | 1);
                String str = (String) this.purple;
                int i4 = this.silver;
                AbstractC0220c.charlie((T.s) this.teal, str, (InterfaceC0581m) obj, cyan, i4);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.red | 1);
                String str2 = (String) this.purple;
                int i5 = this.silver;
                AbstractC0220c.black((T.p) this.teal, str2, (InterfaceC0581m) obj, cyan2, i5);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.silver | 1);
                int i10 = this.red;
                Function0 function0 = (Function0) this.teal;
                Pc.d.alpha((String) this.purple, i10, function0, (InterfaceC0581m) obj, cyan3);
                return Unit.INSTANCE;
            case 3:
                int intValue = ((Integer) obj2).intValue();
                DesignTokens designTokens = (DesignTokens) this.purple;
                int i11 = this.red;
                int i12 = this.silver;
                SecuredTextView$lambda$0 = SecuredTextViewKt.SecuredTextView$lambda$0(designTokens, (T.s) this.teal, i11, i12, (InterfaceC0581m) obj, intValue);
                return SecuredTextView$lambda$0;
            case 4:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue2 = ((Integer) obj2).intValue();
                return SchemeComponentViewKt.alpha((List) this.purple, (T.s) this.teal, this.red, this.silver, interfaceC0581m, intValue2);
            case 5:
                int intValue3 = ((Integer) obj2).intValue();
                RememberMeViewRenderer rememberMeViewRenderer = (RememberMeViewRenderer) this.teal;
                int i13 = this.red;
                int i14 = this.silver;
                a6 = RememberMeViewRenderer.a(rememberMeViewRenderer, (CustomerInfo) this.purple, i13, i14, (InterfaceC0581m) obj, intValue3);
                return a6;
            default:
                int intValue4 = ((Integer) obj2).intValue();
                int i15 = this.red;
                int i16 = this.silver;
                StyledImageView$lambda$8 = StyledImageViewKt.StyledImageView$lambda$8((ImageStyle) this.teal, (String) this.purple, i15, i16, (InterfaceC0581m) obj, intValue4);
                return StyledImageView$lambda$8;
        }
    }

    public /* synthetic */ af(int i4, Object obj, Object obj2, int i5, int i10) {
        this.alpha = i10;
        this.teal = obj;
        this.purple = obj2;
        this.red = i4;
        this.silver = i5;
    }

    public /* synthetic */ af(Object obj, T.s sVar, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = obj;
        this.teal = sVar;
        this.red = i4;
        this.silver = i5;
    }
}
