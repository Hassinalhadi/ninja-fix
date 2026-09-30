package I7;

import androidx.appcompat.widget.P0;
import ao.ad;
import s6.F5;

/* loaded from: classes2.dex */
public final class j {
    public final p alpha;
    public final int bravo;
    public final int charlie;

    public j(int i4, int i5, Class cls) {
        this(p.alpha(cls), i4, i5);
    }

    public static j alpha(Class cls) {
        return new j(0, 1, cls);
    }

    public static j bravo(p pVar) {
        return new j(pVar, 1, 0);
    }

    public static j charlie(Class cls) {
        return new j(1, 0, cls);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof j) {
            j jVar = (j) obj;
            if (this.alpha.equals(jVar.alpha) && this.bravo == jVar.bravo && this.charlie == jVar.charlie) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo) * 1000003) ^ this.charlie;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.alpha);
        sb2.append(", type=");
        int i4 = this.bravo;
        if (i4 == 1) {
            str = "required";
        } else if (i4 == 0) {
            str = "optional";
        } else {
            str = "set";
        }
        sb2.append(str);
        sb2.append(", injection=");
        int i5 = this.charlie;
        if (i5 != 0) {
            if (i5 != 1) {
                if (i5 == 2) {
                    str2 = "deferred";
                } else {
                    throw new AssertionError(ad.zulu(i5, "Unsupported injection: "));
                }
            } else {
                str2 = "provider";
            }
        } else {
            str2 = "direct";
        }
        return P0.gold(sb2, str2, "}");
    }

    public j(p pVar, int i4, int i5) {
        F5.bravo(pVar, "Null dependency anInterface.");
        this.alpha = pVar;
        this.bravo = i4;
        this.charlie = i5;
    }
}
