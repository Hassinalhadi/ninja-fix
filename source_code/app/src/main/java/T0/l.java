package T0;

import Y.aa;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewParent;
import s0.AbstractC2555o;
import s0.C2563x;
import s0.al;

/* loaded from: classes3.dex */
public abstract class l {
    public static final k alpha = new Object();

    public static final boolean alpha(View view, View view2) {
        for (ViewParent parent = view2.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == view.getParent()) {
                return true;
            }
        }
        return false;
    }

    public static final Rect bravo(Y.k kVar, View view, View view2) {
        Z.c cVar;
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        view2.getLocationOnScreen(iArr2);
        aa charlie = Y.g.charlie(((Y.n) kVar).charlie);
        if (charlie != null) {
            cVar = Y.g.delta(charlie);
        } else {
            cVar = null;
        }
        if (cVar == null) {
            return null;
        }
        int i4 = (int) cVar.alpha;
        int i5 = iArr[0];
        int i10 = iArr2[0];
        int i11 = (int) cVar.bravo;
        int i12 = iArr[1];
        int i13 = iArr2[1];
        return new Rect((i4 + i5) - i10, (i11 + i12) - i13, (((int) cVar.charlie) + i5) - i10, (((int) cVar.delta) + i12) - i13);
    }

    public static final View charlie(T.r rVar) {
        View view;
        t tVar = AbstractC2555o.golf(rVar.getNode()).f13288g;
        if (tVar != null) {
            view = tVar.getInteropView();
        } else {
            view = null;
        }
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Could not fetch interop view");
    }

    public static final void delta(t tVar, al alVar) {
        long gray = ((C2563x) alVar.f13305x.echo).gray(0L);
        int round = Math.round(Float.intBitsToFloat((int) (gray >> 32)));
        int round2 = Math.round(Float.intBitsToFloat((int) (gray & 4294967295L)));
        tVar.layout(round, round2, tVar.getMeasuredWidth() + round, tVar.getMeasuredHeight() + round2);
    }
}
