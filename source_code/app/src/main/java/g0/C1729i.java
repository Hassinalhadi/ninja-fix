package g0;

/* renamed from: g0.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1729i extends ab {
    public final float charlie;
    public final float delta;
    public final float echo;
    public final boolean foxtrot;
    public final boolean golf;
    public final float hotel;
    public final float india;

    public C1729i(float f5, float f10, float f11, boolean z2, boolean z10, float f12, float f13) {
        super(3);
        this.charlie = f5;
        this.delta = f10;
        this.echo = f11;
        this.foxtrot = z2;
        this.golf = z10;
        this.hotel = f12;
        this.india = f13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1729i)) {
            return false;
        }
        C1729i c1729i = (C1729i) obj;
        if (Float.compare(this.charlie, c1729i.charlie) == 0 && Float.compare(this.delta, c1729i.delta) == 0 && Float.compare(this.echo, c1729i.echo) == 0 && this.foxtrot == c1729i.foxtrot && this.golf == c1729i.golf && Float.compare(this.hotel, c1729i.hotel) == 0 && Float.compare(this.india, c1729i.india) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i4;
        int sierra = ao.ad.sierra(this.echo, ao.ad.sierra(this.delta, Float.floatToIntBits(this.charlie) * 31, 31), 31);
        int i5 = 1237;
        if (this.foxtrot) {
            i4 = 1231;
        } else {
            i4 = 1237;
        }
        int i10 = (sierra + i4) * 31;
        if (this.golf) {
            i5 = 1231;
        }
        return Float.floatToIntBits(this.india) + ao.ad.sierra(this.hotel, (i10 + i5) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ArcTo(horizontalEllipseRadius=");
        sb2.append(this.charlie);
        sb2.append(", verticalEllipseRadius=");
        sb2.append(this.delta);
        sb2.append(", theta=");
        sb2.append(this.echo);
        sb2.append(", isMoreThanHalf=");
        sb2.append(this.foxtrot);
        sb2.append(", isPositiveArc=");
        sb2.append(this.golf);
        sb2.append(", arcStartX=");
        sb2.append(this.hotel);
        sb2.append(", arcStartY=");
        return ao.ad.azure(sb2, this.india, ')');
    }
}
