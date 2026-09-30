package com.checkout.components.ui.model.style.base;

import com.checkout.components.ui.model.Padding;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, d2 = {"Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "", Constants.KEY_COLOR, "", "width", "", "height", "padding", "Lcom/checkout/components/ui/model/Padding;", "<init>", "(JLjava/lang/Integer;Ljava/lang/Integer;Lcom/checkout/components/ui/model/Padding;)V", "getColor", "()J", "getWidth", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getHeight", "getPadding", "()Lcom/checkout/components/ui/model/Padding;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "(JLjava/lang/Integer;Ljava/lang/Integer;Lcom/checkout/components/ui/model/Padding;)Lcom/checkout/components/ui/model/style/base/ContainerStyle;", "equals", "", "other", "hashCode", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ContainerStyle {
    public static final int $stable = 0;
    private final long color;

    @Nullable
    private final Integer height;

    @Nullable
    private final Padding padding;

    @Nullable
    private final Integer width;

    public ContainerStyle() {
        this(0L, null, null, null, 15, null);
    }

    public static /* synthetic */ ContainerStyle copy$default(ContainerStyle containerStyle, long j5, Integer num, Integer num2, Padding padding, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            j5 = containerStyle.color;
        }
        long j6 = j5;
        if ((i4 & 2) != 0) {
            num = containerStyle.width;
        }
        Integer num3 = num;
        if ((i4 & 4) != 0) {
            num2 = containerStyle.height;
        }
        Integer num4 = num2;
        if ((i4 & 8) != 0) {
            padding = containerStyle.padding;
        }
        return containerStyle.copy(j6, num3, num4, padding);
    }

    /* renamed from: component1, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Padding getPadding() {
        return this.padding;
    }

    @NotNull
    public final ContainerStyle copy(long color, @Nullable Integer width, @Nullable Integer height, @Nullable Padding padding) {
        return new ContainerStyle(color, width, height, padding);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContainerStyle)) {
            return false;
        }
        ContainerStyle containerStyle = (ContainerStyle) other;
        return this.color == containerStyle.color && Intrinsics.areEqual(this.width, containerStyle.width) && Intrinsics.areEqual(this.height, containerStyle.height) && Intrinsics.areEqual(this.padding, containerStyle.padding);
    }

    public final long getColor() {
        return this.color;
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final Padding getPadding() {
        return this.padding;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        long j5 = this.color;
        int i4 = ((int) (j5 ^ (j5 >>> 32))) * 31;
        Integer num = this.width;
        int i5 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i10 = (i4 + hashCode) * 31;
        Integer num2 = this.height;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        Padding padding = this.padding;
        if (padding != null) {
            i5 = padding.hashCode();
        }
        return i11 + i5;
    }

    @NotNull
    public String toString() {
        return "ContainerStyle(color=" + this.color + ", width=" + this.width + ", height=" + this.height + ", padding=" + this.padding + ")";
    }

    public ContainerStyle(long j5, @Nullable Integer num, @Nullable Integer num2, @Nullable Padding padding) {
        this.color = j5;
        this.width = num;
        this.height = num2;
        this.padding = padding;
    }

    public /* synthetic */ ContainerStyle(long j5, Integer num, Integer num2, Padding padding, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0L : j5, (i4 & 2) != 0 ? null : num, (i4 & 4) != 0 ? null : num2, (i4 & 8) != 0 ? null : padding);
    }
}
