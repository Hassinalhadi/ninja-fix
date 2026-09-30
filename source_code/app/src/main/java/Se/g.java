package Se;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.InterfaceC2349y;

/* loaded from: classes2.dex */
public abstract class g {
    public final Object alpha;

    public g(Object obj) {
        this.alpha = obj;
    }

    public abstract y alpha(InterfaceC2349y interfaceC2349y);

    public Object bravo() {
        return this.alpha;
    }

    public final boolean equals(Object obj) {
        g gVar;
        if (this != obj) {
            Object bravo = bravo();
            Object obj2 = null;
            if (obj instanceof g) {
                gVar = (g) obj;
            } else {
                gVar = null;
            }
            if (gVar != null) {
                obj2 = gVar.bravo();
            }
            if (!Intrinsics.areEqual(bravo, obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        Object bravo = bravo();
        if (bravo != null) {
            return bravo.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(bravo());
    }
}
