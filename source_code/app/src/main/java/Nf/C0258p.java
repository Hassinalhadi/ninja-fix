package Nf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Nf.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0258p implements KSerializer {
    public static final C0258p alpha = new Object();
    public static final G bravo = new G("kotlin.Char", Lf.e.delta);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Character.valueOf(decoder.echo());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.kilo(((Character) obj).charValue());
    }
}
