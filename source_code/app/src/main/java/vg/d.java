package vg;

import okhttp3.Request;

/* loaded from: classes2.dex */
public interface d<T> extends Cloneable {
    void cancel();

    /* renamed from: clone */
    d mo370clone();

    aq execute();

    boolean isCanceled();

    void o(g gVar);

    Request request();
}
