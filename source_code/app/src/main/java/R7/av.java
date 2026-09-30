package R7;

import java.util.List;

/* loaded from: classes2.dex */
public final class av extends b0 {
    public final String alpha;
    public final int bravo;
    public final List charlie;

    public av(List list, int i4, String str) {
        this.alpha = str;
        this.bravo = i4;
        this.charlie = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b0) {
            b0 b0Var = (b0) obj;
            if (this.alpha.equals(((av) b0Var).alpha)) {
                av avVar = (av) b0Var;
                if (this.bravo == avVar.bravo && this.charlie.equals(avVar.charlie)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo) * 1000003) ^ this.charlie.hashCode();
    }

    public final String toString() {
        return "Thread{name=" + this.alpha + ", importance=" + this.bravo + ", frames=" + this.charlie + "}";
    }
}
