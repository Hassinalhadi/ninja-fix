package com.checkout.components.kmp.rememberme.di;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/checkout/components/kmp/rememberme/di/Constants;", "", "<init>", "()V", "Llg/b;", "PUBLIC_KEY_NAME", "Llg/b;", "getPUBLIC_KEY_NAME", "()Llg/b;", "SERVICE_NAME", "getSERVICE_NAME", "SERVICE_VERSION", "getSERVICE_VERSION", "ON_AUTHENTICATED_NAME", "getON_AUTHENTICATED_NAME", "rememberme_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constants {

    @NotNull
    public static final Constants INSTANCE = new Constants();

    @NotNull
    private static final lg.b PUBLIC_KEY_NAME = new lg.b("publicKey");

    @NotNull
    private static final lg.b SERVICE_NAME = new lg.b("serviceName");

    @NotNull
    private static final lg.b SERVICE_VERSION = new lg.b("serviceVersion");

    @NotNull
    private static final lg.b ON_AUTHENTICATED_NAME = new lg.b("onAuthenticated");

    private Constants() {
    }

    @NotNull
    public final lg.b getON_AUTHENTICATED_NAME() {
        return ON_AUTHENTICATED_NAME;
    }

    @NotNull
    public final lg.b getPUBLIC_KEY_NAME() {
        return PUBLIC_KEY_NAME;
    }

    @NotNull
    public final lg.b getSERVICE_NAME() {
        return SERVICE_NAME;
    }

    @NotNull
    public final lg.b getSERVICE_VERSION() {
        return SERVICE_VERSION;
    }
}
