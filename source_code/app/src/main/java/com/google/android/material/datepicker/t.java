package com.google.android.material.datepicker;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class t {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ androidx.fragment.app.ai bravo;

    public /* synthetic */ t(androidx.fragment.app.ai aiVar, int i4) {
        this.alpha = i4;
        this.bravo = aiVar;
    }

    public final void alpha() {
        switch (this.alpha) {
            case 0:
                ((v) this.bravo).f8001J.setEnabled(false);
                return;
            default:
                Iterator it = ((w) this.bravo).alpha.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).alpha();
                }
                return;
        }
    }

    public final void bravo(Object obj) {
        switch (this.alpha) {
            case 0:
                v vVar = (v) this.bravo;
                String quebec = vVar.sierra().quebec(vVar.getContext());
                vVar.f7998G.setContentDescription(vVar.sierra().peach(vVar.requireContext()));
                vVar.f7998G.setText(quebec);
                vVar.f8001J.setEnabled(vVar.sierra().d());
                return;
            default:
                Iterator it = ((w) this.bravo).alpha.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).bravo(obj);
                }
                return;
        }
    }
}
