package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final /* synthetic */ class H implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public H(H0 h02, String str, String str2, zzr zzrVar, com.google.android.gms.internal.measurement.ao aoVar) {
        this.alpha = 2;
        this.purple = str;
        this.silver = str2;
        this.red = zzrVar;
        this.teal = aoVar;
        this.white = h02;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        H0 h02;
        ae aeVar;
        d1 d1Var;
        ae aeVar2;
        switch (this.alpha) {
            case 0:
                ag agVar = (ag) this.white;
                O o5 = (O) this.silver;
                Z0 z02 = o5.golf;
                z02.echo();
                try {
                    agVar.cyan(z02.delta((Bundle) this.teal, (zzr) this.red));
                    return;
                } catch (RemoteException e) {
                    o5.golf.crimson().white.charlie((String) this.purple, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.silver;
                synchronized (atomicReference2) {
                    try {
                        try {
                            h02 = (H0) this.white;
                            aeVar = h02.silver;
                        } catch (RemoteException e4) {
                            ar arVar = ((G) ((H0) this.white).alpha).f7507b;
                            G.foxtrot(arVar);
                            arVar.white.delta("(legacy) Failed to get conditional properties; remote exception", null, (String) this.purple, e4);
                            ((AtomicReference) this.silver).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.silver;
                        }
                        if (aeVar == null) {
                            ar arVar2 = ((G) h02.alpha).f7507b;
                            G.foxtrot(arVar2);
                            arVar2.white.delta("(legacy) Failed to get conditional properties; not connected to service", null, (String) this.purple, (String) this.teal);
                            atomicReference2.set(Collections.EMPTY_LIST);
                            atomicReference2.notify();
                            return;
                        }
                        if (TextUtils.isEmpty(null)) {
                            atomicReference2.set(aeVar.indigo((String) this.purple, (String) this.teal, (zzr) this.red));
                        } else {
                            atomicReference2.set(aeVar.papa(null, (String) this.purple, (String) this.teal));
                        }
                        h02.m0();
                        atomicReference = (AtomicReference) this.silver;
                        atomicReference.notify();
                        return;
                    } catch (Throwable th) {
                        ((AtomicReference) this.silver).notify();
                        throw th;
                    }
                }
            case 2:
                com.google.android.gms.internal.measurement.ao aoVar = (com.google.android.gms.internal.measurement.ao) this.teal;
                String str = (String) this.silver;
                String str2 = (String) this.purple;
                H0 h03 = (H0) this.white;
                G g2 = (G) h03.alpha;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        aeVar2 = h03.silver;
                    } catch (RemoteException e5) {
                        ar arVar3 = g2.f7507b;
                        G.foxtrot(arVar3);
                        arVar3.white.delta("Failed to get conditional properties; remote exception", str2, str, e5);
                    }
                    if (aeVar2 == null) {
                        ar arVar4 = g2.f7507b;
                        G.foxtrot(arVar4);
                        arVar4.white.charlie(str2, str, "Failed to get conditional properties; not connected to service");
                        d1Var = g2.e;
                        G.delta(d1Var);
                        d1Var.t0(aoVar, arrayList);
                        return;
                    }
                    arrayList = d1.j0(aeVar2.indigo(str2, str, (zzr) this.red));
                    h03.m0();
                    d1Var = g2.e;
                    G.delta(d1Var);
                    d1Var.t0(aoVar, arrayList);
                    return;
                } catch (Throwable th2) {
                    d1 d1Var2 = g2.e;
                    G.delta(d1Var2);
                    d1Var2.t0(aoVar, arrayList);
                    throw th2;
                }
            default:
                ((com.google.mlkit.common.sdkinternal.k) this.silver).zza((G6.a) this.red, (G6.b) this.teal, (Callable) this.white, (G6.h) this.purple);
                return;
        }
    }

    public H(H0 h02, AtomicReference atomicReference, String str, String str2, zzr zzrVar) {
        this.alpha = 1;
        this.silver = atomicReference;
        this.purple = str;
        this.teal = str2;
        this.red = zzrVar;
        this.white = h02;
    }

    public /* synthetic */ H(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i4) {
        this.alpha = i4;
        this.silver = obj;
        this.red = obj2;
        this.teal = obj3;
        this.white = obj4;
        this.purple = obj5;
    }
}
