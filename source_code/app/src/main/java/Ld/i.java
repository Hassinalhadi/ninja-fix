package Ld;

import M.n;
import M.o;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i extends AbstractCollection implements Collection, Yd.b {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ i(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.alpha) {
            case 0:
                ((g) this.purple).clear();
                return;
            default:
                ((M.e) this.purple).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.alpha) {
            case 0:
                return ((g) this.purple).containsValue(obj);
            default:
                return ((M.e) this.purple).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.alpha) {
            case 0:
                return ((g) this.purple).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                g gVar = (g) this.purple;
                gVar.getClass();
                return new d(gVar, 2);
            default:
                n[] nVarArr = new n[8];
                for (int i4 = 0; i4 < 8; i4++) {
                    nVarArr[i4] = new o(2);
                }
                return new M.f((M.e) this.purple, nVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                g gVar = (g) this.purple;
                gVar.charlie();
                int india = gVar.india(obj);
                if (india < 0) {
                    return false;
                }
                gVar.lima(india);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                ((g) this.purple).charlie();
                return super.removeAll(elements);
            default:
                return super.removeAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection elements) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(elements, "elements");
                ((g) this.purple).charlie();
                return super.retainAll(elements);
            default:
                return super.retainAll(elements);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.alpha) {
            case 0:
                return ((g) this.purple).f1833b;
            default:
                return ((M.e) this.purple).size();
        }
    }
}
