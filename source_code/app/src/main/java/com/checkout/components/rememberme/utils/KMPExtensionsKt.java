package com.checkout.components.rememberme.utils;

import com.checkout.components.interfaces.localisation.ComponentTranslationKey;
import com.checkout.components.interfaces.localisation.Locale;
import com.checkout.components.interfaces.uicustomisation.designtoken.DefaultFonts;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.checkout.components.kmp.rememberme.shared.model.CheckoutLocale;
import com.checkout.components.kmp.rememberme.shared.model.TranslationKey;
import com.checkout.components.kmp.rememberme.shared.model.customization.BorderRadius;
import com.checkout.components.kmp.rememberme.shared.model.customization.ColorTokens;
import com.checkout.components.kmp.rememberme.shared.model.customization.DesignTokens;
import com.checkout.components.kmp.rememberme.shared.model.customization.Font;
import com.checkout.components.kmp.rememberme.shared.model.customization.FontFamily;
import com.checkout.components.kmp.rememberme.shared.model.customization.FontStyle;
import com.checkout.components.kmp.rememberme.shared.model.customization.FontWeight;
import com.checkout.components.kmp.rememberme.shared.model.customization.Fonts;
import com.checkout.components.rememberme.E;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000x\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00030\u0001j\u0002`\u0005H\u0000\u001a\u000e\u0010\u0006\u001a\u0004\u0018\u00010\u0002*\u00020\u0004H\u0000\u001a\f\u0010\u0007\u001a\u00020\b*\u00020\tH\u0000\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\fH\u0000\u001a\f\u0010\r\u001a\u00020\u000e*\u00020\u000fH\u0002\u001a\f\u0010\u0010\u001a\u00020\u0011*\u00020\u0012H\u0002\u001a\u001c\u0010\u0013\u001a\u00020\u0014*\u0012\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0001j\u0002`\u0017H\u0002\u001a\f\u0010\u0018\u001a\u00020\u0019*\u00020\u0016H\u0002\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u001cH\u0002\u001a\f\u0010\u001d\u001a\u00020\u001e*\u00020\u001fH\u0002\u001a\f\u0010 \u001a\u00020!*\u00020\"H\u0002¨\u0006#"}, d2 = {"mapToKMPRememberMeTranslation", "", "Lcom/checkout/components/kmp/rememberme/shared/model/TranslationKey;", "", "Lcom/checkout/components/interfaces/localisation/ComponentTranslationKey;", "Lcom/checkout/components/interfaces/localisation/Translation;", "mapToKMPRememberKey", "mapToKMPRememberLocale", "Lcom/checkout/components/kmp/rememberme/shared/model/CheckoutLocale;", "Lcom/checkout/components/interfaces/localisation/Locale;", "mapToKMPDesignTokens", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/DesignTokens;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "mapToKMPColorTokens", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/ColorTokens;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "mapToKMPBorderRadius", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "mapToKMPFonts", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/Fonts;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontName;", "Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "Lcom/checkout/components/interfaces/uicustomisation/font/Fonts;", "mapToKMPFont", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/Font;", "mapToKMPFontFamily", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontFamily;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "mapToKMPFontStyle", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontStyle;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "mapToKMPFontWeight", "Lcom/checkout/components/kmp/rememberme/shared/model/customization/FontWeight;", "Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "rememberme_standardRelease"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class KMPExtensionsKt {
    private static final BorderRadius mapToKMPBorderRadius(com.checkout.components.interfaces.uicustomisation.BorderRadius borderRadius) {
        return new BorderRadius(borderRadius.getBottomStart(), borderRadius.getBottomEnd(), borderRadius.getTopStart(), borderRadius.getTopEnd());
    }

    private static final ColorTokens mapToKMPColorTokens(com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens colorTokens) {
        return new ColorTokens(colorTokens.getColorDisabled(), colorTokens.getColorError(), colorTokens.getColorInverse(), colorTokens.getColorAction(), colorTokens.getColorSuccess(), colorTokens.getColorPrimary(), colorTokens.getColorSecondary(), colorTokens.getColorFormBorder(), colorTokens.getColorBorder(), colorTokens.getColorOutline(), colorTokens.getColorFormBackground(), colorTokens.getColorBackground(), colorTokens.getColorScrolledContainer());
    }

    @NotNull
    public static final DesignTokens mapToKMPDesignTokens(@NotNull com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens designTokens) {
        Intrinsics.echo(designTokens, "<this>");
        BorderRadius mapToKMPBorderRadius = mapToKMPBorderRadius(designTokens.getBorderButtonRadius());
        return new DesignTokens(mapToKMPColorTokens(designTokens.getColorTokens()), mapToKMPFonts(designTokens.getFonts()), mapToKMPBorderRadius(designTokens.getBorderFormRadius()), mapToKMPBorderRadius);
    }

    private static final Font mapToKMPFont(com.checkout.components.interfaces.uicustomisation.font.Font font) {
        return new Font(mapToKMPFontFamily(font.getFontFamily()), mapToKMPFontStyle(font.getFontStyle()), mapToKMPFontWeight(font.getFontWeight()), font.getFontSize(), font.getLineHeight(), font.getLetterSpacing());
    }

    private static final FontFamily mapToKMPFontFamily(com.checkout.components.interfaces.uicustomisation.font.FontFamily fontFamily) {
        if (fontFamily instanceof FontFamily.Default) {
            return FontFamily.Default.INSTANCE;
        }
        if (fontFamily instanceof FontFamily.Serif) {
            return FontFamily.Serif.INSTANCE;
        }
        if (fontFamily instanceof FontFamily.SansSerif) {
            return FontFamily.SansSerif.INSTANCE;
        }
        if (fontFamily instanceof FontFamily.Monospace) {
            return FontFamily.Monospace.INSTANCE;
        }
        if (fontFamily instanceof FontFamily.Cursive) {
            return FontFamily.Cursive.INSTANCE;
        }
        if (fontFamily instanceof FontFamily.Custom) {
            FontFamily.Custom custom = (FontFamily.Custom) fontFamily;
            return new FontFamily.Custom(custom.getNormalFont(), custom.getNormalItalicFont(), custom.getLightFont(), custom.getMediumFont(), custom.getSemiBold(), custom.getBoldFont(), custom.getExtraBoldFont());
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final FontStyle mapToKMPFontStyle(com.checkout.components.interfaces.uicustomisation.font.FontStyle fontStyle) {
        int i4 = E.f5745b[fontStyle.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                return FontStyle.Italic;
            }
            throw new NoWhenBranchMatchedException();
        }
        return FontStyle.Normal;
    }

    private static final FontWeight mapToKMPFontWeight(com.checkout.components.interfaces.uicustomisation.font.FontWeight fontWeight) {
        switch (E.f5746c[fontWeight.ordinal()]) {
            case 1:
                return FontWeight.Light;
            case 2:
                return FontWeight.Normal;
            case 3:
                return FontWeight.Medium;
            case 4:
                return FontWeight.SemiBold;
            case 5:
                return FontWeight.Bold;
            case 6:
                return FontWeight.ExtraBold;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    private static final Fonts mapToKMPFonts(Map<FontName, com.checkout.components.interfaces.uicustomisation.font.Font> map) {
        com.checkout.components.interfaces.uicustomisation.font.Font font = map.get(FontName.Heading);
        if (font == null) {
            font = DefaultFonts.INSTANCE.getHEADING();
        }
        Font mapToKMPFont = mapToKMPFont(font);
        com.checkout.components.interfaces.uicustomisation.font.Font font2 = map.get(FontName.Subheading);
        if (font2 == null) {
            font2 = DefaultFonts.INSTANCE.getSUBHEADING();
        }
        Font mapToKMPFont2 = mapToKMPFont(font2);
        com.checkout.components.interfaces.uicustomisation.font.Font font3 = map.get(FontName.Footnote);
        if (font3 == null) {
            font3 = DefaultFonts.INSTANCE.getFOOTNOTE();
        }
        Font mapToKMPFont3 = mapToKMPFont(font3);
        com.checkout.components.interfaces.uicustomisation.font.Font font4 = map.get(FontName.Button);
        if (font4 == null) {
            font4 = DefaultFonts.INSTANCE.getBUTTON();
        }
        Font mapToKMPFont4 = mapToKMPFont(font4);
        com.checkout.components.interfaces.uicustomisation.font.Font font5 = map.get(FontName.Input);
        if (font5 == null) {
            font5 = DefaultFonts.INSTANCE.getINPUT();
        }
        Font mapToKMPFont5 = mapToKMPFont(font5);
        com.checkout.components.interfaces.uicustomisation.font.Font font6 = map.get(FontName.Label);
        if (font6 == null) {
            font6 = DefaultFonts.INSTANCE.getLABEL();
        }
        return new Fonts(mapToKMPFont, mapToKMPFont2, mapToKMPFont3, mapToKMPFont4, mapToKMPFont5, mapToKMPFont(font6));
    }

    @Nullable
    public static final TranslationKey mapToKMPRememberKey(@NotNull ComponentTranslationKey componentTranslationKey) {
        Intrinsics.echo(componentTranslationKey, "<this>");
        switch (E.f5744a[componentTranslationKey.ordinal()]) {
            case 1:
                return TranslationKey.REMEMBER_ME_USE_SAVED_DETAILS;
            case 2:
                return TranslationKey.REMEMBER_ME_MODAL_CTA;
            case 3:
                return TranslationKey.OTP_CODE;
            case 4:
                return TranslationKey.OTP_RESEND_COUNTDOWN;
            case 5:
                return TranslationKey.OTP_RESEND_DESCRIPTION;
            case 6:
                return TranslationKey.OTP_RESEND_CTA;
            case 7:
                return TranslationKey.OTP_MAX_RETRIES;
            case 8:
                return TranslationKey.OTP_MAX_RESENDS;
            case 9:
                return TranslationKey.OTP_RESEND_EMAIL;
            case 10:
                return TranslationKey.OTP_RESEND_PHONE;
            case 11:
                return TranslationKey.OTP_CODE_DESCRIPTION_EMAIL;
            case 12:
                return TranslationKey.OTP_CODE_DESCRIPTION;
            case 13:
                return TranslationKey.OTP_CODE_ERROR;
            case 14:
                return TranslationKey.OTP_CODE_EXPIRED;
            case 15:
                return TranslationKey.OTP_CODE_SEND;
            case 16:
                return TranslationKey.OTP_CODE_DESCRIPTION_PHONE;
            case 17:
                return TranslationKey.OTP_CODE_DESCRIPTION_WHATSAPP;
            case 18:
                return TranslationKey.OTP_CODE_EMAIL;
            case 19:
                return TranslationKey.OTP_CODE_PHONE;
            case 20:
                return TranslationKey.OTP_CODE_WHATSAPP;
            case 21:
                return TranslationKey.OTP_DIFFERENT_METHOD;
            case 22:
                return TranslationKey.REMEMBER_ME_MODAL_LINE1_SUBTITLE;
            case 23:
                return TranslationKey.REMEMBER_ME_MODAL_LINE1_BODY;
            case 24:
                return TranslationKey.REMEMBER_ME_MODAL_LINE2_SUBTITLE;
            case 25:
                return TranslationKey.REMEMBER_ME_MODAL_LINE2_BODY;
            case 26:
                return TranslationKey.REMEMBER_ME_MODAL_LINE3_SUBTITLE;
            case 27:
                return TranslationKey.REMEMBER_ME_MODAL_LINE3_BODY;
            case 28:
                return TranslationKey.REMEMBER_ME_MODAL_CLOSE_CTA;
            default:
                return null;
        }
    }

    @NotNull
    public static final CheckoutLocale mapToKMPRememberLocale(@NotNull Locale locale) {
        Intrinsics.echo(locale, "<this>");
        if (Intrinsics.areEqual(locale, Locale.Ar.INSTANCE)) {
            return CheckoutLocale.Ar.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Zh.INSTANCE)) {
            return CheckoutLocale.Zh.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.ZhHk.INSTANCE)) {
            return CheckoutLocale.ZhHk.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.ZhTw.INSTANCE)) {
            return CheckoutLocale.ZhTw.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Da.INSTANCE)) {
            return CheckoutLocale.Da.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Nl.INSTANCE)) {
            return CheckoutLocale.Nl.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.En.INSTANCE)) {
            return CheckoutLocale.En.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Fil.INSTANCE)) {
            return CheckoutLocale.Fil.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Fi.INSTANCE)) {
            return CheckoutLocale.Fi.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Fr.INSTANCE)) {
            return CheckoutLocale.Fr.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.De.INSTANCE)) {
            return CheckoutLocale.De.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.El.INSTANCE)) {
            return CheckoutLocale.El.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Hi.INSTANCE)) {
            return CheckoutLocale.Hi.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Id.INSTANCE)) {
            return CheckoutLocale.Id.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.It.INSTANCE)) {
            return CheckoutLocale.It.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Ja.INSTANCE)) {
            return CheckoutLocale.Ja.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Ms.INSTANCE)) {
            return CheckoutLocale.Ms.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Nb.INSTANCE)) {
            return CheckoutLocale.Nb.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Pt.INSTANCE)) {
            return CheckoutLocale.Pt.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Es.INSTANCE)) {
            return CheckoutLocale.Es.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Sv.INSTANCE)) {
            return CheckoutLocale.Sv.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Th.INSTANCE)) {
            return CheckoutLocale.Th.INSTANCE;
        }
        if (Intrinsics.areEqual(locale, Locale.Vi.INSTANCE)) {
            return CheckoutLocale.Vi.INSTANCE;
        }
        if (locale instanceof Locale.Customised) {
            return new CheckoutLocale.Customised(((Locale.Customised) locale).getLocale());
        }
        throw new NoWhenBranchMatchedException();
    }

    @NotNull
    public static final Map<TranslationKey, String> mapToKMPRememberMeTranslation(@NotNull Map<ComponentTranslationKey, String> map) {
        Pair pair;
        Intrinsics.echo(map, "<this>");
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<ComponentTranslationKey, String> entry : map.entrySet()) {
            TranslationKey mapToKMPRememberKey = mapToKMPRememberKey(entry.getKey());
            if (mapToKMPRememberKey != null) {
                pair = new Pair(mapToKMPRememberKey, entry.getValue());
            } else {
                pair = null;
            }
            if (pair != null) {
                arrayList.add(pair);
            }
        }
        return y.yankee(arrayList);
    }
}
