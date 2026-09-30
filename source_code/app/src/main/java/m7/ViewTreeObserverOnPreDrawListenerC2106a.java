package m7;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.transformation.ExpandableBehavior;

/* renamed from: m7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewTreeObserverOnPreDrawListenerC2106a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View alpha;
    public final /* synthetic */ int purple;
    public final /* synthetic */ W6.a red;
    public final /* synthetic */ ExpandableBehavior silver;

    public ViewTreeObserverOnPreDrawListenerC2106a(ExpandableBehavior expandableBehavior, View view, int i4, W6.a aVar) {
        this.silver = expandableBehavior;
        this.alpha = view;
        this.purple = i4;
        this.red = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.alpha;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        ExpandableBehavior expandableBehavior = this.silver;
        if (expandableBehavior.alpha == this.purple) {
            Object obj = this.red;
            expandableBehavior.echo((View) obj, view, ((FloatingActionButton) obj).f8029h.alpha, false);
        }
        return false;
    }
}
