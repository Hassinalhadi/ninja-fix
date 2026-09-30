package Z;

import ao.ad;
import t6.C2;
import t6.G2;
import t6.L2;

/* loaded from: classes3.dex */
public final class d {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;
    public final long echo;
    public final long foxtrot;
    public final long golf;
    public final long hotel;

    static {
        L2.alpha(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public d(float f5, float f10, float f11, float f12, long j5, long j6, long j7, long j10) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
        this.echo = j5;
        this.foxtrot = j6;
        this.golf = j7;
        this.hotel = j10;
    }

    public final float alpha() {
        return this.delta - this.bravo;
    }

    public final float bravo() {
        return this.charlie - this.alpha;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                if (Float.compare(this.alpha, dVar.alpha) != 0 || Float.compare(this.bravo, dVar.bravo) != 0 || Float.compare(this.charlie, dVar.charlie) != 0 || Float.compare(this.delta, dVar.delta) != 0 || !C2.alpha(this.echo, dVar.echo) || !C2.alpha(this.foxtrot, dVar.foxtrot) || !C2.alpha(this.golf, dVar.golf) || !C2.alpha(this.hotel, dVar.hotel)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int sierra = ad.sierra(this.delta, ad.sierra(this.charlie, ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31), 31);
        long j5 = this.echo;
        long j6 = this.foxtrot;
        int i4 = (((int) (j6 ^ (j6 >>> 32))) + ((((int) (j5 ^ (j5 >>> 32))) + sierra) * 31)) * 31;
        long j7 = this.golf;
        int i5 = (((int) (j7 ^ (j7 >>> 32))) + i4) * 31;
        long j10 = this.hotel;
        return ((int) (j10 ^ (j10 >>> 32))) + i5;
    }

    public final String toString() {
        String str = G2.alpha(this.alpha) + ", " + G2.alpha(this.bravo) + ", " + G2.alpha(this.charlie) + ", " + G2.alpha(this.delta);
        long j5 = this.echo;
        long j6 = this.foxtrot;
        boolean alpha = C2.alpha(j5, j6);
        long j7 = this.golf;
        long j10 = this.hotel;
        if (alpha && C2.alpha(j6, j7) && C2.alpha(j7, j10)) {
            int i4 = (int) (j5 >> 32);
            int i5 = (int) (j5 & 4294967295L);
            if (Float.intBitsToFloat(i4) == Float.intBitsToFloat(i5)) {
                StringBuilder victor = Q0.c.victor("RoundRect(rect=", str, ", radius=");
                victor.append(G2.alpha(Float.intBitsToFloat(i4)));
                victor.append(')');
                return victor.toString();
            }
            StringBuilder victor2 = Q0.c.victor("RoundRect(rect=", str, ", x=");
            victor2.append(G2.alpha(Float.intBitsToFloat(i4)));
            victor2.append(", y=");
            victor2.append(G2.alpha(Float.intBitsToFloat(i5)));
            victor2.append(')');
            return victor2.toString();
        }
        StringBuilder victor3 = Q0.c.victor("RoundRect(rect=", str, ", topLeft=");
        victor3.append((Object) C2.charlie(j5));
        victor3.append(", topRight=");
        victor3.append((Object) C2.charlie(j6));
        victor3.append(", bottomRight=");
        victor3.append((Object) C2.charlie(j7));
        victor3.append(", bottomLeft=");
        victor3.append((Object) C2.charlie(j10));
        victor3.append(')');
        return victor3.toString();
    }
}
