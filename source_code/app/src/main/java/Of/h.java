package Of;

import Nf.C0246d;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.K6;

/* loaded from: classes2.dex */
public final class h implements KSerializer {
    public static final h alpha = new Object();
    public static final g bravo = g.bravo;

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        K6.bravo(decoder);
        return new f((List) new C0246d(q.alpha, 0).echo(decoder));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        f value = (f) obj;
        Intrinsics.echo(value, "value");
        K6.alpha(encoder);
        new C0246d(q.alpha, 0).serialize(encoder, value);
    }
}
