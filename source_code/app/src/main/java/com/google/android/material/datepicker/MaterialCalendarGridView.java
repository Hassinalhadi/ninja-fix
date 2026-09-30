package com.google.android.material.datepicker;

import android.R;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Calendar;
import java.util.Iterator;
import r1.C2483b;
import s1.au;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class MaterialCalendarGridView extends GridView {
    public final Calendar alpha;
    public final boolean purple;

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.alpha = ai.india(null);
        if (v.uniform(R.attr.windowFullscreen, getContext())) {
            setNextFocusLeftId(delivery.samurai.android.R.id.cancel_button);
            setNextFocusRightId(delivery.samurai.android.R.id.confirm_button);
        }
        this.purple = v.uniform(delivery.samurai.android.R.attr.nestedScrollable, getContext());
        au.november(this, new I1.c(4));
    }

    public final y alpha() {
        return (y) super.getAdapter();
    }

    public final View bravo(int i4) {
        return getChildAt(i4 - getFirstVisiblePosition());
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final ListAdapter getAdapter() {
        return (y) super.getAdapter();
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        ((y) super.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        boolean z2;
        int alpha;
        int width;
        int alpha2;
        int width2;
        int i4;
        int i5;
        int i10;
        int i11;
        int left;
        MaterialCalendarGridView materialCalendarGridView = this;
        super.onDraw(canvas);
        y yVar = (y) super.getAdapter();
        DateSelector dateSelector = yVar.purple;
        B2.ad adVar = yVar.silver;
        int max = Math.max(yVar.alpha(), materialCalendarGridView.getFirstVisiblePosition());
        int min = Math.min(yVar.charlie(), materialCalendarGridView.getLastVisiblePosition());
        Long item = yVar.getItem(max);
        Long item2 = yVar.getItem(min);
        Iterator it = dateSelector.uniform().iterator();
        while (it.hasNext()) {
            C2483b c2483b = (C2483b) it.next();
            Object obj = c2483b.alpha;
            if (obj != null) {
                Object obj2 = c2483b.bravo;
                if (obj2 != null) {
                    Long l10 = (Long) obj;
                    long longValue = l10.longValue();
                    Long l11 = (Long) obj2;
                    long longValue2 = l11.longValue();
                    if (item != null && item2 != null && l10.longValue() <= item2.longValue() && l11.longValue() >= item.longValue()) {
                        if (materialCalendarGridView.getLayoutDirection() == 1) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        long longValue3 = item.longValue();
                        Calendar calendar = materialCalendarGridView.alpha;
                        Month month = yVar.alpha;
                        if (longValue < longValue3) {
                            if (max % month.silver == 0) {
                                left = 0;
                            } else if (!z2) {
                                left = materialCalendarGridView.bravo(max - 1).getRight();
                            } else {
                                left = materialCalendarGridView.bravo(max - 1).getLeft();
                            }
                            width = left;
                            alpha = max;
                        } else {
                            calendar.setTimeInMillis(longValue);
                            alpha = yVar.alpha() + (calendar.get(5) - 1);
                            View bravo = materialCalendarGridView.bravo(alpha);
                            width = (bravo.getWidth() / 2) + bravo.getLeft();
                        }
                        if (longValue2 > item2.longValue()) {
                            if ((min + 1) % month.silver == 0) {
                                width2 = materialCalendarGridView.getWidth();
                            } else if (!z2) {
                                width2 = materialCalendarGridView.bravo(min).getRight();
                            } else {
                                width2 = materialCalendarGridView.bravo(min).getLeft();
                            }
                            alpha2 = min;
                        } else {
                            calendar.setTimeInMillis(longValue2);
                            alpha2 = yVar.alpha() + (calendar.get(5) - 1);
                            View bravo2 = materialCalendarGridView.bravo(alpha2);
                            width2 = (bravo2.getWidth() / 2) + bravo2.getLeft();
                        }
                        int itemId = (int) yVar.getItemId(alpha);
                        int itemId2 = (int) yVar.getItemId(alpha2);
                        while (itemId <= itemId2) {
                            int numColumns = materialCalendarGridView.getNumColumns() * itemId;
                            y yVar2 = yVar;
                            int numColumns2 = (materialCalendarGridView.getNumColumns() + numColumns) - 1;
                            View bravo3 = materialCalendarGridView.bravo(numColumns);
                            int top = bravo3.getTop() + ((Rect) ((c) adVar.alpha).bravo).top;
                            Iterator it2 = it;
                            int bottom = bravo3.getBottom() - ((Rect) ((c) adVar.alpha).bravo).bottom;
                            if (!z2) {
                                if (numColumns > alpha) {
                                    i10 = 0;
                                } else {
                                    i10 = width;
                                }
                                if (alpha2 > numColumns2) {
                                    i11 = getWidth();
                                } else {
                                    i11 = width2;
                                }
                            } else {
                                if (alpha2 > numColumns2) {
                                    i4 = 0;
                                } else {
                                    i4 = width2;
                                }
                                if (numColumns > alpha) {
                                    i5 = getWidth();
                                } else {
                                    i5 = width;
                                }
                                int i12 = i5;
                                i10 = i4;
                                i11 = i12;
                            }
                            canvas.drawRect(i10, top, i11, bottom, (Paint) adVar.hotel);
                            itemId++;
                            materialCalendarGridView = this;
                            yVar = yVar2;
                            it = it2;
                        }
                    } else {
                        materialCalendarGridView = this;
                        yVar = yVar;
                        it = it;
                    }
                }
            }
            materialCalendarGridView = this;
        }
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onFocusChanged(boolean z2, int i4, Rect rect) {
        if (z2) {
            if (i4 == 33) {
                setSelection(((y) super.getAdapter()).charlie());
                return;
            } else if (i4 == 130) {
                setSelection(((y) super.getAdapter()).alpha());
                return;
            } else {
                super.onFocusChanged(true, i4, rect);
                return;
            }
        }
        super.onFocusChanged(false, i4, rect);
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i4, KeyEvent keyEvent) {
        if (!super.onKeyDown(i4, keyEvent)) {
            return false;
        }
        int selectedItemPosition = getSelectedItemPosition();
        if (selectedItemPosition == -1 || (selectedItemPosition >= ((y) super.getAdapter()).alpha() && selectedItemPosition <= ((y) super.getAdapter()).charlie())) {
            return true;
        }
        if (19 != i4) {
            return false;
        }
        setSelection(((y) super.getAdapter()).alpha());
        return true;
    }

    @Override // android.widget.GridView, android.widget.AbsListView, android.view.View
    public final void onMeasure(int i4, int i5) {
        if (this.purple) {
            super.onMeasure(i4, View.MeasureSpec.makeMeasureSpec(16777215, RecyclerView.UNDEFINED_DURATION));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    public final void setSelection(int i4) {
        if (i4 < ((y) super.getAdapter()).alpha()) {
            super.setSelection(((y) super.getAdapter()).alpha());
        } else {
            super.setSelection(i4);
        }
    }

    @Override // android.widget.GridView, android.widget.AdapterView
    /* renamed from: getAdapter, reason: avoid collision after fix types in other method */
    public final ListAdapter getAdapter2() {
        return (y) super.getAdapter();
    }

    @Override // android.widget.AdapterView
    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof y) {
            super.setAdapter(listAdapter);
            return;
        }
        throw new IllegalArgumentException(String.format("%1$s must have its Adapter set to a %2$s", MaterialCalendarGridView.class.getCanonicalName(), y.class.getCanonicalName()));
    }
}
