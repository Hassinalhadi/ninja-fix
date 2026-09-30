package Z;

import ao.ad;
import t6.G2;

/* loaded from: classes3.dex */
public final class c {
    public static final c echo = new c(0.0f, 0.0f, 0.0f, 0.0f);
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;

    public c(float f5, float f10, float f11, float f12) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
    }

    public final long alpha() {
        float f5 = this.charlie;
        float f10 = this.alpha;
        float f11 = ((f5 - f10) / 2.0f) + f10;
        float f12 = this.delta;
        float f13 = this.bravo;
        return (Float.floatToRawIntBits(((f12 - f13) / 2.0f) + f13) & 4294967295L) | (Float.floatToRawIntBits(f11) << 32);
    }

    public final long bravo() {
        float f5 = this.charlie - this.alpha;
        float f10 = this.delta - this.bravo;
        return (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32);
    }

    public final long charlie() {
        return (Float.floatToRawIntBits(this.alpha) << 32) | (Float.floatToRawIntBits(this.bravo) & 4294967295L);
    }

    public final c delta(c cVar) {
        return new c(Math.max(this.alpha, cVar.alpha), Math.max(this.bravo, cVar.bravo), Math.min(this.charlie, cVar.charlie), Math.min(this.delta, cVar.delta));
    }

    public final boolean echo() {
        boolean z2;
        boolean z10 = false;
        if (this.alpha >= this.charlie) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (this.bravo >= this.delta) {
            z10 = true;
        }
        return z2 | z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (Float.compare(this.alpha, cVar.alpha) == 0 && Float.compare(this.bravo, cVar.bravo) == 0 && Float.compare(this.charlie, cVar.charlie) == 0 && Float.compare(this.delta, cVar.delta) == 0) {
            return true;
        }
        return false;
    }

    public final boolean foxtrot(c cVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12 = false;
        if (this.alpha < cVar.charlie) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (cVar.alpha < this.charlie) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z13 = z2 & z10;
        if (this.bravo < cVar.delta) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean z14 = z13 & z11;
        if (cVar.bravo < this.delta) {
            z12 = true;
        }
        return z14 & z12;
    }

    public final c golf(float f5, float f10) {
        return new c(this.alpha + f5, this.bravo + f10, this.charlie + f5, this.delta + f10);
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.delta) + ad.sierra(this.charlie, ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31);
    }

    public final c hotel(long j5) {
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        return new c(Float.intBitsToFloat(i4) + this.alpha, Float.intBitsToFloat(i5) + this.bravo, Float.intBitsToFloat(i4) + this.charlie, Float.intBitsToFloat(i5) + this.delta);
    }

    public final String toString() {
        return "Rect.fromLTRB(" + G2.alpha(this.alpha) + ", " + G2.alpha(this.bravo) + ", " + G2.alpha(this.charlie) + ", " + G2.alpha(this.delta) + ')';
    }
}
