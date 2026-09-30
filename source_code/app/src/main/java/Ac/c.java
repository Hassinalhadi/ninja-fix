package Ac;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class c {
    public final String alpha;
    public final String bravo;

    public c(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Intrinsics.areEqual(this.alpha, cVar.alpha) && Intrinsics.areEqual(this.bravo, cVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.alpha.hashCode() * 31;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return hashCode2 + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DayChip(label=");
        sb2.append(this.alpha);
        sb2.append(", serverDay=");
        return P0.gold(sb2, this.bravo, ")");
    }
}
