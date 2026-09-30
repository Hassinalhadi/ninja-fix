package s6;

import java.util.Arrays;

/* renamed from: s6.k5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2697k5 {
    public final EnumC2688j5 alpha;
    public final Integer bravo;

    public /* synthetic */ C2697k5(com.google.android.material.internal.ab abVar) {
        this.alpha = (EnumC2688j5) abVar.purple;
        this.bravo = (Integer) abVar.red;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2697k5)) {
            return false;
        }
        C2697k5 c2697k5 = (C2697k5) obj;
        if (V5.x.lima(this.alpha, c2697k5.alpha) && V5.x.lima(this.bravo, c2697k5.bravo) && V5.x.lima(null, null) && V5.x.lima(null, null)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.alpha, this.bravo, null, null});
    }
}
