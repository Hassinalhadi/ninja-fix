package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.C1824b;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class Hz implements P0 {

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f8878W;

    /* renamed from: b, reason: collision with root package name */
    public final sAG f8879b;

    /* renamed from: f9, reason: collision with root package name */
    public final Lazy f8880f9 = LazyKt.lazy(Dv5.f8576b);

    public Hz(sAG sag, pl2 pl2Var) {
        this.f8879b = sag;
        this.f8878W = pl2Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f8880f9.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f8878W.b(new C1824b(4, wa2, this));
    }

    public static final void b(Function1 function1, Hz hz) {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(new Xx0((String) hz.f8880f9.getValue(), hz.f8879b.b()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        j.quebec(m206constructorimpl, function1);
    }
}
