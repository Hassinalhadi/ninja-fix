package androidx.appcompat.widget;

import android.os.Handler;
import android.widget.AbsListView;

/* renamed from: androidx.appcompat.widget.j0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0462j0 implements AbsListView.OnScrollListener {
    public final /* synthetic */ C0466l0 alpha;

    public C0462j0(C0466l0 c0466l0) {
        this.alpha = c0466l0;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i4, int i5, int i10) {
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i4) {
        if (i4 == 1) {
            C0466l0 c0466l0 = this.alpha;
            if (c0466l0.f2900s.getInputMethodMode() != 2 && c0466l0.f2900s.getContentView() != null) {
                Handler handler = c0466l0.f2896o;
                RunnableC0458h0 runnableC0458h0 = c0466l0.f2892k;
                handler.removeCallbacks(runnableC0458h0);
                runnableC0458h0.run();
            }
        }
    }
}
