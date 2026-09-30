package Nf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class d0 implements KSerializer {
    public static final d0 alpha = new Object();
    public static final af bravo = az.alpha("kotlin.UShort", O.alpha);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new kotlin.s(decoder.victor(bravo).azure());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.november(bravo).foxtrot(((kotlin.s) obj).alpha);
    }
}
