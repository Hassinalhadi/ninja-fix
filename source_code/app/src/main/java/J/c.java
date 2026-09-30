package J;

import bv.as;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.j;

/* loaded from: classes3.dex */
public final class c implements List, Yd.c {
    public final /* synthetic */ int alpha;
    public final Object purple;
    public final int red;
    public int silver;

    public /* synthetic */ c(List list, int i4, int i5, int i10) {
        this.alpha = i10;
        this.purple = list;
        this.red = i4;
        this.silver = i5;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.alpha) {
            case 0:
                int i4 = this.silver;
                this.silver = i4 + 1;
                this.purple.add(i4, obj);
                return true;
            default:
                int i5 = this.silver;
                this.silver = i5 + 1;
                this.purple.add(i5, obj);
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final boolean addAll(int i4, Collection elements) {
        switch (this.alpha) {
            case 0:
                this.purple.addAll(i4 + this.red, elements);
                int size = elements.size();
                this.silver += size;
                return size > 0;
            default:
                Intrinsics.echo(elements, "elements");
                this.purple.addAll(i4 + this.red, elements);
                this.silver = elements.size() + this.silver;
                return elements.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.alpha) {
            case 0:
                int i4 = this.silver - 1;
                int i5 = this.red;
                if (i5 <= i4) {
                    while (true) {
                        this.purple.remove(i4);
                        if (i4 != i5) {
                            i4--;
                        }
                    }
                }
                this.silver = i5;
                return;
            default:
                int i10 = this.silver - 1;
                int i11 = this.red;
                if (i11 <= i10) {
                    while (true) {
                        this.purple.remove(i10);
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                }
                this.silver = i11;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.alpha) {
            case 0:
                int i4 = this.silver;
                for (int i5 = this.red; i5 < i4; i5++) {
                    if (Intrinsics.areEqual(this.purple.get(i5), obj)) {
                        return true;
                    }
                }
                return false;
            default:
                int i10 = this.silver;
                for (int i11 = this.red; i11 < i10; i11++) {
                    if (Intrinsics.areEqual(this.purple.get(i11), obj)) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    if (!contains(it.next())) {
                        return false;
                    }
                }
                return true;
            default:
                Intrinsics.echo(elements, "elements");
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    if (!contains(it2.next())) {
                        return false;
                    }
                }
                return true;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object get(int i4) {
        switch (this.alpha) {
            case 0:
                f.alpha(i4, this);
                return this.purple.get(i4 + this.red);
            default:
                as.alpha(i4, this);
                return this.purple.get(i4 + this.red);
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.alpha) {
            case 0:
                int i4 = this.silver;
                int i5 = this.red;
                for (int i10 = i5; i10 < i4; i10++) {
                    if (Intrinsics.areEqual(this.purple.get(i10), obj)) {
                        return i10 - i5;
                    }
                }
                return -1;
            default:
                int i11 = this.silver;
                int i12 = this.red;
                for (int i13 = i12; i13 < i11; i13++) {
                    if (Intrinsics.areEqual(this.purple.get(i13), obj)) {
                        return i13 - i12;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.alpha) {
            case 0:
                if (this.silver == this.red) {
                    return true;
                }
                return false;
            default:
                if (this.silver == this.red) {
                    return true;
                }
                return false;
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

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        switch (this.alpha) {
            case 0:
                int i4 = this.silver - 1;
                int i5 = this.red;
                if (i5 <= i4) {
                    while (!Intrinsics.areEqual(this.purple.get(i4), obj)) {
                        if (i4 != i5) {
                            i4--;
                        }
                    }
                    return i4 - i5;
                }
                return -1;
            default:
                int i10 = this.silver - 1;
                int i11 = this.red;
                if (i11 <= i10) {
                    while (!Intrinsics.areEqual(this.purple.get(i10), obj)) {
                        if (i10 != i11) {
                            i10--;
                        }
                    }
                    return i10 - i11;
                }
                return -1;
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

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                int i4 = this.silver;
                for (int i5 = this.red; i5 < i4; i5++) {
                    ?? r22 = this.purple;
                    if (Intrinsics.areEqual(r22.get(i5), obj)) {
                        r22.remove(i5);
                        this.silver--;
                        return true;
                    }
                }
                return false;
            default:
                int i10 = this.silver;
                for (int i11 = this.red; i11 < i10; i11++) {
                    ?? r23 = this.purple;
                    if (Intrinsics.areEqual(r23.get(i11), obj)) {
                        r23.remove(i11);
                        this.silver--;
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                int i4 = this.silver;
                Iterator it = elements.iterator();
                while (it.hasNext()) {
                    remove(it.next());
                }
                if (i4 != this.silver) {
                    return true;
                }
                return false;
            default:
                Intrinsics.echo(elements, "elements");
                int i5 = this.silver;
                Iterator it2 = elements.iterator();
                while (it2.hasNext()) {
                    remove(it2.next());
                }
                if (i5 != this.silver) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                int i4 = this.silver;
                int i5 = i4 - 1;
                int i10 = this.red;
                if (i10 <= i5) {
                    while (true) {
                        ?? r32 = this.purple;
                        if (!elements.contains(r32.get(i5))) {
                            r32.remove(i5);
                            this.silver--;
                        }
                        if (i5 != i10) {
                            i5--;
                        }
                    }
                }
                if (i4 != this.silver) {
                    return true;
                }
                return false;
            default:
                Intrinsics.echo(elements, "elements");
                int i11 = this.silver;
                int i12 = i11 - 1;
                int i13 = this.red;
                if (i13 <= i12) {
                    while (true) {
                        ?? r33 = this.purple;
                        if (!elements.contains(r33.get(i12))) {
                            r33.remove(i12);
                            this.silver--;
                        }
                        if (i12 != i13) {
                            i12--;
                        }
                    }
                }
                if (i11 != this.silver) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object set(int i4, Object obj) {
        switch (this.alpha) {
            case 0:
                f.alpha(i4, this);
                return this.purple.set(i4 + this.red, obj);
            default:
                as.alpha(i4, this);
                return this.purple.set(i4 + this.red, obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.alpha) {
            case 0:
                return this.silver - this.red;
            default:
                return this.silver - this.red;
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

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final void add(int i4, Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.add(i4 + this.red, obj);
                this.silver++;
                return;
            default:
                this.purple.add(i4 + this.red, obj);
                this.silver++;
                return;
        }
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

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                this.purple.addAll(this.silver, elements);
                int size = elements.size();
                this.silver += size;
                return size > 0;
            default:
                Intrinsics.echo(elements, "elements");
                this.purple.addAll(this.silver, elements);
                this.silver = elements.size() + this.silver;
                return elements.size() > 0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.lang.Object] */
    @Override // java.util.List
    public final Object remove(int i4) {
        switch (this.alpha) {
            case 0:
                f.alpha(i4, this);
                this.silver--;
                return this.purple.remove(i4 + this.red);
            default:
                as.alpha(i4, this);
                this.silver--;
                return this.purple.remove(i4 + this.red);
        }
    }
}
