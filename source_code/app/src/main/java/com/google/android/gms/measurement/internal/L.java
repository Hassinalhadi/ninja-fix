package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* loaded from: classes2.dex */
public final class L implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ long silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;

    public /* synthetic */ L(Object obj, Object obj2, Object obj3, Object obj4, long j5, int i4) {
        this.alpha = i4;
        this.purple = obj2;
        this.red = obj3;
        this.teal = obj4;
        this.silver = j5;
        this.white = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                String str = (String) this.red;
                O o5 = (O) this.white;
                String str2 = (String) this.purple;
                if (str2 == null) {
                    Z0 z02 = o5.golf;
                    z02.u().W();
                    String str3 = z02.f7562z;
                    if (str3 == null || str3.equals(str)) {
                        z02.f7562z = str;
                        z02.f7561y = null;
                        return;
                    }
                    return;
                }
                C1474v0 c1474v0 = new C1474v0((String) this.teal, this.silver, str2);
                Z0 z03 = o5.golf;
                z03.u().W();
                String str4 = z03.f7562z;
                if (str4 != null) {
                    str4.equals(str);
                }
                z03.f7562z = str;
                z03.f7561y = c1474v0;
                return;
            case 1:
                Object obj = this.teal;
                ((C1459n0) this.white).r0(this.silver, obj, (String) this.purple, (String) this.red);
                return;
            default:
                Bundle bundle = (Bundle) this.purple;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                C1480y0 c1480y0 = (C1480y0) this.white;
                d1 d1Var = ((G) c1480y0.alpha).e;
                G.delta(d1Var);
                c1480y0.b0((C1474v0) this.red, (C1474v0) this.teal, this.silver, true, d1Var.a0("screen_view", bundle, null, false));
                return;
        }
    }
}
