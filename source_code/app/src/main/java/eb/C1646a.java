package eb;

import ao.ad;
import av.q;

/* renamed from: eb.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1646a {
    public final float alpha;
    public final float bravo;

    public C1646a(float f5, float f10) {
        this.alpha = f5;
        this.bravo = f10;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C1646a) {
                C1646a c1646a = (C1646a) obj;
                if (!Q0.g.alpha(this.alpha, c1646a.alpha) || !Q0.g.alpha(this.bravo, c1646a.bravo) || Float.compare(18.0f, 18.0f) != 0 || Float.compare(90.0f, 90.0f) != 0 || Float.compare(0.0f, 0.0f) != 0) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.floatToIntBits(0.0f) + ad.sierra(90.0f, ad.sierra(18.0f, ad.sierra(this.bravo, Float.floatToIntBits(this.alpha) * 31, 31), 31), 31);
    }

    public final String toString() {
        return q.golf("ArcsSpec(size=", Q0.g.bravo(this.alpha), ", strokeWidth=", Q0.g.bravo(this.bravo), ", gapDegrees=18.0, currentTargetAngle=90.0, twoSegmentsTargetAngle=0.0)");
    }
}
