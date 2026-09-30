package ue;

import kotlin.jvm.internal.Intrinsics;
import pe.an;
import ve.u;

/* loaded from: classes2.dex */
public final class f implements an {
    public final u alpha;

    public f(u javaElement) {
        Intrinsics.echo(javaElement, "javaElement");
        this.alpha = javaElement;
    }

    public final String toString() {
        return f.class.getName() + ": " + this.alpha;
    }
}
