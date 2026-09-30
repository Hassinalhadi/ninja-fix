package R2;

import O2.o;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class m extends e {
    public final o alpha;
    public final String bravo;
    public final O2.f charlie;

    public m(o oVar, String str, O2.f fVar) {
        this.alpha = oVar;
        this.bravo = str;
        this.charlie = fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (Intrinsics.areEqual(this.alpha, mVar.alpha) && Intrinsics.areEqual(this.bravo, mVar.bravo) && this.charlie == mVar.charlie) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        String str = this.bravo;
        if (str != null) {
            i4 = str.hashCode();
        } else {
            i4 = 0;
        }
        return this.charlie.hashCode() + ((hashCode + i4) * 31);
    }
}
