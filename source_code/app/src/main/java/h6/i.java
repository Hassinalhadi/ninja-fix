package h6;

/* loaded from: classes2.dex */
public final class i implements j {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ AbstractC1811a bravo;

    public /* synthetic */ i(AbstractC1811a abstractC1811a, int i4) {
        this.alpha = i4;
        this.bravo = abstractC1811a;
    }

    @Override // h6.j
    public final int alpha() {
        switch (this.alpha) {
            case 0:
                return 4;
            default:
                return 5;
        }
    }

    @Override // h6.j
    public final void bravo() {
        switch (this.alpha) {
            case 0:
                this.bravo.alpha.charlie();
                return;
            default:
                this.bravo.alpha.echo();
                return;
        }
    }
}
