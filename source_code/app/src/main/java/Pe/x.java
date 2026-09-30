package Pe;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class x {
    public Object alpha;
    public final /* synthetic */ z bravo;

    public x(Object obj, z zVar) {
        this.bravo = zVar;
        this.alpha = obj;
    }

    public final Object alpha(ge.v property, Object obj) {
        Intrinsics.echo(property, "property");
        return this.alpha;
    }

    public final void bravo(ge.v property, Object obj) {
        Intrinsics.echo(property, "property");
        if (!this.bravo.alpha) {
            this.alpha = obj;
            return;
        }
        throw new IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
    }

    public final String toString() {
        return "ObservableProperty(value=" + this.alpha + ')';
    }
}
