package Pa;

import D0.an;
import T.s;
import Xd.l;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.view.CheckboxLabelViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final /* synthetic */ class f implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f1899a;
    public final /* synthetic */ int alpha = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1900b;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ s red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ int teal;
    public final /* synthetic */ int white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ f(DesignTokens designTokens, TextLabelViewItem textLabelViewItem, boolean z2, Function1 function1, s sVar, String str, int i4, int i5) {
        this.yellow = designTokens;
        this.f1899a = textLabelViewItem;
        this.purple = z2;
        this.f1900b = function1;
        this.red = sVar;
        this.silver = str;
        this.teal = i4;
        this.white = i5;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit CheckboxLabelView$lambda$0;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.teal | 1);
                an anVar = (an) this.f1900b;
                i.foxtrot(this.silver, (Function0) this.yellow, this.purple, this.red, (P.d) this.f1899a, anVar, (InterfaceC0581m) obj, cyan, this.white);
                return Unit.INSTANCE;
            default:
                int intValue = ((Integer) obj2).intValue();
                TextLabelViewItem textLabelViewItem = (TextLabelViewItem) this.f1899a;
                Function1 function1 = (Function1) this.f1900b;
                int i4 = this.teal;
                int i5 = this.white;
                CheckboxLabelView$lambda$0 = CheckboxLabelViewKt.CheckboxLabelView$lambda$0((DesignTokens) this.yellow, textLabelViewItem, this.purple, function1, this.red, this.silver, i4, i5, (InterfaceC0581m) obj, intValue);
                return CheckboxLabelView$lambda$0;
        }
    }

    public /* synthetic */ f(String str, Function0 function0, boolean z2, s sVar, P.d dVar, an anVar, int i4, int i5) {
        this.silver = str;
        this.yellow = function0;
        this.purple = z2;
        this.red = sVar;
        this.f1899a = dVar;
        this.f1900b = anVar;
        this.teal = i4;
        this.white = i5;
    }
}
