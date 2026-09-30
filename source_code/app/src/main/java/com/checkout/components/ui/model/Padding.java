package com.checkout.components.ui.model;

import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/ui/model/Padding;", "", "top", "", "bottom", "start", "end", "<init>", "(IIII)V", "getTop", "()I", "getBottom", "getStart", "getEnd", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "", "ui_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Padding {
    public static final int $stable = 0;
    private final int bottom;
    private final int end;
    private final int start;
    private final int top;

    public Padding() {
        this(0, 0, 0, 0, 15, null);
    }

    public static /* synthetic */ Padding copy$default(Padding padding, int i4, int i5, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i4 = padding.top;
        }
        if ((i12 & 2) != 0) {
            i5 = padding.bottom;
        }
        if ((i12 & 4) != 0) {
            i10 = padding.start;
        }
        if ((i12 & 8) != 0) {
            i11 = padding.end;
        }
        return padding.copy(i4, i5, i10, i11);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    /* renamed from: component2, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    /* renamed from: component3, reason: from getter */
    public final int getStart() {
        return this.start;
    }

    /* renamed from: component4, reason: from getter */
    public final int getEnd() {
        return this.end;
    }

    @NotNull
    public final Padding copy(int top, int bottom, int start, int end) {
        return new Padding(top, bottom, start, end);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Padding)) {
            return false;
        }
        Padding padding = (Padding) other;
        return this.top == padding.top && this.bottom == padding.bottom && this.start == padding.start && this.end == padding.end;
    }

    public final int getBottom() {
        return this.bottom;
    }

    public final int getEnd() {
        return this.end;
    }

    public final int getStart() {
        return this.start;
    }

    public final int getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.end + ((this.start + ((this.bottom + (this.top * 31)) * 31)) * 31);
    }

    @NotNull
    public String toString() {
        int i4 = this.top;
        int i5 = this.bottom;
        int i10 = this.start;
        int i11 = this.end;
        StringBuilder hotel = q.hotel(i4, i5, "Padding(top=", ", bottom=", ", start=");
        hotel.append(i10);
        hotel.append(", end=");
        hotel.append(i11);
        hotel.append(")");
        return hotel.toString();
    }

    public Padding(int i4, int i5, int i10, int i11) {
        this.top = i4;
        this.bottom = i5;
        this.start = i10;
        this.end = i11;
    }

    public /* synthetic */ Padding(int i4, int i5, int i10, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this((i12 & 1) != 0 ? 0 : i4, (i12 & 2) != 0 ? 0 : i5, (i12 & 4) != 0 ? 0 : i10, (i12 & 8) != 0 ? 0 : i11);
    }
}
