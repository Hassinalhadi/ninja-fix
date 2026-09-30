package com.clevertap.android.sdk.network;

import Ac.l;
import E8.g;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.BaseCallbackManager;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.ControllerManager;
import com.clevertap.android.sdk.CoreMetaData;
import com.clevertap.android.sdk.DeviceInfo;
import com.clevertap.android.sdk.ILogger;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.Utils;
import com.clevertap.android.sdk.db.BaseDatabaseManager;
import com.clevertap.android.sdk.db.QueueData;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplate;
import com.clevertap.android.sdk.inapp.evaluation.EventType;
import com.clevertap.android.sdk.interfaces.NotificationRenderedListener;
import com.clevertap.android.sdk.network.api.CtApi;
import com.clevertap.android.sdk.network.api.CtApiWrapper;
import com.clevertap.android.sdk.network.api.DefineTemplatesRequestBody;
import com.clevertap.android.sdk.network.api.EncryptedSendQueueRequestBody;
import com.clevertap.android.sdk.network.api.EncryptionFailure;
import com.clevertap.android.sdk.network.api.EncryptionResult;
import com.clevertap.android.sdk.network.api.EncryptionSuccess;
import com.clevertap.android.sdk.network.api.SendQueueRequestBody;
import com.clevertap.android.sdk.network.http.Response;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.clevertap.android.sdk.pushnotification.PushNotificationUtil;
import com.clevertap.android.sdk.response.ARPResponse;
import com.clevertap.android.sdk.response.ClevertapResponseHandler;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s6.AbstractC2716m6;

