package Nd;

import Xd.l;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i implements h, Serializable {
    public static final i alpha = new Object();

    @Override // Nd.h
    public final Object fold(Object obj, l lVar) {
        return obj;
    }

    @Override // Nd.h
    public final f get(g key) {
        Intrinsics.echo(key, "key");
        return null;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // Nd.h
    public final h minusKey(g key) {
        Intrinsics.echo(key, "key");
        return this;
    }

    @Override // Nd.h
    public final h plus(h context) {
        Intrinsics.echo(context, "context");
        return context;
    }

    public final String toString() {
        return "EmptyCoroutineContext";
    }
}
