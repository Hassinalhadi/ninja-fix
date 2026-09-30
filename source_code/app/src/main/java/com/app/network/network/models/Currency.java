package com.app.network.network.models;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\t"}, d2 = {"Lcom/app/network/network/models/Currency;", "Lcom/app/network/network/models/Language;", "symbol", "", "<init>", "(Ljava/lang/String;)V", "getSymbol", "()Ljava/lang/String;", "setSymbol", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Currency extends Language {

    @NotNull
    private String symbol;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Currency(@NotNull String symbol) {
        super(null, 1, null);
        Intrinsics.echo(symbol, "symbol");
        this.symbol = symbol;
    }

    @NotNull
    public final String getSymbol() {
        return this.symbol;
    }

    public final void setSymbol(@NotNull String str) {
        Intrinsics.echo(str, "<set-?>");
        this.symbol = str;
    }
}
