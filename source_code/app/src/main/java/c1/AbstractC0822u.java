package c1;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;

/* renamed from: c1.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0822u extends AbstractC0804c {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3487a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3488b;

    @Override // c1.AbstractC0804c
    public final void echo(ConstraintLayout constraintLayout) {
        delta(constraintLayout);
    }

    @Override // c1.AbstractC0804c
    public void golf(AttributeSet attributeSet) {
        super.golf(attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0820s.bravo);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 6) {
                    this.f3487a = true;
                } else if (index == 22) {
                    this.f3488b = true;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public abstract void juliet(Z0.g gVar, int i4, int i5);

    @Override // c1.AbstractC0804c, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f3487a || this.f3488b) {
            ViewParent parent = getParent();
            if (parent instanceof ConstraintLayout) {
                ConstraintLayout constraintLayout = (ConstraintLayout) parent;
                int visibility = getVisibility();
                float elevation = getElevation();
                for (int i4 = 0; i4 < this.purple; i4++) {
                    View view = (View) constraintLayout.alpha.get(this.alpha[i4]);
                    if (view != null) {
                        if (this.f3487a) {
                            view.setVisibility(visibility);
                        }
                        if (this.f3488b && elevation > 0.0f) {
                            view.setTranslationZ(view.getTranslationZ() + elevation);
                        }
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f5) {
        super.setElevation(f5);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            delta((ConstraintLayout) parent);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i4) {
        super.setVisibility(i4);
        ViewParent parent = getParent();
        if (parent != null && (parent instanceof ConstraintLayout)) {
            delta((ConstraintLayout) parent);
        }
    }
}
