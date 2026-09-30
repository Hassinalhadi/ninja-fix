package Y1;

import android.os.Bundle;
import java.util.Arrays;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import s6.S6;

/* loaded from: classes3.dex */
public final class a {
    public final int alpha;
    public final Bundle bravo = S6.charlie((Pair[]) Arrays.copyOf(new Pair[0], 0));

    public a(int i4) {
        this.alpha = i4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && Intrinsics.areEqual(a.class, obj.getClass()) && this.alpha == ((a) obj).alpha) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return 31 + this.alpha;
    }

    public final String toString() {
        return Q0.c.quebec(new StringBuilder("ActionOnlyNavDirections(actionId="), this.alpha, ')');
    }
}
