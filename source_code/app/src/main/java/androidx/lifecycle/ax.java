package androidx.lifecycle;

/* loaded from: classes3.dex */
public final class ax implements A {
    public final au alpha;
    public final A purple;
    public int red = -1;

    public ax(au auVar, A a6) {
        this.alpha = auVar;
        this.purple = a6;
    }

    @Override // androidx.lifecycle.A
    public final void onChanged(Object obj) {
        int i4 = this.red;
        au auVar = this.alpha;
        if (i4 != auVar.getVersion()) {
            this.red = auVar.getVersion();
            this.purple.onChanged(obj);
        }
    }
}
