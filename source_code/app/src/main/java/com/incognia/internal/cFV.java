package com.incognia.internal;

import android.location.Location;
import com.google.android.material.datepicker.j;
import h9.C1824b;
import h9.ag;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class cFV implements Gg, tcn {
    public static final long FL;

    /* renamed from: G, reason: collision with root package name */
    public static final String f10228G;
    public static final String Gw;

    /* renamed from: H, reason: collision with root package name */
    public static final float f10229H;
    public static final String H02;

    /* renamed from: K, reason: collision with root package name */
    public static final String f10230K;

    /* renamed from: L, reason: collision with root package name */
    public static final String f10231L = (String) wGk.f11696i.getValue();
    public static final long a2F;

    /* renamed from: ar, reason: collision with root package name */
    public static final long f10232ar;
    public static final String eeB;
    public static final String jgi;
    public static final String qnE;

    /* renamed from: s0, reason: collision with root package name */
    public static final String f10233s0;

    /* renamed from: E, reason: collision with root package name */
    public int f10234E;

    /* renamed from: J, reason: collision with root package name */
    public final jk f10235J;
    public final tNn PqK;
    public Function1 Qs;

    /* renamed from: R, reason: collision with root package name */
    public final dGS f10237R;

    /* renamed from: V, reason: collision with root package name */
    public final W6 f10238V;

    /* renamed from: W, reason: collision with root package name */
    public final pl2 f10239W;

    /* renamed from: b, reason: collision with root package name */
    public final S0A f10241b;

    /* renamed from: f9, reason: collision with root package name */
    public final XuT f10242f9;
    public final V2 gmP;
    public final ccL olU;
    public final L8H sVU;
    public D5f DOu = aNe.f10097b;
    public boolean IB = W();

    /* renamed from: n9, reason: collision with root package name */
    public final YKm f10243n9 = new ag(this, 0);

    /* renamed from: Y, reason: collision with root package name */
    public final wKp f10240Y = new wKp(this);

    /* renamed from: P, reason: collision with root package name */
    public final kVL f10236P = new kVL(this);

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        FL = timeUnit.toMillis(10L);
        f10232ar = TimeUnit.MINUTES.toMillis(3L);
        a2F = timeUnit.toMillis(10L);
        f10229H = 200.0f;
        H02 = (String) wGk.vE.getValue();
        jgi = (String) wGk.MT.getValue();
        f10230K = (String) wGk.v6.getValue();
        qnE = (String) wGk.LmY.getValue();
        f10233s0 = (String) wGk.XF.getValue();
        eeB = (String) wGk.dM8.getValue();
        Gw = (String) wGk.Is.getValue();
        f10228G = (String) wGk.jq.getValue();
    }

    public cFV(S0A s0a, pl2 pl2Var, XuT xuT, L8H l8h, V2 v22, jk jkVar, tNn tnn, W6 w62, HpA hpA, ccL ccl, dGS dgs) {
        this.f10241b = s0a;
        this.f10239W = pl2Var;
        this.f10242f9 = xuT;
        this.sVU = l8h;
        this.gmP = v22;
        this.f10235J = jkVar;
        this.PqK = tnn;
        this.f10238V = w62;
        this.olU = ccl;
        this.f10237R = dgs;
    }

    public static BGx R() {
        return (BGx) QHn.f9492b.b(yB.f11841b, f10231L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r3.f8410f9 < r4.f8410f9) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
    
        r0 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
    
        if (r5 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean DOu() {
        BGx b2;
        boolean z2;
        boolean z10;
        BGx bGx = null;
        try {
            b2 = this.PqK.b("gps");
            BGx b4 = this.PqK.b("network");
            jVu b6 = b(false, true);
            if (b2 != null) {
                z2 = P5q.b(b2, b6);
            } else {
                z2 = false;
            }
            if (b4 != null) {
                z10 = P5q.b(b4, b6);
            } else {
                z10 = false;
            }
        } catch (Throwable th) {
            this.sVU.b(th, false);
        }
        if (!z2 || !z10) {
            if (!z2) {
            }
            bGx = b2;
            if (bGx == null) {
                return false;
            }
            QHn.f9492b.b(f10231L, bGx, pVP.f11075b);
            return true;
        }
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.DOu = tOI.f11377b;
    }

    @Override // com.incognia.internal.tcn
    public final void PqK() {
        njO.b(this, new h9.af(this, 2));
    }

    @Override // com.incognia.internal.tcn
    public final void V() {
        DF7.b(this);
    }

    @Override // com.incognia.internal.tcn
    public final boolean W() {
        return this.olU.W(f10231L) && this.f10237R.b();
    }

    @Override // com.incognia.internal.sX
    public final void b(S0A s0a) {
        DF7.W(this);
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.DOu = b66.f10146b;
        njO.b(this, new h9.af(this, 1));
    }

    @Override // com.incognia.internal.tcn
    public final boolean gmP() {
        return this.IB;
    }

    @Override // com.incognia.internal.tcn
    public final void olU() {
        njO.b(this, new h9.af(this, 0));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.DOu;
    }

    public static final void sVU(cFV cfv) {
        dGS dgs = cfv.f10237R;
        dgs.f10306f9.add(cfv.f10243n9);
        if (cfv.IB) {
            cfv.DOu();
            try {
                cfv.PqK.b(cfv.f10240Y);
            } catch (Throwable th) {
                cfv.sVU.b(th, false);
            }
        }
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f10239W;
    }

    public static final void W(cFV cfv) {
        cfv.getClass();
        try {
            cfv.PqK.W(cfv.f10240Y);
        } catch (Throwable th) {
            cfv.sVU.b(th, false);
        }
    }

    @Override // com.incognia.internal.tcn
    public final void b(boolean z2) {
        this.IB = z2;
    }

    public static final void b(cFV cfv, Function0 function0) {
        if (cfv.IB) {
            try {
                cfv.PqK.W(cfv.f10240Y);
            } catch (Throwable th) {
                cfv.sVU.b(th, false);
            }
        }
        dGS dgs = cfv.f10237R;
        dgs.f10306f9.remove(cfv.f10243n9);
        cfv.DOu = L4.f9041b;
        function0.invoke();
    }

    public static final void f9(cFV cfv) {
        cfv.DOu();
        try {
            cfv.PqK.b(cfv.f10240Y);
        } catch (Throwable th) {
            cfv.sVU.b(th, false);
        }
    }

    public static final void b(cFV cfv, boolean z2) {
        njO.b(cfv, new h9.af(cfv, 3));
    }

    public static final void b(cFV cfv) {
        cfv.getClass();
        DF7.b(cfv);
    }

    public final void b(UZb uZb) {
        if (njO.b(this, new C1824b(26, this, uZb))) {
            return;
        }
        Result.Companion companion = Result.INSTANCE;
        uZb.b(Result.m206constructorimpl(ResultKt.createFailure(new KcS(f10231L))));
    }

    public static final void b(cFV cfv, Function1 function1) {
        boolean z2;
        jVu b2 = cfv.b(false, false);
        if (R() != null && P5q.b(R(), b2)) {
            Result.Companion companion = Result.INSTANCE;
            j.quebec(Result.m206constructorimpl(R()), function1);
            return;
        }
        cfv.Qs = function1;
        cfv.f10234E = 0;
        try {
            z2 = cfv.gmP.b(cfv.f10236P);
        } catch (Throwable th) {
            cfv.sVU.b(th, false);
            z2 = false;
        }
        if (z2) {
            cfv.f10234E++;
            return;
        }
        boolean optBoolean = ((JSONObject) cfv.f10241b.f9574b.get()).optBoolean(H02, false);
        boolean optBoolean2 = ((JSONObject) cfv.f10241b.f9574b.get()).optBoolean(jgi, true);
        boolean b4 = optBoolean ? cfv.b("gps") : false;
        boolean b6 = optBoolean2 ? cfv.b("network") : false;
        if (b4 || b6) {
            return;
        }
        Result.Companion companion2 = Result.INSTANCE;
        j.quebec(Result.m206constructorimpl(ResultKt.createFailure(new kx3(f10231L))), function1);
        cfv.Qs = null;
        cfv.f10234E = 0;
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(25, this, cj0));
    }

    public final boolean b(String str) {
        try {
            boolean b2 = this.PqK.b(str, this.f10236P);
            if (!b2) {
                return b2;
            }
            this.f10234E++;
            return b2;
        } catch (Throwable th) {
            this.sVU.b(th, false);
            return false;
        }
    }

    public final jVu b(boolean z2, boolean z10) {
        long optLong;
        long optLong2;
        S0A s0a = this.f10241b;
        if (((JSONObject) s0a.f9574b.get()).optBoolean(f10230K, false)) {
            if (z2) {
                S0A s0a2 = this.f10241b;
                optLong2 = ((JSONObject) s0a2.f9574b.get()).optLong(eeB, f10232ar);
            } else {
                S0A s0a3 = this.f10241b;
                optLong2 = ((JSONObject) s0a3.f9574b.get()).optLong(f10233s0, FL);
            }
            return new jVu(new n2I(this, optLong2), new pXB(this, z10), new u0w(this));
        }
        if (z2) {
            S0A s0a4 = this.f10241b;
            optLong = ((JSONObject) s0a4.f9574b.get()).optLong(eeB, f10232ar);
        } else {
            S0A s0a5 = this.f10241b;
            optLong = ((JSONObject) s0a5.f9574b.get()).optLong(f10233s0, FL);
        }
        return new jVu(new n2I(this, optLong), new pXB(this, z10));
    }

    public final Pair b(BGx bGx, BGx bGx2) {
        boolean z2 = true;
        boolean optBoolean = ((JSONObject) this.f10241b.f9574b.get()).optBoolean(Gw, true);
        long optLong = ((JSONObject) this.f10241b.f9574b.get()).optLong(f10228G, a2F);
        long j5 = bGx.sVU - (bGx2 != null ? bGx2.sVU : 0L);
        boolean z10 = (bGx2 == null || bGx.gmP == bGx2.gmP) ? false : true;
        if (optBoolean && z10 && j5 >= optLong) {
            return new Pair(Boolean.TRUE, SdK.f9613W);
        }
        if (((JSONObject) this.f10241b.f9574b.get()).optBoolean(qnE, true)) {
            jW jWVar = bGx2 != null ? new jW(bGx2) : null;
            if (jWVar != null) {
                BGx bGx3 = jWVar.f10695b;
                if (bGx3.gmP == bGx.gmP) {
                    float[] fArr = new float[3];
                    Location.distanceBetween(bGx.f8409b, bGx.f8408W, bGx3.f8409b, bGx3.f8408W, fArr);
                    if (fArr[0] <= 100.0f) {
                        z2 = false;
                    }
                }
            }
            return new Pair(Boolean.valueOf(z2), Kcw.f9014W);
        }
        return new Pair(Boolean.FALSE, null);
    }
}
