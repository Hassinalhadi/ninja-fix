package K2;

import A2.ak;
import A2.z;
import B2.w;
import J2.t;
import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class b {
    public static final String alpha = z.golf("EnqueueRunnable");

    public static void alpha(B2.r rVar) {
        boolean z2;
        rVar.getClass();
        HashSet hashSet = new HashSet();
        hashSet.addAll(rVar.echo);
        HashSet charlie = B2.r.charlie(rVar);
        Iterator it = hashSet.iterator();
        while (true) {
            if (it.hasNext()) {
                if (charlie.contains((String) it.next())) {
                    z2 = true;
                    break;
                }
            } else {
                hashSet.removeAll(rVar.echo);
                z2 = false;
                break;
            }
        }
        if (!z2) {
            w wVar = rVar.alpha;
            WorkDatabase workDatabase = wVar.delta;
            workDatabase.charlie();
            try {
                f.bravo(workDatabase, wVar.charlie, rVar);
                boolean bravo = bravo(rVar);
                workDatabase.papa();
                if (bravo) {
                    B2.k.bravo(wVar.charlie, wVar.delta, wVar.foxtrot);
                    return;
                }
                return;
            } finally {
                workDatabase.kilo();
            }
        }
        throw new IllegalStateException("WorkContinuation has cycles (" + rVar + ")");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x015c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b9  */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean bravo(B2.r rVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        WorkDatabase workDatabase;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        rVar.getClass();
        String[] strArr = (String[]) B2.r.charlie(rVar).toArray(new String[0]);
        w wVar = rVar.alpha;
        wVar.charlie.delta.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (strArr != null && strArr.length > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        WorkDatabase workDatabase2 = wVar.delta;
        if (z2) {
            z11 = false;
            z12 = false;
            z10 = true;
            for (String str : strArr) {
                J2.p hotel = workDatabase2.uniform().hotel(str);
                if (hotel == null) {
                    z.echo().charlie(alpha, "Prerequisite " + str + " doesn't exist; not enqueuing");
                    break;
                }
                int i4 = hotel.bravo;
                if (i4 == 3) {
                    z20 = true;
                } else {
                    z20 = false;
                }
                z10 &= z20;
                if (i4 == 4) {
                    z12 = true;
                } else if (i4 == 6) {
                    z11 = true;
                }
            }
        } else {
            z10 = true;
            z11 = false;
            z12 = false;
        }
        String str2 = rVar.bravo;
        boolean isEmpty = TextUtils.isEmpty(str2);
        if (!isEmpty && !z2) {
            ArrayList india = workDatabase2.uniform().india(str2);
            if (!india.isEmpty()) {
                int i5 = rVar.charlie;
                if (i5 != 3 && i5 != 4) {
                    if (i5 == 2) {
                        Iterator it = india.iterator();
                        while (it.hasNext()) {
                            int i10 = ((J2.o) it.next()).bravo;
                            if (i10 != 1 && i10 != 2) {
                            }
                            z16 = false;
                        }
                    }
                    WorkDatabase workDatabase3 = wVar.delta;
                    Intrinsics.delta(workDatabase3, "workManagerImpl.workDatabase");
                    workDatabase3.oscar(new A2.s(workDatabase3, str2, wVar, 10));
                    J2.r uniform = workDatabase2.uniform();
                    Iterator it2 = india.iterator();
                    while (it2.hasNext()) {
                        uniform.alpha(((J2.o) it2.next()).alpha);
                    }
                    z13 = isEmpty;
                    workDatabase = workDatabase2;
                    z15 = true;
                    boolean z21 = z15;
                    while (r8.hasNext()) {
                    }
                    z16 = z21;
                    rVar.golf = true;
                    return z16;
                }
                J2.c foxtrot = workDatabase2.foxtrot();
                ArrayList arrayList = new ArrayList();
                Iterator it3 = india.iterator();
                while (it3.hasNext()) {
                    J2.o oVar = (J2.o) it3.next();
                    String str3 = oVar.alpha;
                    foxtrot.getClass();
                    boolean z22 = isEmpty;
                    WorkDatabase workDatabase4 = workDatabase2;
                    l2.p foxtrot2 = l2.p.foxtrot(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
                    foxtrot2.oscar(1, str3);
                    WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) foxtrot.purple;
                    workDatabase_Impl.bravo();
                    Cursor mike = workDatabase_Impl.mike(foxtrot2);
                    try {
                        if (mike.moveToFirst()) {
                            z17 = false;
                            if (mike.getInt(0) != 0) {
                                z18 = true;
                                if (!z18) {
                                    int i11 = oVar.bravo;
                                    if (i11 == 3) {
                                        z19 = true;
                                    } else {
                                        z19 = z17;
                                    }
                                    z10 &= z19;
                                    if (i11 == 4) {
                                        z12 = true;
                                    } else if (i11 == 6) {
                                        z11 = true;
                                    }
                                    arrayList.add(oVar.alpha);
                                }
                                isEmpty = z22;
                                workDatabase2 = workDatabase4;
                            }
                        } else {
                            z17 = false;
                        }
                        z18 = z17;
                        if (!z18) {
                        }
                        isEmpty = z22;
                        workDatabase2 = workDatabase4;
                    } finally {
                        mike.close();
                        foxtrot2.golf();
                    }
                }
                z13 = isEmpty;
                workDatabase = workDatabase2;
                z14 = false;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (i5 == 4 && (z11 || z12)) {
                    J2.r uniform2 = workDatabase.uniform();
                    Iterator it4 = uniform2.india(str2).iterator();
                    while (it4.hasNext()) {
                        uniform2.alpha(((J2.o) it4.next()).alpha);
                    }
                    z11 = false;
                    z12 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                if (strArr.length > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                z15 = z14;
                boolean z212 = z15;
                for (ak akVar : rVar.delta) {
                    J2.p pVar = akVar.bravo;
                    if (z2 && !z10) {
                        if (z12) {
                            pVar.bravo = 4;
                        } else if (z11) {
                            pVar.bravo = 6;
                        } else {
                            pVar.bravo = 5;
                        }
                    } else {
                        pVar.november = currentTimeMillis;
                    }
                    if (pVar.bravo == 1) {
                        z212 = true;
                    }
                    J2.r uniform3 = workDatabase.uniform();
                    J2.p delta = f.delta(wVar.foxtrot, pVar);
                    WorkDatabase_Impl workDatabase_Impl2 = uniform3.alpha;
                    workDatabase_Impl2.bravo();
                    workDatabase_Impl2.charlie();
                    try {
                        uniform3.bravo.oscar(delta);
                        workDatabase_Impl2.papa();
                        workDatabase_Impl2.kilo();
                        UUID uuid = akVar.alpha;
                        if (z2) {
                            int length = strArr.length;
                            int i12 = 0;
                            while (i12 < length) {
                                String[] strArr2 = strArr;
                                String str4 = strArr2[i12];
                                w wVar2 = wVar;
                                long j5 = currentTimeMillis;
                                String uuid2 = uuid.toString();
                                Intrinsics.delta(uuid2, "id.toString()");
                                J2.a aVar = new J2.a(uuid2, str4);
                                J2.c foxtrot3 = workDatabase.foxtrot();
                                WorkDatabase_Impl workDatabase_Impl3 = (WorkDatabase_Impl) foxtrot3.purple;
                                workDatabase_Impl3.bravo();
                                workDatabase_Impl3.charlie();
                                try {
                                    ((J2.b) foxtrot3.red).oscar(aVar);
                                    workDatabase_Impl3.papa();
                                    workDatabase_Impl3.kilo();
                                    i12++;
                                    strArr = strArr2;
                                    wVar = wVar2;
                                    currentTimeMillis = j5;
                                } finally {
                                }
                            }
                        }
                        String[] strArr3 = strArr;
                        w wVar3 = wVar;
                        long j6 = currentTimeMillis;
                        t victor = workDatabase.victor();
                        String uuid3 = uuid.toString();
                        Intrinsics.delta(uuid3, "id.toString()");
                        victor.romeo(uuid3, akVar.charlie);
                        if (!z13) {
                            J2.l sierra = workDatabase.sierra();
                            String uuid4 = uuid.toString();
                            Intrinsics.delta(uuid4, "id.toString()");
                            J2.k kVar = new J2.k(str2, uuid4);
                            WorkDatabase_Impl workDatabase_Impl4 = (WorkDatabase_Impl) sierra.alpha;
                            workDatabase_Impl4.bravo();
                            workDatabase_Impl4.charlie();
                            try {
                                ((J2.b) sierra.purple).oscar(kVar);
                                workDatabase_Impl4.papa();
                            } finally {
                            }
                        }
                        strArr = strArr3;
                        wVar = wVar3;
                        currentTimeMillis = j6;
                    } catch (Throwable th) {
                        workDatabase_Impl2.kilo();
                        throw th;
                    }
                }
                z16 = z212;
                rVar.golf = true;
                return z16;
            }
        }
        z13 = isEmpty;
        workDatabase = workDatabase2;
        z14 = false;
        z15 = z14;
        boolean z2122 = z15;
        while (r8.hasNext()) {
        }
        z16 = z2122;
        rVar.golf = true;
        return z16;
    }
}
