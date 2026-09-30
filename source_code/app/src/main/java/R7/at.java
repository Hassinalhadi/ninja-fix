package R7;

import androidx.appcompat.widget.P0;
import java.util.List;

/* loaded from: classes2.dex */
public final class at extends Y {
    public final String alpha;
    public final String bravo;
    public final List charlie;
    public final Y delta;
    public final int echo;

    public at(String str, String str2, List list, Y y10, int i4) {
        this.alpha = str;
        this.bravo = str2;
        this.charlie = list;
        this.delta = y10;
        this.echo = i4;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof Y) {
            Y y10 = (Y) obj;
            if (this.alpha.equals(((at) y10).alpha) && ((str = this.bravo) != null ? str.equals(((at) y10).bravo) : ((at) y10).bravo == null)) {
                at atVar = (at) y10;
                if (this.charlie.equals(atVar.charlie)) {
                    Y y11 = atVar.delta;
                    Y y12 = this.delta;
                    if (y12 != null ? y12.equals(y11) : y11 == null) {
                        if (this.echo == atVar.echo) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = (this.alpha.hashCode() ^ 1000003) * 1000003;
        int i4 = 0;
        String str = this.bravo;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ hashCode) * 1000003) ^ this.charlie.hashCode()) * 1000003;
        Y y10 = this.delta;
        if (y10 != null) {
            i4 = y10.hashCode();
        }
        return ((hashCode3 ^ i4) * 1000003) ^ this.echo;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Exception{type=");
        sb2.append(this.alpha);
        sb2.append(", reason=");
        sb2.append(this.bravo);
        sb2.append(", frames=");
        sb2.append(this.charlie);
        sb2.append(", causedBy=");
        sb2.append(this.delta);
        sb2.append(", overflowCount=");
        return P0.cyan(sb2, this.echo, "}");
    }
}
