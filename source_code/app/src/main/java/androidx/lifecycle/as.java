package androidx.lifecycle;

/* loaded from: classes3.dex */
public final class as extends at implements aj {
    public final al teal;
    public final /* synthetic */ au white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public as(au auVar, al alVar, A a6) {
        super(auVar, a6);
        this.white = auVar;
        this.teal = alVar;
    }

    @Override // androidx.lifecycle.at
    public final void bravo() {
        this.teal.getLifecycle().charlie(this);
    }

    @Override // androidx.lifecycle.at
    public final boolean charlie(al alVar) {
        if (this.teal == alVar) {
            return true;
        }
        return false;
    }

    @Override // androidx.lifecycle.at
    public final boolean delta() {
        return this.teal.getLifecycle().bravo().alpha(ab.silver);
    }

    @Override // androidx.lifecycle.aj
    public final void onStateChanged(al alVar, aa aaVar) {
        al alVar2 = this.teal;
        ab bravo = alVar2.getLifecycle().bravo();
        if (bravo == ab.alpha) {
            this.white.removeObserver(this.alpha);
            return;
        }
        ab abVar = null;
        while (abVar != bravo) {
            alpha(delta());
            abVar = bravo;
            bravo = alVar2.getLifecycle().bravo();
        }
    }
}
