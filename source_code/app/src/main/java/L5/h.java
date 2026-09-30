package L5;

import A2.p;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.clevertap.android.sdk.db.Column;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class h implements d, M5.b, c, AutoCloseable {
    public static final B5.c white = new B5.c("proto");
    public final j alpha;
    public final N5.a purple;
    public final N5.a red;
    public final a silver;
    public final Kd.a teal;

    public h(N5.a aVar, N5.a aVar2, a aVar3, j jVar, Kd.a aVar4) {
        this.alpha = jVar;
        this.purple = aVar;
        this.red = aVar2;
        this.silver = aVar3;
        this.teal = aVar4;
    }

    public static Long echo(SQLiteDatabase sQLiteDatabase, E5.i iVar) {
        Long valueOf;
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(iVar.alpha, String.valueOf(O5.a.alpha(iVar.charlie))));
        byte[] bArr = iVar.bravo;
        if (bArr != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb2.append(" and extras is null");
        }
        Cursor query = sQLiteDatabase.query("transport_contexts", new String[]{Column.ID}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            if (!query.moveToNext()) {
                valueOf = null;
            } else {
                valueOf = Long.valueOf(query.getLong(0));
            }
            return valueOf;
        } finally {
            query.close();
        }
    }

    public static String quebec(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((b) it.next()).alpha);
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    public static Object uniform(Cursor cursor, f fVar) {
        try {
            return fVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public final SQLiteDatabase charlie() {
        j jVar = this.alpha;
        Objects.requireNonNull(jVar);
        N5.a aVar = this.red;
        long time = aVar.getTime();
        while (true) {
            try {
                return jVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar.getTime() < this.silver.charlie + time) {
                    SystemClock.sleep(50L);
                } else {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.alpha.close();
    }

    public final Object foxtrot(f fVar) {
        SQLiteDatabase charlie = charlie();
        charlie.beginTransaction();
        try {
            Object apply = fVar.apply(charlie);
            charlie.setTransactionSuccessful();
            return apply;
        } finally {
            charlie.endTransaction();
        }
    }

    public final ArrayList golf(SQLiteDatabase sQLiteDatabase, E5.i iVar, int i4) {
        ArrayList arrayList = new ArrayList();
        Long echo = echo(sQLiteDatabase, iVar);
        if (echo == null) {
            return arrayList;
        }
        uniform(sQLiteDatabase.query("events", new String[]{Column.ID, "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{echo.toString()}, null, null, null, String.valueOf(i4)), new p(this, arrayList, iVar, 7));
        return arrayList;
    }

    public final void juliet(long j5, H5.c cVar, String str) {
        foxtrot(new F8.h(str, cVar, j5));
    }

    public final Object papa(M5.a aVar) {
        SQLiteDatabase charlie = charlie();
        N5.a aVar2 = this.red;
        long time = aVar2.getTime();
        while (true) {
            try {
                charlie.beginTransaction();
                try {
                    Object execute = aVar.execute();
                    charlie.setTransactionSuccessful();
                    return execute;
                } finally {
                    charlie.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (aVar2.getTime() < this.silver.charlie + time) {
                    SystemClock.sleep(50L);
                } else {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
            }
        }
    }
}
