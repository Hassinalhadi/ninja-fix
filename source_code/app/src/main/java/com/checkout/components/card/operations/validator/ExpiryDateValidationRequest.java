package com.checkout.components.card.operations.validator;

import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ$\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/card/operations/validator/ExpiryDateValidationRequest;", "", "", "month", "year", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/card/operations/validator/ExpiryDateValidationRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getMonth", "b", "getYear", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ExpiryDateValidationRequest {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String month;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String year;

    public ExpiryDateValidationRequest(@NotNull String month, @NotNull String year) {
        Intrinsics.echo(month, "month");
        Intrinsics.echo(year, "year");
        this.month = month;
        this.year = year;
    }

    public static /* synthetic */ ExpiryDateValidationRequest copy$default(ExpiryDateValidationRequest expiryDateValidationRequest, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = expiryDateValidationRequest.month;
        }
        if ((i4 & 2) != 0) {
            str2 = expiryDateValidationRequest.year;
        }
        return expiryDateValidationRequest.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getMonth() {
        return this.month;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getYear() {
        return this.year;
    }

    @NotNull
    public final ExpiryDateValidationRequest copy(@NotNull String month, @NotNull String year) {
        Intrinsics.echo(month, "month");
        Intrinsics.echo(year, "year");
        return new ExpiryDateValidationRequest(month, year);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExpiryDateValidationRequest)) {
            return false;
        }
        ExpiryDateValidationRequest expiryDateValidationRequest = (ExpiryDateValidationRequest) other;
        return Intrinsics.areEqual(this.month, expiryDateValidationRequest.month) && Intrinsics.areEqual(this.year, expiryDateValidationRequest.year);
    }

    @NotNull
    public final String getMonth() {
        return this.month;
    }

    @NotNull
    public final String getYear() {
        return this.year;
    }

    public final int hashCode() {
        return this.year.hashCode() + (this.month.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return q.golf("ExpiryDateValidationRequest(month=", this.month, ", year=", this.year, ")");
    }
}
