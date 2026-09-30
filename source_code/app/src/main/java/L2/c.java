package L2;

import K2.i;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ExecutorService;
import vf.AbstractC3220y;
import vf.ad;

/* loaded from: classes3.dex */
public final class c implements a {
    public final i alpha;
    public final AbstractC3220y bravo;
    public final Handler charlie = new Handler(Looper.getMainLooper());
    public final b delta = new b(0, this);

    public c(ExecutorService executorService) {
        i iVar = new i(executorService);
        this.alpha = iVar;
        this.bravo = ad.papa(iVar);
    }

    public final void alpha(Runnable runnable) {
        this.alpha.execute(runnable);
    }
}
