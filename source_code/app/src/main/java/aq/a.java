package aq;

import java.util.HashMap;

/* loaded from: classes3.dex */
public final class a extends f {
    public final HashMap teal = new HashMap();

    @Override // aq.f
    public final c alpha(Object obj) {
        return (c) this.teal.get(obj);
    }

    @Override // aq.f
    public final Object bravo(Object obj, Object obj2) {
        c alpha = alpha(obj);
        if (alpha != null) {
            return alpha.purple;
        }
        HashMap hashMap = this.teal;
        c cVar = new c(obj, obj2);
        this.silver++;
        c cVar2 = this.purple;
        if (cVar2 == null) {
            this.alpha = cVar;
            this.purple = cVar;
        } else {
            cVar2.red = cVar;
            cVar.silver = cVar2;
            this.purple = cVar;
        }
        hashMap.put(obj, cVar);
        return null;
    }

    @Override // aq.f
    public final Object delta(Object obj) {
        Object delta = super.delta(obj);
        this.teal.remove(obj);
        return delta;
    }
}
