package com.clevertap.android.sdk;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import com.clevertap.android.sdk.PushPermissionHandler;
import f1.AbstractC1683c;
import g1.AbstractC1735d;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\b\b\u0000\u0018\u0000 ,2\u00020\u0001:\u0004*+,-BO\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u000bJ(\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001f2\b\b\u0002\u0010 \u001a\u00020\u0014J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0014J\u000e\u0010!\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u001e\u0010\"\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&J\u0010\u0010'\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0014H\u0002J\u0010\u0010)\u001a\u00020\u00182\u0006\u0010(\u001a\u00020\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006."}, d2 = {"Lcom/clevertap/android/sdk/PushPermissionHandler;", "", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "ctListeners", "", "Lcom/clevertap/android/sdk/PushPermissionResponseListener;", "callback", "Lcom/clevertap/android/sdk/PushPermissionHandler$PushPermissionResultCallback;", "cacheProvider", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CTPreferenceCache;", "systemPermissionInterface", "Lcom/clevertap/android/sdk/PushPermissionHandler$SystemPushPermissionInterface;", "<init>", "(Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Ljava/util/List;Lcom/clevertap/android/sdk/PushPermissionHandler$PushPermissionResultCallback;Lkotlin/jvm/functions/Function1;Lcom/clevertap/android/sdk/PushPermissionHandler$SystemPushPermissionInterface;)V", "pushPermissionCallback", "Ljava/lang/ref/WeakReference;", "isFromNotificationSettingsActivity", "", "isPushPermissionGranted", "context", "notifyPushPermissionListeners", "", "notifyPushPermissionExternalListeners", "requestPermission", "activity", "Landroid/app/Activity;", "fallbackToSettings", "requestCallback", "Lcom/clevertap/android/sdk/PushPermissionHandler$PushPermissionRequestCallback;", "alwaysRequestIfNotGranted", "onActivityResume", "onRequestPermissionsResult", "requestCode", "", "grantResults", "", "notifyListeners", "isPermissionGranted", "notifyExternalListeners", "PushPermissionResultCallback", "PushPermissionRequestCallback", "Companion", "SystemPushPermissionInterface", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PushPermissionHandler {

    @NotNull
    public static final String ANDROID_PERMISSION_STRING = "android.permission.POST_NOTIFICATIONS";

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Function1<Context, CTPreferenceCache> cacheProvider;

    @NotNull
    private final CleverTapInstanceConfig config;

    @Nullable
    private final List<PushPermissionResponseListener> ctListeners;
    private boolean isFromNotificationSettingsActivity;

    @NotNull
    private final WeakReference<PushPermissionResultCallback> pushPermissionCallback;

    @NotNull
    private final SystemPushPermissionInterface systemPermissionInterface;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0002J\b\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/clevertap/android/sdk/PushPermissionHandler$Companion;", "", "<init>", "()V", "ANDROID_PERMISSION_STRING", "", "defaultCacheProvider", "Lkotlin/Function1;", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CTPreferenceCache;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "defaultSystemInterface", "Lcom/clevertap/android/sdk/PushPermissionHandler$SystemPushPermissionInterface;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Function1<Context, CTPreferenceCache> defaultCacheProvider(final CleverTapInstanceConfig config) {
            return new Function1() { // from class: com.clevertap.android.sdk.w
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    CTPreferenceCache defaultCacheProvider$lambda$0;
                    defaultCacheProvider$lambda$0 = PushPermissionHandler.Companion.defaultCacheProvider$lambda$0(CleverTapInstanceConfig.this, (Context) obj);
                    return defaultCacheProvider$lambda$0;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CTPreferenceCache defaultCacheProvider$lambda$0(CleverTapInstanceConfig config, Context context) {
            Intrinsics.echo(config, "$config");
            Intrinsics.echo(context, "context");
            return CTPreferenceCache.INSTANCE.getInstance(context, config);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final SystemPushPermissionInterface defaultSystemInterface() {
            return new SystemPushPermissionInterface() { // from class: com.clevertap.android.sdk.PushPermissionHandler$Companion$defaultSystemInterface$1
                @Override // com.clevertap.android.sdk.PushPermissionHandler.SystemPushPermissionInterface
                public boolean isPushPermissionGranted(Context context) {
                    Intrinsics.echo(context, "context");
                    if (AbstractC1735d.alpha(context, PushPermissionHandler.ANDROID_PERMISSION_STRING) == 0) {
                        return true;
                    }
                    return false;
                }

                @Override // com.clevertap.android.sdk.PushPermissionHandler.SystemPushPermissionInterface
                public void navigateToNotificationSettings(Activity activity) {
                    Intrinsics.echo(activity, "activity");
                    Utils.navigateToAndroidSettingsForNotifications(activity);
                }

                @Override // com.clevertap.android.sdk.PushPermissionHandler.SystemPushPermissionInterface
                public void requestPushPermission(Activity activity) {
                    Intrinsics.echo(activity, "activity");
                    AbstractC1683c.echo(activity, new String[]{PushPermissionHandler.ANDROID_PERMISSION_STRING}, 102);
                }

                @Override // com.clevertap.android.sdk.PushPermissionHandler.SystemPushPermissionInterface
                public boolean shouldShowRequestPermissionRationale(Activity activity) {
                    Intrinsics.echo(activity, "activity");
                    return AbstractC1683c.foxtrot(activity, PushPermissionHandler.ANDROID_PERMISSION_STRING);
                }
            };
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, d2 = {"Lcom/clevertap/android/sdk/PushPermissionHandler$PushPermissionRequestCallback;", "", "onRequestPermission", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface PushPermissionRequestCallback {
        void onRequestPermission();
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/clevertap/android/sdk/PushPermissionHandler$PushPermissionResultCallback;", "", "onPushPermissionResult", "", "isGranted", "", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface PushPermissionResultCallback {
        void onPushPermissionResult(boolean isGranted);
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&¨\u0006\f"}, d2 = {"Lcom/clevertap/android/sdk/PushPermissionHandler$SystemPushPermissionInterface;", "", "isPushPermissionGranted", "", "context", "Landroid/content/Context;", "requestPushPermission", "", "activity", "Landroid/app/Activity;", "navigateToNotificationSettings", "shouldShowRequestPermissionRationale", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface SystemPushPermissionInterface {
        boolean isPushPermissionGranted(@NotNull Context context);

        void navigateToNotificationSettings(@NotNull Activity activity);

        void requestPushPermission(@NotNull Activity activity);

        boolean shouldShowRequestPermissionRationale(@NotNull Activity activity);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushPermissionHandler(@NotNull CleverTapInstanceConfig config, @Nullable List<? extends PushPermissionResponseListener> list) {
        this(config, list, null, null, null, 28, null);
        Intrinsics.echo(config, "config");
    }

    private final void notifyExternalListeners(boolean isPermissionGranted) {
        List<PushPermissionResponseListener> list = this.ctListeners;
        if (list != null) {
            for (PushPermissionResponseListener pushPermissionResponseListener : list) {
                if (pushPermissionResponseListener != null) {
                    pushPermissionResponseListener.onPushPermissionResponse(isPermissionGranted);
                }
            }
        }
    }

    private final void notifyListeners(boolean isPermissionGranted) {
        notifyExternalListeners(isPermissionGranted);
        PushPermissionResultCallback pushPermissionResultCallback = this.pushPermissionCallback.get();
        if (pushPermissionResultCallback != null) {
            pushPermissionResultCallback.onPushPermissionResult(isPermissionGranted);
        }
    }

    public static /* synthetic */ boolean requestPermission$default(PushPermissionHandler pushPermissionHandler, Activity activity, boolean z2, PushPermissionRequestCallback pushPermissionRequestCallback, boolean z10, int i4, Object obj) {
        if ((i4 & 8) != 0) {
            z10 = false;
        }
        return pushPermissionHandler.requestPermission(activity, z2, pushPermissionRequestCallback, z10);
    }

    public final boolean isPushPermissionGranted(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        return this.systemPermissionInterface.isPushPermissionGranted(context);
    }

    public final void notifyPushPermissionExternalListeners(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        notifyExternalListeners(isPushPermissionGranted(context));
    }

    public final void notifyPushPermissionListeners(@NotNull Context context) {
        Intrinsics.echo(context, "context");
        notifyListeners(isPushPermissionGranted(context));
    }

    public final void onActivityResume(@NotNull Activity activity) {
        Intrinsics.echo(activity, "activity");
        if (this.isFromNotificationSettingsActivity) {
            this.isFromNotificationSettingsActivity = false;
            if (Build.VERSION.SDK_INT >= 33) {
                notifyListeners(isPushPermissionGranted(activity));
            }
        }
    }

    public final void onRequestPermissionsResult(@NotNull Activity activity, int requestCode, @NotNull int[] grantResults) {
        Integer valueOf;
        Intrinsics.echo(activity, "activity");
        Intrinsics.echo(grantResults, "grantResults");
        CTPreferenceCache invoke = this.cacheProvider.invoke(activity);
        boolean z2 = false;
        invoke.setFirstTimeRequest(false);
        invoke.updateCacheToDisk(activity, this.config);
        if (requestCode == 102) {
            if (grantResults.length == 0) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(grantResults[0]);
            }
            if (valueOf != null && valueOf.intValue() == 0) {
                z2 = true;
            }
            notifyListeners(z2);
        }
    }

    public final boolean requestPermission(@NotNull Activity activity, boolean fallbackToSettings, @NotNull PushPermissionRequestCallback requestCallback, boolean alwaysRequestIfNotGranted) {
        Intrinsics.echo(activity, "activity");
        Intrinsics.echo(requestCallback, "requestCallback");
        if (isPushPermissionGranted(activity)) {
            notifyListeners(true);
            return false;
        }
        boolean isFirstTimeRequest = this.cacheProvider.invoke(activity).isFirstTimeRequest();
        boolean shouldShowRequestPermissionRationale = this.systemPermissionInterface.shouldShowRequestPermissionRationale(activity);
        if (alwaysRequestIfNotGranted || isFirstTimeRequest || shouldShowRequestPermissionRationale) {
            requestCallback.onRequestPermission();
            return true;
        }
        if (fallbackToSettings) {
            this.isFromNotificationSettingsActivity = true;
            this.systemPermissionInterface.navigateToNotificationSettings(activity);
            return true;
        }
        notifyListeners(false);
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushPermissionHandler(@NotNull CleverTapInstanceConfig config, @Nullable List<? extends PushPermissionResponseListener> list, @Nullable PushPermissionResultCallback pushPermissionResultCallback) {
        this(config, list, pushPermissionResultCallback, null, null, 24, null);
        Intrinsics.echo(config, "config");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PushPermissionHandler(@NotNull CleverTapInstanceConfig config, @Nullable List<? extends PushPermissionResponseListener> list, @Nullable PushPermissionResultCallback pushPermissionResultCallback, @NotNull Function1<? super Context, CTPreferenceCache> cacheProvider) {
        this(config, list, pushPermissionResultCallback, cacheProvider, null, 16, null);
        Intrinsics.echo(config, "config");
        Intrinsics.echo(cacheProvider, "cacheProvider");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PushPermissionHandler(@NotNull CleverTapInstanceConfig config, @Nullable List<? extends PushPermissionResponseListener> list, @Nullable PushPermissionResultCallback pushPermissionResultCallback, @NotNull Function1<? super Context, CTPreferenceCache> cacheProvider, @NotNull SystemPushPermissionInterface systemPermissionInterface) {
        Intrinsics.echo(config, "config");
        Intrinsics.echo(cacheProvider, "cacheProvider");
        Intrinsics.echo(systemPermissionInterface, "systemPermissionInterface");
        this.config = config;
        this.ctListeners = list;
        this.cacheProvider = cacheProvider;
        this.systemPermissionInterface = systemPermissionInterface;
        this.pushPermissionCallback = new WeakReference<>(pushPermissionResultCallback);
    }

    public final void requestPermission(@NotNull final Activity activity, boolean fallbackToSettings) {
        Intrinsics.echo(activity, "activity");
        requestPermission$default(this, activity, fallbackToSettings, new PushPermissionRequestCallback() { // from class: com.clevertap.android.sdk.PushPermissionHandler$requestPermission$1
            @Override // com.clevertap.android.sdk.PushPermissionHandler.PushPermissionRequestCallback
            public void onRequestPermission() {
                PushPermissionHandler.SystemPushPermissionInterface systemPushPermissionInterface;
                systemPushPermissionInterface = PushPermissionHandler.this.systemPermissionInterface;
                systemPushPermissionInterface.requestPushPermission(activity);
            }
        }, false, 8, null);
    }

    public /* synthetic */ PushPermissionHandler(CleverTapInstanceConfig cleverTapInstanceConfig, List list, PushPermissionResultCallback pushPermissionResultCallback, Function1 function1, SystemPushPermissionInterface systemPushPermissionInterface, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(cleverTapInstanceConfig, list, (i4 & 4) != 0 ? null : pushPermissionResultCallback, (i4 & 8) != 0 ? INSTANCE.defaultCacheProvider(cleverTapInstanceConfig) : function1, (i4 & 16) != 0 ? INSTANCE.defaultSystemInterface() : systemPushPermissionInterface);
    }
}
