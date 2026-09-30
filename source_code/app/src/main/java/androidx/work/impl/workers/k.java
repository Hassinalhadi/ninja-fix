package androidx.work.impl.workers;

import A2.z;
import J2.l;
import J2.p;
import J2.t;
import android.database.Cursor;
import androidx.work.impl.WorkDatabase_Impl;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import s6.P5;

/* loaded from: classes3.dex */
public abstract class k {
    public static final String alpha;

    static {
        String golf = z.golf("DiagnosticsWrkr");
        Intrinsics.delta(golf, "tagWithPrefix(\"DiagnosticsWrkr\")");
        alpha = golf;
    }

    /* JADX WARN: Finally extract failed */
    public static final String alpha(l lVar, t tVar, J2.i iVar, ArrayList arrayList) {
        Integer num;
        String str;
        StringBuilder sb2 = new StringBuilder("\n Id \t Class Name\t Job Id\t State\t Unique Name\t Tags\t");
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            J2.g bravo = iVar.bravo(P5.bravo(pVar));
            if (bravo != null) {
                num = Integer.valueOf(bravo.charlie);
            } else {
                num = null;
            }
            lVar.getClass();
            l2.p foxtrot = l2.p.foxtrot(1, "SELECT name FROM workname WHERE work_spec_id=?");
            String str2 = pVar.alpha;
            foxtrot.oscar(1, str2);
            WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) lVar.alpha;
            workDatabase_Impl.bravo();
            Cursor mike = workDatabase_Impl.mike(foxtrot);
            try {
                ArrayList arrayList2 = new ArrayList(mike.getCount());
                while (mike.moveToNext()) {
                    arrayList2.add(mike.getString(0));
                }
                mike.close();
                foxtrot.golf();
                String maroon = CollectionsKt.maroon(arrayList2, Constants.SEPARATOR_COMMA, null, null, null, 62);
                String maroon2 = CollectionsKt.maroon(tVar.papa(str2), Constants.SEPARATOR_COMMA, null, null, null, 62);
                StringBuilder victor = Q0.c.victor("\n", str2, "\t ");
                victor.append(pVar.charlie);
                victor.append("\t ");
                victor.append(num);
                victor.append("\t ");
                switch (pVar.bravo) {
                    case 1:
                        str = "ENQUEUED";
                        break;
                    case 2:
                        str = "RUNNING";
                        break;
                    case 3:
                        str = "SUCCEEDED";
                        break;
                    case 4:
                        str = "FAILED";
                        break;
                    case 5:
                        str = "BLOCKED";
                        break;
                    case 6:
                        str = "CANCELLED";
                        break;
                    default:
                        throw null;
                }
                victor.append(str);
                victor.append("\t ");
                victor.append(maroon);
                victor.append("\t ");
                victor.append(maroon2);
                victor.append('\t');
                sb2.append(victor.toString());
            } catch (Throwable th) {
                mike.close();
                foxtrot.golf();
                throw th;
            }
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
