package ca;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ca.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0834b extends f {
    public final String alpha;
    public final String bravo;

    public C0834b(String str, String str2) {
        this.alpha = str;
        this.bravo = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0834b)) {
            return false;
        }
        C0834b c0834b = (C0834b) obj;
        if (Intrinsics.areEqual(this.alpha, c0834b.alpha) && Intrinsics.areEqual(this.bravo, c0834b.bravo)) {
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
        StringBuilder sb2 = new StringBuilder("Error(message=");
        sb2.append(this.alpha);
        sb2.append(", body=");
        return P0.gold(sb2, this.bravo, ")");
    }
}
