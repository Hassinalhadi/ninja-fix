package V1;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d {
    public final c alpha = new Object();
    public final LinkedHashMap bravo = new LinkedHashMap();
    public final LinkedHashSet charlie = new LinkedHashSet();
    public volatile boolean delta;

    public static void bravo(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                Q0.c.zulu(autoCloseable);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final void alpha(AutoCloseable closeable) {
        Intrinsics.echo(closeable, "closeable");
        if (this.delta) {
            bravo(closeable);
            return;
        }
        synchronized (this.alpha) {
            this.charlie.add(closeable);
        }
    }
}
