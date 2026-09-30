package Of;

import Nf.G;
import Nf.a0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2707l6;
import s6.AbstractC2760r6;
import s6.K6;

/* loaded from: classes2.dex */
public final class v implements KSerializer {
    public static final v alpha = new Object();
    public static final G bravo = AbstractC2707l6.alpha("kotlinx.serialization.json.JsonLiteral");

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        n india = K6.bravo(decoder).india();
        if (india instanceof u) {
            return (u) india;
        }
        StringBuilder sb2 = new StringBuilder("Unexpected JSON element, expected JsonLiteral, had ");
        throw Pf.r.delta(-1, india.toString(), com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, india.getClass(), sb2));
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return bravo;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Boolean bool;
        u value = (u) obj;
        Intrinsics.echo(value, "value");
        K6.alpha(encoder);
        boolean z2 = value.alpha;
        String str = value.purple;
        if (z2) {
            encoder.romeo(str);
            return;
        }
        Long uniform = kotlin.text.r.uniform(str);
        if (uniform != null) {
            encoder.papa(uniform.longValue());
            return;
        }
        kotlin.p echo = AbstractC2760r6.echo(str);
        if (echo != null) {
            encoder.november(a0.bravo).papa(echo.alpha);
            return;
        }
        Double romeo = kotlin.text.r.romeo(str);
        if (romeo != null) {
            encoder.echo(romeo.doubleValue());
            return;
        }
        if (Intrinsics.areEqual(str, "true")) {
            bool = Boolean.TRUE;
        } else if (Intrinsics.areEqual(str, "false")) {
            bool = Boolean.FALSE;
        } else {
            bool = null;
        }
        if (bool != null) {
            encoder.hotel(bool.booleanValue());
        } else {
            encoder.romeo(str);
        }
    }
}
