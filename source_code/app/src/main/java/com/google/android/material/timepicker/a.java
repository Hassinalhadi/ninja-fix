package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.y;

/* loaded from: classes2.dex */
public final class a extends y {
    public final /* synthetic */ ChipTextInputComboView alpha;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.alpha = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.alpha;
        if (isEmpty) {
            chipTextInputComboView.alpha.setText(ChipTextInputComboView.alpha(chipTextInputComboView, "00"));
            return;
        }
        String alpha = ChipTextInputComboView.alpha(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.alpha;
        if (TextUtils.isEmpty(alpha)) {
            alpha = ChipTextInputComboView.alpha(chipTextInputComboView, "00");
        }
        chip.setText(alpha);
    }
}
