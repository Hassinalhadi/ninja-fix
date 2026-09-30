package com.clevertap.android.sdk.inapp;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import av.ax;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.PushPermissionHandler;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.clevertap.android.sdk.utils.PlayStoreReviewHandler;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001/B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J7\u0010\u001b\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u001a\u0010\u001a\u001a\u0016\u0012\f\u0012\n\u0018\u00010\u0018j\u0004\u0018\u0001`\u0019\u0012\u0004\u0012\u00020\u00150\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u000f¢\u0006\u0004\b\u001d\u0010\u0013J\r\u0010\u001e\u001a\u00020\u0015¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f¢\u0006\u0004\b!\u0010\"J'\u0010!\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\b\b\u0002\u0010#\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b!\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u001c\u0010-\u001a\n ,*\u0004\u0018\u00010+0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppActionHandler;", "", "Landroid/content/Context;", "context", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "ctConfig", "Lcom/clevertap/android/sdk/PushPermissionHandler;", "pushPermissionHandler", "Lcom/clevertap/android/sdk/utils/PlayStoreReviewHandler;", "playStoreReviewHandler", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/PushPermissionHandler;Lcom/clevertap/android/sdk/utils/PlayStoreReviewHandler;)V", "", Constants.KEY_URL, "launchContext", "", "openUrl", "(Ljava/lang/String;Landroid/content/Context;)Z", "isPlayStoreReviewLibraryAvailable", "()Z", "Lkotlin/Function0;", "", "onCompleted", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onError", "launchPlayStoreReviewFlow", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V", "arePushNotificationsEnabled", "notifyPushPermissionListeners", "()V", "fallbackToSettings", "launchPushPermissionPrompt", "(Z)Z", "alwaysRequestIfNotGranted", "Lcom/clevertap/android/sdk/inapp/InAppActionHandler$PushPermissionPromptPresenter;", "presenter", "(ZZLcom/clevertap/android/sdk/inapp/InAppActionHandler$PushPermissionPromptPresenter;)Z", "Landroid/content/Context;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "Lcom/clevertap/android/sdk/PushPermissionHandler;", "Lcom/clevertap/android/sdk/utils/PlayStoreReviewHandler;", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "logger", "Lcom/clevertap/android/sdk/Logger;", "PushPermissionPromptPresenter", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppActionHandler {

    @NotNull
    private final Context context;

    @NotNull
    private final CleverTapInstanceConfig ctConfig;
    private final Logger logger;

    @NotNull
    private final PlayStoreReviewHandler playStoreReviewHandler;

    @NotNull
    private final PushPermissionHandler pushPermissionHandler;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppActionHandler$PushPermissionPromptPresenter;", "", "showPrompt", "", "activity", "Landroid/app/Activity;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface PushPermissionPromptPresenter {
        void showPrompt(@NotNull Activity activity);
    }

    public InAppActionHandler(@NotNull Context context, @NotNull CleverTapInstanceConfig ctConfig, @NotNull PushPermissionHandler pushPermissionHandler, @NotNull PlayStoreReviewHandler playStoreReviewHandler) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(ctConfig, "ctConfig");
        Intrinsics.echo(pushPermissionHandler, "pushPermissionHandler");
        Intrinsics.echo(playStoreReviewHandler, "playStoreReviewHandler");
        this.context = context;
        this.ctConfig = ctConfig;
        this.pushPermissionHandler = pushPermissionHandler;
        this.playStoreReviewHandler = playStoreReviewHandler;
        this.logger = ctConfig.getLogger();
    }

    public static /* synthetic */ boolean launchPushPermissionPrompt$default(InAppActionHandler inAppActionHandler, boolean z2, boolean z10, PushPermissionPromptPresenter pushPermissionPromptPresenter, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            z10 = false;
        }
        return inAppActionHandler.launchPushPermissionPrompt(z2, z10, pushPermissionPromptPresenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void launchPushPermissionPrompt$lambda$0(boolean z2, InAppActionHandler this$0, Activity activity) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(activity, "activity");
        if (activity instanceof InAppNotificationActivity) {
            ((InAppNotificationActivity) activity).showPushPermissionPrompt(z2);
        } else {
            InAppNotificationActivity.launchForPushPermissionPrompt(activity, this$0.ctConfig, z2);
        }
    }

    public static /* synthetic */ boolean openUrl$default(InAppActionHandler inAppActionHandler, String str, Context context, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            context = null;
        }
        return inAppActionHandler.openUrl(str, context);
    }

    public final boolean arePushNotificationsEnabled() {
        return this.pushPermissionHandler.isPushPermissionGranted(this.context);
    }

    public final boolean isPlayStoreReviewLibraryAvailable() {
        return this.playStoreReviewHandler.isPlayStoreReviewLibraryAvailable();
    }

    public final void launchPlayStoreReviewFlow(@NotNull Function0<Unit> onCompleted, @NotNull Function1<? super Exception, Unit> onError) {
        Intrinsics.echo(onCompleted, "onCompleted");
        Intrinsics.echo(onError, "onError");
        PlayStoreReviewHandler playStoreReviewHandler = this.playStoreReviewHandler;
        Context context = this.context;
        Logger logger = this.logger;
        Intrinsics.delta(logger, "logger");
        playStoreReviewHandler.launchReview(context, logger, onCompleted, onError);
    }

    public final boolean launchPushPermissionPrompt(boolean fallbackToSettings) {
        return launchPushPermissionPrompt$default(this, fallbackToSettings, false, new ax(fallbackToSettings, this), 2, null);
    }

    public final void notifyPushPermissionListeners() {
        this.pushPermissionHandler.notifyPushPermissionListeners(this.context);
    }

    public final boolean openUrl(@NotNull String url, @Nullable Context launchContext) {
        Intrinsics.echo(url, "url");
        try {
            Uri parse = Uri.parse(r.oscar(r.oscar(url, "\n", ""), "\r", ""));
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Bundle bundle = new Bundle();
            Set<String> set = queryParameterNames;
            if (set != null && !set.isEmpty()) {
                for (String str : queryParameterNames) {
                    bundle.putString(str, parse.getQueryParameter(str));
                }
            }
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            if (!bundle.isEmpty()) {
                intent.putExtras(bundle);
            }
            if (launchContext == null) {
                intent.setFlags(268435456);
                launchContext = this.context;
            }
            Utils.setPackageNameFromResolveInfoList(launchContext, intent);
            launchContext.startActivity(intent);
            return true;
        } catch (Exception unused) {
            if (r.quebec(url, Constants.WZRK_URL_SCHEMA, false)) {
                return true;
            }
            this.logger.debug("No activity found to open url: ".concat(url));
            return false;
        }
    }

    public final boolean launchPushPermissionPrompt(boolean fallbackToSettings, boolean alwaysRequestIfNotGranted, @NotNull final PushPermissionPromptPresenter presenter) {
        Intrinsics.echo(presenter, "presenter");
        final Activity currentActivity = CoreMetaData.getCurrentActivity();
        if (currentActivity == null) {
            this.logger.debug("CurrentActivity reference is null. SDK can't prompt the user with Notification Permission! Ensure the following things:\n1. Calling ActivityLifecycleCallback.register(this) in your custom application class before super.onCreate().\n   Alternatively, register CleverTap SDK's Application class in the manifest using com.clevertap.android.sdk.Application.\n2. Ensure that the promptPushPrimer() API is called from the onResume() lifecycle method, not onCreate().");
            return false;
        }
        return this.pushPermissionHandler.requestPermission(currentActivity, fallbackToSettings, new PushPermissionHandler.PushPermissionRequestCallback() { // from class: com.clevertap.android.sdk.inapp.InAppActionHandler$launchPushPermissionPrompt$2
            @Override // com.clevertap.android.sdk.PushPermissionHandler.PushPermissionRequestCallback
            public void onRequestPermission() {
                InAppActionHandler.PushPermissionPromptPresenter.this.showPrompt(currentActivity);
            }
        }, alwaysRequestIfNotGranted);
    }

    public /* synthetic */ InAppActionHandler(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, PushPermissionHandler pushPermissionHandler, PlayStoreReviewHandler playStoreReviewHandler, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cleverTapInstanceConfig, pushPermissionHandler, (i4 & 8) != 0 ? new PlayStoreReviewHandler() : playStoreReviewHandler);
    }
}
