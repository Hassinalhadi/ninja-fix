package com.clevertap.android.sdk.inapp.images.cleanup;

import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.utils.CtDefaultDispatchers;
import com.clevertap.android.sdk.utils.DispatcherProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vf.I;
import vf.ad;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B!\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ1\u0010\u000f\u001a\u00020\r2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategyCoroutine;", "Lcom/clevertap/android/sdk/inapp/images/cleanup/FileCleanupStrategy;", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider", "Lcom/clevertap/android/sdk/utils/DispatcherProvider;", "dispatchers", "<init>", "(Lkotlin/jvm/functions/Function0;Lcom/clevertap/android/sdk/utils/DispatcherProvider;)V", "", "", "urls", "Lkotlin/Function1;", "", "successBlock", "clearFileAssets", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "stop", "()V", "Lkotlin/jvm/functions/Function0;", "getFileResourceProvider", "()Lkotlin/jvm/functions/Function0;", "Lcom/clevertap/android/sdk/utils/DispatcherProvider;", "", "Lvf/I;", "jobs", "Ljava/util/List;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FileCleanupStrategyCoroutine implements FileCleanupStrategy {

    @NotNull
    private final DispatcherProvider dispatchers;

    @NotNull
    private final Function0<FileResourceProvider> fileResourceProvider;

    @NotNull
    private List<I> jobs;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FileCleanupStrategyCoroutine(@NotNull Function0<FileResourceProvider> fileResourceProvider) {
        this(fileResourceProvider, null, 2, 0 == true ? 1 : 0);
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
    }

    @Override // com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategy
    public void clearFileAssets(@NotNull List<String> urls, @NotNull Function1<? super String, Unit> successBlock) {
        Intrinsics.echo(urls, "urls");
        Intrinsics.echo(successBlock, "successBlock");
        this.jobs.add(ad.zulu(ad.charlie(this.dispatchers.io()), null, null, new FileCleanupStrategyCoroutine$clearFileAssets$job$1(urls, this, successBlock, null), 3));
    }

    @Override // com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategy
    @NotNull
    public Function0<FileResourceProvider> getFileResourceProvider() {
        return this.fileResourceProvider;
    }

    @Override // com.clevertap.android.sdk.inapp.images.cleanup.FileCleanupStrategy
    public void stop() {
        Iterator<T> it = this.jobs.iterator();
        while (it.hasNext()) {
            ((I) it.next()).foxtrot(null);
        }
    }

    public FileCleanupStrategyCoroutine(@NotNull Function0<FileResourceProvider> fileResourceProvider, @NotNull DispatcherProvider dispatchers) {
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        Intrinsics.echo(dispatchers, "dispatchers");
        this.fileResourceProvider = fileResourceProvider;
        this.dispatchers = dispatchers;
        this.jobs = new ArrayList();
    }

    public /* synthetic */ FileCleanupStrategyCoroutine(Function0 function0, DispatcherProvider dispatcherProvider, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(function0, (i4 & 2) != 0 ? new CtDefaultDispatchers() : dispatcherProvider);
    }
}
