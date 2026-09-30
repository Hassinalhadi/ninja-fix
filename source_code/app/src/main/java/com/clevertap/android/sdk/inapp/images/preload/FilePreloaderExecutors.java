package com.clevertap.android.sdk.inapp.images.preload;

import O7.z;
import Ya.c;
import bz.h0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.task.Task;
import com.clevertap.android.sdk.u;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.d;
import kotlin.time.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0000\u0018\u00002\u00020\u0001BA\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJÍ\u0001\u0010\u001e\u001a\u00020\u00152\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f2\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u00150\u00142 \b\u0002\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u00150\u00142\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u00150\u00142\u001e\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u00150\u00142 \u0010\u001d\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u0014H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ©\u0001\u0010 \u001a\u00020\u00152\u0018\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u00100\u000f2\u001e\u0010\u0016\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u00150\u00142\u001e\u0010\u0017\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u00150\u00142\u001e\u0010\u0018\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010\u0012\u0004\u0012\u00020\u00150\u00142\u001e\u0010\u001b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001a0\u0019\u0012\u0004\u0012\u00020\u00150\u0014H\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\"\u0010#R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010'\u001a\u0004\b(\u0010)R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderExecutors;", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "Lcom/clevertap/android/sdk/ILogger;", "logger", "Lcom/clevertap/android/sdk/task/CTExecutors;", "executor", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", Constants.KEY_CONFIG, "", "timeoutForPreload", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/clevertap/android/sdk/ILogger;Lcom/clevertap/android/sdk/task/CTExecutors;Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;J)V", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMetas", "Lkotlin/Function1;", "", "successBlock", "failureBlock", "startedBlock", "", "", "preloadFinished", "", "assetBlock", "preloadAssets", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "preloadFilesAndCache", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "cleanup", "()V", "Lkotlin/jvm/functions/Function0;", "getFileResourceProvider", "()Lkotlin/jvm/functions/Function0;", "Lcom/clevertap/android/sdk/ILogger;", "getLogger", "()Lcom/clevertap/android/sdk/ILogger;", "Lcom/clevertap/android/sdk/task/CTExecutors;", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", "getConfig", "()Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", "J", "getTimeoutForPreload", "()J", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FilePreloaderExecutors implements FilePreloaderStrategy {

    @NotNull
    private final FilePreloadConfig config;

    @NotNull
    private final CTExecutors executor;

    @NotNull
    private final Function0<FileResourceProvider> fileResourceProvider;

    @Nullable
    private final ILogger logger;
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
    public FilePreloaderExecutors(@NotNull Function0<FileResourceProvider> fileResourceProvider) {
        this(fileResourceProvider, null, null, null, 0L, 30, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
    }

    public static /* synthetic */ Unit echo(Pair pair) {
        return preloadAssets$lambda$1(pair);
    }

    private final void preloadAssets(List<? extends Pair<String, ? extends CtCacheType>> urlMetas, Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, Function1<? super Map<String, Boolean>, Unit> preloadFinished, Function1<? super Pair<String, ? extends CtCacheType>, ? extends Object> assetBlock) {
        int collectionSizeOrDefault;
        int collectionSizeOrDefault2;
        CountDownLatch countDownLatch = new CountDownLatch(urlMetas.size());
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(urlMetas, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator<T> it = urlMetas.iterator();
        while (it.hasNext()) {
            arrayList.add(new Pair(((Pair) it.next()).getFirst(), Boolean.FALSE));
        }
        collectionSizeOrDefault2 = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        int quebec = y.quebec(collectionSizeOrDefault2);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        LinkedHashMap amber = y.amber(linkedHashMap);
        for (Pair<String, ? extends CtCacheType> pair2 : urlMetas) {
            Task ioTaskWithCallbackOnCurrentThread = this.executor.ioTaskWithCallbackOnCurrentThread();
            ioTaskWithCallbackOnCurrentThread.addOnSuccessListener(new z(countDownLatch));
            ioTaskWithCallbackOnCurrentThread.addOnFailureListener(new z(countDownLatch));
            ioTaskWithCallbackOnCurrentThread.execute("tag", new u(startedBlock, pair2, assetBlock, amber, successBlock, failureBlock, 1));
        }
        try {
            if (countDownLatch.await(5L, TimeUnit.MINUTES)) {
                preloadFinished.invoke(amber);
            }
        } catch (InterruptedException unused) {
        }
    }

    public static /* synthetic */ void preloadAssets$default(FilePreloaderExecutors filePreloaderExecutors, List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, Function1 function15, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function12 = new h0(28);
        }
        filePreloaderExecutors.preloadAssets(list, function1, function12, function13, function14, function15);
    }

    public static final Unit preloadAssets$lambda$1(Pair it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static final void preloadAssets$lambda$4(CountDownLatch countDownLatch, Unit unit) {
        Intrinsics.echo(countDownLatch, "$countDownLatch");
        countDownLatch.countDown();
    }

    public static final void preloadAssets$lambda$5(CountDownLatch countDownLatch, Exception exc) {
        Intrinsics.echo(countDownLatch, "$countDownLatch");
        countDownLatch.countDown();
    }

    public static final Unit preloadAssets$lambda$6(Function1 startedBlock, Pair url, Function1 assetBlock, Map downloadStatus, Function1 successBlock, Function1 failureBlock) {
        Intrinsics.echo(startedBlock, "$startedBlock");
        Intrinsics.echo(url, "$url");
        Intrinsics.echo(assetBlock, "$assetBlock");
        Intrinsics.echo(downloadStatus, "$downloadStatus");
        Intrinsics.echo(successBlock, "$successBlock");
        Intrinsics.echo(failureBlock, "$failureBlock");
        startedBlock.invoke(url);
        if (assetBlock.invoke(url) != null) {
            downloadStatus.put(url.getFirst(), Boolean.TRUE);
            successBlock.invoke(url);
        } else {
            downloadStatus.put(url.getFirst(), Boolean.FALSE);
            failureBlock.invoke(url);
        }
        return Unit.INSTANCE;
    }

    public static final Object preloadFilesAndCache$lambda$0(FilePreloaderExecutors this$0, Pair urlMeta) {
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
        preloadAssets(urlMetas, successBlock, failureBlock, startedBlock, preloadFinished, new c(25, this));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilePreloaderExecutors(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger) {
        this(fileResourceProvider, iLogger, null, null, 0L, 28, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilePreloaderExecutors(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger, @NotNull CTExecutors executor) {
        this(fileResourceProvider, iLogger, executor, null, 0L, 24, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(executor, "executor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FilePreloaderExecutors(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger, @NotNull CTExecutors executor, @NotNull FilePreloadConfig config) {
        this(fileResourceProvider, iLogger, executor, config, 0L, 16, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(executor, "executor");
        Intrinsics.echo(config, "config");
    }

    public FilePreloaderExecutors(@NotNull Function0<FileResourceProvider> fileResourceProvider, @Nullable ILogger iLogger, @NotNull CTExecutors executor, @NotNull FilePreloadConfig config, long j5) {
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(executor, "executor");
        Intrinsics.echo(config, "config");
        this.fileResourceProvider = fileResourceProvider;
        this.logger = iLogger;
        this.executor = executor;
        this.config = config;
        this.timeoutForPreload = j5;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FilePreloaderExecutors(Function0 function0, ILogger iLogger, CTExecutors cTExecutors, FilePreloadConfig filePreloadConfig, long j5, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, r2, r3, r4, j5);
        ILogger iLogger2 = (i4 & 2) != 0 ? null : iLogger;
        CTExecutors executorResourceDownloader = (i4 & 4) != 0 ? CTExecutorFactory.executorResourceDownloader() : cTExecutors;
        FilePreloadConfig m201default = (i4 & 8) != 0 ? FilePreloadConfig.INSTANCE.m201default() : filePreloadConfig;
        if ((i4 & 16) != 0) {
            int i5 = b.silver;
            j5 = b.charlie(g.papa(5, d.white));
        }
    }
}
