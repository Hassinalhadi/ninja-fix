package Yb;

import android.view.View;

/* renamed from: Yb.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0328s implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0330t purple;

    public /* synthetic */ ViewOnClickListenerC0328s(C0330t c0330t, int i4) {
        this.alpha = i4;
        this.purple = c0330t;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.alpha) {
            case 0:
                this.purple.juliet();
                return;
            default:
                C0330t c0330t = this.purple;
                c0330t.juliet();
                C0312j0 c0312j0 = c0330t.f2436u;
                if (c0312j0 != null) {
                    c0312j0.invoke();
                    return;
                }
                return;
        }
    }
}
