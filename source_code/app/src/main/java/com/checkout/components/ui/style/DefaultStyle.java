package com.checkout.components.ui.style;

import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.designtoken.ColorTokens;
import com.checkout.components.interfaces.uicustomisation.designtoken.DefaultFonts;
import com.checkout.components.interfaces.uicustomisation.designtoken.DesignTokens;
import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.interfaces.uicustomisation.font.FontName;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.checkout.components.ui.R;
import com.checkout.components.ui.model.Padding;
import com.checkout.components.ui.model.TextAlign;
import com.checkout.components.ui.model.style.base.ContainerStyle;
import com.checkout.components.ui.model.style.base.ImageStyle;
import com.checkout.components.ui.model.style.base.InputComponentStyle;
import com.checkout.components.ui.model.style.base.InputFieldBorderStyle;
import com.checkout.components.ui.model.style.base.InputFieldStyle;
import com.checkout.components.ui.model.style.base.TextLabelStyle;
import com.checkout.components.ui.model.style.base.TextStyle;
import com.checkout.components.ui.utils.constants.DesignConstants;
import com.checkout.components.ui.utils.extensions.Utils;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n.aw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J¡\u0001\u0010\u001a\u001a\u00020\u00192\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\n\b\u0003\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u001c2\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\r\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010#J%\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0003\u0010&\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0010\u0010'J\u0017\u0010*\u001a\u00020)2\b\b\u0002\u0010(\u001a\u00020$¢\u0006\u0004\b*\u0010+JE\u00100\u001a\u00020/2\b\b\u0002\u0010,\u001a\u00020\u00042\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001cH\u0007¢\u0006\u0004\b0\u00101Jg\u0010;\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020\u00042\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010(\u001a\u00020$2\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00108\u001a\u0004\u0018\u0001072\b\b\u0002\u0010:\u001a\u000209¢\u0006\u0004\b;\u0010<J/\u0010=\u001a\u00020)2\b\b\u0002\u0010,\u001a\u00020\u00042\n\b\u0003\u00102\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b=\u0010>J'\u0010?\u001a\u00020/2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u00042\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b?\u0010@¨\u0006A"}, d2 = {"Lcom/checkout/components/ui/style/DefaultStyle;", "", "<init>", "()V", "", "placeholderText", "", "placeholderTextId", "labelText", "labelTextId", "Ln/aw;", "keyboardOptions", "", "withLeadingIcon", "withTrailingIcon", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "trailingIconStyle", "leadingIconStyle", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "borderRadius", "Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;", "colorTokens", "Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "inputFont", "labelFont", "Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "inputFieldStyle", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ln/aw;ZZLcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;Lcom/checkout/components/interfaces/uicustomisation/designtoken/ColorTokens;Lcom/checkout/components/interfaces/uicustomisation/font/Font;Lcom/checkout/components/interfaces/uicustomisation/font/Font;)Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "containerStyle", "()Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "Lcom/checkout/components/ui/model/Padding;", "padding", "emptyContainerStyle", "(Lcom/checkout/components/ui/model/Padding;)Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "", "tintColor", "imageId", "(Ljava/lang/Long;Ljava/lang/Integer;)Lcom/checkout/components/ui/model/style/base/ImageStyle;", Constants.KEY_COLOR, "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", RedirectCustomTabEventLogger.RESULT_ERROR, "(J)Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", Constants.KEY_TEXT, "Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;", "designTokens", "Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "createInputComponentStyle", "(Ljava/lang/String;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;Lcom/checkout/components/ui/model/Padding;Ln/aw;Lcom/checkout/components/ui/model/style/base/ContainerStyle;)Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "textId", "font", "fontSize", "Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "fontWeight", "Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "fontStyle", "Lcom/checkout/components/ui/model/TextAlign;", "textAlign", "textLabelStyle", "(Ljava/lang/String;Ljava/lang/Integer;JLcom/checkout/components/interfaces/uicustomisation/font/Font;Ljava/lang/Integer;Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;Lcom/checkout/components/ui/model/TextAlign;)Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "checkboxLabelStyle", "(Ljava/lang/String;Ljava/lang/Integer;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "createPickerFieldStyle", "(Lcom/checkout/components/ui/model/Padding;Ljava/lang/String;Lcom/checkout/components/interfaces/uicustomisation/designtoken/DesignTokens;)Lcom/checkout/components/ui/model/style/base/InputComponentStyle;", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultStyle {
    public static final int $stable = 0;

    @NotNull
    public static final DefaultStyle INSTANCE = new DefaultStyle();

    private DefaultStyle() {
    }

    public static /* synthetic */ TextLabelStyle checkboxLabelStyle$default(DefaultStyle defaultStyle, String str, Integer num, DesignTokens designTokens, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        if ((i4 & 2) != 0) {
            num = null;
        }
        if ((i4 & 4) != 0) {
            designTokens = null;
        }
        return defaultStyle.checkboxLabelStyle(str, num, designTokens);
    }

    public static InputComponentStyle createInputComponentStyle$default(DefaultStyle defaultStyle, String str, DesignTokens designTokens, Padding padding, aw awVar, ContainerStyle containerStyle, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        if ((i4 & 2) != 0) {
            designTokens = null;
        }
        if ((i4 & 4) != 0) {
            padding = null;
        }
        if ((i4 & 8) != 0) {
            aw awVar2 = aw.delta;
            awVar = aw.delta;
        }
        if ((i4 & 16) != 0) {
            containerStyle = defaultStyle.containerStyle();
        }
        ContainerStyle containerStyle2 = containerStyle;
        return defaultStyle.createInputComponentStyle(str, designTokens, padding, awVar, containerStyle2);
    }

    public static /* synthetic */ ContainerStyle emptyContainerStyle$default(DefaultStyle defaultStyle, Padding padding, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            padding = new Padding(0, 0, 0, 0, 15, null);
        }
        return defaultStyle.emptyContainerStyle(padding);
    }

    public static /* synthetic */ TextLabelStyle error$default(DefaultStyle defaultStyle, long j5, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = 4289538110L;
        }
        return defaultStyle.error(j5);
    }

    public static InputFieldStyle inputFieldStyle$default(DefaultStyle defaultStyle, String str, Integer num, String str2, Integer num2, aw awVar, boolean z2, boolean z10, ImageStyle imageStyle, ImageStyle imageStyle2, BorderRadius borderRadius, ColorTokens colorTokens, Font font, Font font2, int i4, Object obj) {
        Integer num3;
        Integer num4;
        aw awVar2;
        boolean z11;
        ImageStyle imageStyle3;
        ImageStyle imageStyle4;
        BorderRadius borderRadius2;
        ColorTokens colorTokens2;
        Font font3;
        Font font4;
        String str3 = "";
        if ((i4 & 1) != 0) {
            str = "";
        }
        if ((i4 & 2) != 0) {
            num3 = null;
        } else {
            num3 = num;
        }
        if ((i4 & 4) == 0) {
            str3 = str2;
        }
        if ((i4 & 8) != 0) {
            num4 = null;
        } else {
            num4 = num2;
        }
        if ((i4 & 16) != 0) {
            aw awVar3 = aw.delta;
            awVar2 = aw.delta;
        } else {
            awVar2 = awVar;
        }
        boolean z12 = false;
        if ((i4 & 32) != 0) {
            z11 = false;
        } else {
            z11 = z2;
        }
        if ((i4 & 64) == 0) {
            z12 = z10;
        }
        if ((i4 & 128) != 0) {
            imageStyle3 = null;
        } else {
            imageStyle3 = imageStyle;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            imageStyle4 = null;
        } else {
            imageStyle4 = imageStyle2;
        }
        if ((i4 & 512) != 0) {
            borderRadius2 = null;
        } else {
            borderRadius2 = borderRadius;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            colorTokens2 = null;
        } else {
            colorTokens2 = colorTokens;
        }
        if ((i4 & 2048) != 0) {
            font3 = null;
        } else {
            font3 = font;
        }
        if ((i4 & 4096) != 0) {
            font4 = null;
        } else {
            font4 = font2;
        }
        return defaultStyle.inputFieldStyle(str, num3, str3, num4, awVar2, z11, z12, imageStyle3, imageStyle4, borderRadius2, colorTokens2, font3, font4);
    }

    public static /* synthetic */ TextLabelStyle textLabelStyle$default(DefaultStyle defaultStyle, String str, Integer num, long j5, Font font, Integer num2, FontWeight fontWeight, FontStyle fontStyle, TextAlign textAlign, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = "";
        }
        if ((i4 & 2) != 0) {
            num = null;
        }
        if ((i4 & 4) != 0) {
            j5 = 4294967295L;
        }
        if ((i4 & 8) != 0) {
            font = null;
        }
        if ((i4 & 16) != 0) {
            num2 = null;
        }
        if ((i4 & 32) != 0) {
            fontWeight = null;
        }
        if ((i4 & 64) != 0) {
            fontStyle = null;
        }
        if ((i4 & 128) != 0) {
            textAlign = TextAlign.Start;
        }
        TextAlign textAlign2 = textAlign;
        FontWeight fontWeight2 = fontWeight;
        Font font2 = font;
        return defaultStyle.textLabelStyle(str, num, j5, font2, num2, fontWeight2, fontStyle, textAlign2);
    }

    public static /* synthetic */ ImageStyle trailingIconStyle$default(DefaultStyle defaultStyle, Long l10, Integer num, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l10 = null;
        }
        if ((i4 & 2) != 0) {
            num = null;
        }
        return defaultStyle.trailingIconStyle(l10, num);
    }

    @NotNull
    public final TextLabelStyle checkboxLabelStyle(@NotNull String r15, @Nullable Integer textId, @Nullable DesignTokens designTokens) {
        Font subheading;
        Map<FontName, Font> fonts;
        Intrinsics.echo(r15, "text");
        long secondaryColor = Utils.INSTANCE.secondaryColor(designTokens);
        if (designTokens == null || (fonts = designTokens.getFonts()) == null || (subheading = fonts.get(FontName.Subheading)) == null) {
            subheading = DefaultFonts.INSTANCE.getSUBHEADING();
        }
        return textLabelStyle$default(this, r15, textId, secondaryColor, subheading, null, null, null, null, 240, null);
    }

    @NotNull
    public final ContainerStyle containerStyle() {
        return new ContainerStyle(0L, null, null, new Padding(0, 0, 16, 16, 3, null), 7, null);
    }

    @NotNull
    public final InputComponentStyle createInputComponentStyle() {
        return createInputComponentStyle$default(this, null, null, null, null, null, 31, null);
    }

    @NotNull
    public final InputComponentStyle createPickerFieldStyle(@NotNull Padding padding, @NotNull String labelText, @Nullable DesignTokens designTokens) {
        BorderRadius borderRadius;
        ColorTokens colorTokens;
        Font font;
        Font font2;
        ColorTokens colorTokens2;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        Intrinsics.echo(padding, "padding");
        Intrinsics.echo(labelText, "labelText");
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
        InputFieldStyle inputFieldStyle$default = inputFieldStyle$default(this, null, null, labelText, null, null, false, false, null, null, borderRadius, colorTokens, font2, font, 507, null);
        InputFieldBorderStyle inputFieldBorderStyle = Utils.INSTANCE.toInputFieldBorderStyle(designTokens);
        ImageStyle trailingIconStyle$default = trailingIconStyle$default(this, null, null, 3, null);
        int i4 = R.drawable.cko_ic_dropdown;
        if (designTokens != null && (colorTokens2 = designTokens.getColorTokens()) != null) {
            l10 = Long.valueOf(colorTokens2.getColorPrimary());
        }
        return InputComponentStyle.copy$default(createInputComponentStyle$default(this, null, designTokens, padding, null, null, 25, null), InputFieldStyle.copy$default(inputFieldStyle$default, null, null, null, null, null, null, null, inputFieldBorderStyle, null, ImageStyle.copy$default(trailingIconStyle$default, Integer.valueOf(i4), l10, 16, 16, new Padding(0, 0, 0, 0), null, null, null, 224, null), null, null, 0L, false, 15743, null), null, null, null, null, null, 62, null);
    }

    @NotNull
    public final ContainerStyle emptyContainerStyle(@NotNull Padding padding) {
        Intrinsics.echo(padding, "padding");
        return new ContainerStyle(0L, null, null, padding, 7, null);
    }

    @NotNull
    public final TextLabelStyle error(long j5) {
        return new TextLabelStyle(null, null, new TextStyle(13, DesignConstants.INSTANCE.getFontFamily(), null, null, j5, null, 0, null, null, null, 1004, null), false, 11, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle() {
        return inputFieldStyle$default(this, null, null, null, null, null, false, false, null, null, null, null, null, null, 8191, null);
    }

    @NotNull
    public final ImageStyle leadingIconStyle() {
        return new ImageStyle(null, null, 16, 30, new Padding(0, 0, 10, 10, 3, null), null, null, null, 227, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0056  */
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TextLabelStyle textLabelStyle(@NotNull String r17, @Nullable Integer textId, long r19, @Nullable Font font, @Nullable Integer fontSize, @Nullable FontWeight fontWeight, @Nullable FontStyle fontStyle, @NotNull TextAlign textAlign) {
        int i4;
        FontFamily fontFamily;
        FontWeight fontWeight2;
        FontWeight fontWeight3;
        FontStyle fontStyle2;
        FontStyle fontStyle3;
        int i5;
        int i10;
        Integer letterSpacing;
        Integer lineHeight;
        Intrinsics.echo(r17, "text");
        Intrinsics.echo(textAlign, "textAlign");
        if (font != null) {
            i4 = font.getFontSize();
        } else if (fontSize != null) {
            i4 = fontSize.intValue();
        } else {
            i4 = 14;
        }
        int i11 = i4;
        if (font == null || (fontFamily = font.getFontFamily()) == null) {
            fontFamily = DesignConstants.INSTANCE.getFontFamily();
        }
        FontFamily fontFamily2 = fontFamily;
        if (font == null || (fontWeight3 = font.getFontWeight()) == null) {
            if (fontWeight == null) {
                fontWeight3 = FontWeight.Medium;
            } else {
                fontWeight2 = fontWeight;
                if (font != null || (fontStyle3 = font.getFontStyle()) == null) {
                    if (fontStyle != null) {
                        fontStyle3 = FontStyle.Normal;
                    } else {
                        fontStyle2 = fontStyle;
                        if (font == null && (lineHeight = font.getLineHeight()) != null) {
                            i5 = lineHeight.intValue();
                        } else {
                            i5 = 20;
                        }
                        if (font == null && (letterSpacing = font.getLetterSpacing()) != null) {
                            i10 = letterSpacing.intValue();
                        } else {
                            i10 = 0;
                        }
                        return new TextLabelStyle(r17, textId, new TextStyle(i11, fontFamily2, fontStyle2, fontWeight2, r19, textAlign, 0, null, Integer.valueOf(i5), Integer.valueOf(i10), 192, null), false, 8, null);
                    }
                }
                fontStyle2 = fontStyle3;
                if (font == null) {
                }
                i5 = 20;
                if (font == null) {
                }
                i10 = 0;
                return new TextLabelStyle(r17, textId, new TextStyle(i11, fontFamily2, fontStyle2, fontWeight2, r19, textAlign, 0, null, Integer.valueOf(i5), Integer.valueOf(i10), 192, null), false, 8, null);
            }
        }
        fontWeight2 = fontWeight3;
        if (font != null) {
        }
        if (fontStyle != null) {
        }
    }

    @NotNull
    public final ImageStyle trailingIconStyle(@Nullable Long tintColor, @Nullable Integer imageId) {
        return new ImageStyle(imageId, tintColor, 16, 30, new Padding(0, 0, 10, 10, 3, null), null, null, null, 224, null);
    }

    @NotNull
    public final InputComponentStyle createInputComponentStyle(@NotNull String text) {
        Intrinsics.echo(text, "text");
        return createInputComponentStyle$default(this, text, null, null, null, null, 30, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText) {
        Intrinsics.echo(placeholderText, "placeholderText");
        return inputFieldStyle$default(this, placeholderText, null, null, null, null, false, false, null, null, null, null, null, null, 8190, null);
    }

    @NotNull
    public final InputComponentStyle createInputComponentStyle(@NotNull String text, @Nullable DesignTokens designTokens) {
        Intrinsics.echo(text, "text");
        return createInputComponentStyle$default(this, text, designTokens, null, null, null, 28, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num) {
        Intrinsics.echo(placeholderText, "placeholderText");
        return inputFieldStyle$default(this, placeholderText, num, null, null, null, false, false, null, null, null, null, null, null, 8188, null);
    }

    @NotNull
    public final InputComponentStyle createInputComponentStyle(@NotNull String text, @Nullable DesignTokens designTokens, @Nullable Padding padding) {
        Intrinsics.echo(text, "text");
        return createInputComponentStyle$default(this, text, designTokens, padding, null, null, 24, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        return inputFieldStyle$default(this, placeholderText, num, labelText, null, null, false, false, null, null, null, null, null, null, 8184, null);
    }

    @NotNull
    public final InputComponentStyle createInputComponentStyle(@NotNull String text, @Nullable DesignTokens designTokens, @Nullable Padding padding, @NotNull aw keyboardOptions) {
        Intrinsics.echo(text, "text");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return createInputComponentStyle$default(this, text, designTokens, padding, keyboardOptions, null, 16, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, null, false, false, null, null, null, null, null, null, 8176, null);
    }

    @NotNull
    public final InputComponentStyle createInputComponentStyle(@NotNull String r18, @Nullable DesignTokens designTokens, @Nullable Padding padding, @NotNull aw keyboardOptions, @NotNull ContainerStyle containerStyle) {
        ContainerStyle copy$default;
        ColorTokens colorTokens;
        Map<FontName, Font> fonts;
        Map<FontName, Font> fonts2;
        Intrinsics.echo(r18, "text");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        Intrinsics.echo(containerStyle, "containerStyle");
        Font font = null;
        BorderRadius borderFormRadius = designTokens != null ? designTokens.getBorderFormRadius() : null;
        ColorTokens colorTokens2 = designTokens != null ? designTokens.getColorTokens() : null;
        Font font2 = (designTokens == null || (fonts2 = designTokens.getFonts()) == null) ? null : fonts2.get(FontName.Label);
        if (designTokens != null && (fonts = designTokens.getFonts()) != null) {
            font = fonts.get(FontName.Input);
        }
        return new InputComponentStyle(inputFieldStyle$default(this, null, null, r18, null, null, false, false, null, null, borderFormRadius, colorTokens2, font, font2, 507, null), error((designTokens == null || (colorTokens = designTokens.getColorTokens()) == null) ? 4289538110L : colorTokens.getColorError()), null, keyboardOptions, null, (padding == null || (copy$default = ContainerStyle.copy$default(containerStyle, 0L, null, null, padding, 7, null)) == null) ? containerStyle : copy$default, 20, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2, @NotNull aw keyboardOptions) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, keyboardOptions, false, false, null, null, null, null, null, null, 8160, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2, @NotNull aw keyboardOptions, boolean z2) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, keyboardOptions, z2, false, null, null, null, null, null, null, 8128, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2, @NotNull aw keyboardOptions, boolean z2, boolean z10) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, keyboardOptions, z2, z10, null, null, null, null, null, null, 8064, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2, @NotNull aw keyboardOptions, boolean z2, boolean z10, @Nullable ImageStyle imageStyle) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, keyboardOptions, z2, z10, imageStyle, null, null, null, null, null, 7936, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2, @NotNull aw keyboardOptions, boolean z2, boolean z10, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, keyboardOptions, z2, z10, imageStyle, imageStyle2, null, null, null, null, 7680, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2, @NotNull aw keyboardOptions, boolean z2, boolean z10, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2, @Nullable BorderRadius borderRadius) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, keyboardOptions, z2, z10, imageStyle, imageStyle2, borderRadius, null, null, null, 7168, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2, @NotNull aw keyboardOptions, boolean z2, boolean z10, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2, @Nullable BorderRadius borderRadius, @Nullable ColorTokens colorTokens) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, keyboardOptions, z2, z10, imageStyle, imageStyle2, borderRadius, colorTokens, null, null, 6144, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer num, @NotNull String labelText, @Nullable Integer num2, @NotNull aw keyboardOptions, boolean z2, boolean z10, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2, @Nullable BorderRadius borderRadius, @Nullable ColorTokens colorTokens, @Nullable Font font) {
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return inputFieldStyle$default(this, placeholderText, num, labelText, num2, keyboardOptions, z2, z10, imageStyle, imageStyle2, borderRadius, colorTokens, font, null, 4096, null);
    }

    @NotNull
    public final InputFieldStyle inputFieldStyle(@NotNull String placeholderText, @Nullable Integer placeholderTextId, @NotNull String labelText, @Nullable Integer labelTextId, @NotNull aw keyboardOptions, boolean withLeadingIcon, boolean withTrailingIcon, @Nullable ImageStyle trailingIconStyle, @Nullable ImageStyle leadingIconStyle, @Nullable BorderRadius borderRadius, @Nullable ColorTokens colorTokens, @Nullable Font inputFont, @Nullable Font labelFont) {
        ImageStyle imageStyle;
        ImageStyle imageStyle2;
        InputFieldBorderStyle inputFieldBorderStyle;
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        DefaultTextStyle defaultTextStyle = DefaultTextStyle.INSTANCE;
        TextStyle inputFieldTextStyle$ui_standardRelease = defaultTextStyle.inputFieldTextStyle$ui_standardRelease(colorTokens != null ? colorTokens.getColorPrimary() : 4278190080L, inputFont);
        TextStyle label$ui_standardRelease = defaultTextStyle.label$ui_standardRelease(colorTokens != null ? Long.valueOf(colorTokens.getColorDisabled()) : null, labelFont);
        TextStyle label$ui_standardRelease2 = defaultTextStyle.label$ui_standardRelease(colorTokens != null ? Long.valueOf(colorTokens.getColorDisabled()) : null, labelFont);
        if (withLeadingIcon) {
            imageStyle = leadingIconStyle == null ? leadingIconStyle() : leadingIconStyle;
        } else {
            imageStyle = null;
        }
        if (withTrailingIcon) {
            imageStyle2 = trailingIconStyle == null ? trailingIconStyle$default(this, null, null, 3, null) : trailingIconStyle;
        } else {
            imageStyle2 = null;
        }
        long colorFormBackground = colorTokens != null ? colorTokens.getColorFormBackground() : 0L;
        if (colorTokens != null) {
            inputFieldBorderStyle = new InputFieldBorderStyle(null, borderRadius == null ? new BorderRadius(4) : borderRadius, colorTokens.getColorAction(), colorTokens.getColorFormBorder(), colorTokens.getColorDisabled(), colorTokens.getColorError(), 1, null);
        } else {
            inputFieldBorderStyle = new InputFieldBorderStyle(null, borderRadius == null ? new BorderRadius(4) : borderRadius, 0L, 0L, 0L, 0L, 61, null);
        }
        return new InputFieldStyle(inputFieldTextStyle$ui_standardRelease, placeholderText, placeholderTextId, label$ui_standardRelease, labelText, labelTextId, label$ui_standardRelease2, inputFieldBorderStyle, imageStyle, imageStyle2, null, keyboardOptions, colorFormBackground, false, 9216, null);
    }
}
