package com.checkout.components.rememberme.model;

import ao.ad;
import com.checkout.components.rememberme.utils.Constants;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/rememberme/model/TokenData;", "", "", Constants.CVV_TYPE, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/rememberme/model/TokenData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCvv", "getCvv$annotations", "()V", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TokenData {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String cvv;

    public TokenData(@Json(name = "cvv") @NotNull String cvv) {
        Intrinsics.echo(cvv, "cvv");
        this.cvv = cvv;
    }

    public static /* synthetic */ TokenData copy$default(TokenData tokenData, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = tokenData.cvv;
        }
        return tokenData.copy(str);
    }

    @Json(name = Constants.CVV_TYPE)
    public static /* synthetic */ void getCvv$annotations() {
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    @NotNull
    public final TokenData copy(@Json(name = "cvv") @NotNull String cvv) {
        Intrinsics.echo(cvv, "cvv");
        return new TokenData(cvv);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof TokenData) && Intrinsics.areEqual(this.cvv, ((TokenData) other).cvv);
    }

    @NotNull
    public final String getCvv() {
        return this.cvv;
    }

    public final int hashCode() {
        return this.cvv.hashCode();
    }

    @NotNull
    public final String toString() {
        return ad.gray("TokenData(cvv=", this.cvv, ")");
    }
}
