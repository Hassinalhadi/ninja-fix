package g0;

/* loaded from: classes3.dex */
public final class q extends ab {
    public final float charlie;
    public final float delta;

    public q(float f5, float f10) {
        super(1);
        this.charlie = f5;
        this.delta = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        if (Float.compare(this.charlie, qVar.charlie) == 0 && Float.compare(this.delta, qVar.delta) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.delta) + (Float.floatToIntBits(this.charlie) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveQuadTo(x=");
        sb2.append(this.charlie);
        sb2.append(", y=");
        return ao.ad.azure(sb2, this.delta, ')');
    }
}
