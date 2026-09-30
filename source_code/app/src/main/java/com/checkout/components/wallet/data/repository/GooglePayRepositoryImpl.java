package com.checkout.components.wallet.data.repository;

import F8.q;
import H6.b;
import H6.d;
import H6.e;
import android.content.Context;
import ao.ad;
import com.checkout.components.interfaces.Environment;
import com.checkout.components.wallet.common.EnvironmentMapper;
import com.checkout.components.wallet.domain.repository.GooglePayRepository;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.api.g;
import com.google.android.gms.wallet.IsReadyToPayRequest;
import com.google.android.gms.wallet.PaymentDataRequest;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "Lcom/checkout/components/wallet/domain/repository/GooglePayRepository;", "<init>", "()V", "Landroid/content/Context;", "context", "Lcom/checkout/components/interfaces/Environment;", "environment", "LH6/b;", "createPaymentsClient", "(Landroid/content/Context;Lcom/checkout/components/interfaces/Environment;)LH6/b;", "", "json", "Lcom/google/android/gms/wallet/PaymentDataRequest;", "createPaymentDataRequest", "(Ljava/lang/String;)Lcom/google/android/gms/wallet/PaymentDataRequest;", "Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "createIsReadyToPayRequest", "(Ljava/lang/String;)Lcom/google/android/gms/wallet/IsReadyToPayRequest;", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayRepositoryImpl implements GooglePayRepository {
    public static final int $stable = 0;

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.wallet.IsReadyToPayRequest, java.lang.Object] */
    @Override // com.checkout.components.wallet.domain.repository.GooglePayRepository
    public final IsReadyToPayRequest createIsReadyToPayRequest(String json) {
        Intrinsics.echo(json, "json");
        ?? obj = new Object();
        obj.white = json;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.android.gms.wallet.PaymentDataRequest, java.lang.Object] */
    @Override // com.checkout.components.wallet.domain.repository.GooglePayRepository
    public final PaymentDataRequest createPaymentDataRequest(String json) {
        Intrinsics.echo(json, "json");
        ?? obj = new Object();
        obj.f7747b = true;
        obj.f7748c = json;
        return obj;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [H6.b, com.google.android.gms.common.api.g] */
    @Override // com.checkout.components.wallet.domain.repository.GooglePayRepository
    public final b createPaymentsClient(Context context, Environment environment) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(environment, "environment");
        q qVar = new q();
        int mapToWalletEnvironment$wallet_standardRelease = EnvironmentMapper.INSTANCE.mapToWalletEnvironment$wallet_standardRelease(environment);
        if (mapToWalletEnvironment$wallet_standardRelease != 0) {
            if (mapToWalletEnvironment$wallet_standardRelease != 0) {
                if (mapToWalletEnvironment$wallet_standardRelease != 2 && mapToWalletEnvironment$wallet_standardRelease != 1 && mapToWalletEnvironment$wallet_standardRelease != 23 && mapToWalletEnvironment$wallet_standardRelease != 3) {
                    Locale locale = Locale.US;
                    throw new IllegalArgumentException(ad.zulu(mapToWalletEnvironment$wallet_standardRelease, "Invalid environment value "));
                }
            } else {
                mapToWalletEnvironment$wallet_standardRelease = 0;
            }
        }
        qVar.alpha = mapToWalletEnvironment$wallet_standardRelease;
        return new g(context, null, e.alpha, new d(qVar), f.bravo);
    }
}
