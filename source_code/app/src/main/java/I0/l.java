package I0;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {
    public static final l golf = new l(false, 0, true, 1, 1, K0.b.red);
    public final boolean alpha;
    public final int bravo;
    public final boolean charlie;
    public final int delta;
    public final int echo;
    public final K0.b foxtrot;

    public l(boolean z2, int i4, boolean z10, int i5, int i10, K0.b bVar) {
        this.alpha = z2;
        this.bravo = i4;
        this.charlie = z10;
        this.delta = i5;
        this.echo = i10;
        this.foxtrot = bVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.alpha != lVar.alpha) {
            return false;
        }
        if (this.bravo != lVar.bravo || this.charlie != lVar.charlie) {
            return false;
        }
        if (this.delta == lVar.delta) {
            if (this.echo == lVar.echo) {
                lVar.getClass();
                if (Intrinsics.areEqual(null, null) && Intrinsics.areEqual(this.foxtrot, lVar.foxtrot)) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int i5 = 1237;
        if (this.alpha) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = ((i4 * 31) + this.bravo) * 31;
        if (this.charlie) {
            i5 = 1231;
        }
        return this.foxtrot.alpha.hashCode() + ((((((i10 + i5) * 31) + this.delta) * 31) + this.echo) * 961);
    }

    public final String toString() {
        return "ImeOptions(singleLine=" + this.alpha + ", capitalization=" + ((Object) m.alpha(this.bravo)) + ", autoCorrect=" + this.charlie + ", keyboardType=" + ((Object) n.alpha(this.delta)) + ", imeAction=" + ((Object) k.alpha(this.echo)) + ", platformImeOptions=null, hintLocales=" + this.foxtrot + ')';
    }
}
