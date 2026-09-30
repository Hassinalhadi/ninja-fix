package com.checkout.risk;

import Nd.c;
import Od.a;
import Pd.e;
import Pd.i;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vg.aq;

@e(c = "com.checkout.risk.DeviceDataService$getConfiguration$2", f = "DeviceDataService.kt", l = {32}, m = "invokeSuspend")
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lvg/aq;", "Lcom/checkout/risk/DeviceDataConfiguration;", "<anonymous>", "()Lvg/aq;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class DeviceDataService$getConfiguration$2 extends i implements Function1<c<? super aq<DeviceDataConfiguration>>, Object> {
    int label;
    final /* synthetic */ DeviceDataService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDataService$getConfiguration$2(DeviceDataService deviceDataService, c<? super DeviceDataService$getConfiguration$2> cVar) {
        super(1, cVar);
        this.this$0 = deviceDataService;
    }

    @Override // Pd.a
    @NotNull
    public final c<Unit> create(@NotNull c<?> cVar) {
        return new DeviceDataService$getConfiguration$2(this.this$0, cVar);
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final Object invoke(@Nullable c<? super aq<DeviceDataConfiguration>> cVar) {
        return ((DeviceDataService$getConfiguration$2) create(cVar)).invokeSuspend(Unit.INSTANCE);
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
        String id2 = TimeZone.getDefault().getID();
        riskIntegrationType = this.this$0.integrationType;
        String type = riskIntegrationType.getType();
        Intrinsics.checkNotNull(id2);
        this.label = 1;
        Object configuration = deviceDataApi.getConfiguration(str, type, Constants.RISK_PACKAGE_VERSION, id2, this);
        if (configuration == aVar) {
            return aVar;
        }
        return configuration;
    }
}
