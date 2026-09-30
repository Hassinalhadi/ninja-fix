package J7;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class k implements Executor {
    public static final k alpha;
    public static final Handler purple;
    public static final /* synthetic */ k[] red;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Enum, J7.k] */
    static {
        ?? r12 = new Enum("INSTANCE", 0);
        alpha = r12;
        red = new k[]{r12};
        purple = new Handler(Looper.getMainLooper());
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) red.clone();
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        purple.post(runnable);
    }
}
