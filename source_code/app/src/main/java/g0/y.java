package g0;

/* loaded from: classes3.dex */
public final class y extends ab {
    public final float charlie;
    public final float delta;

    public y(float f5, float f10) {
        super(1);
        this.charlie = f5;
        this.delta = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (Float.compare(this.charlie, yVar.charlie) == 0 && Float.compare(this.delta, yVar.delta) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.delta) + (Float.floatToIntBits(this.charlie) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeReflectiveQuadTo(dx=");
        sb2.append(this.charlie);
        sb2.append(", dy=");
        return ao.ad.azure(sb2, this.delta, ')');
    }
}
