package Nf;

import com.google.android.gms.measurement.internal.C1473v;
import ge.InterfaceC1772d;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2796v6;
import s6.S5;

/* renamed from: Nf.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0244b implements KSerializer {
    public KSerializer alpha(Mf.a aVar, String str) {
        C1473v bravo = aVar.bravo();
        InterfaceC1772d baseClass = charlie();
        bravo.getClass();
        Intrinsics.echo(baseClass, "baseClass");
        kotlin.jvm.internal.x.foxtrot(1, null);
        return null;
    }

    public KSerializer bravo(AbstractC2796v6 abstractC2796v6, Object value) {
        Intrinsics.echo(value, "value");
        C1473v bravo = abstractC2796v6.bravo();
        InterfaceC1772d baseClass = charlie();
        bravo.getClass();
        Intrinsics.echo(baseClass, "baseClass");
        if (!baseClass.november(value)) {
            return null;
        }
        kotlin.jvm.internal.x.foxtrot(1, null);
        return null;
    }

    public abstract InterfaceC1772d charlie();

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor descriptor = getDescriptor();
        Mf.a charlie = decoder.charlie(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Object obj = null;
        while (true) {
            int sierra = charlie.sierra(getDescriptor());
            if (sierra != -1) {
                if (sierra != 0) {
                    if (sierra != 1) {
                        StringBuilder sb2 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                        String str = (String) objectRef.alpha;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(sierra);
                        throw new SerializationException(sb2.toString());
                    }
                    Object obj2 = objectRef.alpha;
                    if (obj2 != null) {
                        objectRef.alpha = obj2;
                        obj = charlie.whiskey(getDescriptor(), sierra, S5.alpha(this, charlie, (String) obj2), null);
                    } else {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                } else {
                    objectRef.alpha = charlie.papa(getDescriptor(), sierra);
                }
            } else {
                if (obj != null) {
                    charlie.alpha(descriptor);
                    return obj;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.alpha)).toString());
            }
        }
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.echo(value, "value");
        KSerializer bravo = S5.bravo(this, (AbstractC2796v6) encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        AbstractC2796v6 abstractC2796v6 = (AbstractC2796v6) encoder.charlie(descriptor);
        abstractC2796v6.xray(getDescriptor(), 0, bravo.getDescriptor().oscar());
        abstractC2796v6.whiskey(getDescriptor(), 1, bravo, value);
        abstractC2796v6.alpha(descriptor);
    }
}
