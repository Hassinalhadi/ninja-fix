package com.checkout.components.interfaces.model.paymentsession;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0001\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ0\u0010\u000b\u001a\u00020\u00002\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\tR&\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0017\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\t¨\u0006\u001e"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "", "", "", "allowedAuthMethods", "allowedCardNetworks", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "component1", "()Ljava/util/List;", "component2", Constants.COPY_TYPE, "(Ljava/util/List;Ljava/util/List;)Lcom/checkout/components/interfaces/model/paymentsession/CardParameters;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "getAllowedAuthMethods", "getAllowedAuthMethods$annotations", "()V", "b", "getAllowedCardNetworks", "getAllowedCardNetworks$annotations", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardParameters {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List allowedAuthMethods;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List allowedCardNetworks;

    public CardParameters(@Json(name = "allowed_auth_methods") @NotNull List<String> allowedAuthMethods, @Json(name = "allowed_card_networks") @NotNull List<String> allowedCardNetworks) {
        Intrinsics.echo(allowedAuthMethods, "allowedAuthMethods");
        Intrinsics.echo(allowedCardNetworks, "allowedCardNetworks");
        this.allowedAuthMethods = allowedAuthMethods;
        this.allowedCardNetworks = allowedCardNetworks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CardParameters copy$default(CardParameters cardParameters, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = cardParameters.allowedAuthMethods;
        }
        if ((i4 & 2) != 0) {
            list2 = cardParameters.allowedCardNetworks;
        }
        return cardParameters.copy(list, list2);
    }

    @Json(name = "allowed_auth_methods")
    public static /* synthetic */ void getAllowedAuthMethods$annotations() {
    }

    @Json(name = "allowed_card_networks")
    public static /* synthetic */ void getAllowedCardNetworks$annotations() {
    }

    @NotNull
    public final List<String> component1() {
        return this.allowedAuthMethods;
    }

    @NotNull
    public final List<String> component2() {
        return this.allowedCardNetworks;
    }

    @NotNull
    public final CardParameters copy(@Json(name = "allowed_auth_methods") @NotNull List<String> allowedAuthMethods, @Json(name = "allowed_card_networks") @NotNull List<String> allowedCardNetworks) {
        Intrinsics.echo(allowedAuthMethods, "allowedAuthMethods");
        Intrinsics.echo(allowedCardNetworks, "allowedCardNetworks");
        return new CardParameters(allowedAuthMethods, allowedCardNetworks);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardParameters)) {
            return false;
        }
        CardParameters cardParameters = (CardParameters) other;
        return Intrinsics.areEqual(this.allowedAuthMethods, cardParameters.allowedAuthMethods) && Intrinsics.areEqual(this.allowedCardNetworks, cardParameters.allowedCardNetworks);
    }

    @NotNull
    public final List<String> getAllowedAuthMethods() {
        return this.allowedAuthMethods;
    }

    @NotNull
    public final List<String> getAllowedCardNetworks() {
        return this.allowedCardNetworks;
    }

    public final int hashCode() {
        return this.allowedCardNetworks.hashCode() + (this.allowedAuthMethods.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CardParameters(allowedAuthMethods=" + this.allowedAuthMethods + ", allowedCardNetworks=" + this.allowedCardNetworks + ")";
    }
}
