package s6;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes2.dex */
public abstract class K6 {
    public static final /* synthetic */ int alpha = 0;

    public static final void alpha(Encoder encoder) {
        Pf.ac acVar;
        Intrinsics.echo(encoder, "<this>");
        if (encoder instanceof Pf.ac) {
            acVar = (Pf.ac) encoder;
        } else {
            acVar = null;
        }
        if (acVar != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        throw new IllegalStateException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, encoder.getClass(), sb2));
    }

    public static final Of.l bravo(Decoder decoder) {
        Of.l lVar;
        Intrinsics.echo(decoder, "<this>");
        if (decoder instanceof Of.l) {
            lVar = (Of.l) decoder;
        } else {
            lVar = null;
        }
        if (lVar != null) {
            return lVar;
        }
        StringBuilder sb2 = new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        throw new IllegalStateException(com.google.android.material.datepicker.j.mike(kotlin.jvm.internal.u.alpha, decoder.getClass(), sb2));
    }
}
