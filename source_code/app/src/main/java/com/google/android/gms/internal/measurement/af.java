package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Callable;

/* loaded from: classes2.dex */
public final class af {
    public final com.google.firebase.messaging.o alpha;
    public J2.i bravo;
    public final C1298c charlie;
    public final C1378u delta;

    public af() {
        com.google.firebase.messaging.o oVar = new com.google.firebase.messaging.o(11);
        this.alpha = oVar;
        this.bravo = ((J2.i) oVar.bravo).hotel();
        this.charlie = new C1298c(0);
        this.delta = new C1378u(2);
        final int i4 = 0;
        Callable callable = new Callable(this) { // from class: com.google.android.gms.internal.measurement.a
            public final /* synthetic */ af purple;

            {
                this.purple = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i4) {
                    case 0:
                        return new C1315f1(this.purple.delta);
                    default:
                        return new C1315f1(this.purple.charlie);
                }
            }
        };
        J1 j12 = (J1) oVar.delta;
        ((HashMap) j12.alpha).put("internal.registerCallback", callable);
        final int i5 = 1;
        ((HashMap) j12.alpha).put("internal.eventLogger", new Callable(this) { // from class: com.google.android.gms.internal.measurement.a
            public final /* synthetic */ af purple;

            {
                this.purple = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                switch (i5) {
                    case 0:
                        return new C1315f1(this.purple.delta);
                    default:
                        return new C1315f1(this.purple.charlie);
                }
            }
        });
    }

    public final void alpha(P0 p02) {
        AbstractC1328i abstractC1328i;
        try {
            com.google.firebase.messaging.o oVar = this.alpha;
            this.bravo = ((J2.i) oVar.bravo).hotel();
            if (!(oVar.victor(this.bravo, (Q0[]) p02.oscar().toArray(new Q0[0])) instanceof C1318g)) {
                for (O0 o02 : p02.november().papa()) {
                    D1 oscar = o02.oscar();
                    String november = o02.november();
                    Iterator it = oscar.iterator();
                    while (it.hasNext()) {
                        InterfaceC1355o victor = oVar.victor(this.bravo, (Q0) it.next());
                        if (victor instanceof C1343l) {
                            J2.i iVar = this.bravo;
                            if (!iVar.oscar(november)) {
                                abstractC1328i = null;
                            } else {
                                InterfaceC1355o lima = iVar.lima(november);
                                if (lima instanceof AbstractC1328i) {
                                    abstractC1328i = (AbstractC1328i) lima;
                                } else {
                                    throw new IllegalStateException("Invalid function name: ".concat(String.valueOf(november)));
                                }
                            }
                            if (abstractC1328i != null) {
                                abstractC1328i.charlie(this.bravo, Collections.singletonList(victor));
                            } else {
                                throw new IllegalStateException("Rule function is undefined: ".concat(String.valueOf(november)));
                            }
                        } else {
                            throw new IllegalArgumentException("Invalid rule definition");
                        }
                    }
                }
                return;
            }
            throw new IllegalStateException("Program loading failed");
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }

    public final boolean bravo(C1293b c1293b) {
        C1298c c1298c = this.charlie;
        try {
            c1298c.purple = c1293b;
            c1298c.red = c1293b.clone();
            ((ArrayList) c1298c.silver).clear();
            ((J2.i) this.alpha.charlie).november("runtime.counter", new C1323h(Double.valueOf(0.0d)));
            this.delta.charlie(this.bravo.hotel(), c1298c);
            if (((C1293b) c1298c.red).equals((C1293b) c1298c.purple)) {
                if (((ArrayList) c1298c.silver).isEmpty()) {
                    return false;
                }
                return true;
            }
            return true;
        } catch (Throwable th) {
            throw new zzd(th);
        }
    }
}
