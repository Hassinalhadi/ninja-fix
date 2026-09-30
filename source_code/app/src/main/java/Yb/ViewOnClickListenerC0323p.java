package Yb;

import android.view.View;

/* renamed from: Yb.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0323p implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0325q purple;

    public /* synthetic */ ViewOnClickListenerC0323p(C0325q c0325q, int i4) {
        this.alpha = i4;
        this.purple = c0325q;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.alpha) {
            case 0:
                C0325q c0325q = this.purple;
                c0325q.juliet();
                C0312j0 c0312j0 = c0325q.f2433u;
                if (c0312j0 != null) {
                    c0312j0.invoke();
                    return;
                }
                return;
            case 1:
                this.purple.juliet();
                return;
            default:
                this.purple.juliet();
                return;
        }
    }
}
