package T1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class c {
    public final LinkedHashMap alpha = new LinkedHashMap();

    public abstract Object alpha(b bVar);

    public final boolean equals(Object obj) {
        if ((obj instanceof c) && Intrinsics.areEqual(this.alpha, ((c) obj).alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.alpha + ')';
    }
}
