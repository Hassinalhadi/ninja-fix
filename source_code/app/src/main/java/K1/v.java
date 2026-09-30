package K1;

import android.util.SparseArray;

/* loaded from: classes3.dex */
public final class v {
    public final SparseArray alpha;
    public y bravo;

    public v(int i4) {
        this.alpha = new SparseArray(i4);
    }

    public final void alpha(y yVar, int i4, int i5) {
        v vVar;
        int alpha = yVar.alpha(i4);
        SparseArray sparseArray = this.alpha;
        if (sparseArray == null) {
            vVar = null;
        } else {
            vVar = (v) sparseArray.get(alpha);
        }
        if (vVar == null) {
            vVar = new v(1);
            sparseArray.put(yVar.alpha(i4), vVar);
        }
        if (i5 > i4) {
            vVar.alpha(yVar, i4 + 1, i5);
        } else {
            vVar.bravo = yVar;
        }
    }
}
