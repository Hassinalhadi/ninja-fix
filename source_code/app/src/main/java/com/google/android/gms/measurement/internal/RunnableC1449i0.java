package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.i0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC1449i0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ boolean silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public RunnableC1449i0(C1457m0 c1457m0, boolean z2, Uri uri, String str, String str2) {
        this.alpha = 2;
        this.silver = z2;
        this.teal = uri;
        this.purple = str;
        this.red = str2;
        this.white = c1457m0;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0155 A[Catch: RuntimeException -> 0x0139, TRY_LEAVE, TryCatch #3 {RuntimeException -> 0x0139, blocks: (B:37:0x0103, B:39:0x010e, B:42:0x011b, B:44:0x0121, B:45:0x0140, B:46:0x014d, B:50:0x0155, B:52:0x015a, B:56:0x0174, B:57:0x0183, B:59:0x017b, B:60:0x0192, B:62:0x0199, B:64:0x019f, B:66:0x01a5, B:68:0x01ad, B:70:0x01b5, B:72:0x01bd, B:74:0x01c3, B:77:0x01d0), top: B:36:0x0103 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        C1457m0 c1457m0;
        Bundle i12;
        boolean z2;
        String str;
        CharSequence charSequence;
        switch (this.alpha) {
            case 0:
                H0 mike = ((AppMeasurementDynamiteService) this.white).golf.mike();
                mike.W();
                mike.X();
                mike.n0(new A0(mike, (String) this.purple, (String) this.red, mike.k0(false), this.silver, (com.google.android.gms.internal.measurement.ao) this.teal));
                return;
            case 1:
                H0 mike2 = ((G) ((C1459n0) this.white).alpha).mike();
                mike2.W();
                mike2.X();
                mike2.n0(new A0(mike2, (AtomicReference) this.teal, (String) this.purple, (String) this.red, mike2.k0(false), this.silver));
                return;
            case 2:
                C1457m0 c1457m02 = (C1457m0) this.white;
                C1459n0 c1459n0 = (C1459n0) c1457m02.purple;
                G g2 = (G) c1459n0.alpha;
                c1459n0.W();
                String str2 = (String) this.red;
                Uri uri = (Uri) this.teal;
                try {
                    d1 d1Var = g2.e;
                    ar arVar = g2.f7507b;
                    G.delta(d1Var);
                    try {
                        if (!TextUtils.isEmpty(str2)) {
                            if (!str2.contains("gclid")) {
                                try {
                                    if (!str2.contains("gbraid") && !str2.contains("utm_campaign") && !str2.contains("utm_source") && !str2.contains("utm_medium") && !str2.contains("utm_id") && !str2.contains("dclid") && !str2.contains("srsltid") && !str2.contains("sfmc_id")) {
                                        ar arVar2 = ((G) d1Var.alpha).f7507b;
                                        G.foxtrot(arVar2);
                                        arVar2.f7635f.alpha("Activity created with data 'referrer' without required params");
                                    }
                                } catch (RuntimeException e) {
                                    e = e;
                                    ar arVar3 = ((G) ((C1459n0) c1457m02.purple).alpha).f7507b;
                                    G.foxtrot(arVar3);
                                    arVar3.white.bravo(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                    return;
                                }
                            }
                            i12 = d1Var.i1(Uri.parse("https://google.com/search?".concat(str2)));
                            if (i12 != null) {
                                i12.putString("_cis", "referrer");
                            }
                            String str3 = (String) this.purple;
                            c1457m0 = c1457m02;
                            z2 = this.silver;
                            F f5 = c1459n0.f7682k;
                            if (!z2) {
                                str = "Activity created with data 'referrer' without required params";
                                try {
                                    d1 d1Var2 = g2.e;
                                    G.delta(d1Var2);
                                    Bundle i13 = d1Var2.i1(uri);
                                    if (i13 != null) {
                                        i13.putString("_cis", "intent");
                                        if (i13.containsKey("gclid") || i12 == null || !i12.containsKey("gclid")) {
                                            charSequence = "utm_medium";
                                        } else {
                                            charSequence = "utm_medium";
                                            i13.putString("_cer", "gclid=" + i12.getString("gclid"));
                                        }
                                        c1459n0.h0(str3, "_cmp", i13);
                                        f5.alpha(i13, str3);
                                        if (!TextUtils.isEmpty(str2)) {
                                            G.foxtrot(arVar);
                                            a4.j jVar = arVar.f7635f;
                                            jVar.bravo(str2, "Activity created with referrer");
                                            if (g2.yellow.j0(null, ac.f7619y)) {
                                                if (i12 != null) {
                                                    c1459n0.h0(str3, "_cmp", i12);
                                                    f5.alpha(i12, str3);
                                                } else {
                                                    G.foxtrot(arVar);
                                                    jVar.bravo(str2, "Referrer does not contain valid parameters");
                                                }
                                                g2.f7511g.getClass();
                                                c1459n0.q0("auto", "_ldl", null, true, System.currentTimeMillis());
                                                return;
                                            }
                                            if (str2.contains("gclid") && (str2.contains("utm_campaign") || str2.contains("utm_source") || str2.contains(charSequence) || str2.contains("utm_term") || str2.contains("utm_content"))) {
                                                if (!TextUtils.isEmpty(str2)) {
                                                    g2.f7511g.getClass();
                                                    c1459n0.q0("auto", "_ldl", str2, true, System.currentTimeMillis());
                                                    return;
                                                }
                                                return;
                                            }
                                            G.foxtrot(arVar);
                                            jVar.alpha(str);
                                            return;
                                        }
                                        return;
                                    }
                                } catch (RuntimeException e4) {
                                    e = e4;
                                    c1457m02 = c1457m0;
                                    ar arVar32 = ((G) ((C1459n0) c1457m02.purple).alpha).f7507b;
                                    G.foxtrot(arVar32);
                                    arVar32.white.bravo(e, "Throwable caught in handleReferrerForOnActivityCreated");
                                    return;
                                }
                            } else {
                                str = "Activity created with data 'referrer' without required params";
                            }
                            charSequence = "utm_medium";
                            if (!TextUtils.isEmpty(str2)) {
                            }
                        }
                        i12 = null;
                        String str32 = (String) this.purple;
                        c1457m0 = c1457m02;
                        z2 = this.silver;
                        F f52 = c1459n0.f7682k;
                        if (!z2) {
                        }
                        charSequence = "utm_medium";
                        if (!TextUtils.isEmpty(str2)) {
                        }
                    } catch (RuntimeException e5) {
                        e = e5;
                    }
                } catch (RuntimeException e10) {
                    e = e10;
                    c1457m0 = c1457m02;
                }
                break;
            default:
                H0 h02 = (H0) this.white;
                ae aeVar = h02.silver;
                G g5 = (G) h02.alpha;
                if (aeVar == null) {
                    ar arVar4 = g5.f7507b;
                    G.foxtrot(arVar4);
                    arVar4.white.alpha("Failed to send default event parameters to service");
                    return;
                }
                zzbf zzbfVar = null;
                boolean j02 = g5.yellow.j0(null, ac.f7593e0);
                zzr zzrVar = (zzr) this.teal;
                if (j02) {
                    if (!this.silver) {
                        zzbfVar = (zzbf) this.purple;
                    }
                    h02.d0(aeVar, zzbfVar, zzrVar);
                    return;
                }
                try {
                    aeVar.juliet((Bundle) this.red, zzrVar);
                    h02.m0();
                    return;
                } catch (RemoteException e11) {
                    ar arVar5 = g5.f7507b;
                    G.foxtrot(arVar5);
                    arVar5.white.bravo(e11, "Failed to send default event parameters to service");
                    return;
                }
        }
    }

    public RunnableC1449i0(H0 h02, zzr zzrVar, boolean z2, zzbf zzbfVar, Bundle bundle) {
        this.alpha = 3;
        this.teal = zzrVar;
        this.silver = z2;
        this.purple = zzbfVar;
        this.red = bundle;
        this.white = h02;
    }

    public /* synthetic */ RunnableC1449i0(Object obj, Object obj2, String str, String str2, boolean z2, int i4) {
        this.alpha = i4;
        this.teal = obj2;
        this.purple = str;
        this.red = str2;
        this.silver = z2;
        this.white = obj;
    }
}
