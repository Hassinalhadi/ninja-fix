package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import delivery.samurai.android.R;
import id.C1915c;

/* loaded from: classes3.dex */
public final class al extends ag {
    public final ak delta;
    public Drawable echo;
    public ColorStateList foxtrot;
    public PorterDuff.Mode golf;
    public boolean hotel;
    public boolean india;

    public al(ak akVar) {
        super(akVar);
        this.foxtrot = null;
        this.golf = null;
        this.hotel = false;
        this.india = false;
        this.delta = akVar;
    }

    @Override // androidx.appcompat.widget.ag
    public final void alpha(AttributeSet attributeSet, int i4) {
        super.alpha(attributeSet, R.attr.seekBarStyle);
        ak akVar = this.delta;
        Context context = akVar.getContext();
        int[] iArr = aj.a.golf;
        C1915c victor = C1915c.victor(context, attributeSet, iArr, R.attr.seekBarStyle);
        s1.au.mike(akVar, akVar.getContext(), iArr, attributeSet, (TypedArray) victor.red, R.attr.seekBarStyle);
        Drawable papa = victor.papa(0);
        if (papa != null) {
            akVar.setThumb(papa);
        }
        Drawable oscar = victor.oscar(1);
        Drawable drawable = this.echo;
        if (drawable != null) {
            drawable.setCallback(null);
        }
        this.echo = oscar;
        if (oscar != null) {
            oscar.setCallback(akVar);
            oscar.setLayoutDirection(akVar.getLayoutDirection());
            if (oscar.isStateful()) {
                oscar.setState(akVar.getDrawableState());
            }
            charlie();
        }
        akVar.invalidate();
        TypedArray typedArray = (TypedArray) victor.red;
        if (typedArray.hasValue(3)) {
            this.golf = S.bravo(typedArray.getInt(3, -1), this.golf);
            this.india = true;
        }
        if (typedArray.hasValue(2)) {
            this.foxtrot = victor.november(2);
            this.hotel = true;
        }
        victor.xray();
        charlie();
    }

    public final void charlie() {
        Drawable drawable = this.echo;
        if (drawable != null) {
            if (this.hotel || this.india) {
                Drawable mutate = drawable.mutate();
                this.echo = mutate;
                if (this.hotel) {
                    mutate.setTintList(this.foxtrot);
                }
                if (this.india) {
                    this.echo.setTintMode(this.golf);
                }
                if (this.echo.isStateful()) {
                    this.echo.setState(this.delta.getDrawableState());
                }
            }
        }
    }

    public final void delta(Canvas canvas) {
        int i4;
        if (this.echo != null) {
            int max = this.delta.getMax();
            int i5 = 1;
            if (max > 1) {
                int intrinsicWidth = this.echo.getIntrinsicWidth();
                int intrinsicHeight = this.echo.getIntrinsicHeight();
                if (intrinsicWidth >= 0) {
                    i4 = intrinsicWidth / 2;
                } else {
                    i4 = 1;
                }
                if (intrinsicHeight >= 0) {
                    i5 = intrinsicHeight / 2;
                }
                this.echo.setBounds(-i4, -i5, i4, i5);
                float width = ((r0.getWidth() - r0.getPaddingLeft()) - r0.getPaddingRight()) / max;
                int save = canvas.save();
                canvas.translate(r0.getPaddingLeft(), r0.getHeight() / 2);
                for (int i10 = 0; i10 <= max; i10++) {
                    this.echo.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }
}
