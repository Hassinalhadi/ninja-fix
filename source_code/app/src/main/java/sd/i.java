package sd;

import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class i {
    public final String alpha;
    public final List bravo;
    public final double charlie;

    public i(String value, List params) {
        Double d4;
        Object obj;
        String str;
        Double romeo;
        Intrinsics.echo(value, "value");
        Intrinsics.echo(params, "params");
        this.alpha = value;
        this.bravo = params;
        Iterator it = params.iterator();
        while (true) {
            d4 = null;
            if (it.hasNext()) {
                obj = it.next();
                if (Intrinsics.areEqual(((j) obj).alpha, "q")) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        j jVar = (j) obj;
        double d9 = 1.0d;
        if (jVar != null && (str = jVar.bravo) != null && (romeo = kotlin.text.r.romeo(str)) != null) {
            double doubleValue = romeo.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                d4 = romeo;
            }
            if (d4 != null) {
                d9 = d4.doubleValue();
            }
        }
        this.charlie = d9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (Intrinsics.areEqual(this.alpha, iVar.alpha) && Intrinsics.areEqual(this.bravo, iVar.bravo)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.bravo.hashCode() + (this.alpha.hashCode() * 31);
    }

    public final String toString() {
        return "HeaderValue(value=" + this.alpha + ", params=" + this.bravo + ')';
    }
}
