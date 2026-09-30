package xb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: xb.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3321e {
    public final String alpha;
    public final String bravo;

    public C3321e(String value, String label) {
        Intrinsics.echo(value, "value");
        Intrinsics.echo(label, "label");
        this.alpha = value;
        this.bravo = label;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3321e)) {
            return false;
        }
        C3321e c3321e = (C3321e) obj;
        if (Intrinsics.areEqual(this.alpha, c3321e.alpha) && Intrinsics.areEqual(this.bravo, c3321e.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StatItemData(value=");
        sb2.append(this.alpha);
        sb2.append(", label=");
        return P0.gold(sb2, this.bravo, ")");
    }
}
