package A0;

/* loaded from: classes3.dex */
public final class ac {
    public final String alpha;
    public final Xd.l bravo;
    public final boolean charlie;

    public /* synthetic */ ac(String str) {
        this(str, w.f15n);
    }

    public final void alpha(ad adVar, Object obj) {
        ((k) adVar).hotel(this, obj);
    }

    public final String toString() {
        return "AccessibilityKey: " + this.alpha;
    }

    public ac(String str, Xd.l lVar) {
        this.alpha = str;
        this.bravo = lVar;
    }

    public ac(String str, int i4) {
        this(str);
        this.charlie = true;
    }

    public ac(String str, boolean z2, Xd.l lVar) {
        this(str, lVar);
        this.charlie = z2;
    }
}
