package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import delivery.samurai.android.R;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import r1.C2483b;

/* loaded from: classes2.dex */
public final class y extends BaseAdapter {
    public final Month alpha;
    public final DateSelector purple;
    public Collection red;
    public B2.ad silver;
    public final CalendarConstraints teal;
    public final DayViewDecorator white;
    public static final int yellow = ai.india(null).getMaximum(4);

    /* renamed from: a, reason: collision with root package name */
    public static final int f8022a = (ai.india(null).getMaximum(7) + ai.india(null).getMaximum(5)) - 1;

    public y(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.alpha = month;
        this.purple = dateSelector;
        this.teal = calendarConstraints;
        this.white = dayViewDecorator;
        this.red = dateSelector.l();
    }

    public final int alpha() {
        int i4 = this.teal.teal;
        Month month = this.alpha;
        Calendar calendar = month.alpha;
        int i5 = calendar.get(7);
        if (i4 <= 0) {
            i4 = calendar.getFirstDayOfWeek();
        }
        int i10 = i5 - i4;
        if (i10 < 0) {
            return i10 + month.silver;
        }
        return i10;
    }

    @Override // android.widget.Adapter
    /* renamed from: bravo, reason: merged with bridge method [inline-methods] */
    public final Long getItem(int i4) {
        if (i4 >= alpha() && i4 <= charlie()) {
            int alpha = (i4 - alpha()) + 1;
            Calendar delta = ai.delta(this.alpha.alpha);
            delta.set(5, alpha);
            return Long.valueOf(delta.getTimeInMillis());
        }
        return null;
    }

    public final int charlie() {
        return (alpha() + this.alpha.teal) - 1;
    }

    public final void delta(TextView textView, long j5, int i4) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        String format;
        c cVar;
        boolean z13 = true;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        if (ai.hotel().getTimeInMillis() == j5) {
            z2 = true;
        } else {
            z2 = false;
        }
        DateSelector dateSelector = this.purple;
        Iterator it = dateSelector.uniform().iterator();
        while (true) {
            if (it.hasNext()) {
                Object obj = ((C2483b) it.next()).alpha;
                if (obj != null && ((Long) obj).longValue() == j5) {
                    z10 = true;
                    break;
                }
            } else {
                z10 = false;
                break;
            }
        }
        Iterator it2 = dateSelector.uniform().iterator();
        while (true) {
            if (it2.hasNext()) {
                Object obj2 = ((C2483b) it2.next()).bravo;
                if (obj2 != null && ((Long) obj2).longValue() == j5) {
                    z11 = true;
                    break;
                }
            } else {
                z11 = false;
                break;
            }
        }
        Calendar hotel = ai.hotel();
        Calendar india = ai.india(null);
        india.setTimeInMillis(j5);
        if (hotel.get(1) == india.get(1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            Locale locale = Locale.getDefault();
            format = Build.VERSION.SDK_INT >= 24 ? ai.charlie("MMMMEEEEd", locale).format(new Date(j5)) : ai.golf(0, locale).format(new Date(j5));
        } else {
            Locale locale2 = Locale.getDefault();
            if (Build.VERSION.SDK_INT >= 24) {
                format = ai.charlie("yMMMMEEEEd", locale2).format(new Date(j5));
            } else {
                format = ai.golf(0, locale2).format(new Date(j5));
            }
        }
        if (z2) {
            format = String.format(context.getString(R.string.mtrl_picker_today_description), format);
        }
        if (z10) {
            format = String.format(context.getString(R.string.mtrl_picker_start_date_description), format);
        } else if (z11) {
            format = String.format(context.getString(R.string.mtrl_picker_end_date_description), format);
        }
        textView.setContentDescription(format);
        if (this.teal.red.white(j5)) {
            textView.setEnabled(true);
            Iterator it3 = dateSelector.l().iterator();
            while (true) {
                if (it3.hasNext()) {
                    if (ai.alpha(j5) == ai.alpha(((Long) it3.next()).longValue())) {
                        break;
                    }
                } else {
                    z13 = false;
                    break;
                }
            }
            textView.setSelected(z13);
            if (z13) {
                cVar = (c) this.silver.bravo;
            } else if (ai.hotel().getTimeInMillis() == j5) {
                cVar = (c) this.silver.charlie;
            } else {
                cVar = (c) this.silver.alpha;
            }
        } else {
            textView.setEnabled(false);
            cVar = (c) this.silver.golf;
        }
        if (this.white != null && i4 != -1) {
            int i5 = this.alpha.red;
            cVar.bravo(textView);
            textView.setCompoundDrawables(null, null, null, null);
            textView.setContentDescription(format);
            return;
        }
        cVar.bravo(textView);
    }

    public final void echo(MaterialCalendarGridView materialCalendarGridView, long j5) {
        Month echo = Month.echo(j5);
        Month month = this.alpha;
        if (echo.equals(month)) {
            Calendar delta = ai.delta(month.alpha);
            delta.setTimeInMillis(j5);
            int i4 = delta.get(5);
            delta((TextView) materialCalendarGridView.getChildAt((materialCalendarGridView.alpha().alpha() + (i4 - 1)) - materialCalendarGridView.getFirstVisiblePosition()), j5, i4);
        }
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        return f8022a;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i4) {
        return i4 / this.alpha.silver;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View getView(int i4, View view, ViewGroup viewGroup) {
        int i5;
        Long item;
        Context context = viewGroup.getContext();
        if (this.silver == null) {
            this.silver = new B2.ad(context);
        }
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_day, viewGroup, false);
        }
        int alpha = i4 - alpha();
        if (alpha >= 0) {
            Month month = this.alpha;
            if (alpha < month.teal) {
                i5 = alpha + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i5)));
                textView.setVisibility(0);
                textView.setEnabled(true);
                item = getItem(i4);
                if (item != null) {
                    return textView;
                }
                delta(textView, item.longValue(), i5);
                return textView;
            }
        }
        textView.setVisibility(8);
        textView.setEnabled(false);
        i5 = -1;
        item = getItem(i4);
        if (item != null) {
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return true;
    }
}
