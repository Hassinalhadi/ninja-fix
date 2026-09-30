package B2;

import android.os.Handler;
import android.os.Looper;
import s6.U6;

/* loaded from: classes3.dex */
public final class b {
    public final Handler alpha;

    public b() {
        this.alpha = U6.alpha(Looper.getMainLooper());
    }

    public b(Handler handler) {
        this.alpha = handler;
    }
}
