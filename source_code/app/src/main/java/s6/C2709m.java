package s6;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;

/* renamed from: s6.m, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2709m extends AbstractMap {
    public transient C2691k alpha;
    public transient C2762s purple;
    public final transient C2825z red;
    public final /* synthetic */ C2780u silver;

    public C2709m(C2780u c2780u, C2825z c2825z) {
        this.silver = c2780u;
        this.red = c2825z;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: alpha, reason: merged with bridge method [inline-methods] */
    public final C2745q get(Object obj) {
        Object obj2;
        C2825z c2825z = this.red;
        c2825z.getClass();
        try {
            obj2 = c2825z.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            obj2 = null;
        }
        Collection collection = (Collection) obj2;
        if (collection == null) {
            return null;
        }
        C2780u c2780u = this.silver;
        List list = (List) collection;
        if (list instanceof RandomAccess) {
            return new C2745q(c2780u, obj, list, null);
        }
        return new C2745q(c2780u, obj, list, null);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        C2780u c2780u = this.silver;
        if (this.red == c2780u.silver) {
            c2780u.charlie();
            return;
        }
        C2700l c2700l = new C2700l(this);
        while (c2700l.hasNext()) {
            c2700l.next();
            c2700l.remove();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        C2825z c2825z = this.red;
        c2825z.getClass();
        try {
            return c2825z.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        C2691k c2691k = this.alpha;
        if (c2691k == null) {
            C2691k c2691k2 = new C2691k(this);
            this.alpha = c2691k2;
            return c2691k2;
        }
        return c2691k;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this != obj && !this.red.equals(obj)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return this.red.hashCode();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.silver.bravo();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ /* synthetic */ Object remove(Object obj) {
        Collection collection = (Collection) this.red.remove(obj);
        if (collection == null) {
            return null;
        }
        C2780u c2780u = this.silver;
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(collection);
        c2780u.teal -= collection.size();
        collection.clear();
        return arrayList;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.red.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        return this.red.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        C2762s c2762s = this.purple;
        if (c2762s == null) {
            C2762s c2762s2 = new C2762s(this);
            this.purple = c2762s2;
            return c2762s2;
        }
        return c2762s;
    }
}
