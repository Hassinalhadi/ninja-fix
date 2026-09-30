package Of;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2707l6;
import s6.K6;

/* loaded from: classes2.dex */
public final class af implements KSerializer {
    public static final af alpha = new Object();
    public static final Lf.g bravo = AbstractC2707l6.delta("kotlinx.serialization.json.JsonPrimitive", Lf.e.juliet, new SerialDescriptor[0]);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        n india = K6.bravo(decoder).india();
        if (india instanceof ae) {
            return (ae) india;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        throw Pf.r.delta(-1, india.toString(), com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, india.getClass(), sb2));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ae value = (ae) obj;
        Intrinsics.echo(value, "value");
        K6.alpha(encoder);
        if (value instanceof x) {
            encoder.oscar(y.alpha, x.INSTANCE);
        } else {
            encoder.oscar(v.alpha, (u) value);
        }
    }
}
