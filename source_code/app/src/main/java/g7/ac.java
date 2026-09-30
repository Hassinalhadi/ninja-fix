package g7;

import android.util.StateSet;

/* loaded from: classes2.dex */
public final class ac {
    public int alpha;
    public m bravo;
    public int[][] charlie;
    public m[] delta;
    public ab echo;
    public ab foxtrot;
    public ab golf;
    public ab hotel;

    public ac(m mVar) {
        bravo();
        alpha(StateSet.WILD_CARD, mVar);
    }

    public final void alpha(int[] iArr, m mVar) {
        int i4 = this.alpha;
        if (i4 == 0 || iArr.length == 0) {
            this.bravo = mVar;
        }
        int[][] iArr2 = this.charlie;
        if (i4 >= iArr2.length) {
            int i5 = i4 + 10;
            int[][] iArr3 = new int[i5];
            System.arraycopy(iArr2, 0, iArr3, 0, i4);
            this.charlie = iArr3;
            m[] mVarArr = new m[i5];
            System.arraycopy(this.delta, 0, mVarArr, 0, i4);
            this.delta = mVarArr;
        }
        int[][] iArr4 = this.charlie;
        int i10 = this.alpha;
        iArr4[i10] = iArr;
        this.delta[i10] = mVar;
        this.alpha = i10 + 1;
    }

    public final void bravo() {
        this.bravo = new m();
        this.charlie = new int[10];
        this.delta = new m[10];
    }
}
