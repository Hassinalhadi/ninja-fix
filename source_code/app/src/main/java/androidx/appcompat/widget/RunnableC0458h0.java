package androidx.appcompat.widget;

/* renamed from: androidx.appcompat.widget.h0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC0458h0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0466l0 purple;

    public /* synthetic */ RunnableC0458h0(C0466l0 c0466l0, int i4) {
        this.alpha = i4;
        this.purple = c0466l0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.alpha) {
            case 0:
                Z z2 = this.purple.red;
                if (z2 != null) {
                    z2.setListSelectionHidden(true);
                    z2.requestLayout();
                    return;
                }
                return;
            default:
                C0466l0 c0466l0 = this.purple;
                Z z10 = c0466l0.red;
                if (z10 != null && z10.isAttachedToWindow() && c0466l0.red.getCount() > c0466l0.red.getChildCount() && c0466l0.red.getChildCount() <= c0466l0.f2887f) {
                    c0466l0.f2900s.setInputMethodMode(2);
                    c0466l0.golf();
                    return;
                }
                return;
        }
    }
}
