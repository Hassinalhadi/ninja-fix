package com.app.network.network.models;

import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR(\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0017\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/app/network/network/models/WithdrawConfigsResponse;", "", "<init>", "()V", "configs", "Lcom/app/network/network/models/WithdrawConfigs;", "getConfigs", "()Lcom/app/network/network/models/WithdrawConfigs;", "setConfigs", "(Lcom/app/network/network/models/WithdrawConfigs;)V", "allowedTransactionTypes", "", "", "getAllowedTransactionTypes", "()Ljava/util/Map;", "setAllowedTransactionTypes", "(Ljava/util/Map;)V", "canWithdraw", "", "getCanWithdraw", "()Ljava/lang/Boolean;", "setCanWithdraw", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WithdrawConfigsResponse {

    @Nullable
    private Map<String, String> allowedTransactionTypes;

    @Nullable
    private Boolean canWithdraw;

    @Nullable
    private WithdrawConfigs configs;

    @Nullable
    public final Map<String, String> getAllowedTransactionTypes() {
        return this.allowedTransactionTypes;
    }

    @Nullable
    public final Boolean getCanWithdraw() {
        return this.canWithdraw;
    }

    @Nullable
    public final WithdrawConfigs getConfigs() {
        return this.configs;
    }

    public final void setAllowedTransactionTypes(@Nullable Map<String, String> map) {
        this.allowedTransactionTypes = map;
    }

    public final void setCanWithdraw(@Nullable Boolean bool) {
        this.canWithdraw = bool;
    }

    public final void setConfigs(@Nullable WithdrawConfigs withdrawConfigs) {
        this.configs = withdrawConfigs;
    }
}
