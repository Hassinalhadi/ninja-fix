package F;

import androidx.compose.runtime.C0564b;
import s6.J4;

/* loaded from: classes3.dex */
public final class R2 {
    public static final J2.l delta = R.l.bravo(T.f1072r, C0172x.f1253g);
    public final androidx.compose.runtime.aw alpha;
    public final androidx.compose.runtime.aw bravo;
    public final androidx.compose.runtime.aw charlie;

    public R2(float f5, float f10, float f11) {
        this.alpha = C0564b.victor(f5);
        this.bravo = C0564b.victor(f11);
        this.charlie = C0564b.victor(f10);
    }

    public final float alpha() {
        if (charlie() == 0.0f) {
            return 0.0f;
        }
        return bravo() / charlie();
    }

    public final float bravo() {
        return ((androidx.compose.runtime.n0) this.charlie).juliet();
    }

    public final float charlie() {
        return ((androidx.compose.runtime.n0) this.alpha).juliet();
    }

    public final void delta(float f5) {
        ((androidx.compose.runtime.n0) this.charlie).kilo(J4.charlie(f5, charlie(), 0.0f));
    }
}
