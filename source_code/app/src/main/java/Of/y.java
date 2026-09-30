package Of;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.internal.JsonDecodingException;
import s6.AbstractC2707l6;
import s6.K6;

/* loaded from: classes2.dex */
public final class y implements KSerializer {
    public static final y alpha = new Object();
    public static final Lf.g bravo = AbstractC2707l6.delta("kotlinx.serialization.json.JsonNull", Lf.k.bravo, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        K6.bravo(decoder);
        if (!decoder.quebec()) {
            return x.INSTANCE;
        }
        throw new JsonDecodingException("Expected 'null' literal");
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        x value = (x) obj;
        Intrinsics.echo(value, "value");
        K6.alpha(encoder);
        encoder.delta();
    }
}
