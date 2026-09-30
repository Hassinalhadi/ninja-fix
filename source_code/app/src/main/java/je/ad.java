package je;

import kotlin.jvm.internal.Lambda;
import pe.AbstractC2340p;
import pe.C2339o;

/* loaded from: classes2.dex */
public final class ad extends Lambda implements Xd.l {
    public static final ad alpha = new Lambda(2);

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        int intValue;
        Integer bravo = AbstractC2340p.bravo((C2339o) obj, (C2339o) obj2);
        if (bravo == null) {
            intValue = 0;
        } else {
            intValue = bravo.intValue();
        }
        return Integer.valueOf(intValue);
    }
}
