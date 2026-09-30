package com.app.network.network.models;

import av.q;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/app/network/network/models/Payment;", "", "environment", "", "publicKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getEnvironment", "()Ljava/lang/String;", "getPublicKey", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Payment {

    @NotNull
    private final String environment;

    @NotNull
    private final String publicKey;

    public Payment(@NotNull String environment, @NotNull String publicKey) {
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(publicKey, "publicKey");
        this.environment = environment;
        this.publicKey = publicKey;
    }

    public static /* synthetic */ Payment copy$default(Payment payment, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = payment.environment;
        }
        if ((i4 & 2) != 0) {
            str2 = payment.publicKey;
        }
        return payment.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getEnvironment() {
        return this.environment;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPublicKey() {
        return this.publicKey;
    }

    @NotNull
    public final Payment copy(@NotNull String environment, @NotNull String publicKey) {
        Intrinsics.echo(environment, "environment");
        Intrinsics.echo(publicKey, "publicKey");
        return new Payment(environment, publicKey);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Payment)) {
            return false;
        }
        Payment payment = (Payment) other;
        return Intrinsics.areEqual(this.environment, payment.environment) && Intrinsics.areEqual(this.publicKey, payment.publicKey);
    }

    @NotNull
    public final String getEnvironment() {
        return this.environment;
    }

    @NotNull
    public final String getPublicKey() {
        return this.publicKey;
    }

    public int hashCode() {
        return this.publicKey.hashCode() + (this.environment.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return q.golf("Payment(environment=", this.environment, ", publicKey=", this.publicKey, ")");
    }
}
