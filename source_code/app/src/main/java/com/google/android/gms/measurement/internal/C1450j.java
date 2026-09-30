package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.recyclerview.widget.C0665j;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.internal.measurement.C1379u0;
import com.google.android.gms.internal.measurement.C1383v0;
import com.google.android.gms.internal.measurement.C1395y0;
import com.google.android.gms.internal.measurement.D1;
import e6.C1629a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.j, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1450j extends U0 {
    public final C1448i silver;
    public final C0665j teal;
    public static final String[] white = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};
    public static final String[] yellow = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* renamed from: a, reason: collision with root package name */
    public static final String[] f7665a = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f7666b = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;"};

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f7667c = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: d, reason: collision with root package name */
    public static final String[] f7668d = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};
    public static final String[] e = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f7669f = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f7670g = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f7671h = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f7672i = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public C1450j(Z0 z02) {
        super(z02);
        this.teal = new C0665j(((G) this.alpha).f7511g);
        ((G) this.alpha).getClass();
        this.silver = new C1448i(this, ((G) this.alpha).alpha);
    }

    public static final String F0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return "";
        }
        return ao.ad.gray(" AND (upload_type IN (", TextUtils.join(", ", arrayList), "))");
    }

    public static final void M0(ContentValues contentValues, Object obj) {
        V5.x.echo("value");
        V5.x.hotel(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (obj instanceof Double) {
                contentValues.put("value", (Double) obj);
                return;
            }
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    public final String A0() {
        ((G) this.alpha).f7511g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        Long l10 = (Long) ac.lime.alpha(null);
        l10.getClass();
        return av.q.golf("(", "(upload_type = 1 AND ABS(creation_timestamp - " + currentTimeMillis + ") > " + l10 + ")", " OR ", Q0.c.mike(((Long) ac.lavender.alpha(null)).longValue(), ")", Q0.c.uniform("(upload_type != 1 AND ABS(creation_timestamp - ", currentTimeMillis, ") > ")), ")");
    }

    public final String B0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                cursor = S0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    String string = cursor.getString(0);
                    cursor.close();
                    return string;
                }
                cursor.close();
                return "";
            } catch (SQLiteException e4) {
                ar arVar = ((G) this.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.charlie(str, e4, "Database error");
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final void C0(String str, String str2) {
        V5.x.echo(str2);
        W();
        X();
        try {
            S0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e4) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.white.charlie(ar.e0(str2), e4, "Error deleting snapshot. appId");
        }
    }

    public final void D0(String str, C1460o c1460o) {
        Long l10;
        G g2 = (G) this.alpha;
        V5.x.hotel(c1460o);
        W();
        X();
        ContentValues contentValues = new ContentValues();
        String str2 = c1460o.alpha;
        contentValues.put("app_id", str2);
        contentValues.put("name", c1460o.bravo);
        contentValues.put("lifetime_count", Long.valueOf(c1460o.charlie));
        contentValues.put("current_bundle_count", Long.valueOf(c1460o.delta));
        contentValues.put("last_fire_timestamp", Long.valueOf(c1460o.foxtrot));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c1460o.golf));
        contentValues.put("last_bundled_day", c1460o.hotel);
        contentValues.put("last_sampled_complex_event_id", c1460o.india);
        contentValues.put("last_sampling_rate", c1460o.juliet);
        contentValues.put("current_session_count", Long.valueOf(c1460o.echo));
        Boolean bool = c1460o.kilo;
        if (bool != null && bool.booleanValue()) {
            l10 = 1L;
        } else {
            l10 = null;
        }
        contentValues.put("last_exempt_from_sampling", l10);
        try {
            if (S0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.white.bravo(ar.e0(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e4) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.white.charlie(ar.e0(str2), e4, "Error storing event aggregates. appId");
        }
    }

    public final void E0(ContentValues contentValues) {
        G g2 = (G) this.alpha;
        try {
            SQLiteDatabase S02 = S0();
            if (contentValues.getAsString("app_id") == null) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7631a.bravo(ar.e0("app_id"), "Value of the primary key is not set.");
            } else if (S02.update("consent_settings", contentValues, "app_id = ?", new String[]{r4}) == 0 && S02.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.charlie(ar.e0("consent_settings"), ar.e0("app_id"), "Failed to insert/update table (got -1). key");
            }
        } catch (SQLiteException e4) {
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            arVar3.white.delta("Error storing into table. key", ar.e0("consent_settings"), ar.e0("app_id"), e4);
        }
    }

    public final void G0(String str, zzov zzovVar) {
        W();
        X();
        V5.x.echo(str);
        G g2 = (G) this.alpha;
        g2.f7511g.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        ab abVar = ac.f7608n;
        long longValue = currentTimeMillis - ((Long) abVar.alpha(null)).longValue();
        long j5 = zzovVar.purple;
        ar arVar = g2.f7507b;
        if (j5 < longValue || j5 > ((Long) abVar.alpha(null)).longValue() + currentTimeMillis) {
            G.foxtrot(arVar);
            arVar.f7632b.delta("Storing trigger URI outside of the max retention time span. appId, now, timestamp", ar.e0(str), Long.valueOf(currentTimeMillis), Long.valueOf(j5));
        }
        G.foxtrot(arVar);
        arVar.f7636g.alpha("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzovVar.alpha);
        contentValues.put("source", Integer.valueOf(zzovVar.red));
        contentValues.put("timestamp_millis", Long.valueOf(j5));
        try {
            if (S0().insert("trigger_uris", null, contentValues) == -1) {
                G.foxtrot(arVar);
                arVar.white.bravo(ar.e0(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e4) {
            G.foxtrot(arVar);
            arVar.white.charlie(ar.e0(str), e4, "Error storing trigger URI. appId");
        }
    }

    public final boolean H0() {
        return ((G) this.alpha).alpha.getDatabasePath("google_app_measurement.db").exists();
    }

    public final void I0(String str, Long l10, long j5, C1383v0 c1383v0) {
        W();
        X();
        V5.x.hotel(c1383v0);
        V5.x.echo(str);
        byte[] charlie = c1383v0.charlie();
        G g2 = (G) this.alpha;
        ar arVar = g2.f7507b;
        ar arVar2 = g2.f7507b;
        G.foxtrot(arVar);
        arVar.f7636g.charlie(g2.f7510f.delta(str), Integer.valueOf(charlie.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j5));
        contentValues.put("main_event", charlie);
        try {
            if (S0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                G.foxtrot(arVar2);
                arVar2.white.bravo(ar.e0(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e4) {
            G.foxtrot(arVar2);
            arVar2.white.charlie(ar.e0(str), e4, "Error storing complex main event. appId");
        }
    }

    public final boolean J0(zzai zzaiVar) {
        W();
        X();
        String str = zzaiVar.alpha;
        V5.x.hotel(str);
        c1 c12 = c1(str, zzaiVar.red.purple);
        G g2 = (G) this.alpha;
        if (c12 == null) {
            long N02 = N0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            g2.getClass();
            if (N02 >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzaiVar.purple);
        contentValues.put("name", zzaiVar.red.purple);
        Object o5 = zzaiVar.red.o();
        V5.x.hotel(o5);
        M0(contentValues, o5);
        contentValues.put("active", Boolean.valueOf(zzaiVar.teal));
        contentValues.put("trigger_event_name", zzaiVar.white);
        contentValues.put("trigger_timeout", Long.valueOf(zzaiVar.f7693a));
        d1 d1Var = g2.e;
        ar arVar = g2.f7507b;
        G.delta(d1Var);
        contentValues.put("timed_out_event", d1.X0(zzaiVar.yellow));
        contentValues.put("creation_timestamp", Long.valueOf(zzaiVar.silver));
        G.delta(g2.e);
        contentValues.put("triggered_event", d1.X0(zzaiVar.f7694b));
        contentValues.put("triggered_timestamp", Long.valueOf(zzaiVar.red.red));
        contentValues.put("time_to_live", Long.valueOf(zzaiVar.f7695c));
        contentValues.put("expired_event", d1.X0(zzaiVar.f7696d));
        try {
            if (S0().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                G.foxtrot(arVar);
                arVar.white.bravo(ar.e0(str), "Failed to insert/update conditional user property (got -1)");
                return true;
            }
            return true;
        } catch (SQLiteException e4) {
            G.foxtrot(arVar);
            arVar.white.charlie(ar.e0(str), e4, "Error storing conditional user property");
            return true;
        }
    }

    public final boolean K0(c1 c1Var) {
        W();
        X();
        String str = c1Var.alpha;
        String str2 = c1Var.charlie;
        c1 c12 = c1(str, str2);
        G g2 = (G) this.alpha;
        String str3 = c1Var.bravo;
        if (c12 == null) {
            if (d1.R0(str2)) {
                if (N0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= Math.max(Math.min(g2.yellow.c0(str, ac.navy), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long N02 = N0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                g2.getClass();
                if (N02 >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(c1Var.delta));
        M0(contentValues, c1Var.echo);
        try {
            if (S0().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.white.bravo(ar.e0(str), "Failed to insert/update user property (got -1). appId");
                return true;
            }
            return true;
        } catch (SQLiteException e4) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.white.charlie(ar.e0(str), e4, "Error storing user property. appId");
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01e1 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void L0(String str, long j5, long j6, C2.d dVar) {
        String str2;
        String str3;
        SQLiteDatabase S02;
        String str4;
        String[] strArr;
        String string;
        String str5;
        String[] strArr2;
        String[] strArr3;
        G g2 = (G) this.alpha;
        W();
        X();
        Cursor cursor = null;
        try {
            try {
                S02 = S0();
                str4 = "";
            } catch (SQLiteException e4) {
                e = e4;
                str2 = str;
            }
            if (TextUtils.isEmpty(str)) {
                if (j6 != -1) {
                    strArr3 = new String[]{String.valueOf(j6), String.valueOf(j5)};
                } else {
                    strArr3 = new String[]{String.valueOf(j5)};
                }
                if (j6 != -1) {
                    str4 = "rowid <= ? and ";
                }
                cursor = S02.rawQuery("select app_id, metadata_fingerprint from raw_events where " + str4 + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", strArr3);
                try {
                } catch (SQLiteException e5) {
                    e = e5;
                    str3 = str;
                }
                if (cursor.moveToFirst()) {
                    str3 = cursor.getString(0);
                    try {
                        string = cursor.getString(1);
                        cursor.close();
                    } catch (SQLiteException e10) {
                        e = e10;
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.white.charlie(ar.e0(str3), e, "Data loss. Error selecting raw event. appId");
                    }
                } else if (cursor != null) {
                    return;
                } else {
                    return;
                }
            } else {
                try {
                    if (j6 != -1) {
                        str2 = str;
                        strArr = new String[]{str2, String.valueOf(j6)};
                    } else {
                        str2 = str;
                        strArr = new String[]{str2};
                    }
                    if (j6 != -1) {
                        str4 = " and rowid <= ?";
                    }
                    cursor = S02.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + str4 + " order by rowid limit 1;", strArr);
                } catch (SQLiteException e11) {
                    e = e11;
                    str3 = str2;
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(ar.e0(str3), e, "Data loss. Error selecting raw event. appId");
                }
                if (cursor.moveToFirst()) {
                    string = cursor.getString(0);
                    cursor.close();
                    str3 = str2;
                }
            }
            cursor = S02.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, string}, null, null, "rowid", "2");
            if (!cursor.moveToFirst()) {
                ar arVar3 = g2.f7507b;
                G.foxtrot(arVar3);
                arVar3.white.bravo(ar.e0(str3), "Raw event metadata record is missing. appId");
            } else {
                try {
                    com.google.android.gms.internal.measurement.D0 d02 = (com.google.android.gms.internal.measurement.D0) ((com.google.android.gms.internal.measurement.C0) au.C0(com.google.android.gms.internal.measurement.D0.c1(), cursor.getBlob(0))).echo();
                    if (cursor.moveToNext()) {
                        ar arVar4 = g2.f7507b;
                        G.foxtrot(arVar4);
                        arVar4.f7632b.bravo(ar.e0(str3), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursor.close();
                    dVar.purple = d02;
                    if (j6 != -1) {
                        str5 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        strArr2 = new String[]{str3, string, String.valueOf(j6)};
                    } else {
                        str5 = "app_id = ? and metadata_fingerprint = ?";
                        strArr2 = new String[]{str3, string};
                    }
                    cursor = S02.query("raw_events", new String[]{"rowid", "name", "timestamp", Column.DATA}, str5, strArr2, null, null, "rowid", null);
                    if (!cursor.moveToFirst()) {
                        ar arVar5 = g2.f7507b;
                        G.foxtrot(arVar5);
                        arVar5.f7632b.bravo(ar.e0(str3), "Raw event data disappeared while in transaction. appId");
                    }
                    do {
                        long j7 = cursor.getLong(0);
                        try {
                            C1379u0 c1379u0 = (C1379u0) au.C0(C1383v0.romeo(), cursor.getBlob(3));
                            String string2 = cursor.getString(1);
                            c1379u0.golf();
                            C1383v0.zulu((C1383v0) c1379u0.purple, string2);
                            long j10 = cursor.getLong(2);
                            c1379u0.golf();
                            C1383v0.beige(j10, (C1383v0) c1379u0.purple);
                            if (!dVar.echo(j7, (C1383v0) c1379u0.echo())) {
                                break;
                            }
                        } catch (IOException e12) {
                            ar arVar6 = g2.f7507b;
                            G.foxtrot(arVar6);
                            arVar6.white.charlie(ar.e0(str3), e12, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursor.moveToNext());
                } catch (IOException e13) {
                    ar arVar7 = g2.f7507b;
                    G.foxtrot(arVar7);
                    arVar7.white.charlie(ar.e0(str3), e13, "Data loss. Failed to merge raw event metadata. appId");
                }
            }
        } finally {
            if (0 != 0) {
                cursor.close();
            }
        }
    }

    public final long N0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = S0().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j5 = rawQuery.getLong(0);
                    rawQuery.close();
                    return j5;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e4) {
                ar arVar = ((G) this.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.charlie(str, e4, "Database error");
                throw e4;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long O0(String str, String[] strArr, long j5) {
        Cursor cursor = null;
        try {
            try {
                cursor = S0().rawQuery(str, strArr);
                if (cursor.moveToFirst()) {
                    j5 = cursor.getLong(0);
                }
                cursor.close();
                return j5;
            } catch (SQLiteException e4) {
                ar arVar = ((G) this.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.charlie(str, e4, "Database error");
                throw e4;
            }
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    public final long P0(String str, com.google.android.gms.internal.measurement.B0 b02, String str2, Map map, EnumC1472u0 enumC1472u0, Long l10) {
        long j5;
        int delete;
        W();
        X();
        V5.x.hotel(b02);
        V5.x.echo(str);
        G g2 = (G) this.alpha;
        if (g2.yellow.j0(null, ac.f7565F)) {
            W();
            X();
            boolean H02 = H0();
            C1629a c1629a = g2.f7511g;
            ar arVar = g2.f7507b;
            if (!H02) {
                j5 = -1;
            } else {
                Z0 z02 = this.purple;
                long alpha = z02.f7539b.white.alpha();
                c1629a.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                j5 = -1;
                if (Math.abs(elapsedRealtime - alpha) > ((Long) ac.gray.alpha(null)).longValue()) {
                    z02.f7539b.white.bravo(elapsedRealtime);
                    W();
                    X();
                    if (H0() && (delete = S0().delete("upload_queue", A0(), new String[0])) > 0) {
                        G.foxtrot(arVar);
                        arVar.f7636g.bravo(Integer.valueOf(delete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                    }
                    ab abVar = ac.f7568I;
                    C1440e c1440e = g2.yellow;
                    if (c1440e.j0(null, abVar)) {
                        V5.x.echo(str);
                        W();
                        X();
                        try {
                            int c02 = c1440e.c0(str, ac.amber);
                            if (c02 > 0) {
                                S0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(c02)});
                            }
                        } catch (SQLiteException e4) {
                            G.foxtrot(arVar);
                            arVar.white.charlie(ar.e0(str), e4, "Error deleting over the limit queued batches. appId");
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            }
            byte[] charlie = b02.charlie();
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("measurement_batch", charlie);
            contentValues.put("upload_uri", str2);
            StringBuilder sb2 = new StringBuilder();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                while (true) {
                    sb2.append((CharSequence) it.next());
                    if (!it.hasNext()) {
                        break;
                    }
                    sb2.append((CharSequence) "\r\n");
                }
            }
            contentValues.put("upload_headers", sb2.toString());
            contentValues.put("upload_type", Integer.valueOf(enumC1472u0.alpha));
            c1629a.getClass();
            contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
            contentValues.put("retry_count", (Integer) 0);
            if (l10 != null) {
                contentValues.put("associated_row_id", l10);
            }
            try {
                long insert = S0().insert("upload_queue", null, contentValues);
                if (insert == j5) {
                    G.foxtrot(arVar);
                    arVar.white.bravo(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
                    return j5;
                }
                return insert;
            } catch (SQLiteException e5) {
                G.foxtrot(arVar);
                arVar.white.charlie(str, e5, "Error storing MeasurementBatch to upload_queue. appId");
                return j5;
            }
        }
        return -1L;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(3:2|3|4)|(2:6|(3:8|9|10)(1:14))|15|16|(1:18)(2:21|22)|19|9|10|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        r4 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a0, code lost:
    
        r1 = r1.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r1);
        r1.white.delta("Error inserting column. appId", com.google.android.gms.measurement.internal.ar.e0(r14), "first_open_count", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        r7 = r4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long Q0(String str) {
        long j5;
        long O02;
        G g2 = (G) this.alpha;
        V5.x.echo(str);
        V5.x.echo("first_open_count");
        W();
        X();
        SQLiteDatabase S02 = S0();
        S02.beginTransaction();
        long j6 = 0;
        try {
            try {
                j5 = -1;
                O02 = O0("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
            } finally {
                S02.endTransaction();
            }
        } catch (SQLiteException e4) {
            e = e4;
        }
        if (O02 == -1) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", str);
            contentValues.put("first_open_count", (Integer) 0);
            contentValues.put("previous_install_count", (Integer) 0);
            if (S02.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.white.charlie(ar.e0(str), "first_open_count", "Failed to insert column (got -1). appId");
                return j5;
            }
            O02 = 0;
        }
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("app_id", str);
        contentValues2.put("first_open_count", Long.valueOf(1 + O02));
        if (S02.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.white.charlie(ar.e0(str), "first_open_count", "Failed to update column (got 0). appId");
        } else {
            S02.setTransactionSuccessful();
            j5 = O02;
        }
        return j5;
    }

    public final long R0(String str) {
        V5.x.echo(str);
        return O0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    public final SQLiteDatabase S0() {
        W();
        try {
            return this.silver.getWritableDatabase();
        } catch (SQLiteException e4) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(e4, "Error opening database");
            throw e4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x03fa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ao T0(String str) {
        Cursor cursor;
        boolean z2;
        long j5;
        boolean z10;
        boolean z11;
        long j6;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Boolean valueOf;
        String string;
        boolean z18;
        boolean z19;
        boolean z20;
        G g2 = (G) this.alpha;
        V5.x.echo(str);
        W();
        X();
        Cursor cursor2 = null;
        try {
            cursor = S0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                } catch (SQLiteException e4) {
                    e = e4;
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.white.charlie(ar.e0(str), e, "Error querying app. appId");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor.moveToFirst()) {
            Z0 z02 = this.purple;
            ao aoVar = new ao(z02.e, str);
            G g5 = aoVar.alpha;
            V e10 = z02.e(str);
            U u4 = U.ANALYTICS_STORAGE;
            if (e10.kilo(u4)) {
                aoVar.lima(cursor.getString(0));
            }
            boolean z21 = true;
            aoVar.crimson(cursor.getString(1));
            if (z02.e(str).kilo(U.AD_STORAGE)) {
                aoVar.ivory(cursor.getString(2));
            }
            aoVar.gray(cursor.getLong(3));
            aoVar.green(cursor.getLong(4));
            aoVar.gold(cursor.getLong(5));
            aoVar.november(cursor.getString(6));
            aoVar.mike(cursor.getString(7));
            aoVar.cyan(cursor.getLong(8));
            aoVar.beige(cursor.getLong(9));
            if (cursor.isNull(10) || cursor.getInt(10) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            aoVar.indigo(z2);
            aoVar.azure(cursor.getLong(11));
            aoVar.yankee(cursor.getLong(12));
            aoVar.xray(cursor.getLong(13));
            aoVar.victor(cursor.getLong(14));
            aoVar.uniform(cursor.getLong(15));
            aoVar.bronze(cursor.getLong(16));
            if (cursor.isNull(17)) {
                j5 = -2147483648L;
            } else {
                j5 = cursor.getInt(17);
            }
            aoVar.oscar(j5);
            aoVar.coral(cursor.getString(18));
            aoVar.whiskey(cursor.getLong(19));
            aoVar.amber(cursor.getLong(20));
            aoVar.emerald(cursor.getString(21));
            if (cursor.isNull(23) || cursor.getInt(23) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            E e11 = g5.f7508c;
            G.foxtrot(e11);
            e11.W();
            boolean z22 = aoVar.lavender;
            if (aoVar.papa != z10) {
                z11 = true;
            } else {
                z11 = false;
            }
            aoVar.lavender = z22 | z11;
            aoVar.papa = z10;
            aoVar.kilo(cursor.getString(24));
            if (cursor.isNull(25)) {
                j6 = 0;
            } else {
                j6 = cursor.getLong(25);
            }
            aoVar.blue(j6);
            if (!cursor.isNull(26)) {
                aoVar.jade(Arrays.asList(cursor.getString(26).split(Constants.SEPARATOR_COMMA, -1)));
            }
            if (z02.e(str).kilo(u4)) {
                String string2 = cursor.getString(28);
                E e12 = g5.f7508c;
                G.foxtrot(e12);
                e12.W();
                aoVar.lavender |= !Objects.equals(aoVar.uniform, string2);
                aoVar.uniform = string2;
            }
            if (!cursor.isNull(29) && cursor.getInt(29) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            E e13 = g5.f7508c;
            G.foxtrot(e13);
            e13.W();
            boolean z23 = aoVar.lavender;
            if (aoVar.victor != z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            aoVar.lavender = z23 | z13;
            aoVar.victor = z12;
            aoVar.fuchsia(cursor.getLong(39));
            String string3 = cursor.getString(36);
            E e14 = g5.f7508c;
            G.foxtrot(e14);
            e14.W();
            boolean z24 = aoVar.lavender;
            if (aoVar.black != string3) {
                z14 = true;
            } else {
                z14 = false;
            }
            aoVar.lavender = z24 | z14;
            aoVar.black = string3;
            aoVar.romeo(cursor.getLong(30));
            aoVar.quebec(cursor.getLong(31));
            C1317f3.bravo();
            if (g2.yellow.j0(str, ac.f7574O)) {
                int i4 = cursor.getInt(32);
                E e15 = g5.f7508c;
                G.foxtrot(e15);
                e15.W();
                boolean z25 = aoVar.lavender;
                if (aoVar.yankee != i4) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                aoVar.lavender = z25 | z20;
                aoVar.yankee = i4;
                aoVar.papa(cursor.getLong(35));
            }
            if (!cursor.isNull(33) && cursor.getInt(33) != 0) {
                z15 = true;
            } else {
                z15 = false;
            }
            E e16 = g5.f7508c;
            G.foxtrot(e16);
            e16.W();
            boolean z26 = aoVar.lavender;
            if (aoVar.zulu != z15) {
                z16 = true;
            } else {
                z16 = false;
            }
            aoVar.lavender = z26 | z16;
            aoVar.zulu = z15;
            if (cursor.isNull(34)) {
                valueOf = null;
            } else {
                if (cursor.getInt(34) != 0) {
                    z17 = true;
                } else {
                    z17 = false;
                }
                valueOf = Boolean.valueOf(z17);
            }
            E e17 = g5.f7508c;
            G.foxtrot(e17);
            e17.W();
            aoVar.lavender |= !Objects.equals(aoVar.romeo, valueOf);
            aoVar.romeo = valueOf;
            aoVar.black(cursor.getInt(37));
            aoVar.zulu(cursor.getInt(38));
            if (cursor.isNull(40)) {
                string = "";
            } else {
                string = cursor.getString(40);
                V5.x.hotel(string);
            }
            E e18 = g5.f7508c;
            G.foxtrot(e18);
            e18.W();
            boolean z27 = aoVar.lavender;
            if (aoVar.crimson != string) {
                z18 = true;
            } else {
                z18 = false;
            }
            aoVar.lavender = z27 | z18;
            aoVar.crimson = string;
            if (!cursor.isNull(41)) {
                Long valueOf2 = Long.valueOf(cursor.getLong(41));
                E e19 = g5.f7508c;
                G.foxtrot(e19);
                e19.W();
                aoVar.lavender |= !Objects.equals(aoVar.amber, valueOf2);
                aoVar.amber = valueOf2;
            }
            if (!cursor.isNull(42)) {
                Long valueOf3 = Long.valueOf(cursor.getLong(42));
                E e20 = g5.f7508c;
                G.foxtrot(e20);
                e20.W();
                aoVar.lavender |= !Objects.equals(aoVar.azure, valueOf3);
                aoVar.azure = valueOf3;
            }
            byte[] blob = cursor.getBlob(43);
            E e21 = g5.f7508c;
            G.foxtrot(e21);
            e21.W();
            boolean z28 = aoVar.lavender;
            if (aoVar.cyan != blob) {
                z19 = true;
            } else {
                z19 = false;
            }
            aoVar.lavender = z28 | z19;
            aoVar.cyan = blob;
            if (g2.yellow.j0(str, ac.f7568I) && !cursor.isNull(44)) {
                int i5 = cursor.getInt(44);
                E e22 = g5.f7508c;
                G.foxtrot(e22);
                e22.W();
                boolean z29 = aoVar.lavender;
                if (aoVar.emerald == i5) {
                    z21 = false;
                }
                aoVar.lavender = z21 | z29;
                aoVar.emerald = i5;
            }
            E e23 = g5.f7508c;
            G.foxtrot(e23);
            e23.W();
            aoVar.lavender = false;
            if (cursor.moveToNext()) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.bravo(ar.e0(str), "Got multiple records for app, expected one. appId");
            }
            cursor.close();
            return aoVar;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00f6: MOVE (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]) (LINE:247), block:B:37:0x00f6 */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zzai U0(String str, String str2) {
        String str3;
        Cursor cursor;
        Cursor cursor2;
        boolean z2;
        G g2 = (G) this.alpha;
        V5.x.echo(str);
        V5.x.echo(str2);
        W();
        X();
        Cursor cursor3 = null;
        try {
            try {
                cursor = S0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                } catch (SQLiteException e4) {
                    e = e4;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor3 = cursor2;
                if (cursor3 != null) {
                    cursor3.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str3 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor3 != null) {
            }
            throw th;
        }
        if (cursor.moveToFirst()) {
            String string = cursor.getString(0);
            if (string == null) {
                string = "";
            }
            String str4 = string;
            Object d12 = d1(cursor, 1);
            if (cursor.getInt(2) != 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            String string2 = cursor.getString(3);
            long j5 = cursor.getLong(4);
            au auVar = this.purple.yellow;
            Z0.cyan(auVar);
            byte[] blob = cursor.getBlob(5);
            Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
            zzbh zzbhVar = (zzbh) auVar.y0(blob, creator);
            long j6 = cursor.getLong(6);
            Z0.cyan(auVar);
            zzbh zzbhVar2 = (zzbh) auVar.y0(cursor.getBlob(7), creator);
            long j7 = cursor.getLong(8);
            long j10 = cursor.getLong(9);
            Z0.cyan(auVar);
            str3 = str2;
            try {
                zzai zzaiVar = new zzai(str, str4, new zzqb(j7, d12, str3, str4), j6, z2, string2, zzbhVar, j5, zzbhVar2, j10, (zzbh) auVar.y0(cursor.getBlob(10), creator));
                if (cursor.moveToNext()) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.white.charlie(ar.e0(str), g2.f7510f.foxtrot(str3), "Got multiple records for conditional property, expected one");
                }
                cursor.close();
                return zzaiVar;
            } catch (SQLiteException e10) {
                e = e10;
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.delta("Error querying conditional property", ar.e0(str), g2.f7510f.foxtrot(str3), e);
                if (cursor != null) {
                }
                return null;
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x006b: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:108), block:B:27:0x006b */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.bumptech.glide.load.engine.h V0(String str) {
        Throwable th;
        Cursor cursor;
        Cursor cursor2;
        G g2 = (G) this.alpha;
        V5.x.echo(str);
        W();
        X();
        Cursor cursor3 = null;
        try {
            try {
                cursor = S0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursor.moveToFirst()) {
                        byte[] blob = cursor.getBlob(0);
                        String string = cursor.getString(1);
                        String string2 = cursor.getString(2);
                        if (cursor.moveToNext()) {
                            ar arVar = g2.f7507b;
                            G.foxtrot(arVar);
                            arVar.white.bravo(ar.e0(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            com.bumptech.glide.load.engine.h hVar = new com.bumptech.glide.load.engine.h(blob, string, string2, 3);
                            cursor.close();
                            return hVar;
                        }
                    }
                } catch (SQLiteException e4) {
                    e = e4;
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.charlie(ar.e0(str), e, "Error querying remote config. appId");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor3 = cursor2;
                if (cursor3 == null) {
                    cursor3.close();
                    throw th;
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor3 == null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final C1444g W0(long j5, String str, boolean z2, boolean z10, boolean z11, boolean z12) {
        return X0(j5, str, 1L, false, false, z2, false, z10, z11, z12);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [com.google.android.gms.measurement.internal.g, java.lang.Object] */
    public final C1444g X0(long j5, String str, long j6, boolean z2, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        G g2 = (G) this.alpha;
        V5.x.echo(str);
        W();
        X();
        String[] strArr = {str};
        ?? obj = new Object();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase S02 = S0();
                cursor = S02.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursor.moveToFirst()) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.f7632b.bravo(ar.e0(str), "Not updating daily counts, app is not known. appId");
                } else {
                    if (cursor.getLong(0) == j5) {
                        obj.bravo = cursor.getLong(1);
                        obj.alpha = cursor.getLong(2);
                        obj.charlie = cursor.getLong(3);
                        obj.delta = cursor.getLong(4);
                        obj.echo = cursor.getLong(5);
                        obj.foxtrot = cursor.getLong(6);
                        obj.golf = cursor.getLong(7);
                    }
                    if (z2) {
                        obj.bravo += j6;
                    }
                    if (z10) {
                        obj.alpha += j6;
                    }
                    if (z11) {
                        obj.charlie += j6;
                    }
                    if (z12) {
                        obj.delta += j6;
                    }
                    if (z13) {
                        obj.echo += j6;
                    }
                    if (z14) {
                        obj.foxtrot += j6;
                    }
                    if (z15) {
                        obj.golf += j6;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j5));
                    contentValues.put("daily_public_events_count", Long.valueOf(obj.alpha));
                    contentValues.put("daily_events_count", Long.valueOf(obj.bravo));
                    contentValues.put("daily_conversions_count", Long.valueOf(obj.charlie));
                    contentValues.put("daily_error_events_count", Long.valueOf(obj.delta));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(obj.echo));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(obj.foxtrot));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(obj.golf));
                    S02.update("apps", contentValues, "app_id=?", strArr);
                }
            } catch (SQLiteException e4) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.charlie(ar.e0(str), e4, "Error updating daily counts. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
            return obj;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    public final C1460o Y0(String str, C1383v0 c1383v0, String str2) {
        C1460o y02 = y0("events", str, c1383v0.tango());
        if (y02 == null) {
            G g2 = (G) this.alpha;
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.charlie(ar.e0(str), g2.f7510f.delta(str2), "Event aggregate wasn't created during raw event logging. appId, event");
            return new C1460o(str, c1383v0.tango(), 1L, 1L, 1L, c1383v0.quebec(), 0L, null, null, null, null);
        }
        long j5 = y02.echo + 1;
        long j6 = y02.delta + 1;
        return new C1460o(y02.alpha, y02.bravo, y02.charlie + 1, j6, j5, y02.foxtrot, y02.golf, y02.hotel, y02.india, y02.juliet, y02.kilo);
    }

    @Override // com.google.android.gms.measurement.internal.U0
    public final void Z() {
    }

    public final V Z0(String str) {
        V5.x.hotel(str);
        W();
        X();
        return V.echo(100, B0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003f  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String a0() {
        SQLiteException e4;
        Cursor cursor;
        SQLiteDatabase S02 = S0();
        ?? r12 = 0;
        try {
            try {
                cursor = S02.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursor.moveToFirst()) {
                        String string = cursor.getString(0);
                        cursor.close();
                        return string;
                    }
                } catch (SQLiteException e5) {
                    e4 = e5;
                    ar arVar = ((G) this.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.white.bravo(e4, "Database error getting next bundle app id");
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                r12 = S02;
                th = th;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e4 = e10;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (r12 != 0) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0059, code lost:
    
        if (r5 == 0) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v9, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final V a1(String str) {
        Throwable th;
        SQLiteException e4;
        G g2 = (G) this.alpha;
        V5.x.hotel(str);
        W();
        X();
        ?? r5 = {str};
        Cursor cursor = null;
        r2 = null;
        r2 = null;
        V v4 = null;
        try {
            try {
                r5 = S0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", r5);
                try {
                    if (!r5.moveToFirst()) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.f7636g.alpha("No data found");
                    } else {
                        v4 = V.echo(r5.getInt(1), r5.getString(0));
                    }
                } catch (SQLiteException e5) {
                    e4 = e5;
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.bravo(e4, "Error querying database.");
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = r5;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e10) {
            e4 = e10;
            r5 = 0;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
            }
            throw th;
        }
        r5.close();
        if (v4 == null) {
            return V.charlie;
        }
        return v4;
    }

    public final List b0(String str, String str2, String str3) {
        V5.x.echo(str);
        W();
        X();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return c0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a1 b1(String str) {
        Cursor cursor;
        Cursor cursor2;
        V5.x.echo(str);
        W();
        X();
        G g2 = (G) this.alpha;
        Cursor cursor3 = null;
        if (g2.yellow.j0(null, ac.f7565F)) {
            if (g2.yellow.j0(null, ac.f7568I)) {
                EnumC1472u0[] enumC1472u0Arr = {EnumC1472u0.GOOGLE_SIGNAL};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(enumC1472u0Arr[0].alpha));
                List d02 = d0(str, new zzpc(arrayList), 1);
                if (!d02.isEmpty()) {
                    return (a1) d02.get(0);
                }
            } else {
                try {
                    cursor = S0().query("upload_queue", new String[]{"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"}, "app_id=? AND NOT " + A0(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
                    try {
                    } catch (SQLiteException e4) {
                        e = e4;
                        cursor2 = cursor;
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    cursor = null;
                } catch (Throwable th2) {
                    th = th2;
                }
                if (cursor.moveToFirst()) {
                    long j5 = cursor.getLong(0);
                    byte[] blob = cursor.getBlob(2);
                    String string = cursor.getString(3);
                    String string2 = cursor.getString(4);
                    int i4 = cursor.getInt(5);
                    int i5 = cursor.getInt(6);
                    cursor.getLong(7);
                    cursor2 = cursor;
                    try {
                        a1 z02 = z0(str, j5, blob, string, string2, i4, i5, cursor.getLong(8), cursor.getLong(9));
                        cursor2.close();
                        return z02;
                    } catch (SQLiteException e10) {
                        e = e10;
                        cursor = cursor2;
                        try {
                            ar arVar = g2.f7507b;
                            G.foxtrot(arVar);
                            arVar.white.charlie(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
                            if (cursor != null) {
                            }
                            return null;
                        } catch (Throwable th3) {
                            th = th3;
                            cursor3 = cursor;
                            if (cursor3 != null) {
                                cursor3.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        cursor3 = cursor2;
                        if (cursor3 != null) {
                        }
                        throw th;
                    }
                }
                if (cursor != null) {
                    cursor.close();
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x008e, code lost:
    
        r20 = r12.getString(5);
        r22 = r12.getLong(6);
        r3 = r28.purple.yellow;
        com.google.android.gms.measurement.internal.Z0.cyan(r3);
        r4 = r12.getBlob(7);
        r5 = com.google.android.gms.measurement.internal.zzbh.CREATOR;
        r21 = (com.google.android.gms.measurement.internal.zzbh) r3.y0(r4, r5);
        r17 = r12.getLong(8);
        com.google.android.gms.measurement.internal.Z0.cyan(r3);
        r24 = (com.google.android.gms.measurement.internal.zzbh) r3.y0(r12.getBlob(9), r5);
        r6 = r12.getLong(10);
        r25 = r12.getLong(11);
        com.google.android.gms.measurement.internal.Z0.cyan(r3);
        r0.add(new com.google.android.gms.measurement.internal.zzai(r14, r15, new com.google.android.gms.measurement.internal.zzqb(r6, r8, r9, r15), r17, r19, r20, r21, r22, r24, r25, (com.google.android.gms.measurement.internal.zzbh) r3.y0(r12.getBlob(12), r5)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x00f9, code lost:
    
        if (r12.moveToNext() != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
    
        r19 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
    
        r3 = r2.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r3);
        r3.white.bravo(1000, "Read more than the max allowed conditional properties, ignoring extra");
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004c, code lost:
    
        if (r12.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0054, code lost:
    
        if (r0.size() < 1000) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x006e, code lost:
    
        r14 = r12.getString(0);
        r15 = r12.getString(1);
        r9 = r12.getString(2);
        r8 = d1(r12, 3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0087, code lost:
    
        if (r12.getInt(4) == 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0089, code lost:
    
        r19 = true;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List c0(String str, String[] strArr) {
        G g2 = (G) this.alpha;
        W();
        X();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                g2.getClass();
                cursor = S0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
            } catch (SQLiteException e4) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.white.bravo(e4, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            if (cursor != null) {
                cursor.close();
            }
            return arrayList;
        } catch (Throwable th) {
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0097  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final c1 c1(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursor;
        G g2 = (G) this.alpha;
        V5.x.echo(str);
        V5.x.echo(str2);
        W();
        X();
        Cursor cursor2 = null;
        try {
            cursor = S0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursor.moveToFirst()) {
                        long j5 = cursor.getLong(0);
                        Object d12 = d1(cursor, 1);
                        if (d12 != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                c1 c1Var = new c1(str3, cursor.getString(2), str4, j5, d12);
                                if (cursor.moveToNext()) {
                                    ar arVar = g2.f7507b;
                                    G.foxtrot(arVar);
                                    arVar.white.bravo(ar.e0(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursor.close();
                                return c1Var;
                            } catch (SQLiteException e4) {
                                e = e4;
                                sQLiteException = e;
                                ar arVar2 = g2.f7507b;
                                G.foxtrot(arVar2);
                                arVar2.white.delta("Error querying user property. appId", ar.e0(str3), g2.f7510f.foxtrot(str4), sQLiteException);
                                if (cursor != null) {
                                }
                                return null;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor2 = cursor;
                    if (cursor2 == null) {
                        cursor2.close();
                        throw th;
                    }
                    throw th;
                }
            } catch (SQLiteException e5) {
                e = e5;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e10) {
            str3 = str;
            str4 = str2;
            sQLiteException = e10;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 == null) {
            }
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List d0(String str, zzpc zzpcVar, int i4) {
        ?? r02;
        Cursor cursor;
        String str2;
        C1450j c1450j = this;
        G g2 = (G) c1450j.alpha;
        Cursor cursor2 = null;
        if (!g2.yellow.j0(null, ac.f7568I)) {
            return Collections.EMPTY_LIST;
        }
        V5.x.echo(str);
        c1450j.W();
        c1450j.X();
        try {
            try {
                SQLiteDatabase S02 = c1450j.S0();
                String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
                String str3 = "app_id=?" + F0(zzpcVar.alpha) + " AND NOT " + c1450j.A0();
                String[] strArr2 = {str};
                if (i4 > 0) {
                    str2 = String.valueOf(i4);
                } else {
                    str2 = null;
                }
                cursor = S02.query("upload_queue", strArr, str3, strArr2, null, null, "creation_timestamp ASC", str2);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SQLiteException e4) {
            e = e4;
        }
        try {
            r02 = new ArrayList();
            while (cursor.moveToNext()) {
                long j5 = cursor.getLong(0);
                byte[] blob = cursor.getBlob(2);
                String string = cursor.getString(3);
                String string2 = cursor.getString(4);
                int i5 = cursor.getInt(5);
                int i10 = cursor.getInt(6);
                cursor.getLong(7);
                a1 z02 = c1450j.z0(str, j5, blob, string, string2, i5, i10, cursor.getLong(8), cursor.getLong(9));
                if (z02 != null) {
                    r02.add(z02);
                }
                c1450j = this;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor2 = cursor;
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.charlie(str, e, "Error to querying MeasurementBatch from upload_queue. appId");
            r02 = Collections.EMPTY_LIST;
            cursor = cursor2;
            if (cursor != null) {
            }
            return r02;
        } catch (Throwable th2) {
            th = th2;
            cursor2 = cursor;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return r02;
    }

    public final Object d1(Cursor cursor, int i4) {
        int type = cursor.getType(i4);
        G g2 = (G) this.alpha;
        if (type != 0) {
            if (type != 1) {
                if (type != 2) {
                    if (type != 3) {
                        if (type != 4) {
                            ar arVar = g2.f7507b;
                            G.foxtrot(arVar);
                            arVar.white.bravo(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
                            return null;
                        }
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.white.alpha("Loaded invalid blob type value, ignoring it");
                        return null;
                    }
                    return cursor.getString(i4);
                }
                return Double.valueOf(cursor.getDouble(i4));
            }
            return Long.valueOf(cursor.getLong(i4));
        }
        ar arVar3 = g2.f7507b;
        G.foxtrot(arVar3);
        arVar3.white.alpha("Loaded invalid null value from database");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List e0(String str) {
        String str2;
        G g2 = (G) this.alpha;
        V5.x.echo(str);
        W();
        X();
        ?? arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                g2.getClass();
                cursor = S0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                try {
                    if (cursor.moveToFirst()) {
                        while (true) {
                            String string = cursor.getString(0);
                            String string2 = cursor.getString(1);
                            if (string2 == null) {
                                string2 = "";
                            }
                            String str3 = string2;
                            long j5 = cursor.getLong(2);
                            Object d12 = d1(cursor, 3);
                            if (d12 == null) {
                                ar arVar = g2.f7507b;
                                G.foxtrot(arVar);
                                arVar.white.bravo(ar.e0(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } else {
                                str2 = str;
                                try {
                                    arrayList.add(new c1(str2, str3, string, j5, d12));
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    ar arVar2 = g2.f7507b;
                                    G.foxtrot(arVar2);
                                    arVar2.white.charlie(ar.e0(str2), e, "Error querying user properties. appId");
                                    arrayList = Collections.EMPTY_LIST;
                                    if (cursor != null) {
                                    }
                                    return arrayList;
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            str = str2;
                        }
                    }
                } catch (SQLiteException e5) {
                    e = e5;
                    str2 = str;
                }
            } finally {
            }
        } catch (SQLiteException e10) {
            e = e10;
            str2 = str;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        com.google.android.gms.measurement.internal.G.foxtrot(r7);
        r7.white.bravo(1000, "Read more than the max allowed user properties, ignoring excess");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011e  */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List f0(String str, String str2, String str3) {
        Cursor cursor;
        String str4;
        String str5;
        G g2 = (G) this.alpha;
        V5.x.echo(str);
        W();
        X();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb2 = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb2.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                arrayList2.add(str3 + "*");
                sb2.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String sb3 = sb2.toString();
            g2.getClass();
            cursor = S0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, sb3, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursor.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                int size = arrayList.size();
                                ar arVar = g2.f7507b;
                                if (size >= 1000) {
                                    break;
                                }
                                String string = cursor.getString(0);
                                long j5 = cursor.getLong(1);
                                Object d12 = d1(cursor, 2);
                                String string2 = cursor.getString(3);
                                if (d12 == null) {
                                    try {
                                        G.foxtrot(arVar);
                                        arVar.white.delta("(2)Read invalid user property value, ignoring it", ar.e0(str6), string2, str3);
                                        str5 = string2;
                                    } catch (SQLiteException e4) {
                                        e = e4;
                                        str5 = string2;
                                        str4 = str5;
                                        ar arVar2 = g2.f7507b;
                                        G.foxtrot(arVar2);
                                        arVar2.white.delta("(2)Error querying user properties", ar.e0(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        if (cursor != null) {
                                        }
                                        return arrayList;
                                    }
                                } else {
                                    str5 = string2;
                                    try {
                                        arrayList.add(new c1(str6, str5, string, j5, d12));
                                    } catch (SQLiteException e5) {
                                        e = e5;
                                        str4 = str5;
                                        ar arVar22 = g2.f7507b;
                                        G.foxtrot(arVar22);
                                        arVar22.white.delta("(2)Error querying user properties", ar.e0(str), str4, e);
                                        arrayList = Collections.EMPTY_LIST;
                                        if (cursor != null) {
                                        }
                                        return arrayList;
                                    }
                                }
                                if (!cursor.moveToNext()) {
                                    break;
                                }
                                str6 = str;
                                str4 = str5;
                            } catch (SQLiteException e10) {
                                e = e10;
                            }
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                str4 = str2;
            }
        } catch (SQLiteException e12) {
            e = e12;
            str4 = str2;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            cursor = null;
            if (cursor != null) {
            }
            throw th;
        }
        if (cursor != null) {
            cursor.close();
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f0, code lost:
    
        if (r4 == null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0117 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g0(String str, Long l10, String str2, Bundle bundle) {
        bn.g gVar;
        ar arVar;
        bn.g gVar2;
        Cursor cursor;
        Object obj;
        Object obj2;
        com.google.android.gms.internal.measurement.D0 d02;
        String str3 = str;
        V5.x.hotel(bundle);
        W();
        X();
        G g2 = (G) this.alpha;
        Cursor cursor2 = null;
        if (g2.yellow.j0(null, ac.f7582X) && l10 != null) {
            gVar = new bn.g(this, str3, l10.longValue());
        } else {
            gVar = new bn.g(this, str3);
        }
        bn.g gVar3 = gVar;
        List<C1446h> bravo = gVar3.bravo();
        while (!bravo.isEmpty()) {
            for (C1446h c1446h : bravo) {
                boolean isEmpty = TextUtils.isEmpty(str2);
                ar arVar2 = g2.f7507b;
                if (!isEmpty) {
                    try {
                        cursor = S0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, Long.toString(c1446h.bravo)}, null, null, "rowid", "2");
                        try {
                            try {
                            } catch (Throwable th) {
                                th = th;
                                cursor2 = cursor;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            obj = cursor2;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        cursor = cursor2;
                        obj = cursor;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (!cursor.moveToFirst()) {
                        G.foxtrot(arVar2);
                        arVar2.white.bravo(ar.e0(str3), "Raw event metadata record is missing. appId");
                    } else {
                        try {
                            Object obj3 = (com.google.android.gms.internal.measurement.D0) ((com.google.android.gms.internal.measurement.C0) au.C0(com.google.android.gms.internal.measurement.D0.c1(), cursor.getBlob(0))).echo();
                            try {
                                if (cursor.moveToNext()) {
                                    G.foxtrot(arVar2);
                                    arVar2.f7632b.bravo(ar.e0(str3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursor.close();
                                obj2 = obj3;
                            } catch (SQLiteException e10) {
                                e = e10;
                                obj = obj3;
                                G.foxtrot(arVar2);
                                arVar2.white.charlie(ar.e0(str3), e, "Data loss. Error selecting raw event. appId");
                                d02 = obj;
                                obj2 = obj;
                            }
                            cursor.close();
                            d02 = obj2;
                        } catch (IOException e11) {
                            G.foxtrot(arVar2);
                            arVar2.white.charlie(ar.e0(str3), e11, "Data loss. Failed to merge raw event metadata. appId");
                        }
                        if (d02 == 0) {
                            Iterator it = d02.fuchsia().iterator();
                            while (it.hasNext()) {
                                if (((com.google.android.gms.internal.measurement.M0) it.next()).sierra().equals(str2)) {
                                    break;
                                }
                            }
                        }
                    }
                    cursor.close();
                    d02 = cursor2;
                    if (d02 == 0) {
                    }
                }
                Z0 z02 = this.purple;
                au auVar = z02.yellow;
                Z0.cyan(auVar);
                C1383v0 c1383v0 = c1446h.delta;
                Bundle bundle2 = new Bundle();
                for (C1395y0 c1395y0 : c1383v0.uniform()) {
                    if (c1395y0.bronze()) {
                        gVar2 = gVar3;
                        bundle2.putDouble(c1395y0.sierra(), c1395y0.november());
                    } else {
                        gVar2 = gVar3;
                        if (c1395y0.coral()) {
                            bundle2.putFloat(c1395y0.sierra(), c1395y0.oscar());
                        } else if (c1395y0.crimson()) {
                            bundle2.putLong(c1395y0.sierra(), c1395y0.quebec());
                        } else if (c1395y0.emerald()) {
                            bundle2.putString(c1395y0.sierra(), c1395y0.tango());
                        } else if (!c1395y0.uniform().isEmpty()) {
                            bundle2.putParcelableArray(c1395y0.sierra(), au.c0((D1) c1395y0.uniform()));
                        } else {
                            ar arVar3 = ((G) auVar.alpha).f7507b;
                            G.foxtrot(arVar3);
                            arVar3.white.bravo(c1395y0, "Unexpected parameter type for parameter");
                        }
                    }
                    gVar3 = gVar2;
                }
                bn.g gVar4 = gVar3;
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                if (string == null) {
                    string = "";
                }
                String str4 = string;
                d1 d1Var = g2.e;
                G.delta(d1Var);
                d1Var.n0(bundle2, bundle);
                C1458n c1458n = new C1458n((G) this.alpha, str4, str3, c1383v0.tango(), c1383v0.quebec(), c1383v0.papa(), bundle2);
                long j5 = c1446h.alpha;
                W();
                X();
                String str5 = c1458n.alpha;
                V5.x.echo(str5);
                au auVar2 = z02.yellow;
                Z0.cyan(auVar2);
                byte[] charlie = auVar2.B0(c1458n).charlie();
                ContentValues contentValues = new ContentValues();
                contentValues.put("app_id", str5);
                contentValues.put("name", c1458n.bravo);
                contentValues.put("timestamp", Long.valueOf(c1458n.delta));
                contentValues.put("metadata_fingerprint", Long.valueOf(c1446h.bravo));
                contentValues.put(Column.DATA, charlie);
                contentValues.put("realtime", Integer.valueOf(c1446h.charlie ? 1 : 0));
                try {
                    long update = S0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j5)});
                    if (update != 1) {
                        G.foxtrot(arVar2);
                        arVar = arVar2;
                        try {
                            arVar.white.charlie(ar.e0(str5), Long.valueOf(update), "Failed to update raw event. appId, updatedRows");
                        } catch (SQLiteException e12) {
                            e = e12;
                            G.foxtrot(arVar);
                            arVar.white.charlie(ar.e0(str5), e, "Error updating raw event. appId");
                            str3 = str;
                            gVar3 = gVar4;
                            cursor2 = null;
                        }
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                    arVar = arVar2;
                }
                str3 = str;
                gVar3 = gVar4;
                cursor2 = null;
            }
            bravo = gVar3.bravo();
            str3 = str;
            cursor2 = null;
        }
    }

    public final void h0() {
        X();
        S0().beginTransaction();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        if (r2.moveToNext() != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002d, code lost:
    
        if (r2.moveToFirst() != false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x002f, code lost:
    
        r1 = r2.getString(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0033, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0035, code lost:
    
        r1 = y0("events", r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003b, code lost:
    
        if (r1 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003d, code lost:
    
        D0("events_snapshot", r1);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i0(String str) {
        C0("events_snapshot", str);
        Cursor cursor = null;
        try {
            try {
                cursor = S0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            } catch (SQLiteException e4) {
                ar arVar = ((G) this.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.charlie(ar.e0(str), e4, "Error creating snapshot. appId");
            }
            if (cursor != null) {
                cursor.close();
            }
        } finally {
        }
    }

    public final void j0(ArrayList arrayList) {
        V5.x.hotel(arrayList);
        W();
        X();
        StringBuilder sb2 = new StringBuilder("rowid in (");
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            if (i4 != 0) {
                sb2.append(Constants.SEPARATOR_COMMA);
            }
            sb2.append(((Long) arrayList.get(i4)).longValue());
        }
        sb2.append(")");
        int delete = S0().delete("raw_events", sb2.toString(), null);
        if (delete != arrayList.size()) {
            ar arVar = ((G) this.alpha).f7507b;
            G.foxtrot(arVar);
            arVar.white.charlie(Integer.valueOf(delete), Integer.valueOf(arrayList.size()), "Deleted fewer rows from raw events table than expected");
        }
    }

    public final void k0(Long l10) {
        W();
        X();
        G g2 = (G) this.alpha;
        C1440e c1440e = g2.yellow;
        ar arVar = g2.f7507b;
        if (c1440e.j0(null, ac.f7565F)) {
            try {
                if (S0().delete("upload_queue", "rowid=?", new String[]{l10.toString()}) != 1) {
                    G.foxtrot(arVar);
                    arVar.f7632b.alpha("Deleted fewer rows from upload_queue than expected");
                }
            } catch (SQLiteException e4) {
                G.foxtrot(arVar);
                arVar.white.bravo(e4, "Failed to delete a MeasurementBatch in a upload_queue table");
                throw e4;
            }
        }
    }

    public final void l0() {
        X();
        S0().endTransaction();
    }

    public final void m0(ArrayList arrayList) {
        W();
        X();
        V5.x.hotel(arrayList);
        if (arrayList.size() != 0) {
            if (!H0()) {
                return;
            }
            String gray = ao.ad.gray("(", TextUtils.join(Constants.SEPARATOR_COMMA, arrayList), ")");
            long N02 = N0("SELECT COUNT(1) FROM queue WHERE rowid IN " + gray + " AND retry_count =  2147483647 LIMIT 1", null);
            G g2 = (G) this.alpha;
            if (N02 > 0) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.alpha("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                S0().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + gray + " AND (retry_count IS NULL OR retry_count < 2147483647)");
                return;
            } catch (SQLiteException e4) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.bravo(e4, "Error incrementing retry count. error");
                return;
            }
        }
        throw new IllegalArgumentException("Given Integer is zero");
    }

    public final void n0(Long l10) {
        String str;
        W();
        X();
        G g2 = (G) this.alpha;
        if (g2.yellow.j0(null, ac.f7565F) && H0()) {
            long N02 = N0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l10 + " AND retry_count =  2147483647 LIMIT 1", null);
            ar arVar = g2.f7507b;
            if (N02 > 0) {
                G.foxtrot(arVar);
                arVar.f7632b.alpha("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase S02 = S0();
                if (g2.yellow.j0(null, ac.f7568I)) {
                    g2.f7511g.getClass();
                    str = " SET retry_count = retry_count + 1, last_upload_timestamp = " + System.currentTimeMillis();
                } else {
                    str = " SET retry_count = retry_count + 1 ";
                }
                S02.execSQL("UPDATE upload_queue" + str + " WHERE rowid = " + l10 + " AND retry_count < 2147483647");
            } catch (SQLiteException e4) {
                G.foxtrot(arVar);
                arVar.white.bravo(e4, "Error incrementing retry count. error");
            }
        }
    }

    public final void o0() {
        W();
        X();
        if (H0()) {
            Z0 z02 = this.purple;
            long alpha = z02.f7539b.teal.alpha();
            G g2 = (G) this.alpha;
            g2.f7511g.getClass();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(elapsedRealtime - alpha) > ((Long) ac.gray.alpha(null)).longValue()) {
                z02.f7539b.teal.bravo(elapsedRealtime);
                W();
                X();
                if (H0()) {
                    SQLiteDatabase S02 = S0();
                    g2.f7511g.getClass();
                    int delete = S02.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) ac.lavender.alpha(null)).longValue())});
                    if (delete > 0) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.f7636g.bravo(Integer.valueOf(delete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    public final void p0(String str, String str2) {
        V5.x.echo(str);
        V5.x.echo(str2);
        W();
        X();
        try {
            S0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            G g2 = (G) this.alpha;
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.delta("Error deleting user property. appId", ar.e0(str), g2.f7510f.foxtrot(str2), e4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0059, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        D0("events", r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c1, code lost:
    
        if (r8 != null) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(String str) {
        boolean z2;
        C1460o y02;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        C1460o y03 = y0("events", str, "_f");
        C1460o y04 = y0("events", str, "_v");
        C0("events", str);
        Cursor cursor = null;
        boolean z10 = false;
        try {
            cursor = S0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
        } catch (SQLiteException e4) {
            e = e4;
            z2 = false;
        } catch (Throwable th) {
            th = th;
            z2 = false;
        }
        if (!cursor.moveToFirst()) {
            cursor.close();
            if (y03 == null) {
            }
            D0("events", y03);
            C0("events_snapshot", str);
        }
        boolean z11 = false;
        z2 = false;
        do {
            try {
                String string = cursor.getString(0);
                if (cursor.getLong(1) >= 1) {
                    if ("_f".equals(string)) {
                        z11 = true;
                    } else if ("_v".equals(string)) {
                        z2 = true;
                    }
                }
                if (string != null && (y02 = y0("events_snapshot", str, string)) != null) {
                    D0("events", y02);
                }
            } catch (SQLiteException e5) {
                e = e5;
                z10 = z11;
                try {
                    ar arVar = ((G) this.alpha).f7507b;
                    G.foxtrot(arVar);
                    arVar.white.charlie(ar.e0(str), e, "Error querying snapshot. appId");
                    z11 = z10;
                    if (cursor != null) {
                    }
                    if (!z11) {
                    }
                    if (!z2) {
                    }
                    C0("events_snapshot", str);
                } catch (Throwable th2) {
                    th = th2;
                    if (cursor != null) {
                        cursor.close();
                    }
                    if (z10 && y03 != null) {
                        D0("events", y03);
                    } else if (!z2 && y04 != null) {
                        D0("events", y04);
                    }
                    C0("events_snapshot", str);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                z10 = z11;
                if (cursor != null) {
                }
                if (z10) {
                }
                if (!z2) {
                    D0("events", y04);
                }
                C0("events_snapshot", str);
                throw th;
            }
        } while (cursor.moveToNext());
        if (cursor != null) {
            cursor.close();
        }
        if (!z11 || y03 == null) {
            if (!z2) {
            }
            C0("events_snapshot", str);
        }
        D0("events", y03);
        C0("events_snapshot", str);
    }

    public final void r0() {
        X();
        S0().setTransactionSuccessful();
    }

    public final void s0(ao aoVar, boolean z2) {
        W();
        X();
        String charlie = aoVar.charlie();
        V5.x.hotel(charlie);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", charlie);
        U u4 = U.ANALYTICS_STORAGE;
        Z0 z02 = this.purple;
        if (z2) {
            contentValues.put("app_instance_id", (String) null);
        } else if (z02.e(charlie).kilo(u4)) {
            contentValues.put("app_instance_id", aoVar.delta());
        }
        contentValues.put("gmp_app_id", aoVar.golf());
        boolean kilo = z02.e(charlie).kilo(U.AD_STORAGE);
        G g2 = aoVar.alpha;
        if (kilo) {
            E e4 = g2.f7508c;
            G.foxtrot(e4);
            e4.W();
            contentValues.put("resettable_device_id_hash", aoVar.echo);
        }
        E e5 = g2.f7508c;
        G.foxtrot(e5);
        e5.W();
        contentValues.put("last_bundle_index", Long.valueOf(aoVar.golf));
        E e10 = g2.f7508c;
        G.foxtrot(e10);
        e10.W();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(aoVar.hotel));
        E e11 = g2.f7508c;
        G.foxtrot(e11);
        e11.W();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(aoVar.india));
        contentValues.put("app_version", aoVar.echo());
        E e12 = g2.f7508c;
        G.foxtrot(e12);
        e12.W();
        contentValues.put("app_store", aoVar.lima);
        E e13 = g2.f7508c;
        G.foxtrot(e13);
        e13.W();
        contentValues.put("gmp_version", Long.valueOf(aoVar.mike));
        E e14 = g2.f7508c;
        G.foxtrot(e14);
        e14.W();
        contentValues.put("dev_cert_hash", Long.valueOf(aoVar.november));
        E e15 = g2.f7508c;
        G.foxtrot(e15);
        e15.W();
        contentValues.put("measurement_enabled", Boolean.valueOf(aoVar.oscar));
        E e16 = g2.f7508c;
        G.foxtrot(e16);
        e16.W();
        contentValues.put("day", Long.valueOf(aoVar.fuchsia));
        E e17 = g2.f7508c;
        G.foxtrot(e17);
        e17.W();
        contentValues.put("daily_public_events_count", Long.valueOf(aoVar.gold));
        G.foxtrot(e17);
        e17.W();
        contentValues.put("daily_events_count", Long.valueOf(aoVar.gray));
        G.foxtrot(e17);
        e17.W();
        contentValues.put("daily_conversions_count", Long.valueOf(aoVar.green));
        E e18 = g2.f7508c;
        G.foxtrot(e18);
        e18.W();
        contentValues.put("config_fetched_time", Long.valueOf(aoVar.lime));
        E e19 = g2.f7508c;
        G.foxtrot(e19);
        e19.W();
        contentValues.put("failed_config_fetch_time", Long.valueOf(aoVar.magenta));
        contentValues.put("app_version_int", Long.valueOf(aoVar.lime()));
        contentValues.put("firebase_instance_id", aoVar.foxtrot());
        G.foxtrot(e17);
        e17.W();
        contentValues.put("daily_error_events_count", Long.valueOf(aoVar.indigo));
        G.foxtrot(e17);
        e17.W();
        contentValues.put("daily_realtime_events_count", Long.valueOf(aoVar.ivory));
        G.foxtrot(e17);
        e17.W();
        contentValues.put("health_monitor_sample", aoVar.jade);
        contentValues.put("android_id", (Long) 0L);
        E e20 = g2.f7508c;
        G.foxtrot(e20);
        e20.W();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(aoVar.papa));
        contentValues.put("admob_app_id", aoVar.alpha());
        contentValues.put("dynamite_version", Long.valueOf(aoVar.magenta()));
        if (z02.e(charlie).kilo(u4)) {
            E e21 = g2.f7508c;
            G.foxtrot(e21);
            e21.W();
            contentValues.put("session_stitching_token", aoVar.uniform);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(aoVar.tango()));
        E e22 = g2.f7508c;
        G.foxtrot(e22);
        e22.W();
        contentValues.put("target_os_version", Long.valueOf(aoVar.whiskey));
        E e23 = g2.f7508c;
        G.foxtrot(e23);
        e23.W();
        contentValues.put("session_stitching_token_hash", Long.valueOf(aoVar.xray));
        C1317f3.bravo();
        G g5 = (G) this.alpha;
        if (g5.yellow.j0(charlie, ac.f7574O)) {
            E e24 = g2.f7508c;
            G.foxtrot(e24);
            e24.W();
            contentValues.put("ad_services_version", Integer.valueOf(aoVar.yankee));
            E e25 = g2.f7508c;
            G.foxtrot(e25);
            e25.W();
            contentValues.put("attribution_eligibility_status", Long.valueOf(aoVar.beige));
        }
        E e26 = g2.f7508c;
        G.foxtrot(e26);
        e26.W();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(aoVar.zulu));
        contentValues.put("npa_metadata_value", aoVar.maroon());
        E e27 = g2.f7508c;
        G.foxtrot(e27);
        e27.W();
        contentValues.put("bundle_delivery_index", Long.valueOf(aoVar.coral));
        contentValues.put("sgtm_preview_key", aoVar.india());
        G.foxtrot(e17);
        e17.W();
        contentValues.put("dma_consent_state", Integer.valueOf(aoVar.blue));
        G.foxtrot(e17);
        e17.W();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(aoVar.bronze));
        contentValues.put("serialized_npa_metadata", aoVar.hotel());
        ab abVar = ac.f7568I;
        C1440e c1440e = g5.yellow;
        if (c1440e.j0(charlie, abVar)) {
            contentValues.put("client_upload_eligibility", Integer.valueOf(aoVar.lavender()));
        }
        E e28 = g2.f7508c;
        G.foxtrot(e28);
        e28.W();
        ArrayList arrayList = aoVar.tango;
        ar arVar = g5.f7507b;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                G.foxtrot(arVar);
                arVar.f7632b.bravo(charlie, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(Constants.SEPARATOR_COMMA, arrayList));
            }
        }
        if (c1440e.j0(null, ac.C) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        E e29 = g2.f7508c;
        G.foxtrot(e29);
        e29.W();
        contentValues.put("unmatched_pfo", aoVar.amber);
        E e30 = g2.f7508c;
        G.foxtrot(e30);
        e30.W();
        contentValues.put("unmatched_uwa", aoVar.azure);
        E e31 = g2.f7508c;
        G.foxtrot(e31);
        e31.W();
        contentValues.put("ad_campaign_info", aoVar.cyan);
        try {
            SQLiteDatabase S02 = S0();
            if (S02.update("apps", contentValues, "app_id = ?", new String[]{charlie}) == 0 && S02.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                G.foxtrot(arVar);
                arVar.white.bravo(ar.e0(charlie), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e32) {
            G.foxtrot(arVar);
            arVar.white.charlie(ar.e0(charlie), e32, "Error storing app. appId");
        }
    }

    public final void t0(String str, V v4) {
        V5.x.hotel(str);
        W();
        X();
        u0(str, a1(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", v4.juliet());
        E0(contentValues);
    }

    public final void u0(String str, V v4) {
        V5.x.hotel(str);
        V5.x.hotel(v4);
        W();
        X();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", v4.juliet());
        contentValues.put("consent_source", Integer.valueOf(v4.bravo));
        E0(contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0066 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean v0(String str) {
        G g2 = (G) this.alpha;
        if (g2.yellow.j0(null, ac.f7565F)) {
            if (g2.yellow.j0(null, ac.f7568I)) {
                EnumC1472u0[] enumC1472u0Arr = {EnumC1472u0.GOOGLE_SIGNAL};
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf(enumC1472u0Arr[0].alpha));
                if (N0(av.q.foxtrot("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", F0(arrayList), " AND NOT ", A0()), new String[]{str}) != 0) {
                    return true;
                }
            } else if (N0("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ".concat(A0()), new String[]{str}) != 0) {
            }
        }
        return false;
    }

    public final boolean w0(String str, String str2) {
        if (N0("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0) {
            return true;
        }
        return false;
    }

    public final void x0(String str, String str2) {
        V5.x.echo(str);
        V5.x.echo(str2);
        W();
        X();
        try {
            S0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e4) {
            G g2 = (G) this.alpha;
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.white.delta("Error deleting conditional property", ar.e0(str), g2.f7510f.foxtrot(str2), e4);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0127  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C1460o y0(String str, String str2, String str3) {
        Cursor cursor;
        boolean z2;
        long j5;
        Long valueOf;
        Long valueOf2;
        Long valueOf3;
        Boolean bool;
        G g2 = (G) this.alpha;
        V5.x.echo(str2);
        V5.x.echo(str3);
        W();
        X();
        Cursor cursor2 = null;
        try {
            z2 = false;
            cursor = S0().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
            try {
                try {
                } catch (SQLiteException e4) {
                    e = e4;
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.white.delta("Error querying events. appId", ar.e0(str2), g2.f7510f.delta(str3), e);
                    if (cursor != null) {
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e5) {
            e = e5;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
            }
            throw th;
        }
        if (cursor.moveToFirst()) {
            long j6 = cursor.getLong(0);
            long j7 = cursor.getLong(1);
            long j10 = cursor.getLong(2);
            long j11 = 0;
            if (cursor.isNull(3)) {
                j5 = 0;
            } else {
                j5 = cursor.getLong(3);
            }
            if (cursor.isNull(4)) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(cursor.getLong(4));
            }
            if (cursor.isNull(5)) {
                valueOf2 = null;
            } else {
                valueOf2 = Long.valueOf(cursor.getLong(5));
            }
            if (cursor.isNull(6)) {
                valueOf3 = null;
            } else {
                valueOf3 = Long.valueOf(cursor.getLong(6));
            }
            if (!cursor.isNull(7)) {
                if (cursor.getLong(7) == 1) {
                    z2 = true;
                }
                bool = Boolean.valueOf(z2);
            } else {
                bool = null;
            }
            if (!cursor.isNull(8)) {
                j11 = cursor.getLong(8);
            }
            C1460o c1460o = new C1460o(str2, str3, j6, j7, j11, j10, j5, valueOf, valueOf2, valueOf3, bool);
            if (cursor.moveToNext()) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.bravo(ar.e0(str2), "Got multiple records for event aggregates, expected one. appId");
            }
            cursor.close();
            return c1460o;
        }
        if (cursor != null) {
            cursor.close();
        }
        return null;
    }

    public final a1 z0(String str, long j5, byte[] bArr, String str2, String str3, int i4, int i5, long j6, long j7) {
        EnumC1472u0 enumC1472u0;
        boolean isEmpty = TextUtils.isEmpty(str2);
        G g2 = (G) this.alpha;
        if (isEmpty) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7635f.alpha("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            com.google.android.gms.internal.measurement.A0 a02 = (com.google.android.gms.internal.measurement.A0) au.C0(com.google.android.gms.internal.measurement.B0.oscar(), bArr);
            EnumC1472u0[] values = EnumC1472u0.values();
            int length = values.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    enumC1472u0 = values[i10];
                    if (enumC1472u0.alpha == i4) {
                        break;
                    }
                    i10++;
                } else {
                    enumC1472u0 = EnumC1472u0.UNKNOWN;
                    break;
                }
            }
            if (enumC1472u0 != EnumC1472u0.GOOGLE_SIGNAL && enumC1472u0 != EnumC1472u0.GOOGLE_SIGNAL_PENDING && i5 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.B0) a02.purple).tango()).iterator();
                while (it.hasNext()) {
                    com.google.android.gms.internal.measurement.C0 c02 = (com.google.android.gms.internal.measurement.C0) ((com.google.android.gms.internal.measurement.D0) it.next()).foxtrot();
                    c02.golf();
                    com.google.android.gms.internal.measurement.D0.m0((com.google.android.gms.internal.measurement.D0) c02.purple, i5);
                    arrayList.add((com.google.android.gms.internal.measurement.D0) c02.echo());
                }
                a02.golf();
                com.google.android.gms.internal.measurement.B0.whiskey((com.google.android.gms.internal.measurement.B0) a02.purple);
                a02.golf();
                com.google.android.gms.internal.measurement.B0.uniform((com.google.android.gms.internal.measurement.B0) a02.purple, arrayList);
            }
            HashMap hashMap = new HashMap();
            if (str3 != null) {
                String[] split = str3.split("\r\n");
                int length2 = split.length;
                int i11 = 0;
                while (true) {
                    if (i11 >= length2) {
                        break;
                    }
                    String str4 = split[i11];
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] split2 = str4.split("=", 2);
                    if (split2.length != 2) {
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.white.bravo(str4, "Invalid upload header: ");
                        break;
                    }
                    hashMap.put(split2[0], split2[1]);
                    i11++;
                }
            }
            return new a1(j5, (com.google.android.gms.internal.measurement.B0) a02.echo(), str2, hashMap, enumC1472u0, j6, j7, i5);
        } catch (IOException e4) {
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            arVar3.white.charlie(str, e4, "Failed to queued MeasurementBatch from upload_queue. appId");
            return null;
        }
    }
}
