package R7;

import androidx.appcompat.widget.P0;
import java.util.List;

/* loaded from: classes2.dex */
public final class aq extends e0 {
    public final ar alpha;
    public final List bravo;
    public final List charlie;
    public final Boolean delta;
    public final d0 echo;
    public final List foxtrot;
    public final int golf;

    public aq(ar arVar, List list, List list2, Boolean bool, d0 d0Var, List list3, int i4) {
        this.alpha = arVar;
        this.bravo = list;
        this.charlie = list2;
        this.delta = bool;
        this.echo = d0Var;
        this.foxtrot = list3;
        this.golf = i4;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof e0) {
                aq aqVar = (aq) ((e0) obj);
                if (this.alpha.equals(aqVar.alpha)) {
                    List list = this.bravo;
                    if (list == null) {
                        if (aqVar.bravo != null) {
                            return false;
                        }
                    } else if (!list.equals(aqVar.bravo)) {
                        return false;
                    }
                    List list2 = this.charlie;
                    if (list2 == null) {
                        if (aqVar.charlie != null) {
                            return false;
                        }
                    } else if (!list2.equals(aqVar.charlie)) {
                        return false;
                    }
                    Boolean bool = this.delta;
                    if (bool == null) {
                        if (aqVar.delta != null) {
                            return false;
                        }
                    } else if (!bool.equals(aqVar.delta)) {
                        return false;
                    }
                    d0 d0Var = this.echo;
                    if (d0Var == null) {
                        if (aqVar.echo != null) {
                            return false;
                        }
                    } else if (!d0Var.equals(aqVar.echo)) {
                        return false;
                    }
                    List list3 = this.foxtrot;
                    if (list3 == null) {
                        if (aqVar.foxtrot != null) {
                            return false;
                        }
                    } else if (!list3.equals(aqVar.foxtrot)) {
                        return false;
                    }
                    if (this.golf == aqVar.golf) {
                        return true;
                    }
                    return false;
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
        int hashCode3;
        int hashCode4;
        int hashCode5 = (this.alpha.hashCode() ^ 1000003) * 1000003;
        int i4 = 0;
        List list = this.bravo;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int i5 = (hashCode5 ^ hashCode) * 1000003;
        List list2 = this.charlie;
        if (list2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = list2.hashCode();
        }
        int i10 = (i5 ^ hashCode2) * 1000003;
        Boolean bool = this.delta;
        if (bool == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = bool.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        d0 d0Var = this.echo;
        if (d0Var == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = d0Var.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        List list3 = this.foxtrot;
        if (list3 != null) {
            i4 = list3.hashCode();
        }
        return ((i12 ^ i4) * 1000003) ^ this.golf;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Application{execution=");
        sb2.append(this.alpha);
        sb2.append(", customAttributes=");
        sb2.append(this.bravo);
        sb2.append(", internalKeys=");
        sb2.append(this.charlie);
        sb2.append(", background=");
        sb2.append(this.delta);
        sb2.append(", currentProcessDetails=");
        sb2.append(this.echo);
        sb2.append(", appProcessDetails=");
        sb2.append(this.foxtrot);
        sb2.append(", uiOrientation=");
        return P0.cyan(sb2, this.golf, "}");
    }
}
