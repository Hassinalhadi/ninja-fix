package Ne;

import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;

/* loaded from: classes2.dex */
public final class a {
    public final c alpha;
    public final f bravo;

    static {
        c.juliet(h.foxtrot);
    }

    public a(c packageName, f fVar) {
        Intrinsics.echo(packageName, "packageName");
        this.alpha = packageName;
        this.bravo = fVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof a) {
                a aVar = (a) obj;
                if (!Intrinsics.areEqual(this.alpha, aVar.alpha) || !Intrinsics.areEqual(null, null) || !Intrinsics.areEqual(this.bravo, aVar.bravo) || !Intrinsics.areEqual(null, null)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.bravo.hashCode() + (this.alpha.hashCode() * 961)) * 31;
    }

    public final String toString() {
        String str = r.november(this.alpha.bravo(), '.', '/') + "/" + this.bravo;
        Intrinsics.delta(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
