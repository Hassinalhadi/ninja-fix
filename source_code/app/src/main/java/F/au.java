package F;

/* loaded from: classes3.dex */
public final class au {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final float echo;

    public au(float f5, float f10, float f11, float f12, float f13, float f14) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
        this.echo = f14;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && (obj instanceof au)) {
                au auVar = (au) obj;
                if (Q0.g.alpha(this.alpha, auVar.alpha) && Q0.g.alpha(this.bravo, auVar.bravo) && Q0.g.alpha(this.charlie, auVar.charlie) && Q0.g.alpha(this.delta, auVar.delta) && Q0.g.alpha(this.echo, auVar.echo)) {
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
