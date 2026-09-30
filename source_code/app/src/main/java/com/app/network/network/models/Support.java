package com.app.network.network.models;

import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t¨\u0006\r"}, d2 = {"Lcom/app/network/network/models/Support;", "", "<init>", "()V", "phoneNumber", "", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "whatsappNumber", "getWhatsappNumber", "setWhatsappNumber", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Support {

    @Nullable
    private String phoneNumber;

    @Nullable
    private String whatsappNumber;

    @Nullable
    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    @Nullable
    public final String getWhatsappNumber() {
        return this.whatsappNumber;
    }

    public final void setPhoneNumber(@Nullable String str) {
        this.phoneNumber = str;
    }

    public final void setWhatsappNumber(@Nullable String str) {
        this.whatsappNumber = str;
    }
}
