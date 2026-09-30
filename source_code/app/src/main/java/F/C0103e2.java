package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: F.e2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0103e2 {
    public final boolean alpha;
    public final androidx.compose.material3.internal.t bravo;

    public C0103e2(boolean z2, Q0.d dVar, EnumC0107f2 enumC0107f2, Function1 function1) {
        this.alpha = z2;
        if (z2 && enumC0107f2 == EnumC0107f2.red) {
            throw new IllegalArgumentException("The initial value must not be set to PartiallyExpanded if skipPartiallyExpanded is set to true.");
        }
        this.bravo = new androidx.compose.material3.internal.t(enumC0107f2, new A0.p(11, dVar), new Aa.g(14, dVar), AbstractC0095c2.bravo, function1);
    }

    public static Object alpha(C0103e2 c0103e2, EnumC0107f2 enumC0107f2, Pd.i iVar) {
        Object charlie = androidx.compose.material3.internal.i.charlie(c0103e2.bravo, enumC0107f2, ((androidx.compose.runtime.n0) ((androidx.compose.runtime.aw) c0103e2.bravo.mike)).juliet(), iVar);
        if (charlie == Od.a.alpha) {
            return charlie;
        }
        return Unit.INSTANCE;
    }

    public final Object bravo(Pd.i iVar) {
        Object alpha = alpha(this, EnumC0107f2.alpha, iVar);
        if (alpha == Od.a.alpha) {
            return alpha;
        }
        return Unit.INSTANCE;
    }

    public final boolean charlie() {
        if (((androidx.compose.runtime.t0) ((androidx.compose.runtime.ax) this.bravo.golf)).getValue() != EnumC0107f2.alpha) {
            return true;
        }
        return false;
    }

    public final Object delta(Pd.i iVar) {
        if (!this.alpha) {
            Object alpha = alpha(this, EnumC0107f2.red, iVar);
            if (alpha == Od.a.alpha) {
                return alpha;
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("Attempted to animate to partial expanded when skipPartiallyExpanded was enabled. Set skipPartiallyExpanded to false to use this function.");
    }
}
