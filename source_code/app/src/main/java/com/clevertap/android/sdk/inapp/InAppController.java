package com.clevertap.android.sdk.inapp;

import A2.ao;
import B2.ai;
import E8.g;
import Ya.c;
import Yb.C0312j0;
import android.app.Activity;
import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Looper;
import bz.af;
import com.clevertap.android.sdk.AnalyticsManager;
import com.clevertap.android.sdk.BaseCallbackManager;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ControllerManager;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.InAppFCManager;
import com.clevertap.android.sdk.InAppNotificationActivity;
import com.clevertap.android.sdk.InAppNotificationListener;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.ManifestInfo;
import com.clevertap.android.sdk.StorageHelper;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.inapp.data.InAppResponseAdapter;
import com.clevertap.android.sdk.inapp.evaluation.EvaluationManager;
import com.clevertap.android.sdk.inapp.evaluation.TriggerAdapter;
import com.clevertap.android.sdk.inapp.fragment.CTInAppBaseFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlFooterFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppHtmlHeaderFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeFooterFragment;
import com.clevertap.android.sdk.inapp.fragment.CTInAppNativeHeaderFragment;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.network.NetworkManager;
import com.clevertap.android.sdk.task.CTExecutors;
import com.clevertap.android.sdk.task.Task;
import com.clevertap.android.sdk.utils.Clock;
import com.clevertap.android.sdk.utils.JsonUtilsKt;
import com.clevertap.android.sdk.variables.JsonUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import s6.AbstractC2708l7;

