package Y1;

import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import s6.Y6;

/* loaded from: classes3.dex */
public final class i {
    public final int alpha;
    public aj bravo = null;
    public Bundle charlie = null;

    public i(int i4) {
        this.alpha = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.alpha != iVar.alpha || !Intrinsics.areEqual(this.bravo, iVar.bravo)) {
            return false;
        }
        Bundle bundle = this.charlie;
        Bundle bundle2 = iVar.charlie;
        if (Intrinsics.areEqual(bundle, bundle2)) {
            return true;
        }
        if (bundle != null && bundle2 != null && Y6.bravo(bundle, bundle2)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = this.alpha * 31;
        aj ajVar = this.bravo;
        if (ajVar != null) {
            i4 = ajVar.hashCode();
        } else {
            i4 = 0;
        }
        int i10 = i5 + i4;
        Bundle bundle = this.charlie;
        if (bundle != null) {
            return Y6.charlie(bundle) + (i10 * 31);
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i.class.getSimpleName());
        sb2.append("(0x");
        sb2.append(Integer.toHexString(this.alpha));
        sb2.append(")");
        if (this.bravo != null) {
            sb2.append(" navOptions=");
            sb2.append(this.bravo);
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
