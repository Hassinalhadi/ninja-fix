package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class ViewStubCompat extends View {
    public int alpha;
    public int purple;
    public WeakReference red;
    public LayoutInflater silver;

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.alpha = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, aj.a.azure, 0, 0);
        this.purple = obtainStyledAttributes.getResourceId(2, -1);
        this.alpha = obtainStyledAttributes.getResourceId(1, 0);
        setId(obtainStyledAttributes.getResourceId(0, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public final View alpha() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.alpha != 0) {
                ViewGroup viewGroup = (ViewGroup) parent;
                LayoutInflater layoutInflater = this.silver;
                if (layoutInflater == null) {
                    layoutInflater = LayoutInflater.from(getContext());
                }
                View inflate = layoutInflater.inflate(this.alpha, viewGroup, false);
                int i4 = this.purple;
                if (i4 != -1) {
                    inflate.setId(i4);
                }
                int indexOfChild = viewGroup.indexOfChild(this);
                viewGroup.removeViewInLayout(this);
                ViewGroup.LayoutParams layoutParams = getLayoutParams();
                if (layoutParams != null) {
                    viewGroup.addView(inflate, indexOfChild, layoutParams);
                } else {
                    viewGroup.addView(inflate, indexOfChild);
                }
                this.red = new WeakReference(inflate);
                return inflate;
            }
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.purple;
    }

    public LayoutInflater getLayoutInflater() {
        return this.silver;
    }

    public int getLayoutResource() {
        return this.alpha;
    }

    @Override // android.view.View
    public final void onMeasure(int i4, int i5) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i4) {
        this.purple = i4;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.silver = layoutInflater;
    }

    public void setLayoutResource(int i4) {
        this.alpha = i4;
    }

    public void setOnInflateListener(k1 k1Var) {
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        WeakReference weakReference = this.red;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            if (view != null) {
                view.setVisibility(i4);
                return;
            }
            throw new IllegalStateException("setVisibility called on un-referenced view");
        }
        super.setVisibility(i4);
        if (i4 != 0 && i4 != 4) {
            return;
        }
        alpha();
    }
}
