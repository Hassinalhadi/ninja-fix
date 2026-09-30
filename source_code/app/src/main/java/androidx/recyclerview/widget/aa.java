package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;

/* loaded from: classes3.dex */
public final class aa extends I {
    public static final int[] delta = {R.attr.listDivider};
    public Drawable alpha;
    public final int bravo;
    public final Rect charlie = new Rect();

    public aa(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(delta);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        this.alpha = drawable;
        if (drawable == null) {
            Log.w("DividerItem", "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        obtainStyledAttributes.recycle();
        this.bravo = 1;
    }

    @Override // androidx.recyclerview.widget.I
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, b0 b0Var) {
        Drawable drawable = this.alpha;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.bravo == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    @Override // androidx.recyclerview.widget.I
    public final void onDraw(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        int height;
        int i4;
        int width;
        int i5;
        if (recyclerView.getLayoutManager() != null && this.alpha != null) {
            int i10 = this.bravo;
            Rect rect = this.charlie;
            int i11 = 0;
            if (i10 == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i5 = recyclerView.getPaddingLeft();
                    width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i5, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    width = recyclerView.getWidth();
                    i5 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i11 < childCount) {
                    View childAt = recyclerView.getChildAt(i11);
                    recyclerView.getDecoratedBoundsWithMargins(childAt, rect);
                    int round = Math.round(childAt.getTranslationY()) + rect.bottom;
                    this.alpha.setBounds(i5, round - this.alpha.getIntrinsicHeight(), width, round);
                    this.alpha.draw(canvas);
                    i11++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i4 = recyclerView.getPaddingTop();
                height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i4, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
            } else {
                height = recyclerView.getHeight();
                i4 = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i11 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i11);
                recyclerView.getLayoutManager().amber(childAt2, rect);
                int round2 = Math.round(childAt2.getTranslationX()) + rect.right;
                this.alpha.setBounds(round2 - this.alpha.getIntrinsicWidth(), i4, round2, height);
                this.alpha.draw(canvas);
                i11++;
            }
            canvas.restore();
        }
    }
}
