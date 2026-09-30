package com.bumptech.glide;

import R3.s;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class l implements R3.a {
    public final s alpha;
    public final /* synthetic */ m bravo;

    public l(m mVar, s sVar) {
        this.bravo = mVar;
        this.alpha = sVar;
    }

    @Override // R3.a
    public final void alpha(boolean z2) {
        if (z2) {
            synchronized (this.bravo) {
                s sVar = this.alpha;
                Iterator it = Y3.l.echo((Set) sVar.red).iterator();
                while (it.hasNext()) {
                    U3.c cVar = (U3.c) it.next();
                    if (!cVar.isComplete() && !cVar.foxtrot()) {
                        cVar.clear();
                        if (!sVar.purple) {
                            cVar.india();
                        } else {
                            ((HashSet) sVar.silver).add(cVar);
                        }
                    }
                }
            }
        }
    }
}
