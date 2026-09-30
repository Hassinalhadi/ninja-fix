package I0;

import D0.am;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aa {
    public final D0.g alpha;
    public final long bravo;
    public final am charlie;

    public aa(D0.g gVar, long j5, am amVar) {
        this.alpha = gVar;
        this.bravo = D0.ae.charlie(gVar.purple.length(), j5);
        this.charlie = amVar != null ? new am(D0.ae.charlie(gVar.purple.length(), amVar.alpha)) : null;
    }

    public static aa alpha(aa aaVar, D0.g gVar, long j5, int i4) {
        am amVar;
        if ((i4 & 1) != 0) {
            gVar = aaVar.alpha;
        }
        if ((i4 & 2) != 0) {
            j5 = aaVar.bravo;
        }
        if ((i4 & 4) != 0) {
            amVar = aaVar.charlie;
        } else {
            amVar = null;
        }
        aaVar.getClass();
        return new aa(gVar, j5, amVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aa)) {
            return false;
        }
        aa aaVar = (aa) obj;
        if (am.bravo(this.bravo, aaVar.bravo) && Intrinsics.areEqual(this.charlie, aaVar.charlie) && Intrinsics.areEqual(this.alpha, aaVar.alpha)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int hashCode = this.alpha.hashCode() * 31;
        int i5 = am.charlie;
        long j5 = this.bravo;
        int i10 = (((int) (j5 ^ (j5 >>> 32))) + hashCode) * 31;
        am amVar = this.charlie;
        if (amVar != null) {
            long j6 = amVar.alpha;
            i4 = (int) ((j6 >>> 32) ^ j6);
        } else {
            i4 = 0;
        }
        return i10 + i4;
    }

    public final String toString() {
        return "TextFieldValue(text='" + ((Object) this.alpha) + "', selection=" + ((Object) am.hotel(this.bravo)) + ", composition=" + this.charlie + ')';
    }

    public aa(int i4, long j5, String str) {
        this(new D0.g((i4 & 1) != 0 ? "" : str), (i4 & 2) != 0 ? am.bravo : j5, (am) null);
    }
}
