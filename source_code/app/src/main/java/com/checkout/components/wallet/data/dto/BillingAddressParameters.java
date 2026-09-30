package com.checkout.components.wallet.data.dto;

import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/checkout/components/wallet/data/dto/BillingAddressParameters;", "", "Lcom/checkout/components/wallet/data/dto/Format;", "format", "<init>", "(Lcom/checkout/components/wallet/data/dto/Format;)V", "component1", "()Lcom/checkout/components/wallet/data/dto/Format;", Constants.COPY_TYPE, "(Lcom/checkout/components/wallet/data/dto/Format;)Lcom/checkout/components/wallet/data/dto/BillingAddressParameters;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/wallet/data/dto/Format;", "getFormat", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class BillingAddressParameters {
    public static final int $stable = 0;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Format format;

    public BillingAddressParameters(Format format) {
        Intrinsics.echo(format, "format");
        this.format = format;
    }

    public static BillingAddressParameters copy$default(BillingAddressParameters billingAddressParameters, Format format, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            format = billingAddressParameters.format;
        }
        billingAddressParameters.getClass();
        Intrinsics.echo(format, "format");
        return new BillingAddressParameters(format);
    }

    /* renamed from: component1, reason: from getter */
    public final Format getFormat() {
        return this.format;
    }

    public final BillingAddressParameters copy(Format format) {
        Intrinsics.echo(format, "format");
        return new BillingAddressParameters(format);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BillingAddressParameters) && this.format == ((BillingAddressParameters) other).format;
    }

    public final Format getFormat() {
        return this.format;
    }

    public final int hashCode() {
        return this.format.hashCode();
    }

    public final String toString() {
        return "BillingAddressParameters(format=" + this.format + ")";
    }
}
