package com.incognia.internal;

import h9.C1824b;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class Nq implements Gg, tcn {

    /* renamed from: J, reason: collision with root package name */
    public final KDK f9265J;
    public final ccL PqK;

    /* renamed from: W, reason: collision with root package name */
    public final XuT f9268W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f9269b;

    /* renamed from: f9, reason: collision with root package name */
    public final S0A f9270f9;
    public final G5G gmP;
    public final K sVU;
    public static final String IB = (String) wGk.u4.getValue();
    public static final String Qs = (String) wGk.w4Q.getValue();

    /* renamed from: E, reason: collision with root package name */
    public static final String f9260E = (String) wGk.Ndw.getValue();

    /* renamed from: n9, reason: collision with root package name */
    public static final String f9264n9 = (String) wGk.LpS.getValue();

    /* renamed from: Y, reason: collision with root package name */
    public static final String f9263Y = (String) wGk.kWZ.getValue();

    /* renamed from: P, reason: collision with root package name */
    public static final String f9262P = (String) wGk.a2F.getValue();

    /* renamed from: L, reason: collision with root package name */
    public static final String f9261L = (String) wGk.f11619H.getValue();

    /* renamed from: V, reason: collision with root package name */
    public D5f f9267V = aNe.f10097b;
    public boolean olU = W();

    /* renamed from: R, reason: collision with root package name */
    public final KYK f9266R = new h9.q(0, this);
    public final a11 DOu = new h9.r(this, 0);

    public Nq(pl2 pl2Var, XuT xuT, S0A s0a, K k6, G5G g5g, KDK kdk, ccL ccl) {
        this.f9269b = pl2Var;
        this.f9268W = xuT;
        this.f9270f9 = s0a;
        this.sVU = k6;
        this.gmP = g5g;
        this.f9265J = kdk;
        this.PqK = ccl;
    }

    public static R0t R() {
        try {
            Integer f92 = QHn.f9492b.f9(IB);
            if (f92 == null) {
                return null;
            }
            int i4 = R0t.f9532W;
            return lW.b(f92.intValue());
        } catch (Throwable unused) {
            QHn.f9492b.b(IB);
            return null;
        }
    }

    public final void DOu() {
        njO.W(this, new h9.p(this, 2));
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f9267V = tOI.f11377b;
    }

    @Override // com.incognia.internal.tcn
    public final void PqK() {
        njO.b(this, new h9.p(this, 3));
    }

    @Override // com.incognia.internal.tcn
    public final void V() {
        DF7.b(this);
    }

    @Override // com.incognia.internal.tcn
    public final boolean W() {
        return this.PqK.W(f9262P) || this.PqK.W(f9261L);
    }

    @Override // com.incognia.internal.sX
    public final void b(S0A s0a) {
        DF7.W(this);
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f9267V = b66.f10146b;
        njO.b(this, new h9.p(this, 1));
    }

    @Override // com.incognia.internal.tcn
    public final boolean gmP() {
        return this.olU;
    }

    @Override // com.incognia.internal.tcn
    public final void olU() {
        njO.b(this, new h9.p(this, 0));
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f9267V;
    }

    public static final void gmP(Nq nq) {
        if (nq.olU) {
            nq.gmP.b(nq.f9266R);
        }
        AtomicReference atomicReference = IZZ.f8909W;
        IZZ.b(nq.DOu);
    }

    public static final void sVU(Nq nq) {
        nq.DOu();
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f9269b;
    }

    public static final void W(Nq nq) {
        nq.gmP.b(nq.f9266R);
    }

    @Override // com.incognia.internal.tcn
    public final void b(boolean z2) {
        this.olU = z2;
    }

    public static final void b(Nq nq, Function0 function0) {
        if (nq.olU) {
            nq.gmP.W(nq.f9266R);
        }
        AtomicReference atomicReference = IZZ.f8909W;
        IZZ.f9(nq.DOu);
        nq.f9267V = L4.f9041b;
        function0.invoke();
    }

    public static final void f9(Nq nq) {
        boolean b2 = nq.f9265J.b("android.permission.READ_PHONE_STATE");
        kT kTVar = QHn.f9492b;
        String str = Qs;
        if (Intrinsics.areEqual(kTVar.W(str), Boolean.valueOf(b2))) {
            return;
        }
        kTVar.b(str, Boolean.valueOf(b2));
        if (b2 && nq.olU) {
            nq.gmP.b(nq.f9266R);
        } else {
            if (b2 || !nq.olU) {
                return;
            }
            nq.gmP.W(nq.f9266R);
        }
    }

    public static final void b(Nq nq, R0t r0t) {
        nq.b(r0t);
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(13, this, cj0));
    }

    public static final void b(Nq nq) {
        nq.gmP.W(nq.f9266R);
    }

    public final void b(R0t r0t) {
        njO.b(this, new C1824b(12, r0t, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, r1) == false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(R0t r0t, Nq nq) {
        nq.getClass();
        R0t R10 = R();
        r0t.getClass();
        if (R10 != null) {
            INC inc = INC.f8897f9;
            if (!Intrinsics.areEqual(R10, inc)) {
            }
        }
        S0A s0a = nq.f9270f9;
        boolean optBoolean = ((JSONObject) s0a.f9574b.get()).optBoolean(f9260E, true);
        if (!Intrinsics.areEqual(nq.sVU.b(), r.f11189b) || !optBoolean) {
            S0A s0a2 = nq.f9270f9;
            if (((JSONObject) s0a2.f9574b.get()).optBoolean(f9264n9, false) && Intrinsics.areEqual(r0t, INC.f8897f9)) {
                nq.f9268W.b(new Nh(dSo.f10315W));
            } else {
                R0t R11 = R();
                S0A s0a3 = nq.f9270f9;
                if (((JSONObject) s0a3.f9574b.get()).optBoolean(f9263Y, false)) {
                    INC inc2 = INC.f8897f9;
                    if (Intrinsics.areEqual(R11, inc2) && !Intrinsics.areEqual(r0t, inc2)) {
                        nq.f9268W.b(new Nh(pPH.f11071W));
                    }
                }
            }
        }
        QHn.f9492b.b(IB, Integer.valueOf(r0t.f9533b));
    }
}
