package Q0;

import ao.ad;
import kotlin.jvm.internal.Intrinsics;
import s6.AbstractC2636d7;

/* loaded from: classes3.dex */
public final class f implements d {
    public final float alpha;
    public final float purple;
    public final R0.a red;

    public f(float f5, float f10, R0.a aVar) {
        this.alpha = f5;
        this.purple = f10;
        this.red = aVar;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.alpha;
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return AbstractC2636d7.delta(this.red.alpha(gold(f5)), 4294967296L);
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (Float.compare(this.alpha, fVar.alpha) == 0 && Float.compare(this.purple, fVar.purple) == 0 && Intrinsics.areEqual(this.red, fVar.red)) {
            return true;
        }
        return false;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    public final int hashCode() {
        return this.red.hashCode() + ad.sierra(this.purple, Float.floatToIntBits(this.alpha) * 31, 31);
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
    public final float quebec(long j5) {
        if (q.alpha(p.bravo(j5), 4294967296L)) {
            return this.red.bravo(p.charlie(j5));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
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
        return "DensityWithConverter(density=" + this.alpha + ", fontScale=" + this.purple + ", converter=" + this.red + ')';
    }
}
