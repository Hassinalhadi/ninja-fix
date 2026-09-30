package zendesk.core;

import android.content.Context;
import ao.ad;
import com.google.gson.i;
import com.google.gson.l;
import com.google.gson.m;
import com.zendesk.logger.Logger;
import com.zendesk.service.ZendeskDateTypeAdapter;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import okhttp3.logging.HttpLoggingInterceptor;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ZendeskApplicationModule {
    static final String APPLICATION_CONTEXT = "application_context";
    static final String BASE_64_SERIALIZER = "base_64_serializer";
    private static final int THREAD_POOL_SIZE = 5;
    private ApplicationConfiguration applicationConfiguration;
    private Context context;

    public ZendeskApplicationModule(Context context, ApplicationConfiguration applicationConfiguration) {
        this.context = context.getApplicationContext();
        this.applicationConfiguration = applicationConfiguration;
    }

    public static DeviceInfo provideDeviceInfo(Context context) {
        return new DeviceInfo(context);
    }

    public static ScheduledExecutorService provideExecutor() {
        return Executors.newScheduledThreadPool(5, new ThreadFactory() { // from class: zendesk.core.ZendeskApplicationModule.1
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

    public static ExecutorService provideExecutorService(ScheduledExecutorService scheduledExecutorService) {
        return scheduledExecutorService;
    }

    public static l provideGson() {
        m mVar = new m();
        mVar.charlie = i.purple;
        mVar.alpha = mVar.alpha.withModifiers(128, 8);
        mVar.bravo(Date.class, new ZendeskDateTypeAdapter());
        return mVar.alpha();
    }

    public static HttpLoggingInterceptor provideHttpLoggingInterceptor() {
        HttpLoggingInterceptor.Level level;
        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();
        if (Logger.isLoggable()) {
            level = HttpLoggingInterceptor.Level.BASIC;
        } else {
            level = HttpLoggingInterceptor.Level.NONE;
        }
        httpLoggingInterceptor.setLevel(level);
        return httpLoggingInterceptor;
    }

    public static ZendeskShadow provideZendesk(Storage storage, LegacyIdentityMigrator legacyIdentityMigrator, IdentityManager identityManager, BlipsCoreProvider blipsCoreProvider, PushRegistrationProvider pushRegistrationProvider, CoreModule coreModule, ProviderStore providerStore) {
        return new ZendeskShadow(storage, legacyIdentityMigrator, identityManager, blipsCoreProvider, pushRegistrationProvider, coreModule, providerStore);
    }

    public ApplicationConfiguration provideApplicationConfiguration() {
        return this.applicationConfiguration;
    }

    public Context provideApplicationContext() {
        return this.context;
    }

    public Serializer provideBase64Serializer(Serializer serializer) {
        return new ZendeskBase64Serializer(serializer);
    }

    public ZendeskLocaleConverter provideZendeskLocaleConverter() {
        return new ZendeskLocaleConverter();
    }
}
