package androidx.sqlite.db.framework;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import t2.C2955a;
import t6.F3;

/* loaded from: classes3.dex */
public final class f extends SQLiteOpenHelper implements AutoCloseable {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3133a = 0;
    public final Context alpha;
    public final c purple;
    public final B0.a red;
    public final boolean silver;
    public boolean teal;
    public final C2955a white;
    public boolean yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, final c cVar, final B0.a callback, boolean z2) {
        super(context, str, null, callback.bravo, new DatabaseErrorHandler() { // from class: androidx.sqlite.db.framework.d
            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase dbObj) {
                B0.a callback2 = B0.a.this;
                Intrinsics.echo(callback2, "$callback");
                c cVar2 = cVar;
                int i4 = f.f3133a;
                Intrinsics.delta(dbObj, "dbObj");
                b alpha = F3.alpha(cVar2, dbObj);
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + alpha + ".path");
                SQLiteDatabase sQLiteDatabase = alpha.alpha;
                if (!sQLiteDatabase.isOpen()) {
                    String path = sQLiteDatabase.getPath();
                    if (path != null) {
                        B0.a.delta(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> list = null;
                try {
                    try {
                        list = sQLiteDatabase.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        alpha.close();
                    } catch (IOException unused2) {
                    }
                } finally {
                    if (list != null) {
                        Iterator<T> it = list.iterator();
                        while (it.hasNext()) {
                            Object obj = ((Pair) it.next()).second;
                            Intrinsics.delta(obj, "p.second");
                            B0.a.delta((String) obj);
                        }
                    } else {
                        String path2 = sQLiteDatabase.getPath();
                        if (path2 != null) {
                            B0.a.delta(path2);
                        }
                    }
                }
            }
        });
        String str2;
        Intrinsics.echo(callback, "callback");
        this.alpha = context;
        this.purple = cVar;
        this.red = callback;
        this.silver = z2;
        if (str == null) {
            str2 = UUID.randomUUID().toString();
            Intrinsics.delta(str2, "randomUUID().toString()");
        } else {
            str2 = str;
        }
        this.white = new C2955a(str2, context.getCacheDir(), false);
    }

    public final b charlie(boolean z2) {
        boolean z10;
        C2955a c2955a = this.white;
        try {
            if (!this.yellow && getDatabaseName() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            c2955a.alpha(z10);
            this.teal = false;
            SQLiteDatabase foxtrot = foxtrot(z2);
            if (this.teal) {
                close();
                b charlie = charlie(z2);
                c2955a.bravo();
                return charlie;
            }
            b alpha = F3.alpha(this.purple, foxtrot);
            c2955a.bravo();
            return alpha;
        } catch (Throwable th) {
            c2955a.bravo();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        C2955a c2955a = this.white;
        try {
            c2955a.alpha(c2955a.alpha);
            super.close();
            this.purple.alpha = null;
            this.yellow = false;
        } finally {
            c2955a.bravo();
        }
    }

    public final SQLiteDatabase echo(boolean z2) {
        if (z2) {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            Intrinsics.delta(writableDatabase, "{\n                super.…eDatabase()\n            }");
            return writableDatabase;
        }
        SQLiteDatabase readableDatabase = getReadableDatabase();
        Intrinsics.delta(readableDatabase, "{\n                super.…eDatabase()\n            }");
        return readableDatabase;
    }

    public final SQLiteDatabase foxtrot(boolean z2) {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z10 = this.yellow;
        Context context = this.alpha;
        if (databaseName != null && !z10 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            return echo(z2);
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                return echo(z2);
            } catch (Throwable th) {
                super.close();
                if (th instanceof FrameworkSQLiteOpenHelper$OpenHelper$CallbackException) {
                    FrameworkSQLiteOpenHelper$OpenHelper$CallbackException frameworkSQLiteOpenHelper$OpenHelper$CallbackException = th;
                    Throwable cause = frameworkSQLiteOpenHelper$OpenHelper$CallbackException.getCause();
                    int ordinal = frameworkSQLiteOpenHelper$OpenHelper$CallbackException.getCallbackName().ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                if (ordinal != 3) {
                                    if (!(cause instanceof SQLiteException)) {
                                        throw cause;
                                    }
                                } else {
                                    throw cause;
                                }
                            } else {
                                throw cause;
                            }
                        } else {
                            throw cause;
                        }
                    } else {
                        throw cause;
                    }
                } else if (th instanceof SQLiteException) {
                    if (databaseName == null || !this.silver) {
                        throw th;
                    }
                } else {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return echo(z2);
                } catch (FrameworkSQLiteOpenHelper$OpenHelper$CallbackException e) {
                    throw e.getCause();
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase db2) {
        Intrinsics.echo(db2, "db");
        boolean z2 = this.teal;
        B0.a aVar = this.red;
        if (!z2 && aVar.bravo != db2.getVersion()) {
            db2.setMaxSqlCacheSize(1);
        }
        try {
            F3.alpha(this.purple, db2);
            aVar.getClass();
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(e.alpha, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.echo(sqLiteDatabase, "sqLiteDatabase");
        try {
            this.red.india(F3.alpha(this.purple, sqLiteDatabase));
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(e.purple, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase db2, int i4, int i5) {
        Intrinsics.echo(db2, "db");
        this.teal = true;
        try {
            this.red.kilo(F3.alpha(this.purple, db2), i4, i5);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(e.silver, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase db2) {
        Intrinsics.echo(db2, "db");
        if (!this.teal) {
            try {
                this.red.juliet(F3.alpha(this.purple, db2));
            } catch (Throwable th) {
                throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(e.teal, th);
            }
        }
        this.yellow = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i4, int i5) {
        Intrinsics.echo(sqLiteDatabase, "sqLiteDatabase");
        this.teal = true;
        try {
            this.red.kilo(F3.alpha(this.purple, sqLiteDatabase), i4, i5);
        } catch (Throwable th) {
            throw new FrameworkSQLiteOpenHelper$OpenHelper$CallbackException(e.red, th);
        }
    }
}
