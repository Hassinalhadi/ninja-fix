package J7;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements g, M5.a {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ long red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;

    public /* synthetic */ c(f fVar, Object obj, long j5, TimeUnit timeUnit, int i4) {
        this.alpha = i4;
        this.purple = fVar;
        this.teal = obj;
        this.red = j5;
        this.silver = timeUnit;
    }

    @Override // J7.g
    public ScheduledFuture alpha(D8.c cVar) {
        switch (this.alpha) {
            case 0:
                f fVar = (f) this.purple;
                return fVar.purple.schedule(new e(fVar, (Runnable) this.teal, cVar, 1), this.red, (TimeUnit) this.silver);
            default:
                f fVar2 = (f) this.purple;
                return fVar2.purple.schedule(new B2.e(fVar2, (Callable) this.teal, cVar, 1), this.red, (TimeUnit) this.silver);
        }
    }

    @Override // M5.a
    public Object execute() {
        K5.i iVar = (K5.i) this.purple;
        L5.h hVar = (L5.h) iVar.charlie;
        hVar.getClass();
        Iterable iterable = (Iterable) this.teal;
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + L5.h.quebec(iterable);
            SQLiteDatabase charlie = hVar.charlie();
            charlie.beginTransaction();
            try {
                charlie.compileStatement(str).execute();
                Cursor rawQuery = charlie.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (rawQuery.moveToNext()) {
                    try {
                        hVar.juliet(rawQuery.getInt(0), H5.c.MAX_RETRIES_REACHED, rawQuery.getString(1));
                    } catch (Throwable th) {
                        rawQuery.close();
                        throw th;
                    }
                }
                rawQuery.close();
                charlie.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                charlie.setTransactionSuccessful();
            } finally {
                charlie.endTransaction();
            }
        }
        hVar.foxtrot(new L5.e(iVar.golf.getTime() + this.red, (E5.i) this.silver));
        return null;
    }

    public /* synthetic */ c(K5.i iVar, Iterable iterable, E5.i iVar2, long j5) {
        this.alpha = 2;
        this.purple = iVar;
        this.teal = iterable;
        this.silver = iVar2;
        this.red = j5;
    }
}
