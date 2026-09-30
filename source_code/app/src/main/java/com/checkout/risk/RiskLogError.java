package com.checkout.risk;

import androidx.appcompat.widget.P0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JF\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/checkout/risk/RiskLogError;", "", "reason", "", com.clevertap.android.sdk.Constants.KEY_MESSAGE, "status", "", com.clevertap.android.sdk.Constants.KEY_TYPE, "innerExceptionType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getInnerExceptionType", "()Ljava/lang/String;", "getMessage", "getReason", "getStatus", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "component1", "component2", "component3", "component4", "component5", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/risk/RiskLogError;", "equals", "", "other", "hashCode", "toString", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RiskLogError {

    @Nullable
    private final String innerExceptionType;

    @NotNull
    private final String message;

    @NotNull
    private final String reason;

    @Nullable
    private final Integer status;

    @Nullable
    private final String type;

    public RiskLogError(@NotNull String reason, @NotNull String message, @Nullable Integer num, @Nullable String str, @Nullable String str2) {
        Intrinsics.echo(reason, "reason");
        Intrinsics.echo(message, "message");
        this.reason = reason;
        this.message = message;
        this.status = num;
        this.type = str;
        this.innerExceptionType = str2;
    }

    public static /* synthetic */ RiskLogError copy$default(RiskLogError riskLogError, String str, String str2, Integer num, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = riskLogError.reason;
        }
        if ((i4 & 2) != 0) {
            str2 = riskLogError.message;
        }
        if ((i4 & 4) != 0) {
            num = riskLogError.status;
        }
        if ((i4 & 8) != 0) {
            str3 = riskLogError.type;
        }
        if ((i4 & 16) != 0) {
            str4 = riskLogError.innerExceptionType;
        }
        String str5 = str4;
        Integer num2 = num;
        return riskLogError.copy(str, str2, num2, str3, str5);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getInnerExceptionType() {
        return this.innerExceptionType;
    }

    @NotNull
    public final RiskLogError copy(@NotNull String reason, @NotNull String message, @Nullable Integer status, @Nullable String type, @Nullable String innerExceptionType) {
        Intrinsics.echo(reason, "reason");
        Intrinsics.echo(message, "message");
        return new RiskLogError(reason, message, status, type, innerExceptionType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RiskLogError)) {
            return false;
        }
        RiskLogError riskLogError = (RiskLogError) other;
        return Intrinsics.areEqual(this.reason, riskLogError.reason) && Intrinsics.areEqual(this.message, riskLogError.message) && Intrinsics.areEqual(this.status, riskLogError.status) && Intrinsics.areEqual(this.type, riskLogError.type) && Intrinsics.areEqual(this.innerExceptionType, riskLogError.innerExceptionType);
    }

    @Nullable
    public final String getInnerExceptionType() {
        return this.innerExceptionType;
    }

    @NotNull
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final Integer getStatus() {
        return this.status;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int sierra = AbstractC2327c.sierra(this.reason.hashCode() * 31, 31, this.message);
        Integer num = this.status;
        int i4 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = (sierra + hashCode) * 31;
        String str = this.type;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        String str2 = this.innerExceptionType;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i10 + i4;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("RiskLogError(reason=");
        sb2.append(this.reason);
        sb2.append(", message=");
        sb2.append(this.message);
        sb2.append(", status=");
        sb2.append(this.status);
        sb2.append(", type=");
        sb2.append(this.type);
        sb2.append(", innerExceptionType=");
        return P0.fuchsia(sb2, this.innerExceptionType, ')');
    }

    public /* synthetic */ RiskLogError(String str, String str2, Integer num, String str3, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, num, str3, (i4 & 16) != 0 ? null : str4);
    }
}
