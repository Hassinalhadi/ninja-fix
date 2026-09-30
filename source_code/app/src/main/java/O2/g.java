package O2;

import android.graphics.drawable.BitmapDrawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public final BitmapDrawable alpha;
    public final boolean bravo;

    public g(BitmapDrawable bitmapDrawable, boolean z2) {
        this.alpha = bitmapDrawable;
        this.bravo = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof g) {
                g gVar = (g) obj;
                if (Intrinsics.areEqual(this.alpha, gVar.alpha) && this.bravo == gVar.bravo) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }
}
