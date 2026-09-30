package com.clevertap.android.sdk.utils;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.inapp.images.memory.Memory;
import java.io.File;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B3\b\u0002\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0018\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\f0\u000bJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/clevertap/android/sdk/utils/CTCaches;", "", "inAppImageMemoryV1", "Lcom/clevertap/android/sdk/inapp/images/memory/Memory;", "Landroid/graphics/Bitmap;", "inAppGifMemoryV1", "", "fileMemory", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/memory/Memory;Lcom/clevertap/android/sdk/inapp/images/memory/Memory;Lcom/clevertap/android/sdk/inapp/images/memory/Memory;)V", "imageInMemory", "Lcom/clevertap/android/sdk/utils/InMemoryLruCache;", "Lkotlin/Pair;", "Ljava/io/File;", "gifInMemory", "fileInMemory", "imageDiskMemory", "Lcom/clevertap/android/sdk/utils/DiskMemory;", "gifDiskMemory", "fileDiskMemory", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTCaches {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private static CTCaches ctCaches;

    @NotNull
    private final Memory<byte[]> fileMemory;

    @NotNull
    private final Memory<byte[]> inAppGifMemoryV1;

    @NotNull
    private final Memory<Bitmap> inAppImageMemoryV1;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0006\u001a\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\bJ\u0006\u0010\r\u001a\u00020\u000eR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/utils/CTCaches$Companion;", "", "<init>", "()V", "ctCaches", "Lcom/clevertap/android/sdk/utils/CTCaches;", "instance", "inAppImageMemoryV1", "Lcom/clevertap/android/sdk/inapp/images/memory/Memory;", "Landroid/graphics/Bitmap;", "inAppGifMemoryV1", "", "fileMemory", "clear", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void clear() {
            synchronized (this) {
                CTCaches.ctCaches = null;
            }
        }

        @NotNull
        public final CTCaches instance(@NotNull Memory<Bitmap> inAppImageMemoryV1, @NotNull Memory<byte[]> inAppGifMemoryV1, @NotNull Memory<byte[]> fileMemory) {
            Intrinsics.echo(inAppImageMemoryV1, "inAppImageMemoryV1");
            Intrinsics.echo(inAppGifMemoryV1, "inAppGifMemoryV1");
            Intrinsics.echo(fileMemory, "fileMemory");
            if (CTCaches.ctCaches == null) {
                synchronized (this) {
                    if (CTCaches.ctCaches == null) {
                        CTCaches.ctCaches = new CTCaches(inAppImageMemoryV1, inAppGifMemoryV1, fileMemory, null);
                    }
                }
            }
            CTCaches cTCaches = CTCaches.ctCaches;
            Intrinsics.checkNotNull(cTCaches);
            return cTCaches;
        }

        private Companion() {
        }
    }

    public /* synthetic */ CTCaches(Memory memory, Memory memory2, Memory memory3, DefaultConstructorMarker defaultConstructorMarker) {
        this(memory, memory2, memory3);
    }

    @NotNull
    public final DiskMemory fileDiskMemory() {
        return this.fileMemory.createDiskMemory();
    }

    @NotNull
    public final InMemoryLruCache<Pair<byte[], File>> fileInMemory() {
        return this.fileMemory.createInMemory();
    }

    @NotNull
    public final DiskMemory gifDiskMemory() {
        return this.inAppGifMemoryV1.createDiskMemory();
    }

    @NotNull
    public final InMemoryLruCache<Pair<byte[], File>> gifInMemory() {
        return this.inAppGifMemoryV1.createInMemory();
    }

    @NotNull
    public final DiskMemory imageDiskMemory() {
        return this.inAppImageMemoryV1.createDiskMemory();
    }

    @NotNull
    public final InMemoryLruCache<Pair<Bitmap, File>> imageInMemory() {
        return this.inAppImageMemoryV1.createInMemory();
    }

    private CTCaches(Memory<Bitmap> memory, Memory<byte[]> memory2, Memory<byte[]> memory3) {
        this.inAppImageMemoryV1 = memory;
        this.inAppGifMemoryV1 = memory2;
        this.fileMemory = memory3;
    }
}
