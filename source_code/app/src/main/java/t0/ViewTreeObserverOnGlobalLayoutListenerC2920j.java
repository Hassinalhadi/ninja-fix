package t0;

import android.view.ViewTreeObserver;
import uk.co.samuelwall.materialtaptargetprompt.MaterialTapTargetPrompt;

/* renamed from: t0.j, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class ViewTreeObserverOnGlobalLayoutListenerC2920j implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ViewTreeObserverOnGlobalLayoutListenerC2920j(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.alpha) {
            case 0:
                ((C2946x) this.purple).crimson();
                return;
            default:
                MaterialTapTargetPrompt.echo((MaterialTapTargetPrompt) this.purple);
                return;
        }
    }
}
