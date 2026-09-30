package androidx.sqlite.db.framework;

import android.database.sqlite.SQLiteStatement;
import s2.InterfaceC2595c;

/* loaded from: classes3.dex */
public final class i extends h implements InterfaceC2595c {
    public final SQLiteStatement purple;

    public i(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.purple = sQLiteStatement;
    }

    public final int charlie() {
        return this.purple.executeUpdateDelete();
    }
}
