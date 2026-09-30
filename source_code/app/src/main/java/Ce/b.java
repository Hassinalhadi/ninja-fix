package Ce;

import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class b implements c {
    public static final b alpha = new Object();

    @Override // Ce.c
    public final Set alpha() {
        return kotlin.collections.u.alpha;
    }

    @Override // Ce.c
    public final List bravo(Ne.f name) {
        Intrinsics.echo(name, "name");
        return CollectionsKt.emptyList();
    }

    @Override // Ce.c
    public final ve.ac charlie(Ne.f name) {
        Intrinsics.echo(name, "name");
        return null;
    }

    @Override // Ce.c
    public final Set delta() {
        return kotlin.collections.u.alpha;
    }

    @Override // Ce.c
    public final Set echo() {
        return kotlin.collections.u.alpha;
    }

    @Override // Ce.c
    public final ve.w foxtrot(Ne.f name) {
        Intrinsics.echo(name, "name");
        return null;
    }
}
