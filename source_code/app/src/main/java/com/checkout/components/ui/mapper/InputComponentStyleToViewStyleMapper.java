package com.checkout.components.ui.mapper;

import I0.aj;
import T.s;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n.aw;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001BC\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0001\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0012R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/ui/mapper/InputComponentStyleToViewStyleMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "LT/s;", "containerMapper", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "textLabelStyleMapper", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "inputFieldStyleMapper", "<init>", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;)V", "from", "map", "(Lcom/checkout/components/ui/model/style/base/InputComponentStyle;)Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InputComponentStyleToViewStyleMapper implements Mapper<InputComponentStyle, InputComponentViewStyle> {
    public static final int $stable = 8;

    @NotNull
    private final Mapper<ContainerStyle, s> containerMapper;

    @NotNull
    private final Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper;

    @NotNull
    private final Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper;

    public InputComponentStyleToViewStyleMapper(@NotNull Mapper<ContainerStyle, s> containerMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper, @NotNull Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper) {
        Intrinsics.echo(containerMapper, "containerMapper");
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        Intrinsics.echo(inputFieldStyleMapper, "inputFieldStyleMapper");
        this.containerMapper = containerMapper;
        this.textLabelStyleMapper = textLabelStyleMapper;
        this.inputFieldStyleMapper = inputFieldStyleMapper;
    }

    @Override // com.checkout.components.interfaces.mapper.Mapper
    @NotNull
    public InputComponentViewStyle map(@NotNull InputComponentStyle from) {
        TextLabelViewStyle textLabelViewStyle;
        Intrinsics.echo(from, "from");
        TextLabelStyle errorMessageStyle = from.getErrorMessageStyle();
        if (errorMessageStyle == null || (textLabelViewStyle = this.textLabelStyleMapper.map(errorMessageStyle)) == null) {
            textLabelViewStyle = new TextLabelViewStyle(null, 0, false, 0, null, null, false, 127, null);
        }
        InputFieldViewStyle map = this.inputFieldStyleMapper.map(from.getInputFieldStyle());
        aw keyboardOptions = from.getKeyboardOptions();
        if (keyboardOptions == null) {
            keyboardOptions = map.getKeyboardOptions();
        }
        aw awVar = keyboardOptions;
        aj visualTransformation = from.getVisualTransformation();
        if (visualTransformation == null) {
            visualTransformation = map.getVisualTransformation();
        }
        return new InputComponentViewStyle(InputFieldViewStyle.copy$default(map, null, false, false, null, null, null, visualTransformation, awVar, null, false, 0, 0, null, null, null, 32575, null), textLabelViewStyle, this.containerMapper.map(from.getContainerStyle()));
    }
}
