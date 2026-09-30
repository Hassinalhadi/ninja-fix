package Fe;

import java.util.Map;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2330f;
import pe.an;
import qe.InterfaceC2466b;

/* loaded from: classes2.dex */
public final class b implements InterfaceC2466b {
    public static final b alpha = new Object();

    @Override // qe.InterfaceC2466b
    public final Ne.c alpha() {
        InterfaceC2330f delta = Ue.e.delta(this);
        if (delta != null) {
            if (hf.i.foxtrot(delta)) {
                delta = null;
            }
            if (delta != null) {
                return Ue.e.charlie(delta);
            }
        }
        return null;
    }

    @Override // qe.InterfaceC2466b
    public final Map bravo() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // qe.InterfaceC2466b
    public final an echo() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    @Override // qe.InterfaceC2466b
    public final y getType() {
        throw new IllegalStateException("No methods should be called on this descriptor. Only its presence matters");
    }

    public final String toString() {
        return "[EnhancedType]";
    }
}
