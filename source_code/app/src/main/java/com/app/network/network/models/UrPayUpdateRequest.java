package com.app.network.network.models;

import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/app/network/network/models/UrPayUpdateRequest;", "", "urPayAccountIban", "", "urPayIdNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrPayAccountIban", "()Ljava/lang/String;", "getUrPayIdNumber", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class UrPayUpdateRequest {

    @Nullable
    private final String urPayAccountIban;

    @Nullable
    private final String urPayIdNumber;

    public UrPayUpdateRequest(@Nullable String str, @Nullable String str2) {
        this.urPayAccountIban = str;
        this.urPayIdNumber = str2;
    }

    public static /* synthetic */ UrPayUpdateRequest copy$default(UrPayUpdateRequest urPayUpdateRequest, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = urPayUpdateRequest.urPayAccountIban;
        }
        if ((i4 & 2) != 0) {
            str2 = urPayUpdateRequest.urPayIdNumber;
        }
        return urPayUpdateRequest.copy(str, str2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getUrPayAccountIban() {
        return this.urPayAccountIban;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getUrPayIdNumber() {
        return this.urPayIdNumber;
    }

    @NotNull
    public final UrPayUpdateRequest copy(@Nullable String urPayAccountIban, @Nullable String urPayIdNumber) {
        return new UrPayUpdateRequest(urPayAccountIban, urPayIdNumber);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UrPayUpdateRequest)) {
            return false;
        }
        UrPayUpdateRequest urPayUpdateRequest = (UrPayUpdateRequest) other;
        return Intrinsics.areEqual(this.urPayAccountIban, urPayUpdateRequest.urPayAccountIban) && Intrinsics.areEqual(this.urPayIdNumber, urPayUpdateRequest.urPayIdNumber);
    }

    @Nullable
    public final String getUrPayAccountIban() {
        return this.urPayAccountIban;
    }

    @Nullable
    public final String getUrPayIdNumber() {
        return this.urPayIdNumber;
    }

    public int hashCode() {
        String str = this.urPayAccountIban;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.urPayIdNumber;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return q.golf("UrPayUpdateRequest(urPayAccountIban=", this.urPayAccountIban, ", urPayIdNumber=", this.urPayIdNumber, ")");
    }
}
