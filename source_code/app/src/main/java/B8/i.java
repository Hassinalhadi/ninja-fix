package B8;

import com.google.firebase.perf.metrics.Trace;
import u8.C3146a;
import v8.C3178c;

/* loaded from: classes2.dex */
public abstract class i {
    public static final C3146a alpha = C3146a.delta();

    public static void alpha(Trace trace, C3178c c3178c) {
        int i4 = c3178c.alpha;
        if (i4 > 0) {
            trace.putMetric("_fr_tot", i4);
        }
        int i5 = c3178c.bravo;
        if (i5 > 0) {
            trace.putMetric("_fr_slo", i5);
        }
        int i10 = c3178c.charlie;
        if (i10 > 0) {
            trace.putMetric("_fr_fzn", i10);
        }
        alpha.alpha("Screen trace: " + trace.silver + " _fr_tot:" + c3178c.alpha + " _fr_slo:" + i5 + " _fr_fzn:" + i10);
    }
}
