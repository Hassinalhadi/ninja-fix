package com.checkout.components.card.operations.model;

import com.checkout.components.rememberme.utils.Constants;
import com.checkout.components.ui.model.CardScheme;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/card/operations/model/CvvValidationRequest;", "", "", Constants.CVV_TYPE, "Lcom/checkout/components/ui/model/CardScheme;", "cardScheme", "<init>", "(Ljava/lang/String;Lcom/checkout/components/ui/model/CardScheme;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/ui/model/CardScheme;", com.clevertap.android.sdk.Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/ui/model/CardScheme;)Lcom/checkout/components/card/operations/model/CvvValidationRequest;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCvv", "b", "Lcom/checkout/components/ui/model/CardScheme;", "getCardScheme", "card_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CvvValidationRequest {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String cvv;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CardScheme cardScheme;

    public CvvValidationRequest(@NotNull String cvv, @NotNull CardScheme cardScheme) {
        Intrinsics.echo(cvv, "cvv");
        Intrinsics.echo(cardScheme, "cardScheme");
        this.cvv = cvv;
        this.cardScheme = cardScheme;
    }

    public static /* synthetic */ CvvValidationRequest copy$default(CvvValidationRequest cvvValidationRequest, String str, CardScheme cardScheme, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = cvvValidationRequest.cvv;
        }
        if ((i4 & 2) != 0) {
            cardScheme = cvvValidationRequest.cardScheme;
        }
        return cvvValidationRequest.copy(str, cardScheme);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getCvv() {
        return this.cvv;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final CardScheme getCardScheme() {
        return this.cardScheme;
    }

    @NotNull
    public final CvvValidationRequest copy(@NotNull String cvv, @NotNull CardScheme cardScheme) {
        Intrinsics.echo(cvv, "cvv");
        Intrinsics.echo(cardScheme, "cardScheme");
        return new CvvValidationRequest(cvv, cardScheme);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CvvValidationRequest)) {
            return false;
        }
        CvvValidationRequest cvvValidationRequest = (CvvValidationRequest) other;
        return Intrinsics.areEqual(this.cvv, cvvValidationRequest.cvv) && this.cardScheme == cvvValidationRequest.cardScheme;
    }

    @NotNull
    public final CardScheme getCardScheme() {
        return this.cardScheme;
    }

    @NotNull
    public final String getCvv() {
        return this.cvv;
    }

    public final int hashCode() {
        return this.cardScheme.hashCode() + (this.cvv.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "CvvValidationRequest(cvv=" + this.cvv + ", cardScheme=" + this.cardScheme + ")";
    }
}
