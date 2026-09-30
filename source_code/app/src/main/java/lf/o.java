package lf;

/* loaded from: classes2.dex */
public final class o extends p {
    public static final o delta = new o("must be a member function", 0);
    public static final o echo = new o("must be a member or an extension function", 1);
    public final /* synthetic */ int charlie;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(String str, int i4) {
        super(str, 0);
        this.charlie = i4;
    }

    @Override // lf.InterfaceC2079e
    public final boolean bravo(Ae.f fVar) {
        switch (this.charlie) {
            case 0:
                if (fVar.f13778c != null) {
                    return true;
                }
                return false;
            default:
                if (fVar.f13778c == null && fVar.f13777b == null) {
                    return false;
                }
                return true;
        }
    }
}
