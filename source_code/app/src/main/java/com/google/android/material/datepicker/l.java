package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class l implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ab purple;
    public final /* synthetic */ r red;

    public /* synthetic */ l(r rVar, ab abVar, int i4) {
        this.alpha = i4;
        this.red = rVar;
        this.purple = abVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.alpha) {
            case 0:
                r rVar = this.red;
                int L4 = ((LinearLayoutManager) rVar.f7989c.getLayoutManager()).L() - 1;
                Calendar delta = ai.delta(this.purple.alpha.alpha.alpha);
                delta.add(2, L4);
                rVar.kilo(new Month(delta));
                return;
            default:
                r rVar2 = this.red;
                int K6 = ((LinearLayoutManager) rVar2.f7989c.getLayoutManager()).K() + 1;
                Calendar delta2 = ai.delta(this.purple.alpha.alpha.alpha);
                delta2.add(2, K6);
                rVar2.kilo(new Month(delta2));
                return;
        }
    }
}
