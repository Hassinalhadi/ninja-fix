package t6;

import android.database.sqlite.SQLiteDatabase;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class F3 {
    public static androidx.sqlite.db.framework.b alpha(androidx.sqlite.db.framework.c refHolder, SQLiteDatabase sQLiteDatabase) {
        Intrinsics.echo(refHolder, "refHolder");
        androidx.sqlite.db.framework.b bVar = refHolder.alpha;
        if (bVar != null && Intrinsics.areEqual(bVar.alpha, sQLiteDatabase)) {
            return bVar;
        }
        androidx.sqlite.db.framework.b bVar2 = new androidx.sqlite.db.framework.b(sQLiteDatabase);
        refHolder.alpha = bVar2;
        return bVar2;
    }
}
