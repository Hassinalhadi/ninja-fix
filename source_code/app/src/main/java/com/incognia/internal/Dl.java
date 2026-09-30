package com.incognia.internal;

import androidx.lifecycle.RunnableC0643m;
import com.google.android.material.datepicker.j;
import h9.C1824b;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Dl implements P0 {

    /* renamed from: J, reason: collision with root package name */
    public static final String f8561J = (String) wGk.R1F.getValue();
    public static final long PqK = TimeUnit.SECONDS.toMillis(15);

    /* renamed from: W, reason: collision with root package name */
    public final S0A f8562W;

    /* renamed from: b, reason: collision with root package name */
    public final P48 f8563b;

    /* renamed from: f9, reason: collision with root package name */
    public final pl2 f8564f9;
    public ZJ gmP;
    public final Lazy sVU = LazyKt.lazy(HW.f8845b);

    public Dl(P48 p48, S0A s0a, pl2 pl2Var) {
        this.f8563b = p48;
        this.f8562W = s0a;
        this.f8564f9 = pl2Var;
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
        this.f8564f9.b(new C1824b(this, wa2, 1));
    }

    public static final void b(Dl dl, Function1 function1) {
        dl.f8563b.b(new Jup(dl, function1));
        dl.gmP = dl.b(function1);
        S0A s0a = dl.f8562W;
        dl.f8564f9.b(((JSONObject) s0a.f9574b.get()).optLong(f8561J, PqK), dl.gmP);
    }

    public final ZJ b(Function1 function1) {
        return new ZJ(new RunnableC0643m(19, function1, this));
    }

    public static final void b(Function1 function1, Dl dl) {
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new ei((String) dl.sVU.getValue()))), function1);
    }
}
