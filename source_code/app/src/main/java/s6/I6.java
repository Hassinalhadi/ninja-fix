package s6;

import android.database.Cursor;
import com.clevertap.android.sdk.Constants;
import java.util.Collection;
import java.util.List;
import java.util.TreeMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import n2.C2155c;
import n2.C2156d;

/* loaded from: classes2.dex */
public abstract class I6 {
    public static final /* synthetic */ int alpha = 0;

    public static final List alpha(Cursor cursor) {
        int columnIndex = cursor.getColumnIndex(Constants.KEY_ID);
        int columnIndex2 = cursor.getColumnIndex("seq");
        int columnIndex3 = cursor.getColumnIndex("from");
        int columnIndex4 = cursor.getColumnIndex("to");
        Ld.c hotel = kotlin.collections.ab.hotel();
        while (cursor.moveToNext()) {
            int i4 = cursor.getInt(columnIndex);
            int i5 = cursor.getInt(columnIndex2);
            String string = cursor.getString(columnIndex3);
            Intrinsics.delta(string, "cursor.getString(fromColumnIndex)");
            String string2 = cursor.getString(columnIndex4);
            Intrinsics.delta(string2, "cursor.getString(toColumnIndex)");
            hotel.add(new C2155c(string, i4, i5, string2));
        }
        return CollectionsKt.o(kotlin.collections.ab.alpha(hotel));
    }

    public static final C2156d bravo(androidx.sqlite.db.framework.b bVar, String str, boolean z2) {
        String str2;
        Cursor azure = bVar.azure("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int columnIndex = azure.getColumnIndex("seqno");
            int columnIndex2 = azure.getColumnIndex("cid");
            int columnIndex3 = azure.getColumnIndex("name");
            int columnIndex4 = azure.getColumnIndex("desc");
            if (columnIndex != -1 && columnIndex2 != -1 && columnIndex3 != -1 && columnIndex4 != -1) {
                TreeMap treeMap = new TreeMap();
                TreeMap treeMap2 = new TreeMap();
                while (azure.moveToNext()) {
                    if (azure.getInt(columnIndex2) >= 0) {
                        int i4 = azure.getInt(columnIndex);
                        String columnName = azure.getString(columnIndex3);
                        if (azure.getInt(columnIndex4) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        Integer valueOf = Integer.valueOf(i4);
                        Intrinsics.delta(columnName, "columnName");
                        treeMap.put(valueOf, columnName);
                        treeMap2.put(Integer.valueOf(i4), str2);
                    }
                }
                Collection values = treeMap.values();
                Intrinsics.delta(values, "columnsMap.values");
                List z10 = CollectionsKt.z(values);
                Collection values2 = treeMap2.values();
                Intrinsics.delta(values2, "ordersMap.values");
                C2156d c2156d = new C2156d(str, z2, z10, CollectionsKt.z(values2));
                azure.close();
                return c2156d;
            }
            azure.close();
            return null;
        } finally {
        }
    }
}
