package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1824b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class Cy implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f8502W;

    /* renamed from: b, reason: collision with root package name */
    public final k8E f8503b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f8504f9 = LazyKt.lazy(af.f10109b);

    public Cy(k8E k8e, pl2 pl2Var) {
        this.f8503b = k8e;
        this.f8502W = pl2Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8504f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f8502W.b(new C1824b(0, wa2, this));
    }

    public static final void b(Function1 function1, Cy cy) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(new oJI((String) cy.f8504f9.getValue(), new rx4(cy.f8503b.f9())));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        j.quebec(m206constructorimpl, function1);
    }
}
