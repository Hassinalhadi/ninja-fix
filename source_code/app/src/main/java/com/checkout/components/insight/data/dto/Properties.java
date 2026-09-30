package com.checkout.components.insight.data.dto;

import Q0.c;
import androidx.appcompat.widget.P0;
import com.checkout.components.core.common.Fixtures;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.product_config.CTProductConfigConstants;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b2\b\u0081\b\u0018\u00002\u00020\u0001B\u0089\u0002\u0012\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001cJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u001e\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b \u0010\u001cJ\u0018\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u001e\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b#\u0010\u001cJ\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u001fJ\u0012\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b%\u0010\u001fJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u001fJ\u0012\u0010'\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b'\u0010\u001fJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b(\u0010\u001fJ\u0012\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b)\u0010\u001fJ\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010\u001fJ\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0092\u0002\u0010.\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0016\b\u0003\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\u0010\b\u0003\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0012\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b0\u0010\u001fJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00106\u001a\u0002052\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b6\u00107R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u00109\u0012\u0004\b;\u0010<\u001a\u0004\b:\u0010\u001aR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010\u001cR.\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b@\u0010>\u0012\u0004\bB\u0010<\u001a\u0004\bA\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010\u001fR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bF\u0010>\u001a\u0004\bG\u0010\u001cR(\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bH\u0010I\u0012\u0004\bK\u0010<\u001a\u0004\bJ\u0010\"R%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\bL\u0010>\u001a\u0004\bM\u0010\u001cR\"\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bN\u0010D\u0012\u0004\bP\u0010<\u001a\u0004\bO\u0010\u001fR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bQ\u0010D\u001a\u0004\bR\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bS\u0010D\u001a\u0004\bT\u0010\u001fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bU\u0010D\u0012\u0004\bW\u0010<\u001a\u0004\bV\u0010\u001fR\"\u0010\u0011\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bX\u0010D\u0012\u0004\bZ\u0010<\u001a\u0004\bY\u0010\u001fR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b[\u0010D\u0012\u0004\b]\u0010<\u001a\u0004\b\\\u0010\u001fR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b^\u0010D\u001a\u0004\b_\u0010\u001fR\"\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b`\u0010D\u0012\u0004\bb\u0010<\u001a\u0004\ba\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\bc\u0010D\u001a\u0004\bd\u0010\u001fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\be\u0010D\u001a\u0004\bf\u0010\u001f¨\u0006g"}, d2 = {"Lcom/checkout/components/insight/data/dto/Properties;", "", "Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;", "reactNative", "", "", "appearance", "componentCallbacks", "locale", "translations", "", "featureFlagsEnabled", "experiments", "integrationDomain", Constants.KEY_URL, "method", "componentName", "paymentMethodName", "actionType", "renderer", Fixtures.PAYMENT_ID, "result", "name", "<init>", "(Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;", "component2", "()Ljava/util/Map;", "component3", "component4", "()Ljava/lang/String;", "component5", "component6", "()Ljava/util/List;", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", Constants.COPY_TYPE, "(Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/insight/data/dto/Properties;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/insight/data/dto/ReactNativeInsightProperties;", "getReactNative", "getReactNative$annotations", "()V", "b", "Ljava/util/Map;", "getAppearance", "c", "getComponentCallbacks", "getComponentCallbacks$annotations", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "getLocale", "e", "getTranslations", "f", "Ljava/util/List;", "getFeatureFlagsEnabled", "getFeatureFlagsEnabled$annotations", "g", "getExperiments", "h", "getIntegrationDomain", "getIntegrationDomain$annotations", "i", "getUrl", "j", "getMethod", "k", "getComponentName", "getComponentName$annotations", "l", "getPaymentMethodName", "getPaymentMethodName$annotations", "m", "getActionType", "getActionType$annotations", CTProductConfigConstants.PRODUCT_CONFIG_JSON_KEY_FOR_KEY, "getRenderer", "o", "getPaymentId", "getPaymentId$annotations", "p", "getResult", "q", "getName", "insight_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Properties {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReactNativeInsightProperties reactNative;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map appearance;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map componentCallbacks;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String locale;

    /* renamed from: e, reason: from kotlin metadata */
    private final Map translations;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List featureFlagsEnabled;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Map experiments;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final String integrationDomain;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final String url;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final String method;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final String componentName;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final String paymentMethodName;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final String actionType;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final String renderer;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final String paymentId;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final String result;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final String name;

    public Properties() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 131071, null);
    }

    public static /* synthetic */ Properties copy$default(Properties properties, ReactNativeInsightProperties reactNativeInsightProperties, Map map, Map map2, String str, Map map3, List list, Map map4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i4, Object obj) {
        String str12;
        String str13;
        ReactNativeInsightProperties reactNativeInsightProperties2;
        Properties properties2;
        String str14;
        Map map5;
        Map map6;
        String str15;
        Map map7;
        List list2;
        Map map8;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        String str21;
        String str22;
        ReactNativeInsightProperties reactNativeInsightProperties3 = (i4 & 1) != 0 ? properties.reactNative : reactNativeInsightProperties;
        Map map9 = (i4 & 2) != 0 ? properties.appearance : map;
        Map map10 = (i4 & 4) != 0 ? properties.componentCallbacks : map2;
        String str23 = (i4 & 8) != 0 ? properties.locale : str;
        Map map11 = (i4 & 16) != 0 ? properties.translations : map3;
        List list3 = (i4 & 32) != 0 ? properties.featureFlagsEnabled : list;
        Map map12 = (i4 & 64) != 0 ? properties.experiments : map4;
        String str24 = (i4 & 128) != 0 ? properties.integrationDomain : str2;
        String str25 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? properties.url : str3;
        String str26 = (i4 & 512) != 0 ? properties.method : str4;
        String str27 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? properties.componentName : str5;
        String str28 = (i4 & 2048) != 0 ? properties.paymentMethodName : str6;
        String str29 = (i4 & 4096) != 0 ? properties.actionType : str7;
        String str30 = (i4 & 8192) != 0 ? properties.renderer : str8;
        ReactNativeInsightProperties reactNativeInsightProperties4 = reactNativeInsightProperties3;
        String str31 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? properties.paymentId : str9;
        String str32 = (i4 & 32768) != 0 ? properties.result : str10;
        if ((i4 & 65536) != 0) {
            str13 = str32;
            str12 = properties.name;
            str14 = str31;
            map5 = map9;
            map6 = map10;
            str15 = str23;
            map7 = map11;
            list2 = list3;
            map8 = map12;
            str16 = str24;
            str17 = str25;
            str18 = str26;
            str19 = str27;
            str20 = str28;
            str21 = str29;
            str22 = str30;
            reactNativeInsightProperties2 = reactNativeInsightProperties4;
            properties2 = properties;
        } else {
            str12 = str11;
            str13 = str32;
            reactNativeInsightProperties2 = reactNativeInsightProperties4;
            properties2 = properties;
            str14 = str31;
            map5 = map9;
            map6 = map10;
            str15 = str23;
            map7 = map11;
            list2 = list3;
            map8 = map12;
            str16 = str24;
            str17 = str25;
            str18 = str26;
            str19 = str27;
            str20 = str28;
            str21 = str29;
            str22 = str30;
        }
        return properties2.copy(reactNativeInsightProperties2, map5, map6, str15, map7, list2, map8, str16, str17, str18, str19, str20, str21, str22, str14, str13, str12);
    }

    @Json(name = "action_type")
    public static /* synthetic */ void getActionType$annotations() {
    }

    @Json(name = "component_callbacks")
    public static /* synthetic */ void getComponentCallbacks$annotations() {
    }

    @Json(name = "component_name")
    public static /* synthetic */ void getComponentName$annotations() {
    }

    @Json(name = "feature_flags_enabled")
    public static /* synthetic */ void getFeatureFlagsEnabled$annotations() {
    }

    @Json(name = "integration_domain")
    public static /* synthetic */ void getIntegrationDomain$annotations() {
    }

    @Json(name = "payment_id")
    public static /* synthetic */ void getPaymentId$annotations() {
    }

    @Json(name = "payment_method_name")
    public static /* synthetic */ void getPaymentMethodName$annotations() {
    }

    @Json(name = "react_native")
    public static /* synthetic */ void getReactNative$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final ReactNativeInsightProperties getReactNative() {
        return this.reactNative;
    }

    /* renamed from: component10, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    /* renamed from: component11, reason: from getter */
    public final String getComponentName() {
        return this.componentName;
    }

    /* renamed from: component12, reason: from getter */
    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    /* renamed from: component13, reason: from getter */
    public final String getActionType() {
        return this.actionType;
    }

    /* renamed from: component14, reason: from getter */
    public final String getRenderer() {
        return this.renderer;
    }

    /* renamed from: component15, reason: from getter */
    public final String getPaymentId() {
        return this.paymentId;
    }

    /* renamed from: component16, reason: from getter */
    public final String getResult() {
        return this.result;
    }

    /* renamed from: component17, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public final Map<String, Object> component2() {
        return this.appearance;
    }

    public final Map<String, Object> component3() {
        return this.componentCallbacks;
    }

    /* renamed from: component4, reason: from getter */
    public final String getLocale() {
        return this.locale;
    }

    public final Map<String, Object> component5() {
        return this.translations;
    }

    public final List<String> component6() {
        return this.featureFlagsEnabled;
    }

    public final Map<String, Object> component7() {
        return this.experiments;
    }

    /* renamed from: component8, reason: from getter */
    public final String getIntegrationDomain() {
        return this.integrationDomain;
    }

    /* renamed from: component9, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final Properties copy(@Json(name = "react_native") ReactNativeInsightProperties reactNative, Map<String, ? extends Object> appearance, @Json(name = "component_callbacks") Map<String, ? extends Object> componentCallbacks, String locale, Map<String, ? extends Object> translations, @Json(name = "feature_flags_enabled") List<String> featureFlagsEnabled, Map<String, ? extends Object> experiments, @Json(name = "integration_domain") String integrationDomain, String url, String method, @Json(name = "component_name") String componentName, @Json(name = "payment_method_name") String paymentMethodName, @Json(name = "action_type") String actionType, String renderer, @Json(name = "payment_id") String paymentId, String result, String name) {
        return new Properties(reactNative, appearance, componentCallbacks, locale, translations, featureFlagsEnabled, experiments, integrationDomain, url, method, componentName, paymentMethodName, actionType, renderer, paymentId, result, name);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Properties)) {
            return false;
        }
        Properties properties = (Properties) other;
        return Intrinsics.areEqual(this.reactNative, properties.reactNative) && Intrinsics.areEqual(this.appearance, properties.appearance) && Intrinsics.areEqual(this.componentCallbacks, properties.componentCallbacks) && Intrinsics.areEqual(this.locale, properties.locale) && Intrinsics.areEqual(this.translations, properties.translations) && Intrinsics.areEqual(this.featureFlagsEnabled, properties.featureFlagsEnabled) && Intrinsics.areEqual(this.experiments, properties.experiments) && Intrinsics.areEqual(this.integrationDomain, properties.integrationDomain) && Intrinsics.areEqual(this.url, properties.url) && Intrinsics.areEqual(this.method, properties.method) && Intrinsics.areEqual(this.componentName, properties.componentName) && Intrinsics.areEqual(this.paymentMethodName, properties.paymentMethodName) && Intrinsics.areEqual(this.actionType, properties.actionType) && Intrinsics.areEqual(this.renderer, properties.renderer) && Intrinsics.areEqual(this.paymentId, properties.paymentId) && Intrinsics.areEqual(this.result, properties.result) && Intrinsics.areEqual(this.name, properties.name);
    }

    public final String getActionType() {
        return this.actionType;
    }

    public final Map<String, Object> getAppearance() {
        return this.appearance;
    }

    public final Map<String, Object> getComponentCallbacks() {
        return this.componentCallbacks;
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final Map<String, Object> getExperiments() {
        return this.experiments;
    }

    public final List<String> getFeatureFlagsEnabled() {
        return this.featureFlagsEnabled;
    }

    public final String getIntegrationDomain() {
        return this.integrationDomain;
    }

    public final String getLocale() {
        return this.locale;
    }

    public final String getMethod() {
        return this.method;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPaymentId() {
        return this.paymentId;
    }

    public final String getPaymentMethodName() {
        return this.paymentMethodName;
    }

    public final ReactNativeInsightProperties getReactNative() {
        return this.reactNative;
    }

    public final String getRenderer() {
        return this.renderer;
    }

    public final String getResult() {
        return this.result;
    }

    public final Map<String, Object> getTranslations() {
        return this.translations;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        ReactNativeInsightProperties reactNativeInsightProperties = this.reactNative;
        int hashCode = (reactNativeInsightProperties == null ? 0 : reactNativeInsightProperties.hashCode()) * 31;
        Map map = this.appearance;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map map2 = this.componentCallbacks;
        int hashCode3 = (hashCode2 + (map2 == null ? 0 : map2.hashCode())) * 31;
        String str = this.locale;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        Map map3 = this.translations;
        int hashCode5 = (hashCode4 + (map3 == null ? 0 : map3.hashCode())) * 31;
        List list = this.featureFlagsEnabled;
        int hashCode6 = (hashCode5 + (list == null ? 0 : list.hashCode())) * 31;
        Map map4 = this.experiments;
        int hashCode7 = (hashCode6 + (map4 == null ? 0 : map4.hashCode())) * 31;
        String str2 = this.integrationDomain;
        int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int hashCode9 = (hashCode8 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.method;
        int hashCode10 = (hashCode9 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.componentName;
        int hashCode11 = (hashCode10 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.paymentMethodName;
        int hashCode12 = (hashCode11 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.actionType;
        int hashCode13 = (hashCode12 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.renderer;
        int hashCode14 = (hashCode13 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.paymentId;
        int hashCode15 = (hashCode14 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.result;
        int hashCode16 = (hashCode15 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.name;
        return hashCode16 + (str11 != null ? str11.hashCode() : 0);
    }

    public final String toString() {
        ReactNativeInsightProperties reactNativeInsightProperties = this.reactNative;
        Map map = this.appearance;
        Map map2 = this.componentCallbacks;
        String str = this.locale;
        Map map3 = this.translations;
        List list = this.featureFlagsEnabled;
        Map map4 = this.experiments;
        String str2 = this.integrationDomain;
        String str3 = this.url;
        String str4 = this.method;
        String str5 = this.componentName;
        String str6 = this.paymentMethodName;
        String str7 = this.actionType;
        String str8 = this.renderer;
        String str9 = this.paymentId;
        String str10 = this.result;
        String str11 = this.name;
        StringBuilder sb2 = new StringBuilder("Properties(reactNative=");
        sb2.append(reactNativeInsightProperties);
        sb2.append(", appearance=");
        sb2.append(map);
        sb2.append(", componentCallbacks=");
        sb2.append(map2);
        sb2.append(", locale=");
        sb2.append(str);
        sb2.append(", translations=");
        sb2.append(map3);
        sb2.append(", featureFlagsEnabled=");
        sb2.append(list);
        sb2.append(", experiments=");
        sb2.append(map4);
        sb2.append(", integrationDomain=");
        sb2.append(str2);
        sb2.append(", url=");
        c.azure(sb2, str3, ", method=", str4, ", componentName=");
        c.azure(sb2, str5, ", paymentMethodName=", str6, ", actionType=");
        c.azure(sb2, str7, ", renderer=", str8, ", paymentId=");
        c.azure(sb2, str9, ", result=", str10, ", name=");
        return P0.gold(sb2, str11, ")");
    }

    public Properties(@Json(name = "react_native") ReactNativeInsightProperties reactNativeInsightProperties, Map<String, ? extends Object> map, @Json(name = "component_callbacks") Map<String, ? extends Object> map2, String str, Map<String, ? extends Object> map3, @Json(name = "feature_flags_enabled") List<String> list, Map<String, ? extends Object> map4, @Json(name = "integration_domain") String str2, String str3, String str4, @Json(name = "component_name") String str5, @Json(name = "payment_method_name") String str6, @Json(name = "action_type") String str7, String str8, @Json(name = "payment_id") String str9, String str10, String str11) {
        this.reactNative = reactNativeInsightProperties;
        this.appearance = map;
        this.componentCallbacks = map2;
        this.locale = str;
        this.translations = map3;
        this.featureFlagsEnabled = list;
        this.experiments = map4;
        this.integrationDomain = str2;
        this.url = str3;
        this.method = str4;
        this.componentName = str5;
        this.paymentMethodName = str6;
        this.actionType = str7;
        this.renderer = str8;
        this.paymentId = str9;
        this.result = str10;
        this.name = str11;
    }

    public /* synthetic */ Properties(ReactNativeInsightProperties reactNativeInsightProperties, Map map, Map map2, String str, Map map3, List list, Map map4, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : reactNativeInsightProperties, (i4 & 2) != 0 ? null : map, (i4 & 4) != 0 ? null : map2, (i4 & 8) != 0 ? null : str, (i4 & 16) != 0 ? null : map3, (i4 & 32) != 0 ? null : list, (i4 & 64) != 0 ? null : map4, (i4 & 128) != 0 ? null : str2, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : str3, (i4 & 512) != 0 ? null : str4, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : str5, (i4 & 2048) != 0 ? null : str6, (i4 & 4096) != 0 ? null : str7, (i4 & 8192) != 0 ? null : str8, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str9, (i4 & 32768) != 0 ? null : str10, (i4 & 65536) != 0 ? null : str11);
    }
}
