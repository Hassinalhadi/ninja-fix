package kotlin.reflect.jvm.internal.impl.types;

import gf.C1791f;

/* loaded from: classes2.dex */
public abstract class as {
    public abstract int alpha();

    public abstract y bravo();

    public abstract boolean charlie();

    public abstract as delta(C1791f c1791f);

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof as) {
                as asVar = (as) obj;
                if (charlie() != asVar.charlie() || alpha() != asVar.alpha() || !bravo().equals(asVar.bravo())) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int mike = av.q.mike(alpha());
        if (az.mike(bravo())) {
            return (mike * 31) + 19;
        }
        int i4 = mike * 31;
        if (charlie()) {
            hashCode = 17;
        } else {
            hashCode = bravo().hashCode();
        }
        return i4 + hashCode;
    }

    public final String toString() {
        if (charlie()) {
            return "*";
        }
        if (alpha() == 1) {
            return bravo().toString();
        }
        return com.google.android.material.datepicker.j.whiskey(alpha()) + " " + bravo();
    }
}
