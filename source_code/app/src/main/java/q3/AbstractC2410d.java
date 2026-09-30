package q3;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: q3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2410d {
    public final String alpha;
    public final Object bravo;

    public AbstractC2410d(String str, Object obj) {
        this.alpha = str;
        this.bravo = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC2410d) {
            if (Intrinsics.areEqual(this.alpha, ((AbstractC2410d) obj).alpha)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return P0.gold(new StringBuilder("FeatureFlag("), this.alpha, ")");
    }
}
