package com.incognia.internal;

import com.google.android.material.datepicker.j;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class xm extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ ul f11815W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f11816b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm(ul ulVar, Function1 function1) {
        super(1);
        this.f11816b = function1;
        this.f11815W = ulVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object obj2 = ((Result) obj).alpha;
        Function1 function1 = this.f11816b;
        ul ulVar = this.f11815W;
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj2);
        if (m207exceptionOrNullimpl == null) {
            j.quebec(Result.m206constructorimpl(new A((String) ulVar.f11494f9.getValue(), new TL((List) obj2, null, 2))), function1);
        } else if (m207exceptionOrNullimpl instanceof Exception) {
            j.quebec(Result.m206constructorimpl(new A((String) ulVar.f11494f9.getValue(), new TL(null, lzc.b(m207exceptionOrNullimpl), 1))), function1);
        } else {
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)), function1);
        }
        return Unit.INSTANCE;
    }
}
