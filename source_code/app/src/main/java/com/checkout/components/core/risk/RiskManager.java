package com.checkout.components.core.risk;

import Cf.d;
import Cf.e;
import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.core.H;
import com.checkout.components.core.J;
import com.checkout.components.core.K;
import com.checkout.components.core.L;
import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.interfaces.insight.Logger;
import com.checkout.risk.PublishDataResult;
import com.checkout.risk.Risk;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.I;
import vf.ab;
import vf.ad;
import vf.ao;
import vf.f0;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B#\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u000eH\u0081@¢\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0080@¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0081@¢\u0006\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/checkout/components/core/risk/RiskManager;", "", "Lcom/checkout/components/interfaces/insight/Logger;", "logger", "Lcom/checkout/components/core/risk/RiskFactory;", "factory", "Lvf/ab;", "networkCoroutineScope", "<init>", "(Lcom/checkout/components/interfaces/insight/Logger;Lcom/checkout/components/core/risk/RiskFactory;Lvf/ab;)V", "Lvf/I;", "initialize$core_standardRelease", "()Lvf/I;", "initialize", "Lkotlin/Result;", "Lcom/checkout/risk/Risk;", "performInitialize-IoAF18A$core_standardRelease", "(LNd/c;)Ljava/lang/Object;", "performInitialize", "", "token", "publishAndHandleRiskResult$core_standardRelease", "(Ljava/lang/String;LNd/c;)Ljava/lang/Object;", "publishAndHandleRiskResult", "getRiskInstance$core_standardRelease", "()Lcom/checkout/risk/Risk;", "getRiskInstance", "Lcom/checkout/risk/PublishDataResult;", "publishRiskData$core_standardRelease", "publishRiskData", "a", "Lcom/checkout/components/interfaces/insight/Logger;", "getLogger$core_standardRelease", "()Lcom/checkout/components/interfaces/insight/Logger;", "core_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class RiskManager {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Logger logger;

    /* renamed from: b, reason: collision with root package name */
    private final RiskFactory f5000b;

    /* renamed from: c, reason: collision with root package name */
    private final ab f5001c;

    /* renamed from: d, reason: collision with root package name */
    private Risk f5002d;

    public RiskManager(@NotNull Logger logger, @NotNull RiskFactory factory, @NotNull ab networkCoroutineScope) {
        Intrinsics.echo(logger, "logger");
        Intrinsics.echo(factory, "factory");
        Intrinsics.echo(networkCoroutineScope, "networkCoroutineScope");
        this.logger = logger;
        this.f5000b = factory;
        this.f5001c = networkCoroutineScope;
    }

    @NotNull
    /* renamed from: getLogger$core_standardRelease, reason: from getter */
    public final Logger getLogger() {
        return this.logger;
    }

    @Nullable
    /* renamed from: getRiskInstance$core_standardRelease, reason: from getter */
    public final Risk getF5002d() {
        return this.f5002d;
    }

    @NotNull
    public final I initialize$core_standardRelease() {
        return ad.zulu(this.f5001c, null, null, new H(this, null), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Nullable
    /* renamed from: performInitialize-IoAF18A$core_standardRelease, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m85performInitializeIoAF18A$core_standardRelease(@NotNull c<? super Result<Risk>> cVar) {
        com.checkout.components.core.I i4;
        int i5;
        if (cVar instanceof com.checkout.components.core.I) {
            i4 = (com.checkout.components.core.I) cVar;
            int i10 = i4.f4636c;
            if ((i10 & RecyclerView.UNDEFINED_DURATION) != 0) {
                i4.f4636c = i10 - RecyclerView.UNDEFINED_DURATION;
                Object obj = i4.f4634a;
                a aVar = a.alpha;
                i5 = i4.f4636c;
                if (i5 == 0) {
                    if (i5 == 1) {
                        ResultKt.alpha(obj);
                        return ((Result) obj).alpha;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.alpha(obj);
                Risk risk = this.f5002d;
                if (risk != null) {
                    return Result.m206constructorimpl(risk);
                }
                RiskFactory riskFactory = this.f5000b;
                i4.f4636c = 1;
                Object m84buildIoAF18A$core_standardRelease = riskFactory.m84buildIoAF18A$core_standardRelease(i4);
                if (m84buildIoAF18A$core_standardRelease == aVar) {
                    return aVar;
                }
                return m84buildIoAF18A$core_standardRelease;
            }
        }
        i4 = new com.checkout.components.core.I(this, cVar);
        Object obj2 = i4.f4634a;
        a aVar2 = a.alpha;
        i5 = i4.f4636c;
        if (i5 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object publishAndHandleRiskResult$core_standardRelease(@Nullable String str, @NotNull c<? super String> cVar) {
        J j5;
        int i4;
        PublishDataResult publishDataResult;
        if (cVar instanceof J) {
            j5 = (J) cVar;
            int i5 = j5.f4640d;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                j5.f4640d = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = j5.f4638b;
                Object obj2 = a.alpha;
                i4 = j5.f4640d;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    j5.f4637a = null;
                    j5.f4640d = 1;
                    obj = publishRiskData$core_standardRelease(str, j5);
                    if (obj == obj2) {
                        return obj2;
                    }
                }
                publishDataResult = (PublishDataResult) obj;
                if (!Intrinsics.areEqual(publishDataResult, PublishDataResult.PublishFailure.INSTANCE)) {
                    this.logger.logWarning("RISK_SDK_PUBLISH_DATA_FAILED");
                    return null;
                }
                if (publishDataResult instanceof PublishDataResult.Success) {
                    return ((PublishDataResult.Success) publishDataResult).getDeviceSessionId();
                }
                if (publishDataResult == null) {
                    N4.a.delta(this.logger, "integration_error", "RISK_SDK_PUBLISH_DATA_ERROR", CommonErrorMessages.RISK_SDK_ERROR_PUBLISHING_DATA_DETAILS, null, 8, null);
                    return null;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        j5 = new J(this, cVar);
        Object obj3 = j5.f4638b;
        Object obj22 = a.alpha;
        i4 = j5.f4640d;
        if (i4 == 0) {
        }
        publishDataResult = (PublishDataResult) obj3;
        if (!Intrinsics.areEqual(publishDataResult, PublishDataResult.PublishFailure.INSTANCE)) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object publishRiskData$core_standardRelease(@Nullable String str, @NotNull c<? super PublishDataResult> cVar) {
        K k6;
        int i4;
        try {
            if (cVar instanceof K) {
                k6 = (K) cVar;
                int i5 = k6.f4644d;
                if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                    k6.f4644d = i5 - RecyclerView.UNDEFINED_DURATION;
                    Object obj = k6.f4642b;
                    a aVar = a.alpha;
                    i4 = k6.f4644d;
                    if (i4 == 0) {
                        if (i4 == 1) {
                            ResultKt.alpha(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        ResultKt.alpha(obj);
                        L l10 = new L(this, str, null);
                        k6.f4641a = null;
                        k6.f4644d = 1;
                        obj = f0.bravo(5000L, l10, k6);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    return (PublishDataResult) obj;
                }
            }
            if (i4 == 0) {
            }
            return (PublishDataResult) obj;
        } catch (Exception unused) {
            return null;
        }
        k6 = new K(this, cVar);
        Object obj2 = k6.f4642b;
        a aVar2 = a.alpha;
        i4 = k6.f4644d;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RiskManager(Logger logger, RiskFactory riskFactory, ab abVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(logger, riskFactory, abVar);
        if ((i4 & 4) != 0) {
            e eVar = ao.alpha;
            abVar = ad.charlie(d.purple);
        }
    }
}
