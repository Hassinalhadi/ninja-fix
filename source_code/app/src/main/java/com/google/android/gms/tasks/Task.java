package com.google.android.gms.tasks;

import G6.c;
import G6.d;
import G6.e;
import G6.g;
import G6.q;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public abstract class Task {
    public abstract q alpha(Executor executor, d dVar);

    public abstract q bravo(e eVar);

    public abstract q charlie(Executor executor, e eVar);

    public abstract q delta(Executor executor, OnFailureListener onFailureListener);

    public abstract q echo(Executor executor, OnSuccessListener onSuccessListener);

    public abstract q foxtrot(Executor executor, c cVar);

    public abstract Exception golf();

    public abstract Object hotel();

    public abstract boolean india();

    public abstract boolean juliet();

    public abstract q kilo(g gVar);
}
