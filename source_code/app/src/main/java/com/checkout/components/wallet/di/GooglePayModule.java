package com.checkout.components.wallet.di;

import com.checkout.components.wallet.common.GooglePayMapper;
import com.checkout.components.wallet.data.repository.GooglePayRepositoryImpl;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\b\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/wallet/di/GooglePayModule;", "", "<init>", "()V", "provideMoshi", "Lcom/squareup/moshi/Moshi;", "provideGooglePayMapper", "Lcom/checkout/components/wallet/common/GooglePayMapper;", "moshi", "provideGooglePayRepositoryImpl", "Lcom/checkout/components/wallet/data/repository/GooglePayRepositoryImpl;", "wallet_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GooglePayModule {
    public static final int $stable = 0;

    public final GooglePayMapper provideGooglePayMapper(Moshi moshi) {
        Intrinsics.echo(moshi, "moshi");
        return new GooglePayMapper(moshi);
    }

    public final GooglePayRepositoryImpl provideGooglePayRepositoryImpl() {
        return new GooglePayRepositoryImpl();
    }

    public final Moshi provideMoshi() {
        Moshi build = new Moshi.Builder().add((JsonAdapter.Factory) new KotlinJsonAdapterFactory()).build();
        Intrinsics.delta(build, "build(...)");
        return build;
    }
}
