package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import delivery.samurai.android.R;

/* loaded from: classes3.dex */
public class ActionBarContainer extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2766a;
    public boolean alpha;

    /* renamed from: b, reason: collision with root package name */
    public final int f2767b;
    public View purple;
    public View red;
    public Drawable silver;
    public Drawable teal;
    public Drawable white;
    public final boolean yellow;

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C0443a(this));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aj.a.alpha);
        boolean z2 = false;
        this.silver = obtainStyledAttributes.getDrawable(0);
        this.teal = obtainStyledAttributes.getDrawable(2);
        this.f2767b = obtainStyledAttributes.getDimensionPixelSize(13, -1);
        if (getId() == R.id.split_action_bar) {
            this.yellow = true;
            this.white = obtainStyledAttributes.getDrawable(1);
        }
        obtainStyledAttributes.recycle();
        if (!this.yellow ? !(this.silver != null || this.teal != null) : this.white == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.silver;
        if (drawable != null && drawable.isStateful()) {
            this.silver.setState(getDrawableState());
        }
        Drawable drawable2 = this.teal;
        if (drawable2 != null && drawable2.isStateful()) {
            this.teal.setState(getDrawableState());
        }
        Drawable drawable3 = this.white;
        if (drawable3 != null && drawable3.isStateful()) {
            this.white.setState(getDrawableState());
        }
    }

    public View getTabContainer() {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.silver;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.teal;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.white;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.purple = findViewById(R.id.action_bar);
        this.red = findViewById(R.id.action_context_bar);
    }

    @Override // android.view.View
    public final boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.alpha && !super.onInterceptTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z2, int i4, int i5, int i10, int i11) {
        super.onLayout(z2, i4, i5, i10, i11);
        boolean z10 = true;
        if (this.yellow) {
            Drawable drawable = this.white;
            if (drawable != null) {
                drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z10 = false;
            }
        } else {
            if (this.silver != null) {
                if (this.purple.getVisibility() == 0) {
                    this.silver.setBounds(this.purple.getLeft(), this.purple.getTop(), this.purple.getRight(), this.purple.getBottom());
                } else {
                    View view = this.red;
                    if (view != null && view.getVisibility() == 0) {
                        this.silver.setBounds(this.red.getLeft(), this.red.getTop(), this.red.getRight(), this.red.getBottom());
                    } else {
                        this.silver.setBounds(0, 0, 0, 0);
                    }
                }
            } else {
                z10 = false;
            }
            this.f2766a = false;
        }
        if (z10) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i4, int i5) {
        int i10;
        if (this.purple == null && View.MeasureSpec.getMode(i5) == Integer.MIN_VALUE && (i10 = this.f2767b) >= 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(Math.min(i10, View.MeasureSpec.getSize(i5)), RecyclerView.UNDEFINED_DURATION);
        }
        super.onMeasure(i4, i5);
        if (this.purple == null) {
            return;
        }
        View.MeasureSpec.getMode(i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.silver;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.silver);
        }
        this.silver = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.purple;
            if (view != null) {
                this.silver.setBounds(view.getLeft(), this.purple.getTop(), this.purple.getRight(), this.purple.getBottom());
            }
        }
        boolean z2 = false;
        if (!this.yellow ? !(this.silver != null || this.teal != null) : this.white == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.white;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.white);
        }
        this.white = drawable;
        boolean z2 = this.yellow;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (z2 && (drawable2 = this.white) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!z2 ? !(this.silver != null || this.teal != null) : this.white == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        invalidateOutline();
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2 = this.teal;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.teal);
        }
        this.teal = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f2766a && this.teal != null) {
                throw null;
            }
        }
        boolean z2 = false;
        if (!this.yellow ? !(this.silver != null || this.teal != null) : this.white == null) {
            z2 = true;
        }
        setWillNotDraw(z2);
        invalidate();
        invalidateOutline();
    }

    public void setTabContainer(AbstractC0493z0 abstractC0493z0) {
    }

    public void setTransitioning(boolean z2) {
        int i4;
        this.alpha = z2;
        if (z2) {
            i4 = 393216;
        } else {
            i4 = 262144;
        }
        setDescendantFocusability(i4);
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        boolean z2;
        super.setVisibility(i4);
        if (i4 == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Drawable drawable = this.silver;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
        Drawable drawable2 = this.teal;
        if (drawable2 != null) {
            drawable2.setVisible(z2, false);
        }
        Drawable drawable3 = this.white;
        if (drawable3 != null) {
            drawable3.setVisible(z2, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        Drawable drawable2 = this.silver;
        boolean z2 = this.yellow;
        if (drawable != drawable2 || z2) {
            if (drawable != this.teal || !this.f2766a) {
                if ((drawable == this.white && z2) || super.verifyDrawable(drawable)) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i4) {
        if (i4 != 0) {
            return super.startActionModeForChild(view, callback, i4);
        }
        return null;
    }
}
