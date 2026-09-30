package io.reactivex;

import io.reactivex.annotations.NonNull;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public interface FlowableSubscriber<T> extends c {
    @Override // qg.c
    /* synthetic */ void onComplete();

    @Override // qg.c
    /* synthetic */ void onError(Throwable th);

    @Override // qg.c
    /* synthetic */ void onNext(Object obj);

    @Override // qg.c
    void onSubscribe(@NonNull d dVar);
}
