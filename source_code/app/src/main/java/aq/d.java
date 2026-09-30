package aq;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d extends e implements Iterator {
    public c alpha;
    public boolean purple = true;
    public final /* synthetic */ f red;

    public d(f fVar) {
        this.red = fVar;
    }

    @Override // aq.e
    public final void alpha(c cVar) {
        boolean z2;
        c cVar2 = this.alpha;
        if (cVar == cVar2) {
            c cVar3 = cVar2.silver;
            this.alpha = cVar3;
            if (cVar3 == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.purple = z2;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.purple) {
            if (this.red.alpha == null) {
                return false;
            }
            return true;
        }
        c cVar = this.alpha;
        if (cVar == null || cVar.red == null) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        if (this.purple) {
            this.purple = false;
            this.alpha = this.red.alpha;
        } else {
            c cVar2 = this.alpha;
            if (cVar2 != null) {
                cVar = cVar2.red;
            } else {
                cVar = null;
            }
            this.alpha = cVar;
        }
        return this.alpha;
    }
}
