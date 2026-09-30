package com.checkout.components.insight.domain.repository;

import Nd.c;
import com.checkout.components.insight.data.dto.Events;
import kotlin.Metadata;
import kotlin.Unit;
import vg.aq;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H¦@¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/checkout/components/insight/domain/repository/InsightRepository;", "", "", "publicKey", "Lcom/checkout/components/insight/data/dto/Events;", "body", "Lvg/aq;", "", "sendLogBatch", "(Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Events;LNd/c;)Ljava/lang/Object;", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface InsightRepository {
    Object sendLogBatch(String str, Events events, c<? super aq<Unit>> cVar);
}
