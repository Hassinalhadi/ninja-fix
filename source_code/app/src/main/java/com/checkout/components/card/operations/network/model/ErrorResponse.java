package com.checkout.components.card.operations.network.model;

import av.q;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0001\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ:\u0010\u000e\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0010\b\u0003\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\nR\"\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u0019\u0012\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001e\u0010\nR(\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\r¨\u0006$"}, d2 = {"Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "", "", "requestId", "errorType", "", "errorCodes", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Ljava/util/List;", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Lcom/checkout/components/card/operations/network/model/ErrorResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getRequestId", "getRequestId$annotations", "()V", "b", "getErrorType", "getErrorType$annotations", "c", "Ljava/util/List;", "getErrorCodes", "getErrorCodes$annotations", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ErrorResponse {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String requestId;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String errorType;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List errorCodes;

    public ErrorResponse(@Json(name = "request_id") @Nullable String str, @Json(name = "error_type") @Nullable String str2, @Json(name = "error_codes") @Nullable List<String> list) {
        this.requestId = str;
        this.errorType = str2;
        this.errorCodes = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorResponse copy$default(ErrorResponse errorResponse, String str, String str2, List list, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = errorResponse.requestId;
        }
        if ((i4 & 2) != 0) {
            str2 = errorResponse.errorType;
        }
        if ((i4 & 4) != 0) {
            list = errorResponse.errorCodes;
        }
        return errorResponse.copy(str, str2, list);
    }

    @Json(name = "error_codes")
    public static /* synthetic */ void getErrorCodes$annotations() {
    }

    @Json(name = "error_type")
    public static /* synthetic */ void getErrorType$annotations() {
    }

    @Json(name = "request_id")
    public static /* synthetic */ void getRequestId$annotations() {
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final List<String> component3() {
        return this.errorCodes;
    }

    @NotNull
    public final ErrorResponse copy(@Json(name = "request_id") @Nullable String requestId, @Json(name = "error_type") @Nullable String errorType, @Json(name = "error_codes") @Nullable List<String> errorCodes) {
        return new ErrorResponse(requestId, errorType, errorCodes);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ErrorResponse)) {
            return false;
        }
        ErrorResponse errorResponse = (ErrorResponse) other;
        return Intrinsics.areEqual(this.requestId, errorResponse.requestId) && Intrinsics.areEqual(this.errorType, errorResponse.errorType) && Intrinsics.areEqual(this.errorCodes, errorResponse.errorCodes);
    }

    @Nullable
    public final List<String> getErrorCodes() {
        return this.errorCodes;
    }

    @Nullable
    public final String getErrorType() {
        return this.errorType;
    }

    @Nullable
    public final String getRequestId() {
        return this.requestId;
    }

    public final int hashCode() {
        String str = this.requestId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.errorType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.errorCodes;
        return hashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        String str = this.requestId;
        String str2 = this.errorType;
        List list = this.errorCodes;
        StringBuilder india = q.india("ErrorResponse(requestId=", str, ", errorType=", str2, ", errorCodes=");
        india.append(list);
        india.append(")");
        return india.toString();
    }
}
