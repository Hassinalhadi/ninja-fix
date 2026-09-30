package g7;

import android.graphics.Canvas;
import android.graphics.Matrix;
import f7.C1694a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class p extends v {
    public final /* synthetic */ ArrayList charlie;
    public final /* synthetic */ Matrix delta;

    public p(ArrayList arrayList, Matrix matrix) {
        this.charlie = arrayList;
        this.delta = matrix;
    }

    @Override // g7.v
    public final void alpha(Matrix matrix, C1694a c1694a, int i4, Canvas canvas) {
        Iterator it = this.charlie.iterator();
        while (it.hasNext()) {
            ((v) it.next()).alpha(this.delta, c1694a, i4, canvas);
        }
    }
}
