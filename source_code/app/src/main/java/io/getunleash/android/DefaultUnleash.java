package io.getunleash.android;

import Nd.h;
import Nd.i;
import android.content.Context;
import androidx.lifecycle.ac;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.squareup.moshi.JsonAdapter;
import hd.l;
import io.getunleash.android.backup.LocalBackup;
import io.getunleash.android.cache.InMemoryToggleCache;
import io.getunleash.android.cache.ObservableCache;
import io.getunleash.android.cache.ObservableToggleCache;
import io.getunleash.android.cache.ToggleCache;
import io.getunleash.android.data.ImpressionEvent;
import io.getunleash.android.data.Parser;
import io.getunleash.android.data.Toggle;
import io.getunleash.android.data.UnleashContext;
import io.getunleash.android.data.UnleashState;
import io.getunleash.android.data.Variant;
import io.getunleash.android.events.UnleashFetcherHeartbeatListener;
import io.getunleash.android.events.UnleashImpressionEventListener;
import io.getunleash.android.events.UnleashListener;
import io.getunleash.android.events.UnleashReadyListener;
import io.getunleash.android.events.UnleashStateListener;
import io.getunleash.android.http.ClientBuilder;
import io.getunleash.android.http.NetworkStatusHelper;
import io.getunleash.android.metrics.MetricsHandler;
import io.getunleash.android.metrics.MetricsReporter;
import io.getunleash.android.metrics.MetricsSender;
import io.getunleash.android.metrics.NoOpMetrics;
import io.getunleash.android.polling.ProxyResponse;
import io.getunleash.android.polling.UnleashFetcher;
import io.getunleash.android.tasks.DataJob;
import io.getunleash.android.tasks.LifecycleAwareTaskManager;
import io.getunleash.android.util.UnleashLogger;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.io.FilesKt__FileReadWriteKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sf.b;
import sf.c;
import tf.AbstractC3119a;
import tf.C3122d;
import tf.C3125g;
import vf.I;
import vf.P;
import vf.ab;
import vf.ad;
import xf.EnumC3340a;
import yf.AbstractC3428A;
import yf.InterfaceC3439i;
import yf.N;
import yf.as;
import yf.at;
import yf.av;

