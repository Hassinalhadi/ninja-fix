package g3;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class aa {
    public static boolean alpha(double d4, double d9, long j5, ab state) {
        Intrinsics.echo(state, "state");
        if (state.alpha != 0 && j5 - state.delta < 1000) {
            double d10 = state.bravo;
            double d11 = state.charlie;
            double radians = Math.toRadians(d4 - d10);
            double radians2 = Math.toRadians(d9 - d11);
            double d12 = 2;
            double d13 = radians / d12;
            double d14 = radians2 / d12;
            double sin = (Math.sin(d14) * Math.sin(d14) * Math.cos(Math.toRadians(d4)) * Math.cos(Math.toRadians(d10))) + (Math.sin(d13) * Math.sin(d13));
            if (((float) (Math.atan2(Math.sqrt(sin), Math.sqrt(1 - sin)) * d12 * 6371000.0d)) < 2.5f) {
                return true;
            }
            return false;
        }
        return false;
    }
}
