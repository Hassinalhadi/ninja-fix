package com.checkout.components.insight.usecase;

import Nd.c;
import Od.a;
import androidx.recyclerview.widget.RecyclerView;
import com.checkout.components.insight.d;
import com.checkout.components.insight.data.dto.Events;
import com.checkout.components.insight.domain.repository.InsightRepository;
import com.checkout.components.insight.network.model.InsightResult;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Response;
import vg.aq;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0086B¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/insight/usecase/SendLogsUseCase;", "", "Lcom/checkout/components/insight/domain/repository/InsightRepository;", "repository", "<init>", "(Lcom/checkout/components/insight/domain/repository/InsightRepository;)V", "", "publicKey", "Lcom/checkout/components/insight/data/dto/Events;", "body", "Lcom/checkout/components/insight/network/model/InsightResult;", "", "invoke", "(Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Events;LNd/c;)Ljava/lang/Object;", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SendLogsUseCase {

    /* renamed from: a, reason: collision with root package name */
    private final InsightRepository f5256a;

    public SendLogsUseCase(InsightRepository repository) {
        Intrinsics.echo(repository, "repository");
        this.f5256a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(String str, Events events, c<? super InsightResult<Unit>> cVar) {
        d dVar;
        int i4;
        aq aqVar;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i5 = dVar.e;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                dVar.e = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = dVar.f5135c;
                a aVar = a.alpha;
                i4 = dVar.e;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    InsightRepository insightRepository = this.f5256a;
                    dVar.f5133a = null;
                    dVar.f5134b = null;
                    dVar.e = 1;
                    obj = insightRepository.sendLogBatch(str, events, dVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                aqVar = (aq) obj;
                if (!aqVar.alpha.getIsSuccessful()) {
                    return new InsightResult.Success(Unit.INSTANCE);
                }
                Response response = aqVar.alpha;
                int code = response.code();
                String message = response.message();
                Intrinsics.delta(message, "message(...)");
                return new InsightResult.Error(code, message);
            }
        }
        dVar = new d(this, cVar);
        Object obj2 = dVar.f5135c;
        a aVar2 = a.alpha;
        i4 = dVar.e;
        if (i4 == 0) {
        }
        aqVar = (aq) obj2;
        if (!aqVar.alpha.getIsSuccessful()) {
        }
    }
}
