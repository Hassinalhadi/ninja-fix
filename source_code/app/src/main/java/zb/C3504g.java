package zb;

import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* renamed from: zb.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3504g {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final String foxtrot;
    public final float golf;

    public C3504g(String ordersDelivered, String str, String earnedPoints, String str2, String str3, String str4, float f5) {
        Intrinsics.echo(ordersDelivered, "ordersDelivered");
        Intrinsics.echo(earnedPoints, "earnedPoints");
        this.alpha = ordersDelivered;
        this.bravo = str;
        this.charlie = earnedPoints;
        this.delta = str2;
        this.echo = str3;
        this.foxtrot = str4;
        this.golf = f5;
        if (0.0f <= f5 && f5 <= 1.0f) {
            return;
        }
        throw new IllegalArgumentException(("Progress must be between 0f and 1f, but was " + f5).toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3504g)) {
            return false;
        }
        C3504g c3504g = (C3504g) obj;
        if (Intrinsics.areEqual(this.alpha, c3504g.alpha) && Intrinsics.areEqual(this.bravo, c3504g.bravo) && Intrinsics.areEqual(this.charlie, c3504g.charlie) && Intrinsics.areEqual(this.delta, c3504g.delta) && Intrinsics.areEqual(this.echo, c3504g.echo) && Intrinsics.areEqual(this.foxtrot, c3504g.foxtrot) && Float.compare(this.golf, c3504g.golf) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.golf) + AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(AbstractC2327c.sierra(this.alpha.hashCode() * 31, 31, this.bravo), 31, this.charlie), 31, this.delta), 31, this.echo), 31, this.foxtrot);
    }

    public final String toString() {
        return "MyShiftsStats(ordersDelivered=" + this.alpha + ", ordersDeliveredLabel=" + this.bravo + ", earnedPoints=" + this.charlie + ", earnedPointsLabel=" + this.delta + ", shiftEnds=" + this.echo + ", shiftEndsLabel=" + this.foxtrot + ", progress=" + this.golf + ")";
    }
}
