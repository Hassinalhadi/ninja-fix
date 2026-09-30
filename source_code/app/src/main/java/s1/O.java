package s1;

import j1.C1929c;

/* loaded from: classes3.dex */
public abstract class O {
    public final a0 alpha;
    public C1929c[] bravo;

    public O() {
        this(new a0((a0) null));
    }

    public final void alpha() {
        C1929c[] c1929cArr = this.bravo;
        if (c1929cArr != null) {
            C1929c c1929c = c1929cArr[0];
            C1929c c1929c2 = c1929cArr[1];
            a0 a0Var = this.alpha;
            if (c1929c2 == null) {
                c1929c2 = a0Var.alpha.golf(2);
            }
            if (c1929c == null) {
                c1929c = a0Var.alpha.golf(1);
            }
            golf(C1929c.alpha(c1929c, c1929c2));
            C1929c c1929c3 = this.bravo[t6.aa.alpha(16)];
            if (c1929c3 != null) {
                foxtrot(c1929c3);
            }
            C1929c c1929c4 = this.bravo[t6.aa.alpha(32)];
            if (c1929c4 != null) {
                delta(c1929c4);
            }
            C1929c c1929c5 = this.bravo[t6.aa.alpha(64)];
            if (c1929c5 != null) {
                hotel(c1929c5);
            }
        }
    }

    public abstract a0 bravo();

    public void charlie(int i4, C1929c c1929c) {
        if (this.bravo == null) {
            this.bravo = new C1929c[10];
        }
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((i4 & i5) != 0) {
                this.bravo[t6.aa.alpha(i5)] = c1929c;
            }
        }
    }

    public void delta(C1929c c1929c) {
    }

    public abstract void echo(C1929c c1929c);

    public void foxtrot(C1929c c1929c) {
    }

    public abstract void golf(C1929c c1929c);

    public void hotel(C1929c c1929c) {
    }

    public O(a0 a0Var) {
        this.alpha = a0Var;
    }
}
