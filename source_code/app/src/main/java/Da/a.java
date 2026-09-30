package Da;

import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final Pair alpha;
    public final Pair bravo;
    public final Pair charlie;
    public final Pair delta;

    public a(Pair pair, Pair pair2, Pair pair3, Pair pair4) {
        this.alpha = pair;
        this.bravo = pair2;
        this.charlie = pair3;
        this.delta = pair4;
    }

    public static a alpha(a aVar, Pair pair, Pair pair2, Pair pair3, Pair pair4, int i4) {
        if ((i4 & 1) != 0) {
            pair = aVar.alpha;
        }
        if ((i4 & 2) != 0) {
            pair2 = aVar.bravo;
        }
        if ((i4 & 4) != 0) {
            pair3 = aVar.charlie;
        }
        if ((i4 & 8) != 0) {
            pair4 = aVar.delta;
        }
        aVar.getClass();
        return new a(pair, pair2, pair3, pair4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.alpha, aVar.alpha) && Intrinsics.areEqual(this.bravo, aVar.bravo) && Intrinsics.areEqual(this.charlie, aVar.charlie) && Intrinsics.areEqual(this.delta, aVar.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4 = 0;
        Pair pair = this.alpha;
        if (pair == null) {
            hashCode = 0;
        } else {
            hashCode = pair.hashCode();
        }
        int i5 = hashCode * 31;
        Pair pair2 = this.bravo;
        if (pair2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = pair2.hashCode();
        }
        int i10 = (i5 + hashCode2) * 31;
        Pair pair3 = this.charlie;
        if (pair3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = pair3.hashCode();
        }
        int i11 = (i10 + hashCode3) * 31;
        Pair pair4 = this.delta;
        if (pair4 != null) {
            i4 = pair4.hashCode();
        }
        return i11 + i4;
    }

    public final String toString() {
        return "DocumentState(profilePic=" + this.alpha + ", iqamaPic=" + this.bravo + ", driverLicenses=" + this.charlie + ", carLicense=" + this.delta + ")";
    }
}
