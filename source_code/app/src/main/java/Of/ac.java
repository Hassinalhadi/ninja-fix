package Of;

import Nf.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.K6;

/* loaded from: classes2.dex */
public final class ac implements KSerializer {
    public static final ac alpha = new Object();
    public static final ab bravo = ab.bravo;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        K6.bravo(decoder);
        return new aa((Map) new Nf.ae(P.alpha, q.alpha, 1).echo(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        aa value = (aa) obj;
        Intrinsics.echo(value, "value");
        K6.alpha(encoder);
        new Nf.ae(P.alpha, q.alpha, 1).serialize(encoder, value);
    }
}
