package lf;

/* loaded from: classes2.dex */
public final class ae extends p {
    public final /* synthetic */ int charlie = 1;
    public final int delta;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ae(int i4) {
        super(r0.toString(), 1);
        StringBuilder sierra = Q0.c.sierra(i4, "must have at least ", " value parameter");
        sierra.append(i4 > 1 ? "s" : "");
        this.delta = i4;
    }

    @Override // lf.InterfaceC2079e
    public final boolean bravo(Ae.f fVar) {
        switch (this.charlie) {
            case 0:
                if (fVar.peach().size() >= this.delta) {
                    return true;
                }
                return false;
            default:
                if (fVar.peach().size() == this.delta) {
                    return true;
                }
                return false;
        }
    }

    public ae() {
        super("must have exactly 2 value parameters", 1);
        this.delta = 2;
    }
}
