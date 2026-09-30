package r6;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class i extends AbstractC2498f {
    public final transient l red;
    public final transient Object[] silver;
    public final transient int teal;

    public i(l lVar, Object[] objArr, int i4) {
        this.red = lVar;
        this.silver = objArr;
        this.teal = i4;
    }

    @Override // r6.AbstractC2493a
    public final int alpha(Object[] objArr) {
        AbstractC2496d abstractC2496d = this.purple;
        if (abstractC2496d == null) {
            abstractC2496d = new h(this);
            this.purple = abstractC2496d;
        }
        return abstractC2496d.alpha(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.red.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        AbstractC2496d abstractC2496d = this.purple;
        if (abstractC2496d == null) {
            abstractC2496d = new h(this);
            this.purple = abstractC2496d;
        }
        return abstractC2496d.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.teal;
    }
}
