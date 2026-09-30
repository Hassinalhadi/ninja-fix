package com.incognia.internal;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class r9 implements Gg {

    /* renamed from: J, reason: collision with root package name */
    public final y6C f11207J;
    public final y6C PqK;

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f11208W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f11209b;

    /* renamed from: f9, reason: collision with root package name */
    public final XuT f11210f9;

    /* renamed from: V, reason: collision with root package name */
    public static final String f11206V = (String) wGk.lVF.getValue();
    public static final long olU = TimeUnit.HOURS.toMillis(8);

    /* renamed from: R, reason: collision with root package name */
    public static final long f11205R = TimeUnit.DAYS.toMillis(1);
    public static final String DOu = (String) wGk.UFh.getValue();
    public static final String IB = (String) wGk.FNg.getValue();
    public static final String Qs = (String) wGk.wM.getValue();
    public D5f sVU = aNe.f10097b;
    public final Map gmP = kotlin.collections.y.tango(new Pair(IB, new ArrayList()), new Pair(Qs, new ArrayList()));

    public r9(S0A s0a, pl2 pl2Var, XuT xuT) {
        this.f11209b = s0a;
        this.f11208W = pl2Var;
        this.f11210f9 = xuT;
        String str = DOu;
        this.f11207J = new y6C(str, pl2Var, new rYa(this));
        this.PqK = new y6C(str, pl2Var, new G2D(this));
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.sVU = tOI.f11377b;
        this.f11210f9.b(xkS.class, this.f11207J);
        this.f11210f9.b(Ri.class, this.PqK);
        S0A s0a = this.f11209b;
        long optLong = ((JSONObject) s0a.f9574b.get()).optLong(f11206V, olU);
        pl2 pl2Var = BA2.f8399b;
        BA2.b(new sD(IB, optLong));
        BA2.b(new sD(Qs, f11205R));
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f11208W;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.sVU = b66.f10146b;
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.sVU;
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        this.sVU = L4.f9041b;
        cj0.invoke();
    }
}
