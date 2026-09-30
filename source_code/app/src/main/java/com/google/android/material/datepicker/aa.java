package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import java.util.WeakHashMap;
import s1.au;

/* loaded from: classes2.dex */
public final class aa extends f0 {
    public final TextView alpha;
    public final MaterialCalendarGridView bravo;

    public aa(LinearLayout linearLayout, boolean z2) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.alpha = textView;
        WeakHashMap weakHashMap = au.alpha;
        new s1.ah(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 2).foxtrot(textView, Boolean.TRUE);
        this.bravo = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (!z2) {
            textView.setVisibility(8);
        }
    }
}
