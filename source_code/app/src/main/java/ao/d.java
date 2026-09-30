package ao;

import android.animation.ValueAnimator;
import android.content.ContentValues;
import android.content.res.Resources;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.i1;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.internal.measurement.A0;
import com.google.android.gms.internal.measurement.D0;
import com.google.android.gms.internal.measurement.ao;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import com.google.android.gms.measurement.internal.B0;
import com.google.android.gms.measurement.internal.C0;
import com.google.android.gms.measurement.internal.C1450j;
import com.google.android.gms.measurement.internal.C1458n;
import com.google.android.gms.measurement.internal.C1459n0;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.H;
import com.google.android.gms.measurement.internal.H0;
import com.google.android.gms.measurement.internal.O;
import com.google.android.gms.measurement.internal.Z0;
import com.google.android.gms.measurement.internal.a1;
import com.google.android.gms.measurement.internal.ai;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.au;
import com.google.android.gms.measurement.internal.d1;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzpa;
import com.google.android.gms.measurement.internal.zzpc;
import com.google.android.gms.measurement.internal.zzpe;
import com.google.android.gms.measurement.internal.zzr;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s1.D;
import s1.I;
import s6.A5;
import s6.C2735o7;
import s6.L7;
import s6.P7;
import s6.T6;
import s6.aj;
import t6.AbstractC3048r0;
import t6.H3;
import t6.J2;
import t6.h4;
import t6.m4;
import t6.o4;
import t6.q4;

