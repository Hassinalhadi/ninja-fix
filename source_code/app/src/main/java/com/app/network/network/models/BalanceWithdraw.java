package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015¨\u0006 "}, d2 = {"Lcom/app/network/network/models/BalanceWithdraw;", "", "<init>", "()V", "currency", "Lcom/app/network/network/models/Currency;", "getCurrency", "()Lcom/app/network/network/models/Currency;", "setCurrency", "(Lcom/app/network/network/models/Currency;)V", Constants.KEY_ID, "", "getId", "()I", "setId", "(I)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "balances", "", "Lcom/app/network/network/models/Balance;", "getBalances", "()Ljava/util/List;", "setBalances", "(Ljava/util/List;)V", "createdAt", "getCreatedAt", "setCreatedAt", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BalanceWithdraw {

    @Nullable
    private String createdAt;

    @Nullable
    private Currency currency;

    @Nullable
    private String name;
    private int id = -1;

    @NotNull
    private List<Balance> balances = CollectionsKt.emptyList();

    @NotNull
    public final List<Balance> getBalances() {
        return this.balances;
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Currency getCurrency() {
        return this.currency;
    }

    public final int getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setBalances(@NotNull List<Balance> list) {
        Intrinsics.echo(list, "<set-?>");
        this.balances = list;
    }

    public final void setCreatedAt(@Nullable String str) {
        this.createdAt = str;
    }

    public final void setCurrency(@Nullable Currency currency) {
        this.currency = currency;
    }

    public final void setId(int i4) {
        this.id = i4;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
