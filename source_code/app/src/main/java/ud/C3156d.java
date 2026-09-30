package ud;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ud.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3156d implements Id.d, AutoCloseable {
    @Override // java.lang.AutoCloseable
    public final void close() {
    }

    @Override // Id.d
    public final void s(Object instance) {
        Intrinsics.echo(instance, "instance");
    }

    @Override // Id.d
    public final Object yankee() {
        return new char[2048];
    }
}
