package Bb;

import D0.an;
import F.C0103e2;
import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.card.model.InfoBottomSheetViewStyleState;
import com.checkout.components.card.ui.component.cardnumber.InfoBottomSheetViewKt;
import com.checkout.components.core.ui.views.InternalTextLabelViewKt;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.view.ui.TextButtonViewKt;
import com.checkout.components.rememberme.H;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.picker.PickerSearchViewKt;
import f0.AbstractC1680b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s6.AbstractC2790v0;
import s6.G4;
import xb.AbstractC3318b;

/* loaded from: classes2.dex */
public final /* synthetic */ class e implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ e(s sVar, AbstractC1680b abstractC1680b, String str, String str2, int i4, int i5) {
        this.alpha = 6;
        this.white = sVar;
        this.yellow = abstractC1680b;
        this.purple = str;
        this.red = str2;
        this.silver = i4;
        this.teal = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit TextButtonView$lambda$0;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.silver | 1);
                String str = (String) this.red;
                String str2 = (String) this.white;
                Integer num = (Integer) this.yellow;
                AbstractC2790v0.alpha((String) this.purple, str, str2, num, (InterfaceC0581m) obj, cyan, this.teal);
                return Unit.INSTANCE;
            case 1:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                return InternalTextLabelViewKt.bravo((String) this.purple, (s) this.white, (an) this.yellow, (String) this.red, this.silver, this.teal, interfaceC0581m, intValue);
            case 2:
                int intValue2 = ((Integer) obj2).intValue();
                String str3 = (String) this.purple;
                DesignTokens designTokens = (DesignTokens) this.red;
                Function0 function0 = (Function0) this.yellow;
                int i4 = this.silver;
                int i5 = this.teal;
                TextButtonView$lambda$0 = TextButtonViewKt.TextButtonView$lambda$0(str3, designTokens, (s) this.white, function0, i4, i5, (InterfaceC0581m) obj, intValue2);
                return TextButtonView$lambda$0;
            case 3:
                return H.a((s) this.purple, (TextLabelViewItem) this.red, (Function0) this.white, (Function0) this.yellow, this.silver, this.teal, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 4:
                InterfaceC0581m interfaceC0581m2 = (InterfaceC0581m) obj;
                int intValue3 = ((Integer) obj2).intValue();
                return InfoBottomSheetViewKt.bravo((Function0) this.purple, (C0103e2) this.red, (InfoBottomSheetViewStyleState) this.white, (s) this.yellow, this.silver, this.teal, interfaceC0581m2, intValue3);
            case 5:
                InterfaceC0581m interfaceC0581m3 = (InterfaceC0581m) obj;
                int intValue4 = ((Integer) obj2).intValue();
                return PickerSearchViewKt.alpha((Function1) this.red, (InputFieldViewStyle) this.white, (InputFieldState) this.yellow, (String) this.purple, this.silver, this.teal, interfaceC0581m3, intValue4);
            case 6:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.silver | 1);
                String str4 = (String) this.red;
                G4.charlie((s) this.white, (AbstractC1680b) this.yellow, (String) this.purple, str4, (InterfaceC0581m) obj, cyan2, this.teal);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(this.silver | 1);
                P.d dVar = (P.d) this.yellow;
                AbstractC3318b.charlie((String) this.purple, (s) this.red, (an) this.white, dVar, (InterfaceC0581m) obj, cyan3, this.teal);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = obj;
        this.red = obj2;
        this.white = obj3;
        this.yellow = obj4;
        this.silver = i4;
        this.teal = i5;
    }

    public /* synthetic */ e(String str, s sVar, an anVar, String str2, int i4, int i5) {
        this.alpha = 1;
        this.purple = str;
        this.white = sVar;
        this.yellow = anVar;
        this.red = str2;
        this.silver = i4;
        this.teal = i5;
    }

    public /* synthetic */ e(Function1 function1, InputFieldViewStyle inputFieldViewStyle, InputFieldState inputFieldState, String str, int i4, int i5) {
        this.alpha = 5;
        this.red = function1;
        this.white = inputFieldViewStyle;
        this.yellow = inputFieldState;
        this.purple = str;
        this.silver = i4;
        this.teal = i5;
    }
}
