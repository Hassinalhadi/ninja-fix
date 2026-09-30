package p6;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import s6.AbstractC2681i7;

/* loaded from: classes2.dex */
public abstract class v extends s implements List, RandomAccess {
    public static final t purple = new t(w.teal, 0);

    /* JADX WARN: Multi-variable type inference failed */
    public static v lima(List list) {
        if (list instanceof s) {
            v vVar = (v) ((s) list);
            vVar.getClass();
            if (vVar.hotel()) {
                Object[] array = vVar.toArray(s.alpha);
                int length = array.length;
                if (length == 0) {
                    return w.teal;
                }
                return new w(length, array);
            }
            return vVar;
        }
        Object[] array2 = list.toArray();
        int length2 = array2.length;
        for (int i4 = 0; i4 < length2; i4++) {
            if (array2[i4] == null) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 9);
                sb2.append("at index ");
                sb2.append(i4);
                throw new NullPointerException(sb2.toString());
            }
        }
        if (length2 == 0) {
            return w.teal;
        }
        return new w(length2, array2);
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        Object next;
        Object next2;
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (list instanceof RandomAccess) {
                        for (int i4 = 0; i4 < size; i4++) {
                            Object obj2 = get(i4);
                            Object obj3 = list.get(i4);
                            if (obj2 == obj3 || (obj2 != null && obj2.equals(obj3))) {
                            }
                        }
                        return true;
                    }
                    t listIterator = listIterator(0);
                    Iterator it = list.iterator();
                    while (true) {
                        if (listIterator.hasNext()) {
                            if (!it.hasNext() || ((next = listIterator.next()) != (next2 = it.next()) && (next == null || !next.equals(next2)))) {
                                break;
                            }
                        } else if (!it.hasNext()) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i4 = 1;
        for (int i5 = 0; i5 < size; i5++) {
            i4 = (i4 * 31) + get(i5).hashCode();
        }
        return i4;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            if (obj.equals(get(i4))) {
                return i4;
            }
        }
        return -1;
    }

    @Override // p6.s
    public int india(Object[] objArr) {
        int size = size();
        for (int i4 = 0; i4 < size; i4++) {
            objArr[i4] = get(i4);
        }
        return size;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: kilo */
    public v subList(int i4, int i5) {
        AbstractC2681i7.charlie(i4, i5, size());
        int i10 = i5 - i4;
        if (i10 == size()) {
            return this;
        }
        if (i10 == 0) {
            return w.teal;
        }
        return new u(this, i4, i10);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    /* renamed from: mike, reason: merged with bridge method [inline-methods] */
    public final t listIterator(int i4) {
        int size = size();
        if (i4 >= 0 && i4 <= size) {
            if (isEmpty()) {
                return purple;
            }
            return new t(this, i4);
        }
        throw new IndexOutOfBoundsException(AbstractC2681i7.delta(i4, size, "index"));
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        throw new UnsupportedOperationException();
    }
}
