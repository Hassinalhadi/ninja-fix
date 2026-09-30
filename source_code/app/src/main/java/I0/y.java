package I0;

import kotlin.jvm.internal.Intrinsics;
import s6.J4;

/* loaded from: classes3.dex */
public final class y implements g {
    public final D0.g alpha;
    public final int bravo;

    public y(String str, int i4) {
        this.alpha = new D0.g(str);
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
            String str = gVar.purple;
            if (str.length() > 0) {
                iVar.echo(i4, str.length() + i4);
            }
        } else {
            int i10 = iVar.purple;
            iVar.delta(i10, iVar.red, gVar.purple);
            String str2 = gVar.purple;
            if (str2.length() > 0) {
                iVar.echo(i10, str2.length() + i10);
            }
        }
        int i11 = iVar.purple;
        int i12 = iVar.red;
        if (i11 == i12) {
            i5 = i12;
        }
        int i13 = this.bravo;
        if (i13 > 0) {
            length = (i5 + i13) - 1;
        } else {
            length = (i5 + i13) - gVar.purple.length();
        }
        int delta = J4.delta(length, 0, ((F0.e) iVar.white).kilo());
        iVar.foxtrot(delta, delta);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (Intrinsics.areEqual(this.alpha.purple, yVar.alpha.purple) && this.bravo == yVar.bravo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.alpha.purple.hashCode() * 31) + this.bravo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.alpha.purple);
        sb2.append("', newCursorPosition=");
        return Q0.c.quebec(sb2, this.bravo, ')');
    }
}
