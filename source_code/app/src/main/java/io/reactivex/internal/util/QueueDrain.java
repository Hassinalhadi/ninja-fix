package io.reactivex.internal.util;

import qg.c;

/* loaded from: classes2.dex */
public interface QueueDrain<T, U> {
    boolean accept(c cVar, T t5);

    boolean cancelled();

    boolean done();

    boolean enter();

    Throwable error();

    int leave(int i4);

    long produced(long j5);

    long requested();
}
