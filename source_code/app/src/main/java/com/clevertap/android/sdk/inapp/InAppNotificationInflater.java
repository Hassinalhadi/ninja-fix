package com.clevertap.android.sdk.inapp;

import B2.ai;
import B2.e;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.inapp.data.CtCacheType;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.images.repo.FileResourcesRepoImpl;
import com.clevertap.android.sdk.inapp.store.preference.FileStore;
import com.clevertap.android.sdk.inapp.store.preference.InAppAssetsStore;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.task.Task;
import com.clevertap.android.sdk.video.VideoLibChecker;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001#B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001fH\u0002J\u0010\u0010 \u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0010\u0010!\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u001e\u0010\"\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001f2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\n8CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010¨\u0006$"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppNotificationInflater;", "", "storeRegistry", "Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;", "templatesManager", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "executors", "Lcom/clevertap/android/sdk/task/CTExecutors;", "fileResourceProvider", "Lkotlin/Function0;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "isVideoSupported", "", "<init>", "(Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;Lcom/clevertap/android/sdk/task/CTExecutors;Lkotlin/jvm/functions/Function0;Z)V", "getFileResourceProvider", "()Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "fileResourceProvider$delegate", "Lkotlin/Lazy;", "inflate", "", "inAppJson", "Lorg/json/JSONObject;", "taskLogTag", "", "listener", "Lcom/clevertap/android/sdk/inapp/InAppNotificationInflater$InAppNotificationReadyListener;", "prepareForDisplay", Constants.INAPP_KEY, "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "listenerWeakReference", "Ljava/lang/ref/WeakReference;", "processCustomTemplate", "processInAppMedia", "notifyListener", "InAppNotificationReadyListener", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppNotificationInflater {

    @NotNull
    private final CTExecutors executors;

    /* renamed from: fileResourceProvider$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy fileResourceProvider;
    private final boolean isVideoSupported;

    @NotNull
    private final StoreRegistry storeRegistry;

    @NotNull
    private final TemplatesManager templatesManager;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppNotificationInflater$InAppNotificationReadyListener;", "", "onNotificationReady", "", "notification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public interface InAppNotificationReadyListener {
        void onNotificationReady(@NotNull CTInAppNotification notification);
    }

    public InAppNotificationInflater(@NotNull StoreRegistry storeRegistry, @NotNull TemplatesManager templatesManager, @NotNull CTExecutors executors, @NotNull Function0<FileResourceProvider> fileResourceProvider, boolean z2) {
        Intrinsics.echo(storeRegistry, "storeRegistry");
        Intrinsics.echo(templatesManager, "templatesManager");
        Intrinsics.echo(executors, "executors");
        Intrinsics.echo(fileResourceProvider, "fileResourceProvider");
        this.storeRegistry = storeRegistry;
        this.templatesManager = templatesManager;
        this.executors = executors;
        this.isVideoSupported = z2;
        this.fileResourceProvider = LazyKt.lazy(fileResourceProvider);
    }

    public static /* synthetic */ Unit alpha(InAppNotificationReadyListener inAppNotificationReadyListener, CTInAppNotification cTInAppNotification) {
        return notifyListener$lambda$1(inAppNotificationReadyListener, cTInAppNotification);
    }

    public static /* synthetic */ Unit bravo(JSONObject jSONObject, InAppNotificationInflater inAppNotificationInflater, WeakReference weakReference) {
        return inflate$lambda$0(jSONObject, inAppNotificationInflater, weakReference);
    }

    private final FileResourceProvider getFileResourceProvider() {
        return (FileResourceProvider) this.fileResourceProvider.getValue();
    }

    public static final Unit inflate$lambda$0(JSONObject inAppJson, InAppNotificationInflater this$0, WeakReference listenerWeakReference) {
        Intrinsics.echo(inAppJson, "$inAppJson");
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(listenerWeakReference, "$listenerWeakReference");
        CTInAppNotification cTInAppNotification = new CTInAppNotification(inAppJson, this$0.isVideoSupported);
        if (cTInAppNotification.getError() != null) {
            this$0.notifyListener(listenerWeakReference, cTInAppNotification);
            return Unit.INSTANCE;
        }
        this$0.prepareForDisplay(cTInAppNotification, listenerWeakReference);
        return Unit.INSTANCE;
    }

    private final void notifyListener(WeakReference<InAppNotificationReadyListener> listenerWeakReference, CTInAppNotification r5) {
        InAppNotificationReadyListener inAppNotificationReadyListener = listenerWeakReference.get();
        if (inAppNotificationReadyListener != null) {
            this.executors.mainTask().execute("InAppNotificationInflater:onNotificationReady", new ai(4, inAppNotificationReadyListener, r5));
        }
    }

    public static final Unit notifyListener$lambda$1(InAppNotificationReadyListener inAppNotificationReadyListener, CTInAppNotification inApp) {
        Intrinsics.echo(inApp, "$inApp");
        inAppNotificationReadyListener.onNotificationReady(inApp);
        return Unit.INSTANCE;
    }

    private final void prepareForDisplay(CTInAppNotification r32, WeakReference<InAppNotificationReadyListener> listenerWeakReference) {
        if (CTInAppType.CTInAppTypeCustomCodeTemplate == r32.getInAppType()) {
            processCustomTemplate(r32);
        } else {
            processInAppMedia(r32);
        }
        notifyListener(listenerWeakReference, r32);
    }

    private final void processCustomTemplate(CTInAppNotification r72) {
        List<String> emptyList;
        boolean z2;
        CustomTemplateInAppData customTemplateData = r72.getCustomTemplateData();
        if (customTemplateData == null || (emptyList = customTemplateData.getFileArgsUrls$clevertap_core_release(this.templatesManager)) == null) {
            emptyList = CollectionsKt.emptyList();
        }
        Pair<FileStore, InAppAssetsStore> pair = new Pair<>(this.storeRegistry.getFilesStore(), this.storeRegistry.getInAppAssetsStore());
        for (String str : emptyList) {
            byte[] fetchFile = getFileResourceProvider().fetchFile(str);
            if (fetchFile != null) {
                if (fetchFile.length == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (!z2) {
                    FileResourcesRepoImpl.INSTANCE.saveUrlExpiryToStore(new Pair<>(str, CtCacheType.FILES), pair);
                }
            }
            r72.setError$clevertap_core_release("Error processing the custom code in-app template: file download failed.");
            return;
        }
    }

    private final void processInAppMedia(CTInAppNotification r4) {
        for (CTInAppNotificationMedia cTInAppNotificationMedia : r4.getMediaList$clevertap_core_release()) {
            if (cTInAppNotificationMedia.isGIF()) {
                byte[] fetchInAppGifV1 = getFileResourceProvider().fetchInAppGifV1(cTInAppNotificationMedia.getMediaUrl());
                if (fetchInAppGifV1 == null || fetchInAppGifV1.length == 0) {
                    r4.setError$clevertap_core_release("Error processing GIF");
                    return;
                }
            } else if (cTInAppNotificationMedia.isImage()) {
                if (getFileResourceProvider().fetchInAppImageV1(cTInAppNotificationMedia.getMediaUrl()) == null) {
                    r4.setError$clevertap_core_release("Error processing image as bitmap was NULL");
                    return;
                }
            } else if (cTInAppNotificationMedia.isVideo() || cTInAppNotificationMedia.isAudio()) {
                if (!this.isVideoSupported) {
                    r4.setError$clevertap_core_release("InApp Video/Audio is not supported");
                    return;
                }
            }
        }
    }

    public final void inflate(@NotNull JSONObject inAppJson, @NotNull String taskLogTag, @NotNull InAppNotificationReadyListener listener) {
        Intrinsics.echo(inAppJson, "inAppJson");
        Intrinsics.echo(taskLogTag, "taskLogTag");
        Intrinsics.echo(listener, "listener");
        WeakReference weakReference = new WeakReference(listener);
        Task postAsyncSafelyTask = this.executors.postAsyncSafelyTask(Constants.TAG_FEATURE_IN_APPS);
        Intrinsics.delta(postAsyncSafelyTask, "postAsyncSafelyTask(...)");
        postAsyncSafelyTask.execute(taskLogTag, new e(inAppJson, this, weakReference, 5));
    }

    public /* synthetic */ InAppNotificationInflater(StoreRegistry storeRegistry, TemplatesManager templatesManager, CTExecutors cTExecutors, Function0 function0, boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(storeRegistry, templatesManager, cTExecutors, function0, (i4 & 16) != 0 ? VideoLibChecker.haveVideoPlayerSupport : z2);
    }
}
