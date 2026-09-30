package bv;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class d implements Collection {
    public final /* synthetic */ e alpha;

    public d(e eVar) {
        this.alpha = eVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.alpha.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        if (this.alpha.alpha(obj) >= 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new C0762a(this.alpha, 1);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        e eVar = this.alpha;
        int alpha = eVar.alpha(obj);
        if (alpha >= 0) {
            eVar.hotel(alpha);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        e eVar = this.alpha;
        int i4 = eVar.red;
        int i5 = 0;
        boolean z2 = false;
        while (i5 < i4) {
            if (collection.contains(eVar.juliet(i5))) {
                eVar.hotel(i5);
                i5--;
                i4--;
                z2 = true;
            }
            i5++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        e eVar = this.alpha;
        int i4 = eVar.red;
        int i5 = 0;
        boolean z2 = false;
        while (i5 < i4) {
            if (!collection.contains(eVar.juliet(i5))) {
                eVar.hotel(i5);
                i5--;
                i4--;
                z2 = true;
            }
            i5++;
        }
        return z2;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.alpha.red;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        e eVar = this.alpha;
        int i4 = eVar.red;
        Object[] objArr = new Object[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.juliet(i5);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        e eVar = this.alpha;
        int i4 = eVar.red;
        if (objArr.length < i4) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i4);
        }
        for (int i5 = 0; i5 < i4; i5++) {
            objArr[i5] = eVar.juliet(i5);
        }
        if (objArr.length > i4) {
            objArr[i4] = null;
        }
        return objArr;
    }
}
