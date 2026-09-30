package com.checkout.components.ui.mapper;

import androidx.compose.runtime.C0564b;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\b"}, d2 = {"Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/state/TextLabelState;", "<init>", "()V", "map", "from", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TextLabelStyleToStateMapper implements Mapper<TextLabelStyle, TextLabelState> {
    public static final int $stable = 0;

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public TextLabelState map(@Nullable TextLabelStyle from) {
        String text = from != null ? from.getText() : null;
        if (text == null) {
            text = "";
        }
        Integer textId = from != null ? from.getTextId() : null;
        return new TextLabelState(C0564b.zulu(text), C0564b.zulu(textId), C0564b.zulu(Boolean.valueOf((StringsKt.gray(text) && textId == null) ? false : true)));
    }
}
