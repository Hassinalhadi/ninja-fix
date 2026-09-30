package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1827e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class Jup extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Function1 f8975W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Dl f8976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Jup(Dl dl, Function1 function1) {
        super(1);
        this.f8976b = dl;
        this.f8975W = function1;
    }

    public final void b(Object obj) {
        Dl dl = this.f8976b;
        dl.f8564f9.b(new C1827e(obj, (Object) dl, this.f8975W, 2));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    public static final void b(Object obj, Dl dl, Function1 function1) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl == null) {
            s0 s0Var = (s0) obj;
            ZJ zj = dl.gmP;
            if (zj == null || !zj.f10037W.compareAndSet(0, 3)) {
                return;
            }
            j.quebec(Result.m206constructorimpl(new tPp((String) dl.sVU.getValue(), s0Var)), function1);
            return;
        }
        ZJ zj2 = dl.gmP;
        if (zj2 == null || !zj2.f10037W.compareAndSet(0, 3)) {
            return;
        }
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)), function1);
    }
}
