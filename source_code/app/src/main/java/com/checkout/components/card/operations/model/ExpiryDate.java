package com.checkout.components.card.operations.model;

import androidx.appcompat.widget.P0;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/card/operations/model/ExpiryDate;", "", "", "month", "year", "<init>", "(II)V", "component1", "()I", "component2", Constants.COPY_TYPE, "(II)Lcom/checkout/components/card/operations/model/ExpiryDate;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getMonth", "b", "getYear", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExpiryDate {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int month;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int year;

    public ExpiryDate(int i4, int i5) {
        this.month = i4;
        this.year = i5;
    }

    public static ExpiryDate copy$default(ExpiryDate expiryDate, int i4, int i5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i4 = expiryDate.month;
        }
        if ((i10 & 2) != 0) {
            i5 = expiryDate.year;
        }
        expiryDate.getClass();
        return new ExpiryDate(i4, i5);
    }

    /* renamed from: component1, reason: from getter */
    public final int getMonth() {
        return this.month;
    }

    /* renamed from: component2, reason: from getter */
    public final int getYear() {
        return this.year;
    }

    @NotNull
    public final ExpiryDate copy(int month, int year) {
        return new ExpiryDate(month, year);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiryDate)) {
            return false;
        }
        ExpiryDate expiryDate = (ExpiryDate) other;
        return this.month == expiryDate.month && this.year == expiryDate.year;
    }

    public final int getMonth() {
        return this.month;
    }

    public final int getYear() {
        return this.year;
    }

    public final int hashCode() {
        return this.year + (this.month * 31);
    }

    @NotNull
    public final String toString() {
        return P0.azure(this.month, this.year, "ExpiryDate(month=", ", year=", ")");
    }
}
