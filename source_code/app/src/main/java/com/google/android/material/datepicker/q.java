package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.Q;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;

/* loaded from: classes2.dex */
public final class q extends Q {
    public final /* synthetic */ ab alpha;
    public final /* synthetic */ r bravo;

    public q(r rVar, ab abVar) {
        this.bravo = rVar;
        this.alpha = abVar;
    }

    @Override // androidx.recyclerview.widget.Q
    public final void onScrolled(RecyclerView recyclerView, int i4, int i5) {
        int L4;
        r rVar = this.bravo;
        if (i4 < 0) {
            L4 = ((LinearLayoutManager) rVar.f7989c.getLayoutManager()).K();
        } else {
            L4 = ((LinearLayoutManager) rVar.f7989c.getLayoutManager()).L();
        }
        CalendarConstraints calendarConstraints = this.alpha.alpha;
        Calendar delta = ai.delta(calendarConstraints.alpha.alpha);
        delta.add(2, L4);
        Month month = new Month(delta);
        rVar.white = month;
        MaterialButton materialButton = rVar.f7993h;
        Calendar delta2 = ai.delta(calendarConstraints.alpha.alpha);
        delta2.add(2, L4);
        materialButton.setText(new Month(delta2).foxtrot());
        rVar.mike(calendarConstraints.alpha.golf(month));
    }
}
