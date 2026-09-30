package com.checkout.risk;

import P8.c;
import androidx.appcompat.widget.P0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000f"}, d2 = {"Lcom/checkout/risk/PersistFingerprintDataResponse;", "", "deviceSessionId", "", "(Ljava/lang/String;)V", "getDeviceSessionId", "()Ljava/lang/String;", "component1", com.clevertap.android.sdk.Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PersistFingerprintDataResponse {

    @c("device_session_id")
    @NotNull
    private final String deviceSessionId;

    public PersistFingerprintDataResponse(@NotNull String deviceSessionId) {
        Intrinsics.echo(deviceSessionId, "deviceSessionId");
        this.deviceSessionId = deviceSessionId;
    }

    public static /* synthetic */ PersistFingerprintDataResponse copy$default(PersistFingerprintDataResponse persistFingerprintDataResponse, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = persistFingerprintDataResponse.deviceSessionId;
        }
        return persistFingerprintDataResponse.copy(str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getDeviceSessionId() {
        return this.deviceSessionId;
    }

    @NotNull
    public final PersistFingerprintDataResponse copy(@NotNull String deviceSessionId) {
        Intrinsics.echo(deviceSessionId, "deviceSessionId");
        return new PersistFingerprintDataResponse(deviceSessionId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PersistFingerprintDataResponse) && Intrinsics.areEqual(this.deviceSessionId, ((PersistFingerprintDataResponse) other).deviceSessionId);
    }

    @NotNull
    public final String getDeviceSessionId() {
        return this.deviceSessionId;
    }

    public int hashCode() {
        return this.deviceSessionId.hashCode();
    }

    @NotNull
    public String toString() {
        return P0.fuchsia(new StringBuilder("PersistFingerprintDataResponse(deviceSessionId="), this.deviceSessionId, ')');
    }
}
