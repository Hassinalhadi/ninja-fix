package io.reactivex.subscribers;

import io.reactivex.FlowableSubscriber;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import io.reactivex.internal.util.AppendOnlyLinkedArrayList;
import io.reactivex.internal.util.NotificationLite;
import io.reactivex.plugins.RxJavaPlugins;
import qg.c;
import qg.d;

/* loaded from: classes2.dex */
public final class SerializedSubscriber<T> implements FlowableSubscriber<T>, d {
    static final int QUEUE_LINK_SIZE = 4;
    final boolean delayError;
    volatile boolean done;
    final c downstream;
    boolean emitting;
    AppendOnlyLinkedArrayList<Object> queue;
    d upstream;

    public SerializedSubscriber(c cVar) {
        this(cVar, false);
    }

    @Override // qg.d
    public void cancel() {
        this.upstream.cancel();
    }

    public void emitLoop() {
        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList;
        do {
            synchronized (this) {
                try {
                    appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        this.emitting = false;
                        return;
                    }
                    this.queue = null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        } while (!appendOnlyLinkedArrayList.accept(this.downstream));
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onComplete() {
        if (this.done) {
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                if (this.emitting) {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.complete());
                    return;
                }
                this.done = true;
                this.emitting = true;
                this.downstream.onComplete();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onError(Throwable th) {
        if (this.done) {
            RxJavaPlugins.onError(th);
            return;
        }
        synchronized (this) {
            try {
                boolean z2 = true;
                if (!this.done) {
                    if (this.emitting) {
                        this.done = true;
                        AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                        if (appendOnlyLinkedArrayList == null) {
                            appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                            this.queue = appendOnlyLinkedArrayList;
                        }
                        Object error = NotificationLite.error(th);
                        if (this.delayError) {
                            appendOnlyLinkedArrayList.add(error);
                        } else {
                            appendOnlyLinkedArrayList.setFirst(error);
                        }
                        return;
                    }
                    this.done = true;
                    this.emitting = true;
                    z2 = false;
                }
                if (z2) {
                    RxJavaPlugins.onError(th);
                } else {
                    this.downstream.onError(th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onNext(T t5) {
        if (this.done) {
            return;
        }
        if (t5 == null) {
            this.upstream.cancel();
            onError(new NullPointerException("onNext called with null. Null values are generally not allowed in 2.x operators and sources."));
            return;
        }
        synchronized (this) {
            try {
                if (this.done) {
                    return;
                }
                if (this.emitting) {
                    AppendOnlyLinkedArrayList<Object> appendOnlyLinkedArrayList = this.queue;
                    if (appendOnlyLinkedArrayList == null) {
                        appendOnlyLinkedArrayList = new AppendOnlyLinkedArrayList<>(4);
                        this.queue = appendOnlyLinkedArrayList;
                    }
                    appendOnlyLinkedArrayList.add(NotificationLite.next(t5));
                    return;
                }
                this.emitting = true;
                this.downstream.onNext(t5);
                emitLoop();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.reactivex.FlowableSubscriber, qg.c
    public void onSubscribe(d dVar) {
        if (SubscriptionHelper.validate(this.upstream, dVar)) {
            this.upstream = dVar;
            this.downstream.onSubscribe(this);
        }
    }

    @Override // qg.d
    public void request(long j5) {
        this.upstream.request(j5);
    }

    public SerializedSubscriber(c cVar, boolean z2) {
        this.downstream = cVar;
        this.delayError = z2;
    }
}
