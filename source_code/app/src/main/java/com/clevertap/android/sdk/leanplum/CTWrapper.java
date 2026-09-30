package com.clevertap.android.sdk.leanplum;

import av.q;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\f\n\u0002\u0010&\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tJ:\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010J8\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010JV\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\t2\b\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\t2\b\u0010\u0016\u001a\u0004\u0018\u00010\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010J2\u0010\u0017\u001a\u00020\u00072\b\u0010\u0018\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010J\u001e\u0010\u0019\u001a\u00020\u00072\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0010J \u0010\u001b\u001a\u0004\u0018\u00010\u00012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u001dH\u0002J\u001a\u0010\u001e\u001a\u00020\u00072\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/clevertap/android/sdk/leanplum/CTWrapper;", "", "ctProvider", "Lcom/clevertap/android/sdk/leanplum/CleverTapProvider;", "<init>", "(Lcom/clevertap/android/sdk/leanplum/CleverTapProvider;)V", "setUserId", "", "userId", "", "track", Constants.CHARGED_EVENT_PARAM, "value", "", Constants.INFO_PARAM, "params", "", "trackPurchase", Constants.CURRENCY_CODE_PARAM, "trackGooglePlayPurchase", Constants.IAP_ITEM_PARAM, "purchaseData", "dataSignature", "advanceTo", "state", "setUserAttributes", "attributes", "mapNotSupportedValues", "entry", "", "setTrafficSourceInfo", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTWrapper {

    @NotNull
    private final CleverTapProvider ctProvider;

    public CTWrapper(@NotNull CleverTapProvider ctProvider) {
        Intrinsics.echo(ctProvider, "ctProvider");
        this.ctProvider = ctProvider;
    }

    private final Object mapNotSupportedValues(Map.Entry<String, ? extends Object> entry) {
        Object value = entry.getValue();
        if (value instanceof Iterable) {
            return CollectionsKt.maroon(CollectionsKt.emerald((Iterable) value), com.clevertap.android.sdk.Constants.SEPARATOR_COMMA, com.clevertap.android.sdk.Constants.AES_PREFIX, com.clevertap.android.sdk.Constants.AES_SUFFIX, null, 56);
        }
        if (value instanceof Byte) {
            return Integer.valueOf(((Number) value).byteValue());
        }
        if (value instanceof Short) {
            return Integer.valueOf(((Number) value).shortValue());
        }
        return value;
    }

    public final void advanceTo(@Nullable String state, @Nullable String info, @Nullable Map<String, ? extends Object> params) {
        LinkedHashMap linkedHashMap;
        if (state != null) {
            String concat = Constants.STATE_PREFIX.concat(state);
            if (params != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(y.quebec(params.size()));
                for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), mapNotSupportedValues(entry));
                }
                linkedHashMap = y.amber(linkedHashMap2);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            if (info != null) {
                linkedHashMap.put(Constants.INFO_PARAM, info);
            }
            Logger.d("CTWrapper", "advance(...) will call pushEvent with " + concat + " and " + linkedHashMap);
            CleverTapAPI cleverTap = this.ctProvider.getCleverTap();
            if (cleverTap != null) {
                cleverTap.pushEvent(concat, linkedHashMap);
            }
        }
    }

    public final void setTrafficSourceInfo(@NotNull Map<String, String> info) {
        Intrinsics.echo(info, "info");
        String str = info.get("publisherName");
        String str2 = info.get("publisherSubPublisher");
        String str3 = info.get("publisherSubCampaign");
        StringBuilder india = q.india("setTrafficSourceInfo will call pushInstallReferrer with ", str, ", ", str2, ", and ");
        india.append(str3);
        Logger.d("CTWrapper", india.toString());
        CleverTapAPI cleverTap = this.ctProvider.getCleverTap();
        if (cleverTap != null) {
            cleverTap.pushInstallReferrer(str, str2, str3);
        }
    }

    public final void setUserAttributes(@Nullable Map<String, ? extends Object> attributes) {
        if (attributes != null && !attributes.isEmpty()) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry : attributes.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(y.quebec(linkedHashMap.size()));
            for (Map.Entry<String, ? extends Object> entry2 : linkedHashMap.entrySet()) {
                linkedHashMap2.put(entry2.getKey(), mapNotSupportedValues(entry2));
            }
            Logger.d("CTWrapper", "setUserAttributes will call pushProfile with " + linkedHashMap2);
            CleverTapAPI cleverTap = this.ctProvider.getCleverTap();
            if (cleverTap != null) {
                cleverTap.pushProfile(linkedHashMap2);
            }
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry<String, ? extends Object> entry3 : attributes.entrySet()) {
                if (entry3.getValue() == null) {
                    linkedHashMap3.put(entry3.getKey(), entry3.getValue());
                }
            }
            for (Map.Entry entry4 : linkedHashMap3.entrySet()) {
                Logger.d("CTWrapper", "setUserAttributes will call removeValueForKey with " + ((String) entry4.getKey()));
                CleverTapAPI cleverTap2 = this.ctProvider.getCleverTap();
                if (cleverTap2 != null) {
                    cleverTap2.removeValueForKey((String) entry4.getKey());
                }
            }
        }
    }

    public final void setUserId(@Nullable String userId) {
        if (userId != null && userId.length() != 0) {
            Map<String, Object> romeo = y.romeo(new Pair("Identity", userId));
            Logger.d("CTWrapper", "setUserId will call onUserLogin with " + romeo);
            CleverTapAPI cleverTap = this.ctProvider.getCleverTap();
            if (cleverTap != null) {
                cleverTap.onUserLogin(romeo);
            }
        }
    }

    public final void track(@Nullable String event, double value, @Nullable String info, @Nullable Map<String, ? extends Object> params) {
        LinkedHashMap linkedHashMap;
        if (event != null) {
            if (params != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(y.quebec(params.size()));
                for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                    linkedHashMap2.put(entry.getKey(), mapNotSupportedValues(entry));
                }
                linkedHashMap = y.amber(linkedHashMap2);
            } else {
                linkedHashMap = new LinkedHashMap();
            }
            linkedHashMap.put("value", Double.valueOf(value));
            if (info != null) {
                linkedHashMap.put(Constants.INFO_PARAM, info);
            }
            Logger.d("CTWrapper", "track(...) will call pushEvent with " + event + " and " + linkedHashMap);
            CleverTapAPI cleverTap = this.ctProvider.getCleverTap();
            if (cleverTap != null) {
                cleverTap.pushEvent(event, linkedHashMap);
            }
        }
    }

    public final void trackGooglePlayPurchase(@NotNull String event, @Nullable String item, double value, @Nullable String currencyCode, @Nullable String purchaseData, @Nullable String dataSignature, @Nullable Map<String, ? extends Object> params) {
        LinkedHashMap linkedHashMap;
        Intrinsics.echo(event, "event");
        if (params != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(y.quebec(params.size()));
            for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                linkedHashMap2.put(entry.getKey(), mapNotSupportedValues(entry));
            }
            linkedHashMap = y.amber(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        HashMap<String, Object> hashMap = new HashMap<>(linkedHashMap);
        hashMap.put(Constants.CHARGED_EVENT_PARAM, event);
        hashMap.put("value", Double.valueOf(value));
        hashMap.put(Constants.CURRENCY_CODE_PARAM, currencyCode);
        hashMap.put(Constants.GP_PURCHASE_DATA_PARAM, purchaseData);
        hashMap.put(Constants.GP_PURCHASE_DATA_SIGNATURE_PARAM, dataSignature);
        hashMap.put(Constants.IAP_ITEM_PARAM, item);
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        Logger.d("CTWrapper", "trackGooglePlayPurchase will call pushChargedEvent with " + hashMap + " and " + arrayList);
        CleverTapAPI cleverTap = this.ctProvider.getCleverTap();
        if (cleverTap != null) {
            cleverTap.pushChargedEvent(hashMap, arrayList);
        }
    }

    public final void trackPurchase(@NotNull String event, double value, @Nullable String currencyCode, @Nullable Map<String, ? extends Object> params) {
        LinkedHashMap linkedHashMap;
        Intrinsics.echo(event, "event");
        if (params != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(y.quebec(params.size()));
            for (Map.Entry<String, ? extends Object> entry : params.entrySet()) {
                linkedHashMap2.put(entry.getKey(), mapNotSupportedValues(entry));
            }
            linkedHashMap = y.amber(linkedHashMap2);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        HashMap<String, Object> hashMap = new HashMap<>(linkedHashMap);
        hashMap.put(Constants.CHARGED_EVENT_PARAM, event);
        hashMap.put("value", Double.valueOf(value));
        if (currencyCode != null) {
            hashMap.put(Constants.CURRENCY_CODE_PARAM, currencyCode);
        }
        ArrayList<HashMap<String, Object>> arrayList = new ArrayList<>();
        Logger.d("CTWrapper", "trackPurchase will call pushChargedEvent with " + hashMap + " and " + arrayList);
        CleverTapAPI cleverTap = this.ctProvider.getCleverTap();
        if (cleverTap != null) {
            cleverTap.pushChargedEvent(hashMap, arrayList);
        }
    }
}
