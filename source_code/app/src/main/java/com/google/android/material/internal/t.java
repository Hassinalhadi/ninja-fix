package com.google.android.material.internal;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public abstract class t extends FrameLayout {
    public Drawable alpha;
    public Rect purple;
    public Rect red;
    public boolean silver;
    public boolean teal;
    public boolean white;
    public boolean yellow;

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.purple != null && this.alpha != null) {
            int save = canvas.save();
            canvas.translate(getScrollX(), getScrollY());
            boolean z2 = this.silver;
            Rect rect = this.red;
            if (z2) {
                rect.set(0, 0, width, this.purple.top);
                this.alpha.setBounds(rect);
                this.alpha.draw(canvas);
            }
            if (this.teal) {
                rect.set(0, height - this.purple.bottom, width, height);
                this.alpha.setBounds(rect);
                this.alpha.draw(canvas);
            }
            if (this.white) {
                Rect rect2 = this.purple;
                rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
                this.alpha.setBounds(rect);
                this.alpha.draw(canvas);
            }
            if (this.yellow) {
                Rect rect3 = this.purple;
                rect.set(width - rect3.right, rect3.top, width, height - rect3.bottom);
                this.alpha.setBounds(rect);
                this.alpha.draw(canvas);
            }
            canvas.restoreToCount(save);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.alpha;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z2) {
        this.teal = z2;
    }

    public void setDrawLeftInsetForeground(boolean z2) {
        this.white = z2;
    }

    public void setDrawRightInsetForeground(boolean z2) {
        this.yellow = z2;
    }

    public void setDrawTopInsetForeground(boolean z2) {
        this.silver = z2;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.alpha = drawable;
    }
}
