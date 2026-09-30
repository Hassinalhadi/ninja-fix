package com.app.network.network.models;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/app/network/network/models/SocketClients;", "", "<init>", "()V", "stomp", "Lcom/app/network/network/models/Stomp;", "getStomp", "()Lcom/app/network/network/models/Stomp;", "setStomp", "(Lcom/app/network/network/models/Stomp;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SocketClients {

    @Nullable
    private Stomp stomp;

    @Nullable
    public final Stomp getStomp() {
        return this.stomp;
    }

    public final void setStomp(@Nullable Stomp stomp) {
        this.stomp = stomp;
    }
}
