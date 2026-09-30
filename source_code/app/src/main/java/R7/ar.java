package R7;

import java.util.List;

/* loaded from: classes2.dex */
public final class ar extends c0 {
    public final List alpha;
    public final at bravo;
    public final P charlie;
    public final au delta;
    public final List echo;

    public ar(List list, at atVar, P p4, au auVar, List list2) {
        this.alpha = list;
        this.bravo = atVar;
        this.charlie = p4;
        this.delta = auVar;
        this.echo = list2;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof c0) {
                c0 c0Var = (c0) obj;
                List list = this.alpha;
                if (list == null) {
                    if (((ar) c0Var).alpha != null) {
                        return false;
                    }
                } else if (!list.equals(((ar) c0Var).alpha)) {
                    return false;
                }
                at atVar = this.bravo;
                if (atVar == null) {
                    if (((ar) c0Var).bravo != null) {
                        return false;
                    }
                } else if (!atVar.equals(((ar) c0Var).bravo)) {
                    return false;
                }
                P p4 = this.charlie;
                if (p4 == null) {
                    if (((ar) c0Var).charlie != null) {
                        return false;
                    }
                } else if (!p4.equals(((ar) c0Var).charlie)) {
                    return false;
                }
                ar arVar = (ar) c0Var;
                if (this.delta.equals(arVar.delta) && this.echo.equals(arVar.echo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int i4 = 0;
        List list = this.alpha;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (hashCode ^ 1000003) * 1000003;
        at atVar = this.bravo;
        if (atVar == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = atVar.hashCode();
        }
        int i10 = (i5 ^ hashCode2) * 1000003;
        P p4 = this.charlie;
        if (p4 != null) {
            i4 = p4.hashCode();
        }
        return ((((i4 ^ i10) * 1000003) ^ this.delta.hashCode()) * 1000003) ^ this.echo.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.alpha + ", exception=" + this.bravo + ", appExitInfo=" + this.charlie + ", signal=" + this.delta + ", binaries=" + this.echo + "}";
    }
}
