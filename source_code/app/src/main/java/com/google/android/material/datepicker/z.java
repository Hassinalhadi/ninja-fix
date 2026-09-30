package com.google.android.material.datepicker;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final class z implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView alpha;
    public final /* synthetic */ ab purple;

    public z(ab abVar, MaterialCalendarGridView materialCalendarGridView) {
        this.purple = abVar;
        this.alpha = materialCalendarGridView;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i4, long j5) {
        MaterialCalendarGridView materialCalendarGridView = this.alpha;
        y alpha = materialCalendarGridView.alpha();
        if (i4 >= alpha.alpha() && i4 <= alpha.charlie()) {
            ab abVar = this.purple;
            long longValue = materialCalendarGridView.alpha().getItem(i4).longValue();
            r rVar = abVar.delta.alpha;
            if (rVar.silver.red.white(longValue)) {
                rVar.red.x(longValue);
                Iterator it = rVar.alpha.iterator();
                while (it.hasNext()) {
                    ((t) it.next()).bravo(rVar.red.p());
                }
                rVar.f7989c.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = rVar.f7988b;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
