package com.clevertap.android.sdk.inapp.images.repo;

import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategy;
import com.clevertap.android.sdk.inapp.images.preload.FilePreloaderStrategy;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImpl;
import com.clevertap.android.sdk.inapp.store.preference.FileStore;
import com.clevertap.android.sdk.inapp.store.preference.InAppAssetsStore;
import com.clevertap.android.sdk.inapp.store.preference.LegacyInAppStore;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.d;
import kotlin.time.g;
import org.jetbrains.annotations.NotNull;
import u5.a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JO\u0010\u001f\u001a\u00020\u00142\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00190\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010\"\u001a\u00020\u00142\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010%J\u0089\u0001\u0010,\u001a\u00020\u00142\u0018\u0010&\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e0\u00172\u001e\u0010)\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020(0'\u0012\u0004\u0012\u00020\u00140\u001d2\u001e\u0010*\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0004\u0012\u00020\u00140\u001d2\u001e\u0010+\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u0012\u0004\u0012\u00020\u00140\u001dH\u0016¢\u0006\u0004\b,\u0010-J\u001d\u0010/\u001a\u00020\u00142\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0017H\u0016¢\u0006\u0004\b/\u0010#J\u0017\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u0010H\u0016¢\u0006\u0004\b3\u00102R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010;R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010<¨\u0006>"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/repo/FileResourcesRepoImpl;", "Lcom/clevertap/android/sdk/inapp/images/repo/FileResourcesRepo;", "Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "cleanupStrategy", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "preloaderStrategy", "Lcom/clevertap/android/sdk/inapp/store/preference/InAppAssetsStore;", "inAppAssetsStore", "Lcom/clevertap/android/sdk/inapp/store/preference/FileStore;", "fileStore", "Lcom/clevertap/android/sdk/inapp/store/preference/LegacyInAppStore;", "legacyInAppsStore", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;Lcom/clevertap/android/sdk/inapp/store/preference/InAppAssetsStore;Lcom/clevertap/android/sdk/inapp/store/preference/FileStore;Lcom/clevertap/android/sdk/inapp/store/preference/LegacyInAppStore;)V", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "meta", "Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "downloadState", "", "updateRepoStatus", "(Lkotlin/Pair;Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;)V", "", "validUrls", "", "currentTime", "", "allFileUrls", "Lkotlin/Function1;", "expiryTs", "cleanupStaleFilesNow", "(Ljava/util/List;JLjava/util/Set;Lkotlin/jvm/functions/Function1;)V", "cleanupUrls", "cleanupAllFiles", "(Ljava/util/List;)V", "repoUpdated", "()V", "urlMeta", "", "", "completionCallback", "successBlock", "failureBlock", "preloadFilesAndCache", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "urls", "cleanupStaleFiles", "cacheTpe", "cleanupExpiredResources", "(Lcom/clevertap/android/sdk/inapp/data/CtCacheType;)V", "cleanupAllResources", "Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "getCleanupStrategy", "()Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "getPreloaderStrategy", "()Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "Lcom/clevertap/android/sdk/inapp/store/preference/InAppAssetsStore;", "Lcom/clevertap/android/sdk/inapp/store/preference/FileStore;", "Lcom/clevertap/android/sdk/inapp/store/preference/LegacyInAppStore;", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileResourcesRepoImpl implements FileResourcesRepo {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final long EXPIRY_OFFSET_MILLIS;

    @NotNull
    private static final HashMap<String, DownloadState> downloadInProgressUrls;

    @NotNull
    private static final Object fetchAllFilesLock;

    @NotNull
    private static final Set<DownloadTriggerForUrls> urlTriggers;

    @NotNull
    private final FileCleanupStrategy cleanupStrategy;

    @NotNull
    private final FileStore fileStore;

    @NotNull
    private final InAppAssetsStore inAppAssetsStore;

    @NotNull
    private final LegacyInAppStore legacyInAppsStore;

    @NotNull
    private final FilePreloaderStrategy preloaderStrategy;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000e\u001a\u00020\u000f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0011H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/repo/FileResourcesRepoImpl$Companion;", "", "<init>", "()V", "EXPIRY_OFFSET_MILLIS", "", "urlTriggers", "", "Lcom/clevertap/android/sdk/inapp/images/repo/DownloadTriggerForUrls;", "downloadInProgressUrls", "Ljava/util/HashMap;", "", "Lcom/clevertap/android/sdk/inapp/images/repo/DownloadState;", "fetchAllFilesLock", "saveUrlExpiryToStore", "", "urlMeta", "Lkotlin/Pair;", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "storePair", "Lcom/clevertap/android/sdk/inapp/store/preference/FileStore;", "Lcom/clevertap/android/sdk/inapp/store/preference/InAppAssetsStore;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

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

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void saveUrlExpiryToStore(@NotNull Pair<String, ? extends CtCacheType> urlMeta, @NotNull Pair<FileStore, InAppAssetsStore> storePair) {
            Intrinsics.echo(urlMeta, "urlMeta");
            Intrinsics.echo(storePair, "storePair");
            String first = urlMeta.getFirst();
            long currentTimeMillis = FileResourcesRepoImpl.EXPIRY_OFFSET_MILLIS + System.currentTimeMillis();
            FileStore first2 = storePair.getFirst();
            InAppAssetsStore second = storePair.getSecond();
            int i4 = WhenMappings.$EnumSwitchMapping$0[urlMeta.getSecond().ordinal()];
            if (i4 != 1 && i4 != 2) {
                if (i4 == 3) {
                    first2.saveFileUrl(first, currentTimeMillis);
                    return;
                }
                throw new NoWhenBranchMatchedException();
            }
            second.saveAssetUrl(first, currentTimeMillis);
            first2.saveFileUrl(first, currentTimeMillis);
        }

        private Companion() {
        }
    }

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

    static {
        int i4 = b.silver;
        EXPIRY_OFFSET_MILLIS = b.charlie(g.papa(14, d.f12936a));
        urlTriggers = new LinkedHashSet();
        downloadInProgressUrls = new HashMap<>();
        fetchAllFilesLock = new Object();
    }

    public FileResourcesRepoImpl(@NotNull FileCleanupStrategy cleanupStrategy, @NotNull FilePreloaderStrategy preloaderStrategy, @NotNull InAppAssetsStore inAppAssetsStore, @NotNull FileStore fileStore, @NotNull LegacyInAppStore legacyInAppsStore) {
        Intrinsics.echo(cleanupStrategy, "cleanupStrategy");
        Intrinsics.echo(preloaderStrategy, "preloaderStrategy");
        Intrinsics.echo(inAppAssetsStore, "inAppAssetsStore");
        Intrinsics.echo(fileStore, "fileStore");
        Intrinsics.echo(legacyInAppsStore, "legacyInAppsStore");
        this.cleanupStrategy = cleanupStrategy;
        this.preloaderStrategy = preloaderStrategy;
        this.inAppAssetsStore = inAppAssetsStore;
        this.fileStore = fileStore;
        this.legacyInAppsStore = legacyInAppsStore;
    }

    private final void cleanupAllFiles(List<String> cleanupUrls) {
        getCleanupStrategy().clearFileAssets(cleanupUrls, new a(this, 0));
    }

    public static final Unit cleanupAllFiles$lambda$7(FileResourcesRepoImpl this$0, String url) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(url, "url");
        this$0.fileStore.clearFileUrl(url);
        this$0.inAppAssetsStore.clearAssetUrl(url);
        return Unit.INSTANCE;
    }

    private final void cleanupStaleFilesNow(List<String> validUrls, long currentTime, Set<String> allFileUrls, Function1<? super String, Long> expiryTs) {
        int collectionSizeOrDefault;
        boolean z2;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(validUrls, 10);
        int quebec = y.quebec(collectionSizeOrDefault);
        if (quebec < 16) {
            quebec = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
        for (Object obj : validUrls) {
            linkedHashMap.put(obj, (String) obj);
        }
        LinkedHashSet C = CollectionsKt.C(allFileUrls);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : C) {
            String str = (String) obj2;
            boolean containsKey = linkedHashMap.containsKey(str);
            if (currentTime > expiryTs.invoke(str).longValue()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!containsKey && z2) {
                arrayList.add(obj2);
            }
        }
        cleanupAllFiles(arrayList);
    }

    public static /* synthetic */ void cleanupStaleFilesNow$default(FileResourcesRepoImpl fileResourcesRepoImpl, List list, long j5, Set set, Function1 function1, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        if ((i4 & 2) != 0) {
            j5 = System.currentTimeMillis();
        }
        if ((i4 & 4) != 0) {
            set = ab.mike(fileResourcesRepoImpl.fileStore.getAllFileUrls(), fileResourcesRepoImpl.inAppAssetsStore.getAllAssetUrls());
        }
        if ((i4 & 8) != 0) {
            function1 = new a(fileResourcesRepoImpl, 2);
        }
        List list2 = list;
        fileResourcesRepoImpl.cleanupStaleFilesNow(list2, j5, set, function1);
    }

    public static final long cleanupStaleFilesNow$lambda$4(FileResourcesRepoImpl this$0, String key) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(key, "key");
        return Math.max(this$0.fileStore.expiryForUrl(key), this$0.inAppAssetsStore.expiryForUrl(key));
    }

    public static final Unit preloadFilesAndCache$lambda$0(FileResourcesRepoImpl this$0, Function1 successBlock, Pair meta) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(successBlock, "$successBlock");
        Intrinsics.echo(meta, "meta");
        INSTANCE.saveUrlExpiryToStore(meta, new Pair<>(this$0.fileStore, this$0.inAppAssetsStore));
        this$0.updateRepoStatus(meta, DownloadState.SUCCESSFUL);
        successBlock.invoke(meta);
        return Unit.INSTANCE;
    }

    public static final Unit preloadFilesAndCache$lambda$1(FileResourcesRepoImpl this$0, Function1 failureBlock, Pair meta) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(failureBlock, "$failureBlock");
        Intrinsics.echo(meta, "meta");
        this$0.updateRepoStatus(meta, DownloadState.FAILED);
        failureBlock.invoke(meta);
        return Unit.INSTANCE;
    }

    public static final Unit preloadFilesAndCache$lambda$2(FileResourcesRepoImpl this$0, Pair meta) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(meta, "meta");
        this$0.updateRepoStatus(meta, DownloadState.IN_PROGRESS);
        return Unit.INSTANCE;
    }

    private final void repoUpdated() {
        for (DownloadTriggerForUrls downloadTriggerForUrls : urlTriggers) {
            List<String> urls = downloadTriggerForUrls.getUrls();
            if (urls == null || !urls.isEmpty()) {
                for (String str : urls) {
                    HashMap<String, DownloadState> hashMap = downloadInProgressUrls;
                    if (hashMap.get(str) == DownloadState.SUCCESSFUL || hashMap.get(str) == DownloadState.FAILED) {
                    }
                }
            }
            downloadTriggerForUrls.getCallback().invoke();
        }
    }

    public static final void saveUrlExpiryToStore(@NotNull Pair<String, ? extends CtCacheType> pair, @NotNull Pair<FileStore, InAppAssetsStore> pair2) {
        INSTANCE.saveUrlExpiryToStore(pair, pair2);
    }

    private final void updateRepoStatus(Pair<String, ? extends CtCacheType> meta, DownloadState downloadState) {
        if (urlTriggers.isEmpty()) {
            return;
        }
        synchronized (fetchAllFilesLock) {
            downloadInProgressUrls.put(meta.getFirst(), downloadState);
            repoUpdated();
        }
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    public void cleanupAllResources(@NotNull CtCacheType cacheTpe) {
        Set<String> allAssetUrls;
        Intrinsics.echo(cacheTpe, "cacheTpe");
        int i4 = WhenMappings.$EnumSwitchMapping$0[cacheTpe.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                allAssetUrls = ab.mike(this.fileStore.getAllFileUrls(), this.inAppAssetsStore.getAllAssetUrls());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            allAssetUrls = this.inAppAssetsStore.getAllAssetUrls();
        }
        cleanupAllFiles(CollectionsKt.z(allAssetUrls));
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    public void cleanupExpiredResources(@NotNull CtCacheType cacheTpe) {
        Set<String> allAssetUrls;
        Intrinsics.echo(cacheTpe, "cacheTpe");
        int i4 = WhenMappings.$EnumSwitchMapping$0[cacheTpe.ordinal()];
        if (i4 != 1 && i4 != 2) {
            if (i4 == 3) {
                allAssetUrls = ab.mike(this.fileStore.getAllFileUrls(), this.inAppAssetsStore.getAllAssetUrls());
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            allAssetUrls = this.inAppAssetsStore.getAllAssetUrls();
        }
        cleanupStaleFilesNow$default(this, null, 0L, allAssetUrls, null, 11, null);
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    public void cleanupStaleFiles() {
        FileResourcesRepo.DefaultImpls.cleanupStaleFiles(this);
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    @NotNull
    public FileCleanupStrategy getCleanupStrategy() {
        return this.cleanupStrategy;
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    @NotNull
    public FilePreloaderStrategy getPreloaderStrategy() {
        return this.preloaderStrategy;
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    public void preloadFilesAndCache(@NotNull List<? extends Pair<String, ? extends CtCacheType>> list) {
        FileResourcesRepo.DefaultImpls.preloadFilesAndCache(this, list);
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    public void cleanupStaleFiles(@NotNull List<String> urls) {
        Intrinsics.echo(urls, "urls");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.legacyInAppsStore.lastCleanupTs() < EXPIRY_OFFSET_MILLIS) {
            return;
        }
        cleanupStaleFilesNow$default(this, urls, currentTimeMillis, null, null, 12, null);
        this.legacyInAppsStore.updateAssetCleanupTs(currentTimeMillis);
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    public void preloadFilesAndCache(@NotNull List<? extends Pair<String, ? extends CtCacheType>> list, @NotNull Function1<? super Map<String, Boolean>, Unit> function1) {
        FileResourcesRepo.DefaultImpls.preloadFilesAndCache(this, list, function1);
    }

    @Override // com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepo
    public void preloadFilesAndCache(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMeta, @NotNull Function1<? super Map<String, Boolean>, Unit> completionCallback, @NotNull final Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull final Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock) {
        Intrinsics.echo(urlMeta, "urlMeta");
        Intrinsics.echo(completionCallback, "completionCallback");
        Intrinsics.echo(successBlock, "successBlock");
        Intrinsics.echo(failureBlock, "failureBlock");
        final int i4 = 0;
        Function1<? super Pair<String, ? extends CtCacheType>, Unit> function1 = new Function1(this) { // from class: u5.b
            public final /* synthetic */ FileResourcesRepoImpl purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit preloadFilesAndCache$lambda$0;
                Unit preloadFilesAndCache$lambda$1;
                switch (i4) {
                    case 0:
                        preloadFilesAndCache$lambda$0 = FileResourcesRepoImpl.preloadFilesAndCache$lambda$0(this.purple, successBlock, (Pair) obj);
                        return preloadFilesAndCache$lambda$0;
                    default:
                        preloadFilesAndCache$lambda$1 = FileResourcesRepoImpl.preloadFilesAndCache$lambda$1(this.purple, successBlock, (Pair) obj);
                        return preloadFilesAndCache$lambda$1;
                }
            }
        };
        final int i5 = 1;
        getPreloaderStrategy().preloadFilesAndCache(urlMeta, function1, new Function1(this) { // from class: u5.b
            public final /* synthetic */ FileResourcesRepoImpl purple;

            {
                this.purple = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                Unit preloadFilesAndCache$lambda$0;
                Unit preloadFilesAndCache$lambda$1;
                switch (i5) {
                    case 0:
                        preloadFilesAndCache$lambda$0 = FileResourcesRepoImpl.preloadFilesAndCache$lambda$0(this.purple, failureBlock, (Pair) obj);
                        return preloadFilesAndCache$lambda$0;
                    default:
                        preloadFilesAndCache$lambda$1 = FileResourcesRepoImpl.preloadFilesAndCache$lambda$1(this.purple, failureBlock, (Pair) obj);
                        return preloadFilesAndCache$lambda$1;
                }
            }
        }, new a(this, 1), completionCallback);
    }
}
