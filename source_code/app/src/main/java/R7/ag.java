package R7;

import androidx.appcompat.widget.P0;
import java.util.List;

/* loaded from: classes2.dex */
public final class ag extends T {
    public final List alpha;
    public final String bravo;

    public ag(List list, String str) {
        this.alpha = list;
        this.bravo = str;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof T) {
            T t5 = (T) obj;
            if (this.alpha.equals(((ag) t5).alpha) && ((str = this.bravo) != null ? str.equals(((ag) t5).bravo) : ((ag) t5).bravo == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.alpha.hashCode() ^ 1000003) * 1000003;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 ^ hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FilesPayload{files=");
        sb2.append(this.alpha);
        sb2.append(", orgId=");
        return P0.gold(sb2, this.bravo, "}");
    }
}
