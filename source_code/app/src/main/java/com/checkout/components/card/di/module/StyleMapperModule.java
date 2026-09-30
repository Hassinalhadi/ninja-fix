package com.checkout.components.card.di.module;

import T.s;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.ui.mapper.ButtonStyleToInternalStateMapper;
import com.checkout.components.ui.mapper.ButtonStyleToInternalViewStyleMapper;
import com.checkout.components.ui.mapper.ContainerStyleToModifierMapper;
import com.checkout.components.ui.mapper.ImageStyleToComposableImageMapper;
import com.checkout.components.ui.mapper.InputComponentStyleToStateMapper;
import com.checkout.components.ui.mapper.InputComponentStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToInputFieldStateMapper;
import com.checkout.components.ui.mapper.InputFieldStyleToViewStyleMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToStateMapper;
import com.checkout.components.ui.mapper.TextLabelStyleToViewStyleMapper;
import com.checkout.components.ui.model.state.InputComponentState;
import com.checkout.components.ui.model.state.InputFieldState;
import com.checkout.components.ui.model.state.InternalButtonState;
import com.checkout.components.ui.model.state.TextLabelState;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\bJ/\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013JW\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00042\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u001a0\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\bJ#\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u00042\u0006\u0010\u001c\u001a\u00020\tH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJE\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\"0\u00042\u0014\u0010 \u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u001a0\u00042\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u001d0\u0004H\u0007¢\u0006\u0004\b#\u0010$JC\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u00042\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u00042\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b'\u0010$J1\u0010*\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020)0\u00042\u0014\u0010(\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u001a0\u0004H\u0007¢\u0006\u0004\b*\u0010\u0013¨\u0006+"}, d2 = {"Lcom/checkout/components/card/di/module/StyleMapperModule;", "", "<init>", "()V", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "LT/s;", "provideContainerStyleToModifierMapper", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;", "provideImageStyleToComposableImageMapper", "()Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "provideTextLabelStyleToViewStyleMapper", "textLabelStyleMapper", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "provideInputFieldStyleToViewStyleMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "inputFieldStyleMapper", "containerMapper", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "provideInputComponentStyleMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/state/TextLabelState;", "provideTextLabelStyleToStateMapper", "imageMapper", "Lcom/checkout/components/ui/model/state/InputFieldState;", "provideInputFieldStyleToStateMapper", "(Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "textLabelMapper", "inputFieldStateMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "provideInputComponentStyleToStateMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "provideButtonStyleMapper", "textLabelStateMapper", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "provideButtonStateMapper", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StyleMapperModule {
    public static final int $stable = 0;

    @NotNull
    public final Mapper<ButtonStyle, InternalButtonState> provideButtonStateMapper(@NotNull Mapper<TextLabelStyle, TextLabelState> textLabelStateMapper) {
        Intrinsics.echo(textLabelStateMapper, "textLabelStateMapper");
        return new ButtonStyleToInternalStateMapper(textLabelStateMapper);
    }

    @NotNull
    public final Mapper<ButtonStyle, InternalButtonViewStyle> provideButtonStyleMapper(@NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper, @NotNull Mapper<ContainerStyle, s> containerMapper) {
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        Intrinsics.echo(containerMapper, "containerMapper");
        return new ButtonStyleToInternalViewStyleMapper(containerMapper, textLabelStyleMapper);
    }

    @NotNull
    public final Mapper<ContainerStyle, s> provideContainerStyleToModifierMapper() {
        return new ContainerStyleToModifierMapper();
    }

    @NotNull
    public final ImageStyleToComposableImageMapper provideImageStyleToComposableImageMapper() {
        return new ImageStyleToComposableImageMapper();
    }

    @NotNull
    public final Mapper<InputComponentStyle, InputComponentViewStyle> provideInputComponentStyleMapper(@NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper, @NotNull Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper, @NotNull Mapper<ContainerStyle, s> containerMapper) {
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        Intrinsics.echo(inputFieldStyleMapper, "inputFieldStyleMapper");
        Intrinsics.echo(containerMapper, "containerMapper");
        return new InputComponentStyleToViewStyleMapper(containerMapper, textLabelStyleMapper, inputFieldStyleMapper);
    }

    @NotNull
    public final Mapper<InputComponentStyle, InputComponentState> provideInputComponentStyleToStateMapper(@NotNull Mapper<TextLabelStyle, TextLabelState> textLabelMapper, @NotNull Mapper<InputFieldStyle, InputFieldState> inputFieldStateMapper) {
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        Intrinsics.echo(inputFieldStateMapper, "inputFieldStateMapper");
        return new InputComponentStyleToStateMapper(textLabelMapper, inputFieldStateMapper);
    }

    @NotNull
    public final Mapper<InputFieldStyle, InputFieldState> provideInputFieldStyleToStateMapper(@NotNull ImageStyleToComposableImageMapper imageMapper) {
        Intrinsics.echo(imageMapper, "imageMapper");
        return new InputFieldStyleToInputFieldStateMapper(imageMapper);
    }

    @NotNull
    public final Mapper<InputFieldStyle, InputFieldViewStyle> provideInputFieldStyleToViewStyleMapper(@NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper) {
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        return new InputFieldStyleToViewStyleMapper(textLabelStyleMapper);
    }

    @NotNull
    public final Mapper<TextLabelStyle, TextLabelState> provideTextLabelStyleToStateMapper() {
        return new TextLabelStyleToStateMapper();
    }

    @NotNull
    public final Mapper<TextLabelStyle, TextLabelViewStyle> provideTextLabelStyleToViewStyleMapper() {
        return new TextLabelStyleToViewStyleMapper();
    }
}
