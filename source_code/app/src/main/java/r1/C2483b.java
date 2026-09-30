package r1;

import androidx.appcompat.widget.P0;
import java.util.Objects;

/* renamed from: r1.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2483b {
    public final Object alpha;
    public final Object bravo;

    public C2483b(Object obj, Object obj2) {
        this.alpha = obj;
        this.bravo = obj2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C2483b)) {
            return false;
        }
        C2483b c2483b = (C2483b) obj;
        if (!Objects.equals(c2483b.alpha, this.alpha) || !Objects.equals(c2483b.bravo, this.bravo)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        Object obj = this.alpha;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.bravo;
        if (obj2 != null) {
            i4 = obj2.hashCode();
        }
        return i4 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.alpha);
        sb2.append(" ");
        return P0.emerald(sb2, this.bravo, "}");
    }
}
