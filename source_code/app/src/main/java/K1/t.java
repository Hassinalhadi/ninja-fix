package K1;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import s6.T7;
import s6.W5;

/* loaded from: classes3.dex */
public final class t implements j {

    /* renamed from: a, reason: collision with root package name */
    public W5 f1670a;
    public final Context alpha;
    public final p1.d purple;
    public final com.google.mlkit.common.sdkinternal.b red;
    public final Object silver;
    public Handler teal;
    public ThreadPoolExecutor white;
    public ThreadPoolExecutor yellow;

    public t(Context context, p1.d dVar) {
        com.google.mlkit.common.sdkinternal.b bVar = u.delta;
        this.silver = new Object();
        T7.foxtrot(context, "Context cannot be null");
        this.alpha = context.getApplicationContext();
        this.purple = dVar;
        this.red = bVar;
    }

    public final void alpha() {
        synchronized (this.silver) {
            try {
                this.f1670a = null;
                Handler handler = this.teal;
                if (handler != null) {
                    handler.removeCallbacks(null);
                }
                this.teal = null;
                ThreadPoolExecutor threadPoolExecutor = this.yellow;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.white = null;
                this.yellow = null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void bravo() {
        synchronized (this.silver) {
            try {
                if (this.f1670a == null) {
                    return;
                }
                if (this.white == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new a("emojiCompat"));
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    this.yellow = threadPoolExecutor;
                    this.white = threadPoolExecutor;
                }
                this.white.execute(new A2.q(10, this));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.j
    public final void charlie(W5 w52) {
        synchronized (this.silver) {
            this.f1670a = w52;
        }
        bravo();
    }

    public final p1.h delta() {
        try {
            com.google.mlkit.common.sdkinternal.b bVar = this.red;
            Context context = this.alpha;
            p1.d dVar = this.purple;
            bVar.getClass();
            Object[] objArr = {dVar};
            ArrayList arrayList = new ArrayList(1);
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            arrayList.add(obj);
            j.q alpha = p1.c.alpha(context, Collections.unmodifiableList(arrayList));
            int i4 = alpha.alpha;
            if (i4 == 0) {
                p1.h[] hVarArr = (p1.h[]) alpha.bravo.get(0);
                if (hVarArr != null && hVarArr.length != 0) {
                    return hVarArr[0];
                }
                throw new RuntimeException("fetchFonts failed (empty result)");
            }
            throw new RuntimeException(av.q.delta(i4, "fetchFonts failed (", ")"));
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("provider not found", e);
        }
    }
}
