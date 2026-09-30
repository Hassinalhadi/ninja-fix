package com.google.android.gms.measurement;

import A6.a;
import A6.b;
import A6.c;
import V5.x;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.zzdh;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.InterfaceC1461o0;
import com.google.android.gms.measurement.internal.W;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {
    public static volatile AppMeasurement bravo;
    public final c alpha;

    /* loaded from: classes2.dex */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;
    }

    public AppMeasurement(G g2) {
        this.alpha = new a(g2);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        if (bravo == null) {
            synchronized (AppMeasurement.class) {
                if (bravo == null) {
                    InterfaceC1461o0 interfaceC1461o0 = (InterfaceC1461o0) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (interfaceC1461o0 != null) {
                        bravo = new AppMeasurement(interfaceC1461o0);
                    } else {
                        bravo = new AppMeasurement(G.lima(context, new zzdh(0L, 0L, true, null, null, null, null, null), null));
                    }
                }
            }
        }
        return bravo;
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.alpha.golf(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.alpha.hotel(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.alpha.india(str);
    }

    @Keep
    public long generateEventId() {
        return this.alpha.zzb();
    }

    @Keep
    public String getAppInstanceId() {
        return this.alpha.alpha();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.measurement.AppMeasurement$ConditionalUserProperty, java.lang.Object] */
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        int size;
        List<Bundle> charlie = this.alpha.charlie(str, str2);
        if (charlie == null) {
            size = 0;
        } else {
            size = charlie.size();
        }
        ArrayList arrayList = new ArrayList(size);
        for (Bundle bundle : charlie) {
            ?? obj = new Object();
            x.hotel(bundle);
            obj.mAppId = (String) W.alpha(bundle, "app_id", String.class, null);
            obj.mOrigin = (String) W.alpha(bundle, "origin", String.class, null);
            obj.mName = (String) W.alpha(bundle, "name", String.class, null);
            obj.mValue = W.alpha(bundle, "value", Object.class, null);
            obj.mTriggerEventName = (String) W.alpha(bundle, "trigger_event_name", String.class, null);
            obj.mTriggerTimeout = ((Long) W.alpha(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            obj.mTimedOutEventName = (String) W.alpha(bundle, "timed_out_event_name", String.class, null);
            obj.mTimedOutEventParams = (Bundle) W.alpha(bundle, "timed_out_event_params", Bundle.class, null);
            obj.mTriggeredEventName = (String) W.alpha(bundle, "triggered_event_name", String.class, null);
            obj.mTriggeredEventParams = (Bundle) W.alpha(bundle, "triggered_event_params", Bundle.class, null);
            obj.mTimeToLive = ((Long) W.alpha(bundle, "time_to_live", Long.class, 0L)).longValue();
            obj.mExpiredEventName = (String) W.alpha(bundle, "expired_event_name", String.class, null);
            obj.mExpiredEventParams = (Bundle) W.alpha(bundle, "expired_event_params", Bundle.class, null);
            obj.mActive = ((Boolean) W.alpha(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            obj.mCreationTimestamp = ((Long) W.alpha(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            obj.mTriggeredTimestamp = ((Long) W.alpha(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(obj);
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.alpha.bravo();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.alpha.kilo();
    }

    @Keep
    public String getGmpAppId() {
        return this.alpha.lima();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.alpha.juliet(str);
    }

    @Keep
    public Map<String, Object> getUserProperties(String str, String str2, boolean z2) {
        return this.alpha.delta(str, str2, z2);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.alpha.foxtrot(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        x.hotel(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            W.echo(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.alpha.echo(bundle);
    }

    public AppMeasurement(InterfaceC1461o0 interfaceC1461o0) {
        this.alpha = new b(interfaceC1461o0);
    }
}
