package com.checkout.components.rememberme.di;

import com.checkout.components.rememberme.ui.manager.RMStateManager;
import com.checkout.components.rememberme.ui.manager.RMStateManagerImpl;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, d2 = {"Lcom/checkout/components/rememberme/di/RMStateManagerModule;", "", "<init>", "()V", "paymentStateManager", "Lcom/checkout/components/rememberme/ui/manager/RMStateManager;", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RMStateManagerModule {
    public static final int $stable = 0;

    @NotNull
    public final RMStateManager paymentStateManager() {
        return new RMStateManagerImpl();
    }
}
