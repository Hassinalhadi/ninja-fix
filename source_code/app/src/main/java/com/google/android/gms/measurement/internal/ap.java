package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import e6.AbstractC1630b;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class ap implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final int purple;
    public final String red;
    public final Object silver;
    public final Object teal;
    public final Object white;
    public final Object yellow;

    public ap(ar arVar, int i4, String str, Object obj, Object obj2, Object obj3) {
        this.purple = i4;
        this.red = str;
        this.silver = obj;
        this.teal = obj2;
        this.white = obj3;
        this.yellow = arVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        switch (this.alpha) {
            case 0:
                ar arVar = (ar) this.yellow;
                ax axVar = ((G) arVar.alpha).f7506a;
                G.delta(axVar);
                if (axVar.purple) {
                    if (arVar.red == 0) {
                        C1440e c1440e = ((G) arVar.alpha).yellow;
                        if (c1440e.teal == null) {
                            synchronized (c1440e) {
                                try {
                                    if (c1440e.teal == null) {
                                        G g2 = (G) c1440e.alpha;
                                        ApplicationInfo applicationInfo = g2.alpha.getApplicationInfo();
                                        String bravo = AbstractC1630b.bravo();
                                        if (applicationInfo != null) {
                                            String str = applicationInfo.processName;
                                            if (str != null && str.equals(bravo)) {
                                                z2 = true;
                                            } else {
                                                z2 = false;
                                            }
                                            c1440e.teal = Boolean.valueOf(z2);
                                        }
                                        if (c1440e.teal == null) {
                                            c1440e.teal = Boolean.TRUE;
                                            ar arVar2 = g2.f7507b;
                                            G.foxtrot(arVar2);
                                            arVar2.white.alpha("My process not in the list of running processes");
                                        }
                                    }
                                } finally {
                                }
                            }
                        }
                        if (c1440e.teal.booleanValue()) {
                            arVar.red = 'C';
                        } else {
                            arVar.red = Constants.INAPP_POSITION_CENTER;
                        }
                    }
                    if (arVar.silver < 0) {
                        ((G) arVar.alpha).yellow.d0();
                        arVar.silver = 119002L;
                    }
                    char charAt = "01VDIWEA?".charAt(this.purple);
                    char c3 = arVar.red;
                    long j5 = arVar.silver;
                    String str2 = this.red;
                    String f02 = ar.f0(true, str2, this.silver, this.teal, this.white);
                    StringBuilder sb2 = new StringBuilder("2");
                    sb2.append(charAt);
                    sb2.append(c3);
                    sb2.append(j5);
                    String gold = androidx.appcompat.widget.P0.gold(sb2, ":", f02);
                    if (gold.length() > 1024) {
                        gold = str2.substring(0, Barcode.FORMAT_UPC_E);
                    }
                    C2.d dVar = axVar.white;
                    if (dVar != null) {
                        ax axVar2 = (ax) dVar.teal;
                        axVar2.W();
                        if (((ax) dVar.teal).b0().getLong((String) dVar.purple, 0L) == 0) {
                            dVar.foxtrot();
                        }
                        if (gold == null) {
                            gold = "";
                        }
                        SharedPreferences b02 = axVar2.b0();
                        String str3 = (String) dVar.red;
                        long j6 = b02.getLong(str3, 0L);
                        String str4 = (String) dVar.silver;
                        if (j6 <= 0) {
                            SharedPreferences.Editor edit = axVar2.b0().edit();
                            edit.putString(str4, gold);
                            edit.putLong(str3, 1L);
                            edit.apply();
                            return;
                        }
                        d1 d1Var = ((G) axVar2.alpha).e;
                        G.delta(d1Var);
                        long nextLong = d1Var.i0().nextLong() & Long.MAX_VALUE;
                        long j7 = j6 + 1;
                        long j10 = Long.MAX_VALUE / j7;
                        SharedPreferences.Editor edit2 = axVar2.b0().edit();
                        if (nextLong < j10) {
                            edit2.putString(str4, gold);
                        }
                        edit2.putLong(str3, j7);
                        edit2.apply();
                        return;
                    }
                    return;
                }
                Log.println(6, arVar.h0(), "Persisted config not initialized. Not logging error/warn");
                return;
            default:
                ((as) this.silver).hotel(this.red, this.purple, (IOException) this.teal, (byte[]) this.white, (Map) this.yellow);
                return;
        }
    }

    public /* synthetic */ ap(String str, as asVar, int i4, IOException iOException, byte[] bArr, Map map) {
        V5.x.hotel(asVar);
        this.silver = asVar;
        this.purple = i4;
        this.teal = iOException;
        this.white = bArr;
        this.red = str;
        this.yellow = map;
    }
}
