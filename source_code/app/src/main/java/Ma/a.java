package Ma;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final String alpha;
    public final double bravo;
    public final double charlie;

    public a(String name, double d4, double d9) {
        Intrinsics.echo(name, "name");
        this.alpha = name;
        this.bravo = d4;
        this.charlie = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.alpha, aVar.alpha) && Double.compare(this.bravo, aVar.bravo) == 0 && Double.compare(this.charlie, aVar.charlie) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.alpha.hashCode() * 31;
        long doubleToLongBits = Double.doubleToLongBits(this.bravo);
        int i4 = (hashCode + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31;
        long doubleToLongBits2 = Double.doubleToLongBits(this.charlie);
        return i4 + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public final String toString() {
        return "UniformStore(name=" + this.alpha + ", latitude=" + this.bravo + ", longitude=" + this.charlie + ")";
    }
}
