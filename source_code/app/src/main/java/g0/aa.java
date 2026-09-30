package g0;

/* loaded from: classes3.dex */
public final class aa extends ab {
    public final float charlie;

    public aa(float f5) {
        super(3);
        this.charlie = f5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aa) && Float.compare(this.charlie, ((aa) obj).charlie) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.charlie);
    }

    public final String toString() {
        return ao.ad.azure(new StringBuilder("VerticalTo(y="), this.charlie, ')');
    }
}
