package s1;

import android.os.Build;
import android.os.LocaleList;
import android.os.Process;
import android.view.PointerIcon;
import java.util.Locale;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import zendesk.commonui.MainThreadExecutorService;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class af {
    public static /* bridge */ /* synthetic */ long alpha() {
        return Process.getStartElapsedRealtime();
    }

    public static /* synthetic */ void amber(MainThreadExecutorService mainThreadExecutorService) {
        boolean isTerminated;
        if ((Build.VERSION.SDK_INT <= 23 || mainThreadExecutorService != ForkJoinPool.commonPool()) && !(isTerminated = mainThreadExecutorService.isTerminated())) {
            mainThreadExecutorService.shutdown();
            boolean z2 = false;
            while (!isTerminated) {
                try {
                    isTerminated = mainThreadExecutorService.awaitTermination(1L, TimeUnit.DAYS);
                } catch (InterruptedException unused) {
                    if (!z2) {
                        mainThreadExecutorService.shutdownNow();
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static /* bridge */ /* synthetic */ Class black() {
        return Optional.class;
    }

    public static /* synthetic */ LocaleList echo(Locale[] localeArr) {
        return new LocaleList(localeArr);
    }

    public static /* bridge */ /* synthetic */ PointerIcon india(Object obj) {
        return (PointerIcon) obj;
    }

    public static /* bridge */ /* synthetic */ Class kilo() {
        return CompletableFuture.class;
    }

    public static /* synthetic */ void oscar() {
    }
}
