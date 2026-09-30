package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import androidx.recyclerview.widget.C0665j;
import com.google.android.gms.internal.measurement.C1317f3;
import e6.C1629a;

/* renamed from: com.google.android.gms.measurement.internal.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1448i extends SQLiteOpenHelper {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ G3.a purple;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1448i(C1450j c1450j, Context context) {
        this(context, "google_app_measurement.db");
        this.alpha = 0;
        this.purple = c1450j;
    }

    private final void charlie(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    private final void echo(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    private final void foxtrot(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    private final void golf(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        switch (this.alpha) {
            case 0:
                C1450j c1450j = (C1450j) this.purple;
                C0665j c0665j = c1450j.teal;
                G g2 = (G) c1450j.alpha;
                g2.getClass();
                if (c0665j.purple != 0) {
                    ((C1629a) c0665j.red).getClass();
                    if (SystemClock.elapsedRealtime() - c0665j.purple < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    C0665j c0665j2 = c1450j.teal;
                    ((C1629a) c0665j2.red).getClass();
                    c0665j2.purple = SystemClock.elapsedRealtime();
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.white.alpha("Opening the database failed, dropping and recreating it");
                    if (!g2.alpha.getDatabasePath("google_app_measurement.db").delete()) {
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.white.bravo("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        c0665j2.purple = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        ar arVar3 = g2.f7507b;
                        G.foxtrot(arVar3);
                        arVar3.white.bravo(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e4) {
                    throw e4;
                } catch (SQLiteException unused2) {
                    al alVar = (al) this.purple;
                    G g5 = (G) alVar.alpha;
                    ar arVar4 = g5.f7507b;
                    G.foxtrot(arVar4);
                    arVar4.white.alpha("Opening the local database failed, dropping and recreating it");
                    if (!g5.alpha.getDatabasePath("google_app_measurement_local.db").delete()) {
                        ar arVar5 = g5.f7507b;
                        G.foxtrot(arVar5);
                        arVar5.white.bravo("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e5) {
                        ar arVar6 = ((G) alVar.alpha).f7507b;
                        G.foxtrot(arVar6);
                        arVar6.white.bravo(e5, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        switch (this.alpha) {
            case 0:
                ar arVar = ((G) ((C1450j) this.purple).alpha).f7507b;
                G.foxtrot(arVar);
                W.foxtrot(arVar, sQLiteDatabase);
                return;
            default:
                ar arVar2 = ((G) ((al) this.purple).alpha).f7507b;
                G.foxtrot(arVar2);
                W.foxtrot(arVar2, sQLiteDatabase);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        int i10 = this.alpha;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        switch (this.alpha) {
            case 0:
                G g2 = (G) ((C1450j) this.purple).alpha;
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                W.charlie(arVar, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C1450j.white);
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C1450j.f7665a);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C1450j.f7666b);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C1450j.f7668d);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C1450j.f7667c);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C1450j.e);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C1450j.f7669f);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C1450j.f7670g);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", C1450j.f7671h);
                C1317f3.bravo();
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", C1450j.f7672i);
                G.foxtrot(arVar2);
                W.charlie(arVar2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", C1450j.yellow);
                return;
            default:
                ar arVar3 = ((G) ((al) this.purple).alpha).f7507b;
                G.foxtrot(arVar3);
                W.charlie(arVar3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", al.teal);
                return;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i4, int i5) {
        int i10 = this.alpha;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C1448i(al alVar, Context context) {
        this(context, "google_app_measurement_local.db");
        this.alpha = 1;
        this.purple = alVar;
    }

    public C1448i(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }
}
