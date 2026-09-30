package com.incognia.internal;

import androidx.lifecycle.RunnableC0643m;
import com.google.android.material.datepicker.j;
import ga.as;
import h9.C1827e;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zZG implements P0 {

    /* renamed from: E, reason: collision with root package name */
    public static final long f11920E;

    /* renamed from: n9, reason: collision with root package name */
    public static final long f11921n9;
    public ZJ PqK;

    /* renamed from: R, reason: collision with root package name */
    public BGx f11923R;

    /* renamed from: V, reason: collision with root package name */
    public ZJ f11924V;

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f11925W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f11926b;

    /* renamed from: f9, reason: collision with root package name */
    public final K4F f11927f9;
    public final dGS gmP;
    public final cFV sVU;
    public static final String DOu = (String) wGk.f11696i.getValue();
    public static final String IB = (String) wGk.Az.getValue();
    public static final String Qs = (String) wGk.AaH.getValue();

    /* renamed from: J, reason: collision with root package name */
    public final Lazy f11922J = LazyKt.lazy(Tx.f9689b);
    public boolean olU = true;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f11920E = timeUnit.toMillis(15L);
        f11921n9 = timeUnit.toMillis(5L);
    }

    public zZG(S0A s0a, pl2 pl2Var, K4F k4f, cFV cfv, dGS dgs) {
        this.f11926b = s0a;
        this.f11925W = pl2Var;
        this.f11927f9 = k4f;
        this.sVU = cfv;
        this.gmP = dgs;
    }

    @Override // com.incognia.internal.P0
    public final String W() {
        return (String) this.f11922J.getValue();
    }

    @Override // com.incognia.internal.P0
    public final boolean b() {
        return false;
    }

    public final ZJ f9() {
        return new ZJ(new as(5, this));
    }

    @Override // com.incognia.internal.P0
    public final void b(yE yEVar, WA wa2) {
        this.f11925W.b(new C1827e((Object) this, (Object) wa2, (Object) yEVar, 11));
    }

    public static final void b(zZG zzg, Function1 function1, Function1 function12) {
        if (!zzg.gmP.b()) {
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new bJ((String) zzg.f11922J.getValue()))), function1);
            return;
        }
        zzg.olU = true;
        zzg.f11923R = null;
        zzg.sVU.b(new UZb(zzg, function12, function1));
        zzg.PqK = zzg.b(function1);
        S0A s0a = zzg.f11926b;
        long optLong = ((JSONObject) s0a.f9574b.get()).optLong(IB, f11920E);
        zzg.f11924V = zzg.f9();
        S0A s0a2 = zzg.f11926b;
        long optLong2 = ((JSONObject) s0a2.f9574b.get()).optLong(Qs, f11921n9);
        zzg.f11925W.b(optLong, zzg.PqK);
        zzg.f11925W.b(optLong2, zzg.f11924V);
    }

    public final ZJ b(Function1 function1) {
        return new ZJ(new RunnableC0643m(22, this, function1));
    }

    public static final void b(zZG zzg, Function1 function1) {
        BGx bGx = zzg.f11923R;
        if (bGx != null) {
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(b(bGx, 2)), function1);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new ei(DOu))), function1);
        }
    }

    public static final void b(zZG zzg) {
        zzg.olU = false;
    }

    public static WT b(BGx bGx, int i4) {
        if ((i4 & 1) != 0) {
            bGx = null;
        }
        if (bGx != null) {
            return new WT(DOu, new jW(bGx, null));
        }
        return new WT(DOu, null);
    }
}
