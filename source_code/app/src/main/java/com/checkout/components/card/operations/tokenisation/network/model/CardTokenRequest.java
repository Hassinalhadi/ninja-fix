package com.checkout.components.card.operations.tokenisation.network.model;

import com.checkout.components.interfaces.model.BillingAddressNetworkEntity;
import com.checkout.components.interfaces.model.PhoneNetworkEntity;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JF\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b$\u0010\u000fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010\u0012¨\u0006("}, d2 = {"Lcom/checkout/components/card/operations/tokenisation/network/model/CardTokenRequest;", "", "Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "tokenRequest", "Lkotlin/Function0;", "", "onSuccess", "onFailure", "", "rememberMeJWTToken", "<init>", "(Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)V", "component1", "()Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "component2", "()Lkotlin/jvm/functions/Function0;", "component3", "component4", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Ljava/lang/String;)Lcom/checkout/components/card/operations/tokenisation/network/model/CardTokenRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/card/operations/tokenisation/network/model/TokenRequest;", "getTokenRequest", "b", "Lkotlin/jvm/functions/Function0;", "getOnSuccess", "c", "getOnFailure", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "getRememberMeJWTToken", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardTokenRequest {
    public static final int $stable;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TokenRequest tokenRequest;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Function0 onSuccess;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Function0 onFailure;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String rememberMeJWTToken;

    static {
        int i4 = BillingAddressNetworkEntity.$stable;
        int i5 = PhoneNetworkEntity.$stable;
        $stable = i4 | i5 | i4 | i5;
    }

    public CardTokenRequest(@NotNull TokenRequest tokenRequest, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onFailure, @Nullable String str) {
        Intrinsics.echo(tokenRequest, "tokenRequest");
        Intrinsics.echo(onSuccess, "onSuccess");
        Intrinsics.echo(onFailure, "onFailure");
        this.tokenRequest = tokenRequest;
        this.onSuccess = onSuccess;
        this.onFailure = onFailure;
        this.rememberMeJWTToken = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardTokenRequest copy$default(CardTokenRequest cardTokenRequest, TokenRequest tokenRequest, Function0 function0, Function0 function02, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            tokenRequest = cardTokenRequest.tokenRequest;
        }
        if ((i4 & 2) != 0) {
            function0 = cardTokenRequest.onSuccess;
        }
        if ((i4 & 4) != 0) {
            function02 = cardTokenRequest.onFailure;
        }
        if ((i4 & 8) != 0) {
            str = cardTokenRequest.rememberMeJWTToken;
        }
        return cardTokenRequest.copy(tokenRequest, function0, function02, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final TokenRequest getTokenRequest() {
        return this.tokenRequest;
    }

    @NotNull
    public final Function0<Unit> component2() {
        return this.onSuccess;
    }

    @NotNull
    public final Function0<Unit> component3() {
        return this.onFailure;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getRememberMeJWTToken() {
        return this.rememberMeJWTToken;
    }

    @NotNull
    public final CardTokenRequest copy(@NotNull TokenRequest tokenRequest, @NotNull Function0<Unit> onSuccess, @NotNull Function0<Unit> onFailure, @Nullable String rememberMeJWTToken) {
        Intrinsics.echo(tokenRequest, "tokenRequest");
        Intrinsics.echo(onSuccess, "onSuccess");
        Intrinsics.echo(onFailure, "onFailure");
        return new CardTokenRequest(tokenRequest, onSuccess, onFailure, rememberMeJWTToken);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardTokenRequest)) {
            return false;
        }
        CardTokenRequest cardTokenRequest = (CardTokenRequest) other;
        return Intrinsics.areEqual(this.tokenRequest, cardTokenRequest.tokenRequest) && Intrinsics.areEqual(this.onSuccess, cardTokenRequest.onSuccess) && Intrinsics.areEqual(this.onFailure, cardTokenRequest.onFailure) && Intrinsics.areEqual(this.rememberMeJWTToken, cardTokenRequest.rememberMeJWTToken);
    }

    @NotNull
    public final Function0<Unit> getOnFailure() {
        return this.onFailure;
    }

    @NotNull
    public final Function0<Unit> getOnSuccess() {
        return this.onSuccess;
    }

    @Nullable
    public final String getRememberMeJWTToken() {
        return this.rememberMeJWTToken;
    }

    @NotNull
    public final TokenRequest getTokenRequest() {
        return this.tokenRequest;
    }

    public final int hashCode() {
        int hashCode = (this.onFailure.hashCode() + ((this.onSuccess.hashCode() + (this.tokenRequest.hashCode() * 31)) * 31)) * 31;
        String str = this.rememberMeJWTToken;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return "CardTokenRequest(tokenRequest=" + this.tokenRequest + ", onSuccess=" + this.onSuccess + ", onFailure=" + this.onFailure + ", rememberMeJWTToken=" + this.rememberMeJWTToken + ")";
    }
}
