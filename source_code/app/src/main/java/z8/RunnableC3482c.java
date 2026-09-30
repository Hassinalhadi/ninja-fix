package z8;

import C8.i;
import com.google.firebase.perf.session.gauges.GaugeManager;

/* renamed from: z8.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC3482c implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ GaugeManager purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ i silver;

    public /* synthetic */ RunnableC3482c(GaugeManager gaugeManager, String str, i iVar, int i4) {
        this.alpha = i4;
        this.purple = gaugeManager;
        this.red = str;
        this.silver = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                GaugeManager.delta(this.purple, this.red, this.silver);
                return;
            default:
                GaugeManager.alpha(this.purple, this.red, this.silver);
                return;
        }
    }
}
