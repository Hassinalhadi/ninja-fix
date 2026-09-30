package s6;

/* loaded from: classes2.dex */
public final class V7 {
    public int alpha;
    public float bravo;
    public float charlie;
    public boolean delta;
    public float echo;
    public float foxtrot;
    public long golf;
    public long hotel;
    public boolean india;
    public float juliet;
    public float kilo;
    public short lima;

    public final W7 alpha() {
        if (this.lima != 4095) {
            StringBuilder sb2 = new StringBuilder();
            if ((this.lima & 1) == 0) {
                sb2.append(" recentFramesToCheck");
            }
            if ((this.lima & 2) == 0) {
                sb2.append(" recentFramesContainingPredictedArea");
            }
            if ((this.lima & 4) == 0) {
                sb2.append(" recentFramesIou");
            }
            if ((this.lima & 8) == 0) {
                sb2.append(" maxCoverage");
            }
            if ((this.lima & 16) == 0) {
                sb2.append(" useConfidenceScore");
            }
            if ((this.lima & 32) == 0) {
                sb2.append(" lowerConfidenceScore");
            }
            if ((this.lima & 64) == 0) {
                sb2.append(" higherConfidenceScore");
            }
            if ((this.lima & 128) == 0) {
                sb2.append(" zoomIntervalInMillis");
            }
            if ((this.lima & 256) == 0) {
                sb2.append(" resetIntervalInMillis");
            }
            if ((this.lima & 512) == 0) {
                sb2.append(" enableZoomThreshold");
            }
            if ((this.lima & 1024) == 0) {
                sb2.append(" zoomInThreshold");
            }
            if ((this.lima & 2048) == 0) {
                sb2.append(" zoomOutThreshold");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
        }
        return new W7(this.alpha, this.bravo, this.charlie, this.delta, this.echo, this.foxtrot, this.golf, this.hotel, this.india, this.juliet, this.kilo);
    }
}
