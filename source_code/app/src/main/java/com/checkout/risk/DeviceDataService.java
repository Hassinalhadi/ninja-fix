package com.checkout.risk;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.risk.NetworkResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.HttpException;
import vg.aq;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JG\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\"\b\b\u0000\u0010\u0006*\u00020\u00012\"\u0010\n\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000b2\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0011H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Lcom/checkout/risk/DeviceDataService;", "", "Lcom/checkout/risk/RiskSDKInternalConfig;", "internalConfig", "<init>", "(Lcom/checkout/risk/RiskSDKInternalConfig;)V", "T", "Lkotlin/Function1;", "LNd/c;", "Lvg/aq;", "execute", "Lcom/checkout/risk/NetworkResult;", "executeApiCall", "(Lkotlin/jvm/functions/Function1;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/risk/DeviceDataConfiguration;", "getConfiguration", "(LNd/c;)Ljava/lang/Object;", "", "requestId", "cardToken", "Lcom/checkout/risk/PersistFingerprintDataResponse;", "persistFingerprintData", "(Ljava/lang/String;Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/risk/DeviceDataApi;", "deviceDataApi", "Lcom/checkout/risk/DeviceDataApi;", "merchantPublicKey", "Ljava/lang/String;", "Lcom/checkout/risk/RiskIntegrationType;", "integrationType", "Lcom/checkout/risk/RiskIntegrationType;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DeviceDataService {

    @NotNull
    private final DeviceDataApi deviceDataApi;

    @NotNull
    private final RiskIntegrationType integrationType;

    @NotNull
    private final String merchantPublicKey;

    public DeviceDataService(@NotNull RiskSDKInternalConfig internalConfig) {
        Intrinsics.echo(internalConfig, "internalConfig");
        this.deviceDataApi = DeviceDataApi.INSTANCE.invoke(internalConfig.getDeviceDataEndpoint());
        this.merchantPublicKey = internalConfig.getMerchantPublicKey();
        this.integrationType = internalConfig.getIntegrationType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <T> Object executeApiCall(Function1<? super c<? super aq<T>>, ? extends Object> function1, c<? super NetworkResult<? extends T>> cVar) {
        DeviceDataService$executeApiCall$1 deviceDataService$executeApiCall$1;
        int i4;
        Response response;
        try {
            if (cVar instanceof DeviceDataService$executeApiCall$1) {
                deviceDataService$executeApiCall$1 = (DeviceDataService$executeApiCall$1) cVar;
                int i5 = deviceDataService$executeApiCall$1.label;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    deviceDataService$executeApiCall$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = deviceDataService$executeApiCall$1.result;
                    a aVar = a.alpha;
                    i4 = deviceDataService$executeApiCall$1.label;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        deviceDataService$executeApiCall$1.label = 1;
                        obj = function1.invoke(deviceDataService$executeApiCall$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    aq aqVar = (aq) obj;
                    Object obj2 = aqVar.bravo;
                    response = aqVar.alpha;
                    if (!response.getIsSuccessful() && obj2 != null) {
                        return new NetworkResult.Success(obj2);
                    }
                    int code = response.code();
                    String message = response.message();
                    Intrinsics.delta(message, "message(...)");
                    return new NetworkResult.Error(code, message, new Exception());
                }
            }
            if (i4 == 0) {
            }
            aq aqVar2 = (aq) obj;
            Object obj22 = aqVar2.bravo;
            response = aqVar2.alpha;
            if (!response.getIsSuccessful()) {
            }
            int code2 = response.code();
            String message2 = response.message();
            Intrinsics.delta(message2, "message(...)");
            return new NetworkResult.Error(code2, message2, new Exception());
        } catch (HttpException e) {
            int code3 = e.code();
            String message3 = e.message();
            Intrinsics.delta(message3, "message(...)");
            return new NetworkResult.Error(code3, message3, e);
        } catch (Throwable th) {
            return new NetworkResult.Exception(th);
        }
        deviceDataService$executeApiCall$1 = new DeviceDataService$executeApiCall$1(this, cVar);
        Object obj3 = deviceDataService$executeApiCall$1.result;
        a aVar2 = a.alpha;
        i4 = deviceDataService$executeApiCall$1.label;
    }

    @Nullable
    public final Object getConfiguration(@NotNull c<? super NetworkResult<DeviceDataConfiguration>> cVar) {
        return executeApiCall(new DeviceDataService$getConfiguration$2(this, null), cVar);
    }

    @Nullable
    public final Object persistFingerprintData(@NotNull String str, @Nullable String str2, @NotNull c<? super NetworkResult<PersistFingerprintDataResponse>> cVar) {
        return executeApiCall(new DeviceDataService$persistFingerprintData$2(this, str, str2, null), cVar);
    }
}
