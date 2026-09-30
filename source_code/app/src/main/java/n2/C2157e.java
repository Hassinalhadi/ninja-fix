package n2;

import Ld.g;
import Ld.j;
import android.database.Cursor;
import com.clevertap.android.sdk.Constants;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.ab;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import s6.I6;

/* renamed from: n2.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2157e {
    public final String alpha;
    public final Object bravo;
    public final AbstractSet charlie;
    public final AbstractSet delta;

    public C2157e(String str, Map map, AbstractSet foreignKeys, AbstractSet abstractSet) {
        Intrinsics.echo(foreignKeys, "foreignKeys");
        this.alpha = str;
        this.bravo = map;
        this.charlie = foreignKeys;
        this.delta = abstractSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:70:0x01db, code lost:
    
        r9 = kotlin.collections.ab.bravo(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x01df, code lost:
    
        r3.close();
     */
    /* JADX WARN: Finally extract failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C2157e alpha(androidx.sqlite.db.framework.b bVar, String str) {
        Map bravo;
        boolean z2;
        boolean z10;
        Cursor azure = bVar.azure("PRAGMA table_info(`" + str + "`)");
        try {
            if (azure.getColumnCount() <= 0) {
                bravo = t.alpha;
                azure.close();
            } else {
                int columnIndex = azure.getColumnIndex("name");
                int columnIndex2 = azure.getColumnIndex(Constants.KEY_TYPE);
                int columnIndex3 = azure.getColumnIndex("notnull");
                int columnIndex4 = azure.getColumnIndex("pk");
                int columnIndex5 = azure.getColumnIndex("dflt_value");
                g gVar = new g();
                while (azure.moveToNext()) {
                    String name = azure.getString(columnIndex);
                    String type = azure.getString(columnIndex2);
                    if (azure.getInt(columnIndex3) != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i4 = azure.getInt(columnIndex4);
                    String string = azure.getString(columnIndex5);
                    Intrinsics.delta(name, "name");
                    Intrinsics.delta(type, "type");
                    gVar.put(name, new C2153a(name, type, z2, i4, string, 2));
                }
                bravo = gVar.bravo();
                azure.close();
            }
            azure = bVar.azure("PRAGMA foreign_key_list(`" + str + "`)");
            try {
                int columnIndex6 = azure.getColumnIndex(Constants.KEY_ID);
                int columnIndex7 = azure.getColumnIndex("seq");
                int columnIndex8 = azure.getColumnIndex("table");
                int columnIndex9 = azure.getColumnIndex("on_delete");
                int columnIndex10 = azure.getColumnIndex("on_update");
                List alpha = I6.alpha(azure);
                azure.moveToPosition(-1);
                j jVar = new j();
                while (azure.moveToNext()) {
                    if (azure.getInt(columnIndex7) == 0) {
                        int i5 = azure.getInt(columnIndex6);
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int i10 = columnIndex6;
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj : alpha) {
                            int i11 = columnIndex7;
                            List list = alpha;
                            if (((C2155c) obj).alpha == i5) {
                                arrayList3.add(obj);
                            }
                            columnIndex7 = i11;
                            alpha = list;
                        }
                        int i12 = columnIndex7;
                        List list2 = alpha;
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C2155c c2155c = (C2155c) it.next();
                            arrayList.add(c2155c.red);
                            arrayList2.add(c2155c.silver);
                        }
                        String string2 = azure.getString(columnIndex8);
                        Intrinsics.delta(string2, "cursor.getString(tableColumnIndex)");
                        String string3 = azure.getString(columnIndex9);
                        Intrinsics.delta(string3, "cursor.getString(onDeleteColumnIndex)");
                        String string4 = azure.getString(columnIndex10);
                        Intrinsics.delta(string4, "cursor.getString(onUpdateColumnIndex)");
                        jVar.add(new C2154b(string2, string3, string4, arrayList, arrayList2));
                        columnIndex6 = i10;
                        columnIndex7 = i12;
                        alpha = list2;
                    }
                }
                j bravo2 = ab.bravo(jVar);
                azure.close();
                azure = bVar.azure("PRAGMA index_list(`" + str + "`)");
                try {
                    int columnIndex11 = azure.getColumnIndex("name");
                    int columnIndex12 = azure.getColumnIndex("origin");
                    int columnIndex13 = azure.getColumnIndex("unique");
                    j jVar2 = null;
                    if (columnIndex11 != -1 && columnIndex12 != -1 && columnIndex13 != -1) {
                        j jVar3 = new j();
                        while (true) {
                            if (!azure.moveToNext()) {
                                break;
                            }
                            if (Intrinsics.areEqual("c", azure.getString(columnIndex12))) {
                                String name2 = azure.getString(columnIndex11);
                                if (azure.getInt(columnIndex13) == 1) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                Intrinsics.delta(name2, "name");
                                C2156d bravo3 = I6.bravo(bVar, name2, z10);
                                if (bravo3 == null) {
                                    azure.close();
                                    break;
                                }
                                jVar3.add(bravo3);
                            }
                        }
                        return new C2157e(str, bravo, bravo2, jVar2);
                    }
                    azure.close();
                    return new C2157e(str, bravo, bravo2, jVar2);
                } finally {
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public final boolean equals(Object obj) {
        AbstractSet abstractSet;
        if (this != obj) {
            if (obj instanceof C2157e) {
                C2157e c2157e = (C2157e) obj;
                if (!Intrinsics.areEqual(this.alpha, c2157e.alpha) || !Intrinsics.areEqual(this.bravo, c2157e.bravo) || !Intrinsics.areEqual(this.charlie, c2157e.charlie)) {
                    return false;
                }
                AbstractSet abstractSet2 = this.delta;
                if (abstractSet2 != null && (abstractSet = c2157e.delta) != null) {
                    return Intrinsics.areEqual(abstractSet2, abstractSet);
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.charlie.hashCode() + ((this.bravo.hashCode() + (this.alpha.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "TableInfo{name='" + this.alpha + "', columns=" + this.bravo + ", foreignKeys=" + this.charlie + ", indices=" + this.delta + '}';
    }
}
