package s6;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: s6.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2682j implements Iterator {
    public final Iterator alpha;
    public Object purple = null;
    public Collection red = null;
    public Iterator silver = ah.alpha;
    public final /* synthetic */ C2780u teal;

    public C2682j(C2780u c2780u) {
        this.teal = c2780u;
        this.alpha = c2780u.silver.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!this.alpha.hasNext() && !this.silver.hasNext()) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.silver.hasNext()) {
            Map.Entry entry = (Map.Entry) this.alpha.next();
            this.purple = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.red = collection;
            this.silver = collection.iterator();
        }
        return new ab(this.purple, this.silver.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.silver.remove();
        Collection collection = this.red;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.alpha.remove();
        }
        C2780u c2780u = this.teal;
        c2780u.teal--;
    }
}
