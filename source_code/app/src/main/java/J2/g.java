package J2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class g {
    public final String alpha;
    public final int bravo;
    public final int charlie;

    public g(String workSpecId, int i4, int i5) {
        Intrinsics.echo(workSpecId, "workSpecId");
        this.alpha = workSpecId;
        this.bravo = i4;
        this.charlie = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (Intrinsics.areEqual(this.alpha, gVar.alpha) && this.bravo == gVar.bravo && this.charlie == gVar.charlie) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.alpha.hashCode() * 31) + this.bravo) * 31) + this.charlie;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SystemIdInfo(workSpecId=");
        sb2.append(this.alpha);
        sb2.append(", generation=");
        sb2.append(this.bravo);
        sb2.append(", systemId=");
        return Q0.c.quebec(sb2, this.charlie, ')');
    }
}
