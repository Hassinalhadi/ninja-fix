package com.clevertap.android.sdk.network.api;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.network.NetworkRepo;
import com.clevertap.android.sdk.network.http.UrlConnectionHttpClient;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0001¢\u0006\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/clevertap/android/sdk/network/api/CtApiProvider;", "", "<init>", "()V", "provideDefaultCtApi", "Lcom/clevertap/android/sdk/network/api/CtApi;", "networkRepo", "Lcom/clevertap/android/sdk/network/NetworkRepo;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "deviceInfo", "Lcom/clevertap/android/sdk/DeviceInfo;", "provideDefaultCtApi$clevertap_core_release", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CtApiProvider {

    @NotNull
    public static final CtApiProvider INSTANCE = new CtApiProvider();

    private CtApiProvider() {
    }

    @NotNull
    public final CtApi provideDefaultCtApi$clevertap_core_release(@NotNull NetworkRepo networkRepo, @NotNull CleverTapInstanceConfig config, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.echo(networkRepo, "networkRepo");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(deviceInfo, "deviceInfo");
        boolean isSslPinningEnabled = config.isSslPinningEnabled();
        Logger logger = config.getLogger();
        Intrinsics.delta(logger, "getLogger(...)");
        String accountId = config.getAccountId();
        Intrinsics.delta(accountId, "getAccountId(...)");
        UrlConnectionHttpClient urlConnectionHttpClient = new UrlConnectionHttpClient(isSslPinningEnabled, logger, accountId);
        String domain = networkRepo.getDomain();
        String spikyDomain = networkRepo.getSpikyDomain();
        String accountRegion = config.getAccountRegion();
        String proxyDomain = config.getProxyDomain();
        String spikyProxyDomain = config.getSpikyProxyDomain();
        String customHandshakeDomain = config.getCustomHandshakeDomain();
        String accountId2 = config.getAccountId();
        Intrinsics.delta(accountId2, "getAccountId(...)");
        String accountToken = config.getAccountToken();
        Intrinsics.delta(accountToken, "getAccountToken(...)");
        String valueOf = String.valueOf(deviceInfo.getSdkVersion());
        Logger logger2 = config.getLogger();
        Intrinsics.delta(logger2, "getLogger(...)");
        String accountId3 = config.getAccountId();
        Intrinsics.delta(accountId3, "getAccountId(...)");
        return new CtApi(urlConnectionHttpClient, Constants.PRIMARY_DOMAIN, domain, spikyDomain, accountRegion, proxyDomain, spikyProxyDomain, customHandshakeDomain, accountId2, accountToken, valueOf, logger2, accountId3);
    }
}
