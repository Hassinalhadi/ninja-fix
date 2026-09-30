package com.checkout.components.ui.model.style.base;

import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import n.aw;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001B\u009f\u0001\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010 J\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001cJ\u0010\u0010%\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b)\u0010(J\u0012\u0010*\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b0\u00101J¦\u0001\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00042\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u0017HÆ\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b4\u0010\u001eJ\u0010\u00105\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00108\u001a\u00020\u00172\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010:\u001a\u0004\b;\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010<\u001a\u0004\b=\u0010\u001eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010>\u001a\u0004\b?\u0010 R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b@\u0010\u001cR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\bA\u0010\u001eR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010>\u001a\u0004\bB\u0010 R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010:\u001a\u0004\bC\u0010\u001cR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010(R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bH\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010I\u001a\u0004\bJ\u0010+R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010K\u001a\u0004\bL\u0010-R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\bN\u0010/R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010O\u001a\u0004\bP\u00101¨\u0006Q"}, d2 = {"Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "", "Lcom/checkout/components/ui/model/style/base/TextStyle;", "textStyle", "", "placeholderText", "", "placeholderTextId", "placeholderStyle", "labelText", "labelTextId", "labelTextStyle", "Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;", "borderStyle", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "leadingIconStyle", "trailingIconStyle", "Lcom/checkout/components/ui/model/style/base/CursorStyle;", "cursorStyle", "Ln/aw;", "keyboardOptions", "", "containerColor", "", "enabled", "<init>", "(Lcom/checkout/components/ui/model/style/base/TextStyle;Ljava/lang/String;Ljava/lang/Integer;Lcom/checkout/components/ui/model/style/base/TextStyle;Ljava/lang/String;Ljava/lang/Integer;Lcom/checkout/components/ui/model/style/base/TextStyle;Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/CursorStyle;Ln/aw;JZ)V", "component1", "()Lcom/checkout/components/ui/model/style/base/TextStyle;", "component2", "()Ljava/lang/String;", "component3", "()Ljava/lang/Integer;", "component4", "component5", "component6", "component7", "component8", "()Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;", "component9", "()Lcom/checkout/components/ui/model/style/base/ImageStyle;", "component10", "component11", "()Lcom/checkout/components/ui/model/style/base/CursorStyle;", "component12", "()Ln/aw;", "component13", "()J", "component14", "()Z", Constants.COPY_TYPE, "(Lcom/checkout/components/ui/model/style/base/TextStyle;Ljava/lang/String;Ljava/lang/Integer;Lcom/checkout/components/ui/model/style/base/TextStyle;Ljava/lang/String;Ljava/lang/Integer;Lcom/checkout/components/ui/model/style/base/TextStyle;Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/ImageStyle;Lcom/checkout/components/ui/model/style/base/CursorStyle;Ln/aw;JZ)Lcom/checkout/components/ui/model/style/base/InputFieldStyle;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/checkout/components/ui/model/style/base/TextStyle;", "getTextStyle", "Ljava/lang/String;", "getPlaceholderText", "Ljava/lang/Integer;", "getPlaceholderTextId", "getPlaceholderStyle", "getLabelText", "getLabelTextId", "getLabelTextStyle", "Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;", "getBorderStyle", "Lcom/checkout/components/ui/model/style/base/ImageStyle;", "getLeadingIconStyle", "getTrailingIconStyle", "Lcom/checkout/components/ui/model/style/base/CursorStyle;", "getCursorStyle", "Ln/aw;", "getKeyboardOptions", "J", "getContainerColor", "Z", "getEnabled", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputFieldStyle {
    public static final int $stable;

    @NotNull
    private final InputFieldBorderStyle borderStyle;
    private final long containerColor;

    @Nullable
    private final CursorStyle cursorStyle;
    private final boolean enabled;

    @NotNull
    private final aw keyboardOptions;

    @NotNull
    private final String labelText;

    @Nullable
    private final Integer labelTextId;

    @NotNull
    private final TextStyle labelTextStyle;

    @Nullable
    private final ImageStyle leadingIconStyle;

    @NotNull
    private final TextStyle placeholderStyle;

    @NotNull
    private final String placeholderText;

    @Nullable
    private final Integer placeholderTextId;

    @NotNull
    private final TextStyle textStyle;

    @Nullable
    private final ImageStyle trailingIconStyle;

    static {
        int i4 = BorderRadius.$stable;
        int i5 = FontFamily.$stable;
        $stable = i4 | i5 | i5 | i5;
    }

    public InputFieldStyle() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 0L, false, 16383, null);
    }

    public static /* synthetic */ InputFieldStyle copy$default(InputFieldStyle inputFieldStyle, TextStyle textStyle, String str, Integer num, TextStyle textStyle2, String str2, Integer num2, TextStyle textStyle3, InputFieldBorderStyle inputFieldBorderStyle, ImageStyle imageStyle, ImageStyle imageStyle2, CursorStyle cursorStyle, aw awVar, long j5, boolean z2, int i4, Object obj) {
        TextStyle textStyle4;
        String str3;
        Integer num3;
        TextStyle textStyle5;
        String str4;
        Integer num4;
        TextStyle textStyle6;
        InputFieldBorderStyle inputFieldBorderStyle2;
        ImageStyle imageStyle3;
        ImageStyle imageStyle4;
        CursorStyle cursorStyle2;
        aw awVar2;
        long j6;
        boolean z10;
        if ((i4 & 1) != 0) {
            textStyle4 = inputFieldStyle.textStyle;
        } else {
            textStyle4 = textStyle;
        }
        if ((i4 & 2) != 0) {
            str3 = inputFieldStyle.placeholderText;
        } else {
            str3 = str;
        }
        if ((i4 & 4) != 0) {
            num3 = inputFieldStyle.placeholderTextId;
        } else {
            num3 = num;
        }
        if ((i4 & 8) != 0) {
            textStyle5 = inputFieldStyle.placeholderStyle;
        } else {
            textStyle5 = textStyle2;
        }
        if ((i4 & 16) != 0) {
            str4 = inputFieldStyle.labelText;
        } else {
            str4 = str2;
        }
        if ((i4 & 32) != 0) {
            num4 = inputFieldStyle.labelTextId;
        } else {
            num4 = num2;
        }
        if ((i4 & 64) != 0) {
            textStyle6 = inputFieldStyle.labelTextStyle;
        } else {
            textStyle6 = textStyle3;
        }
        if ((i4 & 128) != 0) {
            inputFieldBorderStyle2 = inputFieldStyle.borderStyle;
        } else {
            inputFieldBorderStyle2 = inputFieldBorderStyle;
        }
        if ((i4 & Barcode.FORMAT_QR_CODE) != 0) {
            imageStyle3 = inputFieldStyle.leadingIconStyle;
        } else {
            imageStyle3 = imageStyle;
        }
        if ((i4 & 512) != 0) {
            imageStyle4 = inputFieldStyle.trailingIconStyle;
        } else {
            imageStyle4 = imageStyle2;
        }
        if ((i4 & Barcode.FORMAT_UPC_E) != 0) {
            cursorStyle2 = inputFieldStyle.cursorStyle;
        } else {
            cursorStyle2 = cursorStyle;
        }
        if ((i4 & 2048) != 0) {
            awVar2 = inputFieldStyle.keyboardOptions;
        } else {
            awVar2 = awVar;
        }
        if ((i4 & 4096) != 0) {
            j6 = inputFieldStyle.containerColor;
        } else {
            j6 = j5;
        }
        if ((i4 & 8192) != 0) {
            z10 = inputFieldStyle.enabled;
        } else {
            z10 = z2;
        }
        return inputFieldStyle.copy(textStyle4, str3, num3, textStyle5, str4, num4, textStyle6, inputFieldBorderStyle2, imageStyle3, imageStyle4, cursorStyle2, awVar2, j6, z10);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final ImageStyle getTrailingIconStyle() {
        return this.trailingIconStyle;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final CursorStyle getCursorStyle() {
        return this.cursorStyle;
    }

    @NotNull
    /* renamed from: component12, reason: from getter */
    public final aw getKeyboardOptions() {
        return this.keyboardOptions;
    }

    /* renamed from: component13, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getPlaceholderTextId() {
        return this.placeholderTextId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final TextStyle getPlaceholderStyle() {
        return this.placeholderStyle;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getLabelText() {
        return this.labelText;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final Integer getLabelTextId() {
        return this.labelTextId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final TextStyle getLabelTextStyle() {
        return this.labelTextStyle;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final InputFieldBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final ImageStyle getLeadingIconStyle() {
        return this.leadingIconStyle;
    }

    @NotNull
    public final InputFieldStyle copy(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer placeholderTextId, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer labelTextId, @NotNull TextStyle labelTextStyle, @NotNull InputFieldBorderStyle borderStyle, @Nullable ImageStyle leadingIconStyle, @Nullable ImageStyle trailingIconStyle, @Nullable CursorStyle cursorStyle, @NotNull aw keyboardOptions, long containerColor, boolean enabled) {
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
        Intrinsics.echo(borderStyle, "borderStyle");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        return new InputFieldStyle(textStyle, placeholderText, placeholderTextId, placeholderStyle, labelText, labelTextId, labelTextStyle, borderStyle, leadingIconStyle, trailingIconStyle, cursorStyle, keyboardOptions, containerColor, enabled);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldStyle)) {
            return false;
        }
        InputFieldStyle inputFieldStyle = (InputFieldStyle) other;
        return Intrinsics.areEqual(this.textStyle, inputFieldStyle.textStyle) && Intrinsics.areEqual(this.placeholderText, inputFieldStyle.placeholderText) && Intrinsics.areEqual(this.placeholderTextId, inputFieldStyle.placeholderTextId) && Intrinsics.areEqual(this.placeholderStyle, inputFieldStyle.placeholderStyle) && Intrinsics.areEqual(this.labelText, inputFieldStyle.labelText) && Intrinsics.areEqual(this.labelTextId, inputFieldStyle.labelTextId) && Intrinsics.areEqual(this.labelTextStyle, inputFieldStyle.labelTextStyle) && Intrinsics.areEqual(this.borderStyle, inputFieldStyle.borderStyle) && Intrinsics.areEqual(this.leadingIconStyle, inputFieldStyle.leadingIconStyle) && Intrinsics.areEqual(this.trailingIconStyle, inputFieldStyle.trailingIconStyle) && Intrinsics.areEqual(this.cursorStyle, inputFieldStyle.cursorStyle) && Intrinsics.areEqual(this.keyboardOptions, inputFieldStyle.keyboardOptions) && this.containerColor == inputFieldStyle.containerColor && this.enabled == inputFieldStyle.enabled;
    }

    @NotNull
    public final InputFieldBorderStyle getBorderStyle() {
        return this.borderStyle;
    }

    public final long getContainerColor() {
        return this.containerColor;
    }

    @Nullable
    public final CursorStyle getCursorStyle() {
        return this.cursorStyle;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final aw getKeyboardOptions() {
        return this.keyboardOptions;
    }

    @NotNull
    public final String getLabelText() {
        return this.labelText;
    }

    @Nullable
    public final Integer getLabelTextId() {
        return this.labelTextId;
    }

    @NotNull
    public final TextStyle getLabelTextStyle() {
        return this.labelTextStyle;
    }

    @Nullable
    public final ImageStyle getLeadingIconStyle() {
        return this.leadingIconStyle;
    }

    @NotNull
    public final TextStyle getPlaceholderStyle() {
        return this.placeholderStyle;
    }

    @NotNull
    public final String getPlaceholderText() {
        return this.placeholderText;
    }

    @Nullable
    public final Integer getPlaceholderTextId() {
        return this.placeholderTextId;
    }

    @NotNull
    public final TextStyle getTextStyle() {
        return this.textStyle;
    }

    @Nullable
    public final ImageStyle getTrailingIconStyle() {
        return this.trailingIconStyle;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int i4;
        int sierra = AbstractC2327c.sierra(this.textStyle.hashCode() * 31, 31, this.placeholderText);
        Integer num = this.placeholderTextId;
        int i5 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int sierra2 = AbstractC2327c.sierra((this.placeholderStyle.hashCode() + ((sierra + hashCode) * 31)) * 31, 31, this.labelText);
        Integer num2 = this.labelTextId;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int hashCode5 = (this.borderStyle.hashCode() + ((this.labelTextStyle.hashCode() + ((sierra2 + hashCode2) * 31)) * 31)) * 31;
        ImageStyle imageStyle = this.leadingIconStyle;
        if (imageStyle == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = imageStyle.hashCode();
        }
        int i10 = (hashCode5 + hashCode3) * 31;
        ImageStyle imageStyle2 = this.trailingIconStyle;
        if (imageStyle2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = imageStyle2.hashCode();
        }
        int i11 = (i10 + hashCode4) * 31;
        CursorStyle cursorStyle = this.cursorStyle;
        if (cursorStyle != null) {
            i5 = cursorStyle.hashCode();
        }
        int hashCode6 = (this.keyboardOptions.hashCode() + ((i11 + i5) * 31)) * 31;
        long j5 = this.containerColor;
        int i12 = (((int) (j5 ^ (j5 >>> 32))) + hashCode6) * 31;
        if (this.enabled) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return i4 + i12;
    }

    @NotNull
    public String toString() {
        return "InputFieldStyle(textStyle=" + this.textStyle + ", placeholderText=" + this.placeholderText + ", placeholderTextId=" + this.placeholderTextId + ", placeholderStyle=" + this.placeholderStyle + ", labelText=" + this.labelText + ", labelTextId=" + this.labelTextId + ", labelTextStyle=" + this.labelTextStyle + ", borderStyle=" + this.borderStyle + ", leadingIconStyle=" + this.leadingIconStyle + ", trailingIconStyle=" + this.trailingIconStyle + ", cursorStyle=" + this.cursorStyle + ", keyboardOptions=" + this.keyboardOptions + ", containerColor=" + this.containerColor + ", enabled=" + this.enabled + ")";
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle) {
        this(textStyle, null, null, null, null, null, null, null, null, null, null, null, 0L, false, 16382, null);
        Intrinsics.echo(textStyle, "textStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText) {
        this(textStyle, placeholderText, null, null, null, null, null, null, null, null, null, null, 0L, false, 16380, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num) {
        this(textStyle, placeholderText, num, null, null, null, null, null, null, null, null, null, 0L, false, 16376, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle) {
        this(textStyle, placeholderText, num, placeholderStyle, null, null, null, null, null, null, null, null, 0L, false, 16368, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, null, null, null, null, null, null, null, 0L, false, 16352, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, num2, null, null, null, null, null, null, 0L, false, 16320, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2, @NotNull TextStyle labelTextStyle) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, num2, labelTextStyle, null, null, null, null, null, 0L, false, 16256, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2, @NotNull TextStyle labelTextStyle, @NotNull InputFieldBorderStyle borderStyle) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, num2, labelTextStyle, borderStyle, null, null, null, null, 0L, false, 16128, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
        Intrinsics.echo(borderStyle, "borderStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2, @NotNull TextStyle labelTextStyle, @NotNull InputFieldBorderStyle borderStyle, @Nullable ImageStyle imageStyle) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, num2, labelTextStyle, borderStyle, imageStyle, null, null, null, 0L, false, 15872, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
        Intrinsics.echo(borderStyle, "borderStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2, @NotNull TextStyle labelTextStyle, @NotNull InputFieldBorderStyle borderStyle, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, num2, labelTextStyle, borderStyle, imageStyle, imageStyle2, null, null, 0L, false, 15360, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
        Intrinsics.echo(borderStyle, "borderStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2, @NotNull TextStyle labelTextStyle, @NotNull InputFieldBorderStyle borderStyle, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2, @Nullable CursorStyle cursorStyle) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, num2, labelTextStyle, borderStyle, imageStyle, imageStyle2, cursorStyle, null, 0L, false, 14336, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
        Intrinsics.echo(borderStyle, "borderStyle");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2, @NotNull TextStyle labelTextStyle, @NotNull InputFieldBorderStyle borderStyle, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2, @Nullable CursorStyle cursorStyle, @NotNull aw keyboardOptions) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, num2, labelTextStyle, borderStyle, imageStyle, imageStyle2, cursorStyle, keyboardOptions, 0L, false, 12288, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
        Intrinsics.echo(borderStyle, "borderStyle");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2, @NotNull TextStyle labelTextStyle, @NotNull InputFieldBorderStyle borderStyle, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2, @Nullable CursorStyle cursorStyle, @NotNull aw keyboardOptions, long j5) {
        this(textStyle, placeholderText, num, placeholderStyle, labelText, num2, labelTextStyle, borderStyle, imageStyle, imageStyle2, cursorStyle, keyboardOptions, j5, false, 8192, null);
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
        Intrinsics.echo(borderStyle, "borderStyle");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
    }

    public InputFieldStyle(@NotNull TextStyle textStyle, @NotNull String placeholderText, @Nullable Integer num, @NotNull TextStyle placeholderStyle, @NotNull String labelText, @Nullable Integer num2, @NotNull TextStyle labelTextStyle, @NotNull InputFieldBorderStyle borderStyle, @Nullable ImageStyle imageStyle, @Nullable ImageStyle imageStyle2, @Nullable CursorStyle cursorStyle, @NotNull aw keyboardOptions, long j5, boolean z2) {
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(placeholderText, "placeholderText");
        Intrinsics.echo(placeholderStyle, "placeholderStyle");
        Intrinsics.echo(labelText, "labelText");
        Intrinsics.echo(labelTextStyle, "labelTextStyle");
        Intrinsics.echo(borderStyle, "borderStyle");
        Intrinsics.echo(keyboardOptions, "keyboardOptions");
        this.textStyle = textStyle;
        this.placeholderText = placeholderText;
        this.placeholderTextId = num;
        this.placeholderStyle = placeholderStyle;
        this.labelText = labelText;
        this.labelTextId = num2;
        this.labelTextStyle = labelTextStyle;
        this.borderStyle = borderStyle;
        this.leadingIconStyle = imageStyle;
        this.trailingIconStyle = imageStyle2;
        this.cursorStyle = cursorStyle;
        this.keyboardOptions = keyboardOptions;
        this.containerColor = j5;
        this.enabled = z2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public InputFieldStyle(TextStyle textStyle, String str, Integer num, TextStyle textStyle2, String str2, Integer num2, TextStyle textStyle3, InputFieldBorderStyle inputFieldBorderStyle, ImageStyle imageStyle, ImageStyle imageStyle2, CursorStyle cursorStyle, aw awVar, long j5, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(r3, r2, r5, r8, r4, r7, r10, r11, r9, r12, r6, r13, (i4 & 4096) != 0 ? 0L : j5, (i4 & 8192) != 0 ? true : z2);
        aw awVar2;
        TextStyle textStyle4 = (i4 & 1) != 0 ? new TextStyle(0, null, null, null, 0L, null, 0, null, null, null, 1023, null) : textStyle;
        String str3 = (i4 & 2) != 0 ? "" : str;
        Integer num3 = (i4 & 4) != 0 ? null : num;
        TextStyle textStyle5 = (i4 & 8) != 0 ? new TextStyle(0, null, null, null, 0L, null, 0, null, null, null, 1023, null) : textStyle2;
        String str4 = (i4 & 16) == 0 ? str2 : "";
        Integer num4 = (i4 & 32) != 0 ? null : num2;
        TextStyle textStyle6 = (i4 & 64) != 0 ? new TextStyle(0, null, null, null, 0L, null, 0, null, null, null, 1023, null) : textStyle3;
        InputFieldBorderStyle inputFieldBorderStyle2 = (i4 & 128) != 0 ? new InputFieldBorderStyle(null, null, 0L, 0L, 0L, 0L, 63, null) : inputFieldBorderStyle;
        ImageStyle imageStyle3 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : imageStyle;
        ImageStyle imageStyle4 = (i4 & 512) != 0 ? null : imageStyle2;
        CursorStyle cursorStyle2 = (i4 & Barcode.FORMAT_UPC_E) == 0 ? cursorStyle : null;
        if ((i4 & 2048) != 0) {
            aw awVar3 = aw.delta;
            awVar2 = aw.delta;
        } else {
            awVar2 = awVar;
        }
    }
}
