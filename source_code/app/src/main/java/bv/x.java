package bv;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class x implements Map, Yd.a {
    public final al alpha;
    public h purple;
    public h red;
    public A silver;

    public x(al parent) {
        Intrinsics.echo(parent, "parent");
        this.alpha = parent;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.alpha.charlie(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.alpha.delta(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        h hVar = this.purple;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.alpha, 0);
        this.purple = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && x.class == obj.getClass()) {
            return Intrinsics.areEqual(this.alpha, ((x) obj).alpha);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.alpha.golf(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.alpha.india();
    }

    @Override // java.util.Map
    public final Set keySet() {
        h hVar = this.red;
        if (hVar != null) {
            return hVar;
        }
        h hVar2 = new h(this.alpha, 1);
        this.red = hVar2;
        return hVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.alpha.echo;
    }

    public final String toString() {
        return this.alpha.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        A a6 = this.silver;
        if (a6 != null) {
            return a6;
        }
        A a8 = new A(this.alpha);
        this.silver = a8;
        return a8;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
