package Lf;

import ge.InterfaceC1772d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import s6.AbstractC2716m6;

/* loaded from: classes2.dex */
public final class b implements SerialDescriptor {
    public final g alpha;
    public final InterfaceC1772d bravo;
    public final String charlie;

    public b(g gVar, InterfaceC1772d kClass) {
        Intrinsics.echo(kClass, "kClass");
        this.alpha = gVar;
        this.bravo = kClass;
        this.charlie = gVar.alpha + '<' + kClass.kilo() + '>';
    }

    public final boolean equals(Object obj) {
        b bVar;
        if (obj instanceof b) {
            bVar = (b) obj;
        } else {
            bVar = null;
        }
        if (bVar != null && Intrinsics.areEqual(this.alpha, bVar.alpha) && Intrinsics.areEqual(bVar.bravo, this.bravo)) {
            return true;
        }
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List getAnnotations() {
        return this.alpha.delta;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + (this.bravo.hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean isInline() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final AbstractC2716m6 november() {
        return this.alpha.bravo;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String oscar() {
        return this.charlie;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean papa() {
        return false;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int quebec(String name) {
        Intrinsics.echo(name, "name");
        return this.alpha.quebec(name);
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final int romeo() {
        return this.alpha.charlie;
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String sierra(int i4) {
        return this.alpha.foxtrot[i4];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final List tango(int i4) {
        return this.alpha.hotel[i4];
    }

    public final String toString() {
        return "ContextDescriptor(kClass: " + this.bravo + ", original: " + this.alpha + ')';
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final SerialDescriptor uniform(int i4) {
        return this.alpha.golf[i4];
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final boolean victor(int i4) {
        return this.alpha.india[i4];
    }
}
