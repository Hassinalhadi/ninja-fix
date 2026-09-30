package S;

import java.util.List;
import java.util.ListIterator;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public final class ah implements ListIterator, Yd.a {
    public final /* synthetic */ int alpha = 2;
    public final Object purple;
    public final /* synthetic */ Object red;

    public ah(kotlin.collections.aa aaVar, int i4) {
        this.red = aaVar;
        this.purple = ((List) aaVar.purple).listIterator(kotlin.collections.q.uniform(i4, aaVar));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ListIterator listIterator = (ListIterator) this.purple;
                listIterator.add(obj);
                listIterator.previous();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                if (((kotlin.jvm.internal.s) this.purple).alpha < ((ai) this.red).silver - 1) {
                    return true;
                }
                return false;
            case 1:
                return ((ListIterator) this.purple).hasPrevious();
            default:
                return ((ListIterator) this.purple).hasPrevious();
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.alpha) {
            case 0:
                if (((kotlin.jvm.internal.s) this.purple).alpha >= 0) {
                    return true;
                }
                return false;
            case 1:
                return ((ListIterator) this.purple).hasNext();
            default:
                return ((ListIterator) this.purple).hasNext();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.purple;
                int i4 = sVar.alpha + 1;
                ai aiVar = (ai) this.red;
                r.alpha(i4, aiVar.silver);
                sVar.alpha = i4;
                return aiVar.get(i4);
            case 1:
                return ((ListIterator) this.purple).previous();
            default:
                return ((ListIterator) this.purple).previous();
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.alpha) {
            case 0:
                return ((kotlin.jvm.internal.s) this.purple).alpha + 1;
            case 1:
                return CollectionsKt.ivory((kotlin.collections.z) this.red) - ((ListIterator) this.purple).previousIndex();
            default:
                return CollectionsKt.ivory((kotlin.collections.aa) this.red) - ((ListIterator) this.purple).previousIndex();
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.alpha) {
            case 0:
                kotlin.jvm.internal.s sVar = (kotlin.jvm.internal.s) this.purple;
                int i4 = sVar.alpha;
                ai aiVar = (ai) this.red;
                r.alpha(i4, aiVar.silver);
                sVar.alpha = i4 - 1;
                return aiVar.get(i4);
            case 1:
                return ((ListIterator) this.purple).next();
            default:
                return ((ListIterator) this.purple).next();
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.alpha) {
            case 0:
                return ((kotlin.jvm.internal.s) this.purple).alpha;
            case 1:
                return CollectionsKt.ivory((kotlin.collections.z) this.red) - ((ListIterator) this.purple).nextIndex();
            default:
                return CollectionsKt.ivory((kotlin.collections.aa) this.red) - ((ListIterator) this.purple).nextIndex();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.purple).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.alpha) {
            case 0:
                throw new IllegalStateException("Cannot modify a state list through an iterator");
            case 1:
                ((ListIterator) this.purple).set(obj);
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ah(kotlin.collections.z zVar, int i4) {
        this.red = zVar;
        this.purple = zVar.alpha.listIterator(kotlin.collections.q.uniform(i4, zVar));
    }

    public ah(kotlin.jvm.internal.s sVar, ai aiVar) {
        this.purple = sVar;
        this.red = aiVar;
    }
}
