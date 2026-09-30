package id;

import h5.C1809a;
import java.io.Closeable;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zd.C3509a;

/* renamed from: id.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1916d implements Closeable, AutoCloseable {
    public final C3509a alpha;
    public final Object purple;
    public final Function1 red;
    public Function0 silver;

    public C1916d(C3509a key, Object config, Function1 function1) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(config, "config");
        this.alpha = key;
        this.purple = config;
        this.red = function1;
        this.silver = new C1809a(6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.silver.invoke();
    }
}
