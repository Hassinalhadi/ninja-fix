package ff;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes2.dex */
public final class g {
    public final Ne.c alpha;
    public final Lambda bravo;

    /* JADX WARN: Multi-variable type inference failed */
    public g(Ne.c cVar, Function0 function0) {
        this.alpha = cVar;
        this.bravo = (Lambda) function0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g.class == obj.getClass() && this.alpha.equals(((g) obj).alpha)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.alpha.hashCode();
    }
}
