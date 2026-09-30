package Nf;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class a0 implements KSerializer {
    public static final a0 alpha = new Object();
    public static final af bravo = az.alpha("kotlin.ULong", ao.alpha);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new kotlin.p(decoder.victor(bravo).november());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.november(bravo).papa(((kotlin.p) obj).alpha);
    }
}
