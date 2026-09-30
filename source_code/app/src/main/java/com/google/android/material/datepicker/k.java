package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import delivery.samurai.android.R;
import java.util.Calendar;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class k extends BaseAdapter {
    public static final int silver;
    public final Calendar alpha;
    public final int purple;
    public final int red;

    static {
        int i4;
        if (Build.VERSION.SDK_INT >= 26) {
            i4 = 4;
        } else {
            i4 = 1;
        }
        silver = i4;
    }

    public k() {
        Calendar india = ai.india(null);
        this.alpha = india;
        this.purple = india.getMaximum(7);
        this.red = india.getFirstDayOfWeek();
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return this.purple;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i4) {
        int i5 = this.purple;
        if (i4 >= i5) {
            return null;
        }
        int i10 = i4 + this.red;
        if (i10 > i5) {
            i10 -= i5;
        }
        return Integer.valueOf(i10);
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day_of_week, viewGroup, false);
        }
        int i5 = i4 + this.red;
        int i10 = this.purple;
        if (i5 > i10) {
            i5 -= i10;
        }
        Calendar calendar = this.alpha;
        calendar.set(7, i5);
        textView.setText(calendar.getDisplayName(7, silver, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(R.string.mtrl_picker_day_of_week_column_header), calendar.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public k(int i4) {
        Calendar india = ai.india(null);
        this.alpha = india;
        this.purple = india.getMaximum(7);
        this.red = i4;
    }
}
