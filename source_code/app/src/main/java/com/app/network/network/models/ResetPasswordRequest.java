package com.app.network.network.models;

import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/app/network/network/models/ResetPasswordRequest;", "", "last4MobileNumberDigits", "", "idNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLast4MobileNumberDigits", "()Ljava/lang/String;", "getIdNumber", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResetPasswordRequest {

    @Nullable
    private final String idNumber;

    @NotNull
    private final String last4MobileNumberDigits;

    public ResetPasswordRequest(@NotNull String last4MobileNumberDigits, @Nullable String str) {
        Intrinsics.echo(last4MobileNumberDigits, "last4MobileNumberDigits");
        this.last4MobileNumberDigits = last4MobileNumberDigits;
        this.idNumber = str;
    }

    public static /* synthetic */ ResetPasswordRequest copy$default(ResetPasswordRequest resetPasswordRequest, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = resetPasswordRequest.last4MobileNumberDigits;
        }
        if ((i4 & 2) != 0) {
            str2 = resetPasswordRequest.idNumber;
        }
        return resetPasswordRequest.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getLast4MobileNumberDigits() {
        return this.last4MobileNumberDigits;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final ResetPasswordRequest copy(@NotNull String last4MobileNumberDigits, @Nullable String idNumber) {
        Intrinsics.echo(last4MobileNumberDigits, "last4MobileNumberDigits");
        return new ResetPasswordRequest(last4MobileNumberDigits, idNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ResetPasswordRequest)) {
            return false;
        }
        ResetPasswordRequest resetPasswordRequest = (ResetPasswordRequest) other;
        return Intrinsics.areEqual(this.last4MobileNumberDigits, resetPasswordRequest.last4MobileNumberDigits) && Intrinsics.areEqual(this.idNumber, resetPasswordRequest.idNumber);
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @NotNull
    public final String getLast4MobileNumberDigits() {
        return this.last4MobileNumberDigits;
    }

    public int hashCode() {
        int hashCode = this.last4MobileNumberDigits.hashCode() * 31;
        String str = this.idNumber;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return q.golf("ResetPasswordRequest(last4MobileNumberDigits=", this.last4MobileNumberDigits, ", idNumber=", this.idNumber, ")");
    }
}
