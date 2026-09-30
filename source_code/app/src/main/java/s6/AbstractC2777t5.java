package s6;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: s6.t5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2777t5 {
    public static final int alpha(int i4) {
        com.google.android.material.datepicker.j.papa(i4, "<this>");
        int mike = av.q.mike(i4);
        if (mike != 0) {
            if (mike == 1) {
                return 1;
            }
            if (mike == 2) {
                return 2;
            }
            throw new NoWhenBranchMatchedException();
        }
        return 3;
    }

    public static final void bravo(I.am amVar, int i4, Object obj) {
        amVar.echo[(amVar.foxtrot - amVar.alpha[amVar.bravo - 1].charlie) + i4] = obj;
    }

    public static final void charlie(I.am amVar, int i4, Object obj, int i5, Object obj2) {
        int i10 = amVar.foxtrot - amVar.alpha[amVar.bravo - 1].charlie;
        Object[] objArr = amVar.echo;
        objArr[i4 + i10] = obj;
        objArr[i10 + i5] = obj2;
    }
}
