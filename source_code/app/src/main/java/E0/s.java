package E0;

import android.graphics.Canvas;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;

/* loaded from: classes3.dex */
public abstract class s {
    public static final q alpha = new Canvas();
    public static final long bravo;

    /* JADX WARN: Type inference failed for: r0v0, types: [android.graphics.Canvas, E0.q] */
    static {
        long j5 = 0;
        bravo = (j5 & 4294967295L) | (j5 << 32);
    }

    public static final TextDirectionHeuristic alpha(int i4) {
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
                            }
                            return TextDirectionHeuristics.LOCALE;
                        }
                        return TextDirectionHeuristics.ANYRTL_LTR;
                    }
                    return TextDirectionHeuristics.FIRSTSTRONG_RTL;
                }
                return TextDirectionHeuristics.FIRSTSTRONG_LTR;
            }
            return TextDirectionHeuristics.RTL;
        }
        return TextDirectionHeuristics.LTR;
    }
}
