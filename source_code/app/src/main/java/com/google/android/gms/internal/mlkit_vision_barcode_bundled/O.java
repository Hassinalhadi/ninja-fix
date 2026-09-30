package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class O extends AbstractMap {
    public static final /* synthetic */ int yellow = 0;
    public Object[] alpha;
    public int purple;
    public Map red;
    public boolean silver;
    public volatile Oe.ah teal;
    public Map white;

    public O() {
        Map map = Collections.EMPTY_MAP;
        this.red = map;
        this.white = map;
    }

    public final Set alpha() {
        Set entrySet;
        if (this.red.isEmpty()) {
            entrySet = Collections.EMPTY_SET;
        } else {
            entrySet = this.red.entrySet();
        }
        return entrySet;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        golf();
        int delta = delta(comparable);
        if (delta >= 0) {
            return ((P) this.alpha[delta]).setValue(obj);
        }
        golf();
        if (this.alpha == null) {
            this.alpha = new Object[16];
        }
        int i4 = -(delta + 1);
        if (i4 >= 16) {
            return foxtrot().put(comparable, obj);
        }
        if (this.purple == 16) {
            P p4 = (P) this.alpha[15];
            this.purple = 15;
            foxtrot().put(p4.alpha, p4.purple);
        }
        Object[] objArr = this.alpha;
        int length = objArr.length;
        System.arraycopy(objArr, i4, objArr, i4 + 1, 15 - i4);
        this.alpha[i4] = new P(this, comparable, obj);
        this.purple++;
        return null;
    }

    public final P charlie(int i4) {
        if (i4 < this.purple) {
            return (P) this.alpha[i4];
        }
        throw new ArrayIndexOutOfBoundsException(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        golf();
        if (this.purple != 0) {
            this.alpha = null;
            this.purple = 0;
        }
        if (!this.red.isEmpty()) {
            this.red.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (delta(comparable) < 0 && !this.red.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    public final int delta(Comparable comparable) {
        int i4 = this.purple;
        int i5 = i4 - 1;
        int i10 = 0;
        if (i5 >= 0) {
            int compareTo = comparable.compareTo(((P) this.alpha[i5]).alpha);
            if (compareTo > 0) {
                return -(i4 + 1);
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        while (i10 <= i5) {
            int i11 = (i10 + i5) / 2;
            int compareTo2 = comparable.compareTo(((P) this.alpha[i11]).alpha);
            if (compareTo2 < 0) {
                i5 = i11 - 1;
            } else if (compareTo2 > 0) {
                i10 = i11 + 1;
            } else {
                return i11;
            }
        }
        return -(i10 + 1);
    }

    public final Object echo(int i4) {
        golf();
        Object[] objArr = this.alpha;
        Object obj = ((P) objArr[i4]).purple;
        System.arraycopy(objArr, i4 + 1, objArr, i4, (this.purple - i4) - 1);
        this.purple--;
        if (!this.red.isEmpty()) {
            Iterator it = foxtrot().entrySet().iterator();
            Object[] objArr2 = this.alpha;
            int i5 = this.purple;
            Map.Entry entry = (Map.Entry) it.next();
            objArr2[i5] = new P(this, (Comparable) entry.getKey(), entry.getValue());
            this.purple++;
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        if (this.teal == null) {
            this.teal = new Oe.ah(this, 3);
        }
        return this.teal;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof O)) {
                return super.equals(obj);
            }
            O o5 = (O) obj;
            int size = size();
            if (size == o5.size()) {
                int i4 = this.purple;
                if (i4 == o5.purple) {
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (charlie(i5).equals(o5.charlie(i5))) {
                        }
                    }
                    if (i4 != size) {
                        return this.red.equals(o5.red);
                    }
                    return true;
                }
                return entrySet().equals(o5.entrySet());
            }
            return false;
        }
        return true;
    }

    public final SortedMap foxtrot() {
        golf();
        if (this.red.isEmpty() && !(this.red instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.red = treeMap;
            this.white = treeMap.descendingMap();
        }
        return (SortedMap) this.red;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int delta = delta(comparable);
        if (delta >= 0) {
            return ((P) this.alpha[delta]).purple;
        }
        return this.red.get(comparable);
    }

    public final void golf() {
        if (!this.silver) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int i4 = this.purple;
        int i5 = 0;
        for (int i10 = 0; i10 < i4; i10++) {
            i5 += this.alpha[i10].hashCode();
        }
        if (this.red.size() > 0) {
            return this.red.hashCode() + i5;
        }
        return i5;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        golf();
        Comparable comparable = (Comparable) obj;
        int delta = delta(comparable);
        if (delta >= 0) {
            return echo(delta);
        }
        if (this.red.isEmpty()) {
            return null;
        }
        return this.red.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.red.size() + this.purple;
    }
}
