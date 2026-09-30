package com.clevertap.android.sdk;

import android.content.Context;
import com.clevertap.android.sdk.inapp.InAppController;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0016\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r¨\u0006\u000f"}, d2 = {"Lcom/clevertap/android/sdk/CTPreferenceCache;", "", "<init>", "()V", "isFirstTimeRequest", "", "setFirstTimeRequest", "", "fTR", "updateCacheToDisk", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTPreferenceCache {

    @Nullable
    private static volatile CTPreferenceCache INSTANCE;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static boolean firstTimeRequest = true;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/clevertap/android/sdk/CTPreferenceCache$Companion;", "", "<init>", "()V", "INSTANCE", "Lcom/clevertap/android/sdk/CTPreferenceCache;", InAppController.IS_FIRST_TIME_PERMISSION_REQUEST, "", "getInstance", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "buildCache", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final CTPreferenceCache buildCache(Context context, CleverTapInstanceConfig r4) {
            CTExecutorFactory.executors(r4).ioTask().execute("buildCache", new f(context, 1));
            return new CTPreferenceCache();
        }

        public static final Void buildCache$lambda$2(Context context) {
            Intrinsics.echo(context, "$context");
            Companion companion = CTPreferenceCache.INSTANCE;
            CTPreferenceCache.firstTimeRequest = StorageHelper.getBoolean(context, InAppController.IS_FIRST_TIME_PERMISSION_REQUEST, true);
            return null;
        }

        @NotNull
        public final CTPreferenceCache getInstance(@NotNull Context context, @NotNull CleverTapInstanceConfig r32) {
            CTPreferenceCache cTPreferenceCache;
            Intrinsics.echo(context, "context");
            Intrinsics.echo(r32, "config");
            CTPreferenceCache cTPreferenceCache2 = CTPreferenceCache.INSTANCE;
            if (cTPreferenceCache2 == null) {
                synchronized (this) {
                    cTPreferenceCache = CTPreferenceCache.INSTANCE;
                    if (cTPreferenceCache == null) {
                        cTPreferenceCache = CTPreferenceCache.INSTANCE.buildCache(context, r32);
                        CTPreferenceCache.INSTANCE = cTPreferenceCache;
                    }
                }
                return cTPreferenceCache;
            }
            return cTPreferenceCache2;
        }

        private Companion() {
        }
    }

    @NotNull
    public static final CTPreferenceCache getInstance(@NotNull Context context, @NotNull CleverTapInstanceConfig cleverTapInstanceConfig) {
        return INSTANCE.getInstance(context, cleverTapInstanceConfig);
    }

    public static final Void updateCacheToDisk$lambda$0(Context context) {
        Intrinsics.echo(context, "$context");
        StorageHelper.putBooleanImmediate(context, InAppController.IS_FIRST_TIME_PERMISSION_REQUEST, firstTimeRequest);
        return null;
    }

    public final boolean isFirstTimeRequest() {
        return firstTimeRequest;
    }

    public final void setFirstTimeRequest(boolean fTR) {
        firstTimeRequest = fTR;
    }

    public final void updateCacheToDisk(@NotNull Context context, @NotNull CleverTapInstanceConfig r4) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(r4, "config");
        CTExecutorFactory.executors(r4).ioTask().execute("updateCacheToDisk", new f(context, 0));
    }
}
