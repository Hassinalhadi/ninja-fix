package eb;

import ao.ad;
import av.q;

/* loaded from: classes2.dex */
public final class h {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;

    public h(float f5, float f10, float f11, float f12) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof h) {
                h hVar = (h) obj;
                if (!Q0.g.alpha(this.alpha, hVar.alpha) || !Q0.g.alpha(this.bravo, hVar.bravo) || !Q0.g.alpha(this.charlie, hVar.charlie) || !Q0.g.alpha(this.delta, hVar.delta)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.delta) + ad.sierra(this.charlie, ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31);
    }

    public final String toString() {
        String bravo = Q0.g.bravo(this.alpha);
        String bravo2 = Q0.g.bravo(this.bravo);
        return com.google.android.material.datepicker.j.lima(q.india("PillsSpec(size=", bravo, ", radius=", bravo2, ", pillWidth="), Q0.g.bravo(this.charlie), ", pillHeight=", Q0.g.bravo(this.delta), ")");
    }
}
