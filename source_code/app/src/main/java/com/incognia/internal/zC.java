package com.incognia.internal;

import android.util.Log;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class zC {
    public final f4 DOu;

    /* renamed from: E, reason: collision with root package name */
    public final wEe f11890E;
    public final Yfc IB;

    /* renamed from: J, reason: collision with root package name */
    public final j8d f11891J;
    public final IW PqK;
    public final yW7 Qs;

    /* renamed from: R, reason: collision with root package name */
    public final l66 f11892R;

    /* renamed from: V, reason: collision with root package name */
    public final CN1 f11893V;

    /* renamed from: W, reason: collision with root package name */
    public final S f11894W;

    /* renamed from: b, reason: collision with root package name */
    public final XuT f11895b;

    /* renamed from: f9, reason: collision with root package name */
    public final fy f11896f9;
    public final f9I gmP;

    /* renamed from: n9, reason: collision with root package name */
    public final FWo f11897n9;
    public final Uu olU = new Uu();
    public final lr sVU;

    public zC(XuT xuT, S s3, fy fyVar, lr lrVar, f9I f9i, j8d j8dVar, IW iw, CN1 cn1) {
        this.f11895b = xuT;
        this.f11894W = s3;
        this.f11896f9 = fyVar;
        this.sVU = lrVar;
        this.gmP = f9i;
        this.f11891J = j8dVar;
        this.PqK = iw;
        this.f11893V = cn1;
        l66 l66Var = new l66();
        this.f11892R = l66Var;
        this.DOu = new f4();
        this.IB = new Yfc(l66Var);
        this.Qs = new yW7();
        this.f11890E = new wEe();
        this.f11897n9 = new FWo();
    }

    public final void b(U91 u91, Function0 function0) {
        if (this.f11893V.b()) {
            function0.invoke();
            this.f11895b.b(new Nh(u91));
        } else if (eSs.f10363b.get()) {
            Log.w("Incognia", (String) wGk.DP.getValue());
        }
    }
}
