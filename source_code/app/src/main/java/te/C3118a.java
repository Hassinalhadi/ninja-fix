package te;

import Ld.g;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2315G;
import pe.AbstractC2316H;
import pe.C2310B;
import pe.C2311C;
import pe.C2312D;

/* renamed from: te.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3118a extends AbstractC2316H {
    public static final C3118a charlie = new AbstractC2316H("package", false);

    @Override // pe.AbstractC2316H
    public final Integer alpha(AbstractC2316H visibility) {
        Intrinsics.echo(visibility, "visibility");
        if (this == visibility) {
            return 0;
        }
        g gVar = AbstractC2315G.alpha;
        if (visibility != C2310B.charlie && visibility != C2311C.charlie) {
            return -1;
        }
        return 1;
    }

    @Override // pe.AbstractC2316H
    public final String bravo() {
        return "public/*package*/";
    }

    @Override // pe.AbstractC2316H
    public final AbstractC2316H charlie() {
        return C2312D.charlie;
    }
}
