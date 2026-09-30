package x2;

/* loaded from: classes3.dex */
public final class ae extends aa {
    public final /* synthetic */ int alpha;
    public z bravo;

    public /* synthetic */ ae() {
        this.alpha = 1;
    }

    @Override // x2.aa, x2.x
    public void onTransitionCancel(z zVar) {
        switch (this.alpha) {
            case 0:
                af afVar = (af) this.bravo;
                afVar.f14063y.remove(zVar);
                if (!afVar.tango()) {
                    afVar.yankee(afVar, y.olive, false);
                    afVar.f14085k = true;
                    afVar.yankee(afVar, y.ochre, false);
                    return;
                }
                return;
            default:
                super.onTransitionCancel(zVar);
                return;
        }
    }

    @Override // x2.aa, x2.x
    public void onTransitionEnd(z zVar) {
        switch (this.alpha) {
            case 1:
                af afVar = (af) this.bravo;
                int i4 = afVar.A - 1;
                afVar.A = i4;
                if (i4 == 0) {
                    afVar.B = false;
                    afVar.mike();
                }
                zVar.azure(this);
                return;
            case 2:
                this.bravo.blue();
                zVar.azure(this);
                return;
            default:
                return;
        }
    }

    @Override // x2.aa, x2.x
    public void onTransitionStart(z zVar) {
        switch (this.alpha) {
            case 1:
                af afVar = (af) this.bravo;
                if (!afVar.B) {
                    afVar.gray();
                    afVar.B = true;
                    return;
                }
                return;
            default:
                super.onTransitionStart(zVar);
                return;
        }
    }

    public /* synthetic */ ae(z zVar, int i4) {
        this.alpha = i4;
        this.bravo = zVar;
    }
}
