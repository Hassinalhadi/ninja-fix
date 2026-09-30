package Nf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Nf.u, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0262u implements KSerializer {
    public static final C0262u alpha = new Object();
    public static final G bravo = new G("kotlin.Double", Lf.e.echo);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Double.valueOf(decoder.black());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.echo(((Number) obj).doubleValue());
    }
}
