package com.clevertap.android.sdk.inapp.images.memory;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.utils.DiskMemory;
import com.clevertap.android.sdk.utils.InMemoryLruCache;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r0\fH\u0016J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\u0003\u001a\u00020\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000b\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e0\r\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/memory/InAppImageMemoryV1;", "Lcom/clevertap/android/sdk/inapp/images/memory/Memory;", "Landroid/graphics/Bitmap;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/inapp/images/memory/MemoryConfig;", "logger", "Lcom/clevertap/android/sdk/ILogger;", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/memory/MemoryConfig;Lcom/clevertap/android/sdk/ILogger;)V", "getConfig$clevertap_core_release", "()Lcom/clevertap/android/sdk/inapp/images/memory/MemoryConfig;", "imageInMemory", "Lcom/clevertap/android/sdk/utils/InMemoryLruCache;", "Lkotlin/Pair;", "Ljava/io/File;", "imageDiskMemory", "Lcom/clevertap/android/sdk/utils/DiskMemory;", "inMemoryLock", "", "diskMemoryLock", "createInMemory", "createDiskMemory", "inMemorySize", "", "freeInMemory", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppImageMemoryV1 implements Memory<Bitmap> {

    @NotNull
    private final MemoryConfig config;

    @NotNull
    private final Object diskMemoryLock;

    @Nullable
    private DiskMemory imageDiskMemory;

    @Nullable
    private InMemoryLruCache<Pair<Bitmap, File>> imageInMemory;

    @NotNull
    private final Object inMemoryLock;

    @Nullable
    private final ILogger logger;

    public InAppImageMemoryV1(@NotNull MemoryConfig config, @Nullable ILogger iLogger) {
        Intrinsics.echo(config, "config");
        this.config = config;
        this.logger = iLogger;
        this.inMemoryLock = new Object();
        this.diskMemoryLock = new Object();
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.Memory
    @NotNull
    public DiskMemory createDiskMemory() {
        if (this.imageDiskMemory == null) {
            synchronized (this.diskMemoryLock) {
                if (this.imageDiskMemory == null) {
                    this.imageDiskMemory = new DiskMemory(this.config.getDiskDirectory(), (int) this.config.getMaxDiskSizeKB(), this.logger, null, 8, null);
                }
            }
        }
        DiskMemory diskMemory = this.imageDiskMemory;
        Intrinsics.checkNotNull(diskMemory);
        return diskMemory;
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.Memory
    @NotNull
    public InMemoryLruCache<Pair<Bitmap, File>> createInMemory() {
        if (this.imageInMemory == null) {
            synchronized (this.inMemoryLock) {
                if (this.imageInMemory == null) {
                    this.imageInMemory = new InMemoryLruCache<>(inMemorySize(), null, 2, null);
                }
            }
        }
        InMemoryLruCache<Pair<Bitmap, File>> inMemoryLruCache = this.imageInMemory;
        Intrinsics.checkNotNull(inMemoryLruCache);
        return inMemoryLruCache;
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.Memory
    public void freeInMemory() {
        InMemoryLruCache<Pair<Bitmap, File>> inMemoryLruCache = this.imageInMemory;
        if (inMemoryLruCache != null) {
            inMemoryLruCache.empty();
        }
        this.imageInMemory = null;
    }

    @NotNull
    /* renamed from: getConfig$clevertap_core_release, reason: from getter */
    public final MemoryConfig getConfig() {
        return this.config;
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.Memory
    public int inMemorySize() {
        int max = (int) Math.max(this.config.getOptimistic(), this.config.getMinInMemorySizeKB());
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.verbose("Image cache:: max-mem/1024 = " + this.config.getOptimistic() + ", minCacheSize = " + this.config.getMinInMemorySizeKB() + ", selected = " + max);
        }
        return max;
    }

    public /* synthetic */ InAppImageMemoryV1(MemoryConfig memoryConfig, ILogger iLogger, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(memoryConfig, (i4 & 2) != 0 ? null : iLogger);
    }
}
