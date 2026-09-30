package androidx.datastore.preferences.protobuf;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes3.dex */
public final class au extends AbstractMap {
    public static final /* synthetic */ int white = 0;
    public List alpha;
    public Map purple;
    public boolean red;
    public volatile Oe.ah silver;
    public Map teal;

    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.datastore.preferences.protobuf.au, java.util.AbstractMap] */
    public static au foxtrot() {
        ?? abstractMap = new AbstractMap();
        abstractMap.alpha = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        abstractMap.purple = map;
        abstractMap.teal = map;
        return abstractMap;
    }

    public final int alpha(Comparable comparable) {
        int i4;
        int size = this.alpha.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((av) this.alpha.get(i5)).alpha);
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
            int compareTo2 = comparable.compareTo(((av) this.alpha.get(i11)).alpha);
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
        if (!this.red) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    public final Map.Entry charlie(int i4) {
        return (Map.Entry) this.alpha.get(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        bravo();
        if (!this.alpha.isEmpty()) {
            this.alpha.clear();
        }
        if (!this.purple.isEmpty()) {
            this.purple.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (alpha(comparable) < 0 && !this.purple.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final Set delta() {
        Set entrySet;
        if (this.purple.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.purple.entrySet();
        }
        return entrySet;
    }

    public final SortedMap echo() {
        bravo();
        if (this.purple.isEmpty() && !(this.purple instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.purple = treeMap;
            this.teal = treeMap.descendingMap();
        }
        return (SortedMap) this.purple;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.silver == null) {
            this.silver = new Oe.ah(this, 1);
        }
        return this.silver;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof au)) {
                return super.equals(obj);
            }
            au auVar = (au) obj;
            int size = size();
            if (size == auVar.size()) {
                int size2 = this.alpha.size();
                if (size2 != auVar.alpha.size()) {
                    return ((AbstractSet) entrySet()).equals(auVar.entrySet());
                }
                for (int i4 = 0; i4 < size2; i4++) {
                    if (charlie(i4).equals(auVar.charlie(i4))) {
                    }
                }
                if (size2 != size) {
                    return this.purple.equals(auVar.purple);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return ((av) this.alpha.get(alpha)).purple;
        }
        return this.purple.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: golf, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        bravo();
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return ((av) this.alpha.get(alpha)).setValue(obj);
        }
        bravo();
        if (this.alpha.isEmpty() && !(this.alpha instanceof ArrayList)) {
            this.alpha = new ArrayList(16);
        }
        int i4 = -(alpha + 1);
        if (i4 >= 16) {
            return echo().put(comparable, obj);
        }
        if (this.alpha.size() == 16) {
            av avVar = (av) this.alpha.remove(15);
            echo().put(avVar.alpha, avVar.purple);
        }
        this.alpha.add(i4, new av(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.alpha.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += ((av) this.alpha.get(i5)).hashCode();
        }
        if (this.purple.size() > 0) {
            return this.purple.hashCode() + i4;
        }
        return i4;
    }

    public final Object hotel(int i4) {
        bravo();
        Object obj = ((av) this.alpha.remove(i4)).purple;
        if (!this.purple.isEmpty()) {
            Iterator it = echo().entrySet().iterator();
            List list = this.alpha;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new av(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        bravo();
        Comparable comparable = (Comparable) obj;
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return hotel(alpha);
        }
        if (this.purple.isEmpty()) {
            return null;
        }
        return this.purple.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.purple.size() + this.alpha.size();
    }
}
