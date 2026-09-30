package D0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class r {
    public final L0.d alpha;
    public final int bravo;
    public final int charlie;

    public r(L0.d dVar, int i4, int i5) {
        this.alpha = dVar;
        this.bravo = i4;
        this.charlie = i5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof r) {
                r rVar = (r) obj;
                if (!Intrinsics.areEqual(this.alpha, rVar.alpha) || this.bravo != rVar.bravo || this.charlie != rVar.charlie) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.alpha.hashCode() * 31) + this.bravo) * 31) + this.charlie;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ParagraphIntrinsicInfo(intrinsics=");
        sb2.append(this.alpha);
        sb2.append(", startIndex=");
        sb2.append(this.bravo);
        sb2.append(", endIndex=");
        return Q0.c.quebec(sb2, this.charlie, ')');
    }
}
