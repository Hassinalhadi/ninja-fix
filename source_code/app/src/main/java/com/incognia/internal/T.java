package com.incognia.internal;

import android.os.SystemClock;
import h9.C1824b;
import h9.w;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class T implements Gg {
    public static final long PqK = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: V, reason: collision with root package name */
    public static final String f9631V = (String) wGk.kY6.getValue();
    public static final String olU = (String) wGk.f11716q.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final XuT f9633W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9634b;

    /* renamed from: f9, reason: collision with root package name */
    public final S0A f9635f9;
    public final W6 sVU;
    public D5f gmP = aNe.f10097b;

    /* renamed from: J, reason: collision with root package name */
    public final XO f9632J = new w(this, 0);

    public T(pl2 pl2Var, XuT xuT, S0A s0a, W6 w62) {
        this.f9634b = pl2Var;
        this.f9633W = xuT;
        this.f9635f9 = s0a;
        this.sVU = w62;
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.gmP = tOI.f11377b;
    }

    public final void W() {
        njO.b(this, new h9.v(this, 1));
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f9634b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.gmP = b66.f10146b;
        njO.b(this, new h9.v(this, 0));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.gmP;
    }

    public static final void W(T t5) {
        W6 w62 = t5.sVU;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long optLong = ((JSONObject) t5.f9635f9.f9574b.get()).optLong(f9631V, PqK);
        kT kTVar = QHn.f9492b;
        String str = olU;
        Long sVU = kTVar.sVU(str);
        long longValue = sVU != null ? sVU.longValue() : 0L;
        if (longValue <= 0 || elapsedRealtime < longValue || elapsedRealtime - longValue >= optLong) {
            kTVar.b(str, Long.valueOf(elapsedRealtime));
            t5.f9633W.b(new Nh(ojA.f11032W));
        }
    }

    public static final void b(T t5) {
        t5.W();
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(17, this, cj0));
    }

    public static final void b(T t5, Function0 function0) {
        AtomicReference atomicReference = IZZ.f8909W;
        IZZ.f9(t5.f9632J);
        t5.gmP = L4.f9041b;
        function0.invoke();
    }

    public static final void f9(T t5) {
        AtomicReference atomicReference = IZZ.f8909W;
        IZZ.b(t5.f9632J);
    }
}
