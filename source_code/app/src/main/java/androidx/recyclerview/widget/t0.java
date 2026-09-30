package androidx.recyclerview.widget;

/* loaded from: classes3.dex */
public final class t0 {
    public final bv.aw alpha = new bv.aw(0);
    public final bv.u bravo = new bv.u((Object) null);

    public final void alpha(f0 f0Var, G g2) {
        bv.aw awVar = this.alpha;
        r0 r0Var = (r0) awVar.get(f0Var);
        if (r0Var == null) {
            r0Var = r0.alpha();
            awVar.put(f0Var, r0Var);
        }
        r0Var.charlie = g2;
        r0Var.alpha |= 8;
    }

    public final G bravo(f0 f0Var, int i4) {
        r0 r0Var;
        G g2;
        bv.aw awVar = this.alpha;
        int delta = awVar.delta(f0Var);
        if (delta >= 0 && (r0Var = (r0) awVar.juliet(delta)) != null) {
            int i5 = r0Var.alpha;
            if ((i5 & i4) != 0) {
                int i10 = i5 & (~i4);
                r0Var.alpha = i10;
                if (i4 == 4) {
                    g2 = r0Var.bravo;
                } else if (i4 == 8) {
                    g2 = r0Var.charlie;
                } else {
                    throw new IllegalArgumentException("Must provide flag PRE or POST");
                }
                if ((i10 & 12) == 0) {
                    awVar.hotel(delta);
                    r0Var.alpha = 0;
                    r0Var.bravo = null;
                    r0Var.charlie = null;
                    r0.delta.alpha(r0Var);
                }
                return g2;
            }
        }
        return null;
    }

    public final void charlie(f0 f0Var) {
        r0 r0Var = (r0) this.alpha.get(f0Var);
        if (r0Var == null) {
            return;
        }
        r0Var.alpha &= -2;
    }

    public final void delta(f0 f0Var) {
        bv.u uVar = this.bravo;
        int juliet = uVar.juliet() - 1;
        while (true) {
            if (juliet < 0) {
                break;
            }
            if (f0Var == uVar.kilo(juliet)) {
                Object[] objArr = uVar.red;
                Object obj = objArr[juliet];
                Object obj2 = bv.v.alpha;
                if (obj != obj2) {
                    objArr[juliet] = obj2;
                    uVar.alpha = true;
                }
            } else {
                juliet--;
            }
        }
        r0 r0Var = (r0) this.alpha.remove(f0Var);
        if (r0Var != null) {
            r0Var.alpha = 0;
            r0Var.bravo = null;
            r0Var.charlie = null;
            r0.delta.alpha(r0Var);
        }
    }
}
