package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.am;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class lG implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f10816W;

    /* renamed from: b, reason: collision with root package name */
    public final lhI f10817b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f10818f9 = LazyKt.lazy(yp.f11874b);

    public lG(lhI lhi, pl2 pl2Var) {
        this.f10817b = lhi;
        this.f10816W = pl2Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f10818f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f10816W.b(new am(10, wa2, this));
    }

    public static final void b(Function1 function1, lG lGVar) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(new KB((String) lGVar.f10818f9.getValue(), lGVar.f10817b.W()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        j.quebec(m206constructorimpl, function1);
    }
}
