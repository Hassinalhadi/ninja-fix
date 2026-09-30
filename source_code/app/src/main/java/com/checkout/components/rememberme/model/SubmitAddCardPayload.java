package com.checkout.components.rememberme.model;

import androidx.annotation.Keep;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/rememberme/model/SubmitAddCardPayload;", "", "jwtToken", "", "setAsDefaultPaymentMethod", "", "<init>", "(Ljava/lang/String;Z)V", "getJwtToken", "()Ljava/lang/String;", "getSetAsDefaultPaymentMethod", "()Z", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "hashCode", "", "toString", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SubmitAddCardPayload {
    public static final int $stable = 0;

    @NotNull
    private final String jwtToken;
    private final boolean setAsDefaultPaymentMethod;

    public SubmitAddCardPayload(@NotNull String jwtToken, boolean z2) {
        Intrinsics.echo(jwtToken, "jwtToken");
        this.jwtToken = jwtToken;
        this.setAsDefaultPaymentMethod = z2;
    }

    public static /* synthetic */ SubmitAddCardPayload copy$default(SubmitAddCardPayload submitAddCardPayload, String str, boolean z2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = submitAddCardPayload.jwtToken;
        }
        if ((i4 & 2) != 0) {
            z2 = submitAddCardPayload.setAsDefaultPaymentMethod;
        }
        return submitAddCardPayload.copy(str, z2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getJwtToken() {
        return this.jwtToken;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getSetAsDefaultPaymentMethod() {
        return this.setAsDefaultPaymentMethod;
    }

    @NotNull
    public final SubmitAddCardPayload copy(@NotNull String jwtToken, boolean setAsDefaultPaymentMethod) {
        Intrinsics.echo(jwtToken, "jwtToken");
        return new SubmitAddCardPayload(jwtToken, setAsDefaultPaymentMethod);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SubmitAddCardPayload)) {
            return false;
        }
        SubmitAddCardPayload submitAddCardPayload = (SubmitAddCardPayload) other;
        return Intrinsics.areEqual(this.jwtToken, submitAddCardPayload.jwtToken) && this.setAsDefaultPaymentMethod == submitAddCardPayload.setAsDefaultPaymentMethod;
    }

    @NotNull
    public final String getJwtToken() {
        return this.jwtToken;
    }

    public final boolean getSetAsDefaultPaymentMethod() {
        return this.setAsDefaultPaymentMethod;
    }

    public int hashCode() {
        return (this.setAsDefaultPaymentMethod ? 1231 : 1237) + (this.jwtToken.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "SubmitAddCardPayload(jwtToken=" + this.jwtToken + ", setAsDefaultPaymentMethod=" + this.setAsDefaultPaymentMethod + ")";
    }
}
