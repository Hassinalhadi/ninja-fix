package O7;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class w {
    public final String alpha;
    public final String bravo;

    public w(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Intrinsics.areEqual(this.alpha, wVar.alpha) && Intrinsics.areEqual(this.bravo, wVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i4 = 0;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = hashCode * 31;
        String str2 = this.bravo;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i5 + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FirebaseInstallationId(fid=");
        sb2.append(this.alpha);
        sb2.append(", authToken=");
        return P0.fuchsia(sb2, this.bravo, ')');
    }
}
