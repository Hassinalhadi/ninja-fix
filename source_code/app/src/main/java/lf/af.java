package lf;

/* loaded from: classes2.dex */
public final class af extends p {
    public static final af delta = new af("must have no value parameters", 0);
    public static final af echo = new af("must have a single value parameter", 1);
    public final /* synthetic */ int charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ af(String str, int i4) {
        super(str, 1);
        this.charlie = i4;
    }

    @Override // lf.InterfaceC2079e
    public final boolean bravo(Ae.f fVar) {
        switch (this.charlie) {
            case 0:
                return fVar.peach().isEmpty();
            default:
                if (fVar.peach().size() == 1) {
                    return true;
                }
                return false;
        }
    }
}
