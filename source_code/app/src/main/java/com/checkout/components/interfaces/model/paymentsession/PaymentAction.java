package com.checkout.components.interfaces.model.paymentsession;

import av.q;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;", "", "", Constants.KEY_TYPE, Constants.KEY_URL, "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/paymentsession/PaymentAction;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getType", "b", "getUrl", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class PaymentAction {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String type;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String url;

    public PaymentAction(@NotNull String type, @Nullable String str) {
        Intrinsics.echo(type, "type");
        this.type = type;
        this.url = str;
    }

    public static PaymentAction copy$default(PaymentAction paymentAction, String type, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            type = paymentAction.type;
        }
        if ((i4 & 2) != 0) {
            str = paymentAction.url;
        }
        paymentAction.getClass();
        Intrinsics.echo(type, "type");
        return new PaymentAction(type, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final PaymentAction copy(@NotNull String type, @Nullable String url) {
        Intrinsics.echo(type, "type");
        return new PaymentAction(type, url);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PaymentAction)) {
            return false;
        }
        PaymentAction paymentAction = (PaymentAction) other;
        return Intrinsics.areEqual(this.type, paymentAction.type) && Intrinsics.areEqual(this.url, paymentAction.url);
    }

    @NotNull
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        String str = this.url;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public final String toString() {
        return q.golf("PaymentAction(type=", this.type, ", url=", this.url, ")");
    }

    public /* synthetic */ PaymentAction(String str, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i4 & 2) != 0 ? null : str2);
    }
}
