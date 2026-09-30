package com.clevertap.android.sdk.inapp.images.preload;

import bz.h0;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J±\u0001\u0010\u000f\u001a\u00020\b2\u0018\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u00022 \b\u0002\u0010\t\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\b0\u00072 \b\u0002\u0010\n\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\b0\u00072 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u0004\u0012\u00020\b0\u00072 \b\u0002\u0010\u000e\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\b0\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\bH&¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloaderStrategy;", "", "", "Lkotlin/Pair;", "", "Lcom/clevertap/android/sdk/inapp/data/CtCacheType;", "urlMetas", "Lkotlin/Function1;", "", "successBlock", "failureBlock", "startedBlock", "", "", "preloadFinished", "preloadFilesAndCache", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "cleanup", "()V", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "getFileResourceProvider", "()Lkotlin/jvm/functions/Function0;", "fileResourceProvider", "Lcom/clevertap/android/sdk/ILogger;", "getLogger", "()Lcom/clevertap/android/sdk/ILogger;", "logger", "Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", "getConfig", "()Lcom/clevertap/android/sdk/inapp/images/preload/FilePreloadConfig;", Constants.KEY_CONFIG, "", "getTimeoutForPreload", "()J", "timeoutForPreload", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface FilePreloaderStrategy {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
        public static /* synthetic */ Unit alpha(Map map) {
            return preloadFilesAndCache$lambda$3(map);
        }

        public static /* synthetic */ Unit bravo(Pair pair) {
            return preloadFilesAndCache$lambda$1(pair);
        }

        public static /* synthetic */ Unit charlie(Pair pair) {
            return preloadFilesAndCache$lambda$0(pair);
        }

        public static /* synthetic */ Unit delta(Pair pair) {
            return preloadFilesAndCache$lambda$2(pair);
        }

        public static /* synthetic */ void preloadFilesAndCache$default(FilePreloaderStrategy filePreloaderStrategy, List list, Function1 function1, Function1 function12, Function1 function13, Function1 function14, int i4, Object obj) {
            if (obj == null) {
                if ((i4 & 2) != 0) {
                    function1 = new h0(29);
                }
                Function1 function15 = function1;
                if ((i4 & 4) != 0) {
                    function12 = new a(0);
                }
                Function1 function16 = function12;
                if ((i4 & 8) != 0) {
                    function13 = new a(1);
                }
                Function1 function17 = function13;
                if ((i4 & 16) != 0) {
                    function14 = new a(2);
                }
                filePreloaderStrategy.preloadFilesAndCache(list, function15, function16, function17, function14);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: preloadFilesAndCache");
        }

        public static Unit preloadFilesAndCache$lambda$0(Pair it) {
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

        public static Unit preloadFilesAndCache$lambda$3(Map it) {
            Intrinsics.echo(it, "it");
            return Unit.INSTANCE;
        }
    }

    void cleanup();

    @NotNull
    FilePreloadConfig getConfig();

    @NotNull
    Function0<FileResourceProvider> getFileResourceProvider();

    @Nullable
    ILogger getLogger();

    long getTimeoutForPreload();

    void preloadFilesAndCache(@NotNull List<? extends Pair<String, ? extends CtCacheType>> urlMetas, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> successBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> failureBlock, @NotNull Function1<? super Pair<String, ? extends CtCacheType>, Unit> startedBlock, @NotNull Function1<? super Map<String, Boolean>, Unit> preloadFinished);
}
