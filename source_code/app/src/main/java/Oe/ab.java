package Oe;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class ab extends AbstractMap {
    public static final /* synthetic */ int white = 0;
    public final int alpha;
    public List purple = Collections.EMPTY_LIST;
    public Map red = Collections.EMPTY_MAP;
    public boolean silver;
    public volatile ah teal;

    public ab(int i4) {
        this.alpha = i4;
    }

    public final int alpha(Comparable comparable) {
        int i4;
        int size = this.purple.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((af) this.purple.get(i5)).alpha);
            if (compareTo > 0) {
                i4 = size + 1;
                return -i4;
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        int i10 = 0;
        while (i10 <= i5) {
            int i11 = (i10 + i5) / 2;
            int compareTo2 = comparable.compareTo(((af) this.purple.get(i11)).alpha);
            if (compareTo2 < 0) {
                i5 = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        i4 = i10 + 1;
        return -i4;
    }

    public final void bravo() {
        if (!this.silver) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Iterable charlie() {
        if (this.red.isEmpty()) {
            return ae.bravo;
        }
        return this.red.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        bravo();
        if (!this.purple.isEmpty()) {
            this.purple.clear();
        }
        if (!this.red.isEmpty()) {
            this.red.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (alpha(comparable) < 0 && !this.red.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final SortedMap delta() {
        bravo();
        if (this.red.isEmpty() && !(this.red instanceof TreeMap)) {
            this.red = new TreeMap();
        }
        return (SortedMap) this.red;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: echo, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        bravo();
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return ((af) this.purple.get(alpha)).setValue(obj);
        }
        bravo();
        boolean isEmpty = this.purple.isEmpty();
        int i4 = this.alpha;
        if (isEmpty && !(this.purple instanceof ArrayList)) {
            this.purple = new ArrayList(i4);
        }
        int i5 = -(alpha + 1);
        if (i5 >= i4) {
            return delta().put(comparable, obj);
        }
        if (this.purple.size() == i4) {
            af afVar = (af) this.purple.remove(i4 - 1);
            delta().put(afVar.alpha, afVar.purple);
        }
        this.purple.add(i5, new af(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.teal == null) {
            this.teal = new ah(this, 0);
        }
        return this.teal;
    }

    public final Object foxtrot(int i4) {
        bravo();
        Object obj = ((af) this.purple.remove(i4)).purple;
        if (!this.red.isEmpty()) {
            Iterator it = delta().entrySet().iterator();
            List list = this.purple;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new af(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return ((af) this.purple.get(alpha)).purple;
        }
        return this.red.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        bravo();
        Comparable comparable = (Comparable) obj;
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return foxtrot(alpha);
        }
        if (this.red.isEmpty()) {
            return null;
        }
        return this.red.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.red.size() + this.purple.size();
    }
}
