package Pf;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class x extends v {
    public final Of.aa juliet;
    public final List kilo;
    public final int lima;
    public int mike;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(Of.d json, Of.aa value) {
        super(json, value, (String) null, 12);
        Intrinsics.echo(json, "json");
        Intrinsics.echo(value, "value");
        this.juliet = value;
        List z2 = CollectionsKt.z(value.alpha.keySet());
        this.kilo = z2;
        this.lima = z2.size() * 2;
        this.mike = -1;
    }

    @Override // Pf.v, Pf.b, Mf.a
    public final void alpha(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
    }

    @Override // Pf.v, Pf.b
    public final Of.n blue(String tag) {
        Intrinsics.echo(tag, "tag");
        if (this.mike % 2 == 0) {
            Nf.af afVar = Of.o.alpha;
            return new Of.u(tag, true);
        }
        return (Of.n) kotlin.collections.y.papa(this.juliet, tag);
    }

    @Override // Pf.v, Pf.b
    public final String jade(SerialDescriptor descriptor, int i4) {
        Intrinsics.echo(descriptor, "descriptor");
        return (String) this.kilo.get(i4 / 2);
    }

    @Override // Pf.v, Pf.b
    public final Of.n lime() {
        return this.juliet;
    }

    @Override // Pf.v
    /* renamed from: olive */
    public final Of.aa lime() {
        return this.juliet;
    }

    @Override // Pf.v, Mf.a
    public final int sierra(SerialDescriptor descriptor) {
        Intrinsics.echo(descriptor, "descriptor");
        int i4 = this.mike;
        if (i4 < this.lima - 1) {
            int i5 = i4 + 1;
            this.mike = i5;
            return i5;
        }
        return -1;
    }
}