@Metadata(d1 = {"\u0000è\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 s2\u00020\u0001:\u0001sBO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B[\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013¢\u0006\u0004\b\u0011\u0010\u0017J5\u0010\u001c\u001a\u00020\u001b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00142\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\nH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b!\u0010\"J\u001f\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020 H\u0017¢\u0006\u0004\b!\u0010$J\u0017\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b&\u0010'J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020%H\u0017¢\u0006\u0004\b&\u0010(J\u000f\u0010)\u001a\u00020\u001bH\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u001bH\u0016¢\u0006\u0004\b+\u0010*J\u000f\u0010,\u001a\u00020\u001bH\u0016¢\u0006\u0004\b,\u0010*J\u000f\u0010-\u001a\u00020\u001bH\u0016¢\u0006\u0004\b-\u0010*J\u000f\u0010.\u001a\u00020 H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b1\u00102J\u001f\u00105\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u00062\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00107\u001a\u00020\u001b2\u0006\u00100\u001a\u00020\u0006H\u0016¢\u0006\u0004\b7\u00102J\u0017\u00109\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b9\u0010:J\u0017\u0010;\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010:J\u000f\u0010<\u001a\u00020\u001bH\u0016¢\u0006\u0004\b<\u0010*J%\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A2\u0006\u0010>\u001a\u00020=2\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u001bH\u0002¢\u0006\u0004\bE\u0010*J\u0017\u0010H\u001a\u00020\u001b2\u0006\u0010G\u001a\u00020FH\u0002¢\u0006\u0004\bH\u0010IJ\u001f\u0010L\u001a\u00020\u001b2\u0006\u00108\u001a\u00020\u000b2\u0006\u0010K\u001a\u00020JH\u0002¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\u001bH\u0082@¢\u0006\u0004\bN\u0010OR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010QR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010RR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010SR\u001a\u0010U\u001a\b\u0012\u0004\u0012\u00020\u000b0T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\"\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010WR\u001a\u0010Y\u001a\b\u0012\u0004\u0012\u00020\u00060X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\\\u001a\u00020[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u0014\u0010_\u001a\u00020^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010e\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010fR\u0016\u0010g\u001a\u00020d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010fR\u0014\u0010@\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010hR\u0014\u0010j\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u001a\u0010m\u001a\b\u0012\u0004\u0012\u00020F0l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR&\u0010q\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0p0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010r¨\u0006t"}, d2 = {"Lio/getunleash/android/DefaultUnleash;", "Lio/getunleash/android/Unleash;", "Landroid/content/Context;", "androidContext", "Lio/getunleash/android/UnleashConfig;", "unleashConfig", "Lio/getunleash/android/data/UnleashContext;", "unleashContext", "Lio/getunleash/android/cache/ToggleCache;", "cacheImpl", "", "Lio/getunleash/android/events/UnleashListener;", "eventListeners", "Landroidx/lifecycle/ac;", "lifecycle", "Lvf/ab;", "coroutineScope", "<init>", "(Landroid/content/Context;Lio/getunleash/android/UnleashConfig;Lio/getunleash/android/data/UnleashContext;Lio/getunleash/android/cache/ToggleCache;Ljava/util/List;Landroidx/lifecycle/ac;Lvf/ab;)V", "Lkotlin/Function1;", "Ljava/io/File;", "Lio/getunleash/android/backup/LocalBackup;", "localBackupFactory", "(Landroid/content/Context;Lio/getunleash/android/UnleashConfig;Lio/getunleash/android/data/UnleashContext;Lio/getunleash/android/cache/ToggleCache;Ljava/util/List;Landroidx/lifecycle/ac;Lkotlin/jvm/functions/Function1;)V", "bootstrapFile", "Lio/getunleash/android/data/Toggle;", "bootstrap", "", "start", "(Ljava/util/List;Ljava/io/File;Ljava/util/List;)V", "", "toggleName", "", "isEnabled", "(Ljava/lang/String;)Z", "defaultValue", "(Ljava/lang/String;Z)Z", "Lio/getunleash/android/data/Variant;", "getVariant", "(Ljava/lang/String;)Lio/getunleash/android/data/Variant;", "(Ljava/lang/String;Lio/getunleash/android/data/Variant;)Lio/getunleash/android/data/Variant;", "refreshTogglesNow", "()V", "refreshTogglesNowAsync", "sendMetricsNow", "sendMetricsNowAsync", "isReady", "()Z", "context", "setContext", "(Lio/getunleash/android/data/UnleashContext;)V", "", "timeout", "setContextWithTimeout", "(Lio/getunleash/android/data/UnleashContext;J)V", "setContextAsync", "listener", "addUnleashEventListener", "(Lio/getunleash/android/events/UnleashListener;)V", "removeUnleashEventListener", Constants.KEY_HIDE_CLOSE, "Lio/getunleash/android/metrics/MetricsReporter;", "metricsSender", "Lio/getunleash/android/polling/UnleashFetcher;", "fetcher", "Lsf/b;", "Lio/getunleash/android/tasks/DataJob;", "buildDataJobs", "(Lio/getunleash/android/metrics/MetricsReporter;Lio/getunleash/android/polling/UnleashFetcher;)Lsf/b;", "initializeLocalBackup", "Lio/getunleash/android/data/ImpressionEvent;", "impressionEvent", "emit", "(Lio/getunleash/android/data/ImpressionEvent;)V", "Lvf/I;", "job", "registerListenerJob", "(Lio/getunleash/android/events/UnleashListener;Lvf/I;)V", "readyOnFeaturesReceived", "(LNd/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/getunleash/android/UnleashConfig;", "Landroidx/lifecycle/ac;", "Lvf/ab;", "", "initialListeners", "Ljava/util/List;", "Lkotlin/jvm/functions/Function1;", "Lyf/at;", "unleashContextState", "Lyf/at;", "Lio/getunleash/android/metrics/MetricsHandler;", "metrics", "Lio/getunleash/android/metrics/MetricsHandler;", "Lio/getunleash/android/tasks/LifecycleAwareTaskManager;", "taskManager", "Lio/getunleash/android/tasks/LifecycleAwareTaskManager;", "Lio/getunleash/android/cache/ObservableToggleCache;", "cache", "Lio/getunleash/android/cache/ObservableToggleCache;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "ready", "Lio/getunleash/android/polling/UnleashFetcher;", "Lio/getunleash/android/http/NetworkStatusHelper;", "networkStatusHelper", "Lio/getunleash/android/http/NetworkStatusHelper;", "Lyf/as;", "impressionEventsFlow", "Lyf/as;", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listenerJobs", "Ljava/util/concurrent/ConcurrentHashMap;", "Companion", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DefaultUnleash implements Unleash, AutoCloseable {

    @NotNull
    public static final String BACKUP_DIR_NAME = "unleash_backup";

    @NotNull
    private static final String TAG = "Unleash";

    @NotNull
    private final Context androidContext;

    @NotNull
    private final ObservableToggleCache cache;

    @NotNull
    private final ab coroutineScope;

    @NotNull
    private final UnleashFetcher fetcher;

    @NotNull
    private final as impressionEventsFlow;

    @NotNull
    private final List<UnleashListener> initialListeners;

    @NotNull
    private final ac lifecycle;

    @NotNull
    private final ConcurrentHashMap<UnleashListener, CopyOnWriteArrayList<I>> listenerJobs;

    @NotNull
    private Function1<? super File, ? extends LocalBackup> localBackupFactory;

    @NotNull
    private final MetricsHandler metrics;

    @NotNull
    private final NetworkStatusHelper networkStatusHelper;

    @NotNull
    private AtomicBoolean ready;

    @NotNull
    private AtomicBoolean started;

    @NotNull
    private final LifecycleAwareTaskManager taskManager;

    @NotNull
    private final UnleashConfig unleashConfig;

    @NotNull
    private final at unleashContextState;

    public DefaultUnleash(@NotNull Context androidContext, @NotNull UnleashConfig unleashConfig, @NotNull UnleashContext unleashContext, @NotNull ToggleCache cacheImpl, @NotNull List<? extends UnleashListener> eventListeners, @NotNull ac lifecycle, @NotNull ab coroutineScope) {
        MetricsHandler noOpMetrics;
        Intrinsics.echo(androidContext, "androidContext");
        Intrinsics.echo(unleashConfig, "unleashConfig");
        Intrinsics.echo(unleashContext, "unleashContext");
        Intrinsics.echo(cacheImpl, "cacheImpl");
        Intrinsics.echo(eventListeners, "eventListeners");
        Intrinsics.echo(lifecycle, "lifecycle");
        Intrinsics.echo(coroutineScope, "coroutineScope");
        this.androidContext = androidContext;
        this.unleashConfig = unleashConfig;
        this.lifecycle = lifecycle;
        this.coroutineScope = coroutineScope;
        ArrayList arrayList = new ArrayList();
        this.initialListeners = arrayList;
        this.localBackupFactory = new l(11);
        N charlie = AbstractC3428A.charlie(unleashContext);
        this.unleashContextState = charlie;
        this.cache = new ObservableCache(cacheImpl, coroutineScope);
        this.started = new AtomicBoolean(false);
        this.ready = new AtomicBoolean(false);
        NetworkStatusHelper networkStatusHelper = new NetworkStatusHelper(androidContext, null, 2, null);
        this.networkStatusHelper = networkStatusHelper;
        this.impressionEventsFlow = AbstractC3428A.alpha(1, 1000, EnumC3340a.purple);
        this.listenerJobs = new ConcurrentHashMap<>();
        ClientBuilder clientBuilder = new ClientBuilder(unleashConfig, androidContext);
        if (unleashConfig.getMetricsStrategy().getEnabled()) {
            noOpMetrics = new MetricsSender(unleashConfig, clientBuilder.build("metrics", unleashConfig.getMetricsStrategy()), null, 4, null);
        } else {
            noOpMetrics = new NoOpMetrics();
        }
        this.metrics = noOpMetrics;
        UnleashFetcher unleashFetcher = new UnleashFetcher(unleashConfig, clientBuilder.build("poller", unleashConfig.getPollingStrategy()), new av(charlie));
        this.fetcher = unleashFetcher;
        this.taskManager = new LifecycleAwareTaskManager(buildDataJobs(noOpMetrics, unleashFetcher), networkStatusHelper.isAvailable(), coroutineScope, null, 8, null);
        if (!unleashConfig.getDelayedInitialization()) {
            a.charlie(this, eventListeners, null, null, 6, null);
        } else {
            if (eventListeners.isEmpty()) {
                return;
            }
            arrayList.addAll(eventListeners);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final b buildDataJobs(MetricsReporter metricsSender, UnleashFetcher fetcher) {
        b bVar;
        c cVar;
        AbstractC3119a abstractC3119a;
        Ld.c hotel = kotlin.collections.ab.hotel();
        if (this.unleashConfig.getPollingStrategy().getEnabled()) {
            hotel.add(new DataJob("fetchToggles", this.unleashConfig.getPollingStrategy(), new DefaultUnleash$buildDataJobs$1$1(fetcher)));
        }
        if (this.unleashConfig.getMetricsStrategy().getEnabled()) {
            hotel.add(new DataJob("sendMetrics", this.unleashConfig.getMetricsStrategy(), new DefaultUnleash$buildDataJobs$1$2(metricsSender)));
        }
        Ld.c alpha = kotlin.collections.ab.alpha(hotel);
        Intrinsics.echo(alpha, "<this>");
        if (alpha instanceof b) {
            bVar = (b) alpha;
        } else {
            bVar = null;
        }
        if (bVar == null) {
            if (alpha instanceof c) {
                cVar = (c) alpha;
            } else {
                cVar = null;
            }
            if (cVar != null) {
                abstractC3119a = ((C3122d) cVar).delta();
            } else {
                abstractC3119a = null;
            }
            if (abstractC3119a == null) {
                C3125g c3125g = C3125g.purple;
                Intrinsics.echo(c3125g, "<this>");
                if (!alpha.isEmpty()) {
                    Object[] objArr = c3125g.alpha;
                    if (alpha.size() + objArr.length <= 32) {
                        Object[] copyOf = Arrays.copyOf(objArr, alpha.size() + objArr.length);
                        Intrinsics.delta(copyOf, "copyOf(...)");
                        int length = objArr.length;
                        ListIterator listIterator = alpha.listIterator(0);
                        while (true) {
                            Ld.a aVar = (Ld.a) listIterator;
                            if (aVar.hasNext()) {
                                copyOf[length] = aVar.next();
                                length++;
                            } else {
                                return new C3125g(copyOf);
                            }
                        }
                    } else {
                        C3122d c3122d = new C3122d(c3125g, null, objArr, 0);
                        c3122d.addAll(alpha);
                        return c3122d.delta();
                    }
                } else {
                    return c3125g;
                }
            } else {
                return abstractC3119a;
            }
        } else {
            return bVar;
        }
    }

    public static final Object buildDataJobs$lambda$7$refreshToggles(UnleashFetcher unleashFetcher, Nd.c cVar) {
        Object refreshToggles = unleashFetcher.refreshToggles(cVar);
        if (refreshToggles == Od.a.alpha) {
            return refreshToggles;
        }
        return Unit.INSTANCE;
    }

    public static final Object buildDataJobs$lambda$7$sendMetrics(MetricsReporter metricsReporter, Nd.c cVar) {
        Object alpha = io.getunleash.android.metrics.a.alpha(metricsReporter, null, cVar, 1, null);
        if (alpha == Od.a.alpha) {
            return alpha;
        }
        return Unit.INSTANCE;
    }

    public static /* synthetic */ LocalBackup charlie(File file) {
        return localBackupFactory$lambda$0(file);
    }

    private final void emit(ImpressionEvent impressionEvent) {
        ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$emit$1(this, impressionEvent, null), 3);
    }

    private final void initializeLocalBackup() {
        ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$initializeLocalBackup$1(this, null), 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final LocalBackup localBackupFactory$lambda$0(File dir) {
        Intrinsics.echo(dir, "dir");
        return new LocalBackup(dir, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object readyOnFeaturesReceived(Nd.c<? super Unit> cVar) {
        DefaultUnleash$readyOnFeaturesReceived$1 defaultUnleash$readyOnFeaturesReceived$1;
        int i4;
        if (cVar instanceof DefaultUnleash$readyOnFeaturesReceived$1) {
            defaultUnleash$readyOnFeaturesReceived$1 = (DefaultUnleash$readyOnFeaturesReceived$1) cVar;
            int i5 = defaultUnleash$readyOnFeaturesReceived$1.label;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                defaultUnleash$readyOnFeaturesReceived$1.label = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = defaultUnleash$readyOnFeaturesReceived$1.result;
                Od.a aVar = Od.a.alpha;
                i4 = defaultUnleash$readyOnFeaturesReceived$1.label;
                if (i4 == 0) {
                    if (i4 == 1) {
                        ResultKt.alpha(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.alpha(obj);
                    InterfaceC3439i updatesFlow = this.cache.getUpdatesFlow();
                    DefaultUnleash$readyOnFeaturesReceived$first$1 defaultUnleash$readyOnFeaturesReceived$first$1 = new DefaultUnleash$readyOnFeaturesReceived$first$1(null);
                    defaultUnleash$readyOnFeaturesReceived$1.label = 1;
                    obj = AbstractC3428A.oscar(updatesFlow, defaultUnleash$readyOnFeaturesReceived$first$1, defaultUnleash$readyOnFeaturesReceived$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                }
                UnleashLogger unleashLogger = UnleashLogger.INSTANCE;
                UnleashLogger.d$default(unleashLogger, TAG, "Received first cache update: " + ((UnleashState) obj), null, 4, null);
                if (this.ready.compareAndSet(false, true)) {
                    UnleashLogger.d$default(unleashLogger, TAG, "Unleash state changed to ready", null, 4, null);
                }
                return Unit.INSTANCE;
            }
        }
        defaultUnleash$readyOnFeaturesReceived$1 = new DefaultUnleash$readyOnFeaturesReceived$1(this, cVar);
        Object obj2 = defaultUnleash$readyOnFeaturesReceived$1.result;
        Od.a aVar2 = Od.a.alpha;
        i4 = defaultUnleash$readyOnFeaturesReceived$1.label;
        if (i4 == 0) {
        }
        UnleashLogger unleashLogger2 = UnleashLogger.INSTANCE;
        UnleashLogger.d$default(unleashLogger2, TAG, "Received first cache update: " + ((UnleashState) obj2), null, 4, null);
        if (this.ready.compareAndSet(false, true)) {
        }
        return Unit.INSTANCE;
    }

    private final void registerListenerJob(UnleashListener listener, I job) {
        CopyOnWriteArrayList<I> putIfAbsent;
        CopyOnWriteArrayList<I> copyOnWriteArrayList = this.listenerJobs.get(listener);
        if (copyOnWriteArrayList == null && (putIfAbsent = this.listenerJobs.putIfAbsent(listener, (copyOnWriteArrayList = new CopyOnWriteArrayList<>()))) != null) {
            copyOnWriteArrayList = putIfAbsent;
        }
        copyOnWriteArrayList.add(job);
    }

    @Override // io.getunleash.android.Unleash
    public void addUnleashEventListener(@NotNull UnleashListener listener) {
        Intrinsics.echo(listener, "listener");
        if (listener instanceof UnleashReadyListener) {
            registerListenerJob(listener, ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$addUnleashEventListener$job$1(this, listener, null), 3));
        }
        if (listener instanceof UnleashStateListener) {
            registerListenerJob(listener, ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$addUnleashEventListener$job$2(this, listener, null), 3));
        }
        if (listener instanceof UnleashImpressionEventListener) {
            registerListenerJob(listener, ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$addUnleashEventListener$job$3(this, listener, null), 3));
        }
        if (listener instanceof UnleashFetcherHeartbeatListener) {
            registerListenerJob(listener, ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$addUnleashEventListener$job$4(this, listener, null), 3));
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        h hVar;
        this.networkStatusHelper.close();
        Collection<CopyOnWriteArrayList<I>> values = this.listenerJobs.values();
        Intrinsics.delta(values, "<get-values>(...)");
        Iterator<T> it = values.iterator();
        while (it.hasNext()) {
            CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) it.next();
            Intrinsics.checkNotNull(copyOnWriteArrayList);
            Iterator it2 = copyOnWriteArrayList.iterator();
            while (it2.hasNext()) {
                ((I) it2.next()).foxtrot(null);
            }
        }
        this.listenerJobs.clear();
        hVar = DefaultUnleashKt.job;
        ((P) hVar).foxtrot(ad.alpha("Unleash received closed signal", null));
    }

    @Override // io.getunleash.android.Unleash
    @NotNull
    public Variant getVariant(@NotNull String toggleName) {
        Variant disabledVariant;
        String str;
        Intrinsics.echo(toggleName, "toggleName");
        Toggle toggle = this.cache.get(toggleName);
        boolean isEnabled = isEnabled(toggleName);
        if (!isEnabled || toggle == null || (disabledVariant = toggle.getVariant()) == null) {
            disabledVariant = UnleashKt.getDisabledVariant();
        }
        Variant variant = disabledVariant;
        if (toggle != null ? toggle.getImpressionData() : this.unleashConfig.getForceImpressionData()) {
            str = toggleName;
            emit(new ImpressionEvent(str, isEnabled, (UnleashContext) ((N) this.unleashContextState).getValue(), variant.getName(), null, 16, null));
        } else {
            str = toggleName;
        }
        this.metrics.countVariant(str, variant);
        return variant;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if ((r0 != null ? r0.getImpressionData() : false) != false) goto L30;
     */
    @Override // io.getunleash.android.Unleash
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isEnabled(@NotNull String toggleName) {
        String str;
        Intrinsics.echo(toggleName, "toggleName");
        Toggle toggle = this.cache.get(toggleName);
        boolean z2 = false;
        boolean enabled = toggle != null ? toggle.getEnabled() : false;
        if (!this.unleashConfig.getForceImpressionData()) {
        }
        z2 = true;
        if (z2) {
            str = toggleName;
            emit(new ImpressionEvent(str, enabled, (UnleashContext) ((N) this.unleashContextState).getValue(), null, null, 24, null));
        } else {
            str = toggleName;
        }
        this.metrics.count(str, enabled);
        return enabled;
    }

    @Override // io.getunleash.android.Unleash
    public boolean isReady() {
        return this.ready.get();
    }

    @Override // io.getunleash.android.Unleash
    public void refreshTogglesNow() {
        ad.amber(i.alpha, new DefaultUnleash$refreshTogglesNow$1(this, null));
    }

    @Override // io.getunleash.android.Unleash
    public void refreshTogglesNowAsync() {
        ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$refreshTogglesNowAsync$1(this, null), 3);
    }

    @Override // io.getunleash.android.Unleash
    public void removeUnleashEventListener(@NotNull UnleashListener listener) {
        Intrinsics.echo(listener, "listener");
        CopyOnWriteArrayList<I> remove = this.listenerJobs.remove(listener);
        if (remove != null) {
            Iterator<T> it = remove.iterator();
            while (it.hasNext()) {
                try {
                    ((I) it.next()).foxtrot(null);
                } catch (Exception unused) {
                }
            }
        }
    }

    @Override // io.getunleash.android.Unleash
    public void sendMetricsNow() {
        if (this.unleashConfig.getMetricsStrategy().getEnabled()) {
            ad.amber(i.alpha, new DefaultUnleash$sendMetricsNow$1(this, null));
        }
    }

    @Override // io.getunleash.android.Unleash
    public void sendMetricsNowAsync() {
        if (!this.unleashConfig.getMetricsStrategy().getEnabled()) {
            return;
        }
        ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$sendMetricsNowAsync$1(this, null), 3);
    }

    @Override // io.getunleash.android.Unleash
    public void setContext(@NotNull UnleashContext context) {
        Intrinsics.echo(context, "context");
        if (this.started.get()) {
            ad.amber(i.alpha, new DefaultUnleash$setContext$1(this, context, null));
        }
        N n5 = (N) this.unleashContextState;
        n5.getClass();
        n5.juliet(null, context);
    }

    @Override // io.getunleash.android.Unleash
    public void setContextAsync(@NotNull UnleashContext context) {
        Intrinsics.echo(context, "context");
        N n5 = (N) this.unleashContextState;
        n5.getClass();
        n5.juliet(null, context);
    }

    @Override // io.getunleash.android.Unleash
    public void setContextWithTimeout(@NotNull UnleashContext context, long timeout) throws TimeoutException {
        DefaultUnleash defaultUnleash;
        UnleashContext unleashContext;
        Intrinsics.echo(context, "context");
        if (this.started.get()) {
            defaultUnleash = this;
            unleashContext = context;
            ad.amber(i.alpha, new DefaultUnleash$setContextWithTimeout$1(timeout, defaultUnleash, unleashContext, null));
        } else {
            defaultUnleash = this;
            unleashContext = context;
        }
        N n5 = (N) defaultUnleash.unleashContextState;
        n5.getClass();
        n5.juliet(null, unleashContext);
    }

    @Override // io.getunleash.android.Unleash
    public void start(@NotNull List<? extends UnleashListener> eventListeners, @Nullable File bootstrapFile, @NotNull List<Toggle> bootstrap) {
        int collectionSizeOrDefault;
        String readText$default;
        Intrinsics.echo(eventListeners, "eventListeners");
        Intrinsics.echo(bootstrap, "bootstrap");
        if (!this.started.compareAndSet(false, true)) {
            UnleashLogger.w$default(UnleashLogger.INSTANCE, TAG, "Unleash already started, ignoring start call", null, 4, null);
            return;
        }
        Iterator<T> it = this.initialListeners.iterator();
        while (it.hasNext()) {
            addUnleashEventListener((UnleashListener) it.next());
        }
        this.initialListeners.clear();
        Iterator<T> it2 = eventListeners.iterator();
        while (it2.hasNext()) {
            addUnleashEventListener((UnleashListener) it2.next());
        }
        this.networkStatusHelper.registerNetworkListener(this.taskManager);
        if (this.unleashConfig.getLocalStorageConfig().getEnabled()) {
            initializeLocalBackup();
        }
        if (this.unleashConfig.getPollingStrategy().getEnabled()) {
            this.fetcher.startWatchingContext();
        }
        ad.zulu(this.coroutineScope, null, null, new DefaultUnleash$start$3(this, null), 3);
        this.cache.subscribeTo(this.fetcher.getFeaturesReceivedFlow());
        this.lifecycle.alpha(this.taskManager);
        if (bootstrapFile != null && bootstrapFile.exists()) {
            UnleashLogger.i$default(UnleashLogger.INSTANCE, TAG, "Using provided bootstrap file", null, 4, null);
            JsonAdapter<ProxyResponse> proxyResponseAdapter = Parser.INSTANCE.getProxyResponseAdapter();
            readText$default = FilesKt__FileReadWriteKt.readText$default(bootstrapFile, null, 1, null);
            ProxyResponse fromJson = proxyResponseAdapter.fromJson(readText$default);
            if (fromJson != null) {
                List<Toggle> toggles = fromJson.getToggles();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj : toggles) {
                    String name = ((Toggle) obj).getName();
                    Object obj2 = linkedHashMap.get(name);
                    if (obj2 == null) {
                        obj2 = new ArrayList();
                        linkedHashMap.put(name, obj2);
                    }
                    ((List) obj2).add(obj);
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(y.quebec(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), (Toggle) CollectionsKt.gold((List) entry.getValue()));
                }
                this.cache.write(new UnleashState((UnleashContext) ((N) this.unleashContextState).getValue(), linkedHashMap2));
                return;
            }
            return;
        }
        if (!bootstrap.isEmpty()) {
            UnleashLogger.i$default(UnleashLogger.INSTANCE, TAG, "Using provided bootstrap toggles", null, 4, null);
            ObservableToggleCache observableToggleCache = this.cache;
            UnleashContext unleashContext = (UnleashContext) ((N) this.unleashContextState).getValue();
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(bootstrap, 10);
            int quebec = y.quebec(collectionSizeOrDefault);
            if (quebec < 16) {
                quebec = 16;
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap(quebec);
            for (Object obj3 : bootstrap) {
                linkedHashMap3.put(((Toggle) obj3).getName(), obj3);
            }
            observableToggleCache.write(new UnleashState(unleashContext, linkedHashMap3));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0023, code lost:
    
        if ((r0 != null ? r0.getImpressionData() : false) != false) goto L30;
     */
    @Override // io.getunleash.android.Unleash
    @kotlin.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean isEnabled(@NotNull String toggleName, boolean defaultValue) {
        boolean z2;
        String str;
        Intrinsics.echo(toggleName, "toggleName");
        Toggle toggle = this.cache.get(toggleName);
        if (toggle != null) {
            defaultValue = toggle.getEnabled();
        }
        boolean z10 = defaultValue;
        if (!this.unleashConfig.getForceImpressionData()) {
            z2 = false;
        }
        z2 = true;
        if (z2) {
            str = toggleName;
            emit(new ImpressionEvent(str, z10, (UnleashContext) ((N) this.unleashContextState).getValue(), null, null, 24, null));
        } else {
            str = toggleName;
        }
        this.metrics.count(str, z10);
        return z10;
    }

    @Override // io.getunleash.android.Unleash
    @kotlin.c
    @NotNull
    public Variant getVariant(@NotNull String toggleName, @NotNull Variant defaultValue) {
        String str;
        Variant variant;
        Intrinsics.echo(toggleName, "toggleName");
        Intrinsics.echo(defaultValue, "defaultValue");
        Toggle toggle = this.cache.get(toggleName);
        boolean isEnabled = isEnabled(toggleName);
        if (isEnabled && toggle != null && (variant = toggle.getVariant()) != null) {
            defaultValue = variant;
        }
        if (toggle != null ? toggle.getImpressionData() : this.unleashConfig.getForceImpressionData()) {
            str = toggleName;
            emit(new ImpressionEvent(str, isEnabled, (UnleashContext) ((N) this.unleashContextState).getValue(), defaultValue.getName(), null, 16, null));
        } else {
            str = toggleName;
        }
        this.metrics.countVariant(str, defaultValue);
        return defaultValue;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DefaultUnleash(Context context, UnleashConfig unleashConfig, UnleashContext unleashContext, ToggleCache toggleCache, List list, ac acVar, ab abVar, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, unleashConfig, r5, r6, (List<? extends UnleashListener>) r7, r8, (i4 & 64) != 0 ? DefaultUnleashKt.getUnleashScope() : abVar);
        ac acVar2;
        ac lifecycle;
        UnleashContext unleashContext2 = (i4 & 4) != 0 ? new UnleashContext(null, null, null, null, 15, null) : unleashContext;
        ToggleCache inMemoryToggleCache = (i4 & 8) != 0 ? new InMemoryToggleCache() : toggleCache;
        List emptyList = (i4 & 16) != 0 ? CollectionsKt.emptyList() : list;
        if ((i4 & 32) != 0) {
            lifecycle = DefaultUnleashKt.getLifecycle(context);
            acVar2 = lifecycle;
        } else {
            acVar2 = acVar;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ DefaultUnleash(Context context, UnleashConfig unleashConfig, UnleashContext unleashContext, ToggleCache toggleCache, List list, ac acVar, Function1 function1, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, unleashConfig, r5, r6, (List<? extends UnleashListener>) r7, r8, (Function1<? super File, ? extends LocalBackup>) function1);
        ac acVar2;
        ac lifecycle;
        UnleashContext unleashContext2 = (i4 & 4) != 0 ? new UnleashContext(null, null, null, null, 15, null) : unleashContext;
        ToggleCache inMemoryToggleCache = (i4 & 8) != 0 ? new InMemoryToggleCache() : toggleCache;
        List emptyList = (i4 & 16) != 0 ? CollectionsKt.emptyList() : list;
        if ((i4 & 32) != 0) {
            lifecycle = DefaultUnleashKt.getLifecycle(context);
            acVar2 = lifecycle;
        } else {
            acVar2 = acVar;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultUnleash(@NotNull Context androidContext, @NotNull UnleashConfig unleashConfig, @NotNull UnleashContext unleashContext, @NotNull ToggleCache cacheImpl, @NotNull List<? extends UnleashListener> eventListeners, @NotNull ac lifecycle, @NotNull Function1<? super File, ? extends LocalBackup> localBackupFactory) {
        this(androidContext, unleashConfig, unleashContext, cacheImpl, eventListeners, lifecycle, (ab) null, 64, (DefaultConstructorMarker) null);
        Intrinsics.echo(androidContext, "androidContext");
        Intrinsics.echo(unleashConfig, "unleashConfig");
        Intrinsics.echo(unleashContext, "unleashContext");
        Intrinsics.echo(cacheImpl, "cacheImpl");
        Intrinsics.echo(eventListeners, "eventListeners");
        Intrinsics.echo(lifecycle, "lifecycle");
        Intrinsics.echo(localBackupFactory, "localBackupFactory");
        this.localBackupFactory = localBackupFactory;
    }
}
