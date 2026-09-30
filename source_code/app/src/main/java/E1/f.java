package E1;

import Tf.u;
import Xd.l;
import java.util.LinkedHashSet;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class f {
    public static final LinkedHashSet echo = new LinkedHashSet();
    public static final g7.f foxtrot = new g7.f(2);
    public final u alpha;
    public final l bravo;
    public final F2.e charlie;
    public final Lazy delta;

    public f(u fileSystem, F2.e eVar) {
        Intrinsics.echo(fileSystem, "fileSystem");
        d coordinatorProducer = d.alpha;
        Intrinsics.echo(coordinatorProducer, "coordinatorProducer");
        this.alpha = fileSystem;
        this.bravo = coordinatorProducer;
        this.charlie = eVar;
        this.delta = LazyKt.lazy(new e(this, 0));
    }
}
