package s6;

import a0.C0366t;
import com.airbnb.lottie.compose.LottieConstants;
import g0.C1725e;
import g0.C1726f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class X {
    public static C1726f alpha;

    public static int alpha(int i4, int i5) {
        if (i5 >= 0) {
            int i10 = i4 + (i4 >> 1) + 1;
            if (i10 < i5) {
                i10 = Integer.highestOneBit(i5 - 1) << 1;
            }
            if (i10 < 0) {
                return LottieConstants.IterateForever;
            }
            return i10;
        }
        throw new AssertionError("cannot store more than MAX_VALUE elements");
    }

    public static final C1726f bravo() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(12.0f, 2.0f);
        bVar.delta(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        bVar.lima(4.48f, 10.0f, 10.0f, 10.0f);
        bVar.lima(10.0f, -4.48f, 10.0f, -10.0f);
        bVar.kilo(17.52f, 2.0f, 12.0f, 2.0f);
        bVar.charlie();
        bVar.juliet(13.0f, 17.0f);
        bVar.golf(-2.0f);
        bVar.november(-6.0f);
        bVar.golf(2.0f);
        bVar.november(6.0f);
        bVar.charlie();
        bVar.juliet(13.0f, 9.0f);
        bVar.golf(-2.0f);
        bVar.hotel(11.0f, 7.0f);
        bVar.golf(2.0f);
        bVar.november(2.0f);
        bVar.charlie();
        c1725e.charlie(1.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0, 0, 2, auVar, null, "", bVar.alpha);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }
}
