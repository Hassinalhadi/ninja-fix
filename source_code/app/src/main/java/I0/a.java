package I0;

import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public final class a implements g {
    public final D0.g alpha;
    public final int bravo;

    public a(D0.g gVar, int i4) {
        this.alpha = gVar;
        this.bravo = i4;
    }

    @Override // I0.g
    public final void alpha(i iVar) {
        boolean z2;
        int length;
        int i4 = iVar.silver;
        int i5 = -1;
        if (i4 != -1) {
            z2 = true;
        } else {
            z2 = false;
        }
        D0.g gVar = this.alpha;
        if (z2) {
            iVar.delta(i4, iVar.teal, gVar.purple);
        } else {
            iVar.delta(iVar.purple, iVar.red, gVar.purple);
        }
        int i10 = iVar.purple;
        int i11 = iVar.red;
        if (i10 == i11) {
            i5 = i11;
        }
        int i12 = this.bravo;
        if (i12 > 0) {
            length = (i5 + i12) - 1;
        } else {
            length = (i5 + i12) - gVar.purple.length();
        }
        int delta = J4.delta(length, 0, ((F0.e) iVar.white).kilo());
        iVar.foxtrot(delta, delta);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Intrinsics.areEqual(this.alpha.purple, aVar.alpha.purple) && this.bravo == aVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.purple.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.alpha.purple);
        sb2.append("', newCursorPosition=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }

    public a(String str, int i4) {
        this(new D0.g(str), i4);
    }
}
