package P;

import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2743p6;

/* loaded from: classes3.dex */
public final class f {
    public int alpha = 0;

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("IntRef(element = ");
        sb2.append(this.alpha);
        sb2.append(")@");
        int hashCode = hashCode();
        AbstractC2743p6.alpha(16);
        String num = Integer.toString(hashCode, 16);
        Intrinsics.delta(num, "toString(...)");
        sb2.append(num);
        return sb2.toString();
    }
}
