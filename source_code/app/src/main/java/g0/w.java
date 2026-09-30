package g0;

/* loaded from: classes3.dex */
public final class w extends ab {
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;

    public w(float f5, float f10, float f11, float f12) {
        super(1);
        this.charlie = f5;
        this.delta = f10;
        this.echo = f11;
        this.foxtrot = f12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (Float.compare(this.charlie, wVar.charlie) == 0 && Float.compare(this.delta, wVar.delta) == 0 && Float.compare(this.echo, wVar.echo) == 0 && Float.compare(this.foxtrot, wVar.foxtrot) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.foxtrot) + ao.ad.sierra(this.echo, ao.ad.sierra(this.delta, Float.floatToIntBits(this.charlie) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RelativeQuadTo(dx1=");
        sb2.append(this.charlie);
        sb2.append(", dy1=");
        sb2.append(this.delta);
        sb2.append(", dx2=");
        sb2.append(this.echo);
        sb2.append(", dy2=");
        return ao.ad.azure(sb2, this.foxtrot, ')');
    }
}
