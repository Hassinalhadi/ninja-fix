package T0;

/* loaded from: classes3.dex */
public final class s extends T.r implements Y.r {
    @Override // Y.r
    public final void romeo(Y.o oVar) {
        boolean z2;
        if (getNode().isAttached() && l.charlie(this).hasFocusable()) {
            z2 = true;
        } else {
            z2 = false;
        }
        oVar.delta(z2);
    }
}
