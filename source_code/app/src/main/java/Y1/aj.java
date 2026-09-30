package Y1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aj {
    public final boolean alpha;
    public final boolean bravo;
    public final int charlie;
    public final boolean delta;
    public final boolean echo;
    public final int foxtrot;
    public final int golf;
    public final int hotel;
    public final int india;

    public aj(boolean z2, boolean z10, int i4, boolean z11, boolean z12, int i5, int i10, int i11, int i12) {
        this.alpha = z2;
        this.bravo = z10;
        this.charlie = i4;
        this.delta = z11;
        this.echo = z12;
        this.foxtrot = i5;
        this.golf = i10;
        this.hotel = i11;
        this.india = i12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof aj)) {
                aj ajVar = (aj) obj;
                if (this.alpha == ajVar.alpha && this.bravo == ajVar.bravo && this.charlie == ajVar.charlie && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && Intrinsics.areEqual(null, null) && this.delta == ajVar.delta && this.echo == ajVar.echo && this.foxtrot == ajVar.foxtrot && this.golf == ajVar.golf && this.hotel == ajVar.hotel && this.india == ajVar.india) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((this.alpha ? 1 : 0) * 31) + (this.bravo ? 1 : 0)) * 31) + this.charlie) * 923521) + (this.delta ? 1 : 0)) * 31) + (this.echo ? 1 : 0)) * 31) + this.foxtrot) * 31) + this.golf) * 31) + this.hotel) * 31) + this.india;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aj.class.getSimpleName());
        sb2.append("(");
        if (this.alpha) {
            sb2.append("launchSingleTop ");
        }
        if (this.bravo) {
            sb2.append("restoreState ");
        }
        int i4 = this.india;
        int i5 = this.hotel;
        int i10 = this.golf;
        int i11 = this.foxtrot;
        if (i11 != -1 || i10 != -1 || i5 != -1 || i4 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(i5));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(i4));
            sb2.append(")");
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
