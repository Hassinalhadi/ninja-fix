package qg;

/* loaded from: classes2.dex */
public interface c {
    void onComplete();

    void onError(Throwable th);

    void onNext(Object obj);

    void onSubscribe(d dVar);
}
