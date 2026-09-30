package zd;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import y.ar;

/* loaded from: classes2.dex */
public final class g implements Map, Yd.e {
    public final LinkedHashMap alpha = new LinkedHashMap();

    @Override // java.util.Map
    public final void clear() {
        this.alpha.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.echo(key, "key");
        return this.alpha.containsKey(new h(key));
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.alpha.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new j(this.alpha.entrySet(), new ar(8), new ar(9));
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof g)) {
            return Intrinsics.areEqual(((g) obj).alpha, this.alpha);
        }
        return false;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.echo(key, "key");
        return this.alpha.get(x6.l.alpha(key));
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.alpha.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.alpha.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new j(this.alpha.keySet(), new ar(10), new ar(11));
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object value) {
        String key = (String) obj;
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        return this.alpha.put(x6.l.alpha(key), value);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.echo(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            String key = (String) entry.getKey();
            Object value = entry.getValue();
            Intrinsics.echo(key, "key");
            Intrinsics.echo(value, "value");
            this.alpha.put(x6.l.alpha(key), value);
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.echo(key, "key");
        return this.alpha.remove(x6.l.alpha(key));
    }

    @Override // java.util.Map
    public final int size() {
        return this.alpha.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.alpha.values();
    }
}
