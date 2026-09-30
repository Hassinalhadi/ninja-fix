package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.a0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1433a0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1459n0 purple;
    public final /* synthetic */ AtomicReference red;

    public /* synthetic */ RunnableC1433a0(C1459n0 c1459n0, AtomicReference atomicReference, int i4) {
        this.alpha = i4;
        this.purple = c1459n0;
        this.red = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C1459n0 c1459n0 = this.purple;
                ax axVar = ((G) c1459n0.alpha).f7506a;
                G.delta(axVar);
                Bundle tango = axVar.f7644h.tango();
                H0 mike = ((G) c1459n0.alpha).mike();
                mike.W();
                mike.X();
                mike.n0(new ao.d(mike, this.red, mike.k0(false), tango, 5, false));
                return;
            case 1:
                H0 mike2 = ((G) this.purple.alpha).mike();
                EnumC1472u0[] enumC1472u0Arr = {EnumC1472u0.SGTM_CLIENT};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(enumC1472u0Arr[0].alpha));
                zzpc zzpcVar = new zzpc(arrayList);
                mike2.W();
                mike2.X();
                mike2.n0(new ao.d(mike2, this.red, mike2.k0(false), zzpcVar, 6, false));
                return;
            default:
                AtomicReference atomicReference = this.red;
                synchronized (atomicReference) {
                    try {
                        try {
                            G g2 = (G) this.purple.alpha;
                            atomicReference.set(Long.valueOf(g2.yellow.e0(g2.india().c0(), ac.purple)));
                        } finally {
                            this.red.notify();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }
}
