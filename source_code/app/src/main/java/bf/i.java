package bf;

import android.util.Rational;
import android.util.Size;
import androidx.camera.core.impl.InterfaceC0523v;
import androidx.camera.core.impl.ap;
import t6.Z3;

/* loaded from: classes3.dex */
public final class i {
    public final int alpha;
    public final int bravo;
    public final Rational charlie;
    public final boolean delta;

    public i(InterfaceC0523v interfaceC0523v, Rational rational) {
        this.alpha = interfaceC0523v.alpha();
        this.bravo = interfaceC0523v.echo();
        this.charlie = rational;
        boolean z2 = true;
        if (rational != null && rational.getNumerator() < rational.getDenominator()) {
            z2 = false;
        }
        this.delta = z2;
    }

    public final Size alpha(ap apVar) {
        int crimson = apVar.crimson();
        Size cyan = apVar.cyan();
        if (cyan != null) {
            int bravo = Z3.bravo(crimson);
            boolean z2 = true;
            if (1 != this.bravo) {
                z2 = false;
            }
            int alpha = Z3.alpha(bravo, this.alpha, z2);
            if (alpha == 90 || alpha == 270) {
                return new Size(cyan.getHeight(), cyan.getWidth());
            }
        }
        return cyan;
    }
}
