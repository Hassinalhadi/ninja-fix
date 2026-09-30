package K1;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public abstract class b {
    public static Handler alpha(Looper looper) {
        Handler createAsync;
        createAsync = Handler.createAsync(looper);
        return createAsync;
    }
}
