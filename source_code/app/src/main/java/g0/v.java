package g0;

/* loaded from: classes3.dex */
public final class v extends ab {
    public final float charlie;
    public final float delta;

    public v(float f5, float f10) {
        super(3);
        this.charlie = f5;
        this.delta = f10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        if (Float.compare(this.charlie, vVar.charlie) == 0 && Float.compare(this.delta, vVar.delta) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.delta) + (Float.floatToIntBits(this.charlie) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeMoveTo(dx=");
        sb2.append(this.charlie);
        sb2.append(", dy=");
        return ao.ad.azure(sb2, this.delta, ')');
    }
}
