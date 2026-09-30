package B2;

import android.os.Build;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class k {
    public static final String alpha = A2.z.golf("Schedulers");

    public static void alpha(J2.r rVar, A2.aa aaVar, ArrayList arrayList) {
        if (arrayList.size() > 0) {
            aaVar.getClass();
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rVar.juliet(currentTimeMillis, ((J2.p) it.next()).alpha);
            }
        }
    }

    public static void bravo(A2.a aVar, WorkDatabase workDatabase, List list) {
        ArrayList arrayList;
        if (list != null && list.size() != 0) {
            J2.r uniform = workDatabase.uniform();
            workDatabase.charlie();
            try {
                if (Build.VERSION.SDK_INT >= 24) {
                    arrayList = uniform.delta();
                    alpha(uniform, aVar.delta, arrayList);
                } else {
                    arrayList = null;
                }
                ArrayList charlie = uniform.charlie(aVar.kilo);
                alpha(uniform, aVar.delta, charlie);
                if (arrayList != null) {
                    charlie.addAll(arrayList);
                }
                ArrayList bravo = uniform.bravo();
                workDatabase.papa();
                workDatabase.kilo();
                if (charlie.size() > 0) {
                    J2.p[] pVarArr = (J2.p[]) charlie.toArray(new J2.p[charlie.size()]);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        h hVar = (h) it.next();
                        if (hVar.bravo()) {
                            hVar.alpha(pVarArr);
                        }
                    }
                }
                if (bravo.size() > 0) {
                    J2.p[] pVarArr2 = (J2.p[]) bravo.toArray(new J2.p[bravo.size()]);
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        h hVar2 = (h) it2.next();
                        if (!hVar2.bravo()) {
                            hVar2.alpha(pVarArr2);
                        }
                    }
                }
            } catch (Throwable th) {
                workDatabase.kilo();
                throw th;
            }
        }
    }
}
