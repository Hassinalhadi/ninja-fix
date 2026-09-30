package zendesk.classic.messaging;

import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.i;
import ao.ad;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import zendesk.classic.messaging.components.DateProvider;
import zendesk.commonui.PermissionsHandler;
import zendesk.core.MediaFileResolver;

/* loaded from: classes.dex */
abstract class MessagingActivityModule {
    private static final int THREAD_POOL_SIZE = 5;

    @MessagingActivityScope
    public static DateProvider dateProvider() {
        return new DateProvider();
    }

    @MessagingActivityScope
    public static ExecutorService executorService(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService;
    }

    @MessagingActivityScope
    public static Handler handler() {
        return new Handler(Looper.getMainLooper());
    }

    @MessagingActivityScope
    public static boolean multilineResponseOptionsEnabled(MessagingComponent messagingComponent) {
        return messagingComponent.messagingConfiguration().isMultilineResponseOptionsEnabled();
    }

    @MessagingActivityScope
    public static PermissionsHandler permissionsHandler(i iVar) {
        return new PermissionsHandler(iVar);
    }

    @MessagingActivityScope
    public static ScheduledExecutorService provideExecutor() {
        return Executors.newScheduledThreadPool(5, new ThreadFactory() { // from class: zendesk.classic.messaging.MessagingActivityModule.1
            final AtomicInteger atomicInteger = new AtomicInteger(0);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                Locale locale = Locale.ENGLISH;
                Thread thread = new Thread(runnable, ad.zulu(this.atomicInteger.getAndIncrement(), "ZendeskThread-"));
                thread.setPriority(10);
                return thread;
            }
        });
    }

    @MessagingActivityScope
    public static UriResolver uriTaskResolver(MediaFileResolver mediaFileResolver, ExecutorService executorService) {
        return new UriResolver(mediaFileResolver, executorService);
    }

    public abstract EventListener eventListener(MessagingViewModel messagingViewModel);
}
