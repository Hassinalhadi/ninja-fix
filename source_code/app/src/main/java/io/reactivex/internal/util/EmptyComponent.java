package io.reactivex.internal.util;

import io.reactivex.CompletableObserver;
import io.reactivex.FlowableSubscriber;
import io.reactivex.MaybeObserver;
import io.reactivex.Observer;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.plugins.RxJavaPlugins;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public enum EmptyComponent implements FlowableSubscriber<Object>, Observer<Object>, MaybeObserver<Object>, SingleObserver<Object>, CompletableObserver, d, Disposable {
    INSTANCE;

    public static <T> Observer<T> asObserver() {
        return INSTANCE;
    }

    public static <T> c asSubscriber() {
        return INSTANCE;
    }

    @Override // qg.d
    public void cancel() {
    }

    @Override // io.reactivex.disposables.Disposable
    public void dispose() {
    }

    @Override // io.reactivex.disposables.Disposable
    public boolean isDisposed() {
        return true;
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        RxJavaPlugins.onError(th);
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onNext(Object obj) {
    }

    @Override // io.reactivex.Observer
    public void onSubscribe(Disposable disposable) {
        disposable.dispose();
    }

    @Override // io.reactivex.MaybeObserver
    public void onSuccess(Object obj) {
    }

    @Override // qg.d
    public void request(long j5) {
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        dVar.cancel();
    }
}
