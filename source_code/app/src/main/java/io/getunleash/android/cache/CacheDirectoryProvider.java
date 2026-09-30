package io.getunleash.android.cache;

import android.content.Context;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import io.getunleash.android.backup.LocalStorageConfig;
import io.getunleash.android.util.UnleashLogger;
import java.io.File;
import kotlin.Metadata;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u000bH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lio/getunleash/android/cache/CacheDirectoryProvider;", "", Constants.KEY_CONFIG, "Lio/getunleash/android/backup/LocalStorageConfig;", "context", "Landroid/content/Context;", "runtime", "Ljava/lang/Runtime;", "<init>", "(Lio/getunleash/android/backup/LocalStorageConfig;Landroid/content/Context;Ljava/lang/Runtime;)V", "getCacheDirectory", "Ljava/io/File;", "tempDirName", "", "deleteOnShutdown", "", "createDirectoryIfNotExists", CTVariableUtils.FILE, "addShutdownHook", "", "Companion", "DeleteFileShutdownHook", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CacheDirectoryProvider {

    @NotNull
    private static final String TAG = "CacheDirProvider";

    @NotNull
    private final LocalStorageConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final Runtime runtime;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lio/getunleash/android/cache/CacheDirectoryProvider$DeleteFileShutdownHook;", "Ljava/lang/Thread;", CTVariableUtils.FILE, "Ljava/io/File;", "<init>", "(Ljava/io/File;)V", "unleashandroidsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class DeleteFileShutdownHook extends Thread {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public DeleteFileShutdownHook(@NotNull final File file) {
            super(new Runnable() { // from class: io.getunleash.android.cache.a
                @Override // java.lang.Runnable
                public final void run() {
                    FilesKt.hotel(file);
                }
            });
            Intrinsics.echo(file, "file");
        }
    }

    public CacheDirectoryProvider(@NotNull LocalStorageConfig config, @NotNull Context context, @NotNull Runtime runtime) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(context, "context");
        Intrinsics.echo(runtime, "runtime");
        this.config = config;
        this.context = context;
        this.runtime = runtime;
    }

    private final void addShutdownHook(File file) {
        this.runtime.addShutdownHook(new DeleteFileShutdownHook(file));
    }

    private final boolean createDirectoryIfNotExists(File file) {
        if (file.exists()) {
            UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Directory " + file.getAbsolutePath() + " already exists", null, 4, null);
            return true;
        }
        if (file.mkdirs()) {
            UnleashLogger.d$default(UnleashLogger.INSTANCE, TAG, "Created directory " + file.getAbsolutePath(), null, 4, null);
            return true;
        }
        UnleashLogger.w$default(UnleashLogger.INSTANCE, TAG, "Failed to create directory " + file.getAbsolutePath(), null, 4, null);
        return false;
    }

    public static /* synthetic */ File getCacheDirectory$default(CacheDirectoryProvider cacheDirectoryProvider, String str, boolean z2, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z2 = false;
        }
        return cacheDirectoryProvider.getCacheDirectory(str, z2);
    }

    @NotNull
    public final File getCacheDirectory(@NotNull String tempDirName, boolean deleteOnShutdown) {
        File cacheDir;
        Intrinsics.echo(tempDirName, "tempDirName");
        String dir = this.config.getDir();
        if (dir != null) {
            cacheDir = new File(dir);
        } else {
            cacheDir = this.context.getCacheDir();
            Intrinsics.delta(cacheDir, "getCacheDir(...)");
        }
        File file = new File(cacheDir, tempDirName);
        if (!createDirectoryIfNotExists(file)) {
            UnleashLogger.w$default(UnleashLogger.INSTANCE, TAG, "Failed to create directory " + file.getAbsolutePath(), null, 4, null);
            return file;
        }
        if (deleteOnShutdown) {
            addShutdownHook(file);
        }
        return file;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ CacheDirectoryProvider(LocalStorageConfig localStorageConfig, Context context, Runtime runtime, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(localStorageConfig, context, runtime);
        if ((i4 & 4) != 0) {
            runtime = Runtime.getRuntime();
            Intrinsics.delta(runtime, "getRuntime(...)");
        }
    }
}
