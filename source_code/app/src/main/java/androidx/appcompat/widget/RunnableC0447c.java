package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0447c implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ActionBarOverlayLayout purple;

    public /* synthetic */ RunnableC0447c(ActionBarOverlayLayout actionBarOverlayLayout, int i4) {
        this.alpha = i4;
        this.purple = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                ActionBarOverlayLayout actionBarOverlayLayout = this.purple;
                actionBarOverlayLayout.bravo();
                actionBarOverlayLayout.f2797p = actionBarOverlayLayout.silver.animate().translationY(0.0f).setListener(actionBarOverlayLayout.f2798q);
                return;
            default:
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.purple;
                actionBarOverlayLayout2.bravo();
                actionBarOverlayLayout2.f2797p = actionBarOverlayLayout2.silver.animate().translationY(-actionBarOverlayLayout2.silver.getHeight()).setListener(actionBarOverlayLayout2.f2798q);
                return;
        }
    }
}
