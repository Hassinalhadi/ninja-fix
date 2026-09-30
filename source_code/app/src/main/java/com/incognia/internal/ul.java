package com.incognia.internal;

import h9.am;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class ul implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f11492W;

    /* renamed from: b, reason: collision with root package name */
    public final W4L f11493b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11494f9 = LazyKt.lazy(Z.f10018b);

    public ul(W4L w4l, pl2 pl2Var) {
        this.f11493b = w4l;
        this.f11492W = pl2Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11494f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f11492W.b(new am(17, this, wa2));
    }

    public static final void b(ul ulVar, Function1 function1) {
        try {
            Result.Companion companion = Result.INSTANCE;
            ulVar.f11493b.b(new xm(ulVar, function1));
            Result.m206constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m206constructorimpl(ResultKt.createFailure(th));
        }
    }
}
