package com.clevertap.android.sdk.task;

import Cb.ab;
import N9.g;
import Ya.c;
import Yb.C0312j0;
import android.os.Build;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\t\u001a\u00020\b2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0007J\b\u0010\f\u001a\u00020\bH\u0007J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u001e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/clevertap/android/sdk/task/CTExecutorFactory;", "", "<init>", "()V", "TAG_RESOURCE_DOWNLOADER", "", "executorMap", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/clevertap/android/sdk/task/CTExecutors;", "executors", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "executorResourceDownloader", "ioPoolSize", "", "getOrCreateExecutorApi21", Constants.KEY_KEY, "supplier", "Lkotlin/Function0;", "removeExecutor", "", "accountId", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTExecutorFactory {

    @NotNull
    private static final String TAG_RESOURCE_DOWNLOADER = "Resource Downloader";

    @NotNull
    public static final CTExecutorFactory INSTANCE = new CTExecutorFactory();

    @NotNull
    private static final ConcurrentHashMap<String, CTExecutors> executorMap = new ConcurrentHashMap<>();

    private CTExecutorFactory() {
    }

    public static /* synthetic */ CTExecutors alpha(CleverTapInstanceConfig cleverTapInstanceConfig) {
        return executors$lambda$3(cleverTapInstanceConfig);
    }

    public static /* synthetic */ CTExecutors bravo(c cVar, Object obj) {
        return executors$lambda$2(cVar, obj);
    }

    public static /* synthetic */ CTExecutors echo(ab abVar, Object obj) {
        return executorResourceDownloader$lambda$5(abVar, obj);
    }

    @NotNull
    public static final CTExecutors executorResourceDownloader() {
        return executorResourceDownloader(8);
    }

    public static final CTExecutors executorResourceDownloader$lambda$4(int i4, String it) {
        Intrinsics.echo(it, "it");
        return new CTExecutors(i4);
    }

    public static final CTExecutors executorResourceDownloader$lambda$5(Function1 tmp0, Object obj) {
        Intrinsics.echo(tmp0, "$tmp0");
        return (CTExecutors) tmp0.invoke(obj);
    }

    public static final CTExecutors executorResourceDownloader$lambda$6(int i4) {
        return new CTExecutors(i4);
    }

    @NotNull
    public static final CTExecutors executors(@Nullable CleverTapInstanceConfig r4) {
        Object computeIfAbsent;
        if (r4 != null) {
            String accountId = r4.getAccountId();
            if (Build.VERSION.SDK_INT >= 24) {
                computeIfAbsent = executorMap.computeIfAbsent(accountId, new g(1, new c(26, r4)));
                Intrinsics.checkNotNull(computeIfAbsent);
                return (CTExecutors) computeIfAbsent;
            }
            CTExecutorFactory cTExecutorFactory = INSTANCE;
            Intrinsics.checkNotNull(accountId);
            return cTExecutorFactory.getOrCreateExecutorApi21(accountId, new C0312j0(20, r4));
        }
        throw new IllegalArgumentException("Can't create task for null config");
    }

    public static final CTExecutors executors$lambda$1(CleverTapInstanceConfig cleverTapInstanceConfig, String it) {
        Intrinsics.echo(it, "it");
        return new CTExecutors(cleverTapInstanceConfig);
    }

    public static final CTExecutors executors$lambda$2(Function1 tmp0, Object obj) {
        Intrinsics.echo(tmp0, "$tmp0");
        return (CTExecutors) tmp0.invoke(obj);
    }

    public static final CTExecutors executors$lambda$3(CleverTapInstanceConfig cleverTapInstanceConfig) {
        return new CTExecutors(cleverTapInstanceConfig);
    }

    private final CTExecutors getOrCreateExecutorApi21(String r32, Function0<? extends CTExecutors> supplier) {
        ConcurrentHashMap<String, CTExecutors> concurrentHashMap = executorMap;
        CTExecutors cTExecutors = concurrentHashMap.get(r32);
        if (cTExecutors == null) {
            CTExecutors invoke = supplier.invoke();
            CTExecutors putIfAbsent = concurrentHashMap.putIfAbsent(r32, invoke);
            if (putIfAbsent == null) {
                return invoke;
            }
            return putIfAbsent;
        }
        return cTExecutors;
    }

    public static final boolean removeExecutor(@NotNull String accountId) {
        Intrinsics.echo(accountId, "accountId");
        if (executorMap.remove(accountId) != null) {
            return true;
        }
        return false;
    }

    @NotNull
    public static final CTExecutors executorResourceDownloader(int ioPoolSize) {
        Object computeIfAbsent;
        if (Build.VERSION.SDK_INT >= 24) {
            computeIfAbsent = executorMap.computeIfAbsent("Resource Downloader", new g(2, new ab(ioPoolSize, 1)));
            Intrinsics.checkNotNull(computeIfAbsent);
            return (CTExecutors) computeIfAbsent;
        }
        return INSTANCE.getOrCreateExecutorApi21(TAG_RESOURCE_DOWNLOADER, new a(ioPoolSize, 0));
    }
}
