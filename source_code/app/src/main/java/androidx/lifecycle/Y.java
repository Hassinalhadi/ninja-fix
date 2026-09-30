package androidx.lifecycle;

import java.io.Closeable;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public abstract class Y {

    @Nullable
    private final V1.d impl = new V1.d();

    public final void addCloseable(@NotNull String key, @NotNull AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        Intrinsics.echo(key, "key");
        Intrinsics.echo(closeable, "closeable");
        V1.d dVar = this.impl;
        if (dVar != null) {
            if (dVar.delta) {
                V1.d.bravo(closeable);
                return;
            }
            synchronized (dVar.alpha) {
                autoCloseable = (AutoCloseable) dVar.bravo.put(key, closeable);
            }
            V1.d.bravo(autoCloseable);
        }
    }

    public final void clear$lifecycle_viewmodel_release() {
        V1.d dVar = this.impl;
        if (dVar != null && !dVar.delta) {
            dVar.delta = true;
            synchronized (dVar.alpha) {
                try {
                    Iterator it = dVar.bravo.values().iterator();
                    while (it.hasNext()) {
                        V1.d.bravo((AutoCloseable) it.next());
                    }
                    Iterator it2 = dVar.charlie.iterator();
                    while (it2.hasNext()) {
                        V1.d.bravo((AutoCloseable) it2.next());
                    }
                    dVar.charlie.clear();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        onCleared();
    }

    @Nullable
    public final <T extends AutoCloseable> T getCloseable(@NotNull String key) {
        T t5;
        Intrinsics.echo(key, "key");
        V1.d dVar = this.impl;
        if (dVar != null) {
            synchronized (dVar.alpha) {
                t5 = (T) dVar.bravo.get(key);
            }
            return t5;
        }
        return null;
    }

    public void onCleared() {
    }

    public void addCloseable(@NotNull AutoCloseable closeable) {
        Intrinsics.echo(closeable, "closeable");
        V1.d dVar = this.impl;
        if (dVar != null) {
            dVar.alpha(closeable);
        }
    }

    @kotlin.c
    public /* synthetic */ void addCloseable(Closeable closeable) {
        Intrinsics.echo(closeable, "closeable");
        V1.d dVar = this.impl;
        if (dVar != null) {
            dVar.alpha(closeable);
        }
    }
}
