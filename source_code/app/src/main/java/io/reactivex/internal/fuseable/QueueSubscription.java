package io.reactivex.internal.fuseable;

import qg.d;

/* loaded from: classes2.dex */
public interface QueueSubscription<T> extends QueueFuseable<T>, d {
    @Override // qg.d
    /* synthetic */ void cancel();

    @Override // qg.d
    /* synthetic */ void request(long j5);
}
