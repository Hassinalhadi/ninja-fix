package Nf;

import kotlin.UByte;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public final class U implements KSerializer {
    public static final U alpha = new Object();
    public static final af bravo = az.alpha("kotlin.UByte", C0252j.alpha);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return UByte.m208boximpl(UByte.m209constructorimpl(decoder.victor(bravo).xray()));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.november(bravo).golf(((UByte) obj).alpha);
    }
}
