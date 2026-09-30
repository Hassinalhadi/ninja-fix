package com.checkout.risk;

import Nd.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;
import yg.a;
import yg.f;
import yg.i;
import yg.p;
import yg.t;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\br\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010JA\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0004\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0002H§@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ7\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00022\b\b\u0001\u0010\f\u001a\u00020\u000bH§@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"Lcom/checkout/risk/DeviceDataApi;", "", "", "authHeader", "integrationType", "riskSdkVersion", "timezone", "Lvg/aq;", "Lcom/checkout/risk/DeviceDataConfiguration;", "getConfiguration", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/risk/PersistFingerprintDataRequest;", "fingerprintData", "Lcom/checkout/risk/PersistFingerprintDataResponse;", "persistFingerprintData", "(Ljava/lang/String;Ljava/lang/String;Lcom/checkout/risk/PersistFingerprintDataRequest;LNd/c;)Ljava/lang/Object;", "Companion", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface DeviceDataApi {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0011\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0086\u0002¨\u0006\u0007"}, d2 = {"Lcom/checkout/risk/DeviceDataApi$Companion;", "", "()V", "invoke", "Lcom/checkout/risk/DeviceDataApi;", "baseUrl", "", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @NotNull
        public final DeviceDataApi invoke(@NotNull String baseUrl) {
            Intrinsics.echo(baseUrl, "baseUrl");
            Object bravo = ApiClientKt.getRetrofitClient(baseUrl).bravo(DeviceDataApi.class);
            Intrinsics.delta(bravo, "create(...)");
            return (DeviceDataApi) bravo;
        }
    }

    @f("/collect/configuration")
    @Nullable
    Object getConfiguration(@NotNull @i("Authorization") String str, @t("integrationType") @NotNull String str2, @t("riskSdkVersion") @NotNull String str3, @t("timezone") @NotNull String str4, @NotNull c<? super aq<DeviceDataConfiguration>> cVar);

    @p("/collect/fingerprint")
    @Nullable
    Object persistFingerprintData(@NotNull @i("Authorization") String str, @t("riskSdkVersion") @NotNull String str2, @NotNull @a PersistFingerprintDataRequest persistFingerprintDataRequest, @NotNull c<? super aq<PersistFingerprintDataResponse>> cVar);
}
