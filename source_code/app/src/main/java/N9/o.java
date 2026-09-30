package N9;

import io.getunleash.android.events.UnleashReadyListener;
import kotlin.Unit;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class o implements UnleashReadyListener {
    public final /* synthetic */ p alpha;

    public o(p pVar) {
        this.alpha = pVar;
    }

    @Override // io.getunleash.android.events.UnleashReadyListener
    public final void onReady() {
        C3462a.alpha("UnleashFeatureFlags", 12, "SDK ready — initial flags loaded", null);
        this.alpha.alpha.alpha(Unit.INSTANCE);
    }
}
