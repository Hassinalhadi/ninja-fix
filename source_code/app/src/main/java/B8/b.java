package B8;

import a0.C0351e;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import ao.ac;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.behavior.HideViewOnScrollBehavior;
import com.google.android.material.textfield.l;
import t0.ad;
import vf.Y;

/* loaded from: classes2.dex */
public final class b implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    private final void alpha(View view) {
    }

    private final void bravo(View view) {
    }

    private final void charlie(View view) {
    }

    private final void delta(View view) {
    }

    private final void echo(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        AccessibilityManager accessibilityManager;
        switch (this.alpha) {
            case 0:
                view.getViewTreeObserver().addOnDrawListener((c) this.purple);
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
            case 2:
                return;
            case 3:
                Context context = view.getContext();
                C0351e c0351e = (C0351e) this.purple;
                if (!c0351e.delta) {
                    context.getApplicationContext().registerComponentCallbacks(c0351e.echo);
                    c0351e.delta = true;
                    return;
                }
                return;
            case 4:
            case 5:
                return;
            case 6:
                l lVar = (l) this.purple;
                if (lVar.f8236n != null && (accessibilityManager = lVar.f8235m) != null && lVar.isAttachedToWindow()) {
                    accessibilityManager.addTouchExplorationStateChangeListener(lVar.f8236n);
                    return;
                }
                return;
            case 7:
                ad adVar = (ad) this.purple;
                AccessibilityManager accessibilityManager2 = adVar.golf;
                adVar.kilo = accessibilityManager2.getEnabledAccessibilityServiceList(-1);
                accessibilityManager2.addAccessibilityStateChangeListener(adVar.india);
                accessibilityManager2.addTouchExplorationStateChangeListener(adVar.juliet);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        AccessibilityManager accessibilityManager2;
        AccessibilityManager accessibilityManager3;
        switch (this.alpha) {
            case 0:
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                HideBottomViewOnScrollBehavior hideBottomViewOnScrollBehavior = (HideBottomViewOnScrollBehavior) this.purple;
                O6.a aVar = hideBottomViewOnScrollBehavior.f7845a;
                if (aVar != null && (accessibilityManager = hideBottomViewOnScrollBehavior.yellow) != null) {
                    accessibilityManager.removeTouchExplorationStateChangeListener(aVar);
                    hideBottomViewOnScrollBehavior.f7845a = null;
                    return;
                }
                return;
            case 2:
                HideViewOnScrollBehavior hideViewOnScrollBehavior = (HideViewOnScrollBehavior) this.purple;
                O6.a aVar2 = hideViewOnScrollBehavior.red;
                if (aVar2 != null && (accessibilityManager2 = hideViewOnScrollBehavior.purple) != null) {
                    accessibilityManager2.removeTouchExplorationStateChangeListener(aVar2);
                    hideViewOnScrollBehavior.red = null;
                    return;
                }
                return;
            case 3:
                Context context = view.getContext();
                C0351e c0351e = (C0351e) this.purple;
                if (c0351e.delta) {
                    context.getApplicationContext().unregisterComponentCallbacks(c0351e.echo);
                    c0351e.delta = false;
                    return;
                }
                return;
            case 4:
                ao.f fVar = (ao.f) this.purple;
                ViewTreeObserver viewTreeObserver = fVar.f3199q;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        fVar.f3199q = view.getViewTreeObserver();
                    }
                    fVar.f3199q.removeGlobalOnLayoutListener(fVar.f3185b);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 5:
                ac acVar = (ac) this.purple;
                ViewTreeObserver viewTreeObserver2 = acVar.f3176h;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        acVar.f3176h = view.getViewTreeObserver();
                    }
                    acVar.f3176h.removeGlobalOnLayoutListener(acVar.f3171b);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 6:
                l lVar = (l) this.purple;
                AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener = lVar.f8236n;
                if (touchExplorationStateChangeListener != null && (accessibilityManager3 = lVar.f8235m) != null) {
                    accessibilityManager3.removeTouchExplorationStateChangeListener(touchExplorationStateChangeListener);
                    return;
                }
                return;
            case 7:
                ad adVar = (ad) this.purple;
                adVar.lima.removeCallbacks(adVar.green);
                AccessibilityManager accessibilityManager4 = adVar.golf;
                accessibilityManager4.removeAccessibilityStateChangeListener(adVar.india);
                accessibilityManager4.removeTouchExplorationStateChangeListener(adVar.juliet);
                return;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((Y) this.purple).foxtrot(null);
                return;
        }
    }
}
