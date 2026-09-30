package Ec;

import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.InterfaceC0581m;
import bz.X;
import bz.a0;
import bz.e0;
import com.app.network.network.models.Shift;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewKt;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.ui.country.CountryPickerBottomSheetScreenKt;
import com.checkout.components.ui.country.CountryPickerViewModel;
import com.checkout.components.ui.model.CountryPickerType;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.view.field.CountryFieldViewKt;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import q0.InterfaceC2392k;
import yf.L;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Xd.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ b(Shift shift, List list, Function0 function0, Function1 function1, Function0 function02, int i4) {
        this.alpha = 0;
        this.red = shift;
        this.silver = list;
        this.teal = function0;
        this.yellow = function1;
        this.white = function02;
        this.purple = i4;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        Unit CountryPickerBottomSheetScreen$lambda$9;
        Unit a6;
        switch (this.alpha) {
            case 0:
                ((Integer) obj2).getClass();
                int cyan = C0564b.cyan(this.purple | 1);
                Function1 function1 = (Function1) this.yellow;
                Function0 function0 = (Function0) this.white;
                c.alpha((Shift) this.red, (List) this.silver, (Function0) this.teal, function1, function0, (InterfaceC0581m) obj, cyan);
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                int cyan2 = C0564b.cyan(this.purple | 1);
                N2.n nVar = (N2.n) this.silver;
                T.f fVar = (T.f) this.white;
                InterfaceC2392k interfaceC2392k = (InterfaceC2392k) this.yellow;
                N2.p.delta((T.s) this.red, nVar, (String) this.teal, fVar, interfaceC2392k, (InterfaceC0581m) obj, cyan2);
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).intValue();
                ((P.d) this.red).india(this.silver, this.teal, this.white, this.yellow, (InterfaceC0581m) obj, C0564b.cyan(this.purple) | 1);
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                int cyan3 = C0564b.cyan(1);
                String str = (String) this.yellow;
                Wb.t.alpha((File) this.red, (Function0) this.teal, (Function0) this.white, (Function0) this.silver, str, (InterfaceC0581m) obj, cyan3, this.purple);
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).intValue();
                e0.alpha((a0) this.red, (X) this.silver, this.teal, this.white, (bz.aa) this.yellow, (InterfaceC0581m) obj, C0564b.cyan(this.purple | 1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                int cyan4 = C0564b.cyan(this.purple | 1);
                T.s sVar = (T.s) this.white;
                Function0 function02 = (Function0) this.teal;
                c.g.charlie((String) this.red, (c.c) this.silver, sVar, (Xd.m) this.yellow, function02, (InterfaceC0581m) obj, cyan4);
                return Unit.INSTANCE;
            case 6:
                int intValue = ((Integer) obj2).intValue();
                CountryPickerViewModel countryPickerViewModel = (CountryPickerViewModel) this.red;
                Y1.r rVar = (Y1.r) this.silver;
                CountryPickerType countryPickerType = (CountryPickerType) this.teal;
                Function1 function12 = (Function1) this.yellow;
                int i4 = this.purple;
                CountryPickerBottomSheetScreen$lambda$9 = CountryPickerBottomSheetScreenKt.CountryPickerBottomSheetScreen$lambda$9(countryPickerViewModel, rVar, countryPickerType, (Country) this.white, function12, i4, (InterfaceC0581m) obj, intValue);
                return CountryPickerBottomSheetScreen$lambda$9;
            case 7:
                return CountryFieldViewKt.alpha((InputComponentState) this.red, (InputComponentViewStyle) this.silver, (Function0) this.teal, (String) this.white, (CountryPickerType) this.yellow, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
            default:
                a6 = PayButtonViewKt.a((InternalButtonViewStyle) this.red, (InternalButtonState) this.silver, (Function0) this.teal, (L) this.white, (L) this.yellow, this.purple, (InterfaceC0581m) obj, ((Integer) obj2).intValue());
                return a6;
        }
    }

    public /* synthetic */ b(File file, Function0 function0, Function0 function02, Function0 function03, String str, int i4, int i5) {
        this.alpha = 3;
        this.red = file;
        this.teal = function0;
        this.white = function02;
        this.silver = function03;
        this.yellow = str;
        this.purple = i5;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4, int i5) {
        this.alpha = i5;
        this.red = obj;
        this.silver = obj2;
        this.teal = obj3;
        this.white = obj4;
        this.yellow = obj5;
        this.purple = i4;
    }

    public /* synthetic */ b(String str, c.c cVar, T.s sVar, Xd.m mVar, Function0 function0, int i4) {
        this.alpha = 5;
        this.red = str;
        this.silver = cVar;
        this.white = sVar;
        this.yellow = mVar;
        this.teal = function0;
        this.purple = i4;
    }
}
