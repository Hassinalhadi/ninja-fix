package com.checkout.components.rememberme;

import com.checkout.components.rememberme.di.DiComponent;
import com.checkout.components.ui.model.TextLabelViewItem;
import com.checkout.components.ui.model.style.base.TextLabelStyle;

/* loaded from: classes3.dex */
public abstract class o2 {
    public static final TextLabelViewItem a(TextLabelStyle textLabelStyle, DiComponent diComponent) {
        return new TextLabelViewItem(diComponent.textLabelViewStyleMapper().map(textLabelStyle), diComponent.textLabelStateMapper().map(textLabelStyle));
    }
}
