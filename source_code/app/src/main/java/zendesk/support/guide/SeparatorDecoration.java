package zendesk.support.guide;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.I;
import androidx.recyclerview.widget.M;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import androidx.recyclerview.widget.f0;
import zendesk.support.guide.HelpRecyclerViewAdapter;

/* loaded from: classes.dex */
class SeparatorDecoration extends I {
    private Drawable divider;

    public SeparatorDecoration(Drawable drawable) {
        this.divider = drawable;
    }

    private boolean isItemACategory(f0 f0Var) {
        return f0Var instanceof HelpRecyclerViewAdapter.CategoryViewHolder;
    }

    private boolean isItemAnExpandedCategory(f0 f0Var) {
        if ((f0Var instanceof HelpRecyclerViewAdapter.CategoryViewHolder) && ((HelpRecyclerViewAdapter.CategoryViewHolder) f0Var).isExpanded()) {
            return true;
        }
        return false;
    }

    private boolean isItemAnUnexpandedCategory(f0 f0Var) {
        if ((f0Var instanceof HelpRecyclerViewAdapter.CategoryViewHolder) && !((HelpRecyclerViewAdapter.CategoryViewHolder) f0Var).isExpanded()) {
            return true;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.I
    public void onDrawOver(Canvas canvas, RecyclerView recyclerView, b0 b0Var) {
        super.onDraw(canvas, recyclerView, b0Var);
        if (recyclerView.getItemAnimator() == null || !recyclerView.getItemAnimator().isRunning()) {
            int childCount = recyclerView.getChildCount();
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                if (shouldShowTopSeparator(recyclerView, i4)) {
                    int paddingLeft = recyclerView.getPaddingLeft();
                    int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    int top = childAt.getTop() + ((ViewGroup.MarginLayoutParams) ((M) childAt.getLayoutParams())).topMargin;
                    this.divider.setBounds(paddingLeft, top, width, this.divider.getIntrinsicHeight() + top);
                    this.divider.draw(canvas);
                }
            }
        }
    }

    public boolean shouldShowTopSeparator(RecyclerView recyclerView, int i4) {
        boolean z2;
        boolean isItemACategory = isItemACategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i4)));
        boolean isItemAnExpandedCategory = isItemAnExpandedCategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i4)));
        if (i4 > 0 && isItemAnUnexpandedCategory(recyclerView.getChildViewHolder(recyclerView.getChildAt(i4 - 1)))) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!isItemACategory || (!isItemAnExpandedCategory && z2)) {
            return false;
        }
        return true;
    }
}
