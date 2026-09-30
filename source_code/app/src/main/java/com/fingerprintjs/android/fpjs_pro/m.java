package com.fingerprintjs.android.fpjs_pro;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m {
    public final String alpha;
    public final String bravo;

    public m(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (Intrinsics.areEqual(this.alpha, mVar.alpha) && Intrinsics.areEqual(this.bravo, mVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Continent(code=");
        sb2.append(this.alpha);
        sb2.append(", name=");
        return P0.gold(sb2, this.bravo, ")");
    }
}
