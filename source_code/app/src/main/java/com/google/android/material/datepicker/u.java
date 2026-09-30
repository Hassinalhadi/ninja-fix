package com.google.android.material.datepicker;

import android.os.Bundle;
import r1.C2483b;

/* loaded from: classes2.dex */
public final class u {
    public final DateSelector alpha;
    public CalendarConstraints bravo;
    public int charlie = 0;
    public C2483b delta = null;

    public u(DateSelector dateSelector) {
        this.alpha = dateSelector;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (r2.compareTo(r3.purple) <= 0) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final v alpha() {
        Month month;
        if (this.bravo == null) {
            this.bravo = new b().alpha();
        }
        int i4 = this.charlie;
        DateSelector dateSelector = this.alpha;
        if (i4 == 0) {
            this.charlie = dateSelector.magenta();
        }
        C2483b c2483b = this.delta;
        if (c2483b != null) {
            dateSelector.u(c2483b);
        }
        CalendarConstraints calendarConstraints = this.bravo;
        if (calendarConstraints.silver == null) {
            if (!dateSelector.l().isEmpty()) {
                month = Month.echo(((Long) dateSelector.l().iterator().next()).longValue());
                CalendarConstraints calendarConstraints2 = this.bravo;
                if (month.compareTo(calendarConstraints2.alpha) >= 0) {
                }
            }
            month = new Month(ai.hotel());
            CalendarConstraints calendarConstraints3 = this.bravo;
            if (month.compareTo(calendarConstraints3.alpha) < 0 || month.compareTo(calendarConstraints3.purple) > 0) {
                month = this.bravo.alpha;
            }
            calendarConstraints.silver = month;
        }
        v vVar = new v();
        Bundle bundle = new Bundle();
        bundle.putInt("OVERRIDE_THEME_RES_ID", 0);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.bravo);
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.charlie);
        bundle.putCharSequence("TITLE_TEXT_KEY", null);
        bundle.putInt("INPUT_MODE_KEY", 0);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", null);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", 0);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", null);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", 0);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", null);
        vVar.setArguments(bundle);
        return vVar;
    }
}
