package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class d implements g {
    @Override // com.google.android.material.datepicker.g
    public final boolean alpha(ArrayList arrayList, long j5) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && dateValidator.white(j5)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.material.datepicker.g
    public final int getId() {
        return 1;
    }
}
