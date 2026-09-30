package com.google.android.material.datepicker;

import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class e implements g {
    @Override // com.google.android.material.datepicker.g
    public final boolean alpha(ArrayList arrayList, long j5) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            CalendarConstraints.DateValidator dateValidator = (CalendarConstraints.DateValidator) it.next();
            if (dateValidator != null && !dateValidator.white(j5)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.material.datepicker.g
    public final int getId() {
        return 2;
    }
}
