package com.clevertap.android.sdk.inapp.evaluation;

import com.clevertap.android.sdk.CTXtensions;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 (2\u00020\u0001:\u0001(B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003H\u0007J\u0010\u0010#\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020\u0019J\u0010\u0010%\u001a\u0004\u0018\u00010!2\u0006\u0010$\u001a\u00020\u0019J\u0010\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010$\u001a\u00020\u0019R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0011\u0010\u001e\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001b¨\u0006)"}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/TriggerAdapter;", "", "triggerJSON", "Lorg/json/JSONObject;", "<init>", "(Lorg/json/JSONObject;)V", "eventName", "", "getEventName", "()Ljava/lang/String;", "properties", "Lorg/json/JSONArray;", "getProperties", "()Lorg/json/JSONArray;", "items", "getItems", "geoRadiusArray", "getGeoRadiusArray", TriggerAdapter.KEY_PROFILE_ATTR_NAME, "getProfileAttrName", TriggerAdapter.KEY_FIRST_TIME_ONLY, "", "getFirstTimeOnly", "()Z", "propertyCount", "", "getPropertyCount", "()I", "itemsCount", "getItemsCount", "geoRadiusCount", "getGeoRadiusCount", "triggerConditionFromJSON", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerCondition;", "property", "propertyAtIndex", "index", "itemAtIndex", "geoRadiusAtIndex", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerGeoRadius;", "Companion", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TriggerAdapter {

    @NotNull
    public static final String INAPP_OPERATOR = "operator";

    @NotNull
    public static final String INAPP_PROPERTYNAME = "propertyName";

    @NotNull
    public static final String KEY_EVENT_NAME = "eventName";

    @NotNull
    public static final String KEY_EVENT_PROPERTIES = "eventProperties";

    @NotNull
    public static final String KEY_FIRST_TIME_ONLY = "firstTimeOnly";

    @NotNull
    public static final String KEY_GEO_RADIUS_PROPERTIES = "geoRadius";

    @NotNull
    public static final String KEY_ITEM_PROPERTIES = "itemProperties";

    @NotNull
    public static final String KEY_PROFILE_ATTR_NAME = "profileAttrName";

    @NotNull
    public static final String KEY_PROPERTY_VALUE = "propertyValue";

    @NotNull
    private final String eventName;
    private final boolean firstTimeOnly;

    @Nullable
    private final JSONArray geoRadiusArray;

    @Nullable
    private final JSONArray items;

    @Nullable
    private final String profileAttrName;

    @Nullable
    private final JSONArray properties;

    public TriggerAdapter(@NotNull JSONObject triggerJSON) {
        Intrinsics.echo(triggerJSON, "triggerJSON");
        String optString = triggerJSON.optString("eventName", "");
        Intrinsics.delta(optString, "optString(...)");
        this.eventName = optString;
        this.properties = triggerJSON.optJSONArray(KEY_EVENT_PROPERTIES);
        this.items = triggerJSON.optJSONArray(KEY_ITEM_PROPERTIES);
        this.geoRadiusArray = triggerJSON.optJSONArray(KEY_GEO_RADIUS_PROPERTIES);
        this.profileAttrName = triggerJSON.optString(KEY_PROFILE_ATTR_NAME, null);
        this.firstTimeOnly = triggerJSON.optBoolean(KEY_FIRST_TIME_ONLY, false);
    }

    @Nullable
    public final TriggerGeoRadius geoRadiusAtIndex(int index) {
        JSONArray jSONArray;
        JSONObject optJSONObject;
        if (CTXtensions.isInvalidIndex(this.geoRadiusArray, index) || (jSONArray = this.geoRadiusArray) == null || (optJSONObject = jSONArray.optJSONObject(index)) == null) {
            return null;
        }
        return new TriggerGeoRadius(optJSONObject.optDouble("lat"), optJSONObject.optDouble("lng"), optJSONObject.optDouble("rad"));
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    public final boolean getFirstTimeOnly() {
        return this.firstTimeOnly;
    }

    @Nullable
    public final JSONArray getGeoRadiusArray() {
        return this.geoRadiusArray;
    }

    public final int getGeoRadiusCount() {
        JSONArray jSONArray = this.geoRadiusArray;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @Nullable
    public final JSONArray getItems() {
        return this.items;
    }

    public final int getItemsCount() {
        JSONArray jSONArray = this.items;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @Nullable
    public final String getProfileAttrName() {
        return this.profileAttrName;
    }

    @Nullable
    public final JSONArray getProperties() {
        return this.properties;
    }

    public final int getPropertyCount() {
        JSONArray jSONArray = this.properties;
        if (jSONArray != null) {
            return jSONArray.length();
        }
        return 0;
    }

    @Nullable
    public final TriggerCondition itemAtIndex(int index) {
        JSONArray jSONArray;
        JSONObject optJSONObject;
        if (CTXtensions.isInvalidIndex(this.items, index) || (jSONArray = this.items) == null || (optJSONObject = jSONArray.optJSONObject(index)) == null) {
            return null;
        }
        return triggerConditionFromJSON(optJSONObject);
    }

    @Nullable
    public final TriggerCondition propertyAtIndex(int index) {
        JSONArray jSONArray;
        JSONObject optJSONObject;
        if (CTXtensions.isInvalidIndex(this.properties, index) || (jSONArray = this.properties) == null || (optJSONObject = jSONArray.optJSONObject(index)) == null) {
            return null;
        }
        return triggerConditionFromJSON(optJSONObject);
    }

    @NotNull
    public final TriggerCondition triggerConditionFromJSON(@NotNull JSONObject property) {
        Intrinsics.echo(property, "property");
        TriggerValue triggerValue = new TriggerValue(property.opt(KEY_PROPERTY_VALUE), null, 2, null);
        TriggerOperator optTriggerOperator = TriggerAdapterKt.optTriggerOperator(property, INAPP_OPERATOR);
        String optString = property.optString(INAPP_PROPERTYNAME, "");
        Intrinsics.delta(optString, "optString(...)");
        return new TriggerCondition(optString, optTriggerOperator, triggerValue);
    }
}
