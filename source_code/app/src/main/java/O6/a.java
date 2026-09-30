package O6;

import android.view.View;
import android.view.accessibility.AccessibilityManager;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements AccessibilityManager.TouchExplorationStateChangeListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ View bravo;
    public final /* synthetic */ androidx.coordinatorlayout.widget.c charlie;

    public /* synthetic */ a(androidx.coordinatorlayout.widget.c cVar, View view, int i4) {
        this.alpha = i4;
        this.charlie = cVar;
        this.bravo = view;
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean z2) {
        switch (this.alpha) {
            case 0:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.charlie;
                if (z2) {
                    if (hideBottomViewOnScrollBehavior.f7847c == 1) {
                        hideBottomViewOnScrollBehavior.echo(this.bravo);
                        return;
                    }
                    return;
                }
                hideBottomViewOnScrollBehavior.getClass();
                return;
            default:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.charlie;
                hideViewOnScrollBehavior.getClass();
                if (z2 && hideViewOnScrollBehavior.f7851c == 1) {
                    hideViewOnScrollBehavior.foxtrot(this.bravo);
                    return;
                }
                return;
        }
    }
}
