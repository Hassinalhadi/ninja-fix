package com.checkout.components.wallet;

import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a implements G6.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Nd.j f6447a;

    public a(Nd.j jVar) {
        this.f6447a = jVar;
    }

    @Override // G6.e
    public final void onComplete(Task task) {
        Intrinsics.echo(task, "task");
        Nd.j jVar = this.f6447a;
        Result.Companion companion = Result.INSTANCE;
        jVar.resumeWith(Result.m206constructorimpl(task.hotel()));
    }
}
