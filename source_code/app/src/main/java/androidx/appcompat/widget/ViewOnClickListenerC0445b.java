package androidx.appcompat.widget;

import android.view.View;

/* renamed from: androidx.appcompat.widget.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ViewOnClickListenerC0445b implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ ViewOnClickListenerC0445b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        ao.n nVar;
        switch (this.alpha) {
            case 0:
                ((an.b) this.purple).alpha();
                return;
            default:
                Z0 z02 = ((Toolbar) this.purple).f2827F;
                if (z02 == null) {
                    nVar = null;
                } else {
                    nVar = z02.purple;
                }
                if (nVar != null) {
                    nVar.collapseActionView();
                    return;
                }
                return;
        }
    }
}
