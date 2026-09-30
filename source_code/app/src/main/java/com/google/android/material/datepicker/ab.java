package com.google.android.material.datepicker;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import java.util.Calendar;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class ab extends az {
    public final CalendarConstraints alpha;
    public final DateSelector bravo;
    public final DayViewDecorator charlie;
    public final o delta;
    public final int echo;

    public ab(ContextThemeWrapper contextThemeWrapper, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, o oVar) {
        int i4;
        Month month = calendarConstraints.alpha;
        Month month2 = calendarConstraints.silver;
        if (month.compareTo(month2) <= 0) {
            if (month2.compareTo(calendarConstraints.purple) <= 0) {
                int dimensionPixelSize = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height) * y.yellow;
                if (v.uniform(android.R.attr.windowFullscreen, contextThemeWrapper)) {
                    i4 = contextThemeWrapper.getResources().getDimensionPixelSize(R.dimen.mtrl_calendar_day_height);
                } else {
                    i4 = 0;
                }
                this.echo = dimensionPixelSize + i4;
                this.alpha = calendarConstraints;
                this.bravo = dateSelector;
                this.charlie = dayViewDecorator;
                this.delta = oVar;
                setHasStableIds(true);
                return;
            }
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.az
    public final int getItemCount() {
        return this.alpha.yellow;
    }

    @Override // androidx.recyclerview.widget.az
    public final long getItemId(int i4) {
        Calendar delta = ai.delta(this.alpha.alpha.alpha);
        delta.add(2, i4);
        return new Month(delta).alpha.getTimeInMillis();
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        aa aaVar = (aa) f0Var;
        CalendarConstraints calendarConstraints = this.alpha;
        Calendar delta = ai.delta(calendarConstraints.alpha.alpha);
        delta.add(2, i4);
        Month month = new Month(delta);
        aaVar.alpha.setText(month.foxtrot());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aaVar.bravo.findViewById(R.id.month_grid);
        if (materialCalendarGridView.alpha() != null && month.equals(materialCalendarGridView.alpha().alpha)) {
            materialCalendarGridView.invalidate();
            y alpha = materialCalendarGridView.alpha();
            Iterator it = alpha.red.iterator();
            while (it.hasNext()) {
                alpha.echo(materialCalendarGridView, ((Long) it.next()).longValue());
            }
            DateSelector dateSelector = alpha.purple;
            if (dateSelector != null) {
                Iterator it2 = dateSelector.l().iterator();
                while (it2.hasNext()) {
                    alpha.echo(materialCalendarGridView, ((Long) it2.next()).longValue());
                }
                alpha.red = dateSelector.l();
            }
        } else {
            y yVar = new y(month, this.bravo, calendarConstraints, this.charlie);
            materialCalendarGridView.setNumColumns(month.silver);
            materialCalendarGridView.setAdapter((ListAdapter) yVar);
        }
        materialCalendarGridView.setOnItemClickListener(new z(this, materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (v.uniform(android.R.attr.windowFullscreen, viewGroup.getContext())) {
            linearLayout.setLayoutParams(new M(-1, this.echo));
            return new aa(linearLayout, true);
        }
        return new aa(linearLayout, false);
    }
}
