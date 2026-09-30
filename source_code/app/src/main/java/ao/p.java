package ao;

import android.view.CollapsibleActionView;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public final class p extends FrameLayout implements an.c {
    public final CollapsibleActionView alpha;

    /* JADX WARN: Multi-variable type inference failed */
    public p(View view) {
        super(view.getContext());
        this.alpha = (CollapsibleActionView) view;
        addView(view);
    }

    @Override // an.c
    public final void onActionViewCollapsed() {
        this.alpha.onActionViewCollapsed();
    }

    @Override // an.c
    public final void onActionViewExpanded() {
        this.alpha.onActionViewExpanded();
    }
}
