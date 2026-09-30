package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class w implements Iterator, Yd.a {
    public final /* synthetic */ int alpha = 0;
    public int purple;
    public final Object red;

    public w(Iterator iterator) {
        Intrinsics.echo(iterator, "iterator");
        this.red = iterator;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.alpha) {
            case 0:
                return ((Iterator) this.red).hasNext();
            default:
                if (this.purple < ((e) this.red).alpha()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.alpha) {
            case 0:
                int i4 = this.purple;
                this.purple = i4 + 1;
                if (i4 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                return new v(i4, ((Iterator) this.red).next());
            default:
                if (hasNext()) {
                    int i5 = this.purple;
                    this.purple = i5 + 1;
                    return ((e) this.red).get(i5);
                }
                throw new NoSuchElementException();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.alpha) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public w(e eVar) {
        this.red = eVar;
    }
}
