package Nf;

import androidx.appcompat.widget.P0;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class ad implements SerialDescriptor {
    public final String alpha;
    public final SerialDescriptor bravo;
    public final SerialDescriptor charlie;

    public ad(String str, SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        this.alpha = str;
        this.bravo = serialDescriptor;
        this.charlie = serialDescriptor2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad)) {
            return false;
        }
        ad adVar = (ad) obj;
        if (Intrinsics.areEqual(this.alpha, adVar.alpha) && Intrinsics.areEqual(this.bravo, adVar.bravo) && Intrinsics.areEqual(this.charlie, adVar.charlie)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return CollectionsKt.emptyList();
    }

    public final int hashCode() {
        return this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final /* synthetic */ boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2716m6 november() {
        return Lf.l.delta;
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
        Integer tango = kotlin.text.r.tango(name);
        if (tango != null) {
            return tango.intValue();
        }
        throw new IllegalArgumentException(name.concat(" is not a valid map index"));
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int romeo() {
        return 2;
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
        throw new IllegalArgumentException(P0.gold(Q0.c.sierra(i4, "Illegal index ", ", "), this.alpha, " expects only non-negative indices").toString());
    }

    public final String toString() {
        return this.alpha + '(' + this.bravo + ", " + this.charlie + ')';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor uniform(int i4) {
        if (i4 >= 0) {
            int i5 = i4 % 2;
            if (i5 != 0) {
                if (i5 == 1) {
                    return this.charlie;
                }
                throw new IllegalStateException("Unreached");
            }
            return this.bravo;
        }
        throw new IllegalArgumentException(P0.gold(Q0.c.sierra(i4, "Illegal index ", ", "), this.alpha, " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean victor(int i4) {
        if (i4 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(P0.gold(Q0.c.sierra(i4, "Illegal index ", ", "), this.alpha, " expects only non-negative indices").toString());
    }
}
