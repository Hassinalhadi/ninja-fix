package te;

import pe.AbstractC2316H;
import pe.C2312D;

/* loaded from: classes2.dex */
public final class c extends AbstractC2316H {
    public static final c charlie = new AbstractC2316H("protected_static", true);

    @Override // pe.AbstractC2316H
    public final String bravo() {
        return "protected/*protected static*/";
    }

    @Override // pe.AbstractC2316H
    public final AbstractC2316H charlie() {
        return C2312D.charlie;
    }
}
