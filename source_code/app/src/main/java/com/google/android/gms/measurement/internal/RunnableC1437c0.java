package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;

/* renamed from: com.google.android.gms.measurement.internal.c0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1437c0 implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ long purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;

    public /* synthetic */ RunnableC1437c0(C1459n0 c1459n0, Bundle bundle, long j5) {
        this.red = c1459n0;
        this.silver = bundle;
        this.purple = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                C1459n0 c1459n0 = (C1459n0) this.red;
                if (TextUtils.isEmpty(((G) c1459n0.alpha).india().d0())) {
                    c1459n0.m0((Bundle) this.silver, 0, this.purple);
                    return;
                }
                ar arVar = ((G) c1459n0.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.f7634d.alpha("Using developer consent only; google app id found");
                return;
            default:
                C1474v0 c1474v0 = (C1474v0) this.red;
                long j5 = this.purple;
                C1480y0 c1480y0 = (C1480y0) this.silver;
                c1480y0.c0(c1474v0, false, j5);
                c1480y0.teal = null;
                H0 mike = ((G) c1480y0.alpha).mike();
                mike.W();
                mike.X();
                mike.n0(new s6.E(13, mike, null, false));
                return;
        }
    }

    public RunnableC1437c0(C1480y0 c1480y0, C1474v0 c1474v0, long j5) {
        this.red = c1474v0;
        this.purple = j5;
        this.silver = c1480y0;
    }
}
