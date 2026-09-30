package g0;

/* renamed from: g0.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1731k extends ab {
    public final float charlie;
    public final float delta;
    public final float echo;
    public final float foxtrot;
    public final float golf;
    public final float hotel;

    public C1731k(float f5, float f10, float f11, float f12, float f13, float f14) {
        super(2);
        this.charlie = f5;
        this.delta = f10;
        this.echo = f11;
        this.foxtrot = f12;
        this.golf = f13;
        this.hotel = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1731k)) {
            return false;
        }
        C1731k c1731k = (C1731k) obj;
        if (Float.compare(this.charlie, c1731k.charlie) == 0 && Float.compare(this.delta, c1731k.delta) == 0 && Float.compare(this.echo, c1731k.echo) == 0 && Float.compare(this.foxtrot, c1731k.foxtrot) == 0 && Float.compare(this.golf, c1731k.golf) == 0 && Float.compare(this.hotel, c1731k.hotel) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.hotel) + ao.ad.sierra(this.golf, ao.ad.sierra(this.foxtrot, ao.ad.sierra(this.echo, ao.ad.sierra(this.delta, Float.floatToIntBits(this.charlie) * 31, 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CurveTo(x1=");
        sb2.append(this.charlie);
        sb2.append(", y1=");
        sb2.append(this.delta);
        sb2.append(", x2=");
        sb2.append(this.echo);
        sb2.append(", y2=");
        sb2.append(this.foxtrot);
        sb2.append(", x3=");
        sb2.append(this.golf);
        sb2.append(", y3=");
        return ao.ad.azure(sb2, this.hotel, ')');
    }
}
