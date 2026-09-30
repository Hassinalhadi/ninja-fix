package N9;

import io.getunleash.android.events.UnleashStateListener;
import kotlin.Unit;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class n implements UnleashStateListener {
    public final /* synthetic */ p alpha;

    public n(p pVar) {
        this.alpha = pVar;
    }

    @Override // io.getunleash.android.events.UnleashStateListener
    public final void onStateChanged() {
        C3462a.alpha("UnleashFeatureFlags", 12, "State changed — flags updated from server", null);
        this.alpha.alpha.alpha(Unit.INSTANCE);
    }
}
