package O7;

import android.os.Process;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class v implements Runnable {
    public final /* synthetic */ int alpha = 0;
    public final /* synthetic */ Object purple;

    public v(Runnable runnable) {
        this.purple = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        switch (this.alpha) {
            case 0:
                ((Runnable) this.purple).run();
                return;
            default:
                ExecutorService executorService = (ExecutorService) this.purple;
                try {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Executing shutdown hook for awaitEvenIfOnMainThread task continuation executor", null);
                    }
                    executorService.shutdown();
                    if (!executorService.awaitTermination(2L, TimeUnit.SECONDS)) {
                        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                            Log.d("FirebaseCrashlytics", "awaitEvenIfOnMainThread task continuation executor did not shut down in the allocated time. Requesting immediate shutdown.", null);
                        }
                        executorService.shutdownNow();
                        return;
                    }
                    return;
                } catch (InterruptedException unused) {
                    Locale locale = Locale.US;
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Interrupted while waiting for awaitEvenIfOnMainThread task continuation executor to shut down. Requesting immediate shutdown.", null);
                    }
                    executorService.shutdownNow();
                    return;
                }
        }
    }

    public v(ExecutorService executorService) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.purple = executorService;
    }
}
