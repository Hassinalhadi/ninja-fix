package Wf;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes2.dex */
public final class r {
    public final n alpha;
    public final p bravo;
    public final aj charlie;
    public final d delta;

    public r(n nVar, p pVar, aj ajVar, d dVar) {
        this.alpha = nVar;
        this.bravo = pVar;
        this.charlie = ajVar;
        this.delta = dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || r.class != obj.getClass()) {
            return false;
        }
        r rVar = (r) obj;
        if (Intrinsics.areEqual(this.alpha, rVar.alpha) && Intrinsics.areEqual(this.bravo, rVar.bravo) && this.charlie == rVar.charlie && this.delta == rVar.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.delta.hashCode() + ((this.charlie.hashCode() + AbstractC2327c.sierra(this.alpha.alpha.hashCode() * 31, 31, this.bravo.alpha)) * 31);
    }
}