@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u001e\b\u0000\u0018\u0000 o2\u00020\u0001:\u0001oBy\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020&J\u000e\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020&J(\u0010+\u001a\u00020(2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201J\u0006\u00102\u001a\u00020!J\u0018\u00103\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\u0006\u00104\u001a\u000205H\u0007J\u0010\u00106\u001a\u0002012\u0006\u0010,\u001a\u00020-H\u0007J\u0012\u0010:\u001a\u0004\u0018\u00010/2\u0006\u0010,\u001a\u00020-H\u0007J\u0010\u0010;\u001a\u0002012\u0006\u0010<\u001a\u00020/H\u0002J\u0014\u0010=\u001a\u0004\u0018\u00010>2\b\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u0018\u0010?\u001a\u00020(2\u0006\u0010,\u001a\u00020-2\u0006\u00104\u001a\u000205H\u0007J\u0010\u0010@\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0003J\u0010\u0010C\u001a\u0002012\u0006\u0010A\u001a\u00020BH\u0002J4\u0010D\u001a\u0002012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010,\u001a\u00020-2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010.\u001a\u0004\u0018\u00010/2\b\b\u0002\u00100\u001a\u000201J.\u0010G\u001a\u0002012\u0006\u0010,\u001a\u00020-2\u0006\u0010H\u001a\u00020I2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020(0K2\u0006\u00100\u001a\u000201H\u0002J\u0018\u0010L\u001a\u00020(2\u0006\u0010H\u001a\u00020I2\u0006\u0010M\u001a\u00020NH\u0002J\u0016\u0010O\u001a\u0002012\f\u0010P\u001a\b\u0012\u0004\u0012\u00020R0QH\u0007J\"\u0010S\u001a\u00020(2\b\u0010T\u001a\u0004\u0018\u00010>2\u0006\u0010M\u001a\u00020N2\u0006\u0010U\u001a\u000201H\u0002J\u0018\u0010V\u001a\u00020B2\u0006\u0010,\u001a\u00020-2\u0006\u0010W\u001a\u00020IH\u0003J\u0010\u0010X\u001a\u00020B2\u0006\u0010W\u001a\u00020IH\u0002J\u0010\u0010Y\u001a\u00020B2\u0006\u0010W\u001a\u00020IH\u0002J\u0010\u0010Z\u001a\u0002012\u0006\u0010A\u001a\u00020BH\u0002J\u0018\u0010[\u001a\u00020(2\u0006\u0010A\u001a\u00020B2\u0006\u0010\\\u001a\u00020/H\u0002J\u0010\u0010]\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010^\u001a\u0002012\u0006\u0010A\u001a\u00020BH\u0003J.\u0010_\u001a\u0002012\u0006\u0010A\u001a\u00020B2\u0006\u0010`\u001a\u0002012\f\u0010J\u001a\b\u0012\u0004\u0012\u00020(0K2\u0006\u00100\u001a\u000201H\u0003J\u000e\u0010a\u001a\u0002012\u0006\u0010A\u001a\u00020BJ\u0010\u0010b\u001a\u00020(2\u0006\u0010A\u001a\u00020BH\u0002J\u0010\u0010c\u001a\u0002012\u0006\u0010W\u001a\u00020IH\u0002J\u0010\u0010d\u001a\u00020(2\u0006\u0010E\u001a\u00020FH\u0002J\u0010\u0010e\u001a\u00020(2\u0006\u0010f\u001a\u00020/H\u0002J\u0012\u0010g\u001a\u00020(2\b\u0010h\u001a\u0004\u0018\u00010/H\u0003J\u0010\u0010i\u001a\u00020(2\u0006\u0010j\u001a\u00020!H\u0002J\u0010\u0010k\u001a\u00020(2\u0006\u0010l\u001a\u00020/H\u0003J\u0010\u0010m\u001a\u00020(2\u0006\u0010n\u001a\u000201H\u0003R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u00107\u001a\u00020!8G¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006p"}, d2 = {"Lcom/clevertap/android/sdk/network/NetworkManager;", "", "context", "Landroid/content/Context;", Constants.KEY_CONFIG, "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "deviceInfo", "Lcom/clevertap/android/sdk/DeviceInfo;", "coreMetaData", "Lcom/clevertap/android/sdk/CoreMetaData;", "controllerManager", "Lcom/clevertap/android/sdk/ControllerManager;", "databaseManager", "Lcom/clevertap/android/sdk/db/BaseDatabaseManager;", "callbackManager", "Lcom/clevertap/android/sdk/BaseCallbackManager;", "ctApiWrapper", "Lcom/clevertap/android/sdk/network/api/CtApiWrapper;", "encryptionManager", "Lcom/clevertap/android/sdk/network/NetworkEncryptionManager;", "arpResponse", "Lcom/clevertap/android/sdk/response/ARPResponse;", "networkRepo", "Lcom/clevertap/android/sdk/network/NetworkRepo;", "queueHeaderBuilder", "Lcom/clevertap/android/sdk/network/QueueHeaderBuilder;", "cleverTapResponseHandler", "Lcom/clevertap/android/sdk/response/ClevertapResponseHandler;", "logger", "Lcom/clevertap/android/sdk/ILogger;", "<init>", "(Landroid/content/Context;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;Lcom/clevertap/android/sdk/DeviceInfo;Lcom/clevertap/android/sdk/CoreMetaData;Lcom/clevertap/android/sdk/ControllerManager;Lcom/clevertap/android/sdk/db/BaseDatabaseManager;Lcom/clevertap/android/sdk/BaseCallbackManager;Lcom/clevertap/android/sdk/network/api/CtApiWrapper;Lcom/clevertap/android/sdk/network/NetworkEncryptionManager;Lcom/clevertap/android/sdk/response/ARPResponse;Lcom/clevertap/android/sdk/network/NetworkRepo;Lcom/clevertap/android/sdk/network/QueueHeaderBuilder;Lcom/clevertap/android/sdk/response/ClevertapResponseHandler;Lcom/clevertap/android/sdk/ILogger;)V", "responseFailureCount", "", "networkRetryCount", "minDelayFrequency", "mNetworkHeadersListeners", "", "Lcom/clevertap/android/sdk/network/NetworkHeadersListener;", "addNetworkHeadersListener", "", "listener", "removeNetworkHeadersListener", "flushDBQueue", "eventGroup", "Lcom/clevertap/android/sdk/events/EventGroup;", "caller", "", "isUserSwitchFlush", "", "getDelayFrequency", "initHandshake", "handshakeSuccessCallback", "Ljava/lang/Runnable;", "needsHandshakeForDomain", "currentRequestTimestamp", "getCurrentRequestTimestamp", "()I", "getDomain", "hasDomainChanged", "newDomain", "getQueueHeader", "Lorg/json/JSONObject;", "performHandshakeForDomain", "saveDomainChanges", "response", "Lcom/clevertap/android/sdk/network/http/Response;", "shouldMuteSdk", "sendQueue", "queue", "Lorg/json/JSONArray;", "networkCall", "requestBody", "Lcom/clevertap/android/sdk/network/api/SendQueueRequestBody;", "notifyNetworkHeaderListeners", "Lkotlin/Function0;", "notifyHeaderListeners", "endpointId", "Lcom/clevertap/android/sdk/network/EndpointId;", "defineTemplates", "templates", "", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplate;", "applyQueueHeaderListeners", "queueHeader", "isProfile", "callApiForEventGroup", "body", "sendQueueApi", "sendImpressionsApi", "handleVariablesResponse", "handleVarsOrTemplatesResponseError", "logTag", "handleTemplateResponseSuccess", "handlePushImpressionsResponse", "handleSendQueueResponse", "isFullResponse", "abortDueToDomainChange", "handleSendQueueResponseError", "doesBodyContainAppLaunchedOrFetchEvents", "notifyListenersForPushImpressionSentToServer", "notifyListenerForPushImpressionSentToServer", "listenerKey", "setDomain", "domainName", "setFirstRequestTimestampIfNeeded", CTProductConfigConstants.KEY_LAST_FETCHED_TIMESTAMP, "setSpikyDomain", "spikyDomainName", "setMuted", "mute", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NetworkManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final ARPResponse arpResponse;

    @NotNull
    private final BaseCallbackManager callbackManager;

    @NotNull
    private final ClevertapResponseHandler cleverTapResponseHandler;

    @NotNull
    private final CleverTapInstanceConfig config;

    @NotNull
    private final Context context;

    @NotNull
    private final ControllerManager controllerManager;

    @NotNull
    private final CoreMetaData coreMetaData;

    @NotNull
    private final CtApiWrapper ctApiWrapper;

    @NotNull
    private final BaseDatabaseManager databaseManager;

    @NotNull
    private final DeviceInfo deviceInfo;

    @NotNull
    private final NetworkEncryptionManager encryptionManager;

    @NotNull
    private final ILogger logger;

    @NotNull
    private final List<NetworkHeadersListener> mNetworkHeadersListeners;
    private int minDelayFrequency;

    @NotNull
    private final NetworkRepo networkRepo;
    private int networkRetryCount;

    @NotNull
    private final QueueHeaderBuilder queueHeaderBuilder;
    private int responseFailureCount;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lcom/clevertap/android/sdk/network/NetworkManager$Companion;", "", "<init>", "()V", "isNetworkOnline", "", "context", "Landroid/content/Context;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isNetworkOnline(@NotNull Context context) {
            ConnectivityManager connectivityManager;
            Intrinsics.echo(context, "context");
            try {
                Object systemService = context.getSystemService("connectivity");
                if (systemService instanceof ConnectivityManager) {
                    connectivityManager = (ConnectivityManager) systemService;
                } else {
                    connectivityManager = null;
                }
                if (connectivityManager == null) {
                    return true;
                }
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null) {
                    if (activeNetworkInfo.isConnected()) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception unused) {
                return true;
            }
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[EventGroup.values().length];
            try {
                iArr[EventGroup.VARIABLES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EventGroup.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EventGroup.PUSH_NOTIFICATION_VIEWED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public NetworkManager(@NotNull Context context, @NotNull CleverTapInstanceConfig config, @NotNull DeviceInfo deviceInfo, @NotNull CoreMetaData coreMetaData, @NotNull ControllerManager controllerManager, @NotNull BaseDatabaseManager databaseManager, @NotNull BaseCallbackManager callbackManager, @NotNull CtApiWrapper ctApiWrapper, @NotNull NetworkEncryptionManager encryptionManager, @NotNull ARPResponse arpResponse, @NotNull NetworkRepo networkRepo, @NotNull QueueHeaderBuilder queueHeaderBuilder, @NotNull ClevertapResponseHandler cleverTapResponseHandler, @NotNull ILogger logger) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(config, "config");
        Intrinsics.echo(deviceInfo, "deviceInfo");
        Intrinsics.echo(coreMetaData, "coreMetaData");
        Intrinsics.echo(controllerManager, "controllerManager");
        Intrinsics.echo(databaseManager, "databaseManager");
        Intrinsics.echo(callbackManager, "callbackManager");
        Intrinsics.echo(ctApiWrapper, "ctApiWrapper");
        Intrinsics.echo(encryptionManager, "encryptionManager");
        Intrinsics.echo(arpResponse, "arpResponse");
        Intrinsics.echo(networkRepo, "networkRepo");
        Intrinsics.echo(queueHeaderBuilder, "queueHeaderBuilder");
        Intrinsics.echo(cleverTapResponseHandler, "cleverTapResponseHandler");
        Intrinsics.echo(logger, "logger");
        this.context = context;
        this.config = config;
        this.deviceInfo = deviceInfo;
        this.coreMetaData = coreMetaData;
        this.controllerManager = controllerManager;
        this.databaseManager = databaseManager;
        this.callbackManager = callbackManager;
        this.ctApiWrapper = ctApiWrapper;
        this.encryptionManager = encryptionManager;
        this.arpResponse = arpResponse;
        this.networkRepo = networkRepo;
        this.queueHeaderBuilder = queueHeaderBuilder;
        this.cleverTapResponseHandler = cleverTapResponseHandler;
        this.logger = logger;
        this.mNetworkHeadersListeners = new ArrayList();
    }

    public static /* synthetic */ Unit alpha(NetworkManager networkManager, SendQueueRequestBody sendQueueRequestBody, EndpointId endpointId) {
        return sendQueue$lambda$3(networkManager, sendQueueRequestBody, endpointId);
    }

    private final void applyQueueHeaderListeners(JSONObject queueHeader, EndpointId endpointId, boolean isProfile) {
        if (queueHeader != null) {
            Iterator<NetworkHeadersListener> it = this.mNetworkHeadersListeners.iterator();
            while (it.hasNext()) {
                JSONObject onAttachHeaders = it.next().onAttachHeaders(endpointId, EventType.INSTANCE.fromBoolean(isProfile));
                if (onAttachHeaders != null) {
                    CTXtensions.copyFrom(queueHeader, onAttachHeaders);
                }
            }
        }
    }

    public static /* synthetic */ Unit bravo(NetworkManager networkManager) {
        return setMuted$lambda$8(networkManager);
    }

    private final Response callApiForEventGroup(EventGroup eventGroup, SendQueueRequestBody body) {
        int i4 = WhenMappings.$EnumSwitchMapping$0[eventGroup.ordinal()];
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 == 3) {
                    return sendImpressionsApi(body);
                }
                throw new NoWhenBranchMatchedException();
            }
            return sendQueueApi(body);
        }
        return this.ctApiWrapper.getCtApi().defineVars(body);
    }

    private final boolean doesBodyContainAppLaunchedOrFetchEvents(SendQueueRequestBody body) {
        int length = body.getQueue().length();
        for (int i4 = 0; i4 < length; i4++) {
            try {
                JSONObject jSONObject = body.getQueue().getJSONObject(i4);
                if (Intrinsics.areEqual(com.clevertap.android.sdk.leanplum.Constants.CHARGED_EVENT_PARAM, jSONObject.getString(Constants.KEY_TYPE))) {
                    String string = jSONObject.getString(Constants.KEY_EVT_NAME);
                    if (Intrinsics.areEqual(Constants.APP_LAUNCHED_EVENT, string) || Intrinsics.areEqual(Constants.WZRK_FETCH, string)) {
                        return true;
                    }
                } else {
                    continue;
                }
            } catch (JSONException unused) {
            }
        }
        return false;
    }

    private final JSONObject getQueueHeader(String caller) {
        return this.queueHeaderBuilder.buildHeader(caller);
    }

    private final boolean handlePushImpressionsResponse(Response response) {
        if (!response.isSuccess()) {
            this.logger.info("Received error response code: " + response.getCode());
            return false;
        }
        if (abortDueToDomainChange(response) || shouldMuteSdk(response)) {
            return false;
        }
        saveDomainChanges(response);
        this.logger.debug(this.config.getAccountId(), "Push Impressions sent successfully");
        this.networkRepo.setLastRequestTs(getCurrentRequestTimestamp());
        setFirstRequestTimestampIfNeeded(getCurrentRequestTimestamp());
        this.logger.verbose(this.config.getAccountId(), "Processing response : " + CTXtensions.toJsonOrNull(response.readBody()));
        return true;
    }

    private final boolean handleSendQueueResponse(Response response, boolean isFullResponse, Function0<Unit> notifyNetworkHeaderListeners, boolean isUserSwitchFlush) {
        if (!response.isSuccess()) {
            handleSendQueueResponseError(response);
            return false;
        }
        if (abortDueToDomainChange(response) || shouldMuteSdk(response)) {
            return false;
        }
        saveDomainChanges(response);
        notifyNetworkHeaderListeners.invoke();
        this.logger.debug(this.config.getAccountId(), "Queue sent successfully");
        this.networkRepo.setLastRequestTs(getCurrentRequestTimestamp());
        setFirstRequestTimestampIfNeeded(getCurrentRequestTimestamp());
        String readBody = response.readBody();
        JSONObject jsonOrNull = CTXtensions.toJsonOrNull(readBody);
        this.logger.verbose(this.config.getAccountId(), "Processing response : " + jsonOrNull);
        if (readBody != null && !StringsKt.gray(readBody) && jsonOrNull != null) {
            if (Boolean.parseBoolean(response.getHeaderValue(CtApi.HEADER_ENCRYPTION_ENABLED))) {
                EncryptionResult decryptResponse = this.encryptionManager.decryptResponse(readBody);
                if (decryptResponse instanceof EncryptionFailure) {
                    this.logger.verbose(this.config.getAccountId(), "Failed to decrypt response");
                    return false;
                }
                if (decryptResponse instanceof EncryptionSuccess) {
                    readBody = ((EncryptionSuccess) decryptResponse).getData();
                    jsonOrNull = CTXtensions.toJsonOrNull(readBody);
                    this.logger.verbose("Decrypted response = " + readBody);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            this.cleverTapResponseHandler.handleResponse(isFullResponse, jsonOrNull, readBody, isUserSwitchFlush);
        }
        return true;
    }

    private final void handleSendQueueResponseError(Response response) {
        this.logger.info("Received error response code: " + response.getCode());
        int code = response.getCode();
        if (code != 402) {
            if (code != 419) {
                return;
            }
            this.logger.verbose("There is decryption failure on backend, disabling encrypted requests.");
            this.coreMetaData.setRelaxNetwork(true);
            return;
        }
        this.logger.verbose("Encryption in transit feature on not enabled for your account, please contact Clevertap support.");
        this.coreMetaData.setRelaxNetwork(true);
    }

    private final void handleTemplateResponseSuccess(Response response) {
        this.logger.info(this.config.getAccountId(), "Custom templates defined successfully.");
        JSONObject jsonOrNull = CTXtensions.toJsonOrNull(response.readBody());
        if (jsonOrNull != null) {
            String optString = jsonOrNull.optString(RedirectCustomTabEventLogger.RESULT_ERROR);
            if (!TextUtils.isEmpty(optString)) {
                this.logger.info(this.config.getAccountId(), "Custom templates warnings: " + optString);
            }
        }
    }

    private final boolean handleVariablesResponse(Response response) {
        if (response.isSuccess()) {
            String readBody = response.readBody();
            JSONObject jsonOrNull = CTXtensions.toJsonOrNull(readBody);
            this.logger.verbose(this.config.getAccountId(), "Processing variables response : " + jsonOrNull);
            this.arpResponse.processResponse(jsonOrNull, readBody, this.context);
            return true;
        }
        handleVarsOrTemplatesResponseError(response, "Variables");
        return false;
    }

    private final void handleVarsOrTemplatesResponseError(Response response, String logTag) {
        int code = response.getCode();
        if (code != 400) {
            if (code != 401) {
                this.logger.info(logTag, "Response code " + response.getCode() + " while syncing.");
                return;
            }
            this.logger.info(logTag, "Unauthorized access from a non-test profile. Please mark this profile as a test profile from the CleverTap dashboard.");
            return;
        }
        JSONObject jsonOrNull = CTXtensions.toJsonOrNull(response.readBody());
        if (jsonOrNull != null && !TextUtils.isEmpty(jsonOrNull.optString(RedirectCustomTabEventLogger.RESULT_ERROR))) {
            String optString = jsonOrNull.optString(RedirectCustomTabEventLogger.RESULT_ERROR);
            this.logger.info(logTag, "Error while syncing: " + optString);
            return;
        }
        this.logger.info(logTag, "Error while syncing.");
    }

    private final boolean hasDomainChanged(String newDomain) {
        return !Intrinsics.areEqual(newDomain, this.networkRepo.getDomain());
    }

    public static final boolean isNetworkOnline(@NotNull Context context) {
        return INSTANCE.isNetworkOnline(context);
    }

    private final boolean networkCall(EventGroup eventGroup, SendQueueRequestBody requestBody, Function0<Unit> notifyNetworkHeaderListeners, boolean isUserSwitchFlush) {
        boolean handleVariablesResponse;
        Response callApiForEventGroup = callApiForEventGroup(eventGroup, requestBody);
        int i4 = 0;
        try {
            this.networkRetryCount = 0;
            int i5 = WhenMappings.$EnumSwitchMapping$0[eventGroup.ordinal()];
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        handleVariablesResponse = handlePushImpressionsResponse(callApiForEventGroup);
                        if (!handleVariablesResponse) {
                            i4 = this.responseFailureCount + 1;
                        }
                        this.responseFailureCount = i4;
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    handleVariablesResponse = handleSendQueueResponse(callApiForEventGroup, doesBodyContainAppLaunchedOrFetchEvents(requestBody), notifyNetworkHeaderListeners, isUserSwitchFlush);
                    if (!handleVariablesResponse) {
                        i4 = this.responseFailureCount + 1;
                    }
                    this.responseFailureCount = i4;
                }
            } else {
                handleVariablesResponse = handleVariablesResponse(callApiForEventGroup);
            }
            AbstractC2716m6.alpha(callApiForEventGroup, null);
            return handleVariablesResponse;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC2716m6.alpha(callApiForEventGroup, th);
                throw th2;
            }
        }
    }

    private final void notifyHeaderListeners(SendQueueRequestBody requestBody, EndpointId endpointId) {
        if (requestBody.getQueueHeader() != null) {
            Iterator<NetworkHeadersListener> it = this.mNetworkHeadersListeners.iterator();
            while (it.hasNext()) {
                it.next().onSentHeaders(requestBody.getQueueHeader(), endpointId, EventType.INSTANCE.fromBoolean(requestBody.getQueue().optJSONObject(0).has(Constants.PROFILE)));
            }
        }
    }

    private final void notifyListenerForPushImpressionSentToServer(String listenerKey) {
        NotificationRenderedListener notificationRenderedListener = CleverTapAPI.getNotificationRenderedListener(listenerKey);
        if (notificationRenderedListener != null) {
            this.logger.verbose(this.config.getAccountId(), "notifying listener " + listenerKey + ", that push impression sent successfully");
            notificationRenderedListener.onNotificationRendered(true);
        }
    }

    private final void notifyListenersForPushImpressionSentToServer(JSONArray queue) throws JSONException {
        int length = queue.length();
        for (int i4 = 0; i4 < length; i4++) {
            try {
                JSONObject optJSONObject = queue.getJSONObject(i4).optJSONObject(Constants.KEY_EVT_DATA);
                if (optJSONObject != null) {
                    String buildPushNotificationRenderedListenerKey = PushNotificationUtil.buildPushNotificationRenderedListenerKey(optJSONObject.optString(Constants.WZRK_ACCT_ID_KEY), optJSONObject.optString(Constants.WZRK_PUSH_ID));
                    Intrinsics.delta(buildPushNotificationRenderedListenerKey, "buildPushNotificationRenderedListenerKey(...)");
                    notifyListenerForPushImpressionSentToServer(buildPushNotificationRenderedListenerKey);
                }
            } catch (JSONException unused) {
                this.logger.verbose(this.config.getAccountId(), "Encountered an exception while parsing the push notification viewed event queue");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.logger.verbose(this.config.getAccountId(), "push notification viewed event sent successfully");
    }

    private final void saveDomainChanges(Response response) {
        String headerValue = response.getHeaderValue(CtApi.HEADER_DOMAIN_NAME);
        Logger.v("Getting domain from header - " + headerValue);
        if (headerValue != null && !StringsKt.gray(headerValue)) {
            String headerValue2 = response.getHeaderValue(CtApi.SPIKY_HEADER_DOMAIN_NAME);
            Logger.v("Getting spiky domain from header - " + headerValue2);
            setMuted(false);
            setDomain(headerValue);
            Logger.v("Setting spiky domain from header as -" + headerValue2);
            if (headerValue2 == null) {
                setSpikyDomain(headerValue);
            } else {
                setSpikyDomain(headerValue2);
            }
        }
    }

    private final Response sendImpressionsApi(SendQueueRequestBody body) {
        return this.ctApiWrapper.getCtApi().sendImpressions(body.toString());
    }

    public static /* synthetic */ boolean sendQueue$default(NetworkManager networkManager, Context context, EventGroup eventGroup, JSONArray jSONArray, String str, boolean z2, int i4, Object obj) {
        if ((i4 & 16) != 0) {
            z2 = false;
        }
        return networkManager.sendQueue(context, eventGroup, jSONArray, str, z2);
    }

    public static final Unit sendQueue$lambda$3(NetworkManager this$0, SendQueueRequestBody requestBody, EndpointId endpointId) {
        Intrinsics.echo(this$0, "this$0");
        Intrinsics.echo(requestBody, "$requestBody");
        Intrinsics.echo(endpointId, "$endpointId");
        this$0.notifyHeaderListeners(requestBody, endpointId);
        return Unit.INSTANCE;
    }

    private final Response sendQueueApi(SendQueueRequestBody body) {
        if (this.config.isEncryptionInTransitEnabled() && !this.coreMetaData.isRelaxNetwork()) {
            EncryptionResult encryptResponse = this.encryptionManager.encryptResponse(body.toString());
            String sessionEncryptionKey = this.encryptionManager.sessionEncryptionKey();
            if (encryptResponse instanceof EncryptionSuccess) {
                EncryptionSuccess encryptionSuccess = (EncryptionSuccess) encryptResponse;
                String data = encryptionSuccess.getData();
                Intrinsics.checkNotNull(sessionEncryptionKey);
                String jsonString = new EncryptedSendQueueRequestBody(data, sessionEncryptionKey, encryptionSuccess.getIv()).toJsonString();
                this.logger.verbose("Encrypted Request = " + jsonString);
                return this.ctApiWrapper.getCtApi().sendQueue(jsonString, true);
            }
            this.logger.verbose("Normal Request cause encryption failed = " + body);
        }
        return CtApi.sendQueue$default(this.ctApiWrapper.getCtApi(), body.toString(), false, 2, null);
    }

    private final void setDomain(String domainName) {
        this.logger.verbose(this.config.getAccountId(), "Setting domain to " + domainName);
        this.networkRepo.setDomain(domainName);
        this.ctApiWrapper.getCtApi().setCachedDomain(domainName);
        if (this.callbackManager.getSCDomainListener() != null) {
            if (domainName != null) {
                this.callbackManager.getSCDomainListener().onSCDomainAvailable(Utils.getSCDomain(domainName));
            } else {
                this.callbackManager.getSCDomainListener().onSCDomainUnavailable();
            }
        }
    }

    private final void setFirstRequestTimestampIfNeeded(int r22) {
        if (this.networkRepo.getFirstRequestTs() > 0) {
            return;
        }
        this.networkRepo.setFirstRequestTs(r22);
    }

    private final void setMuted(boolean mute) {
        if (mute) {
            this.networkRepo.setMuted(true);
            this.networkRepo.setDomain(null);
            CTExecutorFactory.executors(this.config).postAsyncSafelyTask().execute("CommsManager#setMuted", new g(6, this));
            return;
        }
        this.networkRepo.setMuted(false);
    }

    public static final Unit setMuted$lambda$8(NetworkManager this$0) {
        Intrinsics.echo(this$0, "this$0");
        this$0.databaseManager.clearQueues(this$0.context);
        return Unit.INSTANCE;
    }

    private final void setSpikyDomain(String spikyDomainName) {
        this.logger.verbose(this.config.getAccountId(), "Setting spiky domain to " + spikyDomainName);
        this.networkRepo.setSpikyDomain(spikyDomainName);
        this.ctApiWrapper.getCtApi().setCachedSpikyDomain(spikyDomainName);
    }

    private final boolean shouldMuteSdk(Response response) {
        String obj;
        String headerValue = response.getHeaderValue(CtApi.HEADER_MUTE);
        if (headerValue != null && (obj = StringsKt.b(headerValue).toString()) != null) {
            if (obj.length() <= 0) {
                obj = null;
            }
            if (obj != null) {
                if (Intrinsics.areEqual(obj, "true")) {
                    setMuted(true);
                    return true;
                }
                setMuted(false);
            }
        }
        return false;
    }

    public final boolean abortDueToDomainChange(@NotNull Response response) {
        Intrinsics.echo(response, "response");
        String headerValue = response.getHeaderValue(CtApi.HEADER_DOMAIN_NAME);
        if (CTXtensions.isNotNullAndBlank(headerValue) && hasDomainChanged(headerValue)) {
            setDomain(headerValue);
            this.logger.debug(this.config.getAccountId(), "The domain has changed to " + headerValue + ". The request will be retried shortly.");
            return true;
        }
        return false;
    }

    public final void addNetworkHeadersListener(@NotNull NetworkHeadersListener listener) {
        Intrinsics.echo(listener, "listener");
        this.mNetworkHeadersListeners.add(listener);
    }

    public final boolean defineTemplates(@NotNull Collection<CustomTemplate> templates) {
        Intrinsics.echo(templates, "templates");
        JSONObject queueHeader = getQueueHeader(null);
        if (queueHeader == null) {
            return false;
        }
        DefineTemplatesRequestBody defineTemplatesRequestBody = new DefineTemplatesRequestBody(queueHeader, templates);
        this.logger.debug(this.config.getAccountId(), "Will define templates: " + defineTemplatesRequestBody);
        try {
            Response defineTemplates = this.ctApiWrapper.getCtApi().defineTemplates(defineTemplatesRequestBody);
            try {
                if (defineTemplates.isSuccess()) {
                    handleTemplateResponseSuccess(defineTemplates);
                    AbstractC2716m6.alpha(defineTemplates, null);
                    return true;
                }
                handleVarsOrTemplatesResponseError(defineTemplates, "CustomTemplates");
                AbstractC2716m6.alpha(defineTemplates, null);
                return false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC2716m6.alpha(defineTemplates, th);
                    throw th2;
                }
            }
        } catch (Exception e) {
            this.logger.debug(this.config.getAccountId(), "An exception occurred while defining templates.", e);
            return false;
        }
    }

    public final void flushDBQueue(@NotNull Context context, @NotNull EventGroup eventGroup, @Nullable String caller, boolean isUserSwitchFlush) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(eventGroup, "eventGroup");
        this.config.getLogger().verbose(this.config.getAccountId(), "Somebody has invoked me to send the queue to CleverTap servers");
        JSONArray jSONArray = null;
        QueueData queueData = null;
        boolean z2 = true;
        while (z2) {
            QueueData queuedEvents = this.databaseManager.getQueuedEvents(context, 50, queueData, eventGroup);
            if (queuedEvents.isEmpty()) {
                this.config.getLogger().verbose(this.config.getAccountId(), "No events in the queue, failing");
                if (eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED) {
                    if (queueData != null) {
                        jSONArray = queueData.getData();
                    }
                    if (jSONArray != null) {
                        try {
                            JSONArray data = queueData.getData();
                            Intrinsics.checkNotNull(data);
                            notifyListenersForPushImpressionSentToServer(data);
                            return;
                        } catch (Exception unused) {
                            this.config.getLogger().verbose(this.config.getAccountId(), "met with exception while notifying listeners for PushImpressionSentToServer event");
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            JSONArray data2 = queuedEvents.getData();
            if (data2 != null && data2.length() > 0) {
                boolean sendQueue = sendQueue(context, eventGroup, data2, caller, isUserSwitchFlush);
                if (!sendQueue) {
                    this.controllerManager.invokeCallbacksForNetworkError();
                    this.controllerManager.invokeBatchListener(data2, false);
                } else {
                    this.controllerManager.invokeBatchListener(data2, true);
                }
                queueData = queuedEvents;
                z2 = sendQueue;
            } else {
                this.config.getLogger().verbose(this.config.getAccountId(), "No events in the queue, failing");
                return;
            }
        }
    }

    public final int getCurrentRequestTimestamp() {
        return this.ctApiWrapper.getCtApi().getCurrentRequestTimestampSeconds();
    }

    public final int getDelayFrequency() {
        this.minDelayFrequency = this.networkRepo.getMinDelayFrequency(this.minDelayFrequency, this.networkRetryCount);
        this.logger.debug(this.config.getAccountId(), "Setting delay frequency to " + this.minDelayFrequency);
        return this.minDelayFrequency;
    }

    @Nullable
    public final String getDomain(@NotNull EventGroup eventGroup) {
        boolean z2;
        Intrinsics.echo(eventGroup, "eventGroup");
        CtApi ctApi = this.ctApiWrapper.getCtApi();
        if (eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED) {
            z2 = true;
        } else {
            z2 = false;
        }
        return ctApi.getActualDomain(z2);
    }

    public final void initHandshake(@NotNull EventGroup eventGroup, @NotNull Runnable handshakeSuccessCallback) {
        Intrinsics.echo(eventGroup, "eventGroup");
        Intrinsics.echo(handshakeSuccessCallback, "handshakeSuccessCallback");
        this.responseFailureCount = 0;
        performHandshakeForDomain(eventGroup, handshakeSuccessCallback);
    }

    public final boolean needsHandshakeForDomain(@NotNull EventGroup eventGroup) {
        boolean z2;
        boolean z10;
        Intrinsics.echo(eventGroup, "eventGroup");
        CtApiWrapper ctApiWrapper = this.ctApiWrapper;
        if (eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean needsHandshake = ctApiWrapper.needsHandshake(z2);
        if (this.responseFailureCount > 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            setDomain(null);
        }
        if (!needsHandshake && !z10) {
            return false;
        }
        return true;
    }

    public final void performHandshakeForDomain(@NotNull EventGroup eventGroup, @NotNull Runnable handshakeSuccessCallback) {
        boolean z2;
        Intrinsics.echo(eventGroup, "eventGroup");
        Intrinsics.echo(handshakeSuccessCallback, "handshakeSuccessCallback");
        try {
            CtApi ctApi = this.ctApiWrapper.getCtApi();
            if (eventGroup == EventGroup.PUSH_NOTIFICATION_VIEWED) {
                z2 = true;
            } else {
                z2 = false;
            }
            Response performHandshakeForDomain = ctApi.performHandshakeForDomain(z2);
            try {
                if (performHandshakeForDomain.isSuccess()) {
                    this.logger.verbose(this.config.getAccountId(), "Received success from handshake :)");
                    if (shouldMuteSdk(performHandshakeForDomain)) {
                        AbstractC2716m6.alpha(performHandshakeForDomain, null);
                        return;
                    } else {
                        saveDomainChanges(performHandshakeForDomain);
                        this.logger.verbose(this.config.getAccountId(), "We are not muted");
                        handshakeSuccessCallback.run();
                    }
                } else {
                    this.logger.verbose(this.config.getAccountId(), "Invalid HTTP status code received for handshake - " + performHandshakeForDomain.getCode());
                }
                AbstractC2716m6.alpha(performHandshakeForDomain, null);
            } finally {
            }
        } catch (Exception e) {
            this.logger.verbose(this.config.getAccountId(), "Failed to perform handshake!", e);
        }
    }

    public final void removeNetworkHeadersListener(@NotNull NetworkHeadersListener listener) {
        Intrinsics.echo(listener, "listener");
        this.mNetworkHeadersListeners.remove(listener);
    }

    public final boolean sendQueue(@NotNull Context context, @NotNull EventGroup eventGroup, @Nullable JSONArray queue, @Nullable String caller, boolean isUserSwitchFlush) {
        Intrinsics.echo(context, "context");
        Intrinsics.echo(eventGroup, "eventGroup");
        if (queue != null && queue.length() > 0) {
            if (this.deviceInfo.getDeviceID() == null) {
                this.logger.debug(this.config.getAccountId(), "CleverTap Id not finalized, unable to send queue");
                return false;
            }
            EndpointId fromEventGroup = EndpointId.INSTANCE.fromEventGroup(eventGroup);
            JSONObject queueHeader = getQueueHeader(caller);
            applyQueueHeaderListeners(queueHeader, fromEventGroup, queue.optJSONObject(0).has(Constants.PROFILE));
            SendQueueRequestBody sendQueueRequestBody = new SendQueueRequestBody(queueHeader, queue);
            this.logger.debug(this.config.getAccountId(), "Send queue contains " + queue.length() + " items: " + sendQueueRequestBody);
            try {
                return networkCall(eventGroup, sendQueueRequestBody, new l(this, sendQueueRequestBody, fromEventGroup, 10), isUserSwitchFlush);
            } catch (Exception e) {
                this.networkRetryCount++;
                this.responseFailureCount++;
                this.logger.debug(this.config.getAccountId(), "An exception occurred while sending the queue, will retry: ", e);
                if (this.callbackManager.getFailureFlushListener() != null) {
                    this.callbackManager.getFailureFlushListener().failureFlush(context);
                }
            }
        }
        return false;
    }

    public /* synthetic */ NetworkManager(Context context, CleverTapInstanceConfig cleverTapInstanceConfig, DeviceInfo deviceInfo, CoreMetaData coreMetaData, ControllerManager controllerManager, BaseDatabaseManager baseDatabaseManager, BaseCallbackManager baseCallbackManager, CtApiWrapper ctApiWrapper, NetworkEncryptionManager networkEncryptionManager, ARPResponse aRPResponse, NetworkRepo networkRepo, QueueHeaderBuilder queueHeaderBuilder, ClevertapResponseHandler clevertapResponseHandler, ILogger iLogger, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, cleverTapInstanceConfig, deviceInfo, coreMetaData, controllerManager, baseDatabaseManager, baseCallbackManager, ctApiWrapper, networkEncryptionManager, aRPResponse, networkRepo, queueHeaderBuilder, clevertapResponseHandler, (i4 & 8192) != 0 ? cleverTapInstanceConfig.getLogger() : iLogger);
    }
}
