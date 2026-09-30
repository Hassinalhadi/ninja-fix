package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1827e;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class xSL extends Lambda implements Function1 {

    /* renamed from: W, reason: collision with root package name */
    public final /* synthetic */ Function1 f11795W;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ thS f11796b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xSL(thS ths, Function1 function1) {
        super(1);
        this.f11796b = ths;
        this.f11795W = function1;
    }

    public final void b(Object obj) {
        thS ths = this.f11796b;
        ths.f11413W.b(new C1827e(obj, (Object) ths, this.f11795W, 9));
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Object invoke(Object obj) {
        b(((Result) obj).alpha);
        return Unit.INSTANCE;
    }

    public static final void b(Object obj, thS ths, Function1 function1) {
        Throwable m207exceptionOrNullimpl = Result.m207exceptionOrNullimpl(obj);
        if (m207exceptionOrNullimpl == null) {
            List list = (List) obj;
            ZJ zj = ths.f11412J;
            if (zj == null || !zj.f10037W.compareAndSet(0, 3)) {
                return;
            }
            String str = thS.PqK;
            S0A s0a = ths.f11414b;
            j.quebec(Result.m206constructorimpl(new y6G(str, list, ((JSONObject) s0a.f9574b.get()).optBoolean(thS.olU, true))), function1);
            return;
        }
        ZJ zj2 = ths.f11412J;
        if (zj2 == null || !zj2.f10037W.compareAndSet(0, 3)) {
            return;
        }
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(m207exceptionOrNullimpl)), function1);
    }
}
