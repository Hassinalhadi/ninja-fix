package com.clevertap.android.sdk.inapp;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.utils.JsonUtilsKt;
import ge.InterfaceC1772d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b$\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\f\n\u0002\b\u0012\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 \u009f\u00012\u00020\u0001:\u0002\u009f\u0001B\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0012\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\"\u001a\u00020\u00102\b\u0010\u001f\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010$J-\u0010,\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\b\u0010)\u001a\u0004\u0018\u00010(2\n\u0010+\u001a\u0006\u0012\u0002\b\u00030*H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010.\u001a\u00020&H\u0002¢\u0006\u0004\b/\u00100R(\u00102\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R(\u00106\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105R(\u00109\u001a\u0004\u0018\u0001082\b\u00101\u001a\u0004\u0018\u0001088\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R$\u0010=\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010\u0014R\u0018\u0010?\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010@R(\u0010B\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bB\u00103\u001a\u0004\bC\u00105R$\u0010D\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010\rR\u001c\u0010I\u001a\b\u0012\u0004\u0012\u00020H0G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010JR$\u0010K\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bK\u0010>\u001a\u0004\bK\u0010\u0014R$\u0010L\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bL\u0010\u0014R(\u0010M\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bM\u00103\u001a\u0004\bN\u00105R(\u0010O\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010(8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bO\u00103\u001a\u0004\bP\u00105R$\u0010R\u001a\u00020Q2\u0006\u00101\u001a\u00020Q8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR$\u0010V\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010\rR$\u0010X\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bX\u0010E\u001a\u0004\bY\u0010\rR$\u0010Z\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bZ\u0010>\u001a\u0004\bZ\u0010\u0014R$\u0010[\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b[\u0010>\u001a\u0004\b\\\u0010\u0014R$\u0010]\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010>\u001a\u0004\b]\u0010\u0014R(\u0010^\u001a\u0004\u0018\u00010\u001a2\b\u00101\u001a\u0004\u0018\u00010\u001a8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR(\u0010+\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010(8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b+\u00103\u001a\u0004\bb\u00105R$\u0010c\u001a\u00020(2\u0006\u00101\u001a\u00020(8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bc\u00103\u001a\u0004\bd\u00105R$\u0010e\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\be\u0010E\u001a\u0004\bf\u0010\rR(\u0010g\u001a\u0004\u0018\u00010\u00022\b\u00101\u001a\u0004\u0018\u00010\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bg\u0010@\u001a\u0004\bh\u0010iR(\u0010j\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010(8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bj\u00103\u001a\u0004\bk\u00105R$\u0010l\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bl\u0010>\u001a\u0004\bm\u0010\u0014R$\u0010n\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u00103\u001a\u0004\bo\u00105\"\u0004\bp\u0010qR$\u0010r\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\br\u0010E\u001a\u0004\bs\u0010\rR$\u0010t\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bt\u0010E\u001a\u0004\bu\u0010\rR$\u0010w\u001a\u00020v2\u0006\u00101\u001a\u00020v8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bw\u0010x\u001a\u0004\by\u0010zR$\u0010{\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b{\u0010>\u001a\u0004\b|\u0010\u0014R(\u0010}\u001a\u0004\u0018\u00010(2\b\u00101\u001a\u0004\u0018\u00010(8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b}\u00103\u001a\u0004\b~\u00105R%\u0010\u007f\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\r\n\u0004\b\u007f\u0010>\u001a\u0005\b\u0080\u0001\u0010\u0014R'\u0010\u0081\u0001\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010>\u001a\u0005\b\u0082\u0001\u0010\u0014R\u001e\u0010\u0083\u0001\u001a\b\u0012\u0004\u0012\u00020\u00160G8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010JR'\u0010\u0084\u0001\u001a\u00020(2\u0006\u00101\u001a\u00020(8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0084\u0001\u00103\u001a\u0005\b\u0085\u0001\u00105R+\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u00101\u001a\u00030\u0086\u00018\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R'\u0010\u008b\u0001\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010>\u001a\u0005\b\u008c\u0001\u0010\u0014R'\u0010\u008d\u0001\u001a\u00020(2\u0006\u00101\u001a\u00020(8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008d\u0001\u00103\u001a\u0005\b\u008e\u0001\u00105R'\u0010\u008f\u0001\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00048\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010>\u001a\u0005\b\u0090\u0001\u0010\u0014R'\u0010\u0091\u0001\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010E\u001a\u0005\b\u0092\u0001\u0010\rR'\u0010\u0093\u0001\u001a\u00020\u000b2\u0006\u00101\u001a\u00020\u000b8\u0000@BX\u0080\u000e¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010E\u001a\u0005\b\u0094\u0001\u0010\rR\u0015\u0010\u0096\u0001\u001a\u0004\u0018\u00010\u00028F¢\u0006\u0007\u001a\u0005\b\u0095\u0001\u0010iR\u0013\u0010\u0098\u0001\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010iR\u001b\u0010\u009c\u0001\u001a\t\u0012\u0004\u0012\u00020H0\u0099\u00018F¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001R\u001e\u0010\u009e\u0001\u001a\t\u0012\u0004\u0012\u00020\u00160\u0099\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009b\u0001¨\u0006 \u0001"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "jsonObject", "", "videoSupported", "<init>", "(Lorg/json/JSONObject;Z)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "hasStreamMedia", "()Z", Constants.KEY_ORIENTATION, "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "getInAppMediaForOrientation$clevertap_core_release", "(I)Lcom/clevertap/android/sdk/inapp/CTInAppNotificationMedia;", "getInAppMediaForOrientation", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "actionData", "createNotificationForAction$clevertap_core_release", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "createNotificationForAction", "inAppData", "setCustomTemplateData$clevertap_core_release", "(Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;)V", "setCustomTemplateData", "configureWithJson", "(Lorg/json/JSONObject;)V", "legacyConfigureWithJson", "Landroid/os/Bundle;", "b", "", Constants.KEY_KEY, "Lge/d;", Constants.KEY_TYPE, "isKeyValid", "(Landroid/os/Bundle;Ljava/lang/String;Lge/d;)Z", "notif", "validateNotifBundle", "(Landroid/os/Bundle;)Z", "value", Constants.KEY_ID, "Ljava/lang/String;", "getId", "()Ljava/lang/String;", Column.CAMPAIGN, "getCampaignId", "Lcom/clevertap/android/sdk/inapp/CTInAppType;", "inAppType", "Lcom/clevertap/android/sdk/inapp/CTInAppType;", "getInAppType", "()Lcom/clevertap/android/sdk/inapp/CTInAppType;", "isExcludeFromCaps", "Z", "_actionExtras", "Lorg/json/JSONObject;", "_jsonDescription", "landscapeImageUrl", "getLandscapeImageUrl", "maxPerSession", "I", "getMaxPerSession", "Ljava/util/ArrayList;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotificationButton;", "_buttons", "Ljava/util/ArrayList;", "isLandscape", "isPortrait", Constants.KEY_TITLE, "getTitle", Constants.KEY_MESSAGE, "getMessage", "", "timeToLive", "J", "getTimeToLive", "()J", "totalDailyCount", "getTotalDailyCount", "totalLifetimeCount", "getTotalLifetimeCount", CTLocalInApp.IS_LOCAL_INAPP, "fallBackToNotificationSettings", "getFallBackToNotificationSettings", "isRequestForPushPermission", "customTemplateData", "Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "getCustomTemplateData$clevertap_core_release", "()Lcom/clevertap/android/sdk/inapp/customtemplates/CustomTemplateInAppData;", "getType$clevertap_core_release", "backgroundColor", "getBackgroundColor$clevertap_core_release", "buttonCount", "getButtonCount$clevertap_core_release", "customExtras", "getCustomExtras$clevertap_core_release", "()Lorg/json/JSONObject;", "customInAppUrl", "getCustomInAppUrl$clevertap_core_release", "isDarkenScreen", "isDarkenScreen$clevertap_core_release", RedirectCustomTabEventLogger.RESULT_ERROR, "getError$clevertap_core_release", "setError$clevertap_core_release", "(Ljava/lang/String;)V", "height", "getHeight$clevertap_core_release", "heightPercentage", "getHeightPercentage$clevertap_core_release", "", Constants.INAPP_ASPECT_RATIO, "D", "getAspectRatio$clevertap_core_release", "()D", "isHideCloseButton", "isHideCloseButton$clevertap_core_release", Constants.INAPP_HTML_TAG, "getHtml$clevertap_core_release", "isTablet", "isTablet$clevertap_core_release", Constants.INAPP_JS_ENABLED, "isJsEnabled$clevertap_core_release", "_mediaList", "messageColor", "getMessageColor$clevertap_core_release", "", "position", "C", "getPosition$clevertap_core_release", "()C", "isShowClose", "isShowClose$clevertap_core_release", "titleColor", "getTitleColor$clevertap_core_release", "isVideoSupported", "isVideoSupported$clevertap_core_release", "width", "getWidth$clevertap_core_release", "widthPercentage", "getWidthPercentage$clevertap_core_release", "getActionExtras", "actionExtras", "getJsonDescription", "jsonDescription", "", "getButtons", "()Ljava/util/List;", Constants.KEY_BUTTONS, "getMediaList$clevertap_core_release", "mediaList", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTInAppNotification implements Parcelable {

    @NotNull
    private static final String EMPTY_JSON = "{}";
    public static final double HTML_DEFAULT_ASPECT_RATIO = -1.0d;

    @Nullable
    private JSONObject _actionExtras;

    @NotNull
    private ArrayList<CTInAppNotificationButton> _buttons;

    @NotNull
    private JSONObject _jsonDescription;

    @NotNull
    private ArrayList<CTInAppNotificationMedia> _mediaList;
    private double aspectRatio;

    @NotNull
    private String backgroundColor;
    private int buttonCount;

    @Nullable
    private String campaignId;

    @Nullable
    private JSONObject customExtras;

    @Nullable
    private String customInAppUrl;

    @Nullable
    private CustomTemplateInAppData customTemplateData;

    @Nullable
    private String error;
    private boolean fallBackToNotificationSettings;
    private int height;
    private int heightPercentage;

    @Nullable
    private String html;

    @Nullable
    private String id;

    @Nullable
    private CTInAppType inAppType;
    private boolean isDarkenScreen;
    private boolean isExcludeFromCaps;
    private boolean isHideCloseButton;
    private boolean isJsEnabled;
    private boolean isLandscape;
    private boolean isLocalInApp;
    private boolean isPortrait;
    private boolean isRequestForPushPermission;
    private boolean isShowClose;
    private boolean isTablet;
    private boolean isVideoSupported;

    @Nullable
    private String landscapeImageUrl;
    private int maxPerSession;

    @Nullable
    private String message;

    @NotNull
    private String messageColor;
    private char position;
    private long timeToLive;

    @Nullable
    private String title;

    @NotNull
    private String titleColor;
    private int totalDailyCount;
    private int totalLifetimeCount;

    @Nullable
    private String type;
    private int width;
    private int widthPercentage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final Parcelable.Creator<CTInAppNotification> CREATOR = new Parcelable.Creator<CTInAppNotification>() { // from class: com.clevertap.android.sdk.inapp.CTInAppNotification$Companion$CREATOR$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CTInAppNotification createFromParcel(Parcel in) {
            Intrinsics.echo(in, "in");
            return new CTInAppNotification(in, (DefaultConstructorMarker) null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public CTInAppNotification[] newArray(int size) {
            return new CTInAppNotification[size];
        }
    };

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/clevertap/android/sdk/inapp/CTInAppNotification$Companion;", "", "<init>", "()V", "HTML_DEFAULT_ASPECT_RATIO", "", "EMPTY_JSON", "", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/clevertap/android/sdk/inapp/CTInAppNotification;", "defaultTtl", "", "getBundleFromJsonObject", "Landroid/os/Bundle;", "notif", "Lorg/json/JSONObject;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Bundle getBundleFromJsonObject(JSONObject notif) {
            Bundle bundle = new Bundle();
            Iterator<String> keys = notif.keys();
            Intrinsics.delta(keys, "keys(...)");
            while (keys.hasNext()) {
                String next = keys.next();
                Intrinsics.charlie(next, "null cannot be cast to non-null type kotlin.String");
                String str = next;
                try {
                    Object obj = notif.get(str);
                    if (obj instanceof String) {
                        bundle.putString(str, (String) obj);
                    } else if (obj instanceof Character) {
                        bundle.putChar(str, ((Character) obj).charValue());
                    } else if (obj instanceof Integer) {
                        bundle.putInt(str, ((Number) obj).intValue());
                    } else if (obj instanceof Float) {
                        bundle.putFloat(str, ((Number) obj).floatValue());
                    } else if (obj instanceof Double) {
                        bundle.putDouble(str, ((Number) obj).doubleValue());
                    } else if (obj instanceof Long) {
                        bundle.putLong(str, ((Number) obj).longValue());
                    } else if (obj instanceof Boolean) {
                        bundle.putBoolean(str, ((Boolean) obj).booleanValue());
                    } else if (obj instanceof JSONObject) {
                        bundle.putBundle(str, getBundleFromJsonObject((JSONObject) obj));
                    }
                } catch (JSONException unused) {
                    Logger.v("Key had unknown object. Discarding");
                }
            }
            return bundle;
        }

        public final long defaultTtl() {
            return (System.currentTimeMillis() + 172800000) / 1000;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CTInAppType.values().length];
            try {
                iArr[CTInAppType.CTInAppTypeFooter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeHeader.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeCover.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeHalfInterstitial.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeCoverImageOnly.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeHalfInterstitialImageOnly.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[CTInAppType.CTInAppTypeInterstitialImageOnly.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ CTInAppNotification(Parcel parcel, DefaultConstructorMarker defaultConstructorMarker) {
        this(parcel);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2 A[Catch: JSONException -> 0x0043, TRY_ENTER, TryCatch #0 {JSONException -> 0x0043, blocks: (B:3:0x0004, B:5:0x0038, B:9:0x0047, B:11:0x0083, B:15:0x008d, B:18:0x00b2, B:19:0x00c0, B:21:0x00c8, B:22:0x00d6, B:24:0x00e6, B:26:0x00ee, B:27:0x00f3, B:29:0x00fb, B:31:0x0104, B:32:0x0109, B:34:0x0111, B:36:0x0118, B:38:0x011e, B:40:0x012d, B:43:0x0130, B:48:0x0156, B:50:0x015e, B:51:0x0167, B:53:0x016d, B:55:0x017c, B:57:0x0182, B:59:0x0188, B:62:0x018e, B:71:0x0193, B:73:0x0198, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:80:0x01bc, B:83:0x01c2, B:92:0x0145), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c8 A[Catch: JSONException -> 0x0043, TryCatch #0 {JSONException -> 0x0043, blocks: (B:3:0x0004, B:5:0x0038, B:9:0x0047, B:11:0x0083, B:15:0x008d, B:18:0x00b2, B:19:0x00c0, B:21:0x00c8, B:22:0x00d6, B:24:0x00e6, B:26:0x00ee, B:27:0x00f3, B:29:0x00fb, B:31:0x0104, B:32:0x0109, B:34:0x0111, B:36:0x0118, B:38:0x011e, B:40:0x012d, B:43:0x0130, B:48:0x0156, B:50:0x015e, B:51:0x0167, B:53:0x016d, B:55:0x017c, B:57:0x0182, B:59:0x0188, B:62:0x018e, B:71:0x0193, B:73:0x0198, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:80:0x01bc, B:83:0x01c2, B:92:0x0145), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6 A[Catch: JSONException -> 0x0043, TryCatch #0 {JSONException -> 0x0043, blocks: (B:3:0x0004, B:5:0x0038, B:9:0x0047, B:11:0x0083, B:15:0x008d, B:18:0x00b2, B:19:0x00c0, B:21:0x00c8, B:22:0x00d6, B:24:0x00e6, B:26:0x00ee, B:27:0x00f3, B:29:0x00fb, B:31:0x0104, B:32:0x0109, B:34:0x0111, B:36:0x0118, B:38:0x011e, B:40:0x012d, B:43:0x0130, B:48:0x0156, B:50:0x015e, B:51:0x0167, B:53:0x016d, B:55:0x017c, B:57:0x0182, B:59:0x0188, B:62:0x018e, B:71:0x0193, B:73:0x0198, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:80:0x01bc, B:83:0x01c2, B:92:0x0145), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb A[Catch: JSONException -> 0x0043, TryCatch #0 {JSONException -> 0x0043, blocks: (B:3:0x0004, B:5:0x0038, B:9:0x0047, B:11:0x0083, B:15:0x008d, B:18:0x00b2, B:19:0x00c0, B:21:0x00c8, B:22:0x00d6, B:24:0x00e6, B:26:0x00ee, B:27:0x00f3, B:29:0x00fb, B:31:0x0104, B:32:0x0109, B:34:0x0111, B:36:0x0118, B:38:0x011e, B:40:0x012d, B:43:0x0130, B:48:0x0156, B:50:0x015e, B:51:0x0167, B:53:0x016d, B:55:0x017c, B:57:0x0182, B:59:0x0188, B:62:0x018e, B:71:0x0193, B:73:0x0198, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:80:0x01bc, B:83:0x01c2, B:92:0x0145), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111 A[Catch: JSONException -> 0x0043, TryCatch #0 {JSONException -> 0x0043, blocks: (B:3:0x0004, B:5:0x0038, B:9:0x0047, B:11:0x0083, B:15:0x008d, B:18:0x00b2, B:19:0x00c0, B:21:0x00c8, B:22:0x00d6, B:24:0x00e6, B:26:0x00ee, B:27:0x00f3, B:29:0x00fb, B:31:0x0104, B:32:0x0109, B:34:0x0111, B:36:0x0118, B:38:0x011e, B:40:0x012d, B:43:0x0130, B:48:0x0156, B:50:0x015e, B:51:0x0167, B:53:0x016d, B:55:0x017c, B:57:0x0182, B:59:0x0188, B:62:0x018e, B:71:0x0193, B:73:0x0198, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:80:0x01bc, B:83:0x01c2, B:92:0x0145), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0156 A[Catch: JSONException -> 0x0043, TRY_ENTER, TryCatch #0 {JSONException -> 0x0043, blocks: (B:3:0x0004, B:5:0x0038, B:9:0x0047, B:11:0x0083, B:15:0x008d, B:18:0x00b2, B:19:0x00c0, B:21:0x00c8, B:22:0x00d6, B:24:0x00e6, B:26:0x00ee, B:27:0x00f3, B:29:0x00fb, B:31:0x0104, B:32:0x0109, B:34:0x0111, B:36:0x0118, B:38:0x011e, B:40:0x012d, B:43:0x0130, B:48:0x0156, B:50:0x015e, B:51:0x0167, B:53:0x016d, B:55:0x017c, B:57:0x0182, B:59:0x0188, B:62:0x018e, B:71:0x0193, B:73:0x0198, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:80:0x01bc, B:83:0x01c2, B:92:0x0145), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0198 A[Catch: JSONException -> 0x0043, TryCatch #0 {JSONException -> 0x0043, blocks: (B:3:0x0004, B:5:0x0038, B:9:0x0047, B:11:0x0083, B:15:0x008d, B:18:0x00b2, B:19:0x00c0, B:21:0x00c8, B:22:0x00d6, B:24:0x00e6, B:26:0x00ee, B:27:0x00f3, B:29:0x00fb, B:31:0x0104, B:32:0x0109, B:34:0x0111, B:36:0x0118, B:38:0x011e, B:40:0x012d, B:43:0x0130, B:48:0x0156, B:50:0x015e, B:51:0x0167, B:53:0x016d, B:55:0x017c, B:57:0x0182, B:59:0x0188, B:62:0x018e, B:71:0x0193, B:73:0x0198, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:80:0x01bc, B:83:0x01c2, B:92:0x0145), top: B:2:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0145 A[Catch: JSONException -> 0x0043, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0043, blocks: (B:3:0x0004, B:5:0x0038, B:9:0x0047, B:11:0x0083, B:15:0x008d, B:18:0x00b2, B:19:0x00c0, B:21:0x00c8, B:22:0x00d6, B:24:0x00e6, B:26:0x00ee, B:27:0x00f3, B:29:0x00fb, B:31:0x0104, B:32:0x0109, B:34:0x0111, B:36:0x0118, B:38:0x011e, B:40:0x012d, B:43:0x0130, B:48:0x0156, B:50:0x015e, B:51:0x0167, B:53:0x016d, B:55:0x017c, B:57:0x0182, B:59:0x0188, B:62:0x018e, B:71:0x0193, B:73:0x0198, B:74:0x01a1, B:76:0x01a7, B:78:0x01b6, B:80:0x01bc, B:83:0x01c2, B:92:0x0145), top: B:2:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void configureWithJson(JSONObject jsonObject) {
        boolean z2;
        boolean z10;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONArray optJSONArray;
        CTInAppType cTInAppType;
        CTInAppNotificationMedia create;
        CTInAppNotificationMedia create2;
        try {
            this.id = jsonObject.optString(Constants.INAPP_ID_IN_PAYLOAD, "");
            this.campaignId = jsonObject.optString(Constants.NOTIFICATION_ID_TAG, "");
            this.type = jsonObject.getString(Constants.KEY_TYPE);
            this.isLocalInApp = jsonObject.optBoolean(CTLocalInApp.IS_LOCAL_INAPP, false);
            this.fallBackToNotificationSettings = jsonObject.optBoolean(CTLocalInApp.FALLBACK_TO_NOTIFICATION_SETTINGS, false);
            int i4 = -1;
            if (jsonObject.optInt(Constants.KEY_EFC, -1) != 1 && jsonObject.optInt(Constants.KEY_EXCLUDE_GLOBAL_CAPS, -1) != 1) {
                z2 = false;
                this.isExcludeFromCaps = z2;
                this.totalLifetimeCount = jsonObject.optInt(Constants.KEY_TLC, -1);
                this.totalDailyCount = jsonObject.optInt(Constants.KEY_TDC, -1);
                this.maxPerSession = jsonObject.optInt(Constants.INAPP_MAX_DISPLAY_COUNT, -1);
                this.inAppType = CTInAppType.INSTANCE.fromString(this.type);
                this.isTablet = jsonObject.optBoolean(Constants.KEY_IS_TABLET, false);
                this.backgroundColor = jsonObject.optString(Constants.KEY_BG, this.backgroundColor);
                if (jsonObject.has(Constants.KEY_PORTRAIT) && !jsonObject.getBoolean(Constants.KEY_PORTRAIT)) {
                    z10 = false;
                    this.isPortrait = z10;
                    this.isLandscape = jsonObject.optBoolean(Constants.KEY_LANDSCAPE, false);
                    this.timeToLive = jsonObject.optLong("wzrk_ttl", INSTANCE.defaultTtl());
                    optJSONObject = jsonObject.optJSONObject(Constants.KEY_TITLE);
                    if (optJSONObject != null) {
                        this.title = optJSONObject.optString(Constants.KEY_TEXT, "");
                        this.titleColor = optJSONObject.optString(Constants.KEY_COLOR, this.titleColor);
                    }
                    optJSONObject2 = jsonObject.optJSONObject(Constants.KEY_MESSAGE);
                    if (optJSONObject2 != null) {
                        this.message = optJSONObject2.optString(Constants.KEY_TEXT, "");
                        this.messageColor = optJSONObject2.optString(Constants.KEY_COLOR, this.messageColor);
                    }
                    this.isHideCloseButton = jsonObject.optBoolean(Constants.KEY_HIDE_CLOSE, false);
                    optJSONObject3 = jsonObject.optJSONObject(Constants.KEY_MEDIA);
                    if (optJSONObject3 != null && (create2 = CTInAppNotificationMedia.INSTANCE.create(optJSONObject3, 1)) != null) {
                        this._mediaList.add(create2);
                    }
                    optJSONObject4 = jsonObject.optJSONObject(Constants.KEY_MEDIA_LANDSCAPE);
                    if (optJSONObject4 != null && (create = CTInAppNotificationMedia.INSTANCE.create(optJSONObject4, 2)) != null) {
                        this._mediaList.add(create);
                    }
                    optJSONArray = jsonObject.optJSONArray(Constants.KEY_BUTTONS);
                    if (optJSONArray != null) {
                        int length = optJSONArray.length();
                        for (int i5 = 0; i5 < length; i5++) {
                            JSONObject optJSONObject5 = optJSONArray.optJSONObject(i5);
                            if (optJSONObject5 != null) {
                                this._buttons.add(new CTInAppNotificationButton(optJSONObject5));
                                this.buttonCount++;
                            }
                        }
                    }
                    this.isRequestForPushPermission = jsonObject.optBoolean(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION, false);
                    this.customTemplateData = CustomTemplateInAppData.INSTANCE.createFromJson(jsonObject);
                    cTInAppType = this.inAppType;
                    if (cTInAppType == null) {
                        i4 = WhenMappings.$EnumSwitchMapping$0[cTInAppType.ordinal()];
                    }
                    switch (i4) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            Iterator<CTInAppNotificationMedia> it = this._mediaList.iterator();
                            Intrinsics.delta(it, "iterator(...)");
                            while (it.hasNext()) {
                                CTInAppNotificationMedia next = it.next();
                                Intrinsics.delta(next, "next(...)");
                                CTInAppNotificationMedia cTInAppNotificationMedia = next;
                                if (cTInAppNotificationMedia.isGIF() || cTInAppNotificationMedia.isAudio() || cTInAppNotificationMedia.isVideo()) {
                                    cTInAppNotificationMedia.setMediaUrl("");
                                    Logger.d("Unable to download to media. Wrong media type for template");
                                }
                            }
                            return;
                        case 5:
                        case 6:
                        case 7:
                            if (!this._mediaList.isEmpty()) {
                                Iterator<CTInAppNotificationMedia> it2 = this._mediaList.iterator();
                                Intrinsics.delta(it2, "iterator(...)");
                                while (it2.hasNext()) {
                                    CTInAppNotificationMedia next2 = it2.next();
                                    Intrinsics.delta(next2, "next(...)");
                                    CTInAppNotificationMedia cTInAppNotificationMedia2 = next2;
                                    if (cTInAppNotificationMedia2.isGIF() || cTInAppNotificationMedia2.isAudio() || cTInAppNotificationMedia2.isVideo() || !cTInAppNotificationMedia2.isImage()) {
                                        this.error = "Wrong media type for template";
                                        return;
                                    }
                                }
                                return;
                            }
                            this.error = "No media type for template";
                            return;
                        default:
                            return;
                    }
                }
                z10 = true;
                this.isPortrait = z10;
                this.isLandscape = jsonObject.optBoolean(Constants.KEY_LANDSCAPE, false);
                this.timeToLive = jsonObject.optLong("wzrk_ttl", INSTANCE.defaultTtl());
                optJSONObject = jsonObject.optJSONObject(Constants.KEY_TITLE);
                if (optJSONObject != null) {
                }
                optJSONObject2 = jsonObject.optJSONObject(Constants.KEY_MESSAGE);
                if (optJSONObject2 != null) {
                }
                this.isHideCloseButton = jsonObject.optBoolean(Constants.KEY_HIDE_CLOSE, false);
                optJSONObject3 = jsonObject.optJSONObject(Constants.KEY_MEDIA);
                if (optJSONObject3 != null) {
                    this._mediaList.add(create2);
                }
                optJSONObject4 = jsonObject.optJSONObject(Constants.KEY_MEDIA_LANDSCAPE);
                if (optJSONObject4 != null) {
                    this._mediaList.add(create);
                }
                optJSONArray = jsonObject.optJSONArray(Constants.KEY_BUTTONS);
                if (optJSONArray != null) {
                }
                this.isRequestForPushPermission = jsonObject.optBoolean(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION, false);
                this.customTemplateData = CustomTemplateInAppData.INSTANCE.createFromJson(jsonObject);
                cTInAppType = this.inAppType;
                if (cTInAppType == null) {
                }
                switch (i4) {
                }
            }
            z2 = true;
            this.isExcludeFromCaps = z2;
            this.totalLifetimeCount = jsonObject.optInt(Constants.KEY_TLC, -1);
            this.totalDailyCount = jsonObject.optInt(Constants.KEY_TDC, -1);
            this.maxPerSession = jsonObject.optInt(Constants.INAPP_MAX_DISPLAY_COUNT, -1);
            this.inAppType = CTInAppType.INSTANCE.fromString(this.type);
            this.isTablet = jsonObject.optBoolean(Constants.KEY_IS_TABLET, false);
            this.backgroundColor = jsonObject.optString(Constants.KEY_BG, this.backgroundColor);
            if (jsonObject.has(Constants.KEY_PORTRAIT)) {
                z10 = false;
                this.isPortrait = z10;
                this.isLandscape = jsonObject.optBoolean(Constants.KEY_LANDSCAPE, false);
                this.timeToLive = jsonObject.optLong("wzrk_ttl", INSTANCE.defaultTtl());
                optJSONObject = jsonObject.optJSONObject(Constants.KEY_TITLE);
                if (optJSONObject != null) {
                }
                optJSONObject2 = jsonObject.optJSONObject(Constants.KEY_MESSAGE);
                if (optJSONObject2 != null) {
                }
                this.isHideCloseButton = jsonObject.optBoolean(Constants.KEY_HIDE_CLOSE, false);
                optJSONObject3 = jsonObject.optJSONObject(Constants.KEY_MEDIA);
                if (optJSONObject3 != null) {
                }
                optJSONObject4 = jsonObject.optJSONObject(Constants.KEY_MEDIA_LANDSCAPE);
                if (optJSONObject4 != null) {
                }
                optJSONArray = jsonObject.optJSONArray(Constants.KEY_BUTTONS);
                if (optJSONArray != null) {
                }
                this.isRequestForPushPermission = jsonObject.optBoolean(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION, false);
                this.customTemplateData = CustomTemplateInAppData.INSTANCE.createFromJson(jsonObject);
                cTInAppType = this.inAppType;
                if (cTInAppType == null) {
                }
                switch (i4) {
                }
            }
            z10 = true;
            this.isPortrait = z10;
            this.isLandscape = jsonObject.optBoolean(Constants.KEY_LANDSCAPE, false);
            this.timeToLive = jsonObject.optLong("wzrk_ttl", INSTANCE.defaultTtl());
            optJSONObject = jsonObject.optJSONObject(Constants.KEY_TITLE);
            if (optJSONObject != null) {
            }
            optJSONObject2 = jsonObject.optJSONObject(Constants.KEY_MESSAGE);
            if (optJSONObject2 != null) {
            }
            this.isHideCloseButton = jsonObject.optBoolean(Constants.KEY_HIDE_CLOSE, false);
            optJSONObject3 = jsonObject.optJSONObject(Constants.KEY_MEDIA);
            if (optJSONObject3 != null) {
            }
            optJSONObject4 = jsonObject.optJSONObject(Constants.KEY_MEDIA_LANDSCAPE);
            if (optJSONObject4 != null) {
            }
            optJSONArray = jsonObject.optJSONArray(Constants.KEY_BUTTONS);
            if (optJSONArray != null) {
            }
            this.isRequestForPushPermission = jsonObject.optBoolean(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION, false);
            this.customTemplateData = CustomTemplateInAppData.INSTANCE.createFromJson(jsonObject);
            cTInAppType = this.inAppType;
            if (cTInAppType == null) {
            }
            switch (i4) {
            }
        } catch (JSONException e) {
            this.error = "Invalid JSON: " + e.getLocalizedMessage();
        }
    }

    private final boolean isKeyValid(Bundle b2, String key, InterfaceC1772d type) {
        if (b2.containsKey(key) && type.november(b2.get(key))) {
            return true;
        }
        return false;
    }

    private final void legacyConfigureWithJson(JSONObject jsonObject) {
        JSONObject jSONObject;
        Companion companion = INSTANCE;
        if (!validateNotifBundle(companion.getBundleFromJsonObject(jsonObject))) {
            this.error = "Invalid JSON";
            return;
        }
        try {
            this.id = jsonObject.optString(Constants.INAPP_ID_IN_PAYLOAD, "");
            this.campaignId = jsonObject.optString(Constants.NOTIFICATION_ID_TAG, "");
            boolean z2 = true;
            if (jsonObject.optInt(Constants.KEY_EFC, -1) != 1 && jsonObject.optInt(Constants.KEY_EXCLUDE_GLOBAL_CAPS, -1) != 1) {
                z2 = false;
            }
            this.isExcludeFromCaps = z2;
            this.totalLifetimeCount = jsonObject.optInt(Constants.KEY_TLC, -1);
            this.totalDailyCount = jsonObject.optInt(Constants.KEY_TDC, -1);
            this.isJsEnabled = jsonObject.optBoolean(Constants.INAPP_JS_ENABLED, false);
            this.timeToLive = jsonObject.optLong("wzrk_ttl", companion.defaultTtl());
            this.isRequestForPushPermission = jsonObject.optBoolean(Constants.KEY_REQUEST_FOR_NOTIFICATION_PERMISSION, false);
            JSONObject optJSONObject = jsonObject.optJSONObject(Constants.INAPP_DATA_TAG);
            if (optJSONObject != null) {
                this.html = optJSONObject.getString(Constants.INAPP_HTML_TAG);
                this.customInAppUrl = optJSONObject.optString(Constants.KEY_URL, "");
                if (optJSONObject.optJSONObject(Constants.KEY_KV) != null) {
                    jSONObject = optJSONObject.getJSONObject(Constants.KEY_KV);
                } else {
                    jSONObject = new JSONObject();
                }
                this.customExtras = jSONObject;
                JSONObject optJSONObject2 = jsonObject.optJSONObject(Constants.INAPP_WINDOW);
                if (optJSONObject2 != null) {
                    this.isDarkenScreen = optJSONObject2.getBoolean(Constants.INAPP_NOTIF_DARKEN_SCREEN);
                    this.isShowClose = optJSONObject2.getBoolean(Constants.INAPP_NOTIF_SHOW_CLOSE);
                    this.position = optJSONObject2.getString(Constants.INAPP_POSITION).charAt(0);
                    this.width = optJSONObject2.optInt(Constants.INAPP_X_DP, 0);
                    this.widthPercentage = optJSONObject2.optInt(Constants.INAPP_X_PERCENT, 0);
                    this.height = optJSONObject2.optInt(Constants.INAPP_Y_DP, 0);
                    this.heightPercentage = optJSONObject2.optInt(Constants.INAPP_Y_PERCENT, 0);
                    this.maxPerSession = optJSONObject2.optInt(Constants.INAPP_MAX_DISPLAY_COUNT, -1);
                    double optDouble = optJSONObject2.optDouble(Constants.INAPP_ASPECT_RATIO, -1.0d);
                    this.aspectRatio = optDouble;
                    if (optDouble <= 0.0d) {
                        this.aspectRatio = -1.0d;
                    }
                }
                if (this.html != null) {
                    char c3 = this.position;
                    if (c3 == 't') {
                        if (this.aspectRatio != -1.0d || (this.widthPercentage == 100 && this.heightPercentage <= 30)) {
                            this.inAppType = CTInAppType.CTInAppTypeHeaderHTML;
                            return;
                        }
                        return;
                    }
                    if (c3 == 'b') {
                        if (this.aspectRatio != -1.0d || (this.widthPercentage == 100 && this.heightPercentage <= 30)) {
                            this.inAppType = CTInAppType.CTInAppTypeFooterHTML;
                            return;
                        }
                        return;
                    }
                    if (c3 == 'c') {
                        int i4 = this.widthPercentage;
                        if (i4 == 90 && this.heightPercentage == 85) {
                            this.inAppType = CTInAppType.CTInAppTypeInterstitialHTML;
                            return;
                        }
                        if (i4 == 100 && this.heightPercentage == 100) {
                            this.inAppType = CTInAppType.CTInAppTypeCoverHTML;
                        } else if (i4 == 90 && this.heightPercentage == 50) {
                            this.inAppType = CTInAppType.CTInAppTypeHalfInterstitialHTML;
                        }
                    }
                }
            }
        } catch (JSONException unused) {
            this.error = "Invalid JSON";
        }
    }

    private final boolean validateNotifBundle(Bundle notif) {
        try {
            Bundle bundle = notif.getBundle(Constants.INAPP_WINDOW);
            Bundle bundle2 = notif.getBundle(Constants.INAPP_DATA_TAG);
            if (bundle != null && bundle2 != null) {
                v vVar = u.alpha;
                if ((isKeyValid(bundle, Constants.INAPP_X_DP, vVar.bravo(Integer.class)) || isKeyValid(bundle, Constants.INAPP_X_PERCENT, vVar.bravo(Integer.class))) && (isKeyValid(bundle, Constants.INAPP_Y_DP, vVar.bravo(Integer.class)) || isKeyValid(bundle, Constants.INAPP_Y_PERCENT, vVar.bravo(Integer.class)))) {
                    Class cls = Boolean.TYPE;
                    if (isKeyValid(bundle, Constants.INAPP_NOTIF_DARKEN_SCREEN, vVar.bravo(cls)) && isKeyValid(bundle, Constants.INAPP_NOTIF_SHOW_CLOSE, vVar.bravo(cls)) && isKeyValid(bundle2, Constants.INAPP_HTML_TAG, vVar.bravo(String.class)) && isKeyValid(bundle, Constants.INAPP_POSITION, vVar.bravo(String.class))) {
                        String string = bundle.getString(Constants.INAPP_POSITION);
                        Intrinsics.checkNotNull(string);
                        char charAt = string.charAt(0);
                        if (charAt == 't' || charAt == 'r' || charAt == 'b' || charAt == 'l' || charAt == 'c') {
                            return true;
                        }
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            Logger.v("Failed to parse in-app notification!", th);
            return false;
        }
    }

    @Nullable
    public final CTInAppNotification createNotificationForAction$clevertap_core_release(@Nullable CustomTemplateInAppData actionData) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(Constants.INAPP_ID_IN_PAYLOAD, this.id);
            jSONObject.put(Constants.NOTIFICATION_ID_TAG, this.campaignId);
            jSONObject.put(Constants.KEY_TYPE, InAppActionType.CUSTOM_CODE.toString());
            jSONObject.put(Constants.KEY_EFC, 1);
            jSONObject.put(Constants.KEY_EXCLUDE_GLOBAL_CAPS, 1);
            jSONObject.put("wzrk_ttl", this.timeToLive);
            if (this._jsonDescription.has(Constants.INAPP_WZRK_PIVOT)) {
                jSONObject.put(Constants.INAPP_WZRK_PIVOT, this._jsonDescription.optString(Constants.INAPP_WZRK_PIVOT));
            }
            if (this._jsonDescription.has(Constants.INAPP_WZRK_CGID)) {
                jSONObject.put(Constants.INAPP_WZRK_CGID, this._jsonDescription.optString(Constants.INAPP_WZRK_CGID));
            }
            CTInAppNotification cTInAppNotification = new CTInAppNotification(jSONObject, this.isVideoSupported);
            cTInAppNotification.setCustomTemplateData$clevertap_core_release(actionData);
            return cTInAppNotification;
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final JSONObject getActionExtras() {
        JSONObject jSONObject = this._actionExtras;
        if (jSONObject != null) {
            return CTXtensions.copy(jSONObject);
        }
        return null;
    }

    /* renamed from: getAspectRatio$clevertap_core_release, reason: from getter */
    public final double getAspectRatio() {
        return this.aspectRatio;
    }

    @NotNull
    /* renamed from: getBackgroundColor$clevertap_core_release, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: getButtonCount$clevertap_core_release, reason: from getter */
    public final int getButtonCount() {
        return this.buttonCount;
    }

    @NotNull
    public final List<CTInAppNotificationButton> getButtons() {
        return this._buttons;
    }

    @Nullable
    public final String getCampaignId() {
        return this.campaignId;
    }

    @Nullable
    /* renamed from: getCustomExtras$clevertap_core_release, reason: from getter */
    public final JSONObject getCustomExtras() {
        return this.customExtras;
    }

    @Nullable
    /* renamed from: getCustomInAppUrl$clevertap_core_release, reason: from getter */
    public final String getCustomInAppUrl() {
        return this.customInAppUrl;
    }

    @Nullable
    /* renamed from: getCustomTemplateData$clevertap_core_release, reason: from getter */
    public final CustomTemplateInAppData getCustomTemplateData() {
        return this.customTemplateData;
    }

    @Nullable
    /* renamed from: getError$clevertap_core_release, reason: from getter */
    public final String getError() {
        return this.error;
    }

    public final boolean getFallBackToNotificationSettings() {
        return this.fallBackToNotificationSettings;
    }

    /* renamed from: getHeight$clevertap_core_release, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: getHeightPercentage$clevertap_core_release, reason: from getter */
    public final int getHeightPercentage() {
        return this.heightPercentage;
    }

    @Nullable
    /* renamed from: getHtml$clevertap_core_release, reason: from getter */
    public final String getHtml() {
        return this.html;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final CTInAppNotificationMedia getInAppMediaForOrientation$clevertap_core_release(int orientation) {
        Iterator<CTInAppNotificationMedia> it = this._mediaList.iterator();
        Intrinsics.delta(it, "iterator(...)");
        while (it.hasNext()) {
            CTInAppNotificationMedia next = it.next();
            Intrinsics.delta(next, "next(...)");
            CTInAppNotificationMedia cTInAppNotificationMedia = next;
            if (orientation == cTInAppNotificationMedia.getOrientation()) {
                return cTInAppNotificationMedia;
            }
        }
        return null;
    }

    @Nullable
    public final CTInAppType getInAppType() {
        return this.inAppType;
    }

    @NotNull
    public final JSONObject getJsonDescription() {
        return CTXtensions.copy(this._jsonDescription);
    }

    @Nullable
    public final String getLandscapeImageUrl() {
        return this.landscapeImageUrl;
    }

    public final int getMaxPerSession() {
        return this.maxPerSession;
    }

    @NotNull
    public final List<CTInAppNotificationMedia> getMediaList$clevertap_core_release() {
        return this._mediaList;
    }

    @Nullable
    public final String getMessage() {
        return this.message;
    }

    @NotNull
    /* renamed from: getMessageColor$clevertap_core_release, reason: from getter */
    public final String getMessageColor() {
        return this.messageColor;
    }

    /* renamed from: getPosition$clevertap_core_release, reason: from getter */
    public final char getPosition() {
        return this.position;
    }

    public final long getTimeToLive() {
        return this.timeToLive;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    /* renamed from: getTitleColor$clevertap_core_release, reason: from getter */
    public final String getTitleColor() {
        return this.titleColor;
    }

    public final int getTotalDailyCount() {
        return this.totalDailyCount;
    }

    public final int getTotalLifetimeCount() {
        return this.totalLifetimeCount;
    }

    @Nullable
    /* renamed from: getType$clevertap_core_release, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: getWidth$clevertap_core_release, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: getWidthPercentage$clevertap_core_release, reason: from getter */
    public final int getWidthPercentage() {
        return this.widthPercentage;
    }

    public final boolean hasStreamMedia() {
        if (this._mediaList.isEmpty() || !this._mediaList.get(0).isMediaStreamable()) {
            return false;
        }
        return true;
    }

    /* renamed from: isDarkenScreen$clevertap_core_release, reason: from getter */
    public final boolean getIsDarkenScreen() {
        return this.isDarkenScreen;
    }

    /* renamed from: isExcludeFromCaps, reason: from getter */
    public final boolean getIsExcludeFromCaps() {
        return this.isExcludeFromCaps;
    }

    /* renamed from: isHideCloseButton$clevertap_core_release, reason: from getter */
    public final boolean getIsHideCloseButton() {
        return this.isHideCloseButton;
    }

    /* renamed from: isJsEnabled$clevertap_core_release, reason: from getter */
    public final boolean getIsJsEnabled() {
        return this.isJsEnabled;
    }

    /* renamed from: isLandscape, reason: from getter */
    public final boolean getIsLandscape() {
        return this.isLandscape;
    }

    /* renamed from: isLocalInApp, reason: from getter */
    public final boolean getIsLocalInApp() {
        return this.isLocalInApp;
    }

    /* renamed from: isPortrait, reason: from getter */
    public final boolean getIsPortrait() {
        return this.isPortrait;
    }

    /* renamed from: isRequestForPushPermission, reason: from getter */
    public final boolean getIsRequestForPushPermission() {
        return this.isRequestForPushPermission;
    }

    /* renamed from: isShowClose$clevertap_core_release, reason: from getter */
    public final boolean getIsShowClose() {
        return this.isShowClose;
    }

    /* renamed from: isTablet$clevertap_core_release, reason: from getter */
    public final boolean getIsTablet() {
        return this.isTablet;
    }

    /* renamed from: isVideoSupported$clevertap_core_release, reason: from getter */
    public final boolean getIsVideoSupported() {
        return this.isVideoSupported;
    }

    public final void setCustomTemplateData$clevertap_core_release(@Nullable CustomTemplateInAppData inAppData) {
        this.customTemplateData = inAppData;
        if (inAppData != null) {
            inAppData.writeFieldsToJson$clevertap_core_release(this._jsonDescription);
        }
    }

    public final void setError$clevertap_core_release(@Nullable String str) {
        this.error = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeString(this.id);
        dest.writeString(this.campaignId);
        dest.writeValue(this.inAppType);
        dest.writeString(this.html);
        dest.writeByte(this.isExcludeFromCaps ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isShowClose ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isDarkenScreen ? (byte) 1 : (byte) 0);
        dest.writeInt(this.maxPerSession);
        dest.writeInt(this.totalLifetimeCount);
        dest.writeInt(this.totalDailyCount);
        dest.writeInt(this.position);
        dest.writeInt(this.height);
        dest.writeInt(this.heightPercentage);
        dest.writeInt(this.width);
        dest.writeInt(this.widthPercentage);
        dest.writeString(this._jsonDescription.toString());
        dest.writeString(this.error);
        if (this.customExtras == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeString(String.valueOf(this.customExtras));
        }
        if (this._actionExtras == null) {
            dest.writeByte((byte) 0);
        } else {
            dest.writeByte((byte) 1);
            dest.writeString(String.valueOf(this._actionExtras));
        }
        dest.writeString(this.type);
        dest.writeString(this.title);
        dest.writeString(this.titleColor);
        dest.writeString(this.backgroundColor);
        dest.writeString(this.message);
        dest.writeString(this.messageColor);
        dest.writeTypedList(this._buttons);
        dest.writeTypedList(this._mediaList);
        dest.writeByte(this.isHideCloseButton ? (byte) 1 : (byte) 0);
        dest.writeInt(this.buttonCount);
        dest.writeByte(this.isTablet ? (byte) 1 : (byte) 0);
        dest.writeString(this.customInAppUrl);
        dest.writeByte(this.isJsEnabled ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isPortrait ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isLandscape ? (byte) 1 : (byte) 0);
        dest.writeByte(this.isLocalInApp ? (byte) 1 : (byte) 0);
        dest.writeByte(this.fallBackToNotificationSettings ? (byte) 1 : (byte) 0);
        dest.writeString(this.landscapeImageUrl);
        dest.writeLong(this.timeToLive);
        dest.writeParcelable(this.customTemplateData, flags);
        dest.writeDouble(this.aspectRatio);
        dest.writeByte(this.isRequestForPushPermission ? (byte) 1 : (byte) 0);
    }

    public CTInAppNotification(@NotNull JSONObject jsonObject, boolean z2) {
        Intrinsics.echo(jsonObject, "jsonObject");
        this._buttons = new ArrayList<>();
        this.backgroundColor = Constants.WHITE;
        this.aspectRatio = -1.0d;
        this._mediaList = new ArrayList<>();
        this.messageColor = Constants.BLACK;
        this.titleColor = Constants.BLACK;
        this.isVideoSupported = z2;
        this._jsonDescription = jsonObject;
        try {
            String stringOrNull = JsonUtilsKt.getStringOrNull(jsonObject, Constants.KEY_TYPE);
            this.type = stringOrNull;
            if (stringOrNull != null && !Intrinsics.areEqual(stringOrNull, Constants.KEY_CUSTOM_HTML)) {
                configureWithJson(jsonObject);
                return;
            }
            legacyConfigureWithJson(jsonObject);
        } catch (JSONException e) {
            this.error = "Invalid JSON: " + e.getLocalizedMessage();
        }
    }

    private CTInAppNotification(Parcel parcel) {
        JSONObject jSONObject;
        this._buttons = new ArrayList<>();
        this.backgroundColor = Constants.WHITE;
        this.aspectRatio = -1.0d;
        this._mediaList = new ArrayList<>();
        this.messageColor = Constants.BLACK;
        this.titleColor = Constants.BLACK;
        this.id = parcel.readString();
        this.campaignId = parcel.readString();
        Object readValue = parcel.readValue(CTInAppType.class.getClassLoader());
        JSONObject jSONObject2 = null;
        this.inAppType = readValue instanceof CTInAppType ? (CTInAppType) readValue : null;
        this.html = parcel.readString();
        this.isExcludeFromCaps = parcel.readByte() != 0;
        this.isShowClose = parcel.readByte() != 0;
        this.isDarkenScreen = parcel.readByte() != 0;
        this.maxPerSession = parcel.readInt();
        this.totalLifetimeCount = parcel.readInt();
        this.totalDailyCount = parcel.readInt();
        this.position = (char) parcel.readInt();
        this.height = parcel.readInt();
        this.heightPercentage = parcel.readInt();
        this.width = parcel.readInt();
        this.widthPercentage = parcel.readInt();
        String readString = parcel.readString();
        String str = EMPTY_JSON;
        this._jsonDescription = new JSONObject(readString == null ? EMPTY_JSON : readString);
        this.error = parcel.readString();
        if (parcel.readByte() == 0) {
            jSONObject = null;
        } else {
            String readString2 = parcel.readString();
            jSONObject = new JSONObject(readString2 == null ? EMPTY_JSON : readString2);
        }
        this.customExtras = jSONObject;
        if (parcel.readByte() != 0) {
            String readString3 = parcel.readString();
            jSONObject2 = new JSONObject(readString3 != null ? readString3 : str);
        }
        this._actionExtras = jSONObject2;
        this.type = parcel.readString();
        this.title = parcel.readString();
        String readString4 = parcel.readString();
        this.titleColor = readString4 == null ? this.titleColor : readString4;
        String readString5 = parcel.readString();
        this.backgroundColor = readString5 == null ? this.backgroundColor : readString5;
        this.message = parcel.readString();
        String readString6 = parcel.readString();
        this.messageColor = readString6 == null ? this.messageColor : readString6;
        try {
            ArrayList<CTInAppNotificationButton> createTypedArrayList = parcel.createTypedArrayList(CTInAppNotificationButton.CREATOR);
            this._buttons = createTypedArrayList == null ? new ArrayList<>() : createTypedArrayList;
        } catch (Throwable unused) {
        }
        try {
            ArrayList<CTInAppNotificationMedia> createTypedArrayList2 = parcel.createTypedArrayList(CTInAppNotificationMedia.CREATOR);
            this._mediaList = createTypedArrayList2 == null ? new ArrayList<>() : createTypedArrayList2;
        } catch (Throwable unused2) {
        }
        this.isHideCloseButton = parcel.readByte() != 0;
        this.buttonCount = parcel.readInt();
        this.isTablet = parcel.readByte() != 0;
        this.customInAppUrl = parcel.readString();
        this.isJsEnabled = parcel.readByte() != 0;
        this.isPortrait = parcel.readByte() != 0;
        this.isLandscape = parcel.readByte() != 0;
        this.isLocalInApp = parcel.readByte() != 0;
        this.fallBackToNotificationSettings = parcel.readByte() != 0;
        this.landscapeImageUrl = parcel.readString();
        this.timeToLive = parcel.readLong();
        this.customTemplateData = (CustomTemplateInAppData) parcel.readParcelable(CustomTemplateInAppData.class.getClassLoader());
        this.aspectRatio = parcel.readDouble();
        this.isRequestForPushPermission = parcel.readByte() != 0;
    }
}
