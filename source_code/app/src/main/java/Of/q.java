package Of;

import Lb.am;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2707l6;
import s6.K6;

/* loaded from: classes2.dex */
public final class q implements KSerializer {
    public static final q alpha = new Object();
    public static final Lf.g bravo = AbstractC2707l6.charlie("kotlinx.serialization.json.JsonElement", Lf.c.charlie, new SerialDescriptor[0], new am(12));

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return K6.bravo(decoder).india();
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        n value = (n) obj;
        Intrinsics.echo(value, "value");
        K6.alpha(encoder);
        if (value instanceof ae) {
            encoder.oscar(af.alpha, value);
        } else if (value instanceof aa) {
            encoder.oscar(ac.alpha, value);
        } else {
            if (value instanceof f) {
                encoder.oscar(h.alpha, value);
                return;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
