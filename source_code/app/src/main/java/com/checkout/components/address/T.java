package com.checkout.components.address;

import com.checkout.address.ui.state.StatePickerViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class T extends kotlin.jvm.internal.i implements Function0 {
    public T(StatePickerViewModel statePickerViewModel) {
        super(0, 0, StatePickerViewModel.class, statePickerViewModel, "onBottomSheetDismissed", "onBottomSheetDismissed()V");
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        ((StatePickerViewModel) this.receiver).onQueryChanged("");
        return Unit.INSTANCE;
    }
}
