package com.checkout.components.ui.model.style.base;

import Q0.c;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.interfaces.uicustomisation.font.FontFamily;
import com.checkout.components.ui.model.Shape;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bc\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\tHÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003J\t\u0010'\u001a\u00020\rHÆ\u0003J\t\u0010(\u001a\u00020\u000fHÆ\u0003Jc\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fHÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020.HÖ\u0001J\t\u0010/\u001a\u000200HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u00061"}, d2 = {"Lcom/checkout/components/ui/model/style/base/ButtonStyle;", "", "containerColor", "", "disabledContainerColor", "successContainerColor", "contentColor", "disabledContentColor", "shape", "Lcom/checkout/components/ui/model/Shape;", "borderRadius", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "textStyle", "Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "containerStyle", "Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "<init>", "(JJJJJLcom/checkout/components/ui/model/Shape;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;Lcom/checkout/components/ui/model/style/base/TextLabelStyle;Lcom/checkout/components/ui/model/style/base/ContainerStyle;)V", "getContainerColor", "()J", "getDisabledContainerColor", "getSuccessContainerColor", "getContentColor", "getDisabledContentColor", "getShape", "()Lcom/checkout/components/ui/model/Shape;", "getBorderRadius", "()Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "getTextStyle", "()Lcom/checkout/components/ui/model/style/base/TextLabelStyle;", "getContainerStyle", "()Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonStyle {
    public static final int $stable = FontFamily.$stable | BorderRadius.$stable;

    @NotNull
    private final BorderRadius borderRadius;
    private final long containerColor;

    @NotNull
    private final ContainerStyle containerStyle;
    private final long contentColor;
    private final long disabledContainerColor;
    private final long disabledContentColor;

    @NotNull
    private final Shape shape;
    private final long successContainerColor;

    @NotNull
    private final TextLabelStyle textStyle;

    public ButtonStyle() {
        this(0L, 0L, 0L, 0L, 0L, null, null, null, null, 511, null);
    }

    /* renamed from: component1, reason: from getter */
    public final long getContainerColor() {
        return this.containerColor;
    }

    /* renamed from: component2, reason: from getter */
    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    /* renamed from: component3, reason: from getter */
    public final long getSuccessContainerColor() {
        return this.successContainerColor;
    }

    /* renamed from: component4, reason: from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDisabledContentColor() {
        return this.disabledContentColor;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final BorderRadius getBorderRadius() {
        return this.borderRadius;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final TextLabelStyle getTextStyle() {
        return this.textStyle;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final ContainerStyle getContainerStyle() {
        return this.containerStyle;
    }

    @NotNull
    public final ButtonStyle copy(long containerColor, long disabledContainerColor, long successContainerColor, long contentColor, long disabledContentColor, @NotNull Shape shape, @NotNull BorderRadius borderRadius, @NotNull TextLabelStyle textStyle, @NotNull ContainerStyle containerStyle) {
        Intrinsics.echo(shape, "shape");
        Intrinsics.echo(borderRadius, "borderRadius");
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(containerStyle, "containerStyle");
        return new ButtonStyle(containerColor, disabledContainerColor, successContainerColor, contentColor, disabledContentColor, shape, borderRadius, textStyle, containerStyle);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonStyle)) {
            return false;
        }
        ButtonStyle buttonStyle = (ButtonStyle) other;
        return this.containerColor == buttonStyle.containerColor && this.disabledContainerColor == buttonStyle.disabledContainerColor && this.successContainerColor == buttonStyle.successContainerColor && this.contentColor == buttonStyle.contentColor && this.disabledContentColor == buttonStyle.disabledContentColor && this.shape == buttonStyle.shape && Intrinsics.areEqual(this.borderRadius, buttonStyle.borderRadius) && Intrinsics.areEqual(this.textStyle, buttonStyle.textStyle) && Intrinsics.areEqual(this.containerStyle, buttonStyle.containerStyle);
    }

    @NotNull
    public final BorderRadius getBorderRadius() {
        return this.borderRadius;
    }

    public final long getContainerColor() {
        return this.containerColor;
    }

    @NotNull
    public final ContainerStyle getContainerStyle() {
        return this.containerStyle;
    }

    public final long getContentColor() {
        return this.contentColor;
    }

    public final long getDisabledContainerColor() {
        return this.disabledContainerColor;
    }

    public final long getDisabledContentColor() {
        return this.disabledContentColor;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    public final long getSuccessContainerColor() {
        return this.successContainerColor;
    }

    @NotNull
    public final TextLabelStyle getTextStyle() {
        return this.textStyle;
    }

    public int hashCode() {
        long j5 = this.containerColor;
        long j6 = this.disabledContainerColor;
        int i4 = (((int) (j6 ^ (j6 >>> 32))) + (((int) (j5 ^ (j5 >>> 32))) * 31)) * 31;
        long j7 = this.successContainerColor;
        int i5 = (((int) (j7 ^ (j7 >>> 32))) + i4) * 31;
        long j10 = this.contentColor;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) + i5) * 31;
        long j11 = this.disabledContentColor;
        return this.containerStyle.hashCode() + ((this.textStyle.hashCode() + ((this.borderRadius.hashCode() + ((this.shape.hashCode() + ((((int) (j11 ^ (j11 >>> 32))) + i10) * 31)) * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        long j5 = this.containerColor;
        long j6 = this.disabledContainerColor;
        long j7 = this.successContainerColor;
        long j10 = this.contentColor;
        long j11 = this.disabledContentColor;
        Shape shape = this.shape;
        BorderRadius borderRadius = this.borderRadius;
        TextLabelStyle textLabelStyle = this.textStyle;
        ContainerStyle containerStyle = this.containerStyle;
        StringBuilder uniform = c.uniform("ButtonStyle(containerColor=", j5, ", disabledContainerColor=");
        uniform.append(j6);
        c.amber(uniform, ", successContainerColor=", j7, ", contentColor=");
        uniform.append(j10);
        c.amber(uniform, ", disabledContentColor=", j11, ", shape=");
        uniform.append(shape);
        uniform.append(", borderRadius=");
        uniform.append(borderRadius);
        uniform.append(", textStyle=");
        uniform.append(textLabelStyle);
        uniform.append(", containerStyle=");
        uniform.append(containerStyle);
        uniform.append(")");
        return uniform.toString();
    }

    public ButtonStyle(long j5) {
        this(j5, 0L, 0L, 0L, 0L, null, null, null, null, 510, null);
    }

    public ButtonStyle(long j5, long j6) {
        this(j5, j6, 0L, 0L, 0L, null, null, null, null, 508, null);
    }

    public ButtonStyle(long j5, long j6, long j7) {
        this(j5, j6, j7, 0L, 0L, null, null, null, null, HttpConstants.HTTP_GATEWAY_TIMEOUT, null);
    }

    public ButtonStyle(long j5, long j6, long j7, long j10) {
        this(j5, j6, j7, j10, 0L, null, null, null, null, 496, null);
    }

    public ButtonStyle(long j5, long j6, long j7, long j10, long j11) {
        this(j5, j6, j7, j10, j11, null, null, null, null, 480, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonStyle(long j5, long j6, long j7, long j10, long j11, @NotNull Shape shape) {
        this(j5, j6, j7, j10, j11, shape, null, null, null, 448, null);
        Intrinsics.echo(shape, "shape");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonStyle(long j5, long j6, long j7, long j10, long j11, @NotNull Shape shape, @NotNull BorderRadius borderRadius) {
        this(j5, j6, j7, j10, j11, shape, borderRadius, null, null, 384, null);
        Intrinsics.echo(shape, "shape");
        Intrinsics.echo(borderRadius, "borderRadius");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonStyle(long j5, long j6, long j7, long j10, long j11, @NotNull Shape shape, @NotNull BorderRadius borderRadius, @NotNull TextLabelStyle textStyle) {
        this(j5, j6, j7, j10, j11, shape, borderRadius, textStyle, null, Barcode.FORMAT_QR_CODE, null);
        Intrinsics.echo(shape, "shape");
        Intrinsics.echo(borderRadius, "borderRadius");
        Intrinsics.echo(textStyle, "textStyle");
    }

    public ButtonStyle(long j5, long j6, long j7, long j10, long j11, @NotNull Shape shape, @NotNull BorderRadius borderRadius, @NotNull TextLabelStyle textStyle, @NotNull ContainerStyle containerStyle) {
        Intrinsics.echo(shape, "shape");
        Intrinsics.echo(borderRadius, "borderRadius");
        Intrinsics.echo(textStyle, "textStyle");
        Intrinsics.echo(containerStyle, "containerStyle");
        this.containerColor = j5;
        this.disabledContainerColor = j6;
        this.successContainerColor = j7;
        this.contentColor = j10;
        this.disabledContentColor = j11;
        this.shape = shape;
        this.borderRadius = borderRadius;
        this.textStyle = textStyle;
        this.containerStyle = containerStyle;
    }

    public /* synthetic */ ButtonStyle(long j5, long j6, long j7, long j10, long j11, Shape shape, BorderRadius borderRadius, TextLabelStyle textLabelStyle, ContainerStyle containerStyle, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j5, (i4 & 2) == 0 ? j6 : 0L, (i4 & 4) != 0 ? 4278190080L : j7, (i4 & 8) != 0 ? 4278190080L : j10, (i4 & 16) == 0 ? j11 : 4278190080L, (i4 & 32) != 0 ? Shape.Rectangle : shape, (i4 & 64) != 0 ? new BorderRadius(0, 0, 0, 0, 15, null) : borderRadius, (i4 & 128) != 0 ? new TextLabelStyle(null, null, null, false, 15, null) : textLabelStyle, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? new ContainerStyle(0L, null, null, null, 15, null) : containerStyle);
    }
}
