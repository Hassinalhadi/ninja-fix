package androidx.lifecycle;

/* loaded from: classes3.dex */
public abstract class at {
    public final A alpha;
    public boolean purple;
    public int red = -1;
    public final /* synthetic */ au silver;

    public at(au auVar, A a6) {
        this.silver = auVar;
        this.alpha = a6;
    }

    public final void alpha(boolean z2) {
        int i4;
        if (z2 != this.purple) {
            this.purple = z2;
            if (z2) {
                i4 = 1;
            } else {
                i4 = -1;
            }
            au auVar = this.silver;
            auVar.changeActiveCounter(i4);
            if (this.purple) {
                auVar.dispatchingValue(this);
            }
        }
    }

    public void bravo() {
    }

    public boolean charlie(al alVar) {
        return false;
    }

    public abstract boolean delta();
}
