package com.clevertap.android.sdk.inapp.images.cleanup;

import B2.e;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import com.clevertap.android.sdk.task.CTExecutors;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B!\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategyExecutors;", "Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "Lcom/clevertap/android/sdk/task/CTExecutors;", "executor", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/clevertap/android/sdk/task/CTExecutors;)V", "", "", "urls", "Lkotlin/Function1;", "", "successBlock", "clearFileAssets", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "stop", "()V", "Lkotlin/jvm/functions/Function0;", "getFileResourceProvider", "()Lkotlin/jvm/functions/Function0;", "Lcom/clevertap/android/sdk/task/CTExecutors;", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileCleanupStrategyExecutors implements FileCleanupStrategy {

    @NotNull
    private static final String TAG = "fileCleanupExecutor";

    @NotNull
    private final CTExecutors executor;

    @NotNull
    private final Function0<FileResourceProvider> fileResourceProvider;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FileCleanupStrategyExecutors(@NotNull Function0<FileResourceProvider> fileResourceProvider) {
        this(fileResourceProvider, null, 2, null);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
    }

    public static /* synthetic */ Unit alpha(FileCleanupStrategyExecutors fileCleanupStrategyExecutors, String str, Function1 function1) {
        return clearFileAssets$lambda$0(fileCleanupStrategyExecutors, str, function1);
    }

    public static final Unit clearFileAssets$lambda$0(FileCleanupStrategyExecutors this$0, String url, Function1 successBlock) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(url, "$url");
        Intrinsics.echo(successBlock, "$successBlock");
        this$0.getFileResourceProvider().invoke().deleteData(url);
        successBlock.invoke(url);
        return Unit.INSTANCE;
    }

    @Override // com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategy
    public void clearFileAssets(@NotNull List<String> urls, @NotNull Function1<? super String, Unit> successBlock) {
        Intrinsics.echo(urls, "urls");
        Intrinsics.echo(successBlock, "successBlock");
        Iterator<String> it = urls.iterator();
        while (it.hasNext()) {
            this.executor.ioTaskNonUi().execute(TAG, new e((Object) this, it.next(), (Object) successBlock, 6));
        }
    }

    @Override // com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategy
    @NotNull
    public Function0<FileResourceProvider> getFileResourceProvider() {
        return this.fileResourceProvider;
    }

    @Override // com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategy
    public void stop() {
    }

    public FileCleanupStrategyExecutors(@NotNull Function0<FileResourceProvider> fileResourceProvider, @NotNull CTExecutors executor) {
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(executor, "executor");
        this.fileResourceProvider = fileResourceProvider;
        this.executor = executor;
    }

    public /* synthetic */ FileCleanupStrategyExecutors(Function0 function0, CTExecutors cTExecutors, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i4 & 2) != 0 ? CTExecutorFactory.executorResourceDownloader() : cTExecutors);
    }
}
