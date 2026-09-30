package Q0;

import ao.ad;

/* loaded from: classes3.dex */
public final class e implements d {
    public final float alpha;
    public final float purple;

    public e(float f5, float f10) {
        this.alpha = f5;
        this.purple = f10;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.alpha;
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return c.hotel(this, gold(f5));
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        if (Float.compare(this.alpha, eVar.alpha) == 0 && Float.compare(this.purple, eVar.purple) == 0) {
            return true;
        }
        return false;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.purple) + (Float.floatToIntBits(this.alpha) * 31);
    }

    @Override // Q0.d
    public final float indigo() {
        return this.purple;
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return alpha() * f5;
    }

    @Override // Q0.d
    public final /* synthetic */ long mike(long j5) {
        return c.echo(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ int ochre(float f5) {
        return c.bravo(this, f5);
    }

    @Override // Q0.d
    public final /* synthetic */ float quebec(long j5) {
        return c.delta(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ long red(long j5) {
        return c.golf(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ float teal(long j5) {
        return c.foxtrot(j5, this);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DensityImpl(density=");
        sb2.append(this.alpha);
        sb2.append(", fontScale=");
        return ad.azure(sb2, this.purple, ')');
    }
}
