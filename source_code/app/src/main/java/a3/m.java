package a3;

import android.os.SystemClock;
import com.airbnb.lottie.compose.LottieConstants;
import t6.AbstractC3001h2;

/* loaded from: classes3.dex */
public final class m implements j {
    public static final m alpha = new Object();
    public static P2.i bravo;

    @Override // a3.j
    public boolean alpha() {
        boolean z2;
        synchronized (i.alpha) {
            try {
                int i4 = i.charlie;
                i.charlie = i4 + 1;
                if (i4 >= 30 || SystemClock.uptimeMillis() > i.delta + 30000) {
                    boolean z10 = false;
                    i.charlie = 0;
                    i.delta = SystemClock.uptimeMillis();
                    String[] list = i.bravo.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z10 = true;
                    }
                    i.echo = z10;
                }
                z2 = i.echo;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    @Override // a3.j
    public boolean bravo(Y2.h hVar) {
        int i4;
        AbstractC3001h2 abstractC3001h2 = hVar.alpha;
        boolean z2 = abstractC3001h2 instanceof Y2.a;
        int i5 = LottieConstants.IterateForever;
        if (z2) {
            i4 = ((Y2.a) abstractC3001h2).alpha;
        } else {
            i4 = Integer.MAX_VALUE;
        }
        if (i4 > 100) {
            AbstractC3001h2 abstractC3001h22 = hVar.bravo;
            if (abstractC3001h22 instanceof Y2.a) {
                i5 = ((Y2.a) abstractC3001h22).alpha;
            }
            if (i5 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }
}
