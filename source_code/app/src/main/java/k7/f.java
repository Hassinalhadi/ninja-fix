package k7;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import com.google.android.gms.measurement.internal.C1469t;
import com.google.android.material.internal.z;
import com.google.android.material.tabs.TabLayout;

/* loaded from: classes2.dex */
public final class f extends LinearLayout {
    public static final /* synthetic */ int red = 0;
    public ValueAnimator alpha;
    public final /* synthetic */ TabLayout purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(TabLayout tabLayout, Context context) {
        super(context);
        this.purple = tabLayout;
        setWillNotDraw(false);
    }

    public final void alpha(int i4) {
        TabLayout tabLayout = this.purple;
        if (tabLayout.f8131N != 0 && (tabLayout.getTabSelectedIndicator().getBounds().left != -1 || tabLayout.getTabSelectedIndicator().getBounds().right != -1)) {
            return;
        }
        View childAt = getChildAt(i4);
        C1469t c1469t = tabLayout.B;
        Drawable drawable = tabLayout.f8139h;
        c1469t.getClass();
        RectF alpha = C1469t.alpha(tabLayout, childAt);
        drawable.setBounds((int) alpha.left, drawable.getBounds().top, (int) alpha.right, drawable.getBounds().bottom);
        tabLayout.alpha = i4;
    }

    public final void bravo(int i4) {
        TabLayout tabLayout = this.purple;
        Rect bounds = tabLayout.f8139h.getBounds();
        tabLayout.f8139h.setBounds(bounds.left, 0, bounds.right, i4);
        requestLayout();
    }

    public final void charlie(View view, View view2, float f5) {
        TabLayout tabLayout = this.purple;
        if (view != null && view.getWidth() > 0) {
            tabLayout.B.charlie(tabLayout, view, view2, f5, tabLayout.f8139h);
        } else {
            Drawable drawable = tabLayout.f8139h;
            drawable.setBounds(-1, drawable.getBounds().top, -1, tabLayout.f8139h.getBounds().bottom);
        }
        postInvalidateOnAnimation();
    }

    public final void delta(int i4, int i5, boolean z2) {
        TabLayout tabLayout = this.purple;
        if (tabLayout.alpha == i4) {
            return;
        }
        View childAt = getChildAt(tabLayout.getSelectedTabPosition());
        View childAt2 = getChildAt(i4);
        if (childAt2 == null) {
            alpha(tabLayout.getSelectedTabPosition());
            return;
        }
        tabLayout.alpha = i4;
        e eVar = new e(this, childAt, childAt2);
        if (z2) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.alpha = valueAnimator;
            valueAnimator.setInterpolator(tabLayout.C);
            valueAnimator.setDuration(i5);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(eVar);
            valueAnimator.start();
            return;
        }
        this.alpha.removeAllUpdateListeners();
        this.alpha.addUpdateListener(eVar);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        int height;
        TabLayout tabLayout = this.purple;
        int height2 = tabLayout.f8139h.getBounds().height();
        if (height2 < 0) {
            height2 = tabLayout.f8139h.getIntrinsicHeight();
        }
        int i4 = tabLayout.f8152u;
        if (i4 != 0) {
            if (i4 != 1) {
                height = 0;
                if (i4 != 2) {
                    if (i4 != 3) {
                        height2 = 0;
                    } else {
                        height2 = getHeight();
                    }
                }
            } else {
                height = (getHeight() - height2) / 2;
                height2 = (getHeight() + height2) / 2;
            }
        } else {
            height = getHeight() - height2;
            height2 = getHeight();
        }
        if (tabLayout.f8139h.getBounds().width() > 0) {
            Rect bounds = tabLayout.f8139h.getBounds();
            tabLayout.f8139h.setBounds(bounds.left, height, bounds.right, height2);
            tabLayout.f8139h.draw(canvas);
        }
        super.draw(canvas);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        ValueAnimator valueAnimator = this.alpha;
        TabLayout tabLayout = this.purple;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            delta(tabLayout.getSelectedTabPosition(), -1, false);
            return;
        }
        if (tabLayout.alpha == -1) {
            tabLayout.alpha = tabLayout.getSelectedTabPosition();
        }
        alpha(tabLayout.alpha);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (View.MeasureSpec.getMode(i4) == 1073741824) {
            TabLayout tabLayout = this.purple;
            boolean z2 = true;
            if (tabLayout.f8150s == 1 || tabLayout.f8153v == 2) {
                int childCount = getChildCount();
                int i10 = 0;
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = getChildAt(i11);
                    if (childAt.getVisibility() == 0) {
                        i10 = Math.max(i10, childAt.getMeasuredWidth());
                    }
                }
                if (i10 > 0) {
                    if (i10 * childCount <= getMeasuredWidth() - (((int) z.delta(16, getContext())) * 2)) {
                        boolean z10 = false;
                        for (int i12 = 0; i12 < childCount; i12++) {
                            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i12).getLayoutParams();
                            if (layoutParams.width != i10 || layoutParams.weight != 0.0f) {
                                layoutParams.width = i10;
                                layoutParams.weight = 0.0f;
                                z10 = true;
                            }
                        }
                        z2 = z10;
                    } else {
                        tabLayout.f8150s = 0;
                        tabLayout.papa(false);
                    }
                    if (z2) {
                        super.onMeasure(i4, i5);
                    }
                }
            }
        }
    }
}
