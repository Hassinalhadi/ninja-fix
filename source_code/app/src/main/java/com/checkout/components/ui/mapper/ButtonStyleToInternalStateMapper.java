package com.checkout.components.ui.mapper;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001d\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/ui/mapper/ButtonStyleToInternalStateMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "textLabelMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/state/TextLabelState;", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;)V", "map", "from", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ButtonStyleToInternalStateMapper implements Mapper<ButtonStyle, InternalButtonState> {
    public static final int $stable = 8;

    @NotNull
    private final Mapper<TextLabelStyle, TextLabelState> textLabelMapper;

    public ButtonStyleToInternalStateMapper(@NotNull Mapper<TextLabelStyle, TextLabelState> textLabelMapper) {
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        this.textLabelMapper = textLabelMapper;
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public InternalButtonState map(@NotNull ButtonStyle from) {
        Intrinsics.echo(from, "from");
        return new InternalButtonState(null, this.textLabelMapper.map(from.getTextStyle()), 1, null);
    }
}
