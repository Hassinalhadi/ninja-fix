package Jf;

import B2.q;
import Nf.AbstractC0244b;
import ge.InterfaceC1772d;
import java.util.List;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.i;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class b extends AbstractC0244b {
    public final InterfaceC1772d alpha;
    public final List bravo;
    public final Object charlie;

    public b(InterfaceC1772d baseClass) {
        Intrinsics.echo(baseClass, "baseClass");
        this.alpha = baseClass;
        this.bravo = CollectionsKt.emptyList();
        this.charlie = LazyKt.alpha(i.alpha, new q(12, this));
    }

    @Override // Nf.AbstractC0244b
    public final InterfaceC1772d charlie() {
        return this.alpha;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.charlie.getValue();
    }

    public final String toString() {
        return "kotlinx.serialization.PolymorphicSerializer(baseClass: " + this.alpha + ')';
    }
}
