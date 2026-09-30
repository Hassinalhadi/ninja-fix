package com.checkout.components.card.di.module;

import com.checkout.components.card.R;
import com.checkout.components.card.di.AddressLabelStyle;
import com.checkout.components.card.di.CVVStyle;
import com.checkout.components.card.di.CardHolderNameStyle;
import com.checkout.components.card.di.CardNumberStyle;
import com.checkout.components.card.di.ErrorLabelStyle;
import com.checkout.components.card.di.ExpiryDateStyle;
import com.checkout.components.card.model.CardNumberComponentStyle;
import com.checkout.components.card.model.InfoBottomSheetStyle;
import com.checkout.components.card.ui.style.DefaultInputComponentStyle;
import com.checkout.components.interfaces.component.CardConfiguration;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.ui.model.style.base.ButtonStyle;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.style.DefaultButtonStyle;
import com.checkout.components.ui.style.DefaultStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.J4;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u0010\f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eH\u0007J$\u0010\u000f\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007J\u001a\u0010\u0012\u001a\u00020\u00132\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\u0014\u001a\u00020\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/card/di/module/ComponentStyleModule;", "", "<init>", "()V", "provideCardNumberStyle", "Lcom/checkout/components/card/model/CardNumberComponentStyle;", "designTokens", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "provideCVVStyle", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "provideExpiryDateStyle", "locale", "Ljava/util/Locale;", "provideCardHolderNameStyle", "cardConfiguration", "Lcom/checkout/components/interfaces/component/CardConfiguration;", "providePayButtonStyle", "Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "provideAddressLabelStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "provideErrorLabelStyle", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ComponentStyleModule {
    public static final int $stable = 0;

    @AddressLabelStyle
    @NotNull
    public final TextLabelStyle provideAddressLabelStyle(@Nullable DesignTokens designTokens, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        return DefaultStyle.checkboxLabelStyle$default(DefaultStyle.INSTANCE, resourceProvider.getString(R.string.cko_card_address_use_shipping_as_billing), null, designTokens, 2, null);
    }

    @CVVStyle
    @NotNull
    public final InputComponentStyle provideCVVStyle(@Nullable DesignTokens designTokens, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        return DefaultInputComponentStyle.INSTANCE.createCVVStyle(resourceProvider, designTokens);
    }

    @CardHolderNameStyle
    @NotNull
    public final InputComponentStyle provideCardHolderNameStyle(@Nullable DesignTokens designTokens, @NotNull ResourceProvider resourceProvider, @Nullable CardConfiguration cardConfiguration) {
        int i4;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        DefaultInputComponentStyle defaultInputComponentStyle = DefaultInputComponentStyle.INSTANCE;
        if (cardConfiguration != null) {
            i4 = cardConfiguration.getCardholderNameMaxLength();
        } else {
            i4 = 255;
        }
        return defaultInputComponentStyle.createCardHolderNameStyle(designTokens, resourceProvider, J4.delta(i4, 1, 255));
    }

    @CardNumberStyle
    @NotNull
    public final CardNumberComponentStyle provideCardNumberStyle(@Nullable DesignTokens designTokens, @NotNull ResourceProvider resourceProvider) {
        long j5;
        ColorTokens colorTokens;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        InputComponentStyle createCardNumberStyle = DefaultInputComponentStyle.INSTANCE.createCardNumberStyle(designTokens, resourceProvider);
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        int i4 = R.string.cko_scheme_selection_header;
        String string = resourceProvider.getString(i4);
        Utils utils = Utils.INSTANCE;
        TextLabelStyle textLabelStyle$default = DefaultStyle.textLabelStyle$default(defaultStyle, string, null, utils.secondaryColor(designTokens), utils.footnoteFont(designTokens), null, null, null, null, 242, null);
        ContainerStyle emptyContainerStyle$default = DefaultStyle.emptyContainerStyle$default(defaultStyle, null, 1, null);
        ImageStyle imageStyle = new ImageStyle(Integer.valueOf(com.checkout.components.ui.R.drawable.cko_ic_info), Long.valueOf(utils.secondaryColor(designTokens)), null, null, null, null, null, null, 252, null);
        TextLabelStyle textLabelStyle$default2 = DefaultStyle.textLabelStyle$default(defaultStyle, resourceProvider.getString(i4), null, utils.primaryColor(designTokens), utils.subheadingFont(designTokens), null, null, null, null, 242, null);
        TextLabelStyle textLabelStyle$default3 = DefaultStyle.textLabelStyle$default(defaultStyle, resourceProvider.getString(R.string.cko_scheme_selection_description), null, utils.secondaryColor(designTokens), utils.footnoteFont(designTokens), null, null, null, null, 242, null);
        ImageStyle imageStyle2 = new ImageStyle(Integer.valueOf(R.drawable.cko_ic_close), Long.valueOf(utils.primaryColor(designTokens)), 14, 14, null, null, null, null, 240, null);
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            j5 = colorTokens.getColorBackground();
        } else {
            j5 = 4294967295L;
        }
        return new CardNumberComponentStyle(createCardNumberStyle, textLabelStyle$default, imageStyle, emptyContainerStyle$default, new InfoBottomSheetStyle(textLabelStyle$default2, textLabelStyle$default3, imageStyle2, j5));
    }

    @ErrorLabelStyle
    @NotNull
    public final TextLabelStyle provideErrorLabelStyle(@Nullable DesignTokens designTokens) {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        Utils utils = Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.errorColor(designTokens), utils.footnoteFont(designTokens), null, null, null, null, 243, null);
    }

    @ExpiryDateStyle
    @NotNull
    public final InputComponentStyle provideExpiryDateStyle(@Nullable DesignTokens designTokens, @NotNull ResourceProvider resourceProvider, @NotNull Locale locale) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(locale, "locale");
        return DefaultInputComponentStyle.INSTANCE.createExpiryDate(resourceProvider, locale, designTokens);
    }

    @NotNull
    public final ButtonStyle providePayButtonStyle(@Nullable DesignTokens designTokens, @NotNull ResourceProvider resourceProvider) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        DefaultButtonStyle defaultButtonStyle = DefaultButtonStyle.INSTANCE;
        String string = resourceProvider.getString(com.checkout.components.ui.R.string.cko_pay_button);
        Utils utils = Utils.INSTANCE;
        long actionColor = utils.actionColor(designTokens);
        long inverseColor = utils.inverseColor(designTokens);
        Font buttonFont = utils.buttonFont(designTokens);
        return DefaultButtonStyle.solid$default(defaultButtonStyle, string, null, Long.valueOf(inverseColor), Long.valueOf(actionColor), null, null, Long.valueOf(utils.successColor(designTokens)), utils.borderButtonRadius(designTokens), buttonFont, null, 562, null);
    }
}
