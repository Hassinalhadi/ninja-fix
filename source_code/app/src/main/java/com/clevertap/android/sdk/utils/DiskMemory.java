package com.clevertap.android.sdk.utils;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImplKt;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\u0018\u0000 \"2\u00020\u0001:\u0001\"B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0015\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u000fJ\u0015\u0010\u0018\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\t¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0012¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001dR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001eR&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/clevertap/android/sdk/utils/DiskMemory;", "", "Ljava/io/File;", "directory", "", "maxFileSizeKb", "Lcom/clevertap/android/sdk/ILogger;", "logger", "Lkotlin/Function1;", "", "hashFunction", "<init>", "(Ljava/io/File;ILcom/clevertap/android/sdk/ILogger;Lkotlin/jvm/functions/Function1;)V", Constants.KEY_KEY, "fetchFile", "(Ljava/lang/String;)Ljava/io/File;", "", "value", "", "add", "(Ljava/lang/String;[B)Z", "addAndReturnFileInstance", "(Ljava/lang/String;[B)Ljava/io/File;", "get", "remove", "(Ljava/lang/String;)Z", "empty", "()Z", "Ljava/io/File;", "I", "Lcom/clevertap/android/sdk/ILogger;", "Lkotlin/jvm/functions/Function1;", "getHashFunction$clevertap_core_release", "()Lkotlin/jvm/functions/Function1;", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DiskMemory {

    @NotNull
    private static final String FILE_PREFIX = "CT_FILE";

    @NotNull
    private final File directory;

    @NotNull
    private final Function1<String, String> hashFunction;

    @Nullable
    private final ILogger logger;
    private final int maxFileSizeKb;

    /* JADX WARN: Multi-variable type inference failed */
    public DiskMemory(@NotNull File directory, int i4, @Nullable ILogger iLogger, @NotNull Function1<? super String, String> hashFunction) {
        Intrinsics.echo(directory, "directory");
        Intrinsics.echo(hashFunction, "hashFunction");
        this.directory = directory;
        this.maxFileSizeKb = i4;
        this.logger = iLogger;
        this.hashFunction = hashFunction;
    }

    private final File fetchFile(String key) {
        return new File(this.directory + "/CT_FILE_" + this.hashFunction.invoke(key));
    }

    public final boolean add(@NotNull String key, @NotNull byte[] value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        try {
            addAndReturnFileInstance(key, value);
            return true;
        } catch (Exception e) {
            ILogger iLogger = this.logger;
            if (iLogger != null) {
                StringBuilder victor = c.victor("Error while adding file to disk. Key: ", key, ", Value Size: ");
                victor.append(value.length);
                victor.append(" bytes");
                iLogger.verbose(victor.toString(), e);
                return false;
            }
            return false;
        }
    }

    @NotNull
    public final File addAndReturnFileInstance(@NotNull String key, @NotNull byte[] value) {
        Intrinsics.echo(key, "key");
        Intrinsics.echo(value, "value");
        if (CacheKt.sizeInKb(value) <= this.maxFileSizeKb) {
            File fetchFile = fetchFile(key);
            if (fetchFile.exists()) {
                fetchFile.delete();
            }
            File fetchFile2 = fetchFile(key);
            ILogger iLogger = this.logger;
            if (iLogger != null) {
                iLogger.verbose(FileResourcesRepoImplKt.TAG_FILE_DOWNLOAD, "mapped file path - " + fetchFile2.getAbsoluteFile() + " to key - " + key);
            }
            FileOutputStream fileOutputStream = new FileOutputStream(fetchFile2);
            fileOutputStream.write(value);
            fileOutputStream.close();
            return fetchFile2;
        }
        remove(key);
        throw new IllegalArgumentException("File size exceeds the maximum limit of " + this.maxFileSizeKb);
    }

    public final boolean empty() {
        return FilesKt.hotel(this.directory);
    }

    @Nullable
    public final File get(@NotNull String key) {
        Intrinsics.echo(key, "key");
        File fetchFile = fetchFile(key);
        if (fetchFile.exists()) {
            return fetchFile;
        }
        return null;
    }

    @NotNull
    public final Function1<String, String> getHashFunction$clevertap_core_release() {
        return this.hashFunction;
    }

    public final boolean remove(@NotNull String key) {
        Intrinsics.echo(key, "key");
        File fetchFile = fetchFile(key);
        if (fetchFile.exists()) {
            fetchFile.delete();
            return true;
        }
        return false;
    }

    public /* synthetic */ DiskMemory(File file, int i4, ILogger iLogger, Function1 function1, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, i4, (i5 & 4) != 0 ? null : iLogger, (i5 & 8) != 0 ? UrlHashGenerator.INSTANCE.hash() : function1);
    }
}