/* loaded from: classes3.dex */
public final class d implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i4) {
        this.alpha = i4;
        this.teal = obj;
        this.purple = obj2;
        this.red = obj3;
        this.silver = obj4;
    }

    private final void alpha() {
        com.google.android.gms.measurement.internal.ae aeVar;
        H0 h02 = (H0) this.purple;
        AtomicReference atomicReference = (AtomicReference) this.red;
        zzr zzrVar = (zzr) this.silver;
        Bundle bundle = (Bundle) this.teal;
        synchronized (atomicReference) {
            try {
                aeVar = h02.silver;
            } catch (RemoteException e) {
                ar arVar = ((G) h02.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.bravo(e, "Failed to request trigger URIs; remote exception");
                atomicReference.notifyAll();
            }
            if (aeVar == null) {
                ar arVar2 = ((G) h02.alpha).f7507b;
                G.foxtrot(arVar2);
                arVar2.white.alpha("Failed to request trigger URIs; not connected to service");
            } else {
                aeVar.whiskey(zzrVar, bundle, new B0(atomicReference));
                h02.m0();
            }
        }
    }

    private final void bravo() {
        com.google.android.gms.measurement.internal.ae aeVar;
        H0 h02 = (H0) this.purple;
        AtomicReference atomicReference = (AtomicReference) this.red;
        zzr zzrVar = (zzr) this.silver;
        zzpc zzpcVar = (zzpc) this.teal;
        synchronized (atomicReference) {
            try {
                aeVar = h02.silver;
            } catch (RemoteException e) {
                ar arVar = ((G) h02.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.bravo(e, "[sgtm] Failed to get upload batches; remote exception");
                atomicReference.notifyAll();
            }
            if (aeVar == null) {
                ar arVar2 = ((G) h02.alpha).f7507b;
                G.foxtrot(arVar2);
                arVar2.white.alpha("[sgtm] Failed to get upload batches; not connected to service");
            } else {
                aeVar.beige(zzrVar, zzpcVar, new C0(h02, atomicReference));
                h02.m0();
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [B9.r, java.lang.Object] */
    private final void charlie() {
        String str;
        aj ajVar;
        String alpha;
        P7 p72 = (P7) this.purple;
        L7 l72 = (L7) this.red;
        A5 a52 = (A5) this.silver;
        String str2 = (String) this.teal;
        p72.getClass();
        B0.a aVar = (B0.a) l72;
        i1 i1Var = (i1) aVar.charlie;
        i1Var.alpha = a52;
        C2735o7 c2735o7 = (C2735o7) i1Var.bravo;
        if (c2735o7 != null && (str = c2735o7.delta) != null && !str.isEmpty()) {
            V5.x.hotel(str);
        } else {
            str = "NA";
        }
        ?? obj = new Object();
        obj.alpha = p72.alpha;
        obj.bravo = p72.bravo;
        synchronized (P7.class) {
            ajVar = P7.kilo;
            if (ajVar == null) {
                o1.e alpha2 = T6.alpha(Resources.getSystem().getConfiguration());
                s6.ac acVar = new s6.ac();
                for (int i4 = 0; i4 < alpha2.alpha.size(); i4++) {
                    Locale locale = alpha2.alpha.get(i4);
                    V5.g gVar = com.google.mlkit.common.sdkinternal.c.alpha;
                    acVar.alpha(locale.toLanguageTag());
                }
                ajVar = acVar.charlie();
                P7.kilo = ajVar;
            }
        }
        obj.echo = ajVar;
        obj.hotel = Boolean.TRUE;
        obj.delta = str;
        obj.charlie = str2;
        if (p72.foxtrot.juliet()) {
            alpha = (String) p72.foxtrot.hotel();
        } else {
            alpha = p72.delta.alpha();
        }
        obj.foxtrot = alpha;
        obj.juliet = 10;
        obj.kilo = Integer.valueOf(p72.hotel);
        aVar.delta = obj;
        p72.charlie.alpha(l72);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:140|141|(1:143)(5:165|(1:167)(1:169)|168|160|161)|144|(2:147|145)|148|149|150|151|(2:154|152)|155|156|(1:158)|159|160|161) */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0531, code lost:
    
        r5.crimson().f7632b.bravo(r7, "Failed to parse queued batch. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0460, code lost:
    
        if (java.lang.System.currentTimeMillis() >= (r17 + r3)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r6.isEmpty() == false) goto L11;
     */
    /* JADX WARN: Type inference failed for: r8v22, types: [B9.r, java.lang.Object] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        zzpe zzpeVar;
        boolean z2;
        long j5;
        com.google.android.gms.measurement.internal.ae aeVar;
        String str;
        q4 q4Var;
        String alpha;
        byte[] bArr = null;
        boolean z10 = true;
        int i4 = 0;
        switch (this.alpha) {
            case 0:
                e eVar = (e) this.purple;
                if (eVar != null) {
                    androidx.core.widget.f fVar = (androidx.core.widget.f) this.teal;
                    ((f) fVar.purple).f3201s = true;
                    eVar.bravo.charlie(false);
                    ((f) fVar.purple).f3201s = false;
                }
                n nVar = (n) this.red;
                if (nVar.isEnabled() && nVar.hasSubMenu()) {
                    ((l) this.silver).quebec(nVar, null, 4);
                    return;
                }
                return;
            case 1:
                ai aiVar = (ai) this.teal;
                Z0 z02 = ((O) this.purple).golf;
                z02.echo();
                boolean j02 = z02.white().j0(null, com.google.android.gms.measurement.internal.ac.f7568I);
                String str2 = (String) this.red;
                if (!j02) {
                    zzpeVar = new zzpe(Collections.EMPTY_LIST);
                } else {
                    ad.crimson(z02);
                    C1450j c1450j = z02.red;
                    Z0.cyan(c1450j);
                    List<a1> d02 = c1450j.d0(str2, (zzpc) this.silver, ((Integer) com.google.android.gms.measurement.internal.ac.azure.alpha(null)).intValue());
                    ArrayList arrayList = new ArrayList();
                    for (a1 a1Var : d02) {
                        boolean plum = z02.plum(str2, a1Var.charlie);
                        long j6 = a1Var.alpha;
                        if (!plum) {
                            z02.crimson().f7636g.delta("[sgtm] batch skipped due to destination in backoff. appId, rowId, url", str2, Long.valueOf(j6), a1Var.charlie);
                        } else {
                            int i5 = a1Var.hotel;
                            if (i5 <= 0) {
                                z2 = z10;
                            } else {
                                int intValue = ((Integer) com.google.android.gms.measurement.internal.ac.zulu.alpha(null)).intValue();
                                long j7 = a1Var.golf;
                                if (i5 > intValue) {
                                    z2 = z10;
                                    j5 = j7;
                                } else {
                                    long j10 = 1 << (i5 - 1);
                                    z2 = z10;
                                    j5 = j7;
                                    long min = Math.min(((Long) com.google.android.gms.measurement.internal.ac.xray.alpha(null)).longValue() * j10, ((Long) com.google.android.gms.measurement.internal.ac.yankee.alpha(null)).longValue());
                                    z02.pink().getClass();
                                    break;
                                }
                                z02.crimson().f7636g.delta("[sgtm] batch skipped waiting for next retry. appId, rowId, lastUploadMillis", str2, Long.valueOf(j6), Long.valueOf(j5));
                                z10 = z2;
                            }
                            Bundle bundle = new Bundle();
                            for (Map.Entry entry : a1Var.delta.entrySet()) {
                                bundle.putString((String) entry.getKey(), (String) entry.getValue());
                            }
                            zzpa zzpaVar = new zzpa(a1Var.alpha, a1Var.bravo.charlie(), a1Var.charlie, bundle, a1Var.echo.alpha, a1Var.foxtrot, "");
                            A0 a02 = (A0) au.C0(com.google.android.gms.internal.measurement.B0.oscar(), zzpaVar.purple);
                            for (int i10 = 0; i10 < ((com.google.android.gms.internal.measurement.B0) a02.purple).november(); i10++) {
                                com.google.android.gms.internal.measurement.C0 c02 = (com.google.android.gms.internal.measurement.C0) ((com.google.android.gms.internal.measurement.B0) a02.purple).quebec(i10).foxtrot();
                                z02.pink().getClass();
                                long currentTimeMillis = System.currentTimeMillis();
                                c02.golf();
                                D0.t0((D0) c02.purple, currentTimeMillis);
                                a02.golf();
                                com.google.android.gms.internal.measurement.B0.xray((com.google.android.gms.internal.measurement.B0) a02.purple, i10, (D0) c02.echo());
                            }
                            zzpaVar.purple = ((com.google.android.gms.internal.measurement.B0) a02.echo()).charlie();
                            if (Log.isLoggable(z02.crimson().h0(), 2)) {
                                au auVar = z02.yellow;
                                Z0.cyan(auVar);
                                zzpaVar.yellow = auVar.D0((com.google.android.gms.internal.measurement.B0) a02.echo());
                            }
                            arrayList.add(zzpaVar);
                            z10 = z2;
                        }
                    }
                    zzpeVar = new zzpe(arrayList);
                }
                try {
                    aiVar.sierra(zzpeVar);
                    z02.crimson().f7636g.charlie(str2, Integer.valueOf(zzpeVar.alpha.size()), "[sgtm] Sending queued upload batches to client. appId, count");
                    return;
                } catch (RemoteException e) {
                    z02.crimson().white.charlie(str2, e, "[sgtm] Failed to return upload batches for app");
                    return;
                }
            case 2:
                O o5 = (O) this.purple;
                Z0 z03 = o5.golf;
                boolean j03 = z03.white().j0(null, com.google.android.gms.measurement.internal.ac.f7580V);
                boolean j04 = z03.white().j0(null, com.google.android.gms.measurement.internal.ac.f7582X);
                Bundle bundle2 = (Bundle) this.red;
                boolean isEmpty = bundle2.isEmpty();
                String str3 = (String) this.silver;
                Z0 z04 = o5.golf;
                if (isEmpty && j03) {
                    C1450j c1450j2 = z04.red;
                    Z0.cyan(c1450j2);
                    c1450j2.W();
                    c1450j2.X();
                    try {
                        c1450j2.S0().execSQL("delete from default_event_params where app_id=?", new String[]{str3});
                        return;
                    } catch (SQLiteException e4) {
                        ar arVar = ((G) c1450j2.alpha).f7507b;
                        G.foxtrot(arVar);
                        arVar.white.bravo(e4, "Error clearing default event params");
                        return;
                    }
                }
                C1450j c1450j3 = z03.red;
                Z0.cyan(c1450j3);
                c1450j3.W();
                c1450j3.X();
                C1458n c1458n = new C1458n((G) c1450j3.alpha, "", str3, "dep", 0L, 0L, bundle2);
                au auVar2 = c1450j3.purple.yellow;
                Z0.cyan(auVar2);
                byte[] charlie = auVar2.B0(c1458n).charlie();
                ar arVar2 = ((G) c1450j3.alpha).f7507b;
                G.foxtrot(arVar2);
                arVar2.f7636g.charlie(str3, Integer.valueOf(charlie.length), "Saving default event parameters, appId, data size");
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("parameters", charlie);
                try {
                    if (c1450j3.S0().insertWithOnConflict("default_event_params", null, contentValues, 5) == -1) {
                        G.foxtrot(arVar2);
                        arVar2.white.bravo(ar.e0(str3), "Failed to insert default event parameters (got -1). appId");
                    }
                } catch (SQLiteException e5) {
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(ar.e0(str3), e5, "Error storing default event parameters. appId");
                }
                C1450j c1450j4 = z04.red;
                Z0.cyan(c1450j4);
                long j11 = ((zzr) this.teal).f7720y;
                G g2 = (G) c1450j4.alpha;
                if (!g2.yellow.j0(null, com.google.android.gms.measurement.internal.ac.f7582X)) {
                    g2.f7511g.getClass();
                    if (System.currentTimeMillis() > 15000 + j11) {
                        return;
                    }
                }
                try {
                    if (c1450j4.O0("select count(*) from raw_events where app_id=? and timestamp >= ? and name not like '!_%' escape '!' limit 1;", new String[]{str3, String.valueOf(j11)}, 0L) <= 0) {
                        if (c1450j4.O0("select count(*) from raw_events where app_id=? and timestamp >= ? and name like '!_%' escape '!' limit 1;", new String[]{str3, String.valueOf(j11)}, 0L) > 0) {
                            if (j04) {
                                C1450j c1450j5 = z04.red;
                                Z0.cyan(c1450j5);
                                c1450j5.g0(str3, Long.valueOf(j11), null, bundle2);
                                return;
                            } else {
                                C1450j c1450j6 = z04.red;
                                Z0.cyan(c1450j6);
                                c1450j6.g0(str3, null, null, bundle2);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                } catch (SQLiteException e10) {
                    ar arVar3 = g2.f7507b;
                    G.foxtrot(arVar3);
                    arVar3.white.bravo(e10, "Error checking backfill conditions");
                    return;
                }
            case 3:
                H0 mike = ((AppMeasurementDynamiteService) this.teal).golf.mike();
                mike.W();
                mike.X();
                G g5 = (G) mike.alpha;
                d1 d1Var = g5.e;
                G.delta(d1Var);
                int isGooglePlayServicesAvailable = com.google.android.gms.common.d.getInstance().isGooglePlayServicesAvailable(((G) d1Var.alpha).alpha, com.google.android.gms.common.e.GOOGLE_PLAY_SERVICES_VERSION_CODE);
                ao aoVar = (ao) this.purple;
                if (isGooglePlayServicesAvailable != 0) {
                    ar arVar4 = g5.f7507b;
                    G.foxtrot(arVar4);
                    arVar4.f7632b.alpha("Not bundling data. Service unavailable or out of date");
                    d1 d1Var2 = g5.e;
                    G.delta(d1Var2);
                    d1Var2.v0(aoVar, new byte[0]);
                    return;
                }
                mike.n0(new d(mike, (zzbh) this.red, (String) this.silver, aoVar, 8));
                return;
            case 4:
                H0 mike2 = ((G) ((C1459n0) this.teal).alpha).mike();
                mike2.W();
                mike2.X();
                mike2.n0(new H(mike2, (AtomicReference) this.purple, (String) this.red, (String) this.silver, mike2.k0(false)));
                return;
            case 5:
                alpha();
                return;
            case 6:
                bravo();
                return;
            case 7:
                H0 mike3 = ((AppMeasurementDynamiteService) this.teal).golf.mike();
                mike3.W();
                mike3.X();
                mike3.n0(new H(mike3, (String) this.red, (String) this.silver, mike3.k0(false), (ao) this.purple));
                return;
            case 8:
                ao aoVar2 = (ao) this.silver;
                H0 h02 = (H0) this.teal;
                G g10 = (G) h02.alpha;
                try {
                    try {
                        aeVar = h02.silver;
                    } finally {
                        d1 d1Var3 = g10.e;
                        G.delta(d1Var3);
                        d1Var3.v0(aoVar2, null);
                    }
                } catch (RemoteException e11) {
                    ar arVar5 = g10.f7507b;
                    G.foxtrot(arVar5);
                    arVar5.white.bravo(e11, "Failed to send event to the service to bundle");
                }
                if (aeVar == null) {
                    ar arVar6 = g10.f7507b;
                    G.foxtrot(arVar6);
                    arVar6.white.alpha("Discarding data. Failed to send event to service to bundle");
                    return;
                } else {
                    bArr = aeVar.blue((zzbh) this.purple, (String) this.red);
                    h02.m0();
                    return;
                }
            case 9:
                Z0 z05 = (Z0) ((androidx.core.widget.f) this.teal).purple;
                d1 bravo = z05.bravo();
                z05.pink().getClass();
                zzbh c03 = bravo.c0((String) this.red, (Bundle) this.silver, "auto", System.currentTimeMillis(), false);
                V5.x.hotel(c03);
                z05.mike(c03, (String) this.purple);
                return;
            case 10:
                D.india((View) this.purple, (I) this.red, (com.google.android.play.core.integrity.k) this.silver);
                ((ValueAnimator) this.teal).start();
                return;
            case 11:
                charlie();
                return;
            default:
                h4 h4Var = (h4) this.purple;
                com.google.android.material.internal.ab abVar = (com.google.android.material.internal.ab) this.red;
                J2 j22 = (J2) this.silver;
                String str4 = (String) this.teal;
                h4Var.getClass();
                com.bumptech.glide.load.engine.h hVar = (com.bumptech.glide.load.engine.h) abVar.purple;
                hVar.red = j22;
                H3 h32 = (H3) hVar.purple;
                if (h32 != null) {
                    int i11 = AbstractC3048r0.alpha;
                    str = h32.delta;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                ?? obj = new Object();
                obj.alpha = h4Var.alpha;
                obj.bravo = h4Var.bravo;
                synchronized (h4.class) {
                    q4Var = h4.juliet;
                    if (q4Var == null) {
                        o1.e alpha2 = T6.alpha(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i12 = 0;
                        while (i4 < alpha2.alpha.size()) {
                            Locale locale = alpha2.alpha.get(i4);
                            V5.g gVar = com.google.mlkit.common.sdkinternal.c.alpha;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i13 = i12 + 1;
                            int length = objArr.length;
                            if (length < i13) {
                                int i14 = length + (length >> 1) + 1;
                                if (i14 < i13) {
                                    int highestOneBit = Integer.highestOneBit(i12);
                                    i14 = highestOneBit + highestOneBit;
                                }
                                if (i14 < 0) {
                                    i14 = LottieConstants.IterateForever;
                                }
                                objArr = Arrays.copyOf(objArr, i14);
                            }
                            objArr[i12] = languageTag;
                            i4++;
                            i12 = i13;
                        }
                        m4 m4Var = o4.purple;
                        if (i12 == 0) {
                            q4Var = q4.teal;
                        } else {
                            q4Var = new q4(i12, objArr);
                        }
                        h4.juliet = q4Var;
                    }
                }
                obj.echo = q4Var;
                obj.hotel = Boolean.TRUE;
                obj.delta = str;
                obj.charlie = str4;
                if (h4Var.foxtrot.juliet()) {
                    alpha = (String) h4Var.foxtrot.hotel();
                } else {
                    alpha = h4Var.delta.alpha();
                }
                obj.foxtrot = alpha;
                obj.juliet = 10;
                obj.kilo = Integer.valueOf(h4Var.hotel);
                abVar.red = obj;
                h4Var.charlie.alpha(abVar);
                return;
        }
    }

    public /* synthetic */ d(Object obj, Object obj2, Object obj3, Object obj4, int i4, boolean z2) {
        this.alpha = i4;
        this.purple = obj;
        this.red = obj2;
        this.silver = obj3;
        this.teal = obj4;
    }
}
