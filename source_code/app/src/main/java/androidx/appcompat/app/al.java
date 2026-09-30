package androidx.appcompat.app;

/* loaded from: classes3.dex */
public final class al {
    public static al delta;
    public long alpha;
    public long bravo;
    public int charlie;

    public void alpha(long j5, double d4, double d9) {
        double d10 = (0.01720197f * (((float) (j5 - 946728000000L)) / 8.64E7f)) + 6.24006f;
        double sin = (Math.sin(r3 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * r3) * 3.4906598739326E-4d) + (Math.sin(d10) * 0.03341960161924362d) + d10 + 1.796593063d + 3.141592653589793d;
        double sin2 = (Math.sin(2.0d * sin) * (-0.0069d)) + (Math.sin(d10) * 0.0053d) + ((float) Math.round((r2 - 9.0E-4f) - r6)) + 9.0E-4f + ((-d9) / 360.0d);
        double asin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(sin));
        double d11 = 0.01745329238474369d * d4;
        double sin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(asin) * Math.sin(d11))) / (Math.cos(asin) * Math.cos(d11));
        if (sin3 >= 1.0d) {
            this.charlie = 1;
            this.alpha = -1L;
            this.bravo = -1L;
        } else {
            if (sin3 <= -1.0d) {
                this.charlie = 0;
                this.alpha = -1L;
                this.bravo = -1L;
                return;
            }
            double acos = (float) (Math.acos(sin3) / 6.283185307179586d);
            this.alpha = Math.round((sin2 + acos) * 8.64E7d) + 946728000000L;
            long round = Math.round((sin2 - acos) * 8.64E7d) + 946728000000L;
            this.bravo = round;
            if (round < j5 && this.alpha > j5) {
                this.charlie = 0;
            } else {
                this.charlie = 1;
            }
        }
    }
}
