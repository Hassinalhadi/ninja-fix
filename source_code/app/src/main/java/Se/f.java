package Se;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f {
    public final Ne.b alpha;
    public final int bravo;

    public f(Ne.b bVar, int i4) {
        this.alpha = bVar;
        this.bravo = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Intrinsics.areEqual(this.alpha, fVar.alpha) && this.bravo == fVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        int i4;
        StringBuilder sb2 = new StringBuilder();
        int i5 = 0;
        while (true) {
            i4 = this.bravo;
            if (i5 >= i4) {
                break;
            }
            sb2.append("kotlin/Array<");
            i5++;
        }
        sb2.append(this.alpha);
        for (int i10 = 0; i10 < i4; i10++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
