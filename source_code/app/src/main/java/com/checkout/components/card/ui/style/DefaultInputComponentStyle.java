package com.checkout.components.card.ui.style;

import android.text.TextUtils;
import ao.ad;
import com.checkout.components.card.ui.component.expirydate.ExpiryDateVisualTransformation;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.CardScheme;
import com.checkout.components.ui.model.Padding;
import com.checkout.components.ui.model.style.base.DefaultTextLabelStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.style.DefaultStyle;
import com.checkout.components.ui.utils.constants.ErrorConstants;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n.aw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001J+\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/card/ui/style/DefaultInputComponentStyle;", "", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "", "maxLength", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "createCardHolderNameStyle", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/interfaces/ui/ResourceProvider;I)Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "createCardNumberStyle", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/interfaces/ui/ResourceProvider;)Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "createCVVStyle", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "Ljava/util/Locale;", "locale", "createExpiryDate", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;Ljava/util/Locale;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultInputComponentStyle {
    public static final int $stable = 0;

    @NotNull
    public static final DefaultInputComponentStyle INSTANCE = new DefaultInputComponentStyle();

    private DefaultInputComponentStyle() {
    }

    public static /* synthetic */ InputComponentStyle createCVVStyle$default(DefaultInputComponentStyle defaultInputComponentStyle, ResourceProvider resourceProvider, DesignTokens designTokens, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            designTokens = null;
        }
        return defaultInputComponentStyle.createCVVStyle(resourceProvider, designTokens);
    }

    public static /* synthetic */ InputComponentStyle createCardHolderNameStyle$default(DefaultInputComponentStyle defaultInputComponentStyle, DesignTokens designTokens, ResourceProvider resourceProvider, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            designTokens = null;
        }
        if ((i5 & 4) != 0) {
            i4 = 255;
        }
        return defaultInputComponentStyle.createCardHolderNameStyle(designTokens, resourceProvider, i4);
    }

    public static /* synthetic */ InputComponentStyle createCardNumberStyle$default(DefaultInputComponentStyle defaultInputComponentStyle, DesignTokens designTokens, ResourceProvider resourceProvider, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            designTokens = null;
        }
        return defaultInputComponentStyle.createCardNumberStyle(designTokens, resourceProvider);
    }

    public static /* synthetic */ InputComponentStyle createExpiryDate$default(DefaultInputComponentStyle defaultInputComponentStyle, ResourceProvider resourceProvider, Locale locale, DesignTokens designTokens, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            designTokens = null;
        }
        return defaultInputComponentStyle.createExpiryDate(resourceProvider, locale, designTokens);
    }

    @NotNull
    public final InputComponentStyle createCVVStyle(@NotNull ResourceProvider resourceProvider, @Nullable DesignTokens designTokens) {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Font font;
        Font font2;
        long color;
        ColorTokens colorTokens2;
        ColorTokens colorTokens3;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = resourceProvider.getString(R.string.cko_card_security_code_placeholder);
        Long l10 = null;
        if (designTokens != null) {
            borderRadius = designTokens.getBorderFormRadius();
        } else {
            borderRadius = null;
        }
        if (designTokens != null) {
            colorTokens = designTokens.getColorTokens();
        } else {
            colorTokens = null;
        }
        if (designTokens != null && (fonts2 = designTokens.getFonts()) != null) {
            font = fonts2.get(FontName.Label);
        } else {
            font = null;
        }
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font2 = fonts.get(FontName.Input);
        } else {
            font2 = null;
        }
        InputFieldStyle inputFieldStyle$default = DefaultStyle.inputFieldStyle$default(defaultStyle, null, null, string, null, null, false, false, null, null, borderRadius, colorTokens, font2, font, 507, null);
        ImageStyle trailingIconStyle$default = DefaultStyle.trailingIconStyle$default(defaultStyle, null, null, 3, null);
        Integer valueOf = Integer.valueOf(R.drawable.cko_ic_cvv);
        if (designTokens != null && (colorTokens3 = designTokens.getColorTokens()) != null) {
            l10 = Long.valueOf(colorTokens3.getColorPrimary());
        }
        InputFieldStyle copy$default = InputFieldStyle.copy$default(inputFieldStyle$default, null, null, null, null, null, null, null, null, null, ImageStyle.copy$default(trailingIconStyle$default, valueOf, l10, null, null, null, null, null, null, 252, null), null, null, 0L, false, 15871, null);
        DefaultTextLabelStyle defaultTextLabelStyle = DefaultTextLabelStyle.INSTANCE;
        if (designTokens != null && (colorTokens2 = designTokens.getColorTokens()) != null) {
            color = colorTokens2.getColorError();
        } else {
            color = ErrorConstants.INSTANCE.getColor();
        }
        return new InputComponentStyle(copy$default, defaultTextLabelStyle.error(color), (Integer) CollectionsKt.purple(CardScheme.UNKNOWN.getCvvLength()), new aw(3, 7, 115), null, defaultStyle.emptyContainerStyle(new Padding(0, 0, 16, 0, 11, null)), 16, null);
    }

    @NotNull
    public final InputComponentStyle createCardHolderNameStyle(@Nullable DesignTokens designTokens, @NotNull ResourceProvider resourceProvider, int maxLength) {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Font font;
        Font font2;
        long color;
        ColorTokens colorTokens2;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = resourceProvider.getString(com.checkout.components.card.R.string.cko_card_holder_name);
        if (designTokens != null) {
            borderRadius = designTokens.getBorderFormRadius();
        } else {
            borderRadius = null;
        }
        if (designTokens != null) {
            colorTokens = designTokens.getColorTokens();
        } else {
            colorTokens = null;
        }
        if (designTokens != null && (fonts2 = designTokens.getFonts()) != null) {
            font = fonts2.get(FontName.Label);
        } else {
            font = null;
        }
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font2 = fonts.get(FontName.Input);
        } else {
            font2 = null;
        }
        InputFieldStyle inputFieldStyle$default = DefaultStyle.inputFieldStyle$default(defaultStyle, null, null, string, null, null, false, false, null, null, borderRadius, colorTokens, font2, font, 507, null);
        DefaultTextLabelStyle defaultTextLabelStyle = DefaultTextLabelStyle.INSTANCE;
        if (designTokens != null && (colorTokens2 = designTokens.getColorTokens()) != null) {
            color = colorTokens2.getColorError();
        } else {
            color = ErrorConstants.INSTANCE.getColor();
        }
        return new InputComponentStyle(inputFieldStyle$default, defaultTextLabelStyle.error(color), Integer.valueOf(maxLength), new aw(0, 6, 119), null, DefaultStyle.emptyContainerStyle$default(defaultStyle, null, 1, null), 16, null);
    }

    @NotNull
    public final InputComponentStyle createCardNumberStyle(@Nullable DesignTokens designTokens, @NotNull ResourceProvider resourceProvider) {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Font font;
        long color;
        ColorTokens colorTokens2;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = resourceProvider.getString(com.checkout.components.card.R.string.cko_card_number);
        Font font2 = null;
        if (designTokens != null) {
            borderRadius = designTokens.getBorderFormRadius();
        } else {
            borderRadius = null;
        }
        if (designTokens != null) {
            colorTokens = designTokens.getColorTokens();
        } else {
            colorTokens = null;
        }
        if (designTokens != null && (fonts2 = designTokens.getFonts()) != null) {
            font = fonts2.get(FontName.Label);
        } else {
            font = null;
        }
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font2 = fonts.get(FontName.Input);
        }
        InputFieldStyle inputFieldStyle$default = DefaultStyle.inputFieldStyle$default(defaultStyle, null, null, string, null, null, false, true, null, null, borderRadius, colorTokens, font2, font, 443, null);
        DefaultTextLabelStyle defaultTextLabelStyle = DefaultTextLabelStyle.INSTANCE;
        if (designTokens != null && (colorTokens2 = designTokens.getColorTokens()) != null) {
            color = colorTokens2.getColorError();
        } else {
            color = ErrorConstants.INSTANCE.getColor();
        }
        return new InputComponentStyle(inputFieldStyle$default, defaultTextLabelStyle.error(color), (Integer) CollectionsKt.purple(CardScheme.UNKNOWN.getLengths()), new aw(3, 6, 115), null, null, 48, null);
    }

    @NotNull
    public final InputComponentStyle createExpiryDate(@NotNull ResourceProvider resourceProvider, @NotNull Locale locale, @Nullable DesignTokens designTokens) {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Font font;
        Font font2;
        long color;
        boolean z2;
        ColorTokens colorTokens2;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(locale, "locale");
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = resourceProvider.getString(com.checkout.components.card.R.string.cko_card_expiry_date);
        String amber = ad.amber(resourceProvider.getString(com.checkout.components.card.R.string.cko_card_expiry_date_placeholder_month), "/", resourceProvider.getString(com.checkout.components.card.R.string.cko_card_expiry_date_placeholder_year));
        if (designTokens != null) {
            borderRadius = designTokens.getBorderFormRadius();
        } else {
            borderRadius = null;
        }
        if (designTokens != null) {
            colorTokens = designTokens.getColorTokens();
        } else {
            colorTokens = null;
        }
        if (designTokens != null && (fonts2 = designTokens.getFonts()) != null) {
            font = fonts2.get(FontName.Label);
        } else {
            font = null;
        }
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font2 = fonts.get(FontName.Input);
        } else {
            font2 = null;
        }
        InputFieldStyle inputFieldStyle$default = DefaultStyle.inputFieldStyle$default(defaultStyle, amber, null, string, null, null, false, false, null, null, borderRadius, colorTokens, font2, font, 506, null);
        DefaultTextLabelStyle defaultTextLabelStyle = DefaultTextLabelStyle.INSTANCE;
        if (designTokens != null && (colorTokens2 = designTokens.getColorTokens()) != null) {
            color = colorTokens2.getColorError();
        } else {
            color = ErrorConstants.INSTANCE.getColor();
        }
        TextLabelStyle error = defaultTextLabelStyle.error(color);
        aw awVar = new aw(3, 6, 115);
        if (TextUtils.getLayoutDirectionFromLocale(locale) == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        return new InputComponentStyle(inputFieldStyle$default, error, 4, awVar, new ExpiryDateVisualTransformation(z2), DefaultStyle.emptyContainerStyle$default(defaultStyle, null, 1, null));
    }
}
