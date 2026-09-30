package com.checkout.components.ui.country;

import com.checkout.components.address.AbstractC0870k;
import com.checkout.components.address.S;
import com.checkout.components.address.U;
import com.checkout.components.ui.view.field.PickerFieldViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import okhttp3.Handshake;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Function0 purple;

    public /* synthetic */ c(Function0 function0, int i4) {
        this.alpha = i4;
        this.purple = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return CountryPickerBottomSheetScreenKt.charlie(this.purple);
            case 1:
                this.purple.invoke();
                return Unit.INSTANCE;
            case 2:
                this.purple.invoke();
                return Unit.INSTANCE;
            case 3:
                Function0 function0 = this.purple;
                if (function0 != null) {
                    function0.invoke();
                }
                return Unit.INSTANCE;
            case 4:
                Function0 function02 = this.purple;
                if (function02 != null) {
                    function02.invoke();
                }
                return Unit.INSTANCE;
            case 5:
                Function0 function03 = this.purple;
                if (function03 != null) {
                    function03.invoke();
                }
                return Unit.INSTANCE;
            case 6:
                return S.a(this.purple);
            case 7:
                return U.a(this.purple);
            case 8:
                return AbstractC0870k.a(this.purple);
            case 9:
                return PickerFieldViewKt.bravo(this.purple);
            default:
                return Handshake.alpha(this.purple);
        }
    }
}
