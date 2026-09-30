package Nf;

import kotlin.UInt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class X implements KSerializer {
    public static final X alpha = new Object();
    public static final af bravo = az.alpha("kotlin.UInt", aj.alpha);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return new UInt(UInt.m210constructorimpl(decoder.victor(bravo).juliet()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.november(bravo).mike(((UInt) obj).alpha);
    }
}
