package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.az;
import androidx.recyclerview.widget.f0;
import delivery.samurai.android.R;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class al extends az {
    public final r alpha;

    public al(r rVar) {
        this.alpha = rVar;
    }

    @Override // androidx.recyclerview.widget.az
    public final int getItemCount() {
        return this.alpha.silver.white;
    }

    @Override // androidx.recyclerview.widget.az
    public final void onBindViewHolder(f0 f0Var, int i4) {
        String format;
        Object obj;
        boolean z2 = false;
        ak akVar = (ak) f0Var;
        r rVar = this.alpha;
        int i5 = rVar.silver.alpha.red + i4;
        akVar.alpha.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(i5)));
        TextView textView = akVar.alpha;
        Context context = textView.getContext();
        if (ai.hotel().get(1) == i5) {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_current_year_description), Integer.valueOf(i5));
        } else {
            format = String.format(context.getString(R.string.mtrl_picker_navigate_to_year_description), Integer.valueOf(i5));
        }
        textView.setContentDescription(format);
        B2.ad adVar = rVar.f7987a;
        Calendar hotel = ai.hotel();
        if (hotel.get(1) == i5) {
            obj = adVar.foxtrot;
        } else {
            obj = adVar.delta;
        }
        c cVar = (c) obj;
        Iterator it = rVar.red.l().iterator();
        while (it.hasNext()) {
            hotel.setTimeInMillis(((Long) it.next()).longValue());
            if (hotel.get(1) == i5) {
                cVar = (c) adVar.echo;
            }
        }
        cVar.bravo(textView);
        if (cVar == ((c) adVar.echo)) {
            z2 = true;
        }
        textView.setSelected(z2);
        textView.setOnClickListener(new aj(this, i5));
    }

    @Override // androidx.recyclerview.widget.az
    public final f0 onCreateViewHolder(ViewGroup viewGroup, int i4) {
        return new ak((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
