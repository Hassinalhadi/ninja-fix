package com.incognia.internal;

import androidx.lifecycle.RunnableC0643m;
import com.google.android.material.datepicker.j;
import h9.am;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class hm implements P0 {

    /* renamed from: J, reason: collision with root package name */
    public static final String f10565J = (String) wGk.Z1c.getValue();
    public static final long PqK = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f10566W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f10567b;

    /* renamed from: f9, reason: collision with root package name */
    public final kP f10568f9;
    public ZJ gmP;
    public final Lazy sVU = LazyKt.lazy(eC.f10351b);

    public hm(S0A s0a, pl2 pl2Var, kP kPVar) {
        this.f10567b = s0a;
        this.f10566W = pl2Var;
        this.f10568f9 = kPVar;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.sVU.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f10566W.b(new am(6, this, wa2));
    }

    public static final void b(hm hmVar, Function1 function1) {
        hmVar.f10568f9.b(new i1(hmVar, function1));
        hmVar.gmP = hmVar.b(function1);
        S0A s0a = hmVar.f10567b;
        hmVar.f10566W.b(((JSONObject) s0a.f9574b.get()).optLong(f10565J, PqK), hmVar.gmP);
    }

    public final ZJ b(Function1 function1) {
        return new ZJ(new RunnableC0643m(21, function1, this));
    }

    public static final void b(Function1 function1, hm hmVar) {
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new ei((String) hmVar.sVU.getValue()))), function1);
    }
}
