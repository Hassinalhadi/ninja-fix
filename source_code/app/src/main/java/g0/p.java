package g0;

/* loaded from: classes3.dex */
public final class p extends ab {
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;

    public p(float f5, float f10, float f11, float f12) {
        super(2);
        this.charlie = f5;
        this.delta = f10;
        this.echo = f11;
        this.foxtrot = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        if (Float.compare(this.charlie, pVar.charlie) == 0 && Float.compare(this.delta, pVar.delta) == 0 && Float.compare(this.echo, pVar.echo) == 0 && Float.compare(this.foxtrot, pVar.foxtrot) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.foxtrot) + ao.ad.sierra(this.echo, ao.ad.sierra(this.delta, Float.floatToIntBits(this.charlie) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReflectiveCurveTo(x1=");
        sb2.append(this.charlie);
        sb2.append(", y1=");
        sb2.append(this.delta);
        sb2.append(", x2=");
        sb2.append(this.echo);
        sb2.append(", y2=");
        return ao.ad.azure(sb2, this.foxtrot, ')');
    }
}
