package b;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class T {
    public final long alpha;
    public final androidx.compose.foundation.layout.M bravo;

    public T() {
        long delta = a0.ao.delta(4284900966L);
        androidx.compose.foundation.layout.M bravo = AbstractC0538d.bravo(3, 0.0f, 0.0f);
        this.alpha = delta;
        this.bravo = bravo;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (Intrinsics.areEqual(T.class, cls)) {
                Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.compose.foundation.OverscrollConfiguration");
                T t5 = (T) obj;
                if (!C0366t.charlie(this.alpha, t5.alpha) || !Intrinsics.areEqual(this.bravo, t5.bravo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4 = C0366t.lima;
        return this.bravo.hashCode() + (kotlin.p.alpha(this.alpha) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OverscrollConfiguration(glowColor=");
        ao.ad.bronze(this.alpha, ", drawPadding=", sb2);
        sb2.append(this.bravo);
        sb2.append(')');
        return sb2.toString();
    }
}
