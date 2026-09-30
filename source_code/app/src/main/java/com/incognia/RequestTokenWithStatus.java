package com.incognia;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/incognia/RequestTokenWithStatus;", "", "token", "", "status", "Lcom/incognia/RequestTokenStatus;", "(Ljava/lang/String;Lcom/incognia/RequestTokenStatus;)V", "getStatus", "()Lcom/incognia/RequestTokenStatus;", "getToken", "()Ljava/lang/String;", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "incognia_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RequestTokenWithStatus {
    private final RequestTokenStatus status;
    private final String token;

    public RequestTokenWithStatus(String str, RequestTokenStatus requestTokenStatus) {
        this.token = str;
        this.status = requestTokenStatus;
    }

    public static /* synthetic */ RequestTokenWithStatus copy$default(RequestTokenWithStatus requestTokenWithStatus, String str, RequestTokenStatus requestTokenStatus, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = requestTokenWithStatus.token;
        }
        if ((i4 & 2) != 0) {
            requestTokenStatus = requestTokenWithStatus.status;
        }
        return requestTokenWithStatus.copy(str, requestTokenStatus);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final RequestTokenStatus getStatus() {
        return this.status;
    }

    public final RequestTokenWithStatus copy(String token, RequestTokenStatus status) {
        return new RequestTokenWithStatus(token, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestTokenWithStatus)) {
            return false;
        }
        RequestTokenWithStatus requestTokenWithStatus = (RequestTokenWithStatus) other;
        return Intrinsics.areEqual(this.token, requestTokenWithStatus.token) && this.status == requestTokenWithStatus.status;
    }

    public final RequestTokenStatus getStatus() {
        return this.status;
    }

    public final String getToken() {
        return this.token;
    }

    public int hashCode() {
        return this.status.hashCode() + (this.token.hashCode() * 31);
    }

    public String toString() {
        return "RequestTokenWithStatus(token=" + this.token + ", status=" + this.status + ')';
    }
}
