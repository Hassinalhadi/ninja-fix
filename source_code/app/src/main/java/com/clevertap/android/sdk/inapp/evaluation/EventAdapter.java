package com.clevertap.android.sdk.inapp.evaluation;

import android.location.Location;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.Utils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.y;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0003J\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00072\u0006\u0010\u001a\u001a\u00020\u0003J\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0017\u0010\u001f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u0003H\u0001¢\u0006\u0002\b J\u0012\u0010!\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001a\u001a\u00020\u0003H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R%\u0010\u0006\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010¨\u0006\""}, d2 = {"Lcom/clevertap/android/sdk/inapp/evaluation/EventAdapter;", "", "eventName", "", TriggerAdapter.KEY_EVENT_PROPERTIES, "", "items", "", "userLocation", "Landroid/location/Location;", TriggerAdapter.KEY_PROFILE_ATTR_NAME, "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;Landroid/location/Location;Ljava/lang/String;)V", "getEventName", "()Ljava/lang/String;", "getEventProperties", "()Ljava/util/Map;", "getItems", "()Ljava/util/List;", "getUserLocation", "()Landroid/location/Location;", "getProfileAttrName", "systemPropToKey", "getSystemPropToKey$clevertap_core_release", "getPropertyValue", "Lcom/clevertap/android/sdk/inapp/evaluation/TriggerValue;", TriggerAdapter.INAPP_PROPERTYNAME, "getItemValue", "isChargedEvent", "", "isUserAttributeChangeEvent", "getActualPropertyValue", "getActualPropertyValue$clevertap_core_release", "evaluateActualPropertyValue", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class EventAdapter {

    @NotNull
    private final String eventName;

    @NotNull
    private final Map<String, Object> eventProperties;

    @NotNull
    private final List<Map<String, Object>> items;

    @Nullable
    private final String profileAttrName;

    @NotNull
    private final Map<String, String> systemPropToKey;

    @Nullable
    private final Location userLocation;

    /* JADX WARN: Multi-variable type inference failed */
    public EventAdapter(@NotNull String eventName, @NotNull Map<String, ? extends Object> eventProperties, @NotNull List<? extends Map<String, ? extends Object>> items, @Nullable Location location, @Nullable String str) {
        Intrinsics.echo(eventName, "eventName");
        Intrinsics.echo(eventProperties, "eventProperties");
        Intrinsics.echo(items, "items");
        this.eventName = eventName;
        this.eventProperties = eventProperties;
        this.items = items;
        this.userLocation = location;
        this.profileAttrName = str;
        this.systemPropToKey = y.sierra(new Pair("CT App Version", Constants.CLTAP_APP_VERSION), new Pair("ct_app_version", Constants.CLTAP_APP_VERSION), new Pair("CT Latitude", Constants.CLTAP_LATITUDE), new Pair("ct_latitude", Constants.CLTAP_LATITUDE), new Pair("CT Longitude", Constants.CLTAP_LONGITUDE), new Pair("ct_longitude", Constants.CLTAP_LONGITUDE), new Pair("CT OS Version", Constants.CLTAP_OS_VERSION), new Pair("ct_os_version", Constants.CLTAP_OS_VERSION), new Pair("CT SDK Version", Constants.CLTAP_SDK_VERSION), new Pair("ct_sdk_version", Constants.CLTAP_SDK_VERSION), new Pair("CT Network Carrier", Constants.CLTAP_CARRIER), new Pair("ct_network_carrier", Constants.CLTAP_CARRIER), new Pair("CT Network Type", Constants.CLTAP_NETWORK_TYPE), new Pair("ct_network_type", Constants.CLTAP_NETWORK_TYPE), new Pair("CT Connected To WiFi", Constants.CLTAP_CONNECTED_TO_WIFI), new Pair("ct_connected_to_wifi", Constants.CLTAP_CONNECTED_TO_WIFI), new Pair("CT Bluetooth Version", Constants.CLTAP_BLUETOOTH_VERSION), new Pair("ct_bluetooth_version", Constants.CLTAP_BLUETOOTH_VERSION), new Pair("CT Bluetooth Enabled", Constants.CLTAP_BLUETOOTH_ENABLED), new Pair("ct_bluetooth_enabled", Constants.CLTAP_BLUETOOTH_ENABLED), new Pair("CT App Name", "appnId"));
    }

    private final Object evaluateActualPropertyValue(String propertyName) {
        Object obj = this.eventProperties.get(propertyName);
        if (obj == null) {
            obj = this.eventProperties.get(Utils.getNormalizedName(propertyName));
        }
        if (obj == null) {
            Map<String, Object> map = this.eventProperties;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                arrayList.add(new Pair(Utils.getNormalizedName(entry.getKey()), entry.getValue()));
            }
            return y.yankee(arrayList).get(Utils.getNormalizedName(propertyName));
        }
        return obj;
    }

    @Nullable
    public final Object getActualPropertyValue$clevertap_core_release(@NotNull String propertyName) {
        Intrinsics.echo(propertyName, "propertyName");
        Object evaluateActualPropertyValue = evaluateActualPropertyValue(propertyName);
        if (evaluateActualPropertyValue == null) {
            switch (propertyName.hashCode()) {
                case -543370741:
                    if (propertyName.equals(Constants.CLTAP_PROP_CAMPAIGN_ID)) {
                        return evaluateActualPropertyValue(Constants.NOTIFICATION_ID_TAG);
                    }
                    break;
                case 1035561631:
                    if (propertyName.equals(Constants.INAPP_WZRK_PIVOT)) {
                        return evaluateActualPropertyValue(Constants.CLTAP_PROP_VARIANT);
                    }
                    break;
                case 1840075742:
                    if (propertyName.equals(Constants.NOTIFICATION_ID_TAG)) {
                        return evaluateActualPropertyValue(Constants.CLTAP_PROP_CAMPAIGN_ID);
                    }
                    break;
                case 1901439077:
                    if (propertyName.equals(Constants.CLTAP_PROP_VARIANT)) {
                        return evaluateActualPropertyValue(Constants.INAPP_WZRK_PIVOT);
                    }
                    break;
            }
            String str = this.systemPropToKey.get(propertyName);
            if (str != null) {
                return evaluateActualPropertyValue(str);
            }
            return null;
        }
        return evaluateActualPropertyValue;
    }

    @NotNull
    public final String getEventName() {
        return this.eventName;
    }

    @NotNull
    public final Map<String, Object> getEventProperties() {
        return this.eventProperties;
    }

    @NotNull
    public final List<TriggerValue> getItemValue(@NotNull String propertyName) {
        int collectionSizeOrDefault;
        Intrinsics.echo(propertyName, "propertyName");
        ArrayList emerald = CollectionsKt.emerald(this.items);
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(emerald, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = emerald.iterator();
        while (it.hasNext()) {
            Map map = (Map) it.next();
            Object obj = map.get(propertyName);
            if (obj == null) {
                obj = map.get(Utils.getNormalizedName(propertyName));
            }
            if (obj == null) {
                ArrayList arrayList2 = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    arrayList2.add(new Pair(Utils.getNormalizedName((String) entry.getKey()), entry.getValue()));
                }
                obj = y.yankee(arrayList2).get(Utils.getNormalizedName(propertyName));
            }
            arrayList.add(new TriggerValue(obj, null, 2, null));
        }
        ArrayList arrayList3 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if (((TriggerValue) next).getValue() != null) {
                arrayList3.add(next);
            }
        }
        return arrayList3;
    }

    @NotNull
    public final List<Map<String, Object>> getItems() {
        return this.items;
    }

    @Nullable
    public final String getProfileAttrName() {
        return this.profileAttrName;
    }

    @NotNull
    public final TriggerValue getPropertyValue(@NotNull String propertyName) {
        Intrinsics.echo(propertyName, "propertyName");
        return new TriggerValue(getActualPropertyValue$clevertap_core_release(propertyName), null, 2, null);
    }

    @NotNull
    public final Map<String, String> getSystemPropToKey$clevertap_core_release() {
        return this.systemPropToKey;
    }

    @Nullable
    public final Location getUserLocation() {
        return this.userLocation;
    }

    public final boolean isChargedEvent() {
        return Intrinsics.areEqual(this.eventName, Constants.CHARGED_EVENT);
    }

    public final boolean isUserAttributeChangeEvent() {
        if (this.profileAttrName != null) {
            return true;
        }
        return false;
    }

    public /* synthetic */ EventAdapter(String str, Map map, List list, Location location, String str2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, (i4 & 4) != 0 ? CollectionsKt.emptyList() : list, (i4 & 8) != 0 ? null : location, (i4 & 16) != 0 ? null : str2);
    }
}
