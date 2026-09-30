package com.app.network.network.models;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u000f\u0010\u0007\"\u0004\b\u0010\u0010\t¨\u0006\u0011"}, d2 = {"Lcom/app/network/network/models/WithdrawConfigs;", "", "<init>", "()V", "minBalanceToKeep", "", "getMinBalanceToKeep", "()Ljava/lang/Float;", "setMinBalanceToKeep", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "minAmount", "getMinAmount", "setMinAmount", "maxAmount", "getMaxAmount", "setMaxAmount", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WithdrawConfigs {

    @Nullable
    private Float maxAmount;

    @Nullable
    private Float minAmount;

    @Nullable
    private Float minBalanceToKeep;

    @Nullable
    public final Float getMaxAmount() {
        return this.maxAmount;
    }

    @Nullable
    public final Float getMinAmount() {
        return this.minAmount;
    }

    @Nullable
    public final Float getMinBalanceToKeep() {
        return this.minBalanceToKeep;
    }

    public final void setMaxAmount(@Nullable Float f5) {
        this.maxAmount = f5;
    }

    public final void setMinAmount(@Nullable Float f5) {
        this.minAmount = f5;
    }

    public final void setMinBalanceToKeep(@Nullable Float f5) {
        this.minBalanceToKeep = f5;
    }
}
