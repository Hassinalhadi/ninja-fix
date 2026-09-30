package com.app.network.network.models;

import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/app/network/network/models/WalletTopUpStatus;", "", "state", "", "failureReason", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getState", "()Ljava/lang/String;", "getFailureReason", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class WalletTopUpStatus {

    @Nullable
    private final String failureReason;

    @NotNull
    private final String state;

    public WalletTopUpStatus(@NotNull String state, @Nullable String str) {
        Intrinsics.echo(state, "state");
        this.state = state;
        this.failureReason = str;
    }

    public static /* synthetic */ WalletTopUpStatus copy$default(WalletTopUpStatus walletTopUpStatus, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = walletTopUpStatus.state;
        }
        if ((i4 & 2) != 0) {
            str2 = walletTopUpStatus.failureReason;
        }
        return walletTopUpStatus.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getState() {
        return this.state;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getFailureReason() {
        return this.failureReason;
    }

    @NotNull
    public final WalletTopUpStatus copy(@NotNull String state, @Nullable String failureReason) {
        Intrinsics.echo(state, "state");
        return new WalletTopUpStatus(state, failureReason);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WalletTopUpStatus)) {
            return false;
        }
        WalletTopUpStatus walletTopUpStatus = (WalletTopUpStatus) other;
        return Intrinsics.areEqual(this.state, walletTopUpStatus.state) && Intrinsics.areEqual(this.failureReason, walletTopUpStatus.failureReason);
    }

    @Nullable
    public final String getFailureReason() {
        return this.failureReason;
    }

    @NotNull
    public final String getState() {
        return this.state;
    }

    public int hashCode() {
        int hashCode = this.state.hashCode() * 31;
        String str = this.failureReason;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return q.golf("WalletTopUpStatus(state=", this.state, ", failureReason=", this.failureReason, ")");
    }

    public /* synthetic */ WalletTopUpStatus(String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2);
    }
}
