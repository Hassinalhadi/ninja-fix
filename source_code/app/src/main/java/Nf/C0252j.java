package Nf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Nf.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0252j implements KSerializer {
    public static final C0252j alpha = new Object();
    public static final G bravo = new G("kotlin.Byte", Lf.e.charlie);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Byte.valueOf(decoder.xray());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.golf(((Number) obj).byteValue());
    }
}
