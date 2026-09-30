package com.checkout.components.interfaces.model;

import androidx.annotation.Keep;
import av.q;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B!\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\tJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/checkout/components/interfaces/model/PaymentSessionResponse;", "", Constants.KEY_ID, "", "secret", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "paymentSessionToken", "paymentSessionSecret", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSecret", "component1", "component2", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class PaymentSessionResponse {
    public static final int $stable = 0;

    @NotNull
    private final String id;

    @NotNull
    private final String secret;

    public PaymentSessionResponse(@NotNull String id2, @NotNull String secret) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(secret, "secret");
        this.id = id2;
        this.secret = secret;
    }

    public static /* synthetic */ PaymentSessionResponse copy$default(PaymentSessionResponse paymentSessionResponse, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = paymentSessionResponse.id;
        }
        if ((i4 & 2) != 0) {
            str2 = paymentSessionResponse.secret;
        }
        return paymentSessionResponse.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getSecret() {
        return this.secret;
    }

    @NotNull
    public final PaymentSessionResponse copy(@NotNull String id2, @NotNull String secret) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(secret, "secret");
        return new PaymentSessionResponse(id2, secret);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSessionResponse)) {
            return false;
        }
        PaymentSessionResponse paymentSessionResponse = (PaymentSessionResponse) other;
        return Intrinsics.areEqual(this.id, paymentSessionResponse.id) && Intrinsics.areEqual(this.secret, paymentSessionResponse.secret);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getSecret() {
        return this.secret;
    }

    public int hashCode() {
        return this.secret.hashCode() + (this.id.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return q.golf("PaymentSessionResponse(id=", this.id, ", secret=", this.secret, ")");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @c
    public PaymentSessionResponse(@NotNull String id2, @NotNull String paymentSessionToken, @NotNull String paymentSessionSecret) {
        this(id2, paymentSessionSecret);
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(paymentSessionToken, "paymentSessionToken");
        Intrinsics.echo(paymentSessionSecret, "paymentSessionSecret");
    }
}
