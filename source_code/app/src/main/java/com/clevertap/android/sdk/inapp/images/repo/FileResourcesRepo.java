package com.clevertap.android.sdk.inapp.images.repo;

import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategy;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pf.C2361k;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J)\u0010\b\u001a\u00020\u00072\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJI\u0010\b\u001a\u00020\u00072\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022\u001e\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00070\nH\u0016¢\u0006\u0004\b\b\u0010\u000eJ\u008f\u0001\u0010\b\u001a\u00020\u00072\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022 \b\u0002\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00070\n2 \b\u0002\u0010\u000f\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00070\n2 \b\u0002\u0010\u0010\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\u00070\nH&¢\u0006\u0004\b\b\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0012\u001a\u00020\u00072\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0002H&¢\u0006\u0004\b\u0012\u0010\tJ\u0017\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H&¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0015\u001a\u00020\u0005H&¢\u0006\u0004\b\u0018\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/repo/FileResourcesRepo;", "", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMeta", "", "preloadFilesAndCache", "(Ljava/util/List;)V", "Lkotlin/Function1;", "", "", "completionCallback", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "successBlock", "failureBlock", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "cleanupStaleFiles", "()V", "urls", "cacheTpe", "cleanupExpiredResources", "(Lcom/clevertap/android/sdk/inapp/data/CtCacheType;)V", "cleanupAllResources", "Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "getCleanupStrategy", "()Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "cleanupStrategy", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "getPreloaderStrategy", "()Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "preloaderStrategy", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FileResourcesRepo {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Unit alpha(Pair pair) {
            return preloadFilesAndCache$lambda$1(pair);
        }

        public static /* synthetic */ Unit bravo(Map map) {
            return preloadFilesAndCache$lambda$5(map);
        }

        public static /* synthetic */ Unit charlie(Pair pair) {
            return preloadFilesAndCache$lambda$2(pair);
        }

        public static void cleanupStaleFiles(@NotNull FileResourcesRepo fileResourcesRepo) {
            fileResourcesRepo.cleanupStaleFiles(CollectionsKt.emptyList());
        }

        public static /* synthetic */ Unit delta(Pair pair) {
            return preloadFilesAndCache$lambda$3(pair);
        }

        public static /* synthetic */ Unit echo(Map map) {
            return preloadFilesAndCache$lambda$0(map);
        }

        public static /* synthetic */ Unit foxtrot(Pair pair) {
            return preloadFilesAndCache$lambda$6(pair);
        }

        public static /* synthetic */ Unit golf(Pair pair) {
            return preloadFilesAndCache$lambda$7(pair);
        }

        public static /* synthetic */ Unit hotel(Pair pair) {
            return preloadFilesAndCache$lambda$4(pair);
        }

        public static void preloadFilesAndCache(@NotNull FileResourcesRepo fileResourcesRepo, @NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta) {
            Intrinsics.echo(urlMeta, "urlMeta");
            fileResourcesRepo.preloadFilesAndCache(urlMeta, new C2361k(12), new C2361k(13), new C2361k(14));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ void preloadFilesAndCache$default(FileResourcesRepo fileResourcesRepo, List list, Function1 function1, Function1 function12, Function1 function13, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    function1 = new C2361k(15);
                }
                if ((i4 & 4) != 0) {
                    function12 = new C2361k(16);
                }
                if ((i4 & 8) != 0) {
                    function13 = new C2361k(17);
                }
                fileResourcesRepo.preloadFilesAndCache(list, function1, function12, function13);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preloadFilesAndCache");
        }

        public static Unit preloadFilesAndCache$lambda$0(Map it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }

        public static Unit preloadFilesAndCache$lambda$1(Pair it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }

        public static Unit preloadFilesAndCache$lambda$2(Pair it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }

        public static Unit preloadFilesAndCache$lambda$3(Pair it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }

        public static Unit preloadFilesAndCache$lambda$4(Pair it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }

        public static Unit preloadFilesAndCache$lambda$5(Map it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }

        public static Unit preloadFilesAndCache$lambda$6(Pair it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }

        public static Unit preloadFilesAndCache$lambda$7(Pair it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }

        public static void preloadFilesAndCache(@NotNull FileResourcesRepo fileResourcesRepo, @NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta, @NotNull Function1<? super Map<String, Boolean>, Unit> completionCallback) {
            Intrinsics.echo(urlMeta, "urlMeta");
            Intrinsics.echo(completionCallback, "completionCallback");
            fileResourcesRepo.preloadFilesAndCache(urlMeta, completionCallback, new C2361k(18), new C2361k(19));
        }
    }

    void cleanupAllResources(@NotNull CtCacheType cacheTpe);

    void cleanupExpiredResources(@NotNull CtCacheType cacheTpe);

    void cleanupStaleFiles();

    void cleanupStaleFiles(@NotNull List<String> urls);

    @NotNull
    FileCleanupStrategy getCleanupStrategy();

    @NotNull
    FilePreloaderStrategy getPreloaderStrategy();

    void preloadFilesAndCache(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta);

    void preloadFilesAndCache(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta, @NotNull Function1<? super Map<String, Boolean>, Unit> completionCallback);

    void preloadFilesAndCache(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta, @NotNull Function1<? super Map<String, Boolean>, Unit> completionCallback, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock);
}
