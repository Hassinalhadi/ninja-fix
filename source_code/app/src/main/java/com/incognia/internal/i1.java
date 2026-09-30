package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1827e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class i1 extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Function1 f10600W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ hm f10601b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(hm hmVar, Function1 function1) {
        super(1);
        this.f10601b = hmVar;
        this.f10600W = function1;
    }

    public final void b(Object obj) {
        hm hmVar = this.f10601b;
        hmVar.f10566W.b(new C1827e(obj, (Object) hmVar, this.f10600W, 8));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    public static final void b(Object obj, hm hmVar, Function1 function1) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl == null) {
            SO so = (SO) obj;
            ZJ zj = hmVar.gmP;
            if (zj == null || !zj.f10037W.compareAndSet(0, 3)) {
                return;
            }
            j.quebec(Result.m206constructorimpl(new L((String) hmVar.sVU.getValue(), so)), function1);
            return;
        }
        ZJ zj2 = hmVar.gmP;
        if (zj2 == null || !zj2.f10037W.compareAndSet(0, 3)) {
            return;
        }
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)), function1);
    }
}