@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 y2\u00020\u0001:\u0002xyB\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f¢\u0006\u0004\b \u0010!J\u000e\u00102\u001a\u00020$2\u0006\u00103\u001a\u000204J\u000e\u00105\u001a\u00020$2\u0006\u00106\u001a\u000207J\u0006\u00108\u001a\u000207J4\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020>2\u0006\u0010?\u001a\u00020,2\b\u0010@\u001a\u0004\u0018\u00010:2\b\u0010A\u001a\u0004\u0018\u00010\u0003H\u0016J$\u0010B\u001a\u0004\u0018\u00010:2\u0006\u0010;\u001a\u00020<2\u0006\u0010C\u001a\u00020D2\b\u0010A\u001a\u0004\u0018\u00010\u0003H\u0016J\u001a\u0010E\u001a\u00020$2\u0006\u0010;\u001a\u00020<2\b\u0010F\u001a\u0004\u0018\u00010:H\u0016J\u001a\u0010G\u001a\u00020$2\u0006\u0010;\u001a\u00020<2\b\u0010F\u001a\u0004\u0018\u00010:H\u0016J\u0006\u0010H\u001a\u00020$J\u0006\u0010I\u001a\u00020$J\u0006\u0010J\u001a\u00020$J\u0010\u0010K\u001a\u00020$2\u0006\u0010L\u001a\u00020MH\u0007J.\u0010N\u001a\u00020$2\u0006\u0010O\u001a\u00020,2\u0012\u0010P\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020R0Q2\b\u0010S\u001a\u0004\u0018\u00010TH\u0007J@\u0010U\u001a\u00020$2\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020R0Q2\u0018\u0010W\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020R0Q0X2\b\u0010S\u001a\u0004\u0018\u00010TH\u0007J2\u0010Y\u001a\u00020$2\u001e\u0010Z\u001a\u001a\u0012\u0004\u0012\u00020,\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020R0Q0Q2\b\u0010[\u001a\u0004\u0018\u00010TH\u0007J\u0018\u0010\\\u001a\u00020$2\u0006\u0010]\u001a\u00020M2\b\u0010S\u001a\u0004\u0018\u00010TJ\u0006\u0010^\u001a\u00020$J\b\u0010_\u001a\u00020$H\u0002J\u0010\u0010`\u001a\u00020$2\u0006\u0010a\u001a\u000204H\u0002J\u0012\u0010b\u001a\u0002072\b\u0010c\u001a\u0004\u0018\u00010dH\u0002J\b\u0010e\u001a\u000207H\u0002J\u0010\u0010f\u001a\u00020$2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010g\u001a\u00020$2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010h\u001a\u00020$2\u0006\u00103\u001a\u000204H\u0002J\u0016\u0010i\u001a\b\u0012\u0004\u0012\u00020,012\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\b\u0010j\u001a\u000207H\u0002J\u0010\u0010k\u001a\u00020$2\u0006\u0010;\u001a\u00020<H\u0002J\u0018\u0010l\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010m\u001a\u00020$2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010n\u001a\u0002072\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010o\u001a\u00020$2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010p\u001a\u00020$2\u0006\u0010;\u001a\u00020<H\u0002J\u0010\u0010q\u001a\u00020M2\u0006\u0010r\u001a\u00020MH\u0002J\u0010\u0010s\u001a\u0002072\u0006\u0010a\u001a\u000204H\u0002J\u001a\u0010t\u001a\u00020$2\u0006\u0010u\u001a\u00020<2\b\u0010v\u001a\u0004\u0018\u00010wH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\n )*\u0004\u0018\u00010(0(X\u0082\u0004¢\u0006\u0004\n\u0002\u0010*R\u0018\u0010+\u001a\n )*\u0004\u0018\u00010,0,X\u0082\u0004¢\u0006\u0004\n\u0002\u0010-R\u000e\u0010.\u001a\u00020/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020,01X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006z"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppController;", "Lcom/clevertap/android/sdk/inapp/InAppListener;", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "executors", "Lcom/clevertap/android/sdk/task/CTExecutors;", "controllerManager", "Lcom/clevertap/android/sdk/ControllerManager;", "callbackManager", "Lcom/clevertap/android/sdk/BaseCallbackManager;", "analyticsManager", "Lcom/clevertap/android/sdk/AnalyticsManager;", "coreMetaData", "Lcom/clevertap/android/sdk/CoreMetaData;", "manifestInfo", "Lcom/clevertap/android/sdk/ManifestInfo;", "deviceInfo", "Lcom/clevertap/android/sdk/DeviceInfo;", "inAppQueue", "Lcom/clevertap/android/sdk/inapp/InAppQueue;", "evaluationManager", "Lcom/clevertap/android/sdk/inapp/evaluation/EvaluationManager;", "templatesManager", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "inAppActionHandler", "Lcom/clevertap/android/sdk/inapp/InAppActionHandler;", "inAppNotificationInflater", "Lcom/clevertap/android/sdk/inapp/InAppNotificationInflater;", "clock", "Lcom/clevertap/android/sdk/utils/Clock;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/task/CTExecutors;Lcom/clevertap/android/sdk/ControllerManager;Lcom/clevertap/android/sdk/BaseCallbackManager;Lcom/clevertap/android/sdk/AnalyticsManager;Lcom/clevertap/android/sdk/CoreMetaData;Lcom/clevertap/android/sdk/ManifestInfo;Lcom/clevertap/android/sdk/DeviceInfo;Lcom/clevertap/android/sdk/inapp/InAppQueue;Lcom/clevertap/android/sdk/inapp/evaluation/EvaluationManager;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;Lcom/clevertap/android/sdk/inapp/InAppActionHandler;Lcom/clevertap/android/sdk/inapp/InAppNotificationInflater;Lcom/clevertap/android/sdk/utils/Clock;)V", "onAppLaunchEventSent", "Lkotlin/Function0;", "", "getOnAppLaunchEventSent", "()Lkotlin/jvm/functions/Function0;", "logger", "Lcom/clevertap/android/sdk/Logger;", "kotlin.jvm.PlatformType", "Lcom/clevertap/android/sdk/Logger;", "defaultLogTag", "", "Ljava/lang/String;", "inAppState", "Lcom/clevertap/android/sdk/inapp/InAppController$InAppState;", "inAppExcludedActivityNames", "", "promptPushPrimer", "jsonObject", "Lorg/json/JSONObject;", "promptPermission", "showFallbackSettings", "", "isPushPermissionGranted", "inAppNotificationActionTriggered", "Landroid/os/Bundle;", "inAppNotification", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", Constants.KEY_ACTION, "Lcom/clevertap/android/sdk/inapp/CTInAppAction;", "callToAction", "additionalData", "activityContext", "inAppNotificationDidClick", "button", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "inAppNotificationDidDismiss", "formData", "inAppNotificationDidShow", "discardInApps", "resumeInApps", "suspendInApps", "addInAppNotificationsToQueue", "inappNotifs", "Lorg/json/JSONArray;", "onQueueEvent", "eventName", TriggerAdapter.KEY_EVENT_PROPERTIES, "", "", "userLocation", "Landroid/location/Location;", "onQueueChargedEvent", "chargeDetails", "items", "", "onQueueProfileEvent", "userAttributeChangedProperties", "location", "onAppLaunchServerSideInAppsResponse", "appLaunchServerSideInApps", "showNotificationIfAvailable", "_showNotificationIfAvailable", "addInAppNotificationInFrontOfQueue", Constants.INAPP_KEY, "canShowInAppOnActivity", "activity", "Landroid/app/Activity;", "canShowInAppOnCurrentActivity", "displayNotification", "notificationReady", "prepareNotificationForDisplay", "getExcludedActivitiesSet", "checkPendingNotifications", "inAppDidDismiss", "incrementLocalInAppCountInPersistentStore", "checkLimitsBeforeShowing", "checkBeforeShowApprovalBeforeDisplay", "showInApp", "presentTemplate", "filterNonRegisteredCustomTemplates", "inAppNotifications", "isNonRegisteredCustomTemplate", "triggerCustomTemplateAction", "notification", "templateInAppData", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "InAppState", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class InAppController implements InAppListener {

    @NotNull
    public static final String IS_FIRST_TIME_PERMISSION_REQUEST = "firstTimeRequest";

    @NotNull
    public static final String LOCAL_INAPP_COUNT = "local_in_app_count";

    @Nullable
    private static volatile CTInAppNotification currentlyDisplayingInApp;

    @NotNull
    private final AnalyticsManager analyticsManager;

    @NotNull
    private final BaseCallbackManager callbackManager;

    @NotNull
    private final Clock clock;

    @NotNull
    private final CleverTapInstanceConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final ControllerManager controllerManager;

    @NotNull
    private final CoreMetaData coreMetaData;
    private final String defaultLogTag;

    @NotNull
    private final DeviceInfo deviceInfo;

    @NotNull
    private final EvaluationManager evaluationManager;

    @NotNull
    private final CTExecutors executors;

    @NotNull
    private final InAppActionHandler inAppActionHandler;

    @NotNull
    private final Set<String> inAppExcludedActivityNames;

    @NotNull
    private final InAppNotificationInflater inAppNotificationInflater;

    @NotNull
    private final InAppQueue inAppQueue;

    @NotNull
    private InAppState inAppState;
    private final Logger logger;

    @NotNull
    private final Function0<Unit> onAppLaunchEventSent;

    @NotNull
    private final TemplatesManager templatesManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final List<CTInAppNotification> pendingNotifications = Collections.synchronizedList(new ArrayList());

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R4\u0010\u0007\u001a&\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t \n*\u0012\u0012\f\u0012\n \n*\u0004\u0018\u00010\t0\t\u0018\u00010\u000b0\bX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\fR*\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\t8\u0000@BX\u0081\u000e¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppController$Companion;", "", "<init>", "()V", "LOCAL_INAPP_COUNT", "", "IS_FIRST_TIME_PERMISSION_REQUEST", "pendingNotifications", "", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "kotlin.jvm.PlatformType", "", "Ljava/util/List;", "value", "currentlyDisplayingInApp", "getCurrentlyDisplayingInApp$clevertap_core_release$annotations", "getCurrentlyDisplayingInApp$clevertap_core_release", "()Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "clearCurrentlyDisplayingInApp", "", "clearCurrentlyDisplayingInApp$clevertap_core_release", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ void getCurrentlyDisplayingInApp$clevertap_core_release$annotations() {
        }

        public final void clearCurrentlyDisplayingInApp$clevertap_core_release() {
            InAppController.currentlyDisplayingInApp = null;
        }

        @Nullable
        public final CTInAppNotification getCurrentlyDisplayingInApp$clevertap_core_release() {
            return InAppController.currentlyDisplayingInApp;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/clevertap/android/sdk/inapp/InAppController$InAppState;", "", "<init>", "(Ljava/lang/String;I)V", "DISCARDED", "SUSPENDED", "RESUMED", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class InAppState extends Enum<InAppState> {
        private static final /* synthetic */ Qd.a $ENTRIES;
        private static final /* synthetic */ InAppState[] $VALUES;
        public static final InAppState DISCARDED = new InAppState("DISCARDED", 0);
        public static final InAppState SUSPENDED = new InAppState("SUSPENDED", 1);
        public static final InAppState RESUMED = new InAppState("RESUMED", 2);

        private static final /* synthetic */ InAppState[] $values() {
            return new InAppState[]{DISCARDED, SUSPENDED, RESUMED};
        }

        static {
            InAppState[] $values = $values();
            $VALUES = $values;
            $ENTRIES = AbstractC2708l7.bravo($values);
        }

        private InAppState(String str, int i4) {
            super(str, i4);
        }

        @NotNull
        public static Qd.a getEntries() {
            return $ENTRIES;
        }

        public static InAppState valueOf(String str) {
            return (InAppState) Enum.valueOf(InAppState.class, str);
        }

        public static InAppState[] values() {
            return (InAppState[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InAppActionType.values().length];
            try {
                iArr[InAppActionType.CUSTOM_CODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InAppActionType.CLOSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InAppActionType.OPEN_URL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[InAppActionType.KEY_VALUES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[CTInAppType.values().length];
            try {
                iArr2[CTInAppType.CTInAppTypeCoverHTML.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeInterstitialHTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHalfInterstitialHTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeCover.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeInterstitial.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeAlert.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 10;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeFooterHTML.ordinal()] = 11;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHeaderHTML.ordinal()] = 12;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeFooter.ordinal()] = 13;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeHeader.ordinal()] = 14;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[CTInAppType.CTInAppTypeCustomCodeTemplate.ordinal()] = 15;
            } catch (NoSuchFieldError unused19) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public InAppController(@NotNull Context context, @NotNull CleverTapInstanceConfig config, @NotNull CTExecutors executors, @NotNull ControllerManager controllerManager, @NotNull BaseCallbackManager callbackManager, @NotNull AnalyticsManager analyticsManager, @NotNull CoreMetaData coreMetaData, @NotNull ManifestInfo manifestInfo, @NotNull DeviceInfo deviceInfo, @NotNull InAppQueue inAppQueue, @NotNull EvaluationManager evaluationManager, @NotNull TemplatesManager templatesManager, @NotNull InAppActionHandler inAppActionHandler, @NotNull InAppNotificationInflater inAppNotificationInflater, @NotNull Clock clock) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(executors, "executors");
        Intrinsics.echo(controllerManager, "controllerManager");
        Intrinsics.echo(callbackManager, "callbackManager");
        Intrinsics.echo(analyticsManager, "analyticsManager");
        Intrinsics.echo(coreMetaData, "coreMetaData");
        Intrinsics.echo(manifestInfo, "manifestInfo");
        Intrinsics.echo(deviceInfo, "deviceInfo");
        Intrinsics.echo(inAppQueue, "inAppQueue");
        Intrinsics.echo(evaluationManager, "evaluationManager");
        Intrinsics.echo(templatesManager, "templatesManager");
        Intrinsics.echo(inAppActionHandler, "inAppActionHandler");
        Intrinsics.echo(inAppNotificationInflater, "inAppNotificationInflater");
        Intrinsics.echo(clock, "clock");
        this.context = context;
        this.config = config;
        this.executors = executors;
        this.controllerManager = controllerManager;
        this.callbackManager = callbackManager;
        this.analyticsManager = analyticsManager;
        this.coreMetaData = coreMetaData;
        this.deviceInfo = deviceInfo;
        this.inAppQueue = inAppQueue;
        this.evaluationManager = evaluationManager;
        this.templatesManager = templatesManager;
        this.inAppActionHandler = inAppActionHandler;
        this.inAppNotificationInflater = inAppNotificationInflater;
        this.clock = clock;
        this.onAppLaunchEventSent = new C0312j0(19, this);
        this.logger = config.getLogger();
        this.defaultLogTag = config.getAccountId();
        this.inAppState = InAppState.RESUMED;
        this.inAppExcludedActivityNames = getExcludedActivitiesSet(manifestInfo);
    }

    private final void _showNotificationIfAvailable() {
        JSONObject dequeue;
        try {
            if (!canShowInAppOnCurrentActivity()) {
                Logger.v("Not showing notification on blacklisted activity");
                return;
            }
            if (this.inAppState == InAppState.SUSPENDED) {
                this.logger.debug(this.defaultLogTag, "InApp Notifications are set to be suspended, not showing the InApp Notification");
                return;
            }
            if (!checkPendingNotifications() && (dequeue = this.inAppQueue.dequeue()) != null) {
                if (this.inAppState != InAppState.DISCARDED) {
                    prepareNotificationForDisplay(dequeue);
                } else {
                    this.logger.debug(this.defaultLogTag, "InApp Notifications are set to be discarded, dropping the InApp Notification");
                }
            }
        } catch (Throwable th) {
            this.logger.verbose(this.defaultLogTag, "InApp: Couldn't parse JSON array string from prefs", th);
        }
    }

    private final void addInAppNotificationInFrontOfQueue(JSONObject r22) {
        if (isNonRegisteredCustomTemplate(r22)) {
            return;
        }
        this.inAppQueue.insertInFront(r22);
        showNotificationIfAvailable();
    }

    public static /* synthetic */ void bravo(InAppController inAppController, CTInAppNotification cTInAppNotification, Boolean bool) {
        checkLimitsBeforeShowing$lambda$8(inAppController, cTInAppNotification, bool);
    }

    private final boolean canShowInAppOnActivity(Activity activity) {
        if (activity != null) {
            String localClassName = activity.getLocalClassName();
            Intrinsics.delta(localClassName, "getLocalClassName(...)");
            Iterator<String> it = this.inAppExcludedActivityNames.iterator();
            while (it.hasNext()) {
                if (StringsKt.beige(localClassName, it.next(), false)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    private final boolean canShowInAppOnCurrentActivity() {
        return canShowInAppOnActivity(CoreMetaData.getCurrentActivity());
    }

    private final boolean checkBeforeShowApprovalBeforeDisplay(CTInAppNotification inAppNotification) {
        HashMap<String, Object> hashMap;
        InAppNotificationListener inAppNotificationListener = this.callbackManager.getInAppNotificationListener();
        if (inAppNotificationListener != null) {
            if (inAppNotification.getCustomExtras() != null) {
                hashMap = Utils.convertJSONObjectToHashMap(inAppNotification.getCustomExtras());
            } else {
                hashMap = new HashMap<>();
            }
            return inAppNotificationListener.beforeShow(hashMap);
        }
        return true;
    }

    private final void checkLimitsBeforeShowing(CTInAppNotification inAppNotification) {
        Task ioTask = this.executors.ioTask();
        ioTask.addOnSuccessListener(new ao(25, this, inAppNotification));
        ioTask.execute("checkLimitsBeforeShowing", new a(this, inAppNotification, 1));
    }

    public static final Boolean checkLimitsBeforeShowing$lambda$10(InAppController this$0, CTInAppNotification inAppNotification) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(inAppNotification, "$inAppNotification");
        InAppFCManager inAppFCManager = this$0.controllerManager.getInAppFCManager();
        if (inAppFCManager != null) {
            if (!inAppFCManager.canShow(inAppNotification, new af(5, this$0))) {
                this$0.logger.verbose(this$0.defaultLogTag, "InApp has been rejected by FC, not showing " + inAppNotification.getCampaignId());
                return Boolean.FALSE;
            }
            return Boolean.TRUE;
        }
        this$0.logger.verbose(this$0.defaultLogTag, "InAppFCManager() is null, not showing " + inAppNotification.getCampaignId());
        return Boolean.FALSE;
    }

    public static final boolean checkLimitsBeforeShowing$lambda$10$lambda$9(InAppController this$0, JSONObject inAppJSON, String inAppId) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(inAppJSON, "inAppJSON");
        Intrinsics.echo(inAppId, "inAppId");
        return !this$0.evaluationManager.matchWhenLimitsBeforeDisplay(InAppResponseAdapter.INSTANCE.getListOfWhenLimits(inAppJSON), inAppId);
    }

    public static final void checkLimitsBeforeShowing$lambda$8(InAppController this$0, CTInAppNotification inAppNotification, Boolean bool) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(inAppNotification, "$inAppNotification");
        if (bool.booleanValue()) {
            this$0.showInApp(inAppNotification);
        } else {
            this$0.showNotificationIfAvailable();
        }
    }

    private final boolean checkPendingNotifications() {
        Logger.v(this.defaultLogTag, "checking Pending Notifications");
        List<CTInAppNotification> pendingNotifications2 = pendingNotifications;
        Intrinsics.delta(pendingNotifications2, "pendingNotifications");
        synchronized (pendingNotifications2) {
            if (pendingNotifications2.isEmpty()) {
                return false;
            }
            CTInAppNotification remove = pendingNotifications2.remove(0);
            Intrinsics.checkNotNull(remove);
            checkLimitsBeforeShowing(remove);
            return true;
        }
    }

    private final void displayNotification(CTInAppNotification inAppNotification) {
        if (!Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
            this.executors.mainTask().execute("InAppController:displayNotification", new a(this, inAppNotification, 2));
            return;
        }
        if (inAppNotification.getIsRequestForPushPermission() && this.inAppActionHandler.arePushNotificationsEnabled()) {
            this.logger.verbose(this.defaultLogTag, "Not showing push permission request, permission is already granted");
            this.inAppActionHandler.notifyPushPermissionListeners();
            showNotificationIfAvailable();
        } else {
            checkLimitsBeforeShowing(inAppNotification);
            incrementLocalInAppCountInPersistentStore(this.context, inAppNotification);
        }
    }

    public static final Unit displayNotification$lambda$4(InAppController this$0, CTInAppNotification inAppNotification) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(inAppNotification, "$inAppNotification");
        this$0.displayNotification(inAppNotification);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void echo(InAppController inAppController, JSONObject jSONObject, Activity activity) {
        promptPushPrimer$lambda$1(inAppController, jSONObject, activity);
    }

    private final JSONArray filterNonRegisteredCustomTemplates(JSONArray inAppNotifications) {
        return JsonUtilsKt.filterObjects(inAppNotifications, new c(23, this));
    }

    public static final boolean filterNonRegisteredCustomTemplates$lambda$11(InAppController this$0, JSONObject jsonObject) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(jsonObject, "jsonObject");
        return !this$0.isNonRegisteredCustomTemplate(jsonObject);
    }

    private final Set<String> getExcludedActivitiesSet(ManifestInfo manifestInfo) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        String excludedActivities = manifestInfo.getExcludedActivities();
        if (excludedActivities != null) {
            Iterator it = StringsKt.maroon(excludedActivities, new String[]{Constants.SEPARATOR_COMMA}, 6).iterator();
            while (it.hasNext()) {
                String obj = StringsKt.b((String) it.next()).toString();
                if (!StringsKt.gray(obj)) {
                    linkedHashSet.add(obj);
                }
            }
        }
        this.logger.debug(this.defaultLogTag, "In-app notifications will not be shown on " + CollectionsKt.maroon(linkedHashSet, null, null, null, null, 63));
        return linkedHashSet;
    }

    private final void inAppDidDismiss(CTInAppNotification inAppNotification) {
        String str;
        Logger.v(this.defaultLogTag, "Running inAppDidDismiss");
        if (currentlyDisplayingInApp != null) {
            CTInAppNotification cTInAppNotification = currentlyDisplayingInApp;
            if (cTInAppNotification != null) {
                str = cTInAppNotification.getCampaignId();
            } else {
                str = null;
            }
            if (Intrinsics.areEqual(str, inAppNotification.getCampaignId())) {
                currentlyDisplayingInApp = null;
                checkPendingNotifications();
            }
        }
    }

    public static final Unit inAppNotificationDidDismiss$lambda$2(InAppController this$0, CTInAppNotification inAppNotification) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(inAppNotification, "$inAppNotification");
        this$0.inAppDidDismiss(inAppNotification);
        this$0._showNotificationIfAvailable();
        return Unit.INSTANCE;
    }

    private final void incrementLocalInAppCountInPersistentStore(Context context, CTInAppNotification inAppNotification) {
        if (inAppNotification.getIsLocalInApp()) {
            this.deviceInfo.incrementLocalInAppCount();
            this.executors.ioTask().execute("InAppController#incrementLocalInAppCountInPersistentStore", new ai(3, context, this));
        }
    }

    public static final Unit incrementLocalInAppCountInPersistentStore$lambda$7(Context context, InAppController this$0) {
        Intrinsics.echo(context, "$context");
        Intrinsics.echo(this$0, "this$0");
        StorageHelper.putIntImmediate(context, LOCAL_INAPP_COUNT, this$0.deviceInfo.getLocalInAppCount());
        return Unit.INSTANCE;
    }

    private final boolean isNonRegisteredCustomTemplate(JSONObject r5) {
        String str;
        boolean z2;
        CustomTemplateInAppData createFromJson = CustomTemplateInAppData.INSTANCE.createFromJson(r5);
        if (createFromJson != null) {
            str = createFromJson.getTemplateName();
        } else {
            str = null;
        }
        if (str != null && !this.templatesManager.isTemplateRegistered(str)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.logger.info("CustomTemplates", "Template with name \"" + str + "\" is not registered and cannot be presented");
        }
        return z2;
    }

    public final void notificationReady(CTInAppNotification inAppNotification) {
        CustomTemplate customTemplate;
        String templateName;
        if (inAppNotification.getError() != null) {
            this.logger.debug(this.defaultLogTag, "Unable to process inapp notification " + inAppNotification.getError());
            return;
        }
        CustomTemplateInAppData customTemplateData = inAppNotification.getCustomTemplateData();
        if (customTemplateData != null && (templateName = customTemplateData.getTemplateName()) != null) {
            customTemplate = this.templatesManager.getTemplate(templateName);
        } else {
            customTemplate = null;
        }
        this.logger.debug(this.defaultLogTag, "Notification ready: " + inAppNotification.getJsonDescription());
        if (customTemplate != null && !customTemplate.getIsVisual()) {
            presentTemplate(inAppNotification);
        } else {
            displayNotification(inAppNotification);
        }
    }

    public static final Unit onAppLaunchEventSent$lambda$0(InAppController this$0) {
        Intrinsics.echo(this$0, "this$0");
        Map<String, ? extends Object> mapFromJson = JsonUtil.mapFromJson(this$0.deviceInfo.getAppLaunchedFields());
        EvaluationManager evaluationManager = this$0.evaluationManager;
        Intrinsics.checkNotNull(mapFromJson);
        JSONArray evaluateOnAppLaunchedClientSide = evaluationManager.evaluateOnAppLaunchedClientSide(mapFromJson, this$0.coreMetaData.getLocationFromUser());
        if (evaluateOnAppLaunchedClientSide.length() > 0) {
            this$0.addInAppNotificationsToQueue(evaluateOnAppLaunchedClientSide);
        }
        return Unit.INSTANCE;
    }

    private final void prepareNotificationForDisplay(JSONObject jsonObject) {
        this.logger.debug(this.defaultLogTag, "Preparing In-App for display: " + jsonObject);
        this.inAppNotificationInflater.inflate(jsonObject, "InappController#prepareNotificationForDisplay", new InAppController$prepareNotificationForDisplay$1(this));
    }

    private final void presentTemplate(CTInAppNotification inAppNotification) {
        this.templatesManager.presentTemplate(inAppNotification, this, FileResourceProvider.INSTANCE.getInstance(this.context, this.logger));
    }

    public static final void promptPushPrimer$lambda$1(InAppController this$0, JSONObject jsonObject, Activity activity) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(jsonObject, "$jsonObject");
        Intrinsics.echo(activity, "activity");
        this$0.prepareNotificationForDisplay(jsonObject);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00b3. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void showInApp(CTInAppNotification inAppNotification) {
        int i4;
        CTInAppBaseFragment cTInAppBaseFragment;
        CTInAppBaseFragment cTInAppHtmlFooterFragment;
        Activity currentActivity = CoreMetaData.getCurrentActivity();
        if (!checkBeforeShowApprovalBeforeDisplay(inAppNotification)) {
            this.logger.verbose(this.defaultLogTag, "Application has decided to not show this in-app notification: " + inAppNotification.getCampaignId());
            showNotificationIfAvailable();
            return;
        }
        Logger.v(this.defaultLogTag, "Attempting to show next In-App");
        if (!CoreMetaData.isAppForeground()) {
            pendingNotifications.add(inAppNotification);
            Logger.v(this.defaultLogTag, "Not in foreground, queueing this In App");
            return;
        }
        if (currentlyDisplayingInApp != null) {
            pendingNotifications.add(inAppNotification);
            Logger.v(this.defaultLogTag, "In App already displaying, queueing this In App");
            return;
        }
        if (!canShowInAppOnActivity(currentActivity)) {
            pendingNotifications.add(inAppNotification);
            Logger.v(this.defaultLogTag, "Not showing In App on blacklisted activity, queuing this In App");
            return;
        }
        if (this.clock.currentTimeMillis() / 1000 > inAppNotification.getTimeToLive()) {
            Logger.d("InApp has elapsed its time to live, not showing the InApp");
            return;
        }
        if (Intrinsics.areEqual(Constants.KEY_CUSTOM_HTML, inAppNotification.getType()) && !NetworkManager.INSTANCE.isNetworkOnline(this.context)) {
            Logger.d(this.defaultLogTag, "Not showing HTML InApp due to no internet. An active internet connection is required to display the HTML InApp");
            showNotificationIfAvailable();
            return;
        }
        currentlyDisplayingInApp = inAppNotification;
        CTInAppType inAppType = inAppNotification.getInAppType();
        if (inAppType == null) {
            i4 = -1;
        } else {
            i4 = WhenMappings.$EnumSwitchMapping$1[inAppType.ordinal()];
        }
        switch (i4) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                try {
                    if (currentActivity != null) {
                        Logger.d("Displaying In-App: " + inAppNotification.getJsonDescription());
                        InAppNotificationActivity.launchForInAppNotification(currentActivity, inAppNotification, this.config);
                        cTInAppBaseFragment = null;
                        if (cTInAppBaseFragment != null) {
                            Logger.d("Displaying In-App: " + inAppNotification.getJsonDescription());
                            CTInAppBaseFragment.Companion companion = CTInAppBaseFragment.INSTANCE;
                            Intrinsics.checkNotNull(currentActivity);
                            CleverTapInstanceConfig cleverTapInstanceConfig = this.config;
                            String defaultLogTag = this.defaultLogTag;
                            Intrinsics.delta(defaultLogTag, "defaultLogTag");
                            if (!companion.showOnActivity(cTInAppBaseFragment, currentActivity, inAppNotification, cleverTapInstanceConfig, defaultLogTag)) {
                                currentlyDisplayingInApp = null;
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    throw new IllegalStateException("Current activity reference not found");
                } catch (Throwable th) {
                    Logger.v("Please verify the integration of your app. It is not setup to support in-app notifications yet.", th);
                    currentlyDisplayingInApp = null;
                    return;
                }
            case 11:
                cTInAppHtmlFooterFragment = new CTInAppHtmlFooterFragment();
                cTInAppBaseFragment = cTInAppHtmlFooterFragment;
                if (cTInAppBaseFragment != null) {
                }
                break;
            case 12:
                cTInAppHtmlFooterFragment = new CTInAppHtmlHeaderFragment();
                cTInAppBaseFragment = cTInAppHtmlFooterFragment;
                if (cTInAppBaseFragment != null) {
                }
                break;
            case 13:
                cTInAppHtmlFooterFragment = new CTInAppNativeFooterFragment();
                cTInAppBaseFragment = cTInAppHtmlFooterFragment;
                if (cTInAppBaseFragment != null) {
                }
                break;
            case 14:
                cTInAppHtmlFooterFragment = new CTInAppNativeHeaderFragment();
                cTInAppBaseFragment = cTInAppHtmlFooterFragment;
                if (cTInAppBaseFragment != null) {
                }
                break;
            case 15:
                presentTemplate(inAppNotification);
                return;
            default:
                Logger.d(this.defaultLogTag, "Unknown InApp Type found: " + inAppType);
                currentlyDisplayingInApp = null;
                return;
        }
    }

    public static final Unit showNotificationIfAvailable$lambda$3(InAppController this$0) {
        Intrinsics.echo(this$0, "this$0");
        this$0._showNotificationIfAvailable();
        return Unit.INSTANCE;
    }

    private final void triggerCustomTemplateAction(CTInAppNotification notification, CustomTemplateInAppData templateInAppData) {
        String str;
        if (templateInAppData != null) {
            str = templateInAppData.getTemplateName();
        } else {
            str = null;
        }
        if (str != null) {
            CustomTemplate template = this.templatesManager.getTemplate(str);
            if (template != null) {
                CustomTemplateInAppData copy$clevertap_core_release = templateInAppData.copy$clevertap_core_release();
                copy$clevertap_core_release.setAction$clevertap_core_release(true);
                CTInAppNotification createNotificationForAction$clevertap_core_release = notification.createNotificationForAction$clevertap_core_release(copy$clevertap_core_release);
                if (createNotificationForAction$clevertap_core_release == null) {
                    this.logger.debug("Failed to present custom template with name: ".concat(str));
                    return;
                } else if (template.getIsVisual()) {
                    addInAppNotificationInFrontOfQueue(createNotificationForAction$clevertap_core_release.getJsonDescription());
                    return;
                } else {
                    prepareNotificationForDisplay(createNotificationForAction$clevertap_core_release.getJsonDescription());
                    return;
                }
            }
            this.logger.debug("Cannot present non-registered template with name: ".concat(str));
            return;
        }
        this.logger.debug("Cannot present template without name.");
    }

    public final void addInAppNotificationsToQueue(@NotNull JSONArray inappNotifs) {
        Intrinsics.echo(inappNotifs, "inappNotifs");
        try {
            this.inAppQueue.enqueueAll(filterNonRegisteredCustomTemplates(inappNotifs));
            showNotificationIfAvailable();
        } catch (Exception e) {
            this.logger.debug(this.defaultLogTag, "InAppController: : InApp notification handling error.", e);
        }
    }

    public final void discardInApps() {
        this.inAppState = InAppState.DISCARDED;
        this.logger.verbose(this.defaultLogTag, "InAppState is DISCARDED");
    }

    @NotNull
    public final Function0<Unit> getOnAppLaunchEventSent() {
        return this.onAppLaunchEventSent;
    }

    @Override // com.clevertap.android.sdk.inapp.InAppListener
    @NotNull
    public Bundle inAppNotificationActionTriggered(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppAction r4, @NotNull String callToAction, @Nullable Bundle additionalData, @Nullable Context activityContext) {
        Bundle bundle;
        Intrinsics.echo(inAppNotification, "inAppNotification");
        Intrinsics.echo(r4, "action");
        Intrinsics.echo(callToAction, "callToAction");
        if (additionalData != null) {
            bundle = new Bundle(additionalData);
        } else {
            bundle = new Bundle();
        }
        bundle.putString(Constants.NOTIFICATION_ID_TAG, inAppNotification.getCampaignId());
        bundle.putString(Constants.KEY_C2A, callToAction);
        if (!inAppNotification.getIsLocalInApp()) {
            this.analyticsManager.pushInAppNotificationStateEvent(true, inAppNotification, bundle);
        }
        InAppActionType type = r4.getType();
        if (type == null) {
            this.logger.debug("Triggered in-app action without type");
            return bundle;
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[type.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 == 4) {
                        HashMap<String, String> keyValues = r4.getKeyValues();
                        if (keyValues != null && (!keyValues.isEmpty())) {
                            if (this.callbackManager.getInAppNotificationButtonListener() != null) {
                                this.callbackManager.getInAppNotificationButtonListener().onInAppButtonClick(keyValues);
                            }
                        }
                        return bundle;
                    }
                } else {
                    String actionUrl = r4.getActionUrl();
                    if (actionUrl != null) {
                        this.inAppActionHandler.openUrl(actionUrl, activityContext);
                        return bundle;
                    }
                    this.logger.debug("Cannot trigger open url action without url value");
                    return bundle;
                }
            } else if (CTInAppType.CTInAppTypeCustomCodeTemplate == inAppNotification.getInAppType()) {
                this.templatesManager.closeTemplate(inAppNotification);
            }
            return bundle;
        }
        triggerCustomTemplateAction(inAppNotification, r4.getCustomTemplateInAppData());
        return bundle;
    }

    @Override // com.clevertap.android.sdk.inapp.InAppListener
    @Nullable
    public Bundle inAppNotificationDidClick(@NotNull CTInAppNotification inAppNotification, @NotNull CTInAppNotificationButton button, @Nullable Context activityContext) {
        Intrinsics.echo(inAppNotification, "inAppNotification");
        Intrinsics.echo(button, "button");
        CTInAppAction cTInAppAction = button.action;
        if (cTInAppAction == null) {
            return null;
        }
        return inAppNotificationActionTriggered(inAppNotification, cTInAppAction, button.getText(), null, activityContext);
    }

    @Override // com.clevertap.android.sdk.inapp.InAppListener
    public void inAppNotificationDidDismiss(@NotNull CTInAppNotification inAppNotification, @Nullable Bundle formData) {
        HashMap<String, Object> hashMap;
        String str;
        Intrinsics.echo(inAppNotification, "inAppNotification");
        if (this.controllerManager.getInAppFCManager() != null) {
            CustomTemplateInAppData customTemplateData = inAppNotification.getCustomTemplateData();
            if (customTemplateData == null || (str = customTemplateData.getTemplateName()) == null) {
                str = "";
            }
            this.logger.verbose(this.defaultLogTag, "InApp Dismissed: " + inAppNotification.getCampaignId() + ' ' + str);
        } else {
            this.logger.verbose(this.defaultLogTag, "Not calling InApp Dismissed: " + inAppNotification.getCampaignId() + " because InAppFCManager is null");
        }
        try {
            InAppNotificationListener inAppNotificationListener = this.callbackManager.getInAppNotificationListener();
            if (inAppNotificationListener != null) {
                if (inAppNotification.getCustomExtras() != null) {
                    hashMap = Utils.convertJSONObjectToHashMap(inAppNotification.getCustomExtras());
                } else {
                    hashMap = new HashMap<>();
                }
                Logger.v("Calling the in-app listener on behalf of " + this.coreMetaData.getSource());
                if (formData != null) {
                    inAppNotificationListener.onDismissed(hashMap, Utils.convertBundleObjectToHashMap(formData));
                } else {
                    inAppNotificationListener.onDismissed(hashMap, null);
                }
            }
        } catch (Throwable th) {
            this.logger.verbose(this.defaultLogTag, "Failed to call the in-app notification listener", th);
        }
        this.executors.postAsyncSafelyTask(Constants.TAG_FEATURE_IN_APPS).execute("InappController#inAppNotificationDidDismiss", new a(this, inAppNotification, 0));
    }

    @Override // com.clevertap.android.sdk.inapp.InAppListener
    public void inAppNotificationDidShow(@NotNull CTInAppNotification inAppNotification, @Nullable Bundle formData) {
        Intrinsics.echo(inAppNotification, "inAppNotification");
        InAppFCManager inAppFCManager = this.controllerManager.getInAppFCManager();
        if (inAppFCManager != null) {
            inAppFCManager.didShow(this.context, inAppNotification);
        }
        this.analyticsManager.pushInAppNotificationStateEvent(false, inAppNotification, formData);
        try {
            InAppNotificationListener inAppNotificationListener = this.callbackManager.getInAppNotificationListener();
            if (inAppNotificationListener != null) {
                inAppNotificationListener.onShow(inAppNotification);
            }
        } catch (Throwable th) {
            Logger.v(this.defaultLogTag, "Failed to call the in-app notification listener", th);
        }
    }

    public final boolean isPushPermissionGranted() {
        return this.inAppActionHandler.arePushNotificationsEnabled();
    }

    public final void onAppLaunchServerSideInAppsResponse(@NotNull JSONArray appLaunchServerSideInApps, @Nullable Location userLocation) {
        Intrinsics.echo(appLaunchServerSideInApps, "appLaunchServerSideInApps");
        Map<String, ? extends Object> mapFromJson = JsonUtil.mapFromJson(this.deviceInfo.getAppLaunchedFields());
        List<JSONObject> jSONObjectList = Utils.toJSONObjectList(appLaunchServerSideInApps);
        EvaluationManager evaluationManager = this.evaluationManager;
        Intrinsics.checkNotNull(jSONObjectList);
        Intrinsics.checkNotNull(mapFromJson);
        JSONArray evaluateOnAppLaunchedServerSide = evaluationManager.evaluateOnAppLaunchedServerSide(jSONObjectList, mapFromJson, userLocation);
        if (evaluateOnAppLaunchedServerSide.length() > 0) {
            addInAppNotificationsToQueue(evaluateOnAppLaunchedServerSide);
        }
    }

    public final void onQueueChargedEvent(@NotNull Map<String, ? extends Object> chargeDetails, @NotNull List<? extends Map<String, ? extends Object>> items, @Nullable Location userLocation) {
        Intrinsics.echo(chargeDetails, "chargeDetails");
        Intrinsics.echo(items, "items");
        Map<String, ? extends Object> mapFromJson = JsonUtil.mapFromJson(this.deviceInfo.getAppLaunchedFields());
        mapFromJson.putAll(chargeDetails);
        EvaluationManager evaluationManager = this.evaluationManager;
        Intrinsics.checkNotNull(mapFromJson);
        JSONArray evaluateOnChargedEvent = evaluationManager.evaluateOnChargedEvent(mapFromJson, items, userLocation);
        if (evaluateOnChargedEvent.length() > 0) {
            addInAppNotificationsToQueue(evaluateOnChargedEvent);
        }
    }

    public final void onQueueEvent(@NotNull String eventName, @NotNull Map<String, ? extends Object> r32, @Nullable Location userLocation) {
        Intrinsics.echo(eventName, "eventName");
        Intrinsics.echo(r32, "eventProperties");
        Map<String, ? extends Object> mapFromJson = JsonUtil.mapFromJson(this.deviceInfo.getAppLaunchedFields());
        mapFromJson.putAll(r32);
        EvaluationManager evaluationManager = this.evaluationManager;
        Intrinsics.checkNotNull(mapFromJson);
        JSONArray evaluateOnEvent = evaluationManager.evaluateOnEvent(eventName, mapFromJson, userLocation);
        if (evaluateOnEvent.length() > 0) {
            addInAppNotificationsToQueue(evaluateOnEvent);
        }
    }

    public final void onQueueProfileEvent(@NotNull Map<String, ? extends Map<String, ? extends Object>> userAttributeChangedProperties, @Nullable Location location) {
        Intrinsics.echo(userAttributeChangedProperties, "userAttributeChangedProperties");
        Map<String, ? extends Object> mapFromJson = JsonUtil.mapFromJson(this.deviceInfo.getAppLaunchedFields());
        EvaluationManager evaluationManager = this.evaluationManager;
        Intrinsics.checkNotNull(mapFromJson);
        JSONArray evaluateOnUserAttributeChange = evaluationManager.evaluateOnUserAttributeChange(userAttributeChangedProperties, location, mapFromJson);
        if (evaluateOnUserAttributeChange.length() > 0) {
            addInAppNotificationsToQueue(evaluateOnUserAttributeChange);
        }
    }

    public final void promptPermission(boolean showFallbackSettings) {
        this.inAppActionHandler.launchPushPermissionPrompt(showFallbackSettings);
    }

    public final void promptPushPrimer(@NotNull JSONObject jsonObject) {
        Intrinsics.echo(jsonObject, "jsonObject");
        jsonObject.put(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION, true);
        boolean optBoolean = jsonObject.optBoolean(CTLocalInApp.FALLBACK_TO_NOTIFICATION_SETTINGS, false);
        this.inAppActionHandler.launchPushPermissionPrompt(optBoolean, optBoolean, new ao(26, this, jsonObject));
    }

    public final void resumeInApps() {
        this.inAppState = InAppState.RESUMED;
        this.logger.verbose(this.defaultLogTag, "InAppState is RESUMED");
        this.logger.verbose(this.defaultLogTag, "Resuming InApps by calling showInAppNotificationIfAny()");
        showNotificationIfAvailable();
    }

    public final void showNotificationIfAvailable() {
        if (!this.config.isAnalyticsOnly()) {
            this.executors.postAsyncSafelyTask(Constants.TAG_FEATURE_IN_APPS).execute("InappController#showNotificationIfAvailable", new g(5, this));
        }
    }

    public final void suspendInApps() {
        this.inAppState = InAppState.SUSPENDED;
        this.logger.verbose(this.defaultLogTag, "InAppState is SUSPENDED");
    }
}
