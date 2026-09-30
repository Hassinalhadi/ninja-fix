package A2;

import R7.U;
import android.os.Build;
import com.airbnb.lottie.compose.LottieConstants;
import java.util.concurrent.ExecutorService;

/* loaded from: classes3.dex */
public final class a {
    public final ExecutorService alpha = U.alpha(false);
    public final Cf.e bravo = vf.ao.alpha;
    public final ExecutorService charlie = U.alpha(true);
    public final aa delta = new Object();
    public final l echo = l.alpha;
    public final aa foxtrot = aa.alpha;
    public final B2.b golf = new B2.b();
    public final int hotel = 4;
    public final int india = LottieConstants.IterateForever;
    public final int juliet;
    public final int kilo;
    public final boolean lima;
    public final aa mike;

    /* JADX WARN: Type inference failed for: r0v1, types: [A2.aa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v5, types: [A2.aa, java.lang.Object] */
    public a(aa aaVar) {
        int i4;
        if (Build.VERSION.SDK_INT == 23) {
            i4 = 10;
        } else {
            i4 = 20;
        }
        this.kilo = i4;
        this.juliet = 8;
        this.lima = true;
        this.mike = new Object();
    }
}
