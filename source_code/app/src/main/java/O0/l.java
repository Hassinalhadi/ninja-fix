package O0;

import androidx.appcompat.widget.P0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class l {
    public static final l bravo = new l(0);
    public static final l charlie = new l(1);
    public static final l delta = new l(2);
    public final int alpha;

    public l(int i4) {
        this.alpha = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        if (this.alpha == ((l) obj).alpha) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.alpha;
    }

    public final String toString() {
        int i4 = this.alpha;
        if (i4 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i4 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i4 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return P0.fuchsia(new StringBuilder("TextDecoration["), S0.a.alpha(arrayList, ", ", null, 62), ']');
    }
}
