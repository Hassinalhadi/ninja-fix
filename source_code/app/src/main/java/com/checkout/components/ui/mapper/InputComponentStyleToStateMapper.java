package com.checkout.components.ui.mapper;

import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B1\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u001c\u0010\u0004\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/ui/mapper/InputComponentStyleToStateMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/state/InputComponentState;", "textLabelMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/state/TextLabelState;", "inputFieldStateMapper", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/state/InputFieldState;", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;)V", "map", "from", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputComponentStyleToStateMapper implements Mapper<InputComponentStyle, InputComponentState> {
    public static final int $stable = 8;

    @NotNull
    private final Mapper<InputFieldStyle, InputFieldState> inputFieldStateMapper;

    @NotNull
    private final Mapper<TextLabelStyle, TextLabelState> textLabelMapper;

    public InputComponentStyleToStateMapper(@NotNull Mapper<TextLabelStyle, TextLabelState> textLabelMapper, @NotNull Mapper<InputFieldStyle, InputFieldState> inputFieldStateMapper) {
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        Intrinsics.echo(inputFieldStateMapper, "inputFieldStateMapper");
        this.textLabelMapper = textLabelMapper;
        this.inputFieldStateMapper = inputFieldStateMapper;
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public InputComponentState map(@NotNull InputComponentStyle from) {
        Intrinsics.echo(from, "from");
        InputComponentState inputComponentState = new InputComponentState(this.inputFieldStateMapper.map(from.getInputFieldStyle()), this.textLabelMapper.map(from.getErrorMessageStyle()));
        Integer defaultTextMaxLength = from.getDefaultTextMaxLength();
        if (defaultTextMaxLength != null) {
            inputComponentState.getInputFieldState().getMaxLength().setValue(Integer.valueOf(defaultTextMaxLength.intValue()));
        }
        return inputComponentState;
    }
}
