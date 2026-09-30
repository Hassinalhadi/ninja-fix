package s6;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: s6.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C2762s extends AbstractCollection {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ C2762s(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.alpha) {
            case 0:
                ((C2780u) ((AbstractC2771t) this.purple)).charlie();
                return;
            case 1:
                ((C2825z) this.purple).clear();
                return;
            default:
                ((C2709m) this.purple).clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        switch (this.alpha) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C2745q c2745q = ((C2709m) ((AbstractC2771t) this.purple).alpha()).get(key);
                    if (c2745q != null && c2745q.contains(value)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.contains(obj);
            case 2:
                return ((C2709m) this.purple).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.alpha) {
            case 2:
                return ((C2709m) this.purple).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.alpha) {
            case 0:
                C2780u c2780u = (C2780u) ((AbstractC2771t) this.purple);
                c2780u.getClass();
                return new C2682j(c2780u);
            case 1:
                C2825z c2825z = (C2825z) this.purple;
                Map delta = c2825z.delta();
                if (delta != null) {
                    return delta.values().iterator();
                }
                return new C2789v(c2825z, 2);
            default:
                return new Oe.aj(((C2709m) this.purple).entrySet().iterator());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.alpha) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    C2745q c2745q = ((C2709m) ((AbstractC2771t) this.purple).alpha()).get(key);
                    if (c2745q != null && c2745q.remove(value)) {
                        return true;
                    }
                }
                return false;
            case 1:
            default:
                return super.remove(obj);
            case 2:
                try {
                    return super.remove(obj);
                } catch (UnsupportedOperationException unused) {
                    C2709m c2709m = (C2709m) this.purple;
                    for (Map.Entry entry2 : c2709m.entrySet()) {
                        if (t6.ad.bravo(obj, entry2.getValue())) {
                            c2709m.remove(entry2.getKey());
                            return true;
                        }
                    }
                    return false;
                }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.alpha) {
            case 2:
                try {
                    if (collection != null) {
                        return super.removeAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C2709m c2709m = (C2709m) this.purple;
                    for (Map.Entry entry : c2709m.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c2709m.silver.bravo().removeAll(hashSet);
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.alpha) {
            case 2:
                try {
                    if (collection != null) {
                        return super.retainAll(collection);
                    }
                    throw null;
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet();
                    C2709m c2709m = (C2709m) this.purple;
                    for (Map.Entry entry : c2709m.entrySet()) {
                        if (collection.contains(entry.getValue())) {
                            hashSet.add(entry.getKey());
                        }
                    }
                    return c2709m.silver.bravo().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.alpha) {
            case 0:
                return ((C2780u) ((AbstractC2771t) this.purple)).teal;
            case 1:
                return ((C2825z) this.purple).size();
            default:
                return ((C2709m) this.purple).size();
        }
    }

    public C2762s(C2709m c2709m) {
        this.alpha = 2;
        this.purple = c2709m;
    }
}
