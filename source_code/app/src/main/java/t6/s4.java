package t6;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class s4 extends p4 {
    public final transient s6.ao red;
    public final transient Object[] silver;
    public final transient int teal = 1;

    public s4(s6.ao aoVar, Object[] objArr) {
        this.red = aoVar;
        this.silver = objArr;
    }

    @Override // t6.G3
    public final int alpha(Object[] objArr) {
        o4 o4Var = this.purple;
        if (o4Var == null) {
            o4Var = new r4(this);
            this.purple = o4Var;
        }
        return o4Var.alpha(objArr);
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
        o4 o4Var = this.purple;
        if (o4Var == null) {
            o4Var = new r4(this);
            this.purple = o4Var;
        }
        return o4Var.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.teal;
    }
}
