package s6;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class al extends ag {
    public final transient ao red;
    public final transient Object[] silver;
    public final transient int teal = 1;

    public al(ao aoVar, Object[] objArr) {
        this.red = aoVar;
        this.silver = objArr;
    }

    @Override // s6.aa
    public final int alpha(int i4, Object[] objArr) {
        af afVar = this.purple;
        if (afVar == null) {
            afVar = new ak(this);
            this.purple = afVar;
        }
        return afVar.alpha(i4, objArr);
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
        af afVar = this.purple;
        if (afVar == null) {
            afVar = new ak(this);
            this.purple = afVar;
        }
        return afVar.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.teal;
    }
}
