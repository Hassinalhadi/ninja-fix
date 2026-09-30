package com.incognia.internal;

import h9.C1824b;
import h9.aa;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class WnY implements Gg {

    /* renamed from: J, reason: collision with root package name */
    public static final String f9872J = (String) wGk.yv.getValue();

    /* renamed from: W, reason: collision with root package name */
    public final XuT f9873W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9874b;

    /* renamed from: f9, reason: collision with root package name */
    public final Oqz f9875f9;
    public D5f sVU = aNe.f10097b;
    public final a11 gmP = new h9.r(this, 1);

    public WnY(pl2 pl2Var, XuT xuT, Oqz oqz) {
        this.f9874b = pl2Var;
        this.f9873W = xuT;
        this.f9875f9 = oqz;
    }

    public static final void W(WnY wnY) {
        wnY.W();
    }

    public static final void f9(WnY wnY) {
        AtomicReference atomicReference = IZZ.f8909W;
        IZZ.b(wnY.gmP);
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.sVU = tOI.f11377b;
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f9874b;
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.sVU;
    }

    public final void W() {
        njO.W(this, new aa(this, 1));
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(21, this, cj0));
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.sVU = b66.f10146b;
        njO.b(this, new aa(this, 0));
    }

    public static final void b(WnY wnY, Function0 function0) {
        AtomicReference atomicReference = IZZ.f8909W;
        IZZ.f9(wnY.gmP);
        wnY.sVU = L4.f9041b;
        function0.invoke();
    }

    public static final void b(WnY wnY) {
        boolean b2 = wnY.f9875f9.b();
        kT kTVar = QHn.f9492b;
        String str = f9872J;
        if (Intrinsics.areEqual(kTVar.W(str), Boolean.valueOf(b2))) {
            return;
        }
        kTVar.b(str, Boolean.valueOf(b2));
        wnY.f9873W.b(new Nh(oeI.f11029W));
    }
}
