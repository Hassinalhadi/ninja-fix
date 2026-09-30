package com.app.network.network.models;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0015\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/app/network/network/models/Balance;", "", "<init>", "()V", "platformId", "", "getPlatformId", "()I", "platformName", "", "getPlatformName", "()Ljava/lang/String;", "balance", "", "getBalance", "()Ljava/lang/Float;", "Ljava/lang/Float;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Balance {

    @Nullable
    private final String platformName;
    private final int platformId = -1;

    @Nullable
    private final Float balance = Float.valueOf(0.0f);

    @Nullable
    public final Float getBalance() {
        return this.balance;
    }

    public final int getPlatformId() {
        return this.platformId;
    }

    @Nullable
    public final String getPlatformName() {
        return this.platformName;
    }
}
