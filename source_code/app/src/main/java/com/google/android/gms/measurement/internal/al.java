package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.SystemClock;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class al extends AbstractC1481z {
    public static final String[] teal = {"app_version", "ALTER TABLE messages ADD COLUMN app_version TEXT;", "app_version_int", "ALTER TABLE messages ADD COLUMN app_version_int INTEGER;"};
    public final C1448i red;
    public boolean silver;

    public al(G g2) {
        super(g2);
        this.red = new C1448i(this, ((G) this.alpha).alpha);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC1481z
    public final boolean Z() {
        return false;
    }

    public final SQLiteDatabase a0() {
        if (this.silver) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.red.getWritableDatabase();
        if (writableDatabase == null) {
            this.silver = true;
            return null;
        }
        return writableDatabase;
    }

    public final void b0() {
        int delete;
        G g2 = (G) this.alpha;
        W();
        try {
            SQLiteDatabase a02 = a0();
            if (a02 != null && (delete = a02.delete("messages", null, null)) > 0) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7636g.bravo(Integer.valueOf(delete), "Reset local analytics data. records");
            }
        } catch (SQLiteException e) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.white.bravo(e, "Error resetting local analytics data. error");
        }
    }

    public final void c0() {
        W();
        if (!this.silver) {
            G g2 = (G) this.alpha;
            if (g2.alpha.getDatabasePath("google_app_measurement_local.db").exists()) {
                int i4 = 5;
                for (int i5 = 0; i5 < 5; i5++) {
                    SQLiteDatabase sQLiteDatabase = null;
                    try {
                        SQLiteDatabase a02 = a0();
                        if (a02 == null) {
                            this.silver = true;
                            return;
                        }
                        a02.beginTransaction();
                        a02.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                        a02.setTransactionSuccessful();
                        a02.endTransaction();
                        a02.close();
                        return;
                    } catch (SQLiteDatabaseLockedException unused) {
                        SystemClock.sleep(i4);
                        i4 += 20;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    } catch (SQLiteFullException e) {
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.white.bravo(e, "Error deleting app launch break from local database");
                        this.silver = true;
                        if (0 == 0) {
                        }
                        sQLiteDatabase.close();
                    } catch (SQLiteException e4) {
                        if (0 != 0) {
                            try {
                                if (sQLiteDatabase.inTransaction()) {
                                    sQLiteDatabase.endTransaction();
                                }
                            } catch (Throwable th) {
                                if (0 != 0) {
                                    sQLiteDatabase.close();
                                }
                                throw th;
                            }
                        }
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.white.bravo(e4, "Error deleting app launch break from local database");
                        this.silver = true;
                        if (0 != 0) {
                            sQLiteDatabase.close();
                        }
                    }
                }
                ar arVar3 = g2.f7507b;
                G.foxtrot(arVar3);
                arVar3.f7632b.alpha("Error deleting app launch break from local database in reasonable time");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0125 A[Catch: all -> 0x0094, TRY_ENTER, TryCatch #8 {all -> 0x0094, blocks: (B:95:0x0089, B:97:0x008f, B:66:0x00a4, B:69:0x00ab, B:71:0x00c8, B:74:0x00d3, B:75:0x00fd, B:43:0x0125, B:45:0x012b, B:46:0x012e, B:34:0x015e, B:22:0x0149), top: B:94:0x0089 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d0(int i4, byte[] bArr) {
        zzr zzrVar;
        SQLiteDatabase sQLiteDatabase;
        boolean z2;
        boolean z10;
        Cursor cursor;
        W();
        boolean z11 = false;
        z11 = false;
        if (!this.silver) {
            G g2 = (G) this.alpha;
            C1440e c1440e = g2.yellow;
            ab abVar = ac.f7593e0;
            Cursor cursor2 = null;
            if (c1440e.j0(null, abVar)) {
                zzrVar = g2.india().a0(null);
            } else {
                zzrVar = null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put(Constants.KEY_TYPE, Integer.valueOf(i4));
            contentValues.put("entry", bArr);
            if (g2.yellow.j0(null, abVar) && zzrVar != null) {
                contentValues.put("app_version", zzrVar.red);
                contentValues.put("app_version_int", Long.valueOf(zzrVar.f7699c));
            }
            int i5 = 5;
            int i10 = 0;
            int i11 = 5;
            while (true) {
                ar arVar = g2.f7507b;
                if (i10 < i5) {
                    try {
                        sQLiteDatabase = a0();
                        if (sQLiteDatabase == null) {
                            this.silver = true;
                            break;
                        }
                        try {
                            sQLiteDatabase.beginTransaction();
                            cursor = sQLiteDatabase.rawQuery("select count(1) from messages", null);
                            long j5 = 0;
                            if (cursor != null) {
                                try {
                                    try {
                                        if (cursor.moveToFirst()) {
                                            j5 = cursor.getLong(z11 ? 1 : 0);
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        cursor2 = cursor;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        if (sQLiteDatabase != null) {
                                            sQLiteDatabase.close();
                                        }
                                        throw th;
                                    }
                                } catch (SQLiteDatabaseLockedException unused) {
                                    z2 = z11 ? 1 : 0;
                                    SystemClock.sleep(i11);
                                    i11 += 20;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i10++;
                                    z11 = z2;
                                    i5 = 5;
                                } catch (SQLiteFullException e) {
                                    e = e;
                                    z2 = z11 ? 1 : 0;
                                    G.foxtrot(arVar);
                                    arVar.white.bravo(e, "Error writing entry; local database full");
                                    this.silver = true;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i10++;
                                    z11 = z2;
                                    i5 = 5;
                                } catch (SQLiteException e4) {
                                    e = e4;
                                    z2 = z11 ? 1 : 0;
                                    z10 = true;
                                    if (sQLiteDatabase != null) {
                                    }
                                    G.foxtrot(arVar);
                                    arVar.white.bravo(e, "Error writing entry to local database");
                                    this.silver = z10;
                                    if (cursor != null) {
                                    }
                                    if (sQLiteDatabase == null) {
                                    }
                                    sQLiteDatabase.close();
                                    i10++;
                                    z11 = z2;
                                    i5 = 5;
                                }
                            }
                            if (j5 >= 100000) {
                                G.foxtrot(arVar);
                                a4.j jVar = arVar.white;
                                z2 = z11 ? 1 : 0;
                                try {
                                    try {
                                        jVar.alpha("Data loss, local db full");
                                        long j6 = 100001 - j5;
                                        long delete = sQLiteDatabase.delete("messages", "rowid in (select rowid from messages order by rowid asc limit ?)", new String[]{Long.toString(j6)});
                                        if (delete != j6) {
                                            G.foxtrot(arVar);
                                            z10 = true;
                                            try {
                                                jVar.delta("Different delete count than expected in local db. expected, received, difference", Long.valueOf(j6), Long.valueOf(delete), Long.valueOf(j6 - delete));
                                                sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                                                sQLiteDatabase.setTransactionSuccessful();
                                                sQLiteDatabase.endTransaction();
                                                if (cursor != null) {
                                                    cursor.close();
                                                }
                                                sQLiteDatabase.close();
                                                return z10;
                                            } catch (SQLiteFullException e5) {
                                                e = e5;
                                                G.foxtrot(arVar);
                                                arVar.white.bravo(e, "Error writing entry; local database full");
                                                this.silver = true;
                                                if (cursor != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i10++;
                                                z11 = z2;
                                                i5 = 5;
                                            } catch (SQLiteException e10) {
                                                e = e10;
                                                if (sQLiteDatabase != null) {
                                                    sQLiteDatabase.endTransaction();
                                                }
                                                G.foxtrot(arVar);
                                                arVar.white.bravo(e, "Error writing entry to local database");
                                                this.silver = z10;
                                                if (cursor != null) {
                                                }
                                                if (sQLiteDatabase == null) {
                                                }
                                                sQLiteDatabase.close();
                                                i10++;
                                                z11 = z2;
                                                i5 = 5;
                                            }
                                        }
                                    } catch (SQLiteDatabaseLockedException unused2) {
                                        SystemClock.sleep(i11);
                                        i11 += 20;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        if (sQLiteDatabase == null) {
                                            i10++;
                                            z11 = z2;
                                            i5 = 5;
                                        }
                                        sQLiteDatabase.close();
                                        i10++;
                                        z11 = z2;
                                        i5 = 5;
                                    }
                                } catch (SQLiteFullException e11) {
                                    e = e11;
                                    G.foxtrot(arVar);
                                    arVar.white.bravo(e, "Error writing entry; local database full");
                                    this.silver = true;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i10++;
                                        z11 = z2;
                                        i5 = 5;
                                    }
                                    sQLiteDatabase.close();
                                    i10++;
                                    z11 = z2;
                                    i5 = 5;
                                } catch (SQLiteException e12) {
                                    e = e12;
                                    z10 = true;
                                    if (sQLiteDatabase != null && sQLiteDatabase.inTransaction()) {
                                        sQLiteDatabase.endTransaction();
                                    }
                                    G.foxtrot(arVar);
                                    arVar.white.bravo(e, "Error writing entry to local database");
                                    this.silver = z10;
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    if (sQLiteDatabase == null) {
                                        i10++;
                                        z11 = z2;
                                        i5 = 5;
                                    }
                                    sQLiteDatabase.close();
                                    i10++;
                                    z11 = z2;
                                    i5 = 5;
                                }
                            } else {
                                z2 = z11 ? 1 : 0;
                            }
                            z10 = true;
                            sQLiteDatabase.insertOrThrow("messages", null, contentValues);
                            sQLiteDatabase.setTransactionSuccessful();
                            sQLiteDatabase.endTransaction();
                            if (cursor != null) {
                            }
                            sQLiteDatabase.close();
                            return z10;
                        } catch (SQLiteDatabaseLockedException unused3) {
                            z2 = z11 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteFullException e13) {
                            e = e13;
                            z2 = z11 ? 1 : 0;
                            cursor = null;
                        } catch (SQLiteException e14) {
                            e = e14;
                            z2 = z11 ? 1 : 0;
                            z10 = true;
                            cursor = null;
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    } catch (SQLiteDatabaseLockedException unused4) {
                        z2 = z11 ? 1 : 0;
                        sQLiteDatabase = null;
                        cursor = null;
                    } catch (SQLiteFullException e15) {
                        e = e15;
                        z2 = z11 ? 1 : 0;
                        sQLiteDatabase = null;
                        cursor = null;
                    } catch (SQLiteException e16) {
                        e = e16;
                        z2 = z11 ? 1 : 0;
                        z10 = true;
                        sQLiteDatabase = null;
                        cursor = null;
                    } catch (Throwable th3) {
                        th = th3;
                        sQLiteDatabase = null;
                    }
                } else {
                    boolean z12 = z11 ? 1 : 0;
                    G.foxtrot(arVar);
                    arVar.f7636g.alpha("Failed to write entry to local database");
                    return z12;
                }
                i10++;
                z11 = z2;
                i5 = 5;
            }
        }
        return z11;
    }
}
