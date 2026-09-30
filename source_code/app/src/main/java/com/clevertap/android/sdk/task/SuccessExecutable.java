package com.clevertap.android.sdk.task;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class SuccessExecutable<TResult> extends Executable<TResult> {
    private final OnSuccessListener<TResult> successListener;

    public SuccessExecutable(Executor executor, OnSuccessListener<TResult> onSuccessListener) {
        super(executor);
        this.successListener = onSuccessListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$execute$0(Object obj) {
        this.successListener.onSuccess(obj);
    }

    @Override // com.clevertap.android.sdk.task.Executable
    public void execute(final TResult tresult) {
        this.executor.execute(new Runnable() { // from class: com.clevertap.android.sdk.task.b
            @Override // java.lang.Runnable
            public final void run() {
                SuccessExecutable.this.lambda$execute$0(tresult);
            }
        });
    }

    public OnSuccessListener<TResult> getSuccessListener() {
        return this.successListener;
    }
}
