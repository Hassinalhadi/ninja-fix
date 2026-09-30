package s6;

import com.airbnb.lottie.compose.LottieConstants;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* renamed from: s6.k, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2691k extends ap {
    public final /* synthetic */ C2709m alpha;

    public C2691k(C2709m c2709m) {
        this.alpha = c2709m;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.alpha.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        try {
            return this.alpha.red.entrySet().contains(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C2700l(this.alpha);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        Object obj2;
        if (!contains(obj)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Objects.requireNonNull(entry);
        Object key = entry.getKey();
        C2780u c2780u = this.alpha.silver;
        try {
            obj2 = c2780u.silver.remove(key);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            c2780u.teal -= size;
            return true;
        }
        return true;
    }

    @Override // s6.ap, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        try {
            if (collection != null) {
                return t6.W1.charlie(this, collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            Iterator it = collection.iterator();
            boolean z2 = false;
            while (it.hasNext()) {
                z2 |= remove(it.next());
            }
            return z2;
        }
    }

    @Override // s6.ap, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i4;
        try {
            if (collection != null) {
                return super.retainAll(collection);
            }
            throw null;
        } catch (UnsupportedOperationException unused) {
            int size = collection.size();
            if (size < 3) {
                if (size >= 0) {
                    i4 = size + 1;
                } else {
                    throw new IllegalArgumentException(ao.ad.zulu(size, "expectedSize cannot be negative but was: "));
                }
            } else if (size < 1073741824) {
                i4 = (int) Math.ceil(size / 0.75d);
            } else {
                i4 = LottieConstants.IterateForever;
            }
            HashSet hashSet = new HashSet(i4);
            for (Object obj : collection) {
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    hashSet.add(((Map.Entry) obj).getKey());
                }
            }
            return ((ap) this.alpha.silver.bravo()).retainAll(hashSet);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.alpha.red.size();
    }
}
