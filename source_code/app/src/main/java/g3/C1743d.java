package g3;

import androidx.appcompat.widget.P0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: g3.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1743d {
    public final boolean alpha;
    public final List bravo;
    public final String charlie;

    public C1743d(boolean z2, List issues, String str) {
        Intrinsics.echo(issues, "issues");
        this.alpha = z2;
        this.bravo = issues;
        this.charlie = str;
    }

    public final boolean alpha() {
        return this.bravo.contains(u.alpha);
    }

    public final boolean bravo() {
        u uVar = u.red;
        List list = this.bravo;
        if (!list.contains(uVar) && !list.contains(u.silver)) {
            return false;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1743d) {
                C1743d c1743d = (C1743d) obj;
                if (this.alpha != c1743d.alpha || !Intrinsics.areEqual(this.bravo, c1743d.bravo) || !Intrinsics.areEqual(this.charlie, c1743d.charlie)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int golf = com.google.android.material.datepicker.j.golf(i4 * 31, 31, this.bravo);
        String str = this.charlie;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return golf + hashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LocationCompliance(isCompliant=");
        sb2.append(this.alpha);
        sb2.append(", issues=");
        sb2.append(this.bravo);
        sb2.append(", message=");
        return P0.gold(sb2, this.charlie, ")");
    }
}
