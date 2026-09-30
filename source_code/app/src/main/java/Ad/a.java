package Ad;

import com.google.android.gms.measurement.internal.r;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes2.dex */
public final class a {

    @NotNull
    private volatile /* synthetic */ Object current = t.alpha;

    static {
        AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "current");
    }

    public final Object alpha(r key) {
        Intrinsics.echo(key, "key");
        return ((Map) this.current).get(key);
    }
}
