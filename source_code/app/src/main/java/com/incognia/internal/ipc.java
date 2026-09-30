package com.incognia.internal;

import h9.aq;
import kotlin.jvm.functions.Function1;

/* loaded from: classes2.dex */
public final class ipc {

    /* renamed from: f9, reason: collision with root package name */
    public static final String f10640f9 = (String) wGk.NK.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final b8P f10641W;

    /* renamed from: b, reason: collision with root package name */
    public final wyZ f10642b;

    public ipc(U8s u8s, AWI awi, fP1 fp1, W6 w62, wyZ wyz) {
        this.f10642b = wyz;
        this.f10641W = new b8P(f10640f9, Vy1.f9813b, lFn.f10815b, fp1, w62, awi, u8s, 72);
    }

    public final void b(Am am2, br brVar, J0 j02) {
        P3H b2 = this.f10642b.b();
        this.f10641W.b(new j1D(am2 != null ? am2.f8381f9 : 0L, b2.f9381b, b2.f9382f9, b2.sVU, b2.gmP, b2.f9377J, b2.PqK, String.valueOf(b2.f9379V), b2.olU, b2.f9378R, b2.DOu), false, null, new a4.u(29, brVar), new aq(0, j02));
    }

    public static final void b(Function1 function1, JMS jms) {
        function1.invoke(jms);
    }

    public static final void b(Function1 function1, cQM cqm) {
        function1.invoke(cqm);
    }
}
