package F;

/* loaded from: classes3.dex */
public final class ap {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;

    public ap(float f5, float f10, float f11, float f12, float f13) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
        this.echo = f13;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof ap)) {
                ap apVar = (ap) obj;
                if (Q0.g.alpha(this.alpha, apVar.alpha) && Q0.g.alpha(this.bravo, apVar.bravo) && Q0.g.alpha(this.charlie, apVar.charlie) && Q0.g.alpha(this.delta, apVar.delta) && Q0.g.alpha(this.echo, apVar.echo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.echo) + ao.ad.sierra(this.delta, ao.ad.sierra(this.charlie, ao.ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31), 31);
    }
}
