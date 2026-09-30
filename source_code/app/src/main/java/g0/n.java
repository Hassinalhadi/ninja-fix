package g0;

/* loaded from: classes3.dex */
public final class n extends ab {
    public final float charlie;
    public final float delta;

    public n(float f5, float f10) {
        super(3);
        this.charlie = f5;
        this.delta = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (Float.compare(this.charlie, nVar.charlie) == 0 && Float.compare(this.delta, nVar.delta) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.delta) + (Float.floatToIntBits(this.charlie) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MoveTo(x=");
        sb2.append(this.charlie);
        sb2.append(", y=");
        return ao.ad.azure(sb2, this.delta, ')');
    }
}
