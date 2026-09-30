package com.checkout.components.ui.model.style.base;

import com.airbnb.lottie.compose.LottieConstants;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.interfaces.uicustomisation.font.FontStyle;
import com.checkout.components.interfaces.uicustomisation.font.FontWeight;
import com.checkout.components.ui.model.TextAlign;
import com.checkout.components.ui.utils.constants.DesignConstants;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\t\u0010(\u001a\u00020\u0007HÆ\u0003J\t\u0010)\u001a\u00020\tHÆ\u0003J\t\u0010*\u001a\u00020\u000bHÆ\u0003J\t\u0010+\u001a\u00020\rHÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u0010\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"J\u0010\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\"Jx\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u00101J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u00020\u0003HÖ\u0001J\t\u00106\u001a\u000207HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0015R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b!\u0010\"R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b$\u0010\"R\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010#\u001a\u0004\b%\u0010\"¨\u00068"}, d2 = {"Lcom/checkout/components/ui/model/style/base/TextStyle;", "", "size", "", "fontFamily", "Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "fontStyle", "Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "fontWeight", "Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", Constants.KEY_COLOR, "", "textAlign", "Lcom/checkout/components/ui/model/TextAlign;", "maxLines", "maxLength", "lineHeight", "letterSpacing", "<init>", "(ILcom/checkout/components/interfaces/uicustomisation/font/FontFamily;Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;JLcom/checkout/components/ui/model/TextAlign;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSize", "()I", "getFontFamily", "()Lcom/checkout/components/interfaces/uicustomisation/font/FontFamily;", "getFontStyle", "()Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;", "getFontWeight", "()Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "getColor", "()J", "getTextAlign", "()Lcom/checkout/components/ui/model/TextAlign;", "getMaxLines", "getMaxLength", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getLineHeight", "getLetterSpacing", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", Constants.COPY_TYPE, "(ILcom/checkout/components/interfaces/uicustomisation/font/FontFamily;Lcom/checkout/components/interfaces/uicustomisation/font/FontStyle;Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;JLcom/checkout/components/ui/model/TextAlign;ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/checkout/components/ui/model/style/base/TextStyle;", "equals", "", "other", "hashCode", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TextStyle {
    public static final int $stable = FontFamily.$stable;
    private final long color;

    @NotNull
    private final FontFamily fontFamily;

    @NotNull
    private final FontStyle fontStyle;

    @NotNull
    private final FontWeight fontWeight;

    @Nullable
    private final Integer letterSpacing;

    @Nullable
    private final Integer lineHeight;

    @Nullable
    private final Integer maxLength;
    private final int maxLines;
    private final int size;

    @NotNull
    private final TextAlign textAlign;

    public TextStyle() {
        this(0, null, null, null, 0L, null, 0, null, null, null, 1023, null);
    }

    public static /* synthetic */ TextStyle copy$default(TextStyle textStyle, int i4, FontFamily fontFamily, FontStyle fontStyle, FontWeight fontWeight, long j5, TextAlign textAlign, int i5, Integer num, Integer num2, Integer num3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = textStyle.size;
        }
        if ((i10 & 2) != 0) {
            fontFamily = textStyle.fontFamily;
        }
        if ((i10 & 4) != 0) {
            fontStyle = textStyle.fontStyle;
        }
        if ((i10 & 8) != 0) {
            fontWeight = textStyle.fontWeight;
        }
        if ((i10 & 16) != 0) {
            j5 = textStyle.color;
        }
        if ((i10 & 32) != 0) {
            textAlign = textStyle.textAlign;
        }
        if ((i10 & 64) != 0) {
            i5 = textStyle.maxLines;
        }
        if ((i10 & 128) != 0) {
            num = textStyle.maxLength;
        }
        if ((i10 & Barcode.FORMAT_QR_CODE) != 0) {
            num2 = textStyle.lineHeight;
        }
        if ((i10 & 512) != 0) {
            num3 = textStyle.letterSpacing;
        }
        Integer num4 = num3;
        Integer num5 = num;
        TextAlign textAlign2 = textAlign;
        long j6 = j5;
        FontStyle fontStyle2 = fontStyle;
        FontWeight fontWeight2 = fontWeight;
        return textStyle.copy(i4, fontFamily, fontStyle2, fontWeight2, j6, textAlign2, i5, num5, num2, num4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Integer getLetterSpacing() {
        return this.letterSpacing;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    /* renamed from: component5, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    /* renamed from: component7, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @NotNull
    public final TextStyle copy(int size, @NotNull FontFamily fontFamily, @NotNull FontStyle fontStyle, @NotNull FontWeight fontWeight, long color, @NotNull TextAlign textAlign, int maxLines, @Nullable Integer maxLength, @Nullable Integer lineHeight, @Nullable Integer letterSpacing) {
        Intrinsics.echo(fontFamily, "fontFamily");
        Intrinsics.echo(fontStyle, "fontStyle");
        Intrinsics.echo(fontWeight, "fontWeight");
        Intrinsics.echo(textAlign, "textAlign");
        return new TextStyle(size, fontFamily, fontStyle, fontWeight, color, textAlign, maxLines, maxLength, lineHeight, letterSpacing);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return this.size == textStyle.size && Intrinsics.areEqual(this.fontFamily, textStyle.fontFamily) && this.fontStyle == textStyle.fontStyle && this.fontWeight == textStyle.fontWeight && this.color == textStyle.color && this.textAlign == textStyle.textAlign && this.maxLines == textStyle.maxLines && Intrinsics.areEqual(this.maxLength, textStyle.maxLength) && Intrinsics.areEqual(this.lineHeight, textStyle.lineHeight) && Intrinsics.areEqual(this.letterSpacing, textStyle.letterSpacing);
    }

    public final long getColor() {
        return this.color;
    }

    @NotNull
    public final FontFamily getFontFamily() {
        return this.fontFamily;
    }

    @NotNull
    public final FontStyle getFontStyle() {
        return this.fontStyle;
    }

    @NotNull
    public final FontWeight getFontWeight() {
        return this.fontWeight;
    }

    @Nullable
    public final Integer getLetterSpacing() {
        return this.letterSpacing;
    }

    @Nullable
    public final Integer getLineHeight() {
        return this.lineHeight;
    }

    @Nullable
    public final Integer getMaxLength() {
        return this.maxLength;
    }

    public final int getMaxLines() {
        return this.maxLines;
    }

    public final int getSize() {
        return this.size;
    }

    @NotNull
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3 = (this.fontWeight.hashCode() + ((this.fontStyle.hashCode() + ((this.fontFamily.hashCode() + (this.size * 31)) * 31)) * 31)) * 31;
        long j5 = this.color;
        int hashCode4 = (this.maxLines + ((this.textAlign.hashCode() + ((((int) (j5 ^ (j5 >>> 32))) + hashCode3) * 31)) * 31)) * 31;
        Integer num = this.maxLength;
        int i4 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = (hashCode4 + hashCode) * 31;
        Integer num2 = this.lineHeight;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Integer num3 = this.letterSpacing;
        if (num3 != null) {
            i4 = num3.hashCode();
        }
        return i10 + i4;
    }

    @NotNull
    public String toString() {
        return "TextStyle(size=" + this.size + ", fontFamily=" + this.fontFamily + ", fontStyle=" + this.fontStyle + ", fontWeight=" + this.fontWeight + ", color=" + this.color + ", textAlign=" + this.textAlign + ", maxLines=" + this.maxLines + ", maxLength=" + this.maxLength + ", lineHeight=" + this.lineHeight + ", letterSpacing=" + this.letterSpacing + ")";
    }

    public TextStyle(int i4, @NotNull FontFamily fontFamily, @NotNull FontStyle fontStyle, @NotNull FontWeight fontWeight, long j5, @NotNull TextAlign textAlign, int i5, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3) {
        Intrinsics.echo(fontFamily, "fontFamily");
        Intrinsics.echo(fontStyle, "fontStyle");
        Intrinsics.echo(fontWeight, "fontWeight");
        Intrinsics.echo(textAlign, "textAlign");
        this.size = i4;
        this.fontFamily = fontFamily;
        this.fontStyle = fontStyle;
        this.fontWeight = fontWeight;
        this.color = j5;
        this.textAlign = textAlign;
        this.maxLines = i5;
        this.maxLength = num;
        this.lineHeight = num2;
        this.letterSpacing = num3;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ TextStyle(int i4, FontFamily fontFamily, FontStyle fontStyle, FontWeight fontWeight, long j5, TextAlign textAlign, int i5, Integer num, Integer num2, Integer num3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, fontFamily, fontStyle, fontWeight, j5, r10, r11, r12, r13, r14);
        Integer num4;
        Integer num5;
        int i11;
        Integer num6;
        TextAlign textAlign2;
        i4 = (i10 & 1) != 0 ? 14 : i4;
        fontFamily = (i10 & 2) != 0 ? DesignConstants.INSTANCE.getFontFamily() : fontFamily;
        fontStyle = (i10 & 4) != 0 ? FontStyle.Normal : fontStyle;
        fontWeight = (i10 & 8) != 0 ? FontWeight.Normal : fontWeight;
        j5 = (i10 & 16) != 0 ? 4278190080L : j5;
        textAlign = (i10 & 32) != 0 ? TextAlign.Start : textAlign;
        i5 = (i10 & 64) != 0 ? LottieConstants.IterateForever : i5;
        num = (i10 & 128) != 0 ? null : num;
        num2 = (i10 & Barcode.FORMAT_QR_CODE) != 0 ? null : num2;
        if ((i10 & 512) != 0) {
            num4 = null;
            num6 = num;
            num5 = num2;
            textAlign2 = textAlign;
            i11 = i5;
        } else {
            num4 = num3;
            num5 = num2;
            i11 = i5;
            num6 = num;
            textAlign2 = textAlign;
        }
    }
}
