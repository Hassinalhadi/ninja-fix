package com.checkout.address.di;

import T.s;
import com.checkout.address.mapper.AddressFieldToInputComponentStyleMapper;
import com.checkout.address.model.AddressFieldItem;
import com.checkout.address.utils.StyleUtils;
import com.checkout.components.interfaces.data.PrimitiveStateFlowRepository;
import com.checkout.components.interfaces.mapper.Mapper;
import com.checkout.components.interfaces.model.AddressField;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
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
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.InternalButtonViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\nH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ7\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0007j\u0002`\u00132\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u0007j\u0002`\u00182\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0007j\u0002`\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\fJO\u0010#\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0007j\u0002`\"2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0007j\u0002`\u001dH\u0007¢\u0006\u0004\b#\u0010$JO\u0010(\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0\u0007j\u0002`'2\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007j\u0002`\n2\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001c0\u0007j\u0002`\u001dH\u0007¢\u0006\u0004\b(\u0010$J?\u0010-\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020+0\u0007j\u0002`,2\u0006\u0010)\u001a\u00020\r2\u0016\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00170\u0007j\u0002`\u0018H\u0007¢\u0006\u0004\b-\u0010.Ja\u00108\u001a\u0012\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002060\u0007j\u0002`72\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u0007j\u0002`\"2\u0016\u00100\u001a\u0012\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020+0\u0007j\u0002`,2\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0004\b8\u00109J'\u0010=\u001a\u0012\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020;0\u0007j\u0002`<2\u0006\u0010:\u001a\u00020\rH\u0007¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u00020?2\b\u00104\u001a\u0004\u0018\u000103H\u0007¢\u0006\u0004\b@\u0010AJ)\u0010E\u001a\u00020D2\u0006\u00102\u001a\u00020B2\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010C\u001a\u00020?H\u0007¢\u0006\u0004\bE\u0010FJ1\u0010I\u001a\u00020H2\u0006\u00102\u001a\u0002012\b\u00104\u001a\u0004\u0018\u0001032\u0006\u0010G\u001a\u00020D2\u0006\u0010C\u001a\u00020?H\u0007¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010L0KH\u0007¢\u0006\u0004\bM\u0010N¨\u0006O"}, d2 = {"Lcom/checkout/address/di/AddressStyleModule;", "", "<init>", "()V", "Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;", "provideImageStyleToComposableImageMapper", "()Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "provideTextLabelStyleToViewStyleMapper", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "provideTextLabelStyleToStateMapper", "()Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "textLabelStyleMapper", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "provideInputFieldViewStyleMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "imageMapper", "Lcom/checkout/components/ui/model/state/InputFieldState;", "Lcom/checkout/components/ui/mapper/InputFieldStateMapper;", "provideInputFieldStyleToStateMapper", "(Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "LT/s;", "Lcom/checkout/components/ui/mapper/ContainerStyleMapper;", "provideContainerStyleToModifierMapper", "containerMapper", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "Lcom/checkout/components/ui/mapper/InputComponentViewStyleMapper;", "provideStyleMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "Lcom/checkout/components/ui/model/style/view/InternalButtonViewStyle;", "Lcom/checkout/components/ui/mapper/ButtonViewStyleMapper;", "provideButtonStyleMapper", "textLabelMapper", "inputFieldStateMapper", "Lcom/checkout/components/ui/model/state/InputComponentState;", "Lcom/checkout/components/ui/mapper/InputComponentStateMapper;", "provideStateMapper", "(Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "styleMapper", "stateMapper", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Lcom/checkout/components/interfaces/model/AddressField;", "Lcom/checkout/address/model/AddressFieldItem;", "Lcom/checkout/address/mapper/AddressFieldStyleMapper;", "provideAddressFieldMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/interfaces/mapper/Mapper;", "textLabelStateMapper", "Lcom/checkout/components/ui/model/state/InternalButtonState;", "Lcom/checkout/components/ui/mapper/ButtonStateMapper;", "provideButtonStateMapper", "(Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "provideScreenHeaderStyleUtils", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "Lcom/checkout/components/ui/utils/CountryPickerResourceProvider;", "screenHeaderStyleUtils", "Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "provideCountryPickerStyleUtils", "(Lcom/checkout/components/ui/utils/CountryPickerResourceProvider;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;)Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "countryPickerStyleUtils", "Lcom/checkout/address/utils/StyleUtils;", "provideStyleUtils", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;)Lcom/checkout/address/utils/StyleUtils;", "Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "", "errorMessageRepository", "()Lcom/checkout/components/interfaces/data/PrimitiveStateFlowRepository;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AddressStyleModule {
    public static final int $stable = 0;

    @NotNull
    public final PrimitiveStateFlowRepository<String> errorMessageRepository() {
        return PrimitiveStateFlowRepository.INSTANCE.create(null);
    }

    @NotNull
    public final Mapper<AddressField, AddressFieldItem> provideAddressFieldMapper(@NotNull Mapper<InputComponentStyle, InputComponentViewStyle> styleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> stateMapper, @NotNull ResourceProvider resourceProvider, @Nullable DesignTokens designTokens) {
        Intrinsics.echo(styleMapper, "styleMapper");
        Intrinsics.echo(stateMapper, "stateMapper");
        Intrinsics.echo(resourceProvider, "resourceProvider");
        return new AddressFieldToInputComponentStyleMapper(designTokens, styleMapper, stateMapper, resourceProvider);
    }

    @NotNull
    public final Mapper<ButtonStyle, InternalButtonState> provideButtonStateMapper(@NotNull TextLabelStyleToStateMapper textLabelStateMapper) {
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
    public final CountryPickerStyleUtils provideCountryPickerStyleUtils(@NotNull CountryPickerResourceProvider resourceProvider, @Nullable DesignTokens designTokens, @NotNull ScreenHeaderStyleUtils screenHeaderStyleUtils) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(screenHeaderStyleUtils, "screenHeaderStyleUtils");
        return new CountryPickerStyleUtils(resourceProvider, designTokens, screenHeaderStyleUtils);
    }

    @NotNull
    public final ImageStyleToComposableImageMapper provideImageStyleToComposableImageMapper() {
        return new ImageStyleToComposableImageMapper();
    }

    @NotNull
    public final Mapper<InputFieldStyle, InputFieldState> provideInputFieldStyleToStateMapper(@NotNull ImageStyleToComposableImageMapper imageMapper) {
        Intrinsics.echo(imageMapper, "imageMapper");
        return new InputFieldStyleToInputFieldStateMapper(imageMapper);
    }

    @NotNull
    public final Mapper<InputFieldStyle, InputFieldViewStyle> provideInputFieldViewStyleMapper(@NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper) {
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        return new InputFieldStyleToViewStyleMapper(textLabelStyleMapper);
    }

    @NotNull
    public final ScreenHeaderStyleUtils provideScreenHeaderStyleUtils(@Nullable DesignTokens designTokens) {
        return new ScreenHeaderStyleUtils(designTokens);
    }

    @NotNull
    public final Mapper<InputComponentStyle, InputComponentState> provideStateMapper(@NotNull TextLabelStyleToStateMapper textLabelMapper, @NotNull Mapper<InputFieldStyle, InputFieldState> inputFieldStateMapper) {
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        Intrinsics.echo(inputFieldStateMapper, "inputFieldStateMapper");
        return new InputComponentStyleToStateMapper(textLabelMapper, inputFieldStateMapper);
    }

    @NotNull
    public final Mapper<InputComponentStyle, InputComponentViewStyle> provideStyleMapper(@NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper, @NotNull Mapper<ContainerStyle, s> containerMapper) {
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        Intrinsics.echo(containerMapper, "containerMapper");
        return new InputComponentStyleToViewStyleMapper(containerMapper, textLabelStyleMapper, new InputFieldStyleToViewStyleMapper(new TextLabelStyleToViewStyleMapper()));
    }

    @NotNull
    public final StyleUtils provideStyleUtils(@NotNull ResourceProvider resourceProvider, @Nullable DesignTokens designTokens, @NotNull CountryPickerStyleUtils countryPickerStyleUtils, @NotNull ScreenHeaderStyleUtils screenHeaderStyleUtils) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(countryPickerStyleUtils, "countryPickerStyleUtils");
        Intrinsics.echo(screenHeaderStyleUtils, "screenHeaderStyleUtils");
        return new StyleUtils(resourceProvider, designTokens, countryPickerStyleUtils, screenHeaderStyleUtils);
    }

    @NotNull
    public final TextLabelStyleToStateMapper provideTextLabelStyleToStateMapper() {
        return new TextLabelStyleToStateMapper();
    }

    @NotNull
    public final Mapper<TextLabelStyle, TextLabelViewStyle> provideTextLabelStyleToViewStyleMapper() {
        return new TextLabelStyleToViewStyleMapper();
    }
}
