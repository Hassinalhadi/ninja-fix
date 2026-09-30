package com.incognia.internal;

import com.google.android.material.datepicker.j;
import h9.RunnableC1826d;
import h9.am;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class thS implements P0 {

    /* renamed from: J, reason: collision with root package name */
    public ZJ f11412J;

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f11413W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f11414b;

    /* renamed from: f9, reason: collision with root package name */
    public final eW f11415f9;
    public final Lazy gmP = LazyKt.lazy(NFE.f9196b);
    public final dGS sVU;
    public static final String PqK = (String) wGk.iM.getValue();

    /* renamed from: V, reason: collision with root package name */
    public static final String f11411V = (String) wGk.f11625J8.getValue();
    public static final String olU = (String) wGk.oJ.getValue();

    /* renamed from: R, reason: collision with root package name */
    public static final long f11410R = TimeUnit.SECONDS.toMillis(15);

    public thS(S0A s0a, pl2 pl2Var, eW eWVar, dGS dgs) {
        this.f11414b = s0a;
        this.f11413W = pl2Var;
        this.f11415f9 = eWVar;
        this.sVU = dgs;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.gmP.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    public static final void W(Function1 function1) {
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new ei(PqK))), function1);
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f11413W.b(new am(16, this, wa2));
    }

    public static final void b(thS ths, Function1 function1) {
        if (!ths.sVU.b()) {
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new bJ((String) ths.gmP.getValue()))), function1);
            return;
        }
        ths.f11415f9.b(new xSL(ths, function1));
        ths.f11412J = b(function1);
        S0A s0a = ths.f11414b;
        ths.f11413W.b(((JSONObject) s0a.f9574b.get()).optLong(f11411V, f11410R), ths.f11412J);
    }

    public static ZJ b(Function1 function1) {
        return new ZJ(new RunnableC1826d(1, function1));
    }
}
