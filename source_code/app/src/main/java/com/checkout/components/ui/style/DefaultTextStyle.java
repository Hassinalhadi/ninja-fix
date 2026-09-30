package com.checkout.components.ui.style;

import com.checkout.components.interfaces.uicustomisation.font.Font;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import com.checkout.components.ui.model.style.base.TextStyle;
import com.checkout.components.ui.utils.constants.DesignConstants;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/ui/style/DefaultTextStyle;", "", "<init>", "()V", "label", "Lcom/checkout/components/ui/model/style/base/TextStyle;", Constants.KEY_COLOR, "", "font", "Lcom/checkout/components/interfaces/uicustomisation/font/Font;", "label$ui_standardRelease", "(Ljava/lang/Long;Lcom/checkout/components/interfaces/uicustomisation/font/Font;)Lcom/checkout/components/ui/model/style/base/TextStyle;", "inputFieldTextStyle", "inputFieldTextStyle$ui_standardRelease", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DefaultTextStyle {
    public static final int $stable = 0;

    @NotNull
    public static final DefaultTextStyle INSTANCE = new DefaultTextStyle();

    private DefaultTextStyle() {
    }

    public static /* synthetic */ TextStyle inputFieldTextStyle$ui_standardRelease$default(DefaultTextStyle defaultTextStyle, long j5, Font font, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = 4278190080L;
        }
        if ((i4 & 2) != 0) {
            font = null;
        }
        return defaultTextStyle.inputFieldTextStyle$ui_standardRelease(j5, font);
    }

    public static /* synthetic */ TextStyle label$ui_standardRelease$default(DefaultTextStyle defaultTextStyle, Long l10, Font font, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            l10 = null;
        }
        if ((i4 & 2) != 0) {
            font = null;
        }
        return defaultTextStyle.label$ui_standardRelease(l10, font);
    }

    @NotNull
    public final TextStyle inputFieldTextStyle$ui_standardRelease(long color, @Nullable Font font) {
        int i4;
        FontFamily fontFamily;
        FontWeight fontWeight;
        FontStyle fontStyle;
        int i5;
        int i10;
        Integer letterSpacing;
        Integer lineHeight;
        if (font != null) {
            i4 = font.getFontSize();
        } else {
            i4 = 16;
        }
        int i11 = i4;
        if (font == null || (fontFamily = font.getFontFamily()) == null) {
            fontFamily = DesignConstants.INSTANCE.getFontFamily();
        }
        FontFamily fontFamily2 = fontFamily;
        if (font == null || (fontWeight = font.getFontWeight()) == null) {
            fontWeight = FontWeight.Normal;
        }
        FontWeight fontWeight2 = fontWeight;
        if (font == null || (fontStyle = font.getFontStyle()) == null) {
            fontStyle = FontStyle.Normal;
        }
        FontStyle fontStyle2 = fontStyle;
        if (font != null && (lineHeight = font.getLineHeight()) != null) {
            i5 = lineHeight.intValue();
        } else {
            i5 = 24;
        }
        if (font != null && (letterSpacing = font.getLetterSpacing()) != null) {
            i10 = letterSpacing.intValue();
        } else {
            i10 = 0;
        }
        return new TextStyle(i11, fontFamily2, fontStyle2, fontWeight2, color, null, 0, null, Integer.valueOf(i5), Integer.valueOf(i10), 224, null);
    }

    @NotNull
    public final TextStyle label$ui_standardRelease(@Nullable Long color, @Nullable Font font) {
        int i4;
        FontFamily fontFamily;
        FontWeight fontWeight;
        FontStyle fontStyle;
        long j5;
        int i5;
        int i10;
        Integer letterSpacing;
        Integer lineHeight;
        if (font != null) {
            i4 = font.getFontSize();
        } else {
            i4 = 12;
        }
        int i11 = i4;
        if (font == null || (fontFamily = font.getFontFamily()) == null) {
            fontFamily = DesignConstants.INSTANCE.getFontFamily();
        }
        FontFamily fontFamily2 = fontFamily;
        if (font == null || (fontWeight = font.getFontWeight()) == null) {
            fontWeight = FontWeight.Normal;
        }
        FontWeight fontWeight2 = fontWeight;
        if (font == null || (fontStyle = font.getFontStyle()) == null) {
            fontStyle = FontStyle.Normal;
        }
        FontStyle fontStyle2 = fontStyle;
        if (color != null) {
            j5 = color.longValue();
        } else {
            j5 = 4289769648L;
        }
        long j6 = j5;
        if (font != null && (lineHeight = font.getLineHeight()) != null) {
            i5 = lineHeight.intValue();
        } else {
            i5 = 24;
        }
        if (font != null && (letterSpacing = font.getLetterSpacing()) != null) {
            i10 = letterSpacing.intValue();
        } else {
            i10 = 0;
        }
        return new TextStyle(i11, fontFamily2, fontStyle2, fontWeight2, j6, null, 0, null, Integer.valueOf(i5), Integer.valueOf(i10), 224, null);
    }
}
