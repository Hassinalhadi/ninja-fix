package com.clevertap.android.sdk.leanplum;

import android.content.Context;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.Logger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0007J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007J*\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J4\u0010\u0011\u001a\u00020\u000b2\b\u0010\u0012\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0007J\u001e\u0010\u0019\u001a\u00020\u000b2\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\u0015H\u0007J \u0010\u001a\u001a\u00020\u000b2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J*\u0010\u001a\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\t2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J\u0012\u0010\u001d\u001a\u00020\u000b2\b\u0010\u001c\u001a\u0004\u0018\u00010\tH\u0007J\u0012\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\tH\u0007J\u001a\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!H\u0007J\u001c\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007J*\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J2\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J$\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!2\b\u0010\u0013\u001a\u0004\u0018\u00010\tH\u0007J<\u0010\u001e\u001a\u00020\u000b2\b\u0010\u001f\u001a\u0004\u0018\u00010\t2\u0006\u0010 \u001a\u00020!2\b\u0010\u0013\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J8\u0010\"\u001a\u00020\u000b2\b\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\tH\u0007JH\u0010\"\u001a\u00020\u000b2\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007JZ\u0010\"\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\t2\b\u0010#\u001a\u0004\u0018\u00010\t2\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\t2\b\u0010'\u001a\u0004\u0018\u00010\t2\b\u0010(\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007J:\u0010*\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010 \u001a\u00020!2\b\u0010&\u001a\u0004\u0018\u00010\t2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0015H\u0007R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006+"}, d2 = {"Lcom/clevertap/android/sdk/leanplum/LeanplumCT;", "", "<init>", "()V", "wrapper", "Lcom/clevertap/android/sdk/leanplum/CTWrapper;", "getWrapper", "()Lcom/clevertap/android/sdk/leanplum/CTWrapper;", "getPurchaseEventName", "", "initWithContext", "", "context", "Landroid/content/Context;", "initWithInstance", "cleverTapInstance", "Lcom/clevertap/android/sdk/CleverTapAPI;", "advanceTo", "state", Constants.INFO_PARAM, "params", "", "setLogLevel", "logLevel", "Lcom/clevertap/android/sdk/CleverTapAPI$LogLevel;", "setTrafficSourceInfo", "setUserAttributes", "attributes", "userId", "setUserId", "track", Constants.CHARGED_EVENT_PARAM, "value", "", "trackGooglePlayPurchase", Constants.IAP_ITEM_PARAM, "priceMicros", "", Constants.CURRENCY_CODE_PARAM, "purchaseData", "dataSignature", "eventName", "trackPurchase", "clevertap-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LeanplumCT {

    @NotNull
    public static final LeanplumCT INSTANCE = new LeanplumCT();

    @Nullable
    private static CTWrapper wrapper;

    private LeanplumCT() {
    }

    public static final void advanceTo(@Nullable String state) {
        advanceTo(state, null, null);
    }

    @NotNull
    public static final String getPurchaseEventName() {
        return "Purchase";
    }

    private final CTWrapper getWrapper() {
        if (wrapper == null) {
            Logger.i("LeanplumCT", "Please initialize LeanplumCT before using it.");
        }
        return wrapper;
    }

    public static final void initWithContext(@Nullable Context context) {
        if (context != null) {
            wrapper = new CTWrapper(new CleverTapProvider(context));
        }
    }

    public static final void initWithInstance(@Nullable CleverTapAPI cleverTapInstance) {
        if (cleverTapInstance != null) {
            wrapper = new CTWrapper(new CleverTapProvider(cleverTapInstance));
        }
    }

    public static final void setLogLevel(@NotNull CleverTapAPI.LogLevel logLevel) {
        Intrinsics.echo(logLevel, "logLevel");
        CleverTapAPI.setDebugLevel(logLevel);
    }

    public static final void setTrafficSourceInfo(@Nullable Map<String, String> info) {
        CTWrapper wrapper2;
        if (info != null && (wrapper2 = INSTANCE.getWrapper()) != null) {
            wrapper2.setTrafficSourceInfo(info);
        }
    }

    public static final void setUserAttributes(@Nullable Map<String, ? extends Object> attributes) {
        CTWrapper wrapper2 = INSTANCE.getWrapper();
        if (wrapper2 != null) {
            wrapper2.setUserAttributes(attributes);
        }
    }

    public static final void setUserId(@Nullable String userId) {
        CTWrapper wrapper2 = INSTANCE.getWrapper();
        if (wrapper2 != null) {
            wrapper2.setUserId(userId);
        }
    }

    public static final void track(@Nullable String event) {
        track(event, 0.0d, null, null);
    }

    public static final void trackGooglePlayPurchase(@Nullable String item, long priceMicros, @Nullable String currencyCode, @Nullable String purchaseData, @Nullable String dataSignature) {
        trackGooglePlayPurchase(getPurchaseEventName(), item, priceMicros, currencyCode, purchaseData, dataSignature, null);
    }

    public static final void trackPurchase(@NotNull String event, double value, @Nullable String currencyCode, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.echo(event, "event");
        CTWrapper wrapper2 = INSTANCE.getWrapper();
        if (wrapper2 != null) {
            wrapper2.trackPurchase(event, value, currencyCode, params);
        }
    }

    public static final void advanceTo(@Nullable String state, @Nullable String info) {
        advanceTo(state, info, null);
    }

    public static final void setUserAttributes(@Nullable String userId, @Nullable Map<String, ? extends Object> attributes) {
        if (userId != null) {
            setUserId(userId);
        }
        setUserAttributes(attributes);
    }

    public static final void track(@Nullable String event, double value) {
        track(event, value, null, null);
    }

    public static final void advanceTo(@Nullable String state, @Nullable Map<String, ? extends Object> params) {
        advanceTo(state, null, params);
    }

    public static final void track(@Nullable String event, @Nullable String info) {
        track(event, 0.0d, info, null);
    }

    public static final void trackGooglePlayPurchase(@NotNull String item, long priceMicros, @NotNull String currencyCode, @NotNull String purchaseData, @NotNull String dataSignature, @Nullable Map<String, ? extends Object> params) {
        Intrinsics.echo(item, "item");
        Intrinsics.echo(currencyCode, "currencyCode");
        Intrinsics.echo(purchaseData, "purchaseData");
        Intrinsics.echo(dataSignature, "dataSignature");
        trackGooglePlayPurchase(getPurchaseEventName(), item, priceMicros, currencyCode, purchaseData, dataSignature, params);
    }

    public static final void advanceTo(@Nullable String state, @Nullable String info, @Nullable Map<String, ? extends Object> params) {
        CTWrapper wrapper2 = INSTANCE.getWrapper();
        if (wrapper2 != null) {
            wrapper2.advanceTo(state, info, params);
        }
    }

    public static final void track(@Nullable String event, @Nullable Map<String, ? extends Object> params) {
        track(event, 0.0d, null, params);
    }

    public static final void track(@Nullable String event, double value, @Nullable Map<String, ? extends Object> params) {
        track(event, value, null, params);
    }

    public static final void trackGooglePlayPurchase(@Nullable String eventName, @Nullable String item, long priceMicros, @Nullable String currencyCode, @Nullable String purchaseData, @Nullable String dataSignature, @Nullable Map<String, ? extends Object> params) {
        if (eventName != null && eventName.length() != 0) {
            CTWrapper wrapper2 = INSTANCE.getWrapper();
            if (wrapper2 != null) {
                wrapper2.trackGooglePlayPurchase(eventName, item, priceMicros / 1000000.0d, currencyCode, purchaseData, dataSignature, params);
                return;
            }
            return;
        }
        Logger.i("LeanplumCT", "Failed to call trackGooglePlayPurchase, event name is null");
    }

    public static final void track(@Nullable String event, double value, @Nullable String info) {
        track(event, value, info, null);
    }

    public static final void track(@Nullable String event, double value, @Nullable String info, @Nullable Map<String, ? extends Object> params) {
        CTWrapper wrapper2 = INSTANCE.getWrapper();
        if (wrapper2 != null) {
            wrapper2.track(event, value, info, params);
        }
    }
}
