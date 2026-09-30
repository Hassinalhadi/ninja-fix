package com.checkout.risk;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.risk.FingerprintResult;
import com.checkout.risk.LoggerServiceProtocol;
import com.checkout.risk.NetworkResult;
import com.checkout.risk.PublishDataResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0015R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"Lcom/checkout/risk/RiskInternal;", "", "Lcom/checkout/risk/FingerprintService;", "fingerprintService", "Lcom/checkout/risk/DeviceDataService;", "deviceDataService", "Lcom/checkout/risk/LoggerServiceProtocol;", "loggerService", "", "blockTime", "fpLoadTime", "<init>", "(Lcom/checkout/risk/FingerprintService;Lcom/checkout/risk/DeviceDataService;Lcom/checkout/risk/LoggerServiceProtocol;DD)V", "", "cardToken", "Lcom/checkout/risk/PublishDataResult;", "publishData", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/risk/FingerprintService;", "Lcom/checkout/risk/DeviceDataService;", "Lcom/checkout/risk/LoggerServiceProtocol;", "D", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RiskInternal {
    private final double blockTime;

    @NotNull
    private final DeviceDataService deviceDataService;

    @NotNull
    private final FingerprintService fingerprintService;
    private final double fpLoadTime;

    @NotNull
    private final LoggerServiceProtocol loggerService;

    public RiskInternal(@NotNull FingerprintService fingerprintService, @NotNull DeviceDataService deviceDataService, @NotNull LoggerServiceProtocol loggerService, double d4, double d9) {
        Intrinsics.echo(fingerprintService, "fingerprintService");
        Intrinsics.echo(deviceDataService, "deviceDataService");
        Intrinsics.echo(loggerService, "loggerService");
        this.fingerprintService = fingerprintService;
        this.deviceDataService = deviceDataService;
        this.loggerService = loggerService;
        this.blockTime = d4;
        this.fpLoadTime = d9;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object publishData(@Nullable String str, @NotNull c<? super PublishDataResult> cVar) {
        RiskInternal$publishData$1 riskInternal$publishData$1;
        int i4;
        String str2;
        long j5;
        RiskInternal riskInternal;
        FingerprintResult fingerprintResult;
        double d4;
        long j6;
        double d9;
        FingerprintResult fingerprintResult2;
        RiskInternal riskInternal2;
        NetworkResult networkResult;
        String str3;
        if (cVar instanceof RiskInternal$publishData$1) {
            riskInternal$publishData$1 = (RiskInternal$publishData$1) cVar;
            int i5 = riskInternal$publishData$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                riskInternal$publishData$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = riskInternal$publishData$1.result;
                a aVar = a.alpha;
                i4 = riskInternal$publishData$1.label;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            j6 = riskInternal$publishData$1.J$0;
                            d9 = riskInternal$publishData$1.D$0;
                            fingerprintResult2 = (FingerprintResult) riskInternal$publishData$1.L$1;
                            riskInternal2 = (RiskInternal) riskInternal$publishData$1.L$0;
                            ResultKt.alpha(obj);
                            d4 = 1000000.0d;
                            networkResult = (NetworkResult) obj;
                            if (!(networkResult instanceof NetworkResult.Success)) {
                                LoggerServiceProtocol loggerServiceProtocol = riskInternal2.loggerService;
                                double d10 = riskInternal2.blockTime;
                                double d11 = riskInternal2.fpLoadTime;
                                RiskEvent riskEvent = RiskEvent.PUBLISHED;
                                String requestId = ((FingerprintResult.Success) fingerprintResult2).getRequestId();
                                NetworkResult.Success success = (NetworkResult.Success) networkResult;
                                LoggerServiceProtocol.DefaultImpls.log$default(loggerServiceProtocol, riskEvent, new Double(d10), new Double((System.nanoTime() - j6) / d4), new Double(d11), new Double(d9), ((PersistFingerprintDataResponse) success.getData()).getDeviceSessionId(), requestId, null, 128, null);
                                return new PublishDataResult.Success(((PersistFingerprintDataResponse) success.getData()).getDeviceSessionId());
                            }
                            if (networkResult instanceof NetworkResult.Error) {
                                LoggerServiceProtocol loggerServiceProtocol2 = riskInternal2.loggerService;
                                double d12 = riskInternal2.blockTime;
                                double d13 = riskInternal2.fpLoadTime;
                                RiskEvent riskEvent2 = RiskEvent.PUBLISH_FAILURE;
                                NetworkResult.Error error = (NetworkResult.Error) networkResult;
                                String message = error.getMessage();
                                Throwable innerException = error.getInnerException();
                                if (innerException != null) {
                                    str3 = innerException.getClass().getName();
                                } else {
                                    str3 = null;
                                }
                                LoggerServiceProtocol.DefaultImpls.log$default(loggerServiceProtocol2, riskEvent2, new Double(d12), null, new Double(d13), new Double(d9), null, null, new RiskLogError("persistFingerprintData", message, null, "Device Data Service Error", str3), 100, null);
                                return PublishDataResult.PublishFailure.INSTANCE;
                            }
                            if (networkResult instanceof NetworkResult.Exception) {
                                LoggerServiceProtocol loggerServiceProtocol3 = riskInternal2.loggerService;
                                double d14 = riskInternal2.blockTime;
                                double d15 = riskInternal2.fpLoadTime;
                                RiskEvent riskEvent3 = RiskEvent.PUBLISH_FAILURE;
                                NetworkResult.Exception exception = (NetworkResult.Exception) networkResult;
                                String message2 = exception.getE().getMessage();
                                if (message2 == null) {
                                    message2 = LogMessages.UNKNOWN_ERROR;
                                }
                                LoggerServiceProtocol.DefaultImpls.log$default(loggerServiceProtocol3, riskEvent3, new Double(d14), null, new Double(d15), new Double(d9), null, null, new RiskLogError("persistFingerprintData", message2, new Integer(exception.getE().hashCode()), "Device Data Service Error", exception.getE().getClass().getName()), 100, null);
                                return PublishDataResult.PublishFailure.INSTANCE;
                            }
                            LoggerServiceProtocol.DefaultImpls.log$default(riskInternal2.loggerService, RiskEvent.PUBLISH_FAILURE, new Double(riskInternal2.blockTime), null, new Double(riskInternal2.fpLoadTime), new Double(d9), null, null, new RiskLogError("persistFingerprintData", LogMessages.UNKNOWN_ERROR, null, "Device Data Service Error", LogMessages.UNKNOWN_ERROR), 100, null);
                            return PublishDataResult.PublishFailure.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    j5 = riskInternal$publishData$1.J$0;
                    str2 = (String) riskInternal$publishData$1.L$1;
                    riskInternal = (RiskInternal) riskInternal$publishData$1.L$0;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    long nanoTime = System.nanoTime();
                    FingerprintService fingerprintService = this.fingerprintService;
                    riskInternal$publishData$1.L$0 = this;
                    str2 = str;
                    riskInternal$publishData$1.L$1 = str2;
                    riskInternal$publishData$1.J$0 = nanoTime;
                    riskInternal$publishData$1.label = 1;
                    obj = fingerprintService.publishData(riskInternal$publishData$1);
                    if (obj != aVar) {
                        j5 = nanoTime;
                        riskInternal = this;
                    }
                    return aVar;
                }
                fingerprintResult = (FingerprintResult) obj;
                if (!(fingerprintResult instanceof FingerprintResult.Success)) {
                    double nanoTime2 = (System.nanoTime() - j5) / 1000000.0d;
                    FingerprintResult.Success success2 = (FingerprintResult.Success) fingerprintResult;
                    d4 = 1000000.0d;
                    LoggerServiceProtocol.DefaultImpls.log$default(riskInternal.loggerService, RiskEvent.COLLECTED, new Double(riskInternal.blockTime), null, new Double(riskInternal.fpLoadTime), new Double(nanoTime2), null, success2.getRequestId(), null, 164, null);
                    long nanoTime3 = System.nanoTime();
                    DeviceDataService deviceDataService = riskInternal.deviceDataService;
                    String requestId2 = success2.getRequestId();
                    riskInternal$publishData$1.L$0 = riskInternal;
                    riskInternal$publishData$1.L$1 = fingerprintResult;
                    riskInternal$publishData$1.D$0 = nanoTime2;
                    riskInternal$publishData$1.J$0 = nanoTime3;
                    riskInternal$publishData$1.label = 2;
                    Object persistFingerprintData = deviceDataService.persistFingerprintData(requestId2, str2, riskInternal$publishData$1);
                    if (persistFingerprintData != aVar) {
                        j6 = nanoTime3;
                        d9 = nanoTime2;
                        fingerprintResult2 = fingerprintResult;
                        obj = persistFingerprintData;
                        riskInternal2 = riskInternal;
                        networkResult = (NetworkResult) obj;
                        if (!(networkResult instanceof NetworkResult.Success)) {
                        }
                    }
                    return aVar;
                }
                if (fingerprintResult instanceof FingerprintResult.Failure) {
                    LoggerServiceProtocol.DefaultImpls.log$default(riskInternal.loggerService, RiskEvent.PUBLISH_FAILURE, new Double(riskInternal.blockTime), null, new Double(riskInternal.fpLoadTime), null, null, null, new RiskLogError("publishData", ((FingerprintResult.Failure) fingerprintResult).getDescription(), null, "Fingerprint Service Error", null, 16, null), 116, null);
                    return PublishDataResult.PublishFailure.INSTANCE;
                }
                LoggerServiceProtocol.DefaultImpls.log$default(riskInternal.loggerService, RiskEvent.PUBLISH_FAILURE, new Double(riskInternal.blockTime), null, new Double(riskInternal.fpLoadTime), null, null, null, new RiskLogError("publishData", LogMessages.UNKNOWN_ERROR, null, "Fingerprint Service Error", null, 16, null), 116, null);
                return PublishDataResult.PublishFailure.INSTANCE;
            }
        }
        riskInternal$publishData$1 = new RiskInternal$publishData$1(this, cVar);
        Object obj2 = riskInternal$publishData$1.result;
        a aVar2 = a.alpha;
        i4 = riskInternal$publishData$1.label;
        if (i4 == 0) {
        }
        fingerprintResult = (FingerprintResult) obj2;
        if (!(fingerprintResult instanceof FingerprintResult.Success)) {
        }
    }
}
