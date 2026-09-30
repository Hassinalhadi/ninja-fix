package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class A0 implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ String purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ zzr silver;
    public final /* synthetic */ boolean teal;
    public final /* synthetic */ H0 white;
    public final /* synthetic */ Object yellow;

    public A0(H0 h02, String str, String str2, zzr zzrVar, boolean z2, com.google.android.gms.internal.measurement.ao aoVar) {
        this.purple = str;
        this.red = str2;
        this.silver = zzrVar;
        this.teal = z2;
        this.yellow = aoVar;
        this.white = h02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        d1 d1Var;
        ae aeVar;
        String str;
        AtomicReference atomicReference;
        H0 h02;
        ae aeVar2;
        switch (this.alpha) {
            case 0:
                String str2 = this.purple;
                com.google.android.gms.internal.measurement.ao aoVar = (com.google.android.gms.internal.measurement.ao) this.yellow;
                H0 h03 = this.white;
                G g2 = (G) h03.alpha;
                Bundle bundle = new Bundle();
                try {
                    try {
                        aeVar = h03.silver;
                        str = this.red;
                    } catch (RemoteException e) {
                        e = e;
                    }
                    if (aeVar == null) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.white.charlie(str2, str, "Failed to get user properties; not connected to service");
                        d1Var = g2.e;
                        G.delta(d1Var);
                        d1Var.u0(aoVar, bundle);
                        return;
                    }
                    List<zzqb> hotel = aeVar.hotel(str2, str, this.teal, this.silver);
                    Bundle bundle2 = new Bundle();
                    if (hotel != null) {
                        for (zzqb zzqbVar : hotel) {
                            String str3 = zzqbVar.teal;
                            String str4 = zzqbVar.purple;
                            if (str3 != null) {
                                bundle2.putString(str4, str3);
                            } else {
                                Long l10 = zzqbVar.silver;
                                if (l10 != null) {
                                    bundle2.putLong(str4, l10.longValue());
                                } else {
                                    Double d4 = zzqbVar.yellow;
                                    if (d4 != null) {
                                        bundle2.putDouble(str4, d4.doubleValue());
                                    }
                                }
                            }
                        }
                    }
                    try {
                        h03.m0();
                        d1 d1Var2 = g2.e;
                        G.delta(d1Var2);
                        d1Var2.u0(aoVar, bundle2);
                        return;
                    } catch (RemoteException e4) {
                        e = e4;
                        bundle = bundle2;
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.white.charlie(str2, e, "Failed to get user properties; remote exception");
                        d1Var = g2.e;
                        G.delta(d1Var);
                        d1Var.u0(aoVar, bundle);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        bundle = bundle2;
                        d1 d1Var3 = g2.e;
                        G.delta(d1Var3);
                        d1Var3.u0(aoVar, bundle);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.yellow;
                synchronized (atomicReference2) {
                    try {
                        try {
                            h02 = this.white;
                            aeVar2 = h02.silver;
                        } catch (RemoteException e5) {
                            ar arVar3 = ((G) this.white.alpha).f7507b;
                            G.foxtrot(arVar3);
                            arVar3.white.delta("(legacy) Failed to get user properties; remote exception", null, this.purple, e5);
                            ((AtomicReference) this.yellow).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.yellow;
                        }
                        if (aeVar2 == null) {
                            ar arVar4 = ((G) h02.alpha).f7507b;
                            G.foxtrot(arVar4);
                            arVar4.white.delta("(legacy) Failed to get user properties; not connected to service", null, this.purple, this.red);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(aeVar2.hotel(this.purple, this.red, this.teal, this.silver));
                        } else {
                            atomicReference2.set(aeVar2.echo(null, this.purple, this.teal, this.red));
                        }
                        h02.m0();
                        atomicReference = (AtomicReference) this.yellow;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th3) {
                        ((AtomicReference) this.yellow).notify();
                        throw th3;
                    }
                }
        }
    }

    public A0(H0 h02, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z2) {
        this.yellow = atomicReference;
        this.purple = str;
        this.red = str2;
        this.silver = zzrVar;
        this.teal = z2;
        this.white = h02;
    }
}
