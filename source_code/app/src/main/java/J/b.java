package J;

import bv.ah;
import bv.as;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;

/* loaded from: classes3.dex */
public final class b implements List, Yd.c {
    public final /* synthetic */ int alpha = 0;
    public final Object purple;

    public b(e eVar) {
        this.purple = eVar;
    }

    @Override // java.util.List
    public final void add(int i4, Object obj) {
        int i5;
        switch (this.alpha) {
            case 0:
                ((e) this.purple).alpha(i4, obj);
                return;
            default:
                ah ahVar = (ah) this.purple;
                if (i4 >= 0 && i4 <= (i5 = ahVar.bravo)) {
                    int i10 = i5 + 1;
                    Object[] objArr = ahVar.alpha;
                    if (objArr.length < i10) {
                        ahVar.mike(i10, objArr);
                    }
                    Object[] objArr2 = ahVar.alpha;
                    int i11 = ahVar.bravo;
                    if (i4 != i11) {
                        ArraysKt.yankee(i4 + 1, i4, i11, objArr2, objArr2);
                    }
                    objArr2[i4] = obj;
                    ahVar.bravo++;
                    return;
                }
                ahVar.getClass();
                bw.a.delta("Index " + i4 + " must be in 0.." + ahVar.bravo);
                throw null;
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i4, Collection elements) {
        switch (this.alpha) {
            case 0:
                return ((e) this.purple).echo(i4, elements);
            default:
                Intrinsics.echo(elements, "elements");
                ah ahVar = (ah) this.purple;
                ahVar.getClass();
                if (i4 >= 0 && i4 <= ahVar.bravo) {
                    int i5 = 0;
                    if (elements.isEmpty()) {
                        return false;
                    }
                    int size = elements.size() + ahVar.bravo;
                    Object[] objArr = ahVar.alpha;
                    if (objArr.length < size) {
                        ahVar.mike(size, objArr);
                    }
                    Object[] objArr2 = ahVar.alpha;
                    if (i4 != ahVar.bravo) {
                        ArraysKt.yankee(elements.size() + i4, i4, ahVar.bravo, objArr2, objArr2);
                    }
                    for (Object obj : elements) {
                        int i10 = i5 + 1;
                        if (i5 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        objArr2[i5 + i4] = obj;
                        i5 = i10;
                    }
                    ahVar.bravo = elements.size() + ahVar.bravo;
                    return true;
                }
                StringBuilder sierra = Q0.c.sierra(i4, "Index ", " must be in 0..");
                sierra.append(ahVar.bravo);
                bw.a.delta(sierra.toString());
                throw null;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.alpha) {
            case 0:
                ((e) this.purple).india();
                return;
            default:
                ((ah) this.purple).india();
                return;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.alpha) {
            case 0:
                return ((e) this.purple).juliet(obj);
            default:
                if (((ah) this.purple).charlie(obj) >= 0) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                e eVar = (e) this.purple;
                eVar.getClass();
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!eVar.juliet(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Intrinsics.echo(elements, "elements");
                ah ahVar = (ah) this.purple;
                ahVar.getClass();
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (ahVar.charlie(it2.next()) < 0) {
                        return false;
                    }
                }
                return true;
        }
    }

    @Override // java.util.List
    public final Object get(int i4) {
        switch (this.alpha) {
            case 0:
                f.alpha(i4, this);
                return ((e) this.purple).alpha[i4];
            default:
                as.alpha(i4, this);
                return ((ah) this.purple).bravo(i4);
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.alpha) {
            case 0:
                return ((e) this.purple).kilo(obj);
            default:
                return ((ah) this.purple).charlie(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.alpha) {
            case 0:
                if (((e) this.purple).red == 0) {
                    return true;
                }
                return false;
            default:
                return ((ah) this.purple).delta();
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i4;
        switch (this.alpha) {
            case 0:
                e eVar = (e) this.purple;
                Object[] objArr = eVar.alpha;
                for (int i5 = eVar.red - 1; i5 >= 0; i5--) {
                    if (Intrinsics.areEqual(obj, objArr[i5])) {
                        return i5;
                    }
                }
                return -1;
            default:
                ah ahVar = (ah) this.purple;
                if (obj == null) {
                    Object[] objArr2 = ahVar.alpha;
                    i4 = ahVar.bravo - 1;
                    while (-1 < i4) {
                        if (objArr2[i4] != null) {
                            i4--;
                        }
                    }
                    return -1;
                }
                Object[] objArr3 = ahVar.alpha;
                i4 = ahVar.bravo - 1;
                while (-1 < i4) {
                    if (!obj.equals(objArr3[i4])) {
                        i4--;
                    }
                }
                return -1;
                return i4;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.alpha) {
            case 0:
                return new d(0, 0, this);
            default:
                return new d(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                return ((e) this.purple).lima(obj);
            default:
                return ((ah) this.purple).juliet(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                e eVar = (e) this.purple;
                eVar.getClass();
                if (!elements.isEmpty()) {
                    int i4 = eVar.red;
                    Iterator it = elements.iterator();
                    while (it.hasNext()) {
                        eVar.lima(it.next());
                    }
                    if (i4 != eVar.red) {
                        return true;
                    }
                }
                return false;
            default:
                Intrinsics.echo(elements, "elements");
                ah ahVar = (ah) this.purple;
                ahVar.getClass();
                int i5 = ahVar.bravo;
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    ahVar.juliet(it2.next());
                }
                if (i5 != ahVar.bravo) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                e eVar = (e) this.purple;
                int i4 = eVar.red;
                for (int i5 = i4 - 1; -1 < i5; i5--) {
                    if (!elements.contains(eVar.alpha[i5])) {
                        eVar.mike(i5);
                    }
                }
                if (i4 != eVar.red) {
                    return true;
                }
                return false;
            default:
                Intrinsics.echo(elements, "elements");
                ah ahVar = (ah) this.purple;
                ahVar.getClass();
                int i10 = ahVar.bravo;
                Object[] objArr = ahVar.alpha;
                for (int i11 = i10 - 1; -1 < i11; i11--) {
                    if (!elements.contains(objArr[i11])) {
                        ahVar.kilo(i11);
                    }
                }
                if (i10 != ahVar.bravo) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        switch (this.alpha) {
            case 0:
                f.alpha(i4, this);
                Object[] objArr = ((e) this.purple).alpha;
                Object obj2 = objArr[i4];
                objArr[i4] = obj;
                return obj2;
            default:
                as.alpha(i4, this);
                ah ahVar = (ah) this.purple;
                if (i4 >= 0 && i4 < ahVar.bravo) {
                    Object[] objArr2 = ahVar.alpha;
                    Object obj3 = objArr2[i4];
                    objArr2[i4] = obj;
                    return obj3;
                }
                ahVar.foxtrot(i4);
                throw null;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.alpha) {
            case 0:
                return ((e) this.purple).red;
            default:
                return ((ah) this.purple).bravo;
        }
    }

    @Override // java.util.List
    public final List subList(int i4, int i5) {
        switch (this.alpha) {
            case 0:
                f.bravo(i4, i5, this);
                return new c(this, i4, i5, 0);
            default:
                as.bravo(i4, i5, this);
                return new c(this, i4, i5, 1);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.alpha) {
            case 0:
                return j.charlie(this);
            default:
                return j.charlie(this);
        }
    }

    public b(ah objectList) {
        Intrinsics.echo(objectList, "objectList");
        this.purple = objectList;
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i4) {
        switch (this.alpha) {
            case 0:
                return new d(i4, 0, this);
            default:
                return new d(i4, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i4) {
        switch (this.alpha) {
            case 0:
                f.alpha(i4, this);
                return ((e) this.purple).mike(i4);
            default:
                as.alpha(i4, this);
                return ((ah) this.purple).kilo(i4);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] array) {
        switch (this.alpha) {
            case 0:
                return j.delta(this, array);
            default:
                Intrinsics.echo(array, "array");
                return j.delta(this, array);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.alpha) {
            case 0:
                ((e) this.purple).bravo(obj);
                return true;
            default:
                ((ah) this.purple).golf(obj);
                return true;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                e eVar = (e) this.purple;
                return eVar.echo(eVar.red, elements);
            default:
                Intrinsics.echo(elements, "elements");
                ah ahVar = (ah) this.purple;
                ahVar.getClass();
                int i4 = ahVar.bravo;
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    ahVar.golf(it.next());
                }
                return i4 != ahVar.bravo;
        }
    }
}
