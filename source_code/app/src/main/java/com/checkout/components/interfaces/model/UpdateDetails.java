package com.checkout.components.interfaces.model;

import androidx.annotation.Keep;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/UpdateDetails;", "", "amount", "", "currency", "", "<init>", "(ILjava/lang/String;)V", "getAmount", "()I", "getCurrency", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class UpdateDetails {
    public static final int $stable = 0;
    private final int amount;

    @Nullable
    private final String currency;

    public UpdateDetails(int i4, @Nullable String str) {
        this.amount = i4;
        this.currency = str;
    }

    public static /* synthetic */ UpdateDetails copy$default(UpdateDetails updateDetails, int i4, String str, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i4 = updateDetails.amount;
        }
        if ((i5 & 2) != 0) {
            str = updateDetails.currency;
        }
        return updateDetails.copy(i4, str);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAmount() {
        return this.amount;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    @NotNull
    public final UpdateDetails copy(int amount, @Nullable String currency) {
        return new UpdateDetails(amount, currency);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateDetails)) {
            return false;
        }
        UpdateDetails updateDetails = (UpdateDetails) other;
        return this.amount == updateDetails.amount && Intrinsics.areEqual(this.currency, updateDetails.currency);
    }

    public final int getAmount() {
        return this.amount;
    }

    @Nullable
    public final String getCurrency() {
        return this.currency;
    }

    public int hashCode() {
        int i4 = this.amount * 31;
        String str = this.currency;
        return i4 + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return "UpdateDetails(amount=" + this.amount + ", currency=" + this.currency + ")";
    }

    public /* synthetic */ UpdateDetails(int i4, String str, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i4, (i5 & 2) != 0 ? null : str);
    }
}
