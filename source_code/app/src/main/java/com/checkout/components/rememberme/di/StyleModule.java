package com.checkout.components.rememberme.di;

import T.s;
import android.content.Context;
import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.mapper.Mapper;
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
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.view.InputComponentViewStyle;
import com.checkout.components.ui.model.style.view.InputFieldViewStyle;
import com.checkout.components.ui.model.style.view.TextLabelViewStyle;
import com.checkout.components.ui.utils.CountryPickerResourceProvider;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000ej\u0002`\u001a2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001e\u001a\u00020\u001dH\u0007¢\u0006\u0004\b!\u0010\"J\u001f\u0010&\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u000ej\u0002`%H\u0007¢\u0006\u0004\b&\u0010\u0013J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0014H\u0007¢\u0006\u0004\b)\u0010*J?\u0010-\u001a\u00020,2\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u000ej\u0002`%2\u0016\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u0011H\u0007¢\u0006\u0004\b-\u0010.Jg\u00103\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010\u000ej\u0002`22\u0016\u0010+\u001a\u0012\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$0\u000ej\u0002`%2\u0016\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000ej\u0002`\u00112\u0016\u0010/\u001a\u0012\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u000ej\u0002`\u001aH\u0007¢\u0006\u0004\b3\u00104J/\u00107\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002050\u000ej\u0002`62\u0006\u0010'\u001a\u00020\u00142\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b7\u00108J3\u0010:\u001a\u0002092\u0006\u0010\u0005\u001a\u00020\u00042\u001a\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\tH\u0007¢\u0006\u0004\b:\u0010;J)\u0010A\u001a\u00020@2\b\u0010=\u001a\u0004\u0018\u00010<2\u0006\u0010\f\u001a\u0002092\u0006\u0010?\u001a\u00020>H\u0007¢\u0006\u0004\bA\u0010BJ\u0019\u0010?\u001a\u00020>2\b\u0010=\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\b?\u0010CJm\u0010E\u001a\u00020D2\u0006\u0010\f\u001a\u00020\u000b2\u0016\u00103\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002010\u000ej\u0002`22\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u000200\u0012\u0004\u0012\u0002050\u000ej\u0002`62\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\b\u0010=\u001a\u0004\u0018\u00010<H\u0007¢\u0006\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lcom/checkout/components/rememberme/di/StyleModule;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/Translation;", "translation", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "(Landroid/content/Context;Ljava/util/Map;)Lcom/checkout/components/interfaces/ui/ResourceProvider;", "Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "Lcom/checkout/components/ui/model/style/view/TextLabelViewStyle;", "Lcom/checkout/components/ui/mapper/TextLabelViewStyleMapper;", "textLabelStyleToViewStyleMapper", "()Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "textLabelStyleToStateMapper", "()Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;", "textLabelStyleMapper", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/style/view/InputFieldViewStyle;", "Lcom/checkout/components/ui/mapper/InputFieldViewStyleMapper;", "inputFieldViewStyleMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;", "imageMapper", "()Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;", "Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;", "inputFieldStateMapper", "(Lcom/checkout/components/ui/mapper/ImageStyleToComposableImageMapper;)Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "LT/s;", "Lcom/checkout/components/ui/mapper/ContainerStyleMapper;", "containerStyleToModifierMapper", "textLabelMapper", "Lcom/checkout/components/ui/mapper/ButtonStyleToInternalStateMapper;", "buttonStyleToInternalStateMapper", "(Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;)Lcom/checkout/components/ui/mapper/ButtonStyleToInternalStateMapper;", "containerMapper", "Lcom/checkout/components/ui/mapper/ButtonStyleToInternalViewStyleMapper;", "buttonStyleToInternalStyleMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/ui/mapper/ButtonStyleToInternalViewStyleMapper;", "inputFieldStyleMapper", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Lcom/checkout/components/ui/model/style/view/InputComponentViewStyle;", "Lcom/checkout/components/ui/mapper/InputComponentViewStyleMapper;", "inputComponentViewStyleMapper", "(Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/model/state/InputComponentState;", "Lcom/checkout/components/ui/mapper/InputComponentStateMapper;", "inputComponentStateMapper", "(Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;Lcom/checkout/components/ui/mapper/InputFieldStyleToInputFieldStateMapper;)Lcom/checkout/components/interfaces/mapper/Mapper;", "Lcom/checkout/components/ui/utils/CountryPickerResourceProvider;", "countryPickerResourceProvider", "(Landroid/content/Context;Ljava/util/Map;)Lcom/checkout/components/ui/utils/CountryPickerResourceProvider;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "screenHeaderStyleUtils", "Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "countryPickerStyleUtils", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/ui/utils/CountryPickerResourceProvider;Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;)Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "styleProvider", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/interfaces/mapper/Mapper;Lcom/checkout/components/ui/mapper/TextLabelStyleToStateMapper;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/rememberme/di/DefaultStyleProvider;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StyleModule {
    public static final int $stable = 0;

    @NotNull
    public final ButtonStyleToInternalStateMapper buttonStyleToInternalStateMapper(@NotNull TextLabelStyleToStateMapper textLabelMapper) {
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        return new ButtonStyleToInternalStateMapper(textLabelMapper);
    }

    @NotNull
    public final ButtonStyleToInternalViewStyleMapper buttonStyleToInternalStyleMapper(@NotNull Mapper<ContainerStyle, s> containerMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelMapper) {
        Intrinsics.echo(containerMapper, "containerMapper");
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        return new ButtonStyleToInternalViewStyleMapper(containerMapper, textLabelMapper);
    }

    @NotNull
    public final Mapper<ContainerStyle, s> containerStyleToModifierMapper() {
        return new ContainerStyleToModifierMapper();
    }

    @NotNull
    public final CountryPickerResourceProvider countryPickerResourceProvider(@NotNull Context context, @Nullable Map<ComponentTranslationKey, String> translation) {
        Intrinsics.echo(context, "context");
        return new CountryPickerResourceProvider(context, translation);
    }

    @NotNull
    public final CountryPickerStyleUtils countryPickerStyleUtils(@Nullable DesignTokens designTokens, @NotNull CountryPickerResourceProvider resourceProvider, @NotNull ScreenHeaderStyleUtils screenHeaderStyleUtils) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(screenHeaderStyleUtils, "screenHeaderStyleUtils");
        return new CountryPickerStyleUtils(resourceProvider, designTokens, screenHeaderStyleUtils);
    }

    @NotNull
    public final ImageStyleToComposableImageMapper imageMapper() {
        return new ImageStyleToComposableImageMapper();
    }

    @NotNull
    public final Mapper<InputComponentStyle, InputComponentState> inputComponentStateMapper(@NotNull TextLabelStyleToStateMapper textLabelMapper, @NotNull InputFieldStyleToInputFieldStateMapper inputFieldStateMapper) {
        Intrinsics.echo(textLabelMapper, "textLabelMapper");
        Intrinsics.echo(inputFieldStateMapper, "inputFieldStateMapper");
        return new InputComponentStyleToStateMapper(textLabelMapper, inputFieldStateMapper);
    }

    @NotNull
    public final Mapper<InputComponentStyle, InputComponentViewStyle> inputComponentViewStyleMapper(@NotNull Mapper<ContainerStyle, s> containerMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper, @NotNull Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldStyleMapper) {
        Intrinsics.echo(containerMapper, "containerMapper");
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        Intrinsics.echo(inputFieldStyleMapper, "inputFieldStyleMapper");
        return new InputComponentStyleToViewStyleMapper(containerMapper, textLabelStyleMapper, inputFieldStyleMapper);
    }

    @NotNull
    public final InputFieldStyleToInputFieldStateMapper inputFieldStateMapper(@NotNull ImageStyleToComposableImageMapper imageMapper) {
        Intrinsics.echo(imageMapper, "imageMapper");
        return new InputFieldStyleToInputFieldStateMapper(imageMapper);
    }

    @NotNull
    public final Mapper<InputFieldStyle, InputFieldViewStyle> inputFieldViewStyleMapper(@NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleMapper) {
        Intrinsics.echo(textLabelStyleMapper, "textLabelStyleMapper");
        return new InputFieldStyleToViewStyleMapper(textLabelStyleMapper);
    }

    @NotNull
    public final ResourceProvider resourceProvider(@NotNull Context context, @Nullable Map<ComponentTranslationKey, String> translation) {
        Intrinsics.echo(context, "context");
        return new ResourceProviderImpl(context, translation);
    }

    @NotNull
    public final ScreenHeaderStyleUtils screenHeaderStyleUtils(@Nullable DesignTokens designTokens) {
        return new ScreenHeaderStyleUtils(designTokens);
    }

    @NotNull
    public final DefaultStyleProvider styleProvider(@NotNull ResourceProvider resourceProvider, @NotNull Mapper<InputComponentStyle, InputComponentViewStyle> inputComponentViewStyleMapper, @NotNull Mapper<InputComponentStyle, InputComponentState> inputComponentStateMapper, @NotNull Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleToViewStyleMapper, @NotNull TextLabelStyleToStateMapper textLabelStyleToStateMapper, @Nullable DesignTokens designTokens) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(inputComponentViewStyleMapper, "inputComponentViewStyleMapper");
        Intrinsics.echo(inputComponentStateMapper, "inputComponentStateMapper");
        Intrinsics.echo(textLabelStyleToViewStyleMapper, "textLabelStyleToViewStyleMapper");
        Intrinsics.echo(textLabelStyleToStateMapper, "textLabelStyleToStateMapper");
        return new DefaultStyleProvider(resourceProvider, inputComponentViewStyleMapper, inputComponentStateMapper, textLabelStyleToViewStyleMapper, textLabelStyleToStateMapper, designTokens);
    }

    @NotNull
    public final TextLabelStyleToStateMapper textLabelStyleToStateMapper() {
        return new TextLabelStyleToStateMapper();
    }

    @NotNull
    public final Mapper<TextLabelStyle, TextLabelViewStyle> textLabelStyleToViewStyleMapper() {
        return new TextLabelStyleToViewStyleMapper();
    }
}
