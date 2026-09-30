package l5;

import Xd.l;
import androidx.compose.runtime.InterfaceC0581m;
import com.checkout.components.ui.model.InputComponentViewItem;
import com.checkout.components.ui.view.field.PaymentMethodPhoneFieldViewKt;
import com.checkout.components.ui.view.field.PhoneFieldViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: l5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2057a implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12945a;
    public final /* synthetic */ int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f12946b;
    public final /* synthetic */ int purple;
    public final /* synthetic */ InputComponentViewItem red;
    public final /* synthetic */ InputComponentViewItem silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ l white;
    public final /* synthetic */ Function0 yellow;

    public /* synthetic */ C2057a(int i4, InputComponentViewItem inputComponentViewItem, InputComponentViewItem inputComponentViewItem2, String str, l lVar, Function0 function0, int i5, int i10, int i11) {
        this.alpha = i11;
        this.purple = i4;
        this.red = inputComponentViewItem;
        this.silver = inputComponentViewItem2;
        this.teal = str;
        this.white = lVar;
        this.yellow = function0;
        this.f12945a = i5;
        this.f12946b = i10;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit PaymentMethodPhoneFieldView$lambda$5;
        Unit PhoneFieldView$lambda$5;
        switch (this.alpha) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                InputComponentViewItem inputComponentViewItem = this.red;
                InputComponentViewItem inputComponentViewItem2 = this.silver;
                l lVar = this.white;
                Function0 function0 = this.yellow;
                int i4 = this.f12945a;
                int i5 = this.f12946b;
                PaymentMethodPhoneFieldView$lambda$5 = PaymentMethodPhoneFieldViewKt.PaymentMethodPhoneFieldView$lambda$5(this.purple, inputComponentViewItem, inputComponentViewItem2, this.teal, lVar, function0, i4, i5, (InterfaceC0581m) obj, intValue);
                return PaymentMethodPhoneFieldView$lambda$5;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                InputComponentViewItem inputComponentViewItem3 = this.red;
                InputComponentViewItem inputComponentViewItem4 = this.silver;
                l lVar2 = this.white;
                Function0 function02 = this.yellow;
                int i10 = this.f12945a;
                int i11 = this.f12946b;
                PhoneFieldView$lambda$5 = PhoneFieldViewKt.PhoneFieldView$lambda$5(this.purple, inputComponentViewItem3, inputComponentViewItem4, this.teal, lVar2, function02, i10, i11, (InterfaceC0581m) obj, intValue2);
                return PhoneFieldView$lambda$5;
        }
    }
}
