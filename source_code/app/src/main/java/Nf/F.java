package Nf;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public abstract class F extends r {
    public final E bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(KSerializer primitiveSerializer) {
        super(primitiveSerializer);
        Intrinsics.echo(primitiveSerializer, "primitiveSerializer");
        this.bravo = new E(primitiveSerializer.getDescriptor());
    }

    @Override // Nf.AbstractC0243a
    public final Object alpha() {
        return (D) golf(juliet());
    }

    @Override // Nf.AbstractC0243a
    public final int bravo(Object obj) {
        D d4 = (D) obj;
        Intrinsics.echo(d4, "<this>");
        return d4.delta();
    }

    @Override // Nf.AbstractC0243a
    public final Iterator charlie(Object obj) {
        throw new IllegalStateException("This method lead to boxing and must not be used, use writeContents instead");
    }

    @Override // Nf.AbstractC0243a, kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return echo(decoder);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.bravo;
    }

    @Override // Nf.AbstractC0243a
    public final Object hotel(Object obj) {
        D d4 = (D) obj;
        Intrinsics.echo(d4, "<this>");
        return d4.alpha();
    }

    @Override // Nf.r
    public final void india(int i4, Object obj, Object obj2) {
        Intrinsics.echo((D) obj, "<this>");
        throw new IllegalStateException("This method lead to boxing and must not be used, use Builder.append instead");
    }

    public abstract Object juliet();

    public abstract void kilo(Mf.b bVar, Object obj, int i4);

    @Override // Nf.r, kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        int delta = delta(obj);
        E e = this.bravo;
        Mf.b sierra = ((AbstractC2796v6) encoder).sierra(e);
        kilo(sierra, obj, delta);
        sierra.alpha(e);
    }
}
