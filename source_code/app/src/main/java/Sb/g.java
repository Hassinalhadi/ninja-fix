package Sb;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class g {
    public final int alpha;
    public final String bravo;

    public g(int i4, String label) {
        Intrinsics.echo(label, "label");
        this.alpha = i4;
        this.bravo = label;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (this.alpha != gVar.alpha || !Intrinsics.areEqual(this.bravo, gVar.bravo)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderMetaItemUi(value=");
        sb2.append(this.alpha);
        sb2.append(", label=");
        return P0.gold(sb2, this.bravo, ")");
    }
}
