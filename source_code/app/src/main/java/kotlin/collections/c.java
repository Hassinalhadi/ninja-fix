package kotlin.collections;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class c extends w implements ListIterator {
    public final /* synthetic */ e silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, int i4) {
        super(eVar);
        this.silver = eVar;
        int alpha = eVar.alpha();
        if (i4 >= 0 && i4 <= alpha) {
            this.purple = i4;
            return;
        }
        throw new IndexOutOfBoundsException(A0.z.juliet("index: ", i4, alpha, ", size: "));
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        if (this.purple > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.purple;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i4 = this.purple - 1;
            this.purple = i4;
            return this.silver.get(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.purple - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
