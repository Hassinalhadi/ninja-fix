package androidx.fragment.app;

import android.os.Bundle;

/* loaded from: classes3.dex */
public final class aa extends ag {
    public final /* synthetic */ ai alpha;

    public aa(ai aiVar) {
        this.alpha = aiVar;
    }

    @Override // androidx.fragment.app.ag
    public final void alpha() {
        Bundle bundle;
        ai aiVar = this.alpha;
        aiVar.mSavedStateRegistryController.alpha();
        androidx.lifecycle.T.charlie(aiVar);
        Bundle bundle2 = aiVar.mSavedFragmentState;
        if (bundle2 != null) {
            bundle = bundle2.getBundle("registryState");
        } else {
            bundle = null;
        }
        aiVar.mSavedStateRegistryController.bravo(bundle);
    }
}
