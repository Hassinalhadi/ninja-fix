package com.app.network.network.models;

import av.q;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/app/network/network/models/PaymentSession;", "", Constants.KEY_ID, "", "secret", "token", Constants.KEY_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getSecret", "getToken", "getUrl", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "equals", "", "other", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PaymentSession {

    @NotNull
    private final String id;

    @NotNull
    private final String secret;

    @NotNull
    private final String token;

    @NotNull
    private final String url;

    public PaymentSession(@NotNull String id2, @NotNull String secret, @NotNull String token, @NotNull String url) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(secret, "secret");
        Intrinsics.echo(token, "token");
        Intrinsics.echo(url, "url");
        this.id = id2;
        this.secret = secret;
        this.token = token;
        this.url = url;
    }

    public static /* synthetic */ PaymentSession copy$default(PaymentSession paymentSession, String str, String str2, String str3, String str4, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = paymentSession.id;
        }
        if ((i4 & 2) != 0) {
            str2 = paymentSession.secret;
        }
        if ((i4 & 4) != 0) {
            str3 = paymentSession.token;
        }
        if ((i4 & 8) != 0) {
            str4 = paymentSession.url;
        }
        return paymentSession.copy(str, str2, str3, str4);
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
    /* renamed from: component3, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final PaymentSession copy(@NotNull String id2, @NotNull String secret, @NotNull String token, @NotNull String url) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(secret, "secret");
        Intrinsics.echo(token, "token");
        Intrinsics.echo(url, "url");
        return new PaymentSession(id2, secret, token, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentSession)) {
            return false;
        }
        PaymentSession paymentSession = (PaymentSession) other;
        return Intrinsics.areEqual(this.id, paymentSession.id) && Intrinsics.areEqual(this.secret, paymentSession.secret) && Intrinsics.areEqual(this.token, paymentSession.token) && Intrinsics.areEqual(this.url, paymentSession.url);
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getSecret() {
        return this.secret;
    }

    @NotNull
    public final String getToken() {
        return this.token;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.url.hashCode() + AbstractC2327c.sierra(AbstractC2327c.sierra(this.id.hashCode() * 31, 31, this.secret), 31, this.token);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.secret;
        return j.lima(q.india("PaymentSession(id=", str, ", secret=", str2, ", token="), this.token, ", url=", this.url, ")");
    }
}
