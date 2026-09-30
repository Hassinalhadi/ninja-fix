package com.checkout.components.insight;

import Pd.i;
import Xd.l;
import com.checkout.components.insight.data.dto.Events;
import com.checkout.components.insight.network.model.InsightResult;
import com.checkout.components.insight.usecase.SendLogsUseCase;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class c extends i implements l {

    /* renamed from: a, reason: collision with root package name */
    public int f5129a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LoggerManager f5130b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Events f5131c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(LoggerManager loggerManager, Events events, Nd.c cVar) {
        super(2, cVar);
        this.f5130b = loggerManager;
        this.f5131c = events;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new c(this.f5130b, this.f5131c, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return new c(this.f5130b, this.f5131c, (Nd.c) obj2).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        SendLogsUseCase sendLogsUseCase;
        String str;
        Od.a aVar = Od.a.alpha;
        int i4 = this.f5129a;
        try {
            if (i4 != 0) {
                if (i4 == 1) {
                    ResultKt.alpha(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.alpha(obj);
                sendLogsUseCase = this.f5130b.e;
                str = this.f5130b.f5106a;
                Events events = this.f5131c;
                this.f5129a = 1;
                obj = sendLogsUseCase.invoke(str, events, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            InsightResult insightResult = (InsightResult) obj;
            if (!(insightResult instanceof InsightResult.Error) && !(insightResult instanceof InsightResult.Success)) {
                throw new NoWhenBranchMatchedException();
            }
        } catch (Exception unused) {
        }
        return Unit.INSTANCE;
    }
}
