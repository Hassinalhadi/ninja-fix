package com.checkout.components.core.network.adapter;

import com.checkout.components.core.network.model.response.PaymentStatus;
import com.squareup.moshi.FromJson;
import com.squareup.moshi.ToJson;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lcom/checkout/components/core/network/adapter/PaymentStatusAdapter;", "", "<init>", "()V", "fromJson", "Lcom/checkout/components/core/network/model/response/PaymentStatus;", "value", "", "toJson", "reason", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PaymentStatusAdapter {
    public static final int $stable = 0;

    @FromJson
    @NotNull
    public final PaymentStatus fromJson(@NotNull String value) {
        Intrinsics.echo(value, "value");
        for (PaymentStatus paymentStatus : PaymentStatus.getEntries()) {
            if (Intrinsics.areEqual(paymentStatus.getValue(), value)) {
                return paymentStatus;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @ToJson
    @NotNull
    public final String toJson(@NotNull PaymentStatus reason) {
        Intrinsics.echo(reason, "reason");
        return reason.getValue();
    }
}
