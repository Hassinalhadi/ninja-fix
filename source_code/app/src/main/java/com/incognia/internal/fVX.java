package com.incognia.internal;

import androidx.lifecycle.RunnableC0643m;
import com.google.android.material.datepicker.j;
import h9.C1827e;
import h9.am;
import h9.an;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class fVX implements P0 {

    /* renamed from: J, reason: collision with root package name */
    public static final String f10422J = (String) wGk.Gg.getValue();
    public static final long PqK = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: W, reason: collision with root package name */
    public final Ssq f10423W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f10424b;

    /* renamed from: f9, reason: collision with root package name */
    public final pl2 f10425f9;
    public ZJ gmP;
    public final Lazy sVU = LazyKt.lazy(Sn.f9618b);

    public fVX(S0A s0a, Ssq ssq, pl2 pl2Var) {
        this.f10424b = s0a;
        this.f10423W = ssq;
        this.f10425f9 = pl2Var;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.sVU.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    public static final void W(fVX fvx, Function1 function1, String str) {
        ZJ zj = fvx.gmP;
        if (zj == null || !zj.f10037W.compareAndSet(0, 3)) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(new P7R((String) fvx.sVU.getValue(), str, new Hnm(new bER(str)))), function1);
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f10425f9.b(new am(4, this, wa2));
    }

    public static final void b(fVX fvx, Function1 function1) {
        fvx.f10423W.b(new an(fvx, function1));
        fvx.gmP = fvx.b(function1);
        S0A s0a = fvx.f10424b;
        fvx.f10425f9.b(((JSONObject) s0a.f9574b.get()).optLong(f10422J, PqK), fvx.gmP);
    }

    public static final void b(fVX fvx, Function1 function1, String str) {
        fvx.f10425f9.b(new C1827e(fvx, function1, str, 7));
    }

    public final ZJ b(Function1 function1) {
        return new ZJ(new RunnableC0643m(20, function1, this));
    }

    public static final void b(Function1 function1, fVX fvx) {
        Result.Companion companion = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new ei((String) fvx.sVU.getValue()))), function1);
    }
}
