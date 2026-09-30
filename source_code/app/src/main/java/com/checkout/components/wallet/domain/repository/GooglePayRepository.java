package com.checkout.components.wallet.domain.repository;

import H6.b;
import android.content.Context;
import com.checkout.components.interfaces.Environment;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import kotlin.Metadata;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0011À\u0006\u0001"}, d2 = {"Lcom/checkout/components/wallet/domain/repository/GooglePayRepository;", "", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/Environment;", "environment", "LH6/b;", "createPaymentsClient", "(Landroid/content/Context;Lcom/checkout/components/interfaces/Environment;)LH6/b;", "", "json", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "createPaymentDataRequest", "(Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentDataRequest;", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "createIsReadyToPayRequest", "(Ljava/lang/String;)Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GooglePayRepository {
    IsReadyToPayRequest createIsReadyToPayRequest(String json);

    PaymentDataRequest createPaymentDataRequest(String json);

    b createPaymentsClient(Context context, Environment environment);
}
