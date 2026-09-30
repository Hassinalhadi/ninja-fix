package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1827e;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class FmN extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ WA f8727W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Xtf f8728b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FmN(Xtf xtf, WA wa2) {
        super(1);
        this.f8728b = xtf;
        this.f8727W = wa2;
    }

    public final void b(Object obj) {
        Xtf xtf = this.f8728b;
        xtf.f9962b.b(new C1827e(obj, this.f8727W, xtf, 0));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    public static final void b(Object obj, Function1 function1, Xtf xtf) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl == null) {
            j.quebec(Result.m206constructorimpl(new LO((String) xtf.f9963f9.getValue(), (List) obj)), function1);
        } else {
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)), function1);
        }
    }
}
