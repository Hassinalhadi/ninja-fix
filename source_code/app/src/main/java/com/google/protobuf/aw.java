package com.google.protobuf;

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

/* loaded from: classes2.dex */
public final class aw extends AbstractMap {
    public static final /* synthetic */ int yellow = 0;
    public final int alpha;
    public List purple = Collections.EMPTY_LIST;
    public Map red;
    public boolean silver;
    public volatile Oe.ah teal;
    public Map white;

    public aw(int i4) {
        this.alpha = i4;
        Map map = Collections.EMPTY_MAP;
        this.red = map;
        this.white = map;
    }

    public final int alpha(Comparable comparable) {
        int i4;
        int size = this.purple.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((A) this.purple.get(i5)).alpha);
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
            int compareTo2 = comparable.compareTo(((A) this.purple.get(i11)).alpha);
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

    public final Map.Entry charlie(int i4) {
        return (Map.Entry) this.purple.get(i4);
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

    public final Iterable delta() {
        if (this.red.isEmpty()) {
            return az.bravo;
        }
        return this.red.entrySet();
    }

    public final SortedMap echo() {
        bravo();
        if (this.red.isEmpty() && !(this.red instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.red = treeMap;
            this.white = treeMap.descendingMap();
        }
        return (SortedMap) this.red;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.teal == null) {
            this.teal = new Oe.ah(this, 4);
        }
        return this.teal;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof aw)) {
                return super.equals(obj);
            }
            aw awVar = (aw) obj;
            int size = size();
            if (size == awVar.size()) {
                int size2 = this.purple.size();
                if (size2 != awVar.purple.size()) {
                    return ((AbstractSet) entrySet()).equals(awVar.entrySet());
                }
                for (int i4 = 0; i4 < size2; i4++) {
                    if (charlie(i4).equals(awVar.charlie(i4))) {
                    }
                }
                if (size2 != size) {
                    return this.red.equals(awVar.red);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: foxtrot, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        bravo();
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return ((A) this.purple.get(alpha)).setValue(obj);
        }
        bravo();
        boolean isEmpty = this.purple.isEmpty();
        int i4 = this.alpha;
        if (isEmpty && !(this.purple instanceof ArrayList)) {
            this.purple = new ArrayList(i4);
        }
        int i5 = -(alpha + 1);
        if (i5 >= i4) {
            return echo().put(comparable, obj);
        }
        if (this.purple.size() == i4) {
            A a6 = (A) this.purple.remove(i4 - 1);
            echo().put(a6.alpha, a6.purple);
        }
        this.purple.add(i5, new A(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return ((A) this.purple.get(alpha)).purple;
        }
        return this.red.get(comparable);
    }

    public final Object golf(int i4) {
        bravo();
        Object obj = ((A) this.purple.remove(i4)).purple;
        if (!this.red.isEmpty()) {
            Iterator it = echo().entrySet().iterator();
            List list = this.purple;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new A(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int size = this.purple.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            i4 += ((A) this.purple.get(i5)).hashCode();
        }
        if (this.red.size() > 0) {
            return this.red.hashCode() + i4;
        }
        return i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        bravo();
        Comparable comparable = (Comparable) obj;
        int alpha = alpha(comparable);
        if (alpha >= 0) {
            return golf(alpha);
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
