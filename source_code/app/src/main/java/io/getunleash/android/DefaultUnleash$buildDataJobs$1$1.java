package io.getunleash.android;

import Nd.c;
import io.getunleash.android.polling.UnleashFetcher;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

@Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* synthetic */ class DefaultUnleash$buildDataJobs$1$1 extends kotlin.jvm.internal.a implements Function1<c<? super Unit>, Object> {
    public DefaultUnleash$buildDataJobs$1$1(Object obj) {
        super(1, 8, UnleashFetcher.class, obj, "refreshToggles", "refreshToggles(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(c<? super Unit> cVar) {
        Object buildDataJobs$lambda$7$refreshToggles;
        buildDataJobs$lambda$7$refreshToggles = DefaultUnleash.buildDataJobs$lambda$7$refreshToggles((UnleashFetcher) this.receiver, cVar);
        return buildDataJobs$lambda$7$refreshToggles;
    }
}
