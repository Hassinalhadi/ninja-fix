package com.checkout.risk;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;

@e(c = "com.checkout.risk.DeviceDataService$persistFingerprintData$2", f = "DeviceDataService.kt", l = {52}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvg/aq;", "Lcom/checkout/risk/PersistFingerprintDataResponse;", "<anonymous>", "()Lvg/aq;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DeviceDataService$persistFingerprintData$2 extends i implements Function1<c<? super aq<PersistFingerprintDataResponse>>, Object> {
    final /* synthetic */ String $cardToken;
    final /* synthetic */ String $requestId;
    int label;
    final /* synthetic */ DeviceDataService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDataService$persistFingerprintData$2(DeviceDataService deviceDataService, String str, String str2, c<? super DeviceDataService$persistFingerprintData$2> cVar) {
        super(1, cVar);
        this.this$0 = deviceDataService;
        this.$requestId = str;
        this.$cardToken = str2;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@NotNull c<?> cVar) {
        return new DeviceDataService$persistFingerprintData$2(this.this$0, this.$requestId, this.$cardToken, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable c<? super aq<PersistFingerprintDataResponse>> cVar) {
        return ((DeviceDataService$persistFingerprintData$2) create(cVar)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        DeviceDataApi deviceDataApi;
        String str;
        RiskIntegrationType riskIntegrationType;
        a aVar = a.alpha;
        int i4 = this.label;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                return obj;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        deviceDataApi = this.this$0.deviceDataApi;
        str = this.this$0.merchantPublicKey;
        String str2 = this.$requestId;
        riskIntegrationType = this.this$0.integrationType;
        PersistFingerprintDataRequest persistFingerprintDataRequest = new PersistFingerprintDataRequest(str2, riskIntegrationType.getType(), this.$cardToken);
        this.label = 1;
        Object persistFingerprintData = deviceDataApi.persistFingerprintData(str, Constants.RISK_PACKAGE_VERSION, persistFingerprintDataRequest, this);
        if (persistFingerprintData == aVar) {
            return aVar;
        }
        return persistFingerprintData;
    }
}
