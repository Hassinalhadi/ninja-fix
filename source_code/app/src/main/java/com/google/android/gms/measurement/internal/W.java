package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.text.TextUtils;
import com.checkout.components.redirecthandler.customtab.RedirectCustomTabEventLogger;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import delivery.samurai.android.R;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;

/* loaded from: classes2.dex */
public abstract class W {
    public static final String[] alpha = {"ad_activeview", "ad_click", "ad_exposure", "ad_query", "ad_reward", "adunit_exposure", "app_clear_data", "app_exception", "app_remove", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "app_upgrade", "app_update", "ga_campaign", RedirectCustomTabEventLogger.RESULT_ERROR, "first_open", "first_visit", "in_app_purchase", "notification_dismiss", "notification_foreground", "notification_open", "notification_receive", "os_update", "session_start", "session_start_with_rollout", "user_engagement", "ad_impression", "screen_view", "ga_extra_parameter", "app_background", "firebase_campaign"};
    public static final String[] bravo = {"ad_impression"};
    public static final String[] charlie = {"_aa", "_ac", "_xa", "_aq", "_ar", "_xu", "_cd", "_ae", "_ui", "app_store_refund", "app_store_subscription_cancel", "app_store_subscription_convert", "app_store_subscription_renew", "_ug", "_au", "_cmp", "_err", "_f", "_v", "_iap", "_nd", "_nf", "_no", "_nr", "_ou", "_s", "_ssr", "_e", "_ai", "_vs", "_ep", "_ab", "_cmp"};
    public static final String[] delta = {"purchase", "refund", "add_payment_info", "add_shipping_info", "add_to_cart", "add_to_wishlist", "begin_checkout", "remove_from_cart", "select_item", "select_promotion", "view_cart", "view_item", "view_item_list", "view_promotion", "ecommerce_purchase", "purchase_refund", "set_checkout_option", "checkout_progress", "select_content", "view_search_results"};
    public static final String[] echo = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_buyer_stage", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] foxtrot = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_cbs", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] golf = {"items"};
    public static final String[] hotel = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_cbs", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static final String[] india = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
    public static final String[] juliet = {"_ln", "_fot", "_fvt", "_ldl", Column.ID, "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    public static r6.u kilo;

    public static Object alpha(Bundle bundle, String str, Class cls, Object obj) {
        Object obj2 = bundle.get(str);
        if (obj2 == null) {
            return obj;
        }
        if (cls.isAssignableFrom(obj2.getClass())) {
            return obj2;
        }
        String canonicalName = cls.getCanonicalName();
        throw new IllegalStateException(androidx.appcompat.widget.P0.gold(av.q.india("Invalid conditional user property field type. '", str, "' expected [", canonicalName, "] but was ["), obj2.getClass().getCanonicalName(), Constants.AES_SUFFIX));
    }

    public static String bravo(Context context) {
        try {
            return context.getResources().getResourcePackageName(R.string.common_google_play_services_unknown_issue);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0024, code lost:
    
        if (r0 == false) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void charlie(ar arVar, SQLiteDatabase sQLiteDatabase, String str, String str2, String str3, String[] strArr) {
        Throwable th;
        Cursor cursor;
        if (arVar != null) {
            ?? r32 = 0;
            try {
                try {
                    cursor = sQLiteDatabase.query("SQLITE_MASTER", new String[]{"name"}, "name=?", new String[]{str}, null, null, null);
                    try {
                        boolean moveToFirst = cursor.moveToFirst();
                        cursor.close();
                    } catch (SQLiteException e) {
                        e = e;
                        arVar.f7632b.charlie(str, e, "Error querying for table");
                        if (cursor != null) {
                            cursor.close();
                        }
                        sQLiteDatabase.execSQL(str2);
                        try {
                            HashSet hashSet = new HashSet();
                            Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT * FROM " + str + " LIMIT 0", null);
                            try {
                                Collections.addAll(hashSet, rawQuery.getColumnNames());
                                rawQuery.close();
                                for (String str4 : str3.split(Constants.SEPARATOR_COMMA)) {
                                    if (!hashSet.remove(str4)) {
                                        throw new SQLiteException("Table " + str + " is missing required column: " + str4);
                                    }
                                }
                                if (strArr != null) {
                                    for (int i4 = 0; i4 < strArr.length; i4 += 2) {
                                        if (!hashSet.remove(strArr[i4])) {
                                            sQLiteDatabase.execSQL(strArr[i4 + 1]);
                                        }
                                    }
                                }
                                if (!hashSet.isEmpty()) {
                                    arVar.f7632b.charlie(str, TextUtils.join(", ", hashSet), "Table has extra columns. table, columns");
                                }
                            } catch (Throwable th2) {
                                rawQuery.close();
                                throw th2;
                            }
                        } catch (SQLiteException e4) {
                            arVar.white.bravo(str, "Failed to verify columns on table that was just created");
                            throw e4;
                        }
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r32 = str2;
                    if (r32 == 0) {
                        r32.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (SQLiteException e5) {
                e = e5;
                cursor = null;
            } catch (Throwable th4) {
                th = th4;
                if (r32 == 0) {
                }
            }
        } else {
            throw new IllegalArgumentException("Monitor must not be null");
        }
    }

    public static String delta(String str, String[] strArr, String[] strArr2) {
        int min = Math.min(strArr.length, strArr2.length);
        for (int i4 = 0; i4 < min; i4++) {
            String str2 = strArr[i4];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i4];
            }
        }
        return null;
    }

    public static void echo(Bundle bundle, Object obj) {
        if (obj instanceof Double) {
            bundle.putDouble("value", ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            bundle.putLong("value", ((Long) obj).longValue());
        } else {
            bundle.putString("value", obj.toString());
        }
    }

    public static void foxtrot(ar arVar, SQLiteDatabase sQLiteDatabase) {
        if (arVar != null) {
            File file = new File(sQLiteDatabase.getPath());
            boolean readable = file.setReadable(false, false);
            a4.j jVar = arVar.f7632b;
            if (!readable) {
                jVar.alpha("Failed to turn off database read permission");
            }
            if (!file.setWritable(false, false)) {
                jVar.alpha("Failed to turn off database write permission");
            }
            if (!file.setReadable(true, true)) {
                jVar.alpha("Failed to turn on database read permission for owner");
            }
            if (!file.setWritable(true, true)) {
                jVar.alpha("Failed to turn on database write permission for owner");
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Monitor must not be null");
    }

    public static String golf(Context context, String str) {
        V5.x.hotel(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str)) {
            str = bravo(context);
        }
        int identifier = resources.getIdentifier("google_app_id", CTVariableUtils.STRING, str);
        if (identifier != 0) {
            try {
                return resources.getString(identifier);
            } catch (Resources.NotFoundException unused) {
                return null;
            }
        }
        return null;
    }
}
