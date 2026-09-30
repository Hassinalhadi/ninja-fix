package com.clevertap.android.sdk;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Location;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import ao.ad;
import com.clevertap.android.sdk.events.EventGroup;
import com.clevertap.android.sdk.task.CTExecutorFactory;
import f1.ac;
import j1.C1929c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import s1.a0;
import s1.al;
import s1.au;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a\u0011\u0010\n\u001a\u00020\u0003*\u00020\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a'\u0010\u000f\u001a\u0004\u0018\u00010\u0006*\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a+\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001b\u0010\u0019\u001a\u00020\u0003*\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001c\u001a\u00020\u0003*\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0013\u0010\u001e\u001a\u00020\u0017*\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u001e\u0010\u001f\u001a\"\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!\"\u0006\b\u0000\u0010 \u0018\u0001*\u00020\u0017H\u0086\b¢\u0006\u0004\b\"\u0010#\u001a3\u0010&\u001a\u00020\u0014\"\u0006\b\u0000\u0010 \u0018\u0001*\u00020\u00172\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140$H\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010'\u001a'\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170**\u00020(2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,\u001a'\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00170**\u00020(2\u0006\u0010)\u001a\u00020\u0006¢\u0006\u0004\b-\u0010,\u001a\u0019\u0010/\u001a\u00020\u0014*\u00020(2\u0006\u0010.\u001a\u00020(¢\u0006\u0004\b/\u00100\u001a\u0011\u00101\u001a\u00020(*\u00020(¢\u0006\u0004\b1\u00102\u001a\u0013\u00103\u001a\u00020\u0003*\u0004\u0018\u00010(¢\u0006\u0004\b3\u00104\u001a)\u00106\u001a\u0004\u0018\u00010\u0006*\u0004\u0018\u00010\u00062\b\u0010.\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u00105\u001a\u00020\u0006¢\u0006\u0004\b6\u00107\u001a\u0011\u00109\u001a\u00020\u0003*\u000208¢\u0006\u0004\b9\u0010:\u001a\u0015\u0010;\u001a\u0004\u0018\u00010(*\u0004\u0018\u00010\u0006¢\u0006\u0004\b;\u0010<\u001a$\u0010=\u001a\u00020\u0003*\u0004\u0018\u00010\u0006\u0082\u0002\u000e\n\f\b\u0000\u0012\u0002\u0018\u0000\u001a\u0004\b\u0003\u0010\u0000¢\u0006\u0004\b=\u0010>\u001a+\u0010D\u001a\u00020\u0014*\u00020?2\u0018\u0010C\u001a\u0014\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u00140@¢\u0006\u0004\bD\u0010E\"\u0015\u0010H\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bF\u0010G\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006I"}, d2 = {"Landroid/content/Context;", "", "apiLevel", "", "isPackageAndOsTargetsAbove", "(Landroid/content/Context;I)Z", "", "channelId", "isNotificationChannelEnabled", "(Landroid/content/Context;Ljava/lang/String;)Z", "areAppNotificationsEnabled", "(Landroid/content/Context;)Z", "Landroid/app/NotificationManager;", "msgChannel", "context", "getOrCreateChannel", "(Landroid/app/NotificationManager;Ljava/lang/String;Landroid/content/Context;)Ljava/lang/String;", "Lcom/clevertap/android/sdk/CleverTapAPI;", "logTag", "caller", "", "flushPushImpressionsOnPostAsyncSafely", "(Lcom/clevertap/android/sdk/CleverTapAPI;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V", "Lorg/json/JSONArray;", "index", "isInvalidIndex", "(Lorg/json/JSONArray;I)Z", "Landroid/content/SharedPreferences;", "hasData", "(Landroid/content/SharedPreferences;)Z", "orEmptyArray", "(Lorg/json/JSONArray;)Lorg/json/JSONArray;", "T", "", "toList", "(Lorg/json/JSONArray;)Ljava/util/List;", "Lkotlin/Function1;", "foreach", "iterator", "(Lorg/json/JSONArray;Lkotlin/jvm/functions/Function1;)V", "Lorg/json/JSONObject;", Constants.KEY_KEY, "Lkotlin/Pair;", "safeGetJSONArrayOrNullIfEmpty", "(Lorg/json/JSONObject;Ljava/lang/String;)Lkotlin/Pair;", "safeGetJSONArray", "other", "copyFrom", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)V", Constants.COPY_TYPE, "(Lorg/json/JSONObject;)Lorg/json/JSONObject;", "isNotNullAndEmpty", "(Lorg/json/JSONObject;)Z", "separator", "concatIfNotNull", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/location/Location;", "isValid", "(Landroid/location/Location;)Z", "toJsonOrNull", "(Ljava/lang/String;)Lorg/json/JSONObject;", "isNotNullAndBlank", "(Ljava/lang/String;)Z", "Landroid/view/View;", "Lkotlin/Function2;", "Lj1/c;", "Landroid/view/ViewGroup$MarginLayoutParams;", "marginAdjuster", "applyInsetsWithMarginAdjustment", "(Landroid/view/View;LXd/l;)V", "getTargetSdkVersion", "(Landroid/content/Context;)I", "targetSdkVersion", "clevertap-core_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CTXtensions {
    public static final void applyInsetsWithMarginAdjustment(@NotNull View view, @NotNull Xd.l marginAdjuster) {
        Intrinsics.echo(view, "<this>");
        Intrinsics.echo(marginAdjuster, "marginAdjuster");
        h hVar = new h(marginAdjuster);
        WeakHashMap weakHashMap = au.alpha;
        al.lima(view, hVar);
    }

    public static final a0 applyInsetsWithMarginAdjustment$lambda$6(Xd.l marginAdjuster, View v4, a0 insets) {
        Intrinsics.echo(marginAdjuster, "$marginAdjuster");
        Intrinsics.echo(v4, "v");
        Intrinsics.echo(insets, "insets");
        C1929c golf = insets.alpha.golf(647);
        Intrinsics.delta(golf, "getInsets(...)");
        ViewGroup.LayoutParams layoutParams = v4.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginAdjuster.invoke(golf, marginLayoutParams);
            v4.setLayoutParams(marginLayoutParams);
            return a0.bravo;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final boolean areAppNotificationsEnabled(@NotNull Context context) {
        Intrinsics.echo(context, "<this>");
        try {
            return new ac(context).alpha();
        } catch (Exception e) {
            Logger.d("Unable to query notifications enabled flag, returning true!");
            e.printStackTrace();
            return true;
        }
    }

    @Nullable
    public static final String concatIfNotNull(@Nullable String str, @Nullable String str2, @NotNull String separator) {
        Intrinsics.echo(separator, "separator");
        if (str != null && str2 != null) {
            return ad.amber(str, separator, str2);
        }
        if (str == null) {
            return str2;
        }
        return str;
    }

    public static /* synthetic */ String concatIfNotNull$default(String str, String str2, String str3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            str3 = "";
        }
        return concatIfNotNull(str, str2, str3);
    }

    @NotNull
    public static final JSONObject copy(@NotNull JSONObject jSONObject) {
        Intrinsics.echo(jSONObject, "<this>");
        JSONObject jSONObject2 = new JSONObject();
        copyFrom(jSONObject2, jSONObject);
        return jSONObject2;
    }

    public static final void copyFrom(@NotNull JSONObject jSONObject, @NotNull JSONObject other) {
        Intrinsics.echo(jSONObject, "<this>");
        Intrinsics.echo(other, "other");
        Iterator<String> keys = other.keys();
        Intrinsics.delta(keys, "keys(...)");
        while (keys.hasNext()) {
            String next = keys.next();
            jSONObject.put(next, other.opt(next));
        }
    }

    public static final void flushPushImpressionsOnPostAsyncSafely(@NotNull CleverTapAPI cleverTapAPI, @NotNull String logTag, @NotNull String caller, @NotNull Context context) {
        Intrinsics.echo(cleverTapAPI, "<this>");
        Intrinsics.echo(logTag, "logTag");
        Intrinsics.echo(caller, "caller");
        Intrinsics.echo(context, "context");
        try {
            CTExecutorFactory.executors(cleverTapAPI.getCoreState().getConfig()).postAsyncSafelyTask().submit(logTag, new g(cleverTapAPI, context, caller, logTag)).get();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static final Void flushPushImpressionsOnPostAsyncSafely$lambda$1(CleverTapAPI this_flushPushImpressionsOnPostAsyncSafely, Context context, String caller, String logTag) {
        Intrinsics.echo(this_flushPushImpressionsOnPostAsyncSafely, "$this_flushPushImpressionsOnPostAsyncSafely");
        Intrinsics.echo(context, "$context");
        Intrinsics.echo(caller, "$caller");
        Intrinsics.echo(logTag, "$logTag");
        try {
            this_flushPushImpressionsOnPostAsyncSafely.getCoreState().getBaseEventQueueManager().flushQueueSync(context, EventGroup.PUSH_NOTIFICATION_VIEWED, caller);
            return null;
        } catch (Exception unused) {
            Logger.d(logTag, "failed to flush push impressions on ct instance = " + this_flushPushImpressionsOnPostAsyncSafely.getCoreState().getConfig().getAccountId());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0050 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String getOrCreateChannel(@NotNull NotificationManager notificationManager, @Nullable String str, @NotNull Context context) {
        NotificationChannel notificationChannel;
        NotificationChannel notificationChannel2;
        String str2;
        NotificationChannel notificationChannel3;
        Intrinsics.echo(notificationManager, "<this>");
        Intrinsics.echo(context, "context");
        if (str != null) {
            try {
                if (str.length() != 0) {
                    notificationChannel = notificationManager.getNotificationChannel(str);
                    if (notificationChannel != null) {
                        return str;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return null;
            }
        }
        String devDefaultPushChannelId = ManifestInfo.getInstance(context).getDevDefaultPushChannelId();
        if (devDefaultPushChannelId != null && devDefaultPushChannelId.length() != 0) {
            notificationChannel3 = notificationManager.getNotificationChannel(devDefaultPushChannelId);
            if (notificationChannel3 != null) {
                return devDefaultPushChannelId;
            }
        }
        if (devDefaultPushChannelId != null && devDefaultPushChannelId.length() != 0) {
            Logger.d(Constants.CLEVERTAP_LOG_TAG, "Notification Channel set in AndroidManifest.xml has not been created by the app.");
            notificationChannel2 = notificationManager.getNotificationChannel(Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_ID);
            if (notificationChannel2 != null) {
                try {
                    str2 = context.getString(R.string.ct_fcm_fallback_notification_channel_label);
                } catch (Exception unused) {
                    str2 = Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_NAME;
                }
                Intrinsics.checkNotNull(str2);
                androidx.camera.camera2.internal.compat.a.lima();
                NotificationChannel foxtrot = androidx.camera.camera2.internal.compat.a.foxtrot(str2);
                Logger.d(Constants.CLEVERTAP_LOG_TAG, "created default channel: " + foxtrot);
                notificationManager.createNotificationChannel(foxtrot);
                return Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_ID;
            }
            return Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_ID;
        }
        Logger.d(Constants.CLEVERTAP_LOG_TAG, "Missing Default CleverTap Notification Channel metadata in AndroidManifest.");
        notificationChannel2 = notificationManager.getNotificationChannel(Constants.FCM_FALLBACK_NOTIFICATION_CHANNEL_ID);
        if (notificationChannel2 != null) {
        }
    }

    public static final int getTargetSdkVersion(@NotNull Context context) {
        Intrinsics.echo(context, "<this>");
        return context.getApplicationContext().getApplicationInfo().targetSdkVersion;
    }

    public static final boolean hasData(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.echo(sharedPreferences, "<this>");
        Intrinsics.delta(sharedPreferences.getAll(), "getAll(...)");
        return !r1.isEmpty();
    }

    public static final boolean isInvalidIndex(@Nullable JSONArray jSONArray, int i4) {
        if (jSONArray != null && i4 >= 0 && i4 < jSONArray.length()) {
            return false;
        }
        return true;
    }

    public static final boolean isNotNullAndBlank(@Nullable String str) {
        boolean z2;
        if (str != null && !StringsKt.gray(str)) {
            z2 = false;
        } else {
            z2 = true;
        }
        return !z2;
    }

    public static final boolean isNotNullAndEmpty(@Nullable JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() > 0) {
            return true;
        }
        return false;
    }

    public static final boolean isNotificationChannelEnabled(@NotNull Context context, @NotNull String channelId) {
        NotificationChannel notificationChannel;
        int importance;
        Intrinsics.echo(context, "<this>");
        Intrinsics.echo(channelId, "channelId");
        if (Build.VERSION.SDK_INT >= 26) {
            if (areAppNotificationsEnabled(context)) {
                try {
                    Object systemService = context.getSystemService("notification");
                    Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
                    notificationChannel = ((NotificationManager) systemService).getNotificationChannel(channelId);
                    importance = notificationChannel.getImportance();
                    if (importance != 0) {
                        return true;
                    }
                    return false;
                } catch (Exception unused) {
                    Logger.d("Unable to find notification channel with id = ".concat(channelId));
                    return false;
                }
            }
            return false;
        }
        return areAppNotificationsEnabled(context);
    }

    public static final boolean isPackageAndOsTargetsAbove(@NotNull Context context, int i4) {
        Intrinsics.echo(context, "<this>");
        if (Build.VERSION.SDK_INT > i4 && getTargetSdkVersion(context) > i4) {
            return true;
        }
        return false;
    }

    public static final boolean isValid(@NotNull Location location) {
        Intrinsics.echo(location, "<this>");
        double latitude = location.getLatitude();
        if (-90.0d <= latitude && latitude <= 90.0d) {
            double longitude = location.getLongitude();
            if (-180.0d <= longitude && longitude <= 180.0d) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final /* synthetic */ <T> void iterator(JSONArray jSONArray, Function1<? super T, Unit> foreach) {
        Intrinsics.echo(jSONArray, "<this>");
        Intrinsics.echo(foreach, "foreach");
        if (jSONArray.length() <= 0) {
            return;
        }
        jSONArray.get(0);
        Intrinsics.juliet();
        throw null;
    }

    @NotNull
    public static final JSONArray orEmptyArray(@Nullable JSONArray jSONArray) {
        if (jSONArray == null) {
            return new JSONArray();
        }
        return jSONArray;
    }

    @NotNull
    public static final Pair<Boolean, JSONArray> safeGetJSONArray(@NotNull JSONObject jSONObject, @NotNull String key) {
        boolean z2;
        Intrinsics.echo(jSONObject, "<this>");
        Intrinsics.echo(key, "key");
        JSONArray optJSONArray = jSONObject.optJSONArray(key);
        if (optJSONArray == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (optJSONArray.length() >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        if (optJSONArray.length() < 0) {
            optJSONArray = null;
        }
        return new Pair<>(valueOf, optJSONArray);
    }

    @NotNull
    public static final Pair<Boolean, JSONArray> safeGetJSONArrayOrNullIfEmpty(@NotNull JSONObject jSONObject, @NotNull String key) {
        boolean z2;
        Intrinsics.echo(jSONObject, "<this>");
        Intrinsics.echo(key, "key");
        JSONArray optJSONArray = jSONObject.optJSONArray(key);
        if (optJSONArray == null) {
            return new Pair<>(Boolean.FALSE, null);
        }
        if (optJSONArray.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Boolean valueOf = Boolean.valueOf(z2);
        if (optJSONArray.length() <= 0) {
            optJSONArray = null;
        }
        return new Pair<>(valueOf, optJSONArray);
    }

    @Nullable
    public static final JSONObject toJsonOrNull(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static final /* synthetic */ <T> List<T> toList(JSONArray jSONArray) {
        Intrinsics.echo(jSONArray, "<this>");
        ArrayList arrayList = new ArrayList();
        if (jSONArray.length() <= 0) {
            return arrayList;
        }
        jSONArray.get(0);
        Intrinsics.juliet();
        throw null;
    }
}
