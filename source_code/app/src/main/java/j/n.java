package j;

import java.util.List;

/* loaded from: classes3.dex */
public final class n {
    public final int alpha;
    public final m[] bravo;
    public final o charlie;
    public final List delta;
    public final int echo;
    public final int foxtrot;
    public final int golf;

    public n(int i4, m[] mVarArr, o oVar, List list, int i5) {
        this.alpha = i4;
        this.bravo = mVarArr;
        this.charlie = oVar;
        this.delta = list;
        this.echo = i5;
        int i10 = 0;
        for (m mVar : mVarArr) {
            i10 = Math.max(i10, mVar.kilo);
        }
        this.foxtrot = i10;
        int i11 = i10 + this.echo;
        this.golf = i11 >= 0 ? i11 : 0;
    }

    public final m[] alpha(int i4, int i5, int i10) {
        m[] mVarArr = this.bravo;
        int length = mVarArr.length;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < length) {
            m mVar = mVarArr[i11];
            int i14 = i12 + 1;
            int i15 = (int) ((C1919b) this.delta.get(i12)).alpha;
            mVar.kilo(i4, this.charlie.bravo[i13], i5, i10, this.alpha, i13);
            i13 += i15;
            i11++;
            i12 = i14;
        }
        return mVarArr;
    }
}
