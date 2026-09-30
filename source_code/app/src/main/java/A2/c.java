package A2;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class c {
    public final Uri alpha;
    public final boolean bravo;

    public c(Uri uri, boolean z2) {
        this.alpha = uri;
        this.bravo = z2;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.areEqual(c.class, cls)) {
            return false;
        }
        Intrinsics.charlie(obj, "null cannot be cast to non-null type androidx.work.Constraints.ContentUriTrigger");
        c cVar = (c) obj;
        if (Intrinsics.areEqual(this.alpha, cVar.alpha) && this.bravo == cVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }
}
