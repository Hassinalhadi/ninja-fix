package com.app.network.network.models.captian;

import ao.ad;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lcom/app/network/network/models/captian/ReturnAssetRequest;", "", "returnCode", "", "<init>", "(Ljava/lang/String;)V", "getReturnCode", "()Ljava/lang/String;", "component1", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ReturnAssetRequest {

    @NotNull
    private final String returnCode;

    public ReturnAssetRequest(@NotNull String returnCode) {
        Intrinsics.echo(returnCode, "returnCode");
        this.returnCode = returnCode;
    }

    public static /* synthetic */ ReturnAssetRequest copy$default(ReturnAssetRequest returnAssetRequest, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = returnAssetRequest.returnCode;
        }
        return returnAssetRequest.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getReturnCode() {
        return this.returnCode;
    }

    @NotNull
    public final ReturnAssetRequest copy(@NotNull String returnCode) {
        Intrinsics.echo(returnCode, "returnCode");
        return new ReturnAssetRequest(returnCode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ReturnAssetRequest) && Intrinsics.areEqual(this.returnCode, ((ReturnAssetRequest) other).returnCode);
    }

    @NotNull
    public final String getReturnCode() {
        return this.returnCode;
    }

    public int hashCode() {
        return this.returnCode.hashCode();
    }

    @NotNull
    public String toString() {
        return ad.gray("ReturnAssetRequest(returnCode=", this.returnCode, ")");
    }
}
