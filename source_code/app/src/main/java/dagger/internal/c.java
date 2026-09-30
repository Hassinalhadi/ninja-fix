package dagger.internal;

import com.google.common.collect.l;
import com.google.common.collect.m;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class c implements Map {
    public final m alpha;

    public c(m mVar) {
        this.alpha = mVar;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.alpha.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.alpha.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of entrySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (obj instanceof Class) {
            return this.alpha.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException("Key must be a class");
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        throw new UnsupportedOperationException("Maps created with @LazyClassKey do not support usage of keySet(). Consider @ClassKey instead.");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Dagger map bindings are immutable");
    }

    @Override // java.util.Map
    public final int size() {
        return this.alpha.white;
    }

    @Override // java.util.Map
    public final Collection values() {
        m mVar = this.alpha;
        l lVar = mVar.red;
        if (lVar == null) {
            l lVar2 = new l(1, mVar.teal, mVar.white);
            mVar.red = lVar2;
            return lVar2;
        }
        return lVar;
    }
}
