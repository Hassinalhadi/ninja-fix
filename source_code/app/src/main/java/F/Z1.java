package F;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.NoWhenBranchMatchedException;
import m.AbstractC2088a;
import m.AbstractC2094g;
import m.C2091d;

/* loaded from: classes3.dex */
public abstract class Z1 {
    public static final androidx.compose.runtime.E0 alpha = new androidx.compose.runtime.N(P.f1048f);

    public static final a0.as alpha(InterfaceC0581m interfaceC0581m, int i4) {
        Y1 y12 = (Y1) ((C0585q) interfaceC0581m).kilo(alpha);
        switch (av.q.mike(i4)) {
            case 0:
                return y12.echo;
            case 1:
                return bravo(y12.echo);
            case 2:
                return y12.alpha;
            case 3:
                return bravo(y12.alpha);
            case 4:
                return AbstractC2094g.alpha;
            case 5:
                return y12.delta;
            case 6:
                float f5 = (float) 0.0d;
                return AbstractC2088a.charlie(y12.delta, new C2091d(f5), null, new C2091d(f5), 6);
            case 7:
                return bravo(y12.delta);
            case 8:
                return y12.charlie;
            case 9:
                return a0.ao.alpha;
            case 10:
                return y12.bravo;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final AbstractC2088a bravo(AbstractC2088a abstractC2088a) {
        float f5 = (float) 0.0d;
        return AbstractC2088a.charlie(abstractC2088a, null, new C2091d(f5), new C2091d(f5), 3);
    }
}
