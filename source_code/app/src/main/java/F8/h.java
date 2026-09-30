package F8;

import R7.K;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.camera.core.impl.ai;
import bd.ScheduledExecutorServiceC0750c;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.tasks.Task;
import i8.InterfaceC1903a;
import i8.InterfaceC1904b;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements G6.c, M5.a, L5.f, InterfaceC1903a, V0.i {
    public final /* synthetic */ long alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ h(Object obj, long j5, Object obj2) {
        this.purple = obj;
        this.alpha = j5;
        this.red = obj2;
    }

    @Override // L5.f, be.InterfaceC0755a
    public Object apply(Object obj) {
        boolean z2;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i4 = ((H5.c) this.red).alpha;
        String num = Integer.toString(i4);
        String str = (String) this.purple;
        Cursor rawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, num});
        try {
            if (rawQuery.getCount() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            rawQuery.close();
            long j5 = this.alpha;
            if (!z2) {
                ContentValues contentValues = new ContentValues();
                contentValues.put("log_source", str);
                contentValues.put("reason", Integer.valueOf(i4));
                contentValues.put("events_dropped_count", Long.valueOf(j5));
                sQLiteDatabase.insert("log_event_dropped", null, contentValues);
                return null;
            }
            sQLiteDatabase.execSQL(com.google.android.material.datepicker.j.kilo("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", j5, " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i4)});
            return null;
        } catch (Throwable th) {
            rawQuery.close();
            throw th;
        }
    }

    @Override // V0.i
    public Object black(final V0.h hVar) {
        final com.google.common.util.concurrent.e eVar = (com.google.common.util.concurrent.e) this.purple;
        be.h.echo(true, eVar, hVar, tg.k.bravo());
        if (!eVar.isDone()) {
            final long j5 = this.alpha;
            eVar.foxtrot(new ai(10, ((ScheduledExecutorServiceC0750c) this.red).schedule(new Callable() { // from class: be.e
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(V0.h.this.delta(new TimeoutException("Future[" + eVar + "] is not done within " + j5 + " ms.")));
                }
            }, j5, TimeUnit.MILLISECONDS)), tg.k.bravo());
        }
        return "TimeoutFuture[" + eVar + Constants.AES_SUFFIX;
    }

    @Override // i8.InterfaceC1903a
    public void delta(InterfaceC1904b interfaceC1904b) {
        ((L7.a) interfaceC1904b.get()).delta((String) this.purple, this.alpha, (K) this.red);
    }

    @Override // M5.a
    public Object execute() {
        K5.i iVar = (K5.i) this.purple;
        long time = iVar.golf.getTime() + this.alpha;
        L5.h hVar = (L5.h) iVar.charlie;
        E5.i iVar2 = (E5.i) this.red;
        hVar.getClass();
        hVar.foxtrot(new L5.e(time, iVar2));
        return null;
    }

    @Override // G6.c
    public Object ivory(Task task) {
        return ((j) this.purple).charlie(task, this.alpha, (HashMap) this.red);
    }

    public /* synthetic */ h(Object obj, Object obj2, long j5) {
        this.purple = obj;
        this.red = obj2;
        this.alpha = j5;
    }
}
