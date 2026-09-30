package com.checkout.components.ui.model.style.base;

import Q0.c;
import com.checkout.components.interfaces.uicustomisation.BorderRadius;
import com.checkout.components.ui.model.Shape;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÆ\u0003JE\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012¨\u0006$"}, d2 = {"Lcom/checkout/components/ui/model/style/base/InputFieldBorderStyle;", "", "shape", "Lcom/checkout/components/ui/model/Shape;", "borderRadius", "Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "focusedBorderColor", "", "unfocusedBorderColor", "disabledBorderColor", "errorBorderColor", "<init>", "(Lcom/checkout/components/ui/model/Shape;Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;JJJJ)V", "getShape", "()Lcom/checkout/components/ui/model/Shape;", "getBorderRadius", "()Lcom/checkout/components/interfaces/uicustomisation/BorderRadius;", "getFocusedBorderColor", "()J", "getUnfocusedBorderColor", "getDisabledBorderColor", "getErrorBorderColor", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class InputFieldBorderStyle {
    public static final int $stable = BorderRadius.$stable;

    @NotNull
    private final BorderRadius borderRadius;
    private final long disabledBorderColor;
    private final long errorBorderColor;
    private final long focusedBorderColor;

    @NotNull
    private final Shape shape;
    private final long unfocusedBorderColor;

    public InputFieldBorderStyle() {
        this(null, null, 0L, 0L, 0L, 0L, 63, null);
    }

    public static /* synthetic */ InputFieldBorderStyle copy$default(InputFieldBorderStyle inputFieldBorderStyle, Shape shape, BorderRadius borderRadius, long j5, long j6, long j7, long j10, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            shape = inputFieldBorderStyle.shape;
        }
        if ((i4 & 2) != 0) {
            borderRadius = inputFieldBorderStyle.borderRadius;
        }
        if ((i4 & 4) != 0) {
            j5 = inputFieldBorderStyle.focusedBorderColor;
        }
        if ((i4 & 8) != 0) {
            j6 = inputFieldBorderStyle.unfocusedBorderColor;
        }
        if ((i4 & 16) != 0) {
            j7 = inputFieldBorderStyle.disabledBorderColor;
        }
        if ((i4 & 32) != 0) {
            j10 = inputFieldBorderStyle.errorBorderColor;
        }
        long j11 = j10;
        long j12 = j7;
        long j13 = j6;
        return inputFieldBorderStyle.copy(shape, borderRadius, j5, j13, j12, j11);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Shape getShape() {
        return this.shape;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final BorderRadius getBorderRadius() {
        return this.borderRadius;
    }

    /* renamed from: component3, reason: from getter */
    public final long getFocusedBorderColor() {
        return this.focusedBorderColor;
    }

    /* renamed from: component4, reason: from getter */
    public final long getUnfocusedBorderColor() {
        return this.unfocusedBorderColor;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDisabledBorderColor() {
        return this.disabledBorderColor;
    }

    /* renamed from: component6, reason: from getter */
    public final long getErrorBorderColor() {
        return this.errorBorderColor;
    }

    @NotNull
    public final InputFieldBorderStyle copy(@NotNull Shape shape, @NotNull BorderRadius borderRadius, long focusedBorderColor, long unfocusedBorderColor, long disabledBorderColor, long errorBorderColor) {
        Intrinsics.echo(shape, "shape");
        Intrinsics.echo(borderRadius, "borderRadius");
        return new InputFieldBorderStyle(shape, borderRadius, focusedBorderColor, unfocusedBorderColor, disabledBorderColor, errorBorderColor);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputFieldBorderStyle)) {
            return false;
        }
        InputFieldBorderStyle inputFieldBorderStyle = (InputFieldBorderStyle) other;
        return this.shape == inputFieldBorderStyle.shape && Intrinsics.areEqual(this.borderRadius, inputFieldBorderStyle.borderRadius) && this.focusedBorderColor == inputFieldBorderStyle.focusedBorderColor && this.unfocusedBorderColor == inputFieldBorderStyle.unfocusedBorderColor && this.disabledBorderColor == inputFieldBorderStyle.disabledBorderColor && this.errorBorderColor == inputFieldBorderStyle.errorBorderColor;
    }

    @NotNull
    public final BorderRadius getBorderRadius() {
        return this.borderRadius;
    }

    public final long getDisabledBorderColor() {
        return this.disabledBorderColor;
    }

    public final long getErrorBorderColor() {
        return this.errorBorderColor;
    }

    public final long getFocusedBorderColor() {
        return this.focusedBorderColor;
    }

    @NotNull
    public final Shape getShape() {
        return this.shape;
    }

    public final long getUnfocusedBorderColor() {
        return this.unfocusedBorderColor;
    }

    public int hashCode() {
        int hashCode = (this.borderRadius.hashCode() + (this.shape.hashCode() * 31)) * 31;
        long j5 = this.focusedBorderColor;
        long j6 = this.unfocusedBorderColor;
        int i4 = (((int) (j6 ^ (j6 >>> 32))) + ((((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31)) * 31;
        long j7 = this.disabledBorderColor;
        long j10 = this.errorBorderColor;
        return ((int) ((j10 >>> 32) ^ j10)) + ((((int) (j7 ^ (j7 >>> 32))) + i4) * 31);
    }

    @NotNull
    public String toString() {
        Shape shape = this.shape;
        BorderRadius borderRadius = this.borderRadius;
        long j5 = this.focusedBorderColor;
        long j6 = this.unfocusedBorderColor;
        long j7 = this.disabledBorderColor;
        long j10 = this.errorBorderColor;
        StringBuilder sb2 = new StringBuilder("InputFieldBorderStyle(shape=");
        sb2.append(shape);
        sb2.append(", borderRadius=");
        sb2.append(borderRadius);
        sb2.append(", focusedBorderColor=");
        sb2.append(j5);
        c.amber(sb2, ", unfocusedBorderColor=", j6, ", disabledBorderColor=");
        sb2.append(j7);
        sb2.append(", errorBorderColor=");
        sb2.append(j10);
        sb2.append(")");
        return sb2.toString();
    }

    public InputFieldBorderStyle(@NotNull Shape shape, @NotNull BorderRadius borderRadius, long j5, long j6, long j7, long j10) {
        Intrinsics.echo(shape, "shape");
        Intrinsics.echo(borderRadius, "borderRadius");
        this.shape = shape;
        this.borderRadius = borderRadius;
        this.focusedBorderColor = j5;
        this.unfocusedBorderColor = j6;
        this.disabledBorderColor = j7;
        this.errorBorderColor = j10;
    }

    public /* synthetic */ InputFieldBorderStyle(Shape shape, BorderRadius borderRadius, long j5, long j6, long j7, long j10, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? Shape.RoundCorner : shape, (i4 & 2) != 0 ? new BorderRadius(4) : borderRadius, (i4 & 4) != 0 ? 4279790335L : j5, (i4 & 8) != 0 ? 4287927444L : j6, (i4 & 16) != 0 ? 4289769648L : j7, (i4 & 32) != 0 ? 4289538110L : j10);
    }
}
