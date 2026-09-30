package com.checkout.components.core;

import com.checkout.components.core.error.CommonErrorMessages;
import com.checkout.components.core.risk.RiskManager;
import com.checkout.risk.Risk;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import s6.AbstractC2689j6;

/* loaded from: classes3.dex */
public final class H extends Pd.i implements Xd.l {

    /* renamed from: a, reason: collision with root package name */
    public int f4632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RiskManager f4633b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H(RiskManager riskManager, Nd.c cVar) {
        super(2, cVar);
        this.f4633b = riskManager;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new H(this.f4633b, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new H(this.f4633b, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Object m85performInitializeIoAF18A$core_standardRelease;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f4632a;
        if (i4 != 0) {
            if (i4 == 1) {
                ResultKt.alpha(obj);
                m85performInitializeIoAF18A$core_standardRelease = ((Result) obj).alpha;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.alpha(obj);
            RiskManager riskManager = this.f4633b;
            this.f4632a = 1;
            m85performInitializeIoAF18A$core_standardRelease = riskManager.m85performInitializeIoAF18A$core_standardRelease(this);
            if (m85performInitializeIoAF18A$core_standardRelease == aVar) {
                return aVar;
            }
        }
        RiskManager riskManager2 = this.f4633b;
        Result.Companion companion = Result.INSTANCE;
        if (!(m85performInitializeIoAF18A$core_standardRelease instanceof kotlin.k)) {
            riskManager2.f5002d = (Risk) m85performInitializeIoAF18A$core_standardRelease;
        }
        RiskManager riskManager3 = this.f4633b;
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(m85performInitializeIoAF18A$core_standardRelease);
        if (m207exceptionOrNullimpl != null) {
            riskManager3.getLogger().logWarning("integration_error", "RISK_SDK_INITIALISATION_FAILED", CommonErrorMessages.RISK_SDK_FAILED_ON_INITIALISATION, AbstractC2689j6.echo(m207exceptionOrNullimpl));
        }
        return Unit.INSTANCE;
    }
}
