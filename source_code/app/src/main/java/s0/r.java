package s0;

import p0.AbstractC2264a;

/* loaded from: classes3.dex */
public final class r {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;

    public r(float f5, float f10, float f11, float f12) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
        if (f5 < 0.0f) {
            AbstractC2264a.alpha("Left must be non-negative");
        }
        if (f10 < 0.0f) {
            AbstractC2264a.alpha("Top must be non-negative");
        }
        if (f11 < 0.0f) {
            AbstractC2264a.alpha("Right must be non-negative");
        }
        if (f12 >= 0.0f) {
            return;
        }
        AbstractC2264a.alpha("Bottom must be non-negative");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r) {
            r rVar = (r) obj;
            if (Q0.g.alpha(this.alpha, rVar.alpha) && Q0.g.alpha(this.bravo, rVar.bravo) && Q0.g.alpha(this.charlie, rVar.charlie) && Q0.g.alpha(this.delta, rVar.delta)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((Float.floatToIntBits(this.delta) + ao.ad.sierra(this.charlie, ao.ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31)) * 31) + 1231;
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) Q0.g.bravo(this.alpha)) + ", top=" + ((Object) Q0.g.bravo(this.bravo)) + ", end=" + ((Object) Q0.g.bravo(this.charlie)) + ", bottom=" + ((Object) Q0.g.bravo(this.delta)) + ", isLayoutDirectionAware=true)";
    }
}
