package db;

import androidx.appcompat.widget.P0;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class m {
    public final int alpha;
    public final String bravo;
    public final String charlie;

    public m(int i4, String str, String str2) {
        this.alpha = i4;
        this.bravo = str;
        this.charlie = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.alpha == mVar.alpha && Intrinsics.areEqual(this.bravo, mVar.bravo) && Intrinsics.areEqual(this.charlie, mVar.charlie)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int sierra = AbstractC2327c.sierra(this.alpha * 31, 31, this.bravo);
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return sierra + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CashierItemModifier(count=");
        sb2.append(this.alpha);
        sb2.append(", label=");
        sb2.append(this.bravo);
        sb2.append(", labelAr=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
