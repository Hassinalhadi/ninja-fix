package com.incognia.internal;

import android.os.SystemClock;
import g9.a;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class urQ implements Gg {

    /* renamed from: J, reason: collision with root package name */
    public D5f f11502J = aNe.f10097b;
    public final y6C PqK;

    /* renamed from: V, reason: collision with root package name */
    public boolean f11503V;

    /* renamed from: W, reason: collision with root package name */
    public final S0A f11504W;

    /* renamed from: b, reason: collision with root package name */
    public final ipc f11505b;

    /* renamed from: f9, reason: collision with root package name */
    public final pl2 f11506f9;
    public final List gmP;
    public final XuT sVU;
    public static final long olU = TimeUnit.DAYS.toMillis(1);

    /* renamed from: R, reason: collision with root package name */
    public static final String f11501R = (String) wGk.f11674a.getValue();
    public static final String DOu = (String) wGk.Bu.getValue();

    public urQ(xIA xia, ipc ipcVar, S0A s0a, pl2 pl2Var, W6 w62, XuT xuT, List list) {
        this.f11505b = ipcVar;
        this.f11504W = s0a;
        this.f11506f9 = pl2Var;
        this.sVU = xuT;
        this.gmP = list;
        this.PqK = new y6C(f11501R, pl2Var, new QZg(this));
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f11502J = tOI.f11377b;
        this.sVU.b(xkS.class, this.PqK);
        pl2 pl2Var = BA2.f8399b;
        BA2.b(new sD(DOu, olU));
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f11506f9;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f11502J = b66.f10146b;
        njO.b(this, new a(21, this));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f11502J;
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        this.f11502J = L4.f9041b;
        cj0.invoke();
    }

    public static final void b(urQ urq) {
        urq.getClass();
        String str = xIA.f11783b;
        kT kTVar = QHn.f9491W;
        String str2 = xIA.f11783b;
        rtW rtw = rtW.f11249b;
        Am am2 = (Am) kTVar.b(rtw, str2);
        if (am2 != null) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j5 = am2.f8379W;
            if (elapsedRealtime - j5 < olU && elapsedRealtime >= j5) {
                return;
            }
        }
        if (urq.f11503V) {
            return;
        }
        urq.f11503V = true;
        urq.f11505b.b((Am) kTVar.b(rtw, str2), new br(urq, null), new J0(urq, null));
    }
}
