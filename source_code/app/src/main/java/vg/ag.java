package vg;

/* loaded from: classes2.dex */
public final class ag extends A {
    public final boolean delta;

    public ag(boolean z2) {
        this.delta = z2;
    }

    @Override // vg.A
    public final void alpha(an anVar, Object obj) {
        if (obj == null) {
            return;
        }
        anVar.bravo(obj.toString(), null, this.delta);
    }
}
