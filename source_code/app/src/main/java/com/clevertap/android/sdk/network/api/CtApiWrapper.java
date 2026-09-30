package com.clevertap.android.sdk.network.api;

import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.network.NetworkRepo;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8GX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lcom/clevertap/android/sdk/network/api/CtApiWrapper;", "", "networkRepo", "Lcom/clevertap/android/sdk/network/NetworkRepo;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "deviceInfo", "Lcom/clevertap/android/sdk/DeviceInfo;", "<init>", "(Lcom/clevertap/android/sdk/network/NetworkRepo;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/DeviceInfo;)V", "ctApi", "Lcom/clevertap/android/sdk/network/api/CtApi;", "getCtApi", "()Lcom/clevertap/android/sdk/network/api/CtApi;", "ctApi$delegate", "Lkotlin/Lazy;", "needsHandshake", "", "isViewedEvent", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CtApiWrapper {

    @NotNull
    private final CleverTapInstanceConfig config;

    /* renamed from: ctApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy ctApi;

    @NotNull
    private final DeviceInfo deviceInfo;

    @NotNull
    private final NetworkRepo networkRepo;

    public CtApiWrapper(@NotNull NetworkRepo networkRepo, @NotNull CleverTapInstanceConfig config, @NotNull DeviceInfo deviceInfo) {
        Intrinsics.echo(networkRepo, "networkRepo");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(deviceInfo, "deviceInfo");
        this.networkRepo = networkRepo;
        this.config = config;
        this.deviceInfo = deviceInfo;
        this.ctApi = LazyKt.lazy(new n(23, this));
    }

    public static /* synthetic */ CtApi alpha(CtApiWrapper ctApiWrapper) {
        return ctApi_delegate$lambda$0(ctApiWrapper);
    }

    public static final CtApi ctApi_delegate$lambda$0(CtApiWrapper this$0) {
        Intrinsics.echo(this$0, "this$0");
        return CtApiProvider.INSTANCE.provideDefaultCtApi$clevertap_core_release(this$0.networkRepo, this$0.config, this$0.deviceInfo);
    }

    @NotNull
    public final CtApi getCtApi() {
        return (CtApi) this.ctApi.getValue();
    }

    public final boolean needsHandshake(boolean isViewedEvent) {
        return getCtApi().needsHandshake(isViewedEvent);
    }
}
