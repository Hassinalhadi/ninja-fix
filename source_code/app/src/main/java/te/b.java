package te;

import Ld.g;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2315G;
import pe.AbstractC2316H;
import pe.C2310B;
import pe.C2311C;
import pe.C2312D;
import pe.ay;

/* loaded from: classes2.dex */
public final class b extends AbstractC2316H {
    public static final b charlie = new AbstractC2316H("protected_and_package", true);

    @Override // pe.AbstractC2316H
    public final Integer alpha(AbstractC2316H visibility) {
        Intrinsics.echo(visibility, "visibility");
        if (Intrinsics.areEqual(this, visibility)) {
            return 0;
        }
        if (visibility == ay.charlie) {
            return null;
        }
        g gVar = AbstractC2315G.alpha;
        if (visibility != C2310B.charlie && visibility != C2311C.charlie) {
            return -1;
        }
        return 1;
    }

    @Override // pe.AbstractC2316H
    public final String bravo() {
        return "protected/*protected and package*/";
    }

    @Override // pe.AbstractC2316H
    public final AbstractC2316H charlie() {
        return C2312D.charlie;
    }
}
