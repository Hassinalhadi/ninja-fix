package com.google.android.material.datepicker;

import android.view.View;
import com.google.android.material.button.MaterialButton;

/* loaded from: classes2.dex */
public final class aj implements View.OnClickListener {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ al purple;

    public aj(al alVar, int i4) {
        this.purple = alVar;
        this.alpha = i4;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        r rVar = this.purple.alpha;
        Month delta = Month.delta(this.alpha, rVar.white.purple);
        CalendarConstraints calendarConstraints = rVar.silver;
        Month month = calendarConstraints.alpha;
        if (delta.compareTo(month) < 0) {
            delta = month;
        } else {
            Month month2 = calendarConstraints.purple;
            if (delta.compareTo(month2) > 0) {
                delta = month2;
            }
        }
        rVar.kilo(delta);
        rVar.lima(1);
        MaterialButton materialButton = rVar.f7993h;
        if (materialButton != null) {
            materialButton.sendAccessibilityEvent(8);
        }
    }
}
