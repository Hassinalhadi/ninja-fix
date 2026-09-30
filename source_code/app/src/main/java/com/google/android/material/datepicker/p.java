package com.google.android.material.datepicker;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import java.util.Calendar;
import java.util.Iterator;
import r1.C2483b;

/* loaded from: classes2.dex */
public final class p extends I {
    public final Calendar alpha = ai.india(null);
    public final Calendar bravo = ai.india(null);
    public final /* synthetic */ r charlie;

    public p(r rVar) {
        this.charlie = rVar;
    }

    @Override // androidx.recyclerview.widget.I
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        Object obj;
        int i4;
        int width;
        if ((recyclerView.getAdapter() instanceof al) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            al alVar = (al) recyclerView.getAdapter();
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            r rVar = this.charlie;
            Iterator it = rVar.red.uniform().iterator();
            while (it.hasNext()) {
                C2483b c2483b = (C2483b) it.next();
                Object obj2 = c2483b.alpha;
                if (obj2 != null && (obj = c2483b.bravo) != null) {
                    long longValue = ((Long) obj2).longValue();
                    Calendar calendar = this.alpha;
                    calendar.setTimeInMillis(longValue);
                    long longValue2 = ((Long) obj).longValue();
                    Calendar calendar2 = this.bravo;
                    calendar2.setTimeInMillis(longValue2);
                    int i5 = calendar.get(1) - alVar.alpha.silver.alpha.red;
                    int i10 = calendar2.get(1) - alVar.alpha.silver.alpha.red;
                    View romeo = gridLayoutManager.romeo(i5);
                    View romeo2 = gridLayoutManager.romeo(i10);
                    int i11 = gridLayoutManager.bronze;
                    int i12 = i5 / i11;
                    int i13 = i10 / i11;
                    for (int i14 = i12; i14 <= i13; i14++) {
                        View romeo3 = gridLayoutManager.romeo(gridLayoutManager.bronze * i14);
                        if (romeo3 != null) {
                            int top = romeo3.getTop() + ((Rect) ((c) rVar.f7987a.delta).bravo).top;
                            int bottom = romeo3.getBottom() - ((Rect) ((c) rVar.f7987a.delta).bravo).bottom;
                            if (i14 == i12 && romeo != null) {
                                i4 = (romeo.getWidth() / 2) + romeo.getLeft();
                            } else {
                                i4 = 0;
                            }
                            if (i14 == i13 && romeo2 != null) {
                                width = (romeo2.getWidth() / 2) + romeo2.getLeft();
                            } else {
                                width = recyclerView.getWidth();
                            }
                            canvas.drawRect(i4, top, width, bottom, (Paint) rVar.f7987a.hotel);
                        }
                    }
                }
            }
        }
    }
}
