package com.checkout.risk;

import Nd.c;
import Od.a;
import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.kmp.rememberme.logging.LogMessages;
import com.checkout.risk.LoggerServiceProtocol;
import com.checkout.risk.NetworkResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lcom/checkout/risk/Risk;", "", "Lcom/checkout/risk/RiskInternal;", "riskInternal", "<init>", "(Lcom/checkout/risk/RiskInternal;)V", "", "cardToken", "Lcom/checkout/risk/PublishDataResult;", "publishData", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/risk/RiskInternal;", "Companion", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Risk {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static DeviceDataService deviceDataService;

    @Nullable
    private static Risk riskInstance;

    @NotNull
    private final RiskInternal riskInternal;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Lcom/checkout/risk/Risk$Companion;", "", "<init>", "()V", "Landroid/content/Context;", "applicationContext", "Lcom/checkout/risk/RiskConfig;", com.clevertap.android.sdk.Constants.KEY_CONFIG, "Lcom/checkout/risk/Risk;", "getInstance", "(Landroid/content/Context;Lcom/checkout/risk/RiskConfig;LNd/c;)Ljava/lang/Object;", "Lcom/checkout/risk/DeviceDataService;", "deviceDataService", "Lcom/checkout/risk/DeviceDataService;", "riskInstance", "Lcom/checkout/risk/Risk;", "Risk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x004a  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
        @Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object getInstance(@NotNull Context context, @NotNull RiskConfig riskConfig, @NotNull c<? super Risk> cVar) {
            Risk$Companion$getInstance$1 risk$Companion$getInstance$1;
            int i4;
            LoggerService loggerService;
            long j5;
            RiskSDKInternalConfigImpl riskSDKInternalConfigImpl;
            NetworkResult networkResult;
            String str;
            Context context2 = context;
            if (cVar instanceof Risk$Companion$getInstance$1) {
                risk$Companion$getInstance$1 = (Risk$Companion$getInstance$1) cVar;
                int i5 = risk$Companion$getInstance$1.label;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    risk$Companion$getInstance$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = risk$Companion$getInstance$1.result;
                    a aVar = a.alpha;
                    i4 = risk$Companion$getInstance$1.label;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            j5 = risk$Companion$getInstance$1.J$0;
                            LoggerService loggerService2 = (LoggerService) risk$Companion$getInstance$1.L$2;
                            riskSDKInternalConfigImpl = (RiskSDKInternalConfigImpl) risk$Companion$getInstance$1.L$1;
                            Context context3 = (Context) risk$Companion$getInstance$1.L$0;
                            ResultKt.alpha(obj);
                            loggerService = loggerService2;
                            context2 = context3;
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        Risk risk = Risk.riskInstance;
                        if (risk != null) {
                            return risk;
                        }
                        RiskSDKInternalConfigImpl riskSDKInternalConfigImpl2 = new RiskSDKInternalConfigImpl(riskConfig);
                        LoggerService loggerService3 = new LoggerService(riskSDKInternalConfigImpl2, context2);
                        Risk.deviceDataService = new DeviceDataService(riskSDKInternalConfigImpl2);
                        long nanoTime = System.nanoTime();
                        DeviceDataService deviceDataService = Risk.deviceDataService;
                        if (deviceDataService != null) {
                            risk$Companion$getInstance$1.L$0 = context2;
                            risk$Companion$getInstance$1.L$1 = riskSDKInternalConfigImpl2;
                            risk$Companion$getInstance$1.L$2 = loggerService3;
                            risk$Companion$getInstance$1.J$0 = nanoTime;
                            risk$Companion$getInstance$1.label = 1;
                            Object configuration = deviceDataService.getConfiguration(risk$Companion$getInstance$1);
                            if (configuration == aVar) {
                                return aVar;
                            }
                            loggerService = loggerService3;
                            j5 = nanoTime;
                            riskSDKInternalConfigImpl = riskSDKInternalConfigImpl2;
                            obj = configuration;
                        } else {
                            Intrinsics.lima("deviceDataService");
                            throw null;
                        }
                    }
                    networkResult = (NetworkResult) obj;
                    if (!(networkResult instanceof NetworkResult.Success)) {
                        double nanoTime2 = (System.nanoTime() - j5) / 1000000.0d;
                        NetworkResult.Success success = (NetworkResult.Success) networkResult;
                        if (((DeviceDataConfiguration) success.getData()).getFingerprintIntegration().getEnabled() && ((DeviceDataConfiguration) success.getData()).getFingerprintIntegration().getPublicKey() != null) {
                            long nanoTime3 = System.nanoTime();
                            FingerprintService fingerprintService = new FingerprintService(context2, riskSDKInternalConfigImpl, ((DeviceDataConfiguration) success.getData()).getFingerprintIntegration().getPublicKey());
                            double nanoTime4 = (System.nanoTime() - nanoTime3) / 1000000.0d;
                            LoggerService loggerService4 = loggerService;
                            DeviceDataService deviceDataService2 = Risk.deviceDataService;
                            if (deviceDataService2 != null) {
                                return new Risk(new RiskInternal(fingerprintService, deviceDataService2, loggerService4, nanoTime2, nanoTime4), defaultConstructorMarker);
                            }
                            Intrinsics.lima("deviceDataService");
                            throw null;
                        }
                        LoggerServiceProtocol.DefaultImpls.log$default(loggerService, RiskEvent.PUBLISH_DISABLED, new Double(nanoTime2), null, null, null, null, null, new RiskLogError("getConfiguration", "Fingerprint integration disabled", null, "Device Data Service Error", null, 16, null), 124, null);
                        return null;
                    }
                    if (networkResult instanceof NetworkResult.Error) {
                        RiskEvent riskEvent = RiskEvent.LOAD_FAILURE;
                        NetworkResult.Error error = (NetworkResult.Error) networkResult;
                        String message = error.getMessage();
                        Throwable innerException = error.getInnerException();
                        if (innerException != null) {
                            str = innerException.getClass().getName();
                        } else {
                            str = null;
                        }
                        LoggerServiceProtocol.DefaultImpls.log$default(loggerService, riskEvent, null, null, null, null, null, null, new RiskLogError("getConfiguration", message, null, "Device Data Service Error", str), 126, null);
                        return null;
                    }
                    if (networkResult instanceof NetworkResult.Exception) {
                        RiskEvent riskEvent2 = RiskEvent.LOAD_FAILURE;
                        NetworkResult.Exception exception = (NetworkResult.Exception) networkResult;
                        String message2 = exception.getE().getMessage();
                        if (message2 == null) {
                            message2 = LogMessages.UNKNOWN_ERROR;
                        }
                        LoggerServiceProtocol.DefaultImpls.log$default(loggerService, riskEvent2, null, null, null, null, null, null, new RiskLogError("getConfiguration", message2, null, "Device Data Service Error", exception.getE().getClass().getName()), 126, null);
                        return null;
                    }
                    LoggerServiceProtocol.DefaultImpls.log$default(loggerService, RiskEvent.LOAD_FAILURE, null, null, null, null, null, null, new RiskLogError("getConfiguration", LogMessages.UNKNOWN_ERROR, null, "Device Data Service Error", LogMessages.UNKNOWN_ERROR), 126, null);
                    return null;
                }
            }
            risk$Companion$getInstance$1 = new Risk$Companion$getInstance$1(this, cVar);
            Object obj2 = risk$Companion$getInstance$1.result;
            a aVar2 = a.alpha;
            i4 = risk$Companion$getInstance$1.label;
            DefaultConstructorMarker defaultConstructorMarker2 = null;
            if (i4 == 0) {
            }
            networkResult = (NetworkResult) obj2;
            if (!(networkResult instanceof NetworkResult.Success)) {
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ Risk(RiskInternal riskInternal, DefaultConstructorMarker defaultConstructorMarker) {
        this(riskInternal);
    }

    public static /* synthetic */ Object publishData$default(Risk risk, String str, c cVar, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = null;
        }
        return risk.publishData(str, cVar);
    }

    @Nullable
    public final Object publishData(@Nullable String str, @NotNull c<? super PublishDataResult> cVar) {
        return this.riskInternal.publishData(str, cVar);
    }

    private Risk(RiskInternal riskInternal) {
        this.riskInternal = riskInternal;
    }
}
