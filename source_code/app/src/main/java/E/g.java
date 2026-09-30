package E;

import ao.ad;

/* loaded from: classes3.dex */
public final class g {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;

    public g(float f5, float f10, float f11, float f12) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.alpha == gVar.alpha && this.bravo == gVar.bravo && this.charlie == gVar.charlie && this.delta == gVar.delta) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.delta) + ad.sierra(this.charlie, ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RippleAlpha(draggedAlpha=");
        sb2.append(this.alpha);
        sb2.append(", focusedAlpha=");
        sb2.append(this.bravo);
        sb2.append(", hoveredAlpha=");
        sb2.append(this.charlie);
        sb2.append(", pressedAlpha=");
        return ad.azure(sb2, this.delta, ')');
    }
}
