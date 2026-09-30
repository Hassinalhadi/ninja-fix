package a1;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class l {
    public o alpha;
    public ArrayList bravo;

    public static long alpha(f fVar, long j5) {
        o oVar = fVar.delta;
        if (oVar instanceof j) {
            return j5;
        }
        ArrayList arrayList = fVar.kilo;
        int size = arrayList.size();
        long j6 = j5;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.delta != oVar) {
                    j6 = Math.min(j6, alpha(fVar2, fVar2.foxtrot + j5));
                }
            }
        }
        if (fVar == oVar.india) {
            long juliet = oVar.juliet();
            long j7 = j5 - juliet;
            return Math.min(Math.min(j6, alpha(oVar.hotel, j7)), j7 - r9.foxtrot);
        }
        return j6;
    }

    public static long bravo(f fVar, long j5) {
        o oVar = fVar.delta;
        if (oVar instanceof j) {
            return j5;
        }
        ArrayList arrayList = fVar.kilo;
        int size = arrayList.size();
        long j6 = j5;
        for (int i4 = 0; i4 < size; i4++) {
            d dVar = (d) arrayList.get(i4);
            if (dVar instanceof f) {
                f fVar2 = (f) dVar;
                if (fVar2.delta != oVar) {
                    j6 = Math.max(j6, bravo(fVar2, fVar2.foxtrot + j5));
                }
            }
        }
        if (fVar == oVar.hotel) {
            long juliet = oVar.juliet();
            long j7 = j5 + juliet;
            return Math.max(Math.max(j6, bravo(oVar.india, j7)), j7 - r9.foxtrot);
        }
        return j6;
    }
}
