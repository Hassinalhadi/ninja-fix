package x;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: x.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3276g {
    public final D0.g alpha;
    public D0.g bravo;
    public boolean charlie = false;
    public C3273d delta = null;

    public C3276g(D0.g gVar, D0.g gVar2) {
        this.alpha = gVar;
        this.bravo = gVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3276g)) {
            return false;
        }
        C3276g c3276g = (C3276g) obj;
        if (Intrinsics.areEqual(this.alpha, c3276g.alpha) && Intrinsics.areEqual(this.bravo, c3276g.bravo) && this.charlie == c3276g.charlie && Intrinsics.areEqual(this.delta, c3276g.delta)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode;
        int hashCode2 = (this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31;
        if (this.charlie) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i5 = (hashCode2 + i4) * 31;
        C3273d c3273d = this.delta;
        if (c3273d == null) {
            hashCode = 0;
        } else {
            hashCode = c3273d.hashCode();
        }
        return i5 + hashCode;
    }

    public final String toString() {
        return "TextSubstitutionValue(original=" + ((Object) this.alpha) + ", substitution=" + ((Object) this.bravo) + ", isShowingSubstitution=" + this.charlie + ", layoutCache=" + this.delta + ')';
    }
}
