package Nf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: Nf.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0249g implements KSerializer {
    public static final C0249g alpha = new Object();
    public static final G bravo = new G("kotlin.Boolean", Lf.e.bravo);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return Boolean.valueOf(decoder.delta());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.hotel(((Boolean) obj).booleanValue());
    }
}
