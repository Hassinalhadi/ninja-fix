package S;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ab implements Iterator, Yd.a {
    public final t alpha;
    public final Iterator purple;
    public int red;
    public Map.Entry silver;
    public Map.Entry teal;
    public final /* synthetic */ int white;

    public ab(t tVar, Iterator it, int i4) {
        this.white = i4;
        this.alpha = tVar;
        this.purple = it;
        this.red = tVar.charlie().delta;
        alpha();
    }

    public final void alpha() {
        Map.Entry entry;
        this.silver = this.teal;
        Iterator it = this.purple;
        if (it.hasNext()) {
            entry = (Map.Entry) it.next();
        } else {
            entry = null;
        }
        this.teal = entry;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.teal != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.white) {
            case 0:
                alpha();
                if (this.silver != null) {
                    return new aa(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = this.teal;
                if (entry != null) {
                    alpha();
                    return entry.getKey();
                }
                throw new IllegalStateException();
            default:
                Map.Entry entry2 = this.teal;
                if (entry2 != null) {
                    alpha();
                    return entry2.getValue();
                }
                throw new IllegalStateException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        t tVar = this.alpha;
        if (tVar.charlie().delta == this.red) {
            Map.Entry entry = this.silver;
            if (entry != null) {
                tVar.remove(entry.getKey());
                this.silver = null;
                this.red = tVar.charlie().delta;
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
