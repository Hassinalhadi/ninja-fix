package F;

/* loaded from: classes3.dex */
public final class W1 {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;

    public W1(float f5, float f10, float f11, float f12, float f13, float f14) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
        this.echo = f13;
        this.foxtrot = f14;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof W1)) {
                W1 w12 = (W1) obj;
                if (Q0.g.alpha(this.alpha, w12.alpha) && Q0.g.alpha(this.bravo, w12.bravo) && Q0.g.alpha(this.charlie, w12.charlie) && Q0.g.alpha(this.delta, w12.delta) && Q0.g.alpha(this.foxtrot, w12.foxtrot)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.foxtrot) + ao.ad.sierra(this.delta, ao.ad.sierra(this.charlie, ao.ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31), 31);
    }
}
