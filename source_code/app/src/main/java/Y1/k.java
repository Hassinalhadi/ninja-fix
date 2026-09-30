package Y1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class k {
    public final aq alpha;
    public final boolean bravo;
    public final boolean charlie;
    public final boolean delta;
    public final Object echo;

    public k(aq aqVar, boolean z2, Object obj, boolean z10, boolean z11) {
        boolean z12;
        if (!aqVar.alpha && z2) {
            throw new IllegalArgumentException((aqVar.bravo() + " does not allow nullable values").toString());
        }
        if (!z2 && z10 && obj == null) {
            throw new IllegalArgumentException(("Argument with type " + aqVar.bravo() + " has null value but is not nullable.").toString());
        }
        this.alpha = aqVar;
        this.bravo = z2;
        this.echo = obj;
        if (!z10 && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        this.charlie = z12;
        this.delta = z11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (this.bravo != kVar.bravo || this.charlie != kVar.charlie || !Intrinsics.areEqual(this.alpha, kVar.alpha)) {
                return false;
            }
            Object obj2 = kVar.echo;
            Object obj3 = this.echo;
            if (obj3 != null) {
                return Intrinsics.areEqual(obj3, obj2);
            }
            if (obj2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = ((((this.alpha.hashCode() * 31) + (this.bravo ? 1 : 0)) * 31) + (this.charlie ? 1 : 0)) * 31;
        Object obj = this.echo;
        if (obj != null) {
            i4 = obj.hashCode();
        } else {
            i4 = 0;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(kotlin.jvm.internal.u.alpha.bravo(k.class).kilo());
        sb2.append(" Type: " + this.alpha);
        sb2.append(" Nullable: " + this.bravo);
        if (this.charlie) {
            sb2.append(" DefaultValue: " + this.echo);
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
