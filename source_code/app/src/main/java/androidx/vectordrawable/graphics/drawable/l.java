package androidx.vectordrawable.graphics.drawable;

import j1.C1931e;
import s6.C5;

/* loaded from: classes3.dex */
public abstract class l extends k {
    public C1931e[] alpha;
    public String bravo;
    public int charlie;

    public l() {
        this.alpha = null;
        this.charlie = 0;
    }

    public C1931e[] getPathData() {
        return this.alpha;
    }

    public String getPathName() {
        return this.bravo;
    }

    public void setPathData(C1931e[] c1931eArr) {
        if (!C5.alpha(this.alpha, c1931eArr)) {
            this.alpha = C5.echo(c1931eArr);
            return;
        }
        C1931e[] c1931eArr2 = this.alpha;
        for (int i4 = 0; i4 < c1931eArr.length; i4++) {
            c1931eArr2[i4].alpha = c1931eArr[i4].alpha;
            int i5 = 0;
            while (true) {
                float[] fArr = c1931eArr[i4].bravo;
                if (i5 < fArr.length) {
                    c1931eArr2[i4].bravo[i5] = fArr[i5];
                    i5++;
                }
            }
        }
    }

    public l(l lVar) {
        this.alpha = null;
        this.charlie = 0;
        this.bravo = lVar.bravo;
        this.alpha = C5.echo(lVar.alpha);
    }
}
