package com.incognia.internal;

import android.content.Context;
import android.telephony.CellInfo;
import android.telephony.TelephonyManager;
import g3.z;
import g9.a;
import h9.C1824b;
import h9.C1829g;
import h9.C1830h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final class G5G implements Gg {
    public boolean DOu;
    public final TelephonyManager PqK;
    public final DuP Qs;

    /* renamed from: V, reason: collision with root package name */
    public final Ha f8756V;

    /* renamed from: W, reason: collision with root package name */
    public final L8H f8757W;

    /* renamed from: b, reason: collision with root package name */
    public final pl2 f8758b;

    /* renamed from: f9, reason: collision with root package name */
    public final tNn f8759f9;
    public final KDK gmP;
    public final Executor olU;
    public final Oqz sVU;

    /* renamed from: J, reason: collision with root package name */
    public D5f f8754J = aNe.f10097b;

    /* renamed from: R, reason: collision with root package name */
    public final LinkedHashSet f8755R = new LinkedHashSet();
    public final mNr IB = new mNr(this);

    public G5G(Context context, pl2 pl2Var, L8H l8h, tNn tnn, Oqz oqz, KDK kdk, W6 w62) {
        DuP duP;
        this.f8758b = pl2Var;
        this.f8757W = l8h;
        this.f8759f9 = tnn;
        this.sVU = oqz;
        this.gmP = kdk;
        this.PqK = (TelephonyManager) context.getSystemService("phone");
        this.f8756V = new Ha(w62);
        this.olU = Q4n.b(pl2Var);
        if (CnH.b(CnH.f8484b, 31, 0, 2)) {
            duP = new DuP(new vfl(this));
        } else {
            duP = null;
        }
        this.Qs = duP;
    }

    @Override // com.incognia.internal.Gg
    public final void J() {
        this.f8754J = tOI.f11377b;
    }

    public final Boolean PqK() {
        boolean isDataRoamingEnabled;
        try {
            if (CnH.b(CnH.f8484b, 29, 0, 2)) {
                isDataRoamingEnabled = this.PqK.isDataRoamingEnabled();
                return Boolean.valueOf(isDataRoamingEnabled);
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final void V() {
        if (!this.gmP.b("android.permission.READ_PHONE_STATE") || this.DOu) {
            return;
        }
        if (CnH.b(CnH.f8484b, 31, 0, 2)) {
            DuP duP = this.Qs;
            if (duP != null) {
                z.uniform(this.PqK, this.olU, duP);
            }
        } else {
            this.PqK.listen(this.IB, 32);
        }
        this.DOu = true;
    }

    public final void W(KYK kyk) {
        njO.b(this, new C1829g(this, kyk, 1));
    }

    @Override // com.incognia.internal.Gg
    public final pl2 b() {
        return this.f8758b;
    }

    @Override // com.incognia.internal.Gg
    public final void f9() {
        this.f8754J = b66.f10146b;
        njO.b(this, new a(3, this));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0024, code lost:
    
        if (r0 == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Integer gmP() {
        int dataNetworkType;
        boolean z2;
        if (!this.gmP.b("android.permission.READ_PHONE_STATE")) {
            KDK kdk = this.gmP;
            kdk.getClass();
            if (CnH.b(CnH.f8484b, 33, 0, 2)) {
                z2 = kdk.b("android.permission.READ_BASIC_PHONE_STATE");
            } else {
                z2 = false;
            }
        }
        try {
            CnH cnH = CnH.f8484b;
            if (CnH.b(cnH, 30, 0, 2)) {
                dataNetworkType = this.PqK.getDataNetworkType();
                return Integer.valueOf(dataNetworkType);
            }
            if (CnH.b(cnH, 24, 0, 2)) {
                return Integer.valueOf(this.PqK.getNetworkType());
            }
            return null;
        } catch (Throwable th) {
            this.f8757W.b(th, false);
            return null;
        }
    }

    public final void olU() {
        if (!this.gmP.b("android.permission.READ_PHONE_STATE") || !this.DOu) {
            return;
        }
        if (CnH.b(CnH.f8484b, 31, 0, 2)) {
            DuP duP = this.Qs;
            if (duP != null) {
                z.tango(this.PqK, duP);
            }
        } else {
            this.PqK.listen(this.IB, 0);
        }
        this.DOu = false;
    }

    @Override // com.incognia.internal.Gg
    public final D5f sVU() {
        return this.f8754J;
    }

    public static final void W(G5G g5g, KYK kyk) {
        g5g.f8755R.remove(kyk);
        if (g5g.f8755R.isEmpty() && g5g.DOu) {
            g5g.olU();
        }
    }

    public static final void b(G5G g5g) {
        if (g5g.f8755R.isEmpty()) {
            return;
        }
        g5g.V();
    }

    @Override // com.incognia.internal.Gg
    public final void b(Cj0 cj0) {
        njO.b(this, new C1824b(2, this, cj0));
    }

    public static final void b(G5G g5g, Function0 function0) {
        g5g.f8755R.clear();
        g5g.olU();
        g5g.DOu = false;
        g5g.f8754J = L4.f9041b;
        function0.invoke();
    }

    public final ArrayList W() {
        if (this.sVU.W() && this.f8759f9.gmP()) {
            try {
                List<CellInfo> allCellInfo = this.PqK.getAllCellInfo();
                if (allCellInfo == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = allCellInfo.iterator();
                while (it.hasNext()) {
                    zhK W5 = this.f8756V.W((CellInfo) it.next());
                    if (W5 != null) {
                        arrayList.add(W5);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                int i4 = 0;
                while (i4 < size) {
                    Object obj = arrayList.get(i4);
                    i4++;
                    if (((zhK) obj).b()) {
                        arrayList2.add(obj);
                    }
                }
                return arrayList2;
            } catch (Throwable th) {
                this.f8757W.b(th, false);
            }
        }
        return null;
    }

    public final void b(KYK kyk) {
        njO.b(this, new C1829g(this, kyk, 0));
    }

    public static final void b(G5G g5g, KYK kyk) {
        if (g5g.f8755R.isEmpty() || !g5g.DOu) {
            g5g.V();
        }
        g5g.f8755R.add(kyk);
    }

    public final void b(int i4) {
        njO.b(this, new C1830h(i4, this));
    }

    public static final void b(int i4, G5G g5g) {
        int i5 = R0t.f9532W;
        R0t b2 = lW.b(i4);
        Iterator it = g5g.f8755R.iterator();
        while (it.hasNext()) {
            ((KYK) it.next()).b(b2);
        }
    }
}
