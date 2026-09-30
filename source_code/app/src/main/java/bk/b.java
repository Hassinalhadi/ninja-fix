package bk;

import bj.k;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class b {
    public final k alpha;
    public final k bravo;
    public final ArrayList charlie;

    public b(k kVar, k kVar2, ArrayList arrayList) {
        if (kVar != null) {
            this.alpha = kVar;
            if (kVar2 != null) {
                this.bravo = kVar2;
                this.charlie = arrayList;
                return;
            }
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        throw new NullPointerException("Null primarySurfaceEdge");
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.alpha.equals(bVar.alpha) && this.bravo.equals(bVar.bravo) && this.charlie.equals(bVar.charlie)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.alpha.hashCode() ^ 1000003) * 1000003) ^ this.bravo.hashCode()) * 1000003) ^ this.charlie.hashCode();
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.alpha + ", secondarySurfaceEdge=" + this.bravo + ", outConfigs=" + this.charlie + "}";
    }
}
