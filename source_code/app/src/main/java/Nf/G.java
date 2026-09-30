package Nf;

import androidx.appcompat.widget.P0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class G implements SerialDescriptor {
    public final String alpha;
    public final Lf.f bravo;

    public G(String str, Lf.f kind) {
        Intrinsics.echo(kind, "kind");
        this.alpha = str;
        this.bravo = kind;
    }

    public final void alpha() {
        throw new IllegalStateException(P0.gold(new StringBuilder("Primitive descriptor "), this.alpha, " does not have elements"));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof G)) {
            return false;
        }
        G g2 = (G) obj;
        if (Intrinsics.areEqual(this.alpha, g2.alpha)) {
            if (Intrinsics.areEqual(this.bravo, g2.bravo)) {
                return true;
            }
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return (this.bravo.hashCode() * 31) + this.alpha.hashCode();
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2716m6 november() {
        return this.bravo;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String oscar() {
        return this.alpha;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean papa() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int quebec(String name) {
        Intrinsics.echo(name, "name");
        alpha();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int romeo() {
        return 0;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String sierra(int i4) {
        alpha();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List tango(int i4) {
        alpha();
        throw null;
    }

    public final String toString() {
        return P0.fuchsia(new StringBuilder("PrimitiveDescriptor("), this.alpha, ')');
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor uniform(int i4) {
        alpha();
        throw null;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean victor(int i4) {
        alpha();
        throw null;
    }
}
