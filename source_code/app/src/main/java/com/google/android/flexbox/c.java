package com.google.android.flexbox;

import android.R;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.P0;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c extends I {
    public static final int[] charlie = {R.attr.listDivider};
    public Drawable alpha;
    public int bravo;

    @Override // androidx.recyclerview.widget.I
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
        boolean z2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition != 0) {
            int i4 = this.bravo;
            if ((i4 & 1) > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2 && (i4 & 2) <= 0) {
                rect.set(0, 0, 0, 0);
                return;
            }
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            flexboxLayoutManager.getClass();
            ArrayList arrayList = new ArrayList(flexboxLayoutManager.victor.size());
            int size = flexboxLayoutManager.victor.size();
            for (int i5 = 0; i5 < size; i5++) {
                a aVar = (a) flexboxLayoutManager.victor.get(i5);
                if (aVar.delta != 0) {
                    arrayList.add(aVar);
                }
            }
            int i10 = flexboxLayoutManager.papa;
            b bVar = flexboxLayoutManager.whiskey;
            int i11 = bVar.charlie[childAdapterPosition];
            if ((i11 == -1 || i11 >= flexboxLayoutManager.victor.size() || ((a) flexboxLayoutManager.victor.get(i11)).kilo != childAdapterPosition) && childAdapterPosition != 0 && (arrayList.size() == 0 || ((a) P0.amber(1, arrayList)).lima != childAdapterPosition - 1)) {
                if (flexboxLayoutManager.S()) {
                    if ((this.bravo & 2) > 0) {
                        if (flexboxLayoutManager.tango) {
                            rect.right = this.alpha.getIntrinsicWidth();
                            rect.left = 0;
                        } else {
                            rect.left = this.alpha.getIntrinsicWidth();
                            rect.right = 0;
                        }
                    } else {
                        rect.left = 0;
                        rect.right = 0;
                    }
                } else if ((this.bravo & 1) > 0) {
                    if (i10 == 3) {
                        rect.bottom = this.alpha.getIntrinsicHeight();
                        rect.top = 0;
                    } else {
                        rect.top = this.alpha.getIntrinsicHeight();
                        rect.bottom = 0;
                    }
                } else {
                    rect.top = 0;
                    rect.bottom = 0;
                }
            }
            if (arrayList.size() == 0 || bVar.charlie[childAdapterPosition] == 0) {
                return;
            }
            if (flexboxLayoutManager.S()) {
                if ((this.bravo & 1) > 0) {
                    rect.top = this.alpha.getIntrinsicHeight();
                    rect.bottom = 0;
                    return;
                } else {
                    rect.top = 0;
                    rect.bottom = 0;
                    return;
                }
            }
            if ((this.bravo & 2) > 0) {
                if (flexboxLayoutManager.tango) {
                    rect.right = this.alpha.getIntrinsicWidth();
                    rect.left = 0;
                } else {
                    rect.left = this.alpha.getIntrinsicWidth();
                    rect.right = 0;
                }
            }
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        int left;
        int intrinsicWidth;
        int max;
        int bottom;
        int i4;
        int i5;
        int top;
        int intrinsicHeight;
        int left2;
        int right;
        int i10;
        int i11;
        int i12;
        boolean z2 = true;
        if ((this.bravo & 1) <= 0) {
            z2 = false;
        }
        if (z2) {
            FlexboxLayoutManager flexboxLayoutManager = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int i13 = flexboxLayoutManager.papa;
            int left3 = recyclerView.getLeft() - recyclerView.getPaddingLeft();
            int paddingRight = recyclerView.getPaddingRight() + recyclerView.getRight();
            int childCount = recyclerView.getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                View childAt = recyclerView.getChildAt(i14);
                M m4 = (M) childAt.getLayoutParams();
                if (i13 == 3) {
                    intrinsicHeight = childAt.getBottom() + ((ViewGroup.MarginLayoutParams) m4).bottomMargin;
                    top = this.alpha.getIntrinsicHeight() + intrinsicHeight;
                } else {
                    top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) m4).topMargin;
                    intrinsicHeight = top - this.alpha.getIntrinsicHeight();
                }
                if (flexboxLayoutManager.S()) {
                    if (flexboxLayoutManager.tango) {
                        i12 = Math.min(this.alpha.getIntrinsicWidth() + childAt.getRight() + ((ViewGroup.MarginLayoutParams) m4).rightMargin, paddingRight);
                        i11 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) m4).leftMargin;
                        this.alpha.setBounds(i11, intrinsicHeight, i12, top);
                        this.alpha.draw(canvas);
                    } else {
                        left2 = Math.max((childAt.getLeft() - ((ViewGroup.MarginLayoutParams) m4).leftMargin) - this.alpha.getIntrinsicWidth(), left3);
                        right = childAt.getRight();
                        i10 = ((ViewGroup.MarginLayoutParams) m4).rightMargin;
                    }
                } else {
                    left2 = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) m4).leftMargin;
                    right = childAt.getRight();
                    i10 = ((ViewGroup.MarginLayoutParams) m4).rightMargin;
                }
                int i15 = right + i10;
                i11 = left2;
                i12 = i15;
                this.alpha.setBounds(i11, intrinsicHeight, i12, top);
                this.alpha.draw(canvas);
            }
        }
        if ((this.bravo & 2) > 0) {
            FlexboxLayoutManager flexboxLayoutManager2 = (FlexboxLayoutManager) recyclerView.getLayoutManager();
            int top2 = recyclerView.getTop() - recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom() + recyclerView.getBottom();
            int childCount2 = recyclerView.getChildCount();
            int i16 = flexboxLayoutManager2.papa;
            for (int i17 = 0; i17 < childCount2; i17++) {
                View childAt2 = recyclerView.getChildAt(i17);
                M m5 = (M) childAt2.getLayoutParams();
                if (flexboxLayoutManager2.tango) {
                    intrinsicWidth = childAt2.getRight() + ((ViewGroup.MarginLayoutParams) m5).rightMargin;
                    left = this.alpha.getIntrinsicWidth() + intrinsicWidth;
                } else {
                    left = childAt2.getLeft() - ((ViewGroup.MarginLayoutParams) m5).leftMargin;
                    intrinsicWidth = left - this.alpha.getIntrinsicWidth();
                }
                if (flexboxLayoutManager2.S()) {
                    max = childAt2.getTop() - ((ViewGroup.MarginLayoutParams) m5).topMargin;
                    bottom = childAt2.getBottom();
                    i4 = ((ViewGroup.MarginLayoutParams) m5).bottomMargin;
                } else if (i16 == 3) {
                    int min = Math.min(this.alpha.getIntrinsicHeight() + childAt2.getBottom() + ((ViewGroup.MarginLayoutParams) m5).bottomMargin, paddingBottom);
                    max = childAt2.getTop() - ((ViewGroup.MarginLayoutParams) m5).topMargin;
                    i5 = min;
                    this.alpha.setBounds(intrinsicWidth, max, left, i5);
                    this.alpha.draw(canvas);
                } else {
                    max = Math.max((childAt2.getTop() - ((ViewGroup.MarginLayoutParams) m5).topMargin) - this.alpha.getIntrinsicHeight(), top2);
                    bottom = childAt2.getBottom();
                    i4 = ((ViewGroup.MarginLayoutParams) m5).bottomMargin;
                }
                i5 = bottom + i4;
                this.alpha.setBounds(intrinsicWidth, max, left, i5);
                this.alpha.draw(canvas);
            }
        }
    }
}
