package com.checkout.address.utils;

import Q0.n;
import T.p;
import T.s;
import androidx.compose.foundation.layout.V;
import com.checkout.address.model.AddressEditScreenStyle;
import com.checkout.address.model.StatePickerStyle;
import com.checkout.components.address.R;
import com.checkout.components.address.Y;
import com.checkout.components.interfaces.ui.ResourceProvider;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.checkout.components.ui.model.CountryPickerStyle;
import com.checkout.components.ui.model.Padding;
import com.checkout.components.ui.model.TopAppBarViewStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.style.DefaultButtonStyle;
import com.checkout.components.ui.style.DefaultStyle;
import com.checkout.components.ui.utils.CountryPickerStyleUtils;
import com.checkout.components.ui.utils.ScreenHeaderStyleUtils;
import com.clevertap.android.sdk.Constants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t6.ab;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B+\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010#\u001a\u00020 H\u0000¢\u0006\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/checkout/address/utils/StyleUtils;", "", "Lcom/checkout/components/interfaces/ui/ResourceProvider;", "resourceProvider", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;", "countryPickerStyleUtils", "Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;", "screenHeaderStyleUtils", "<init>", "(Lcom/checkout/components/interfaces/ui/ResourceProvider;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/ui/utils/CountryPickerStyleUtils;Lcom/checkout/components/ui/utils/ScreenHeaderStyleUtils;)V", "", "isStandalone", "isAddressEmpty", "LQ0/n;", "layoutDirection", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "addressButtonStyle", "(ZZLQ0/n;)Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "", Constants.KEY_TITLE, "Lcom/checkout/address/model/AddressEditScreenStyle;", "addressEditScreenStyle", "(Ljava/lang/String;)Lcom/checkout/address/model/AddressEditScreenStyle;", "Lcom/checkout/address/model/StatePickerStyle;", "statePickerStyle", "()Lcom/checkout/address/model/StatePickerStyle;", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "errorLabelStyle$address_standardRelease", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "errorLabelStyle", "", "errorColor$address_standardRelease", "()J", "errorColor", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class StyleUtils {
    public static final int $stable = ((ScreenHeaderStyleUtils.$stable | CountryPickerStyleUtils.$stable) | DesignTokens.$stable) | ResourceProvider.$stable;

    /* renamed from: a, reason: collision with root package name */
    private final ResourceProvider f3834a;

    /* renamed from: b, reason: collision with root package name */
    private final DesignTokens f3835b;

    /* renamed from: c, reason: collision with root package name */
    private final CountryPickerStyleUtils f3836c;

    /* renamed from: d, reason: collision with root package name */
    private final ScreenHeaderStyleUtils f3837d;

    public StyleUtils(@NotNull ResourceProvider resourceProvider, @Nullable DesignTokens designTokens, @NotNull CountryPickerStyleUtils countryPickerStyleUtils, @NotNull ScreenHeaderStyleUtils screenHeaderStyleUtils) {
        Intrinsics.echo(resourceProvider, "resourceProvider");
        Intrinsics.echo(countryPickerStyleUtils, "countryPickerStyleUtils");
        Intrinsics.echo(screenHeaderStyleUtils, "screenHeaderStyleUtils");
        this.f3834a = resourceProvider;
        this.f3835b = designTokens;
        this.f3836c = countryPickerStyleUtils;
        this.f3837d = screenHeaderStyleUtils;
    }

    @NotNull
    public final InputFieldStyle addressButtonStyle(boolean isStandalone, boolean isAddressEmpty, @NotNull n layoutDirection) {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Font font;
        Font font2;
        Long l10;
        s charlie;
        ColorTokens colorTokens2;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        Intrinsics.echo(layoutDirection, "layoutDirection");
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        String labelText = Utils.INSTANCE.getLabelText(this.f3834a, isStandalone, isAddressEmpty);
        DesignTokens designTokens = this.f3835b;
        if (designTokens != null) {
            borderRadius = designTokens.getBorderFormRadius();
        } else {
            borderRadius = null;
        }
        DesignTokens designTokens2 = this.f3835b;
        if (designTokens2 != null) {
            colorTokens = designTokens2.getColorTokens();
        } else {
            colorTokens = null;
        }
        DesignTokens designTokens3 = this.f3835b;
        if (designTokens3 != null && (fonts2 = designTokens3.getFonts()) != null) {
            font = fonts2.get(FontName.Label);
        } else {
            font = null;
        }
        DesignTokens designTokens4 = this.f3835b;
        if (designTokens4 != null && (fonts = designTokens4.getFonts()) != null) {
            font2 = fonts.get(FontName.Input);
        } else {
            font2 = null;
        }
        InputFieldStyle inputFieldStyle$default = DefaultStyle.inputFieldStyle$default(defaultStyle, null, null, labelText, null, null, false, false, null, null, borderRadius, colorTokens, font2, font, 507, null);
        ImageStyle trailingIconStyle$default = DefaultStyle.trailingIconStyle$default(defaultStyle, null, null, 3, null);
        Integer valueOf = Integer.valueOf(R.drawable.cko_ic_triangle);
        DesignTokens designTokens5 = this.f3835b;
        if (designTokens5 != null && (colorTokens2 = designTokens5.getColorTokens()) != null) {
            l10 = Long.valueOf(colorTokens2.getColorPrimary());
        } else {
            l10 = null;
        }
        int i4 = Y.f3875a[layoutDirection.ordinal()];
        p pVar = p.alpha;
        if (i4 != 1) {
            if (i4 == 2) {
                charlie = ab.charlie(pVar, -1.0f);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            charlie = ab.charlie(pVar, 1.0f);
        }
        return InputFieldStyle.copy$default(inputFieldStyle$default, null, null, null, null, null, null, null, com.checkout.components.ui.utils.extensions.Utils.INSTANCE.toInputFieldBorderStyle(this.f3835b), null, ImageStyle.copy$default(trailingIconStyle$default, valueOf, l10, null, null, null, null, null, V.echo(charlie, 12), 124, null), null, null, 0L, false, 7551, null);
    }

    @NotNull
    public final AddressEditScreenStyle addressEditScreenStyle(@NotNull String title) {
        Long l10;
        Long l11;
        Font font;
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Map<FontName, Font> fonts;
        ColorTokens colorTokens2;
        ColorTokens colorTokens3;
        Intrinsics.echo(title, "title");
        TopAppBarViewStyle viewStyle = this.f3837d.viewStyle(title);
        long backgroundColor = com.checkout.components.ui.utils.extensions.Utils.INSTANCE.backgroundColor(this.f3835b);
        DefaultButtonStyle defaultButtonStyle = DefaultButtonStyle.INSTANCE;
        String string = this.f3834a.getString(R.string.cko_pay_button_confirm);
        DesignTokens designTokens = this.f3835b;
        Long l12 = null;
        if (designTokens != null && (colorTokens3 = designTokens.getColorTokens()) != null) {
            l10 = Long.valueOf(colorTokens3.getColorAction());
        } else {
            l10 = null;
        }
        DesignTokens designTokens2 = this.f3835b;
        if (designTokens2 != null && (colorTokens2 = designTokens2.getColorTokens()) != null) {
            l11 = Long.valueOf(colorTokens2.getColorInverse());
        } else {
            l11 = null;
        }
        DesignTokens designTokens3 = this.f3835b;
        if (designTokens3 != null && (fonts = designTokens3.getFonts()) != null) {
            font = fonts.get(FontName.Button);
        } else {
            font = null;
        }
        DesignTokens designTokens4 = this.f3835b;
        if (designTokens4 != null) {
            borderRadius = designTokens4.getBorderButtonRadius();
        } else {
            borderRadius = null;
        }
        DesignTokens designTokens5 = this.f3835b;
        if (designTokens5 != null && (colorTokens = designTokens5.getColorTokens()) != null) {
            l12 = Long.valueOf(colorTokens.getColorSuccess());
        }
        return new AddressEditScreenStyle(viewStyle, backgroundColor, DefaultButtonStyle.solid$default(defaultButtonStyle, string, null, l11, l10, null, null, l12, borderRadius, font, new Padding(20, 12, 16, 16), 50, null), this.f3834a.getString(R.string.cko_address_select_state));
    }

    public final long errorColor$address_standardRelease() {
        return com.checkout.components.ui.utils.extensions.Utils.INSTANCE.errorColor(this.f3835b);
    }

    @NotNull
    public final TextLabelStyle errorLabelStyle$address_standardRelease() {
        DefaultStyle defaultStyle = DefaultStyle.INSTANCE;
        com.checkout.components.ui.utils.extensions.Utils utils = com.checkout.components.ui.utils.extensions.Utils.INSTANCE;
        return DefaultStyle.textLabelStyle$default(defaultStyle, null, null, utils.errorColor(this.f3835b), utils.footnoteFont(this.f3835b), null, null, null, null, 243, null);
    }

    @NotNull
    public final StatePickerStyle statePickerStyle() {
        CountryPickerStyle style = this.f3836c.style();
        return new StatePickerStyle(style.getCountryNameStyle(), style.getDialingCodeStyle(), style.getSearchFieldStyle(), style.getNotFoundViewTitleStyle(), style.getNotFoundViewSubtitleStyle(), this.f3837d.viewStyle(this.f3834a.getString(R.string.cko_address_select_state)), style.getContainerColor(), style.getSelectedRadioButtonColor(), style.getUnSelectedRadioButtonColor());
    }
}
