package zd;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {
    public final ConcurrentHashMap alpha = new ConcurrentHashMap();

    public final Object alpha(C3509a key, Function0 function0) {
        Intrinsics.echo(key, "key");
        ConcurrentHashMap concurrentHashMap = this.alpha;
        Object obj = concurrentHashMap.get(key);
        if (obj != null) {
            return obj;
        }
        Object invoke = function0.invoke();
        Object putIfAbsent = concurrentHashMap.putIfAbsent(key, invoke);
        if (putIfAbsent != null) {
            invoke = putIfAbsent;
        }
        Intrinsics.charlie(invoke, "null cannot be cast to non-null type T of io.ktor.util.ConcurrentSafeAttributes.computeIfAbsent");
        return invoke;
    }

    public final boolean bravo(C3509a key) {
        Intrinsics.echo(key, "key");
        return delta().containsKey(key);
    }

    public final Object charlie(C3509a key) {
        Intrinsics.echo(key, "key");
        Object echo = echo(key);
        if (echo != null) {
            return echo;
        }
        throw new IllegalStateException("No instance for key " + key);
    }

    public final Map delta() {
        return this.alpha;
    }

    public final Object echo(C3509a key) {
        Intrinsics.echo(key, "key");
        return delta().get(key);
    }

    public final void foxtrot(C3509a key, Object value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        delta().put(key, value);
    }
}
