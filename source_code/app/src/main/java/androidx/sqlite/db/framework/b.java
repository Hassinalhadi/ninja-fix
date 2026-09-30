package androidx.sqlite.db.framework;

import Af.t;
import U.o;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.database.sqlite.SQLiteStatement;
import java.io.Closeable;
import kotlin.jvm.internal.Intrinsics;
import s2.InterfaceC2596d;

/* loaded from: classes3.dex */
public final class b implements AutoCloseable, Closeable {
    public static final String[] purple = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] red = new String[0];
    public final SQLiteDatabase alpha;

    public b(SQLiteDatabase sQLiteDatabase) {
        this.alpha = sQLiteDatabase;
    }

    public final Cursor azure(String query) {
        Intrinsics.echo(query, "query");
        return beige(new t(query));
    }

    public final Cursor beige(InterfaceC2596d interfaceC2596d) {
        final o oVar = new o(1, interfaceC2596d);
        Cursor rawQueryWithFactory = this.alpha.rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: androidx.sqlite.db.framework.a
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) o.this.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, interfaceC2596d.echo(), red, null);
        Intrinsics.delta(rawQueryWithFactory, "delegate.rawQueryWithFac…EMPTY_STRING_ARRAY, null)");
        return rawQueryWithFactory;
    }

    public final void blue() {
        this.alpha.setTransactionSuccessful();
    }

    public final void charlie() {
        this.alpha.beginTransaction();
    }

    @Override // java.lang.AutoCloseable, java.io.Closeable
    public final void close() {
        this.alpha.close();
    }

    public final void echo() {
        this.alpha.beginTransactionNonExclusive();
    }

    public final i foxtrot(String str) {
        SQLiteStatement compileStatement = this.alpha.compileStatement(str);
        Intrinsics.delta(compileStatement, "delegate.compileStatement(sql)");
        return new i(compileStatement);
    }

    public final void golf() {
        this.alpha.endTransaction();
    }

    public final void juliet(String sql) {
        Intrinsics.echo(sql, "sql");
        this.alpha.execSQL(sql);
    }

    public final void papa(Object[] bindArgs) {
        Intrinsics.echo(bindArgs, "bindArgs");
        this.alpha.execSQL("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", bindArgs);
    }

    public final boolean quebec() {
        return this.alpha.inTransaction();
    }

    public final boolean uniform() {
        SQLiteDatabase sQLiteDatabase = this.alpha;
        Intrinsics.echo(sQLiteDatabase, "sQLiteDatabase");
        return sQLiteDatabase.isWriteAheadLoggingEnabled();
    }
}
