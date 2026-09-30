package W4;

import T.p;
import T.s;
import Wf.e;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.interfaces.model.PaymentState;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.view.dialog.InfoDialogRowViewKt;
import com.checkout.components.rememberme.AbstractC0943g0;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.view.InputContainerViewKt;
import com.checkout.components.ui.view.InputFieldViewKt;
import com.checkout.components.ui.view.InternalButtonViewKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import yb.AbstractC3410a;

/* loaded from: classes3.dex */
public final /* synthetic */ class a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2193a;
    public final /* synthetic */ int alpha;
    public final /* synthetic */ String purple;
    public final /* synthetic */ int red;
    public final /* synthetic */ int silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ a(s sVar, DesignTokens designTokens, e eVar, String str, String str2, int i4, int i5) {
        this.alpha = 0;
        this.teal = sVar;
        this.white = designTokens;
        this.yellow = eVar;
        this.purple = str;
        this.f2193a = str2;
        this.red = i4;
        this.silver = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit InputComponentContainerView$lambda$3;
        Unit InputFieldView$lambda$9;
        Unit InternalButtonView$lambda$6;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                return InfoDialogRowViewKt.alpha((s) this.teal, (DesignTokens) this.white, (e) this.yellow, this.purple, (String) this.f2193a, this.red, this.silver, interfaceC0581m, intValue);
            case 1:
                return AbstractC0943g0.a((TextLabelViewItem) this.teal, (TextLabelViewItem) this.white, (TextLabelViewItem) this.yellow, (Function0) this.f2193a, this.purple, this.red, this.silver, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            case 2:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.red | 1);
                String str = this.purple;
                db.l.bravo((List) this.white, (Function0) this.yellow, (s) this.teal, (Function0) this.f2193a, str, (InterfaceC0581m) obj, cyan, this.silver);
                return Unit.INSTANCE;
            case 3:
                int intValue2 = ((Integer) obj2).intValue();
                InputComponentViewStyle inputComponentViewStyle = (InputComponentViewStyle) this.teal;
                InputComponentState inputComponentState = (InputComponentState) this.white;
                Function1 function1 = (Function1) this.yellow;
                int i4 = this.red;
                int i5 = this.silver;
                InputComponentContainerView$lambda$3 = InputContainerViewKt.InputComponentContainerView$lambda$3(inputComponentViewStyle, inputComponentState, function1, (Function1) this.f2193a, this.purple, i4, i5, (InterfaceC0581m) obj, intValue2);
                return InputComponentContainerView$lambda$3;
            case 4:
                int intValue3 = ((Integer) obj2).intValue();
                InputFieldViewStyle inputFieldViewStyle = (InputFieldViewStyle) this.teal;
                InputFieldState inputFieldState = (InputFieldState) this.white;
                Function1 function12 = (Function1) this.yellow;
                int i10 = this.red;
                int i11 = this.silver;
                InputFieldView$lambda$9 = InputFieldViewKt.InputFieldView$lambda$9(inputFieldViewStyle, inputFieldState, function12, (Function1) this.f2193a, this.purple, i10, i11, (InterfaceC0581m) obj, intValue3);
                return InputFieldView$lambda$9;
            case 5:
                int intValue4 = ((Integer) obj2).intValue();
                InternalButtonViewStyle internalButtonViewStyle = (InternalButtonViewStyle) this.teal;
                InternalButtonState internalButtonState = (InternalButtonState) this.white;
                Function0 function0 = (Function0) this.f2193a;
                int i12 = this.red;
                int i13 = this.silver;
                InternalButtonView$lambda$6 = InternalButtonViewKt.InternalButtonView$lambda$6(internalButtonViewStyle, internalButtonState, (PaymentState) this.yellow, function0, this.purple, i12, i13, (InterfaceC0581m) obj, intValue4);
                return InternalButtonView$lambda$6;
            default:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.red | 1);
                String str2 = this.purple;
                String str3 = (String) this.f2193a;
                Function0 function02 = (Function0) this.yellow;
                AbstractC3410a.charlie(str2, str3, (p) this.teal, (String) this.white, function02, (InterfaceC0581m) obj, cyan2, this.silver);
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, kotlin.e eVar, String str, int i4, int i5, int i10) {
        this.alpha = i10;
        this.teal = obj;
        this.white = obj2;
        this.yellow = obj3;
        this.f2193a = eVar;
        this.purple = str;
        this.red = i4;
        this.silver = i5;
    }

    public /* synthetic */ a(String str, String str2, p pVar, String str3, Function0 function0, int i4, int i5) {
        this.alpha = 6;
        this.purple = str;
        this.f2193a = str2;
        this.teal = pVar;
        this.white = str3;
        this.yellow = function0;
        this.red = i4;
        this.silver = i5;
    }

    public /* synthetic */ a(List list, Function0 function0, s sVar, Function0 function02, String str, int i4, int i5) {
        this.alpha = 2;
        this.white = list;
        this.yellow = function0;
        this.teal = sVar;
        this.f2193a = function02;
        this.purple = str;
        this.red = i4;
        this.silver = i5;
    }
}
