package Nf;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public abstract class al implements SerialDescriptor {
    public final SerialDescriptor alpha;

    public al(SerialDescriptor serialDescriptor) {
        this.alpha = serialDescriptor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al)) {
            return false;
        }
        al alVar = (al) obj;
        if (Intrinsics.areEqual(this.alpha, alVar.alpha) && Intrinsics.areEqual(oscar(), alVar.oscar())) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return oscar().hashCode() + (this.alpha.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2716m6 november() {
        return Lf.l.charlie;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean papa() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int quebec(String name) {
        Intrinsics.echo(name, "name");
        Integer tango = kotlin.text.r.tango(name);
        if (tango != null) {
            return tango.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid list index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int romeo() {
        return 1;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String sierra(int i4) {
        return String.valueOf(i4);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List tango(int i4) {
        if (i4 >= 0) {
            return CollectionsKt.emptyList();
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Illegal index ", ", ");
        sierra.append(oscar());
        sierra.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sierra.toString().toString());
    }

    public final String toString() {
        return oscar() + '(' + this.alpha + ')';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor uniform(int i4) {
        if (i4 >= 0) {
            return this.alpha;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Illegal index ", ", ");
        sierra.append(oscar());
        sierra.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sierra.toString().toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean victor(int i4) {
        if (i4 >= 0) {
            return false;
        }
        StringBuilder sierra = Q0.c.sierra(i4, "Illegal index ", ", ");
        sierra.append(oscar());
        sierra.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sierra.toString().toString());
    }
}
