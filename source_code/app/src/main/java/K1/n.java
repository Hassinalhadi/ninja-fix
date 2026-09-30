package K1;

import android.os.Trace;
import com.google.android.gms.internal.measurement.C1320g1;

/* loaded from: classes3.dex */
public final class n implements Runnable {
    public final /* synthetic */ int alpha;

    private final void alpha() {
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                try {
                    int i4 = o1.i.alpha;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (k.delta()) {
                        k.alpha().echo();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i5 = o1.i.alpha;
                    Trace.endSection();
                    throw th;
                }
            case 1:
                C1320g1.india.incrementAndGet();
                return;
            default:
                return;
        }
    }
}
