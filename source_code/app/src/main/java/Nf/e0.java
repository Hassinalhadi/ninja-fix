package Nf;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class e0 implements KSerializer {
    public static final e0 bravo = new e0();
    public final /* synthetic */ C0266y alpha = new C0266y("kotlin.Unit", Unit.INSTANCE);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        this.alpha.deserialize(decoder);
        return Unit.INSTANCE;
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return this.alpha.getDescriptor();
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Unit value = (Unit) obj;
        Intrinsics.echo(value, "value");
        this.alpha.serialize(encoder, value);
    }
}
