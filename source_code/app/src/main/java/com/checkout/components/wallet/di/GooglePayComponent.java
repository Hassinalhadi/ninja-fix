package com.checkout.components.wallet.di;

import com.checkout.components.wallet.GooglePayMediator;
import com.checkout.components.wallet.common.GooglePayMapper;
import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\ba\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\tH&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/wallet/di/GooglePayComponent;", "", "inject", "", "googlePayMediator", "Lcom/checkout/components/wallet/GooglePayMediator;", "getGooglePayMapper", "Lcom/checkout/components/wallet/common/GooglePayMapper;", "getGooglePayRepositoryImpl", "Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface GooglePayComponent {
    GooglePayMapper getGooglePayMapper();

    GooglePayRepositoryImpl getGooglePayRepositoryImpl();

    void inject(GooglePayMediator googlePayMediator);
}
