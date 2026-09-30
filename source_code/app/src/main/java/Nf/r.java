package Nf;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import s6.AbstractC2796v6;

/* loaded from: classes2.dex */
public abstract class r extends AbstractC0243a {
    public final KSerializer alpha;

    public r(KSerializer kSerializer) {
        this.alpha = kSerializer;
    }

    @Override // Nf.AbstractC0243a
    public void foxtrot(Mf.a aVar, int i4, Object obj) {
        india(i4, obj, aVar.whiskey(getDescriptor(), i4, this.alpha, null));
    }

    public abstract void india(int i4, Object obj, Object obj2);

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, Object obj) {
        int delta = delta(obj);
        SerialDescriptor descriptor = getDescriptor();
        Mf.b sierra = ((AbstractC2796v6) encoder).sierra(descriptor);
        Iterator charlie = charlie(obj);
        for (int i4 = 0; i4 < delta; i4++) {
            ((AbstractC2796v6) sierra).whiskey(getDescriptor(), i4, this.alpha, charlie.next());
        }
        sierra.alpha(descriptor);
    }
}
