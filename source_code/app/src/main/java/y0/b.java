package y0;

import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class b {
    public final Resources.Theme alpha;
    public final int bravo;

    public b(Resources.Theme theme, int i4) {
        this.alpha = theme;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (Intrinsics.areEqual(this.alpha, bVar.alpha) && this.bravo == bVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Key(theme=");
        sb2.append(this.alpha);
        sb2.append(", id=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
