package com.checkout.components.ui.utils.extensions;

import a0.ao;
import android.content.Context;
import androidx.annotation.Keep;
import androidx.appcompat.widget.P0;
import av.q;
import com.checkout.components.interfaces.model.contact.Country;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DefaultBorderRadius;
import com.checkout.components.interfaces.uicustomisation.designtoken.DefaultFonts;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.checkout.components.ui.model.style.base.InputFieldBorderStyle;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import m.AbstractC2094g;
import m.C2093f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\f\u001a\u00020\t*\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\u0010*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u0014*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0014*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0013\u0010\u0019\u001a\u00020\u0014*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0019\u0010\u0016J\u0013\u0010\u001a\u001a\u00020\u0014*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001a\u0010\u0016J\u0013\u0010\u001b\u001a\u00020\u0014*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u0016J\u0013\u0010\u001c\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001e\u0010\u001dJ\u0013\u0010\u001f\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001f\u0010\u001dJ\u0013\u0010 \u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010\u001dJ\u0013\u0010!\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b!\u0010\u001dJ\u0013\u0010\"\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b\"\u0010\u001dJ\u0013\u0010#\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b#\u0010\u001dJ\u0013\u0010$\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010\u001dJ\u0013\u0010%\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b%\u0010\u001dJ\u0013\u0010&\u001a\u00020\b*\u0004\u0018\u00010\u0013¢\u0006\u0004\b&\u0010\u001dJ\u0013\u0010'\u001a\u00020\u0004*\u0004\u0018\u00010\u0013¢\u0006\u0004\b'\u0010(J\u0013\u0010)\u001a\u00020\u0004*\u0004\u0018\u00010\u0013¢\u0006\u0004\b)\u0010(J\u0013\u0010*\u001a\u00020\u0005*\u0004\u0018\u00010\u0013¢\u0006\u0004\b*\u0010+J\u0013\u0010,\u001a\u00020\u0005*\u0004\u0018\u00010\u0013¢\u0006\u0004\b,\u0010+J\u0013\u0010.\u001a\u00020-*\u0004\u0018\u00010\u0013¢\u0006\u0004\b.\u0010/J\u0011\u00101\u001a\u00020\u000e*\u000200¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\r2\b\u00103\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b4\u00105J'\u00108\u001a\u00020\u00102\u0006\u00106\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u00107\u001a\u00020\u000e¢\u0006\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00108\u0002X\u0082T¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/checkout/components/ui/utils/extensions/Utils;", "", "<init>", "()V", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "Lm/f;", "toRoundedCornerShape", "(Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;)Lm/f;", "", "La0/t;", "toComposeColor-vNxB06k", "(J)J", "toComposeColor", "Lcom/checkout/components/interfaces/model/contact/Country;", "", "isRTL", "", "dialingCode", "(Lcom/checkout/components/interfaces/model/contact/Country;Z)Ljava/lang/String;", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "labelFont", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "headingFont", "subheadingFont", "buttonFont", "inputFont", "footnoteFont", "primaryColor", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)J", "secondaryColor", "backgroundColor", "borderColor", "errorColor", "actionColor", "disabledColor", "successColor", "inverseColor", "formBorderColor", "borderButtonRadius", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "borderFormRadius", "toFormShape", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lm/f;", "toButtonShape", "Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;", "toInputFieldBorderStyle", "(Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;", "Landroid/content/Context;", "isRtl", "(Landroid/content/Context;)Z", "field", "getDeviceCountry", "(Lcom/checkout/components/interfaces/model/contact/Country;)Lcom/checkout/components/interfaces/model/contact/Country;", "country", "withEmoji", "buildPhoneCountryText", "(Lcom/checkout/components/interfaces/model/contact/Country;ZZ)Ljava/lang/String;", "LTR_UNICODE", "Ljava/lang/String;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Utils {
    public static final int $stable = 0;

    @NotNull
    public static final Utils INSTANCE = new Utils();

    @NotNull
    private static final String LTR_UNICODE = "\u200e";

    private Utils() {
    }

    public static /* synthetic */ String buildPhoneCountryText$default(Utils utils, Country country, boolean z2, boolean z10, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            z10 = true;
        }
        return utils.buildPhoneCountryText(country, z2, z10);
    }

    private final C2093f toRoundedCornerShape(BorderRadius borderRadius) {
        return AbstractC2094g.charlie(borderRadius.getTopStart(), borderRadius.getTopEnd(), borderRadius.getBottomEnd(), borderRadius.getBottomStart());
    }

    public final long actionColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorAction();
        }
        return 4279790335L;
    }

    public final long backgroundColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorBackground();
        }
        return 4294967295L;
    }

    @NotNull
    public final BorderRadius borderButtonRadius(@Nullable DesignTokens designTokens) {
        BorderRadius borderButtonRadius;
        if (designTokens != null && (borderButtonRadius = designTokens.getBorderButtonRadius()) != null) {
            return borderButtonRadius;
        }
        return DefaultBorderRadius.INSTANCE.getBUTTON();
    }

    public final long borderColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorBorder();
        }
        return 4292730333L;
    }

    @NotNull
    public final BorderRadius borderFormRadius(@Nullable DesignTokens designTokens) {
        BorderRadius borderFormRadius;
        if (designTokens != null && (borderFormRadius = designTokens.getBorderFormRadius()) != null) {
            return borderFormRadius;
        }
        return DefaultBorderRadius.INSTANCE.getFORM();
    }

    @NotNull
    public final String buildPhoneCountryText(@NotNull Country country, boolean isRTL, boolean withEmoji) {
        Intrinsics.echo(country, "country");
        StringBuilder sb2 = new StringBuilder();
        String dialingCode = INSTANCE.dialingCode(country, false);
        if (isRTL) {
            String[] strArr = {LTR_UNICODE, dialingCode};
            for (int i4 = 0; i4 < 2; i4++) {
                sb2.append(strArr[i4]);
            }
            if (withEmoji) {
                sb2.append(" " + country.emoji());
            }
        } else {
            if (withEmoji) {
                sb2.append(country.emoji() + " ");
            }
            sb2.append(dialingCode);
        }
        return sb2.toString();
    }

    @NotNull
    public final Font buttonFont(@Nullable DesignTokens designTokens) {
        Map<FontName, Font> fonts;
        Font font;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null && (font = fonts.get(FontName.Button)) != null) {
            return font;
        }
        return DefaultFonts.INSTANCE.getBUTTON();
    }

    @NotNull
    public final String dialingCode(@NotNull Country country, boolean z2) {
        Intrinsics.echo(country, "<this>");
        if (z2) {
            return P0.crimson(country.getDialingCode(), "+");
        }
        return q.echo("+", country.getDialingCode());
    }

    public final long disabledColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorDisabled();
        }
        return 4289769648L;
    }

    public final long errorColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorError();
        }
        return 4289538110L;
    }

    @NotNull
    public final Font footnoteFont(@Nullable DesignTokens designTokens) {
        Map<FontName, Font> fonts;
        Font font;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null && (font = fonts.get(FontName.Footnote)) != null) {
            return font;
        }
        return DefaultFonts.INSTANCE.getFOOTNOTE();
    }

    public final long formBorderColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorFormBorder();
        }
        return 4287927444L;
    }

    @NotNull
    public final Country getDeviceCountry(@Nullable Country field) {
        if (field == null) {
            Country.Companion companion = Country.INSTANCE;
            String country = Locale.getDefault().getCountry();
            Intrinsics.delta(country, "getCountry(...)");
            Country fromIso3166Alpha2 = companion.fromIso3166Alpha2(country);
            if (fromIso3166Alpha2 == null) {
                return Country.UNITED_KINGDOM;
            }
            return fromIso3166Alpha2;
        }
        return field;
    }

    @NotNull
    public final Font headingFont(@Nullable DesignTokens designTokens) {
        Map<FontName, Font> fonts;
        Font font;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null && (font = fonts.get(FontName.Heading)) != null) {
            return font;
        }
        return DefaultFonts.INSTANCE.getHEADING();
    }

    @NotNull
    public final Font inputFont(@Nullable DesignTokens designTokens) {
        Map<FontName, Font> fonts;
        Font font;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null && (font = fonts.get(FontName.Input)) != null) {
            return font;
        }
        return DefaultFonts.INSTANCE.getINPUT();
    }

    public final long inverseColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorInverse();
        }
        return 4294967295L;
    }

    public final boolean isRtl(@NotNull Context context) {
        Intrinsics.echo(context, "<this>");
        if (context.getResources().getConfiguration().getLayoutDirection() == 1) {
            return true;
        }
        return false;
    }

    @NotNull
    public final Font labelFont(@Nullable DesignTokens designTokens) {
        Map<FontName, Font> fonts;
        Font font;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null && (font = fonts.get(FontName.Label)) != null) {
            return font;
        }
        return DefaultFonts.INSTANCE.getLABEL();
    }

    public final long primaryColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorPrimary();
        }
        return 4278190080L;
    }

    public final long secondaryColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorSecondary();
        }
        return 4285690482L;
    }

    @NotNull
    public final Font subheadingFont(@Nullable DesignTokens designTokens) {
        Map<FontName, Font> fonts;
        Font font;
        if (designTokens != null && (fonts = designTokens.getFonts()) != null && (font = fonts.get(FontName.Subheading)) != null) {
            return font;
        }
        return DefaultFonts.INSTANCE.getSUBHEADING();
    }

    public final long successColor(@Nullable DesignTokens designTokens) {
        ColorTokens colorTokens;
        if (designTokens != null && (colorTokens = designTokens.getColorTokens()) != null) {
            return colorTokens.getColorSuccess();
        }
        return 4278224234L;
    }

    @NotNull
    public final C2093f toButtonShape(@Nullable DesignTokens designTokens) {
        return toRoundedCornerShape(borderButtonRadius(designTokens));
    }

    /* renamed from: toComposeColor-vNxB06k, reason: not valid java name */
    public final long m191toComposeColorvNxB06k(long j5) {
        return ao.delta(j5);
    }

    @NotNull
    public final C2093f toFormShape(@Nullable DesignTokens designTokens) {
        return toRoundedCornerShape(borderFormRadius(designTokens));
    }

    @NotNull
    public final InputFieldBorderStyle toInputFieldBorderStyle(@Nullable DesignTokens designTokens) {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        long j5;
        long j6;
        long j7;
        if (designTokens == null || (borderRadius = designTokens.getBorderFormRadius()) == null) {
            borderRadius = new BorderRadius(4);
        }
        BorderRadius borderRadius2 = borderRadius;
        if (designTokens != null) {
            colorTokens = designTokens.getColorTokens();
        } else {
            colorTokens = null;
        }
        long j10 = 4287927444L;
        if (colorTokens != null) {
            j5 = colorTokens.getColorFormBorder();
        } else {
            j5 = 4287927444L;
        }
        if (colorTokens != null) {
            j6 = colorTokens.getColorFormBorder();
        } else {
            j6 = 4287927444L;
        }
        if (colorTokens != null) {
            j10 = colorTokens.getColorFormBorder();
        }
        long j11 = j10;
        if (colorTokens != null) {
            j7 = colorTokens.getColorError();
        } else {
            j7 = 4289538110L;
        }
        return new InputFieldBorderStyle(null, borderRadius2, j6, j5, j11, j7, 1, null);
    }
}
