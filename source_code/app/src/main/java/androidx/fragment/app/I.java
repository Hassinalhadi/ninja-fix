package androidx.fragment.app;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class I implements H {
    public final String alpha;
    public final int bravo;
    public final int charlie;
    public final /* synthetic */ L delta;

    public I(L l10, String str, int i4, int i5) {
        this.delta = l10;
        this.alpha = str;
        this.bravo = i4;
        this.charlie = i5;
    }

    @Override // androidx.fragment.app.H
    public final boolean alpha(ArrayList arrayList, ArrayList arrayList2) {
        ai aiVar = this.delta.amber;
        if (aiVar != null && this.bravo < 0 && this.alpha == null && aiVar.getChildFragmentManager().maroon(-1, 0)) {
            return false;
        }
        return this.delta.navy(arrayList, arrayList2, this.alpha, this.bravo, this.charlie);
    }
}
