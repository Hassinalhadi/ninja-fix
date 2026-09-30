package com.clevertap.android.sdk.inapp.images.memory;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.inapp.images.memory.MemoryDataTransformationType;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImplKt;
import com.clevertap.android.sdk.utils.CTCaches;
import java.io.File;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0003\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001e\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016J+\u0010\u000e\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0016¢\u0006\u0002\u0010\u0012J+\u0010\u0013\u001a\u0004\u0018\u0001H\u000f\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\f\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0011H\u0016¢\u0006\u0002\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J$\u0010\u0015\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\r2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\u0018\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\rH\u0016J\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/memory/InAppImageMemoryAccessObjectV1;", "Lcom/clevertap/android/sdk/inapp/images/memory/MemoryAccessObject;", "Landroid/graphics/Bitmap;", "ctCaches", "Lcom/clevertap/android/sdk/utils/CTCaches;", "logger", "Lcom/clevertap/android/sdk/ILogger;", "<init>", "(Lcom/clevertap/android/sdk/utils/CTCaches;Lcom/clevertap/android/sdk/ILogger;)V", "fetchInMemory", "Lkotlin/Pair;", "Ljava/io/File;", Constants.KEY_KEY, "", "fetchInMemoryAndTransform", "A", "transformTo", "Lcom/clevertap/android/sdk/inapp/images/memory/MemoryDataTransformationType;", "(Ljava/lang/String;Lcom/clevertap/android/sdk/inapp/images/memory/MemoryDataTransformationType;)Ljava/lang/Object;", "fetchDiskMemoryAndTransform", "fetchDiskMemory", "saveInMemory", "", Column.DATA, "saveDiskMemory", "", "removeDiskMemory", "removeInMemory", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppImageMemoryAccessObjectV1 implements MemoryAccessObject<Bitmap> {

    @NotNull
    private final CTCaches ctCaches;

    @Nullable
    private final ILogger logger;

    public InAppImageMemoryAccessObjectV1(@NotNull CTCaches ctCaches, @Nullable ILogger iLogger) {
        Intrinsics.echo(ctCaches, "ctCaches");
        this.ctCaches = ctCaches;
        this.logger = iLogger;
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject
    @Nullable
    public File fetchDiskMemory(@NotNull String key) {
        Intrinsics.echo(key, "key");
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.verbose(FileResourcesRepoImplKt.TAG_FILE_DOWNLOAD, "IMAGE In-Memory cache miss for " + key + " data");
        }
        return this.ctCaches.imageDiskMemory().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject
    @Nullable
    public <A> A fetchDiskMemoryAndTransform(@NotNull String key, @NotNull MemoryDataTransformationType<A> transformTo) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(transformTo, "transformTo");
        A a6 = (A) fetchDiskMemory(key);
        if (a6 != null) {
            ILogger iLogger = this.logger;
            if (iLogger != null) {
                iLogger.verbose(FileResourcesRepoImplKt.TAG_FILE_DOWNLOAD, key.concat(" data found in image disk memory"));
            }
            A a8 = (A) ((Bitmap) MemoryAccessObjectKt.getFileToBitmap().invoke(a6));
            if (a8 != null) {
                saveInMemory(key, new Pair<>(a8, a6));
            }
            if (Intrinsics.areEqual(transformTo, MemoryDataTransformationType.ToBitmap.INSTANCE)) {
                if (a8 == null) {
                    return null;
                }
                return a8;
            }
            if (Intrinsics.areEqual(transformTo, MemoryDataTransformationType.ToByteArray.INSTANCE)) {
                A a10 = (A) MemoryAccessObjectKt.getFileToBytes().invoke(a6);
                if (a10 != null) {
                    return a10;
                }
            } else {
                if (Intrinsics.areEqual(transformTo, MemoryDataTransformationType.ToFile.INSTANCE)) {
                    return a6;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
        return null;
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject
    @Nullable
    public Pair<Bitmap, File> fetchInMemory(@NotNull String key) {
        Intrinsics.echo(key, "key");
        return this.ctCaches.imageInMemory().get(key);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject
    @Nullable
    public <A> A fetchInMemoryAndTransform(@NotNull String key, @NotNull MemoryDataTransformationType<A> transformTo) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(transformTo, "transformTo");
        Pair<Bitmap, File> fetchInMemory = fetchInMemory(key);
        if (fetchInMemory == null) {
            return null;
        }
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.verbose(FileResourcesRepoImplKt.TAG_FILE_DOWNLOAD, key.concat(" data found in image in-memory"));
        }
        if (Intrinsics.areEqual(transformTo, MemoryDataTransformationType.ToBitmap.INSTANCE)) {
            A a6 = (A) fetchInMemory.getFirst();
            if (a6 == null) {
                return null;
            }
            return a6;
        }
        if (Intrinsics.areEqual(transformTo, MemoryDataTransformationType.ToByteArray.INSTANCE)) {
            Function1<Bitmap, byte[]> bitmapToBytes = MemoryAccessObjectKt.getBitmapToBytes();
            Bitmap first = fetchInMemory.getFirst();
            Intrinsics.charlie(first, "null cannot be cast to non-null type android.graphics.Bitmap");
            A a8 = (A) bitmapToBytes.invoke(first);
            if (a8 == null) {
                return null;
            }
            return a8;
        }
        if (Intrinsics.areEqual(transformTo, MemoryDataTransformationType.ToFile.INSTANCE)) {
            A a10 = (A) fetchInMemory.getSecond();
            if (a10 == null) {
                return null;
            }
            return a10;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject
    public boolean removeDiskMemory(@NotNull String key) {
        Intrinsics.echo(key, "key");
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.verbose(FileResourcesRepoImplKt.TAG_FILE_DOWNLOAD, "If present, will remove " + key + " data from IMAGE disk-memory");
        }
        return this.ctCaches.imageDiskMemory().remove(key);
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject
    @Nullable
    public Pair<Bitmap, File> removeInMemory(@NotNull String key) {
        Intrinsics.echo(key, "key");
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.verbose(FileResourcesRepoImplKt.TAG_FILE_DOWNLOAD, "If present, will remove " + key + " data from IMAGE in-memory");
        }
        return this.ctCaches.imageInMemory().remove(key);
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject
    @NotNull
    public File saveDiskMemory(@NotNull String key, @NotNull byte[] data) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(data, "data");
        return this.ctCaches.imageDiskMemory().addAndReturnFileInstance(key, data);
    }

    @Override // com.clevertap.android.sdk.inapp.images.memory.MemoryAccessObject
    public boolean saveInMemory(@NotNull String key, @NotNull Pair<? extends Bitmap, ? extends File> data) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(data, "data");
        ILogger iLogger = this.logger;
        if (iLogger != null) {
            iLogger.verbose(FileResourcesRepoImplKt.TAG_FILE_DOWNLOAD, "Saving " + key + " data in IMAGE in-memory");
        }
        return this.ctCaches.imageInMemory().add(key, data);
    }
}
