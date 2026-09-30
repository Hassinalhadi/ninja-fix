package com.clevertap.android.sdk.inapp.images.preload;

import Ya.c;
import bz.h0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.utils.CtDefaultDispatchers;
import com.clevertap.android.sdk.utils.DispatcherProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.d;
import kotlin.time.g;
import kotlinx.coroutines.CoroutineExceptionHandler;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vf.C3221z;
import vf.I;
import vf.ab;
import vf.ad;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001BK\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010JÑ\u0001\u0010\u001f\u001a\u00020\u00172\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00170\u00162 \b\u0002\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00170\u00162 \b\u0002\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00170\u00162 \b\u0002\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001b\u0012\u0004\u0012\u00020\u00170\u00162 \u0010\u001e\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J©\u0001\u0010!\u001a\u00020\u00172\u0018\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u00112\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00170\u00162\u001e\u0010\u0019\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00170\u00162\u001e\u0010\u001a\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0004\u0012\u00020\u00170\u00162\u001e\u0010\u001c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u001b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0016¢\u0006\u0004\b#\u0010$R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00101R\u001a\u00104\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;¨\u0006<"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderCoroutine;", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "Lcom/clevertap/android/sdk/ILogger;", "logger", "Lcom/clevertap/android/sdk/utils/DispatcherProvider;", "dispatchers", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", Constants.KEY_CONFIG, "", "timeoutForPreload", "", "deepLogging", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/clevertap/android/sdk/ILogger;Lcom/clevertap/android/sdk/utils/DispatcherProvider;Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;JZ)V", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMetas", "Lkotlin/Function1;", "", "successBlock", "failureBlock", "startedBlock", "", "preloadFinished", "", "assetBlock", "preloadAssets", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "preloadFilesAndCache", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "cleanup", "()V", "Lkotlin/jvm/functions/Function0;", "getFileResourceProvider", "()Lkotlin/jvm/functions/Function0;", "Lcom/clevertap/android/sdk/ILogger;", "getLogger", "()Lcom/clevertap/android/sdk/ILogger;", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", "getConfig", "()Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", "J", "getTimeoutForPreload", "()J", "Z", "", "Lvf/I;", "jobs", "Ljava/util/List;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "handler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "Lvf/ab;", "scope", "Lvf/ab;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilePreloaderCoroutine implements FilePreloaderStrategy {

    @NotNull
    private final FilePreloadConfig config;
    private final boolean deepLogging;

    @NotNull
    private final Function0<FileResourceProvider> fileResourceProvider;

    @NotNull
    private final CoroutineExceptionHandler handler;

    @NotNull
    private final List<I> jobs;

    @Nullable
    private final ILogger logger;

    @NotNull
    private final ab scope;
    private final long timeoutForPreload;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CtCacheType.values().length];
            try {
                iArr[CtCacheType.IMAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CtCacheType.GIF.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CtCacheType.FILES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine(@NotNull Function0<FileResourceProvider> fileResourceProvider) {
        this(fileResourceProvider, null, null, null, 0L, false, 62, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
    }

    public static /* synthetic */ Object alpha(FilePreloaderCoroutine filePreloaderCoroutine, Pair pair) {
        return preloadFilesAndCache$lambda$1(filePreloaderCoroutine, pair);
    }

    public static /* synthetic */ Unit bravo(Pair pair) {
        return preloadAssets$lambda$3(pair);
    }

    public static /* synthetic */ Unit charlie(Pair pair) {
        return preloadAssets$lambda$2(pair);
    }

    public static /* synthetic */ Unit delta(Map map) {
        return preloadAssets$lambda$4(map);
    }

    private final void preloadAssets(List<? extends Pair<String, ? extends CtCacheType>> urlMetas, Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, Function1<? super Map<String, Boolean>, Unit> preloadFinished, Function1<? super Pair<String, ? extends CtCacheType>, ? extends Object> assetBlock) {
        this.jobs.add(ad.zulu(this.scope, this.handler, null, new FilePreloaderCoroutine$preloadAssets$job$1(urlMetas, this, preloadFinished, startedBlock, assetBlock, successBlock, failureBlock, null), 2));
    }

    public static /* synthetic */ void preloadAssets$default(FilePreloaderCoroutine filePreloaderCoroutine, List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function12 = new h0(25);
        }
        Function1 function16 = function12;
        if ((i4 & 8) != 0) {
            function13 = new h0(26);
        }
        Function1 function17 = function13;
        if ((i4 & 16) != 0) {
            function14 = new h0(27);
        }
        filePreloaderCoroutine.preloadAssets(list, function1, function16, function17, function14, function15);
    }

    public static final Unit preloadAssets$lambda$2(Pair it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit preloadAssets$lambda$3(Pair it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final Unit preloadAssets$lambda$4(Map it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final Object preloadFilesAndCache$lambda$1(FilePreloaderCoroutine this$0, Pair urlMeta) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(urlMeta, "urlMeta");
        String str = (String) urlMeta.getFirst();
        int i4 = WhenMappings.$EnumSwitchMapping$0[((CtCacheType) urlMeta.getSecond()).ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return this$0.getFileResourceProvider().invoke().fetchFile(str);
                }
                throw new NoWhenBranchMatchedException();
            }
            return this$0.getFileResourceProvider().invoke().fetchInAppGifV1(str);
        }
        return this$0.getFileResourceProvider().invoke().fetchInAppImageV1(str);
    }

    @Override // com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy
    public void cleanup() {
        Iterator<T> it = this.jobs.iterator();
        while (it.hasNext()) {
            ((I) it.next()).foxtrot(null);
        }
    }

    @Override // com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy
    @NotNull
    public FilePreloadConfig getConfig() {
        return this.config;
    }

    @Override // com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy
    @NotNull
    public Function0<FileResourceProvider> getFileResourceProvider() {
        return this.fileResourceProvider;
    }

    @Override // com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy
    @Nullable
    public ILogger getLogger() {
        return this.logger;
    }

    @Override // com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy
    public long getTimeoutForPreload() {
        return this.timeoutForPreload;
    }

    @Override // com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy
    public void preloadFilesAndCache(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMetas, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, @NotNull Function1<? super Map<String, Boolean>, Unit> preloadFinished) {
        Intrinsics.echo(urlMetas, "urlMetas");
        Intrinsics.echo(successBlock, "successBlock");
        Intrinsics.echo(failureBlock, "failureBlock");
        Intrinsics.echo(startedBlock, "startedBlock");
        Intrinsics.echo(preloadFinished, "preloadFinished");
        preloadAssets(urlMetas, successBlock, failureBlock, startedBlock, preloadFinished, new c(24, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger) {
        this(fileResourceProvider, iLogger, null, null, 0L, false, 60, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger, @NotNull DispatcherProvider dispatchers) {
        this(fileResourceProvider, iLogger, dispatchers, null, 0L, false, 56, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(dispatchers, "dispatchers");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger, @NotNull DispatcherProvider dispatchers, @NotNull FilePreloadConfig config) {
        this(fileResourceProvider, iLogger, dispatchers, config, 0L, false, 48, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(dispatchers, "dispatchers");
        Intrinsics.echo(config, "config");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilePreloaderCoroutine(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger, @NotNull DispatcherProvider dispatchers, @NotNull FilePreloadConfig config, long j5) {
        this(fileResourceProvider, iLogger, dispatchers, config, j5, false, 32, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(dispatchers, "dispatchers");
        Intrinsics.echo(config, "config");
    }

    public FilePreloaderCoroutine(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger, @NotNull DispatcherProvider dispatchers, @NotNull FilePreloadConfig config, long j5, boolean z2) {
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(dispatchers, "dispatchers");
        Intrinsics.echo(config, "config");
        this.fileResourceProvider = fileResourceProvider;
        this.logger = iLogger;
        this.config = config;
        this.timeoutForPreload = j5;
        this.deepLogging = z2;
        this.jobs = new ArrayList();
        this.handler = new FilePreloaderCoroutine$special$$inlined$CoroutineExceptionHandler$1(C3221z.alpha, this);
        this.scope = ad.charlie(dispatchers.io().jade(getConfig().getParallelDownloads()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FilePreloaderCoroutine(Function0 function0, ILogger iLogger, DispatcherProvider dispatcherProvider, FilePreloadConfig filePreloadConfig, long j5, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, r0, r1, r2, r3, (i4 & 32) != 0 ? false : z2);
        long j6;
        ILogger iLogger2 = (i4 & 2) != 0 ? null : iLogger;
        DispatcherProvider ctDefaultDispatchers = (i4 & 4) != 0 ? new CtDefaultDispatchers() : dispatcherProvider;
        FilePreloadConfig m201default = (i4 & 8) != 0 ? FilePreloadConfig.INSTANCE.m201default() : filePreloadConfig;
        if ((i4 & 16) != 0) {
            int i5 = b.silver;
            j6 = b.charlie(g.papa(5, d.white));
        } else {
            j6 = j5;
        }
    }
}
