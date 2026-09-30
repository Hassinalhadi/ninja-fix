package R5;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes2.dex */
public final class a {
    public static final ReentrantLock charlie = new ReentrantLock();
    public static a delta;
    public final ReentrantLock alpha = new ReentrantLock();
    public final SharedPreferences bravo;

    public a(Context context) {
        this.bravo = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public final String alpha(String str) {
        ReentrantLock reentrantLock = this.alpha;
        reentrantLock.lock();
        try {
            return this.bravo.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
