package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.am;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class xbx implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f11805W;

    /* renamed from: b, reason: collision with root package name */
    public final k8E f11806b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f11807f9 = LazyKt.lazy(R7q.f9536b);

    public xbx(k8E k8e, pl2 pl2Var) {
        this.f11806b = k8e;
        this.f11805W = pl2Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11807f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f11805W.b(new am(19, wa2, this));
    }

    public static final void b(Function1 function1, xbx xbxVar) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            Boolean b2 = xbxVar.f11806b.b();
            m206constructorimpl = Result.m206constructorimpl(new P7R((String) xbxVar.f11807f9.getValue(), b2, new pFh(new a7L(b2))));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        j.quebec(m206constructorimpl, function1);
    }
}
