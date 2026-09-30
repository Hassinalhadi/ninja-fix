package Ed;

import ge.InterfaceC1772d;
import ge.w;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class a {
    public final InterfaceC1772d alpha;
    public final w bravo;

    public a(InterfaceC1772d type, w wVar) {
        Intrinsics.echo(type, "type");
        this.alpha = type;
        this.bravo = wVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        w wVar = this.bravo;
        if (wVar == null) {
            a aVar = (a) obj;
            if (aVar.bravo == null) {
                return Intrinsics.areEqual(this.alpha, aVar.alpha);
            }
        }
        return Intrinsics.areEqual(wVar, ((a) obj).bravo);
    }

    public final int hashCode() {
        w wVar = this.bravo;
        if (wVar != null) {
            return wVar.hashCode();
        }
        return this.alpha.hashCode();
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypeInfo(");
        Object obj = this.bravo;
        if (obj == null) {
            obj = this.alpha;
        }
        sb2.append(obj);
        sb2.append(')');
        return sb2.toString();
    }
}
