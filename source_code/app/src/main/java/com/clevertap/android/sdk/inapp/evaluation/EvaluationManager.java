package com.clevertap.android.sdk.inapp.evaluation;

import android.location.Location;
import androidx.appcompat.widget.P0;
import bz.h0;
import com.clevertap.android.sdk.CTXtensions;
import com.clevertap.android.sdk.Logger;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.inapp.TriggerManager;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateInAppData;
import com.clevertap.android.sdk.inapp.customtemplates.TemplatesManager;
import com.clevertap.android.sdk.inapp.store.preference.InAppStore;
import com.clevertap.android.sdk.inapp.store.preference.StoreRegistry;
import com.clevertap.android.sdk.leanplum.Constants;
import com.clevertap.android.sdk.network.EndpointId;
import com.clevertap.android.sdk.network.NetworkHeadersListener;
import com.clevertap.android.sdk.utils.Clock;
import com.clevertap.android.sdk.variables.JsonUtil;
import fe.C1714f;
import fe.C1715g;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.ab;
import kotlin.collections.x;
import kotlin.collections.y;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import s6.AbstractC2769s6;
import s6.J4;

@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\u0010!\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u000e2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017JE\u0010\u001b\u001a\u00020\u00152\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00102\u0018\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00100\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u001b\u0010\u001cJK\u0010\u001e\u001a\u00020\u00152\u001e\u0010\u0012\u001a\u001a\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00100\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010 \u001a\u00020\u00152\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b \u0010!J9\u0010$\u001a\u00020\u00152\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b$\u0010%J#\u0010*\u001a\u00020)2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020&0\u00192\u0006\u0010(\u001a\u00020\u000e¢\u0006\u0004\b*\u0010+J\u001d\u00101\u001a\u00020.2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0019H\u0001¢\u0006\u0004\b/\u00100J\u001d\u00104\u001a\u00020\u00152\f\u0010-\u001a\b\u0012\u0004\u0012\u00020,0\u0019H\u0001¢\u0006\u0004\b2\u00103JA\u0010;\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0006\u00105\u001a\u00020,2\f\u00106\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\u0014\b\u0002\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020.07H\u0001¢\u0006\u0004\b9\u0010:J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u00020=0\u00192\u0006\u0010<\u001a\u00020\"H\u0001¢\u0006\u0004\b>\u0010?J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020&0\u00192\u0006\u0010A\u001a\u00020\"H\u0000¢\u0006\u0004\bB\u0010?J#\u0010G\u001a\b\u0012\u0004\u0012\u00020\"0\u00192\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\"0\u0019H\u0000¢\u0006\u0004\bE\u0010FJ\u001f\u0010M\u001a\u00020.2\u0006\u0010H\u001a\u00020\"2\u0006\u0010J\u001a\u00020IH\u0001¢\u0006\u0004\bK\u0010LJ!\u0010S\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\u000e2\b\b\u0002\u0010P\u001a\u00020OH\u0001¢\u0006\u0004\bQ\u0010RJ!\u0010V\u001a\u00020.2\u0006\u0010H\u001a\u00020\"2\b\b\u0002\u0010P\u001a\u00020OH\u0001¢\u0006\u0004\bT\u0010UJ!\u0010Y\u001a\u0004\u0018\u00010\"2\u0006\u0010X\u001a\u00020W2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\bY\u0010ZJ'\u0010\\\u001a\u00020.2\u0006\u0010[\u001a\u00020\"2\u0006\u0010X\u001a\u00020W2\u0006\u0010J\u001a\u00020IH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020.H\u0007¢\u0006\u0004\b^\u0010_J\u000f\u0010a\u001a\u00020.H\u0001¢\u0006\u0004\b`\u0010_J\u000f\u0010c\u001a\u00020.H\u0001¢\u0006\u0004\bb\u0010_J\u0017\u0010d\u001a\u00020)2\u0006\u0010H\u001a\u00020\"H\u0002¢\u0006\u0004\bd\u0010eJ\u001f\u0010g\u001a\u00020.2\u0006\u0010f\u001a\u00020\"2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bg\u0010LJ\u001f\u0010h\u001a\u00020.2\u0006\u0010f\u001a\u00020\"2\u0006\u0010J\u001a\u00020IH\u0002¢\u0006\u0004\bh\u0010LR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010iR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010jR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010kR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010lR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010mR:\u0010q\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020p0o0n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bq\u0010r\u0012\u0004\bw\u0010_\u001a\u0004\bs\u0010t\"\u0004\bu\u0010vRH\u0010x\u001a\"\u0012\u0004\u0012\u00020\u000e\u0012\u0018\u0012\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00100o0n8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bx\u0010r\u0012\u0004\b{\u0010_\u001a\u0004\by\u0010t\"\u0004\bz\u0010vR\u0014\u0010}\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~¨\u0006\u007f"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/EvaluationManager;", "Lcom/clevertap/android/sdk/network/NetworkHeadersListener;", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "triggersMatcher", "Lcom/clevertap/android/sdk/inapp/TriggerManager;", "triggersManager", "Lcom/clevertap/android/sdk/inapp/evaluation/LimitsMatcher;", "limitsMatcher", "Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;", "storeRegistry", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "templatesManager", "<init>", "(Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;Lcom/clevertap/android/sdk/inapp/TriggerManager;Lcom/clevertap/android/sdk/inapp/evaluation/LimitsMatcher;Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;)V", "", "eventName", "", "", TriggerAdapter.KEY_EVENT_PROPERTIES, "Landroid/location/Location;", "userLocation", "Lorg/json/JSONArray;", "evaluateOnEvent", "(Ljava/lang/String;Ljava/util/Map;Landroid/location/Location;)Lorg/json/JSONArray;", "details", "", "items", "evaluateOnChargedEvent", "(Ljava/util/Map;Ljava/util/List;Landroid/location/Location;)Lorg/json/JSONArray;", "appFields", "evaluateOnUserAttributeChange", "(Ljava/util/Map;Landroid/location/Location;Ljava/util/Map;)Lorg/json/JSONArray;", "evaluateOnAppLaunchedClientSide", "(Ljava/util/Map;Landroid/location/Location;)Lorg/json/JSONArray;", "Lorg/json/JSONObject;", "appLaunchedNotifs", "evaluateOnAppLaunchedServerSide", "(Ljava/util/List;Ljava/util/Map;Landroid/location/Location;)Lorg/json/JSONArray;", "Lcom/clevertap/android/sdk/inapp/evaluation/LimitAdapter;", "listOfLimitAdapter", Column.CAMPAIGN, "", "matchWhenLimitsBeforeDisplay", "(Ljava/util/List;Ljava/lang/String;)Z", "Lcom/clevertap/android/sdk/inapp/evaluation/EventAdapter;", "events", "", "evaluateServerSide$clevertap_core_release", "(Ljava/util/List;)V", "evaluateServerSide", "evaluateClientSide$clevertap_core_release", "(Ljava/util/List;)Lorg/json/JSONArray;", "evaluateClientSide", Constants.CHARGED_EVENT_PARAM, "inappNotifs", "Lkotlin/Function1;", "clearResource", "evaluate$clevertap_core_release", "(Lcom/clevertap/android/sdk/inapp/evaluation/EventAdapter;Ljava/util/List;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "evaluate", "triggerJson", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerAdapter;", "getWhenTriggers$clevertap_core_release", "(Lorg/json/JSONObject;)Ljava/util/List;", "getWhenTriggers", "limitJSON", "getWhenLimits$clevertap_core_release", "getWhenLimits", "inApps", "sortByPriority$clevertap_core_release", "(Ljava/util/List;)Ljava/util/List;", "sortByPriority", com.clevertap.android.sdk.Constants.INAPP_KEY, "Lcom/clevertap/android/sdk/inapp/evaluation/EventType;", "eventType", "suppress$clevertap_core_release", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/inapp/evaluation/EventType;)V", "suppress", com.clevertap.android.sdk.Constants.INAPP_ID_IN_PAYLOAD, "Lcom/clevertap/android/sdk/utils/Clock;", "clock", "generateWzrkId$clevertap_core_release", "(Ljava/lang/String;Lcom/clevertap/android/sdk/utils/Clock;)Ljava/lang/String;", "generateWzrkId", "updateTTL$clevertap_core_release", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/utils/Clock;)V", "updateTTL", "Lcom/clevertap/android/sdk/network/EndpointId;", "endpointId", "onAttachHeaders", "(Lcom/clevertap/android/sdk/network/EndpointId;Lcom/clevertap/android/sdk/inapp/evaluation/EventType;)Lorg/json/JSONObject;", "allHeaders", "onSentHeaders", "(Lorg/json/JSONObject;Lcom/clevertap/android/sdk/network/EndpointId;Lcom/clevertap/android/sdk/inapp/evaluation/EventType;)V", "loadSuppressedCSAndEvaluatedSSInAppsIds", "()V", "saveEvaluatedServerSideInAppIds$clevertap_core_release", "saveEvaluatedServerSideInAppIds", "saveSuppressedClientSideInAppIds$clevertap_core_release", "saveSuppressedClientSideInAppIds", "shouldSuppress", "(Lorg/json/JSONObject;)Z", "header", "removeSentEvaluatedServerSideCampaignIds", "removeSentSuppressedClientSideInApps", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggersMatcher;", "Lcom/clevertap/android/sdk/inapp/TriggerManager;", "Lcom/clevertap/android/sdk/inapp/evaluation/LimitsMatcher;", "Lcom/clevertap/android/sdk/inapp/store/preference/StoreRegistry;", "Lcom/clevertap/android/sdk/inapp/customtemplates/TemplatesManager;", "", "", "", "evaluatedServerSideCampaignIds", "Ljava/util/Map;", "getEvaluatedServerSideCampaignIds$clevertap_core_release", "()Ljava/util/Map;", "setEvaluatedServerSideCampaignIds$clevertap_core_release", "(Ljava/util/Map;)V", "getEvaluatedServerSideCampaignIds$clevertap_core_release$annotations", "suppressedClientSideInApps", "getSuppressedClientSideInApps$clevertap_core_release", "setSuppressedClientSideInApps$clevertap_core_release", "getSuppressedClientSideInApps$clevertap_core_release$annotations", "Ljava/text/SimpleDateFormat;", "dateFormatter", "Ljava/text/SimpleDateFormat;", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EvaluationManager implements NetworkHeadersListener {

    @NotNull
    private final SimpleDateFormat dateFormatter;

    @NotNull
    private Map<String, List<Long>> evaluatedServerSideCampaignIds;

    @NotNull
    private final LimitsMatcher limitsMatcher;

    @NotNull
    private final StoreRegistry storeRegistry;

    @NotNull
    private Map<String, List<Map<String, Object>>> suppressedClientSideInApps;

    @NotNull
    private final TemplatesManager templatesManager;

    @NotNull
    private final TriggerManager triggersManager;

    @NotNull
    private final TriggersMatcher triggersMatcher;

    public EvaluationManager(@NotNull TriggersMatcher triggersMatcher, @NotNull TriggerManager triggersManager, @NotNull LimitsMatcher limitsMatcher, @NotNull StoreRegistry storeRegistry, @NotNull TemplatesManager templatesManager) {
        Intrinsics.echo(triggersMatcher, "triggersMatcher");
        Intrinsics.echo(triggersManager, "triggersManager");
        Intrinsics.echo(limitsMatcher, "limitsMatcher");
        Intrinsics.echo(storeRegistry, "storeRegistry");
        Intrinsics.echo(templatesManager, "templatesManager");
        this.triggersMatcher = triggersMatcher;
        this.triggersManager = triggersManager;
        this.limitsMatcher = limitsMatcher;
        this.storeRegistry = storeRegistry;
        this.templatesManager = templatesManager;
        this.evaluatedServerSideCampaignIds = y.tango(new Pair(com.clevertap.android.sdk.Constants.RAISED, new ArrayList()), new Pair(com.clevertap.android.sdk.Constants.PROFILE, new ArrayList()));
        this.suppressedClientSideInApps = y.tango(new Pair(com.clevertap.android.sdk.Constants.RAISED, new ArrayList()), new Pair(com.clevertap.android.sdk.Constants.PROFILE, new ArrayList()));
        this.dateFormatter = new SimpleDateFormat("yyyyMMdd", Locale.getDefault());
    }

    public static /* synthetic */ int alpha(JSONObject jSONObject) {
        return sortByPriority$lambda$15(jSONObject);
    }

    public static /* synthetic */ String bravo(JSONObject jSONObject) {
        return sortByPriority$lambda$16(jSONObject);
    }

    public static /* synthetic */ boolean charlie(long j5, long j6) {
        return removeSentEvaluatedServerSideCampaignIds$lambda$20$lambda$19(j5, j6);
    }

    public static /* synthetic */ Unit delta(String str) {
        return evaluate$lambda$11(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ List evaluate$clevertap_core_release$default(EvaluationManager evaluationManager, EventAdapter eventAdapter, List list, Function1 function1, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            function1 = new h0(21);
        }
        return evaluationManager.evaluate$clevertap_core_release(eventAdapter, list, function1);
    }

    public static final Unit evaluate$lambda$11(String it) {
        Intrinsics.echo(it, "it");
        return Unit.INSTANCE;
    }

    public static /* synthetic */ String generateWzrkId$clevertap_core_release$default(EvaluationManager evaluationManager, String str, Clock clock, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            clock = Clock.SYSTEM;
        }
        return evaluationManager.generateWzrkId$clevertap_core_release(str, clock);
    }

    public static /* synthetic */ void getEvaluatedServerSideCampaignIds$clevertap_core_release$annotations() {
    }

    public static /* synthetic */ void getSuppressedClientSideInApps$clevertap_core_release$annotations() {
    }

    private final void removeSentEvaluatedServerSideCampaignIds(JSONObject header, EventType eventType) {
        JSONArray optJSONArray = header.optJSONArray(com.clevertap.android.sdk.Constants.INAPP_SS_EVAL_META);
        int i4 = 0;
        if (optJSONArray != null) {
            int length = optJSONArray.length();
            int i5 = 0;
            while (i4 < length) {
                long optLong = optJSONArray.optLong(i4);
                if (optLong != 0) {
                    List<Long> list = this.evaluatedServerSideCampaignIds.get(eventType.getKey());
                    if (list != null) {
                        CollectionsKt.d(list, new a(optLong, 0));
                    }
                    i5 = 1;
                }
                i4++;
            }
            i4 = i5;
        }
        if (i4 != 0) {
            saveEvaluatedServerSideInAppIds$clevertap_core_release();
        }
    }

    public static final boolean removeSentEvaluatedServerSideCampaignIds$lambda$20$lambda$19(long j5, long j6) {
        return j6 == j5;
    }

    private final void removeSentSuppressedClientSideInApps(JSONObject header, EventType eventType) {
        List<Map<String, Object>> list;
        Iterator<Map<String, Object>> it;
        String str;
        JSONArray optJSONArray = header.optJSONArray(com.clevertap.android.sdk.Constants.INAPP_SUPPRESSED_META);
        boolean z2 = false;
        if (optJSONArray != null && (list = this.suppressedClientSideInApps.get(eventType.getKey())) != null && (it = list.iterator()) != null) {
            boolean z10 = false;
            while (it.hasNext()) {
                Object obj = it.next().get(com.clevertap.android.sdk.Constants.NOTIFICATION_ID_TAG);
                if (obj instanceof String) {
                    str = (String) obj;
                } else {
                    str = null;
                }
                if (str != null) {
                    String jSONArray = optJSONArray.toString();
                    Intrinsics.delta(jSONArray, "toString(...)");
                    if (StringsKt.beige(jSONArray, str, false)) {
                        it.remove();
                        z10 = true;
                    }
                }
            }
            z2 = z10;
        }
        if (z2) {
            saveSuppressedClientSideInAppIds$clevertap_core_release();
        }
    }

    private final boolean shouldSuppress(JSONObject r22) {
        return r22.optBoolean(com.clevertap.android.sdk.Constants.INAPP_SUPPRESSED);
    }

    public static final int sortByPriority$lambda$15(JSONObject inApp) {
        Intrinsics.echo(inApp, "inApp");
        return inApp.optInt(com.clevertap.android.sdk.Constants.INAPP_PRIORITY, 1);
    }

    public static final String sortByPriority$lambda$16(JSONObject inApp) {
        Intrinsics.echo(inApp, "inApp");
        return inApp.optString(com.clevertap.android.sdk.Constants.INAPP_ID_IN_PAYLOAD, String.valueOf(Clock.SYSTEM.newDate().getTime() / 1000));
    }

    public static /* synthetic */ void updateTTL$clevertap_core_release$default(EvaluationManager evaluationManager, JSONObject jSONObject, Clock clock, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            clock = Clock.SYSTEM;
        }
        evaluationManager.updateTTL$clevertap_core_release(jSONObject, clock);
    }

    @NotNull
    public final List<JSONObject> evaluate$clevertap_core_release(@NotNull EventAdapter r92, @NotNull List<? extends JSONObject> inappNotifs, @NotNull Function1<? super String, Unit> clearResource) {
        String str;
        Intrinsics.echo(r92, "event");
        Intrinsics.echo(inappNotifs, "inappNotifs");
        Intrinsics.echo(clearResource, "clearResource");
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject : inappNotifs) {
            CustomTemplateInAppData createFromJson = CustomTemplateInAppData.INSTANCE.createFromJson(jSONObject);
            if (createFromJson != null) {
                str = createFromJson.getTemplateName();
            } else {
                str = null;
            }
            if (str == null || this.templatesManager.isTemplateRegistered(str)) {
                String optString = jSONObject.optString(com.clevertap.android.sdk.Constants.INAPP_ID_IN_PAYLOAD);
                if (this.triggersMatcher.matchEvent(getWhenTriggers$clevertap_core_release(jSONObject), r92)) {
                    Logger.v("INAPP", "Triggers matched for event " + r92.getEventName() + " against inApp " + optString);
                    TriggerManager triggerManager = this.triggersManager;
                    Intrinsics.checkNotNull(optString);
                    triggerManager.increment(optString);
                    boolean matchWhenLimits = this.limitsMatcher.matchWhenLimits(getWhenLimits$clevertap_core_release(jSONObject), optString);
                    if (this.limitsMatcher.shouldDiscard(getWhenLimits$clevertap_core_release(jSONObject), optString)) {
                        clearResource.invoke("");
                    }
                    if (matchWhenLimits) {
                        Logger.v("INAPP", "Limits matched for event " + r92.getEventName() + " against inApp " + optString);
                        arrayList.add(jSONObject);
                    } else {
                        Logger.v("INAPP", "Limits did not matched for event " + r92.getEventName() + " against inApp " + optString);
                    }
                } else {
                    Logger.v("INAPP", "Triggers did not matched for event " + r92.getEventName() + " against inApp " + optString);
                }
            }
        }
        return arrayList;
    }

    @NotNull
    public final JSONArray evaluateClientSide$clevertap_core_release(@NotNull List<EventAdapter> events) {
        Intrinsics.echo(events, "events");
        ArrayList arrayList = new ArrayList();
        InAppStore inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            Iterator<T> it = events.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EventAdapter eventAdapter = (EventAdapter) it.next();
                Object obj = eventAdapter.getEventProperties().get(com.clevertap.android.sdk.Constants.KEY_OLD_VALUE);
                Object obj2 = eventAdapter.getEventProperties().get(com.clevertap.android.sdk.Constants.KEY_NEW_VALUE);
                if (obj2 == null || !Intrinsics.areEqual(obj2, obj)) {
                    JSONArray readClientSideInApps = inAppStore.readClientSideInApps();
                    ArrayList arrayList2 = new ArrayList();
                    int length = readClientSideInApps.length();
                    for (int i4 = 0; i4 < length; i4++) {
                        Object obj3 = readClientSideInApps.get(i4);
                        if (obj3 instanceof JSONObject) {
                            arrayList2.add(obj3);
                        }
                    }
                    arrayList.addAll(evaluate$clevertap_core_release$default(this, eventAdapter, arrayList2, null, 4, null));
                }
            }
            boolean z2 = false;
            for (JSONObject jSONObject : sortByPriority$clevertap_core_release(arrayList)) {
                if (!shouldSuppress(jSONObject)) {
                    if (z2) {
                        saveSuppressedClientSideInAppIds$clevertap_core_release();
                    }
                    updateTTL$clevertap_core_release$default(this, jSONObject, null, 2, null);
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(jSONObject);
                    return jSONArray;
                }
                suppress$clevertap_core_release(jSONObject, EventType.INSTANCE.fromBoolean(events.get(0).isUserAttributeChangeEvent()));
                z2 = true;
            }
            if (z2) {
                saveSuppressedClientSideInAppIds$clevertap_core_release();
            }
        }
        return new JSONArray();
    }

    @NotNull
    public final JSONArray evaluateOnAppLaunchedClientSide(@NotNull Map<String, ? extends Object> r10, @Nullable Location userLocation) {
        Intrinsics.echo(r10, "eventProperties");
        return evaluateClientSide$clevertap_core_release(ab.juliet(new EventAdapter(com.clevertap.android.sdk.Constants.APP_LAUNCHED_EVENT, r10, null, userLocation, null, 20, null)));
    }

    @NotNull
    public final JSONArray evaluateOnAppLaunchedServerSide(@NotNull List<? extends JSONObject> appLaunchedNotifs, @NotNull Map<String, ? extends Object> r11, @Nullable Location userLocation) {
        Intrinsics.echo(appLaunchedNotifs, "appLaunchedNotifs");
        Intrinsics.echo(r11, "eventProperties");
        boolean z2 = false;
        for (JSONObject jSONObject : sortByPriority$clevertap_core_release(evaluate$clevertap_core_release$default(this, new EventAdapter(com.clevertap.android.sdk.Constants.APP_LAUNCHED_EVENT, r11, null, userLocation, null, 20, null), appLaunchedNotifs, null, 4, null))) {
            if (!shouldSuppress(jSONObject)) {
                if (z2) {
                    saveSuppressedClientSideInAppIds$clevertap_core_release();
                }
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(jSONObject);
                return jSONArray;
            }
            suppress$clevertap_core_release(jSONObject, EventType.RAISED);
            z2 = true;
        }
        if (z2) {
            saveSuppressedClientSideInAppIds$clevertap_core_release();
        }
        return new JSONArray();
    }

    @NotNull
    public final JSONArray evaluateOnChargedEvent(@NotNull Map<String, ? extends Object> details, @NotNull List<? extends Map<String, ? extends Object>> items, @Nullable Location userLocation) {
        Intrinsics.echo(details, "details");
        Intrinsics.echo(items, "items");
        List<EventAdapter> juliet = ab.juliet(new EventAdapter(com.clevertap.android.sdk.Constants.CHARGED_EVENT, details, items, userLocation, null, 16, null));
        evaluateServerSide$clevertap_core_release(juliet);
        return evaluateClientSide$clevertap_core_release(juliet);
    }

    @NotNull
    public final JSONArray evaluateOnEvent(@NotNull String eventName, @NotNull Map<String, ? extends Object> r11, @Nullable Location userLocation) {
        Intrinsics.echo(eventName, "eventName");
        Intrinsics.echo(r11, "eventProperties");
        List<EventAdapter> juliet = ab.juliet(new EventAdapter(eventName, r11, null, userLocation, null, 20, null));
        evaluateServerSide$clevertap_core_release(juliet);
        return evaluateClientSide$clevertap_core_release(juliet);
    }

    @NotNull
    public final JSONArray evaluateOnUserAttributeChange(@NotNull Map<String, ? extends Map<String, ? extends Object>> r12, @Nullable Location userLocation, @NotNull Map<String, ? extends Object> appFields) {
        Intrinsics.echo(r12, "eventProperties");
        Intrinsics.echo(appFields, "appFields");
        ArrayList arrayList = new ArrayList(r12.size());
        for (Map.Entry<String, ? extends Map<String, ? extends Object>> entry : r12.entrySet()) {
            LinkedHashMap amber = y.amber(entry.getValue());
            amber.putAll(appFields);
            arrayList.add(new EventAdapter(P0.gold(new StringBuilder(), entry.getKey(), com.clevertap.android.sdk.Constants.USER_ATTRIBUTE_CHANGE), amber, null, userLocation, entry.getKey(), 4, null));
        }
        evaluateServerSide$clevertap_core_release(arrayList);
        return evaluateClientSide$clevertap_core_release(arrayList);
    }

    public final void evaluateServerSide$clevertap_core_release(@NotNull List<EventAdapter> events) {
        Intrinsics.echo(events, "events");
        ArrayList arrayList = new ArrayList();
        InAppStore inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            Iterator<EventAdapter> it = events.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                EventAdapter next = it.next();
                JSONArray readServerSideInAppsMetaData = inAppStore.readServerSideInAppsMetaData();
                ArrayList arrayList2 = new ArrayList();
                int length = readServerSideInAppsMetaData.length();
                for (int i4 = 0; i4 < length; i4++) {
                    Object obj = readServerSideInAppsMetaData.get(i4);
                    if (obj instanceof JSONObject) {
                        arrayList2.add(obj);
                    }
                }
                arrayList.addAll(evaluate$clevertap_core_release$default(this, next, arrayList2, null, 4, null));
            }
            Iterator it2 = arrayList.iterator();
            boolean z2 = false;
            while (it2.hasNext()) {
                long optLong = ((JSONObject) it2.next()).optLong(com.clevertap.android.sdk.Constants.INAPP_ID_IN_PAYLOAD);
                if (optLong != 0) {
                    List<Long> list = this.evaluatedServerSideCampaignIds.get(EventType.INSTANCE.fromBoolean(events.get(0).isUserAttributeChangeEvent()).getKey());
                    if (list != null) {
                        list.add(Long.valueOf(optLong));
                    }
                    z2 = true;
                }
            }
            if (z2) {
                saveEvaluatedServerSideInAppIds$clevertap_core_release();
            }
        }
    }

    @NotNull
    public final String generateWzrkId$clevertap_core_release(@NotNull String r22, @NotNull Clock clock) {
        Intrinsics.echo(r22, "ti");
        Intrinsics.echo(clock, "clock");
        return r22 + '_' + this.dateFormatter.format(clock.newDate());
    }

    @NotNull
    public final Map<String, List<Long>> getEvaluatedServerSideCampaignIds$clevertap_core_release() {
        return this.evaluatedServerSideCampaignIds;
    }

    @NotNull
    public final Map<String, List<Map<String, Object>>> getSuppressedClientSideInApps$clevertap_core_release() {
        return this.suppressedClientSideInApps;
    }

    @NotNull
    public final List<LimitAdapter> getWhenLimits$clevertap_core_release(@NotNull JSONObject limitJSON) {
        LimitAdapter limitAdapter;
        Intrinsics.echo(limitJSON, "limitJSON");
        JSONArray orEmptyArray = CTXtensions.orEmptyArray(limitJSON.optJSONArray(com.clevertap.android.sdk.Constants.INAPP_FC_LIMITS));
        JSONArray orEmptyArray2 = CTXtensions.orEmptyArray(limitJSON.optJSONArray(com.clevertap.android.sdk.Constants.INAPP_OCCURRENCE_LIMITS));
        ArrayList arrayList = new ArrayList();
        int length = orEmptyArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            Object obj = orEmptyArray.get(i4);
            if (obj instanceof JSONObject) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        int length2 = orEmptyArray2.length();
        for (int i5 = 0; i5 < length2; i5++) {
            Object obj2 = orEmptyArray2.get(i5);
            if (obj2 instanceof JSONObject) {
                arrayList2.add(obj2);
            }
        }
        ArrayList a6 = CollectionsKt.a(arrayList, arrayList2);
        ArrayList arrayList3 = new ArrayList();
        Iterator it = a6.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject = (JSONObject) it.next();
            if (CTXtensions.isNotNullAndEmpty(jSONObject)) {
                limitAdapter = new LimitAdapter(jSONObject);
            } else {
                limitAdapter = null;
            }
            if (limitAdapter != null) {
                arrayList3.add(limitAdapter);
            }
        }
        return arrayList3;
    }

    @NotNull
    public final List<TriggerAdapter> getWhenTriggers$clevertap_core_release(@NotNull JSONObject triggerJson) {
        JSONObject jSONObject;
        Intrinsics.echo(triggerJson, "triggerJson");
        JSONArray orEmptyArray = CTXtensions.orEmptyArray(triggerJson.optJSONArray(com.clevertap.android.sdk.Constants.INAPP_WHEN_TRIGGERS));
        C1715g hotel = J4.hotel(0, orEmptyArray.length());
        ArrayList arrayList = new ArrayList();
        Iterator it = hotel.iterator();
        while (((C1714f) it).red) {
            Object obj = orEmptyArray.get(((x) it).alpha());
            TriggerAdapter triggerAdapter = null;
            if (obj instanceof JSONObject) {
                jSONObject = (JSONObject) obj;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                triggerAdapter = new TriggerAdapter(jSONObject);
            }
            if (triggerAdapter != null) {
                arrayList.add(triggerAdapter);
            }
        }
        return arrayList;
    }

    public final void loadSuppressedCSAndEvaluatedSSInAppsIds() {
        int collectionSizeOrDefault;
        InAppStore inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            Map mapFromJson = JsonUtil.mapFromJson(inAppStore.readEvaluatedServerSideInAppIds());
            Intrinsics.checkNotNull(mapFromJson);
            LinkedHashMap linkedHashMap = new LinkedHashMap(y.quebec(mapFromJson.size()));
            for (Map.Entry entry : mapFromJson.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                Intrinsics.delta(value, "<get-value>(...)");
                Iterable iterable = (Iterable) value;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Number) it.next()).longValue()));
                }
                linkedHashMap.put(key, CollectionsKt.B(arrayList));
            }
            this.evaluatedServerSideCampaignIds.putAll(linkedHashMap);
            Map<String, List<Map<String, Object>>> map = this.suppressedClientSideInApps;
            Map<? extends String, ? extends List<Map<String, Object>>> mapFromJson2 = JsonUtil.mapFromJson(inAppStore.readSuppressedClientSideInAppIds());
            Intrinsics.delta(mapFromJson2, "mapFromJson(...)");
            map.putAll(mapFromJson2);
        }
    }

    public final boolean matchWhenLimitsBeforeDisplay(@NotNull List<LimitAdapter> listOfLimitAdapter, @NotNull String r32) {
        Intrinsics.echo(listOfLimitAdapter, "listOfLimitAdapter");
        Intrinsics.echo(r32, "campaignId");
        return this.limitsMatcher.matchWhenLimits(listOfLimitAdapter, r32);
    }

    @Override // com.clevertap.android.sdk.network.NetworkHeadersListener
    @Nullable
    public JSONObject onAttachHeaders(@NotNull EndpointId endpointId, @NotNull EventType eventType) {
        Intrinsics.echo(endpointId, "endpointId");
        Intrinsics.echo(eventType, "eventType");
        JSONObject jSONObject = new JSONObject();
        if (endpointId == EndpointId.ENDPOINT_A1) {
            List<Long> list = this.evaluatedServerSideCampaignIds.get(eventType.getKey());
            if (list != null) {
                if (list.isEmpty()) {
                    list = null;
                }
                if (list != null) {
                    jSONObject.put(com.clevertap.android.sdk.Constants.INAPP_SS_EVAL_META, JsonUtil.listToJsonArray(list));
                }
            }
            List<Map<String, Object>> list2 = this.suppressedClientSideInApps.get(eventType.getKey());
            if (list2 != null) {
                if (list2.isEmpty()) {
                    list2 = null;
                }
                if (list2 != null) {
                    jSONObject.put(com.clevertap.android.sdk.Constants.INAPP_SUPPRESSED_META, JsonUtil.listToJsonArray(list2));
                }
            }
        }
        if (!CTXtensions.isNotNullAndEmpty(jSONObject)) {
            return null;
        }
        return jSONObject;
    }

    @Override // com.clevertap.android.sdk.network.NetworkHeadersListener
    public void onSentHeaders(@NotNull JSONObject allHeaders, @NotNull EndpointId endpointId, @NotNull EventType eventType) {
        Intrinsics.echo(allHeaders, "allHeaders");
        Intrinsics.echo(endpointId, "endpointId");
        Intrinsics.echo(eventType, "eventType");
        if (endpointId == EndpointId.ENDPOINT_A1) {
            removeSentEvaluatedServerSideCampaignIds(allHeaders, eventType);
            removeSentSuppressedClientSideInApps(allHeaders, eventType);
        }
    }

    public final void saveEvaluatedServerSideInAppIds$clevertap_core_release() {
        InAppStore inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            inAppStore.storeEvaluatedServerSideInAppIds(new JSONObject(y.zulu(this.evaluatedServerSideCampaignIds)));
        }
    }

    public final void saveSuppressedClientSideInAppIds$clevertap_core_release() {
        InAppStore inAppStore = this.storeRegistry.getInAppStore();
        if (inAppStore != null) {
            inAppStore.storeSuppressedClientSideInAppIds(new JSONObject(y.zulu(this.suppressedClientSideInApps)));
        }
    }

    public final void setEvaluatedServerSideCampaignIds$clevertap_core_release(@NotNull Map<String, List<Long>> map) {
        Intrinsics.echo(map, "<set-?>");
        this.evaluatedServerSideCampaignIds = map;
    }

    public final void setSuppressedClientSideInApps$clevertap_core_release(@NotNull Map<String, List<Map<String, Object>>> map) {
        Intrinsics.echo(map, "<set-?>");
        this.suppressedClientSideInApps = map;
    }

    @NotNull
    public final List<JSONObject> sortByPriority$clevertap_core_release(@NotNull List<? extends JSONObject> inApps) {
        Intrinsics.echo(inApps, "inApps");
        final h0 h0Var = new h0(22);
        final h0 h0Var2 = new h0(23);
        final Comparator comparator = new Comparator() { // from class: com.clevertap.android.sdk.inapp.evaluation.EvaluationManager$sortByPriority$$inlined$compareByDescending$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                return AbstractC2769s6.bravo((Comparable) Function1.this.invoke((JSONObject) t10), (Comparable) Function1.this.invoke((JSONObject) t5));
            }
        };
        return CollectionsKt.p(inApps, new Comparator() { // from class: com.clevertap.android.sdk.inapp.evaluation.EvaluationManager$sortByPriority$$inlined$thenBy$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t5, T t10) {
                int compare = comparator.compare(t5, t10);
                if (compare != 0) {
                    return compare;
                }
                return AbstractC2769s6.bravo((Comparable) h0Var2.invoke((JSONObject) t5), (Comparable) h0Var2.invoke((JSONObject) t10));
            }
        });
    }

    public final void suppress$clevertap_core_release(@NotNull JSONObject r82, @NotNull EventType eventType) {
        Intrinsics.echo(r82, "inApp");
        Intrinsics.echo(eventType, "eventType");
        String optString = r82.optString(com.clevertap.android.sdk.Constants.INAPP_ID_IN_PAYLOAD);
        Intrinsics.checkNotNull(optString);
        String generateWzrkId$clevertap_core_release$default = generateWzrkId$clevertap_core_release$default(this, optString, null, 2, null);
        String optString2 = r82.optString(com.clevertap.android.sdk.Constants.INAPP_WZRK_PIVOT, "wzrk_default");
        int optInt = r82.optInt(com.clevertap.android.sdk.Constants.INAPP_WZRK_CGID);
        List<Map<String, Object>> list = this.suppressedClientSideInApps.get(eventType.getKey());
        if (list != null) {
            list.add(y.sierra(new Pair(com.clevertap.android.sdk.Constants.NOTIFICATION_ID_TAG, generateWzrkId$clevertap_core_release$default), new Pair(com.clevertap.android.sdk.Constants.INAPP_WZRK_PIVOT, optString2), new Pair(com.clevertap.android.sdk.Constants.INAPP_WZRK_CGID, Integer.valueOf(optInt))));
        }
    }

    public final void updateTTL$clevertap_core_release(@NotNull JSONObject r72, @NotNull Clock clock) {
        Long l10;
        Intrinsics.echo(r72, "inApp");
        Intrinsics.echo(clock, "clock");
        Object opt = r72.opt(com.clevertap.android.sdk.Constants.WZRK_TIME_TO_LIVE_OFFSET);
        if (opt instanceof Long) {
            l10 = (Long) opt;
        } else {
            l10 = null;
        }
        if (l10 != null) {
            r72.put("wzrk_ttl", l10.longValue() + clock.currentTimeSeconds());
        } else {
            r72.remove("wzrk_ttl");
        }
    }
}
