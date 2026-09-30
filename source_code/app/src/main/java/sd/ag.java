package sd;

import Nf.G;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2707l6;
import t6.AbstractC3006i2;

/* loaded from: classes2.dex */
public final class ag implements KSerializer {
    public static final ag alpha = new Object();
    public static final G bravo = AbstractC2707l6.alpha("io.ktor.http.Url");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        return AbstractC3006i2.alpha(decoder.mike());
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        af value = (af) obj;
        Intrinsics.echo(value, "value");
        encoder.romeo(value.teal);
    }
}
