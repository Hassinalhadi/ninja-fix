package com.checkout.components.kmp.rememberme.shared.model.customization;

import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\f¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/kmp/rememberme/shared/model/customization/BorderRadius;", "", "bottomStart", "", "bottomEnd", "topStart", "topEnd", "<init>", "(IIII)V", "all", "(I)V", "getBottomStart", "()I", "getBottomEnd", "getTopStart", "getTopEnd", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BorderRadius {
    public static final int $stable = 0;
    private final int bottomEnd;
    private final int bottomStart;
    private final int topEnd;
    private final int topStart;

    public BorderRadius() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ BorderRadius copy$default(BorderRadius borderRadius, int i4, int i5, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i4 = borderRadius.bottomStart;
        }
        if ((i12 & 2) != 0) {
            i5 = borderRadius.bottomEnd;
        }
        if ((i12 & 4) != 0) {
            i10 = borderRadius.topStart;
        }
        if ((i12 & 8) != 0) {
            i11 = borderRadius.topEnd;
        }
        return borderRadius.copy(i4, i5, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getBottomStart() {
        return this.bottomStart;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBottomEnd() {
        return this.bottomEnd;
    }

    /* renamed from: component3, reason: from getter */
    public final int getTopStart() {
        return this.topStart;
    }

    /* renamed from: component4, reason: from getter */
    public final int getTopEnd() {
        return this.topEnd;
    }

    @NotNull
    public final BorderRadius copy(int bottomStart, int bottomEnd, int topStart, int topEnd) {
        return new BorderRadius(bottomStart, bottomEnd, topStart, topEnd);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BorderRadius)) {
            return false;
        }
        BorderRadius borderRadius = (BorderRadius) other;
        return this.bottomStart == borderRadius.bottomStart && this.bottomEnd == borderRadius.bottomEnd && this.topStart == borderRadius.topStart && this.topEnd == borderRadius.topEnd;
    }

    public final int getBottomEnd() {
        return this.bottomEnd;
    }

    public final int getBottomStart() {
        return this.bottomStart;
    }

    public final int getTopEnd() {
        return this.topEnd;
    }

    public final int getTopStart() {
        return this.topStart;
    }

    public int hashCode() {
        return (((((this.bottomStart * 31) + this.bottomEnd) * 31) + this.topStart) * 31) + this.topEnd;
    }

    @NotNull
    public String toString() {
        int i4 = this.bottomStart;
        int i5 = this.bottomEnd;
        int i10 = this.topStart;
        int i11 = this.topEnd;
        StringBuilder hotel = q.hotel(i4, i5, "BorderRadius(bottomStart=", ", bottomEnd=", ", topStart=");
        hotel.append(i10);
        hotel.append(", topEnd=");
        hotel.append(i11);
        hotel.append(")");
        return hotel.toString();
    }

    public BorderRadius(int i4, int i5, int i10, int i11) {
        this.bottomStart = i4;
        this.bottomEnd = i5;
        this.topStart = i10;
        this.topEnd = i11;
    }

    public /* synthetic */ BorderRadius(int i4, int i5, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i4, (i12 & 2) != 0 ? 0 : i5, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }

    public BorderRadius(int i4) {
        this(i4, i4, i4, i4);
    }
}
