package com.checkout.components.ui.country;

import com.checkout.address.model.State;
import com.checkout.components.address.U;
import com.checkout.components.interfaces.model.contact.Country;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final /* synthetic */ class b implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ Function0 red;

    public /* synthetic */ b(int i4, Function0 function0, Function1 function1) {
        this.alpha = i4;
        this.purple = function1;
        this.red = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Unit CountryPickerBottomSheetScreen$lambda$8$lambda$5$lambda$4;
        switch (this.alpha) {
            case 0:
                CountryPickerBottomSheetScreen$lambda$8$lambda$5$lambda$4 = CountryPickerBottomSheetScreenKt.CountryPickerBottomSheetScreen$lambda$8$lambda$5$lambda$4(this.purple, this.red, (Country) obj);
                return CountryPickerBottomSheetScreen$lambda$8$lambda$5$lambda$4;
            default:
                return U.a(this.purple, this.red, (State) obj);
        }
    }
}
