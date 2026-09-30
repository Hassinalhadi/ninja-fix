package s6;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s6.p0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2737p0 {
    public static Typeface alpha(Configuration configuration, Typeface typeface) {
        int weight;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31 && g3.z.charlie(configuration) != Integer.MAX_VALUE && g3.z.charlie(configuration) != 0 && typeface != null) {
            weight = typeface.getWeight();
            create = Typeface.create(typeface, O6.c.bravo(g3.z.charlie(configuration) + weight, 1, 1000), typeface.isItalic());
            return create;
        }
        return null;
    }

    public static final void bravo(Context context) {
        String str;
        Intrinsics.echo(context, "context");
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        Intrinsics.delta(databasePath, "context.getDatabasePath(WORK_DATABASE_NAME)");
        if (databasePath.exists()) {
            A2.z.echo().alpha(B2.u.alpha, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            Intrinsics.delta(databasePath2, "context.getDatabasePath(WORK_DATABASE_NAME)");
            File noBackupFilesDir = context.getNoBackupFilesDir();
            Intrinsics.delta(noBackupFilesDir, "context.noBackupFilesDir");
            File file = new File(noBackupFilesDir, "androidx.work.workdb");
            String[] strArr = B2.u.bravo;
            int quebec = kotlin.collections.y.quebec(strArr.length);
            if (quebec < 16) {
                quebec = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(quebec);
            for (String str2 : strArr) {
                Pair pair = new Pair(new File(databasePath2.getPath() + str2), new File(file.getPath() + str2));
                linkedHashMap.put(pair.getFirst(), pair.getSecond());
            }
            for (Map.Entry entry : kotlin.collections.y.victor(linkedHashMap, new Pair(databasePath2, file)).entrySet()) {
                File file2 = (File) entry.getKey();
                File file3 = (File) entry.getValue();
                if (file2.exists()) {
                    if (file3.exists()) {
                        A2.z.echo().hotel(B2.u.alpha, "Over-writing contents of " + file3);
                    }
                    if (file2.renameTo(file3)) {
                        str = "Migrated " + file2 + "to " + file3;
                    } else {
                        str = "Renaming " + file2 + " to " + file3 + " failed";
                    }
                    A2.z.echo().alpha(B2.u.alpha, str);
                }
            }
        }
    }
}
