package Nf;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes2.dex */
public final class E extends al {
    public final String bravo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public E(SerialDescriptor primitive) {
        super(primitive);
        Intrinsics.echo(primitive, "primitive");
        this.bravo = primitive.oscar() + "Array";
    }

    @Override // kotlinx.serialization.descriptors.SerialDescriptor
    public final String oscar() {
        return this.bravo;
    }
}
