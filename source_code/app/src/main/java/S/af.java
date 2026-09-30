package S;

import androidx.compose.runtime.snapshots.SnapshotStateSet;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* loaded from: classes3.dex */
public final class af implements Iterator, Yd.a {
    public final SnapshotStateSet alpha;
    public final Iterator purple;
    public Object red;
    public Object silver;
    public int teal;

    public af(SnapshotStateSet snapshotStateSet, Iterator it) {
        Object obj;
        this.alpha = snapshotStateSet;
        this.purple = it;
        this.teal = y.bravo(snapshotStateSet);
        this.red = this.silver;
        if (it.hasNext()) {
            obj = it.next();
        } else {
            obj = null;
        }
        this.silver = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.silver != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj;
        if (y.bravo(this.alpha) == this.teal) {
            this.red = this.silver;
            Iterator it = this.purple;
            if (it.hasNext()) {
                obj = it.next();
            } else {
                obj = null;
            }
            this.silver = obj;
            Object obj2 = this.red;
            if (obj2 != null) {
                return obj2;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        SnapshotStateSet snapshotStateSet = this.alpha;
        if (y.bravo(snapshotStateSet) == this.teal) {
            Object obj = this.red;
            if (obj != null) {
                snapshotStateSet.remove(obj);
                this.red = null;
                this.teal = y.bravo(snapshotStateSet);
                return;
            }
            throw new IllegalStateException();
        }
        throw new ConcurrentModificationException();
    }
}
