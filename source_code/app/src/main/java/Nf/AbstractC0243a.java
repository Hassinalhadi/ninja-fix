package Nf;

import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;

/* renamed from: Nf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0243a implements KSerializer {
    public abstract Object alpha();

    public abstract int bravo(Object obj);

    public abstract Iterator charlie(Object obj);

    public abstract int delta(Object obj);

    @Override // kotlinx.serialization.KSerializer
    public Object deserialize(Decoder decoder) {
        return echo(decoder);
    }

    public final Object echo(Decoder decoder) {
        Object alpha = alpha();
        int bravo = bravo(alpha);
        Mf.a charlie = decoder.charlie(getDescriptor());
        while (true) {
            int sierra = charlie.sierra(getDescriptor());
            if (sierra != -1) {
                foxtrot(charlie, sierra + bravo, alpha);
            } else {
                charlie.alpha(getDescriptor());
                return hotel(alpha);
            }
        }
    }

    public abstract void foxtrot(Mf.a aVar, int i4, Object obj);

    public abstract Object golf(Object obj);

    public abstract Object hotel(Object obj);
}
