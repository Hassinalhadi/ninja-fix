package kotlin.reflect.jvm.internal.impl.types;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {
    public final Collection alpha;
    public List bravo;

    public f(Collection allSupertypes) {
        Intrinsics.echo(allSupertypes, "allSupertypes");
        this.alpha = allSupertypes;
        this.bravo = kotlin.collections.ab.juliet(hf.i.delta);
    }
}
