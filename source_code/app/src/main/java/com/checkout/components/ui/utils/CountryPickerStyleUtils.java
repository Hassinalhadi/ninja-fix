package com.checkout.components.ui.utils;

import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.CountryPickerStyle;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.style.DefaultStyle;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ2\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0002J\b\u0010\u0018\u001a\u00020\rH\u0002J\b\u0010\u0019\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "", "resourceProvider", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "designTokens", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "screenHeaderStyleUtils", "Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;)V", "style", "Lcom/checkout/components/ui/model/CountryPickerStyle;", "createLabelTextStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "fontSize", "", Constants.KEY_COLOR, "", "fontWeight", "Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "fontStyle", "Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "createSearchFieldStyle", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "createNotFoundTitleStyle", "createNotFoundSubtitleStyle", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CountryPickerStyleUtils {
    public static final int $stable = DesignTokens.$stable | ResourceProvider.$stable;

    @Nullable
    private final DesignTokens designTokens;

    @NotNull
    private final ResourceProvider resourceProvider;

    @NotNull
    private final ScreenHeaderStyleUtils screenHeaderStyleUtils;

    public CountryPickerStyleUtils(@NotNull ResourceProvider resourceProvider, @Nullable DesignTokens designTokens, @NotNull ScreenHeaderStyleUtils screenHeaderStyleUtils) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(screenHeaderStyleUtils, "screenHeaderStyleUtils");
        this.resourceProvider = resourceProvider;
        this.designTokens = designTokens;
        this.screenHeaderStyleUtils = screenHeaderStyleUtils;
    }

    private final TextLabelStyle createLabelTextStyle(int fontSize, long color, FontWeight fontWeight, FontStyle fontStyle) {
        Font font;
        Map<FontName, Font> fonts;
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        DesignTokens designTokens = this.designTokens;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font = fonts.get(FontName.Label);
        } else {
            font = null;
        }
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, color, font, Integer.valueOf(fontSize), fontWeight, fontStyle, null, 131, null);
    }

    public static /* synthetic */ TextLabelStyle createLabelTextStyle$default(CountryPickerStyleUtils countryPickerStyleUtils, int i4, long j5, FontWeight fontWeight, FontStyle fontStyle, int i5, Object obj) {
        FontWeight fontWeight2;
        FontStyle fontStyle2;
        if ((i5 & 2) != 0) {
            j5 = Utils.INSTANCE.primaryColor(countryPickerStyleUtils.designTokens);
        }
        long j6 = j5;
        if ((i5 & 4) != 0) {
            fontWeight2 = null;
        } else {
            fontWeight2 = fontWeight;
        }
        if ((i5 & 8) != 0) {
            fontStyle2 = null;
        } else {
            fontStyle2 = fontStyle;
        }
        return countryPickerStyleUtils.createLabelTextStyle(i4, j6, fontWeight2, fontStyle2);
    }

    private final TextLabelStyle createNotFoundSubtitleStyle() {
        Font font;
        Map<FontName, Font> fonts;
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = this.resourceProvider.getString(R.string.cko_form_try_searching_with_another_term);
        DesignTokens designTokens = this.designTokens;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font = fonts.get(FontName.Input);
        } else {
            font = null;
        }
        return DefaultStyle.textLabelStyle$default(defaultStyle, string, null, Utils.INSTANCE.secondaryColor(this.designTokens), font, 16, FontWeight.Normal, null, null, 194, null);
    }

    private final TextLabelStyle createNotFoundTitleStyle() {
        Font font;
        Map<FontName, Font> fonts;
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = this.resourceProvider.getString(R.string.cko_form_no_matches_found);
        DesignTokens designTokens = this.designTokens;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font = fonts.get(FontName.Subheading);
        } else {
            font = null;
        }
        return DefaultStyle.textLabelStyle$default(defaultStyle, string, null, Utils.INSTANCE.primaryColor(this.designTokens), font, 24, FontWeight.Normal, null, null, 194, null);
    }

    private final InputFieldStyle createSearchFieldStyle() {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Font font;
        Font font2;
        Long l10;
        ColorTokens colorTokens2;
        ColorTokens colorTokens3;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String string = this.resourceProvider.getString(R.string.cko_form_search);
        DesignTokens designTokens = this.designTokens;
        if (designTokens == null || (borderRadius = designTokens.getBorderFormRadius()) == null) {
            borderRadius = new BorderRadius(30);
        }
        BorderRadius borderRadius2 = borderRadius;
        DesignTokens designTokens2 = this.designTokens;
        if (designTokens2 != null) {
            colorTokens = designTokens2.getColorTokens();
        } else {
            colorTokens = null;
        }
        DesignTokens designTokens3 = this.designTokens;
        if (designTokens3 != null && (fonts2 = designTokens3.getFonts()) != null) {
            font = fonts2.get(FontName.Label);
        } else {
            font = null;
        }
        DesignTokens designTokens4 = this.designTokens;
        if (designTokens4 != null && (fonts = designTokens4.getFonts()) != null) {
            font2 = fonts.get(FontName.Input);
        } else {
            font2 = null;
        }
        Long l11 = null;
        InputFieldStyle inputFieldStyle$default = DefaultStyle.inputFieldStyle$default(defaultStyle, string, null, null, null, null, false, false, null, null, borderRadius2, colorTokens, font2, font, 510, null);
        ImageStyle trailingIconStyle$default = DefaultStyle.trailingIconStyle$default(defaultStyle, null, null, 3, null);
        Integer valueOf = Integer.valueOf(R.drawable.cko_ic_cross_close);
        DesignTokens designTokens5 = this.designTokens;
        if (designTokens5 != null && (colorTokens3 = designTokens5.getColorTokens()) != null) {
            l10 = Long.valueOf(colorTokens3.getColorPrimary());
        } else {
            l10 = null;
        }
        ImageStyle copy$default = ImageStyle.copy$default(trailingIconStyle$default, valueOf, l10, null, null, null, null, null, null, 252, null);
        ImageStyle leadingIconStyle = defaultStyle.leadingIconStyle();
        Integer valueOf2 = Integer.valueOf(R.drawable.cko_ic_search);
        DesignTokens designTokens6 = this.designTokens;
        if (designTokens6 != null && (colorTokens2 = designTokens6.getColorTokens()) != null) {
            l11 = Long.valueOf(colorTokens2.getColorPrimary());
        }
        return InputFieldStyle.copy$default(inputFieldStyle$default, null, null, null, null, null, null, null, null, ImageStyle.copy$default(leadingIconStyle, valueOf2, l11, null, null, null, null, null, null, 252, null), copy$default, null, null, 0L, false, 15615, null);
    }

    @NotNull
    public final CountryPickerStyle style() {
        InputFieldStyle createSearchFieldStyle = createSearchFieldStyle();
        TopAppBarViewStyle viewStyle = this.screenHeaderStyleUtils.viewStyle(this.resourceProvider.getString(R.string.cko_address_country_select));
        FontWeight fontWeight = FontWeight.Normal;
        FontStyle fontStyle = FontStyle.Normal;
        TextLabelStyle createLabelTextStyle$default = createLabelTextStyle$default(this, 16, 0L, fontWeight, fontStyle, 2, null);
        Utils utils = Utils.INSTANCE;
        return new CountryPickerStyle(createLabelTextStyle$default, createLabelTextStyle(16, utils.secondaryColor(this.designTokens), fontWeight, fontStyle), createLabelTextStyle$default(this, 24, 0L, null, null, 14, null), createSearchFieldStyle, createNotFoundTitleStyle(), createNotFoundSubtitleStyle(), viewStyle, utils.backgroundColor(this.designTokens), utils.actionColor(this.designTokens), utils.primaryColor(this.designTokens));
    }
}
