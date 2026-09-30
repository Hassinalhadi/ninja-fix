package aq;

import java.util.Iterator;

/* loaded from: classes3.dex */
public final class b extends e implements Iterator {
    public c alpha;
    public c purple;
    public final /* synthetic */ int red;

    public b(c cVar, c cVar2, int i4) {
        this.red = i4;
        this.alpha = cVar2;
        this.purple = cVar;
    }

    @Override // aq.e
    public final void alpha(c cVar) {
        c cVar2;
        c cVar3 = null;
        if (this.alpha == cVar && cVar == this.purple) {
            this.purple = null;
            this.alpha = null;
        }
        c cVar4 = this.alpha;
        if (cVar4 == cVar) {
            switch (this.red) {
                case 0:
                    cVar2 = cVar4.silver;
                    break;
                default:
                    cVar2 = cVar4.red;
                    break;
            }
            this.alpha = cVar2;
        }
        c cVar5 = this.purple;
        if (cVar5 == cVar) {
            c cVar6 = this.alpha;
            if (cVar5 != cVar6 && cVar6 != null) {
                cVar3 = bravo(cVar5);
            }
            this.purple = cVar3;
        }
    }

    public final c bravo(c cVar) {
        switch (this.red) {
            case 0:
                return cVar.red;
            default:
                return cVar.silver;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.purple != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar;
        c cVar2 = this.purple;
        c cVar3 = this.alpha;
        if (cVar2 != cVar3 && cVar3 != null) {
            cVar = bravo(cVar2);
        } else {
            cVar = null;
        }
        this.purple = cVar;
        return cVar2;
    }
}
