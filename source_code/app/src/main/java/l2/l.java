package l2;

import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.work.impl.WorkDatabase_Impl;
import com.google.android.material.internal.ab;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l {
    public static final String[] november = {"UPDATE", "DELETE", "INSERT"};
    public final WorkDatabase_Impl alpha;
    public final HashMap bravo;
    public final HashMap charlie;
    public final LinkedHashMap delta;
    public final String[] echo;
    public final AtomicBoolean foxtrot = new AtomicBoolean(false);
    public volatile boolean golf;
    public volatile androidx.sqlite.db.framework.i hotel;
    public final C3.d india;
    public final aq.f juliet;
    public final Object kilo;
    public final Object lima;
    public final F6.b mike;

    public l(WorkDatabase_Impl workDatabase_Impl, HashMap hashMap, HashMap hashMap2, String... strArr) {
        String str;
        this.alpha = workDatabase_Impl;
        this.bravo = hashMap;
        this.charlie = hashMap2;
        this.india = new C3.d(strArr.length);
        Intrinsics.delta(Collections.newSetFromMap(new IdentityHashMap()), "newSetFromMap(IdentityHashMap())");
        this.juliet = new aq.f();
        this.kilo = new Object();
        this.lima = new Object();
        this.delta = new LinkedHashMap();
        int length = strArr.length;
        String[] strArr2 = new String[length];
        for (int i4 = 0; i4 < length; i4++) {
            String str2 = strArr[i4];
            Locale US = Locale.US;
            Intrinsics.delta(US, "US");
            String lowerCase = str2.toLowerCase(US);
            Intrinsics.delta(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            this.delta.put(lowerCase, Integer.valueOf(i4));
            String str3 = (String) this.bravo.get(strArr[i4]);
            if (str3 != null) {
                str = str3.toLowerCase(US);
                Intrinsics.delta(str, "this as java.lang.String).toLowerCase(locale)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr2[i4] = lowerCase;
        }
        this.echo = strArr2;
        for (Map.Entry entry : this.bravo.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale US2 = Locale.US;
            Intrinsics.delta(US2, "US");
            String lowerCase2 = str4.toLowerCase(US2);
            Intrinsics.delta(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (this.delta.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(US2);
                Intrinsics.delta(lowerCase3, "this as java.lang.String).toLowerCase(locale)");
                LinkedHashMap linkedHashMap = this.delta;
                linkedHashMap.put(lowerCase3, y.papa(linkedHashMap, lowerCase2));
            }
        }
        this.mike = new F6.b(27, this);
    }

    public final boolean alpha() {
        boolean z2;
        androidx.sqlite.db.framework.b bVar = this.alpha.alpha;
        if (bVar != null && bVar.alpha.isOpen()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            return false;
        }
        if (!this.golf) {
            this.alpha.hotel().lime();
        }
        if (this.golf) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public final void bravo(ab abVar) {
        k kVar;
        WorkDatabase_Impl workDatabase_Impl;
        androidx.sqlite.db.framework.b bVar;
        synchronized (this.juliet) {
            kVar = (k) this.juliet.delta(abVar);
        }
        if (kVar != null) {
            C3.d dVar = this.india;
            int[] iArr = kVar.bravo;
            if (dVar.kilo(Arrays.copyOf(iArr, iArr.length)) && (bVar = (workDatabase_Impl = this.alpha).alpha) != null && bVar.alpha.isOpen()) {
                delta(workDatabase_Impl.hotel().lime());
            }
        }
    }

    public final void charlie(androidx.sqlite.db.framework.b bVar, int i4) {
        bVar.juliet("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i4 + ", 0)");
        String str = this.echo[i4];
        String[] strArr = november;
        for (int i5 = 0; i5 < 3; i5++) {
            String str2 = strArr[i5];
            String str3 = "CREATE TEMP TRIGGER IF NOT EXISTS " + j.alpha(str, str2) + " AFTER " + str2 + " ON `" + str + "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = " + i4 + " AND invalidated = 0; END";
            Intrinsics.delta(str3, "StringBuilder().apply(builderAction).toString()");
            bVar.juliet(str3);
        }
    }

    public final void delta(androidx.sqlite.db.framework.b database) {
        Intrinsics.echo(database, "database");
        if (!database.quebec()) {
            try {
                ReentrantReadWriteLock.ReadLock readLock = this.alpha.hotel.readLock();
                Intrinsics.delta(readLock, "readWriteLock.readLock()");
                readLock.lock();
                try {
                    synchronized (this.kilo) {
                        int[] foxtrot = this.india.foxtrot();
                        if (foxtrot != null) {
                            if (database.uniform()) {
                                database.echo();
                            } else {
                                database.charlie();
                            }
                            try {
                                int length = foxtrot.length;
                                int i4 = 0;
                                int i5 = 0;
                                while (i4 < length) {
                                    int i10 = foxtrot[i4];
                                    int i11 = i5 + 1;
                                    if (i10 != 1) {
                                        if (i10 == 2) {
                                            String str = this.echo[i5];
                                            String[] strArr = november;
                                            for (int i12 = 0; i12 < 3; i12++) {
                                                String str2 = "DROP TRIGGER IF EXISTS " + j.alpha(str, strArr[i12]);
                                                Intrinsics.delta(str2, "StringBuilder().apply(builderAction).toString()");
                                                database.juliet(str2);
                                            }
                                        }
                                    } else {
                                        charlie(database, i5);
                                    }
                                    i4++;
                                    i5 = i11;
                                }
                                database.blue();
                                database.golf();
                            } catch (Throwable th) {
                                database.golf();
                                throw th;
                            }
                        }
                    }
                } finally {
                    readLock.unlock();
                }
            } catch (SQLiteException e) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (IllegalStateException e4) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e4);
            }
        }
    }
}
