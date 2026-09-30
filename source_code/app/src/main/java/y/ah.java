package y;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class ah {
    public final n.al alpha;
    public final long bravo;
    public final ag charlie;
    public final boolean delta;

    public ah(n.al alVar, long j5, ag agVar, boolean z2) {
        this.alpha = alVar;
        this.bravo = j5;
        this.charlie = agVar;
        this.delta = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ah) {
                ah ahVar = (ah) obj;
                if (this.alpha != ahVar.alpha || !Z.b.bravo(this.bravo, ahVar.bravo) || this.charlie != ahVar.charlie || this.delta != ahVar.delta) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int hashCode = (this.charlie.hashCode() + ((Z.b.echo(this.bravo) + (this.alpha.hashCode() * 31)) * 31)) * 31;
        if (this.delta) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        return hashCode + i4;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionHandleInfo(handle=");
        sb2.append(this.alpha);
        sb2.append(", position=");
        sb2.append((Object) Z.b.india(this.bravo));
        sb2.append(", anchor=");
        sb2.append(this.charlie);
        sb2.append(", visible=");
        return P0.gray(sb2, this.delta, ')');
    }
}
