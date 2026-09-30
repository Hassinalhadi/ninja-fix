package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1827e;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class yi extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ WA f11868W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FnB f11869b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yi(FnB fnB, WA wa2) {
        super(1);
        this.f11869b = fnB;
        this.f11868W = wa2;
    }

    public final void b(Object obj) {
        FnB fnB = this.f11869b;
        fnB.f8734b.b(new C1827e(obj, this.f11868W, fnB, 10));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    public static final void b(Object obj, Function1 function1, FnB fnB) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl == null) {
            R0t r0t = (R0t) obj;
            j.quebec(Result.m206constructorimpl(new P7R((String) fnB.f8735f9.getValue(), r0t != null ? Integer.valueOf(r0t.f9533b) : null, new Jj6(new XlW(r0t)))), function1);
        } else {
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)), function1);
        }
    }
}
