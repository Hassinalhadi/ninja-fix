package com.clevertap.android.sdk.inapp.images;

import android.content.Context;
import android.graphics.Bitmap;
import bz.h0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.memory.FileMemoryAccessObject;
import com.clevertap.android.sdk.inapp.images.memory.InAppGifMemoryAccessObjectV1;
import com.clevertap.android.sdk.inapp.images.memory.InAppImageMemoryAccessObjectV1;
import com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject;
import com.clevertap.android.sdk.inapp.images.memory.MemoryCreator;
import com.clevertap.android.sdk.inapp.images.memory.MemoryDataTransformationType;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImplKt;
import com.clevertap.android.sdk.network.DownloadedBitmap;
import com.clevertap.android.sdk.utils.CTCaches;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 C2\u00020\u0001:\u0001CBg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015B\u001d\b\u0016\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0014\u0010\u0018J8\u0010\u001e\u001a\u00020\u001f\"\u0004\b\u0000\u0010 2\u0006\u0010!\u001a\u00020\"2\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u00020%0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H 0\u001dH\u0002J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\"J\u0012\u0010)\u001a\u0004\u0018\u00010*2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0012\u0010+\u001a\u0004\u0018\u00010%2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0012\u0010,\u001a\u0004\u0018\u00010%2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0012\u0010-\u001a\u0004\u0018\u00010\"2\b\u0010!\u001a\u0004\u0018\u00010\"J\u0012\u0010.\u001a\u0004\u0018\u00010\u00032\b\u0010!\u001a\u0004\u0018\u00010\"J\u0010\u0010/\u001a\u0004\u0018\u00010*2\u0006\u0010(\u001a\u00020\"J\u0010\u00100\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\"J\u0010\u00101\u001a\u0004\u0018\u00010%2\u0006\u0010(\u001a\u00020\"J\u001e\u00102\u001a\u0010\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020%\u0018\u00010$2\u0006\u00103\u001a\u000204H\u0002J\u000e\u00105\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\"J9\u00106\u001a\u0004\u0018\u0001H \"\u0004\b\u0000\u0010 2\u0014\u00107\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\"\u0012\u0004\u0012\u00020\u001b0$2\f\u00108\u001a\b\u0012\u0004\u0012\u0002H 09H\u0002¢\u0006\u0002\u0010:Jo\u0010;\u001a\u0004\u0018\u0001H \"\u0004\b\u0000\u0010 2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001b0$2\f\u0010&\u001a\b\u0012\u0004\u0012\u0002H 0\u001d2\u0014\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0006\u0012\u0004\u0018\u0001H 0>2 \u0010?\u001a\u001c\u0012\u0004\u0012\u000204\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u0002H \u0012\u0004\u0012\u00020%\u0018\u00010$0>H\u0002¢\u0006\u0002\u0010@J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020\"H\u0002R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0019\u001a\u0018\u0012\u0004\u0012\u00020\u001b\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001d0\u001c0\u001aX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "", "images", "Ljava/io/File;", "gifs", "allFileTypesDir", "logger", "Lcom/clevertap/android/sdk/ILogger;", "inAppRemoteSource", "Lcom/clevertap/android/sdk/inapp/images/FileFetchApiContract;", "ctCaches", "Lcom/clevertap/android/sdk/utils/CTCaches;", "imageMAO", "Lcom/clevertap/android/sdk/inapp/images/memory/InAppImageMemoryAccessObjectV1;", "gifMAO", "Lcom/clevertap/android/sdk/inapp/images/memory/InAppGifMemoryAccessObjectV1;", "fileMAO", "Lcom/clevertap/android/sdk/inapp/images/memory/FileMemoryAccessObject;", "deepLogging", "", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/io/File;Lcom/clevertap/android/sdk/ILogger;Lcom/clevertap/android/sdk/inapp/images/FileFetchApiContract;Lcom/clevertap/android/sdk/utils/CTCaches;Lcom/clevertap/android/sdk/inapp/images/memory/InAppImageMemoryAccessObjectV1;Lcom/clevertap/android/sdk/inapp/images/memory/InAppGifMemoryAccessObjectV1;Lcom/clevertap/android/sdk/inapp/images/memory/FileMemoryAccessObject;Z)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lcom/clevertap/android/sdk/ILogger;)V", "mapOfMAO", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "", "Lcom/clevertap/android/sdk/inapp/images/memory/MemoryAccessObject;", "saveData", "", "T", "cacheKey", "", Column.DATA, "Lkotlin/Pair;", "", "mao", "isFileCached", Constants.KEY_URL, "cachedInAppImageV1", "Landroid/graphics/Bitmap;", "cachedInAppGifV1", "cachedFileInBytes", "cachedFilePath", "cachedFileInstance", "fetchInAppImageV1", "fetchInAppGifV1", "fetchFile", "downloadedBytesFromApi", "downloadedBitmap", "Lcom/clevertap/android/sdk/network/DownloadedBitmap;", "deleteData", "fetchCachedData", "cacheKeyAndType", "transformationType", "Lcom/clevertap/android/sdk/inapp/images/memory/MemoryDataTransformationType;", "(Lkotlin/Pair;Lcom/clevertap/android/sdk/inapp/images/memory/MemoryDataTransformationType;)Ljava/lang/Object;", "fetchData", "urlMeta", "cachedDataFetcherBlock", "Lkotlin/Function1;", "dataToSaveBlock", "(Lkotlin/Pair;Lcom/clevertap/android/sdk/inapp/images/memory/MemoryAccessObject;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "log", Constants.KEY_MESSAGE, "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileResourceProvider {

    @NotNull
    private static final String ALL_FILE_TYPES_DIRECTORY_NAME = "CleverTap.Files.";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String GIF_DIRECTORY_NAME = "CleverTap.Gif.";

    @NotNull
    private static final String IMAGE_DIRECTORY_NAME = "CleverTap.Images.";

    @Nullable
    private static volatile FileResourceProvider instance;
    private final boolean deepLogging;

    @NotNull
    private final FileMemoryAccessObject fileMAO;

    @NotNull
    private final InAppGifMemoryAccessObjectV1 gifMAO;

    @NotNull
    private final InAppImageMemoryAccessObjectV1 imageMAO;

    @NotNull
    private final FileFetchApiContract inAppRemoteSource;

    @Nullable
    private final ILogger logger;

    @NotNull
    private final Map<CtCacheType, List<MemoryAccessObject<?>>> mapOfMAO;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider$Companion;", "", "<init>", "()V", "IMAGE_DIRECTORY_NAME", "", "GIF_DIRECTORY_NAME", "ALL_FILE_TYPES_DIRECTORY_NAME", "instance", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "getInstance", "context", "Landroid/content/Context;", "logger", "Lcom/clevertap/android/sdk/ILogger;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ FileResourceProvider getInstance$default(Companion companion, Context context, ILogger iLogger, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                iLogger = null;
            }
            return companion.getInstance(context, iLogger);
        }

        @NotNull
        public final FileResourceProvider getInstance(@NotNull Context context, @Nullable ILogger logger) {
            FileResourceProvider fileResourceProvider;
            Intrinsics.echo(context, "context");
            FileResourceProvider fileResourceProvider2 = FileResourceProvider.instance;
            if (fileResourceProvider2 == null) {
                synchronized (this) {
                    fileResourceProvider = FileResourceProvider.instance;
                    if (fileResourceProvider == null) {
                        File dir = context.getDir(FileResourceProvider.IMAGE_DIRECTORY_NAME, 0);
                        Intrinsics.delta(dir, "getDir(...)");
                        File dir2 = context.getDir(FileResourceProvider.GIF_DIRECTORY_NAME, 0);
                        Intrinsics.delta(dir2, "getDir(...)");
                        File dir3 = context.getDir(FileResourceProvider.ALL_FILE_TYPES_DIRECTORY_NAME, 0);
                        Intrinsics.delta(dir3, "getDir(...)");
                        FileResourceProvider fileResourceProvider3 = new FileResourceProvider(dir, dir2, dir3, logger, null, null, null, null, null, false, 1008, null);
                        FileResourceProvider.instance = fileResourceProvider3;
                        fileResourceProvider = fileResourceProvider3;
                    }
                }
                return fileResourceProvider;
            }
            return fileResourceProvider2;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadedBitmap.Status.values().length];
            try {
                iArr[DownloadedBitmap.Status.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FileResourceProvider(@NotNull File images, @NotNull File gifs, @NotNull File allFileTypesDir, @Nullable ILogger iLogger, @NotNull FileFetchApiContract inAppRemoteSource, @NotNull CTCaches ctCaches, @NotNull InAppImageMemoryAccessObjectV1 imageMAO, @NotNull InAppGifMemoryAccessObjectV1 gifMAO, @NotNull FileMemoryAccessObject fileMAO, boolean z2) {
        Intrinsics.echo(images, "images");
        Intrinsics.echo(gifs, "gifs");
        Intrinsics.echo(allFileTypesDir, "allFileTypesDir");
        Intrinsics.echo(inAppRemoteSource, "inAppRemoteSource");
        Intrinsics.echo(ctCaches, "ctCaches");
        Intrinsics.echo(imageMAO, "imageMAO");
        Intrinsics.echo(gifMAO, "gifMAO");
        Intrinsics.echo(fileMAO, "fileMAO");
        this.logger = iLogger;
        this.inAppRemoteSource = inAppRemoteSource;
        this.imageMAO = imageMAO;
        this.gifMAO = gifMAO;
        this.fileMAO = fileMAO;
        this.deepLogging = z2;
        this.mapOfMAO = y.sierra(new Pair(CtCacheType.IMAGE, CollectionsKt.listOf(imageMAO, fileMAO, gifMAO)), new Pair(CtCacheType.GIF, CollectionsKt.listOf(gifMAO, fileMAO, imageMAO)), new Pair(CtCacheType.FILES, CollectionsKt.listOf(fileMAO, imageMAO, gifMAO)));
    }

    public static /* synthetic */ Pair alpha(DownloadedBitmap downloadedBitmap) {
        return fetchInAppImageV1$lambda$3(downloadedBitmap);
    }

    public final Pair<byte[], byte[]> downloadedBytesFromApi(DownloadedBitmap downloadedBitmap) {
        if (WhenMappings.$EnumSwitchMapping$0[downloadedBitmap.getStatus().ordinal()] == 1) {
            byte[] bytes = downloadedBitmap.getBytes();
            Intrinsics.checkNotNull(bytes);
            return new Pair<>(bytes, downloadedBitmap.getBytes());
        }
        return null;
    }

    private final <T> T fetchCachedData(Pair<String, ? extends CtCacheType> cacheKeyAndType, MemoryDataTransformationType<T> transformationType) {
        T t5;
        String first = cacheKeyAndType.getFirst();
        CtCacheType second = cacheKeyAndType.getSecond();
        log(second.name() + " data for key " + first + " requested");
        if (first == null) {
            log(second.name() + " data for null key requested");
            return null;
        }
        List<MemoryAccessObject<?>> list = this.mapOfMAO.get(second);
        if (list == null) {
            return null;
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                t5 = (T) ((MemoryAccessObject) it.next()).fetchInMemoryAndTransform(first, transformationType);
                if (t5 != null) {
                    break;
                }
            } else {
                t5 = null;
                break;
            }
        }
        if (t5 != null) {
            return t5;
        }
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            T t10 = (T) ((MemoryAccessObject) it2.next()).fetchDiskMemoryAndTransform(first, transformationType);
            if (t10 != null) {
                return t10;
            }
        }
        return null;
    }

    private final <T> T fetchData(Pair<String, ? extends CtCacheType> urlMeta, MemoryAccessObject<T> mao, Function1<? super String, ? extends T> cachedDataFetcherBlock, Function1<? super DownloadedBitmap, ? extends Pair<? extends T, byte[]>> dataToSaveBlock) {
        T invoke = cachedDataFetcherBlock.invoke(urlMeta.getFirst());
        if (invoke != null) {
            log("Returning requested " + urlMeta.getFirst() + ' ' + urlMeta.getSecond().name() + " from cache");
            return invoke;
        }
        DownloadedBitmap makeApiCallForFile = this.inAppRemoteSource.makeApiCallForFile(urlMeta);
        if (WhenMappings.$EnumSwitchMapping$0[makeApiCallForFile.getStatus().ordinal()] == 1) {
            Pair<? extends T, byte[]> invoke2 = dataToSaveBlock.invoke(makeApiCallForFile);
            Intrinsics.checkNotNull(invoke2);
            Pair<? extends T, byte[]> pair = invoke2;
            saveData(urlMeta.getFirst(), pair, mao);
            log("Returning requested " + urlMeta.getFirst() + ' ' + urlMeta.getSecond().name() + " with network, saved in cache");
            return pair.getFirst();
        }
        log("There was a problem fetching data for " + urlMeta.getSecond().name() + ", status: " + makeApiCallForFile.getStatus());
        return null;
    }

    public static final Pair fetchInAppImageV1$lambda$3(DownloadedBitmap downloadedBitmap) {
        Intrinsics.echo(downloadedBitmap, "downloadedBitmap");
        if (WhenMappings.$EnumSwitchMapping$0[downloadedBitmap.getStatus().ordinal()] == 1) {
            Bitmap bitmap = downloadedBitmap.getBitmap();
            Intrinsics.checkNotNull(bitmap);
            byte[] bytes = downloadedBitmap.getBytes();
            Intrinsics.checkNotNull(bytes);
            return new Pair(bitmap, bytes);
        }
        return null;
    }

    @NotNull
    public static final FileResourceProvider getInstance(@NotNull Context context, @Nullable ILogger iLogger) {
        return INSTANCE.getInstance(context, iLogger);
    }

    private final void log(String r32) {
        ILogger iLogger;
        if (this.deepLogging && (iLogger = this.logger) != null) {
            iLogger.verbose(FileResourcesRepoImplKt.TAG_FILE_DOWNLOAD, r32);
        }
    }

    private final <T> void saveData(String cacheKey, Pair<? extends T, byte[]> r4, MemoryAccessObject<T> mao) {
        mao.saveInMemory(cacheKey, new Pair<>(r4.getFirst(), mao.saveDiskMemory(cacheKey, r4.getSecond())));
    }

    @Nullable
    public final byte[] cachedFileInBytes(@Nullable String cacheKey) {
        return (byte[]) fetchCachedData(new Pair<>(cacheKey, CtCacheType.FILES), MemoryDataTransformationType.ToByteArray.INSTANCE);
    }

    @Nullable
    public final File cachedFileInstance(@Nullable String cacheKey) {
        return (File) fetchCachedData(new Pair<>(cacheKey, CtCacheType.FILES), MemoryDataTransformationType.ToFile.INSTANCE);
    }

    @Nullable
    public final String cachedFilePath(@Nullable String cacheKey) {
        File cachedFileInstance = cachedFileInstance(cacheKey);
        if (cachedFileInstance != null) {
            return cachedFileInstance.getAbsolutePath();
        }
        return null;
    }

    @Nullable
    public final byte[] cachedInAppGifV1(@Nullable String cacheKey) {
        return (byte[]) fetchCachedData(new Pair<>(cacheKey, CtCacheType.GIF), MemoryDataTransformationType.ToByteArray.INSTANCE);
    }

    @Nullable
    public final Bitmap cachedInAppImageV1(@Nullable String cacheKey) {
        return (Bitmap) fetchCachedData(new Pair<>(cacheKey, CtCacheType.IMAGE), MemoryDataTransformationType.ToBitmap.INSTANCE);
    }

    public final void deleteData(@NotNull String cacheKey) {
        Object obj;
        Intrinsics.echo(cacheKey, "cacheKey");
        List<MemoryAccessObject<?>> list = this.mapOfMAO.get(CtCacheType.IMAGE);
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                MemoryAccessObject memoryAccessObject = (MemoryAccessObject) it.next();
                if (memoryAccessObject instanceof InAppImageMemoryAccessObjectV1) {
                    obj = CtCacheType.IMAGE;
                } else if (memoryAccessObject instanceof InAppGifMemoryAccessObjectV1) {
                    obj = CtCacheType.GIF;
                } else if (memoryAccessObject instanceof FileMemoryAccessObject) {
                    obj = CtCacheType.FILES;
                } else {
                    obj = "";
                }
                if (memoryAccessObject.removeInMemory(cacheKey) != null) {
                    log(cacheKey + " was present in " + obj + " in-memory cache is successfully removed");
                }
                if (memoryAccessObject.removeDiskMemory(cacheKey)) {
                    log(cacheKey + " was present in " + obj + " disk-memory cache is successfully removed");
                }
            }
        }
    }

    @Nullable
    public final byte[] fetchFile(@NotNull String r4) {
        Intrinsics.echo(r4, "url");
        return (byte[]) fetchData(new Pair<>(r4, CtCacheType.FILES), this.fileMAO, new FileResourceProvider$fetchFile$1(this), new FileResourceProvider$fetchFile$2(this));
    }

    @Nullable
    public final byte[] fetchInAppGifV1(@NotNull String r4) {
        Intrinsics.echo(r4, "url");
        return (byte[]) fetchData(new Pair<>(r4, CtCacheType.GIF), this.gifMAO, new FileResourceProvider$fetchInAppGifV1$1(this), new FileResourceProvider$fetchInAppGifV1$2(this));
    }

    @Nullable
    public final Bitmap fetchInAppImageV1(@NotNull String r5) {
        Intrinsics.echo(r5, "url");
        return (Bitmap) fetchData(new Pair<>(r5, CtCacheType.IMAGE), this.imageMAO, new FileResourceProvider$fetchInAppImageV1$1(this), new h0(24));
    }

    public final boolean isFileCached(@NotNull String r5) {
        Object obj;
        Intrinsics.echo(r5, "url");
        List<MemoryAccessObject<?>> list = this.mapOfMAO.get(CtCacheType.FILES);
        Object obj2 = null;
        if (list != null) {
            Iterator<T> it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = ((MemoryAccessObject) it.next()).fetchInMemory(r5);
                    if (obj != null) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            if (obj != null) {
                obj2 = obj;
            } else {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object fetchDiskMemory = ((MemoryAccessObject) it2.next()).fetchDiskMemory(r5);
                    if (fetchDiskMemory != null) {
                        obj2 = fetchDiskMemory;
                        break;
                    }
                }
            }
        }
        if (obj2 != null) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ FileResourceProvider(File file, File file2, File file3, ILogger iLogger, FileFetchApiContract fileFetchApiContract, CTCaches cTCaches, InAppImageMemoryAccessObjectV1 inAppImageMemoryAccessObjectV1, InAppGifMemoryAccessObjectV1 inAppGifMemoryAccessObjectV1, FileMemoryAccessObject fileMemoryAccessObject, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, file2, r5, r6, r7, r8, (i4 & 64) != 0 ? new InAppImageMemoryAccessObjectV1(r8, r6) : inAppImageMemoryAccessObjectV1, (i4 & 128) != 0 ? new InAppGifMemoryAccessObjectV1(r8, r6) : inAppGifMemoryAccessObjectV1, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? new FileMemoryAccessObject(r8, r6) : fileMemoryAccessObject, (i4 & 512) != 0 ? false : z2);
        File file4;
        CTCaches cTCaches2;
        ILogger iLogger2 = (i4 & 8) != 0 ? null : iLogger;
        FileFetchApiContract fileFetchApi = (i4 & 16) != 0 ? new FileFetchApi() : fileFetchApiContract;
        if ((i4 & 32) != 0) {
            CTCaches.Companion companion = CTCaches.INSTANCE;
            MemoryCreator.Companion companion2 = MemoryCreator.INSTANCE;
            file4 = file3;
            cTCaches2 = companion.instance(companion2.createInAppImageMemoryV1(file, iLogger2), companion2.createInAppGifMemoryV1(file2, iLogger2), companion2.createFileMemoryV2(file4, iLogger2));
        } else {
            file4 = file3;
            cTCaches2 = cTCaches;
        }
    }

    public /* synthetic */ FileResourceProvider(Context context, ILogger iLogger, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i4 & 2) != 0 ? null : iLogger);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public FileResourceProvider(@NotNull Context context, @Nullable ILogger iLogger) {
        this(r4, r5, r6, iLogger, null, null, null, null, null, false, 1008, null);
        Intrinsics.echo(context, "context");
        File dir = context.getDir(IMAGE_DIRECTORY_NAME, 0);
        Intrinsics.delta(dir, "getDir(...)");
        File dir2 = context.getDir(GIF_DIRECTORY_NAME, 0);
        Intrinsics.delta(dir2, "getDir(...)");
        File dir3 = context.getDir(ALL_FILE_TYPES_DIRECTORY_NAME, 0);
        Intrinsics.delta(dir3, "getDir(...)");
    }
}
