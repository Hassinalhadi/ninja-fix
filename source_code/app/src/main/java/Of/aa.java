package Of;

import Lb.am;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Jf.e(with = ac.class)
/* loaded from: classes2.dex */
public final class aa extends n implements Map<String, n>, Yd.a {

    @NotNull
    public static final z Companion = new Object();
    public final Map alpha;

    public aa(Map content) {
        Intrinsics.echo(content, "content");
        this.alpha = content;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n compute(String str, BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n computeIfAbsent(String str, Function<? super String, ? extends n> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n computeIfPresent(String str, BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        String key = (String) obj;
        Intrinsics.echo(key, "key");
        return this.alpha.containsKey(key);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n value = (n) obj;
        Intrinsics.echo(value, "value");
        return this.alpha.containsValue(value);
    }

    @Override // java.util.Map
    public final Set<Map.Entry<String, n>> entrySet() {
        return this.alpha.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return Intrinsics.areEqual(this.alpha, obj);
    }

    @Override // java.util.Map
    public final n get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String key = (String) obj;
        Intrinsics.echo(key, "key");
        return (n) this.alpha.get(key);
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
    public final Set<String> keySet() {
        return this.alpha.keySet();
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n merge(String str, n nVar, BiFunction<? super n, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n put(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map<? extends String, ? extends n> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n putIfAbsent(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final n remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ n replace(String str, n nVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction<? super String, ? super n, ? extends n> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.alpha.size();
    }

    public final String toString() {
        return CollectionsKt.maroon(this.alpha.entrySet(), Constants.SEPARATOR_COMMA, "{", "}", new am(13), 24);
    }

    @Override // java.util.Map
    public final Collection<n> values() {
        return this.alpha.values();
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ boolean replace(String str, n nVar, n nVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
