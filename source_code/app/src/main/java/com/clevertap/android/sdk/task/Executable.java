package com.clevertap.android.sdk.task;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
abstract class Executable<TResult> {
    protected final Executor executor;

    public Executable(Executor executor) {
        this.executor = executor;
    }

    public abstract void execute(TResult tresult);
}
