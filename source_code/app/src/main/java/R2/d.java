package R2;

import android.graphics.drawable.Drawable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class d extends e {
    public final Drawable alpha;
    public final boolean bravo;
    public final O2.f charlie;

    public d(Drawable drawable, boolean z2, O2.f fVar) {
        this.alpha = drawable;
        this.bravo = z2;
        this.charlie = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (Intrinsics.areEqual(this.alpha, dVar.alpha) && this.bravo == dVar.bravo && this.charlie == dVar.charlie) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        if (this.bravo) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return this.charlie.hashCode() + ((hashCode + i4) * 31);
    }
}
