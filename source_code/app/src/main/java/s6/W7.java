package s6;

/* loaded from: classes2.dex */
public final class W7 {
    public static final W7 lima;
    public final int alpha;
    public final float bravo;
    public final float charlie;
    public final boolean delta;
    public final float echo;
    public final float foxtrot;
    public final long golf;
    public final long hotel;
    public final boolean india;
    public final float juliet;
    public final float kilo;

    static {
        alpha().alpha();
        V7 alpha = alpha();
        alpha.delta = false;
        alpha.lima = (short) (alpha.lima | 16);
        lima = alpha.alpha();
    }

    public W7(int i4, float f5, float f10, boolean z2, float f11, float f12, long j5, long j6, boolean z10, float f13, float f14) {
        this.alpha = i4;
        this.bravo = f5;
        this.charlie = f10;
        this.delta = z2;
        this.echo = f11;
        this.foxtrot = f12;
        this.golf = j5;
        this.hotel = j6;
        this.india = z10;
        this.juliet = f13;
        this.kilo = f14;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [s6.V7, java.lang.Object] */
    public static V7 alpha() {
        ?? obj = new Object();
        short s3 = (short) (obj.lima | 1);
        obj.alpha = 5;
        obj.bravo = 0.25f;
        obj.charlie = 0.8f;
        obj.delta = true;
        obj.echo = 0.5f;
        obj.foxtrot = 0.8f;
        obj.golf = 1500L;
        obj.hotel = 3000L;
        obj.india = true;
        obj.juliet = 0.1f;
        obj.kilo = 0.05f;
        obj.lima = (short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (((short) (s3 | 2)) | 4)) | 8)) | 16)) | 32)) | 64)) | 128)) | 256)) | 512)) | 1024)) | 2048);
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof W7) {
                W7 w72 = (W7) obj;
                w72.getClass();
                if (this.alpha == w72.alpha && Float.floatToIntBits(this.bravo) == Float.floatToIntBits(w72.bravo) && Float.floatToIntBits(this.charlie) == Float.floatToIntBits(w72.charlie) && this.delta == w72.delta && Float.floatToIntBits(this.echo) == Float.floatToIntBits(w72.echo) && Float.floatToIntBits(this.foxtrot) == Float.floatToIntBits(w72.foxtrot) && this.golf == w72.golf && this.hotel == w72.hotel && this.india == w72.india && Float.floatToIntBits(this.juliet) == Float.floatToIntBits(w72.juliet) && Float.floatToIntBits(this.kilo) == Float.floatToIntBits(w72.kilo)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i4;
        int floatToIntBits = (((((-715379941) ^ this.alpha) * 1000003) ^ Float.floatToIntBits(this.bravo)) * 1000003) ^ Float.floatToIntBits(this.charlie);
        int i5 = 1231;
        if (true != this.delta) {
            i4 = 1237;
        } else {
            i4 = 1231;
        }
        int floatToIntBits2 = ((((((((((floatToIntBits * 1000003) ^ i4) * 1000003) ^ Float.floatToIntBits(this.echo)) * 1000003) ^ Float.floatToIntBits(this.foxtrot)) * 1000003) ^ ((int) this.golf)) * 1000003) ^ ((int) this.hotel)) * 1000003;
        if (true != this.india) {
            i5 = 1237;
        }
        return ((((floatToIntBits2 ^ i5) * 1000003) ^ Float.floatToIntBits(this.juliet)) * 1000003) ^ Float.floatToIntBits(this.kilo);
    }

    public final String toString() {
        return "AutoZoomOptions{recentFramesToCheck=10, recentFramesContainingPredictedArea=" + this.alpha + ", recentFramesIou=" + this.bravo + ", maxCoverage=" + this.charlie + ", useConfidenceScore=" + this.delta + ", lowerConfidenceScore=" + this.echo + ", higherConfidenceScore=" + this.foxtrot + ", zoomIntervalInMillis=" + this.golf + ", resetIntervalInMillis=" + this.hotel + ", enableZoomThreshold=" + this.india + ", zoomInThreshold=" + this.juliet + ", zoomOutThreshold=" + this.kilo + "}";
    }
}
