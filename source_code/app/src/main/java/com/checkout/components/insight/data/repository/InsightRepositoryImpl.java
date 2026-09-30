package com.checkout.components.insight.data.repository;

import K4.a;
import Nd.c;
import com.checkout.components.insight.data.dto.Events;
import com.checkout.components.insight.data.remote.InsightApi;
import com.checkout.components.insight.domain.repository.InsightRepository;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import vg.aq;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J&\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/checkout/components/insight/data/repository/InsightRepositoryImpl;", "Lcom/checkout/components/insight/domain/repository/InsightRepository;", "Lcom/checkout/components/insight/data/remote/InsightApi;", "api", "<init>", "(Lcom/checkout/components/insight/data/remote/InsightApi;)V", "", "publicKey", "Lcom/checkout/components/insight/data/dto/Events;", "body", "Lvg/aq;", "", "sendLogBatch", "(Ljava/lang/String;Lcom/checkout/components/insight/data/dto/Events;LNd/c;)Ljava/lang/Object;", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InsightRepositoryImpl implements InsightRepository {

    /* renamed from: a, reason: collision with root package name */
    private final InsightApi f5224a;

    public InsightRepositoryImpl(InsightApi api) {
        Intrinsics.echo(api, "api");
        this.f5224a = api;
    }

    @Override // com.checkout.components.insight.domain.repository.InsightRepository
    public final Object sendLogBatch(String str, Events events, c<? super aq<Unit>> cVar) {
        return a.alpha(this.f5224a, null, str, null, null, events, cVar, 13, null);
    }
}
