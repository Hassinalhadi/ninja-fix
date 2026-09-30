package androidx.fragment.app;

import android.view.View;

/* loaded from: classes3.dex */
public final class ab extends aq {
    public final /* synthetic */ ai alpha;

    public ab(ai aiVar) {
        this.alpha = aiVar;
    }

    @Override // androidx.fragment.app.aq
    public final View bravo(int i4) {
        ai aiVar = this.alpha;
        View view = aiVar.mView;
        if (view != null) {
            return view.findViewById(i4);
        }
        throw new IllegalStateException("Fragment " + aiVar + " does not have a view");
    }

    @Override // androidx.fragment.app.aq
    public final boolean charlie() {
        if (this.alpha.mView != null) {
            return true;
        }
        return false;
    }
}
