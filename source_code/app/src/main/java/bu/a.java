package bu;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class a extends Drawable {
    public float alpha;
    public final Paint bravo;
    public final RectF charlie;
    public final Rect delta;
    public float echo;
    public ColorStateList hotel;
    public PorterDuffColorFilter india;
    public ColorStateList juliet;
    public boolean foxtrot = false;
    public boolean golf = true;
    public PorterDuff.Mode kilo = PorterDuff.Mode.SRC_IN;

    public a(ColorStateList colorStateList, float f5) {
        this.alpha = f5;
        Paint paint = new Paint(5);
        this.bravo = paint;
        colorStateList = colorStateList == null ? ColorStateList.valueOf(0) : colorStateList;
        this.hotel = colorStateList;
        paint.setColor(colorStateList.getColorForState(getState(), this.hotel.getDefaultColor()));
        this.charlie = new RectF();
        this.delta = new Rect();
    }

    public final PorterDuffColorFilter alpha(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList != null && mode != null) {
            return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
        }
        return null;
    }

    public final void bravo(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        RectF rectF = this.charlie;
        rectF.set(rect.left, rect.top, rect.right, rect.bottom);
        Rect rect2 = this.delta;
        rect2.set(rect);
        if (this.foxtrot) {
            rect2.inset((int) Math.ceil(b.alpha(this.echo, this.alpha, this.golf)), (int) Math.ceil(b.bravo(this.echo, this.alpha, this.golf)));
            rectF.set(rect2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        Paint paint = this.bravo;
        if (this.india != null && paint.getColorFilter() == null) {
            paint.setColorFilter(this.india);
            z2 = true;
        } else {
            z2 = false;
        }
        RectF rectF = this.charlie;
        float f5 = this.alpha;
        canvas.drawRoundRect(rectF, f5, f5, paint);
        if (z2) {
            paint.setColorFilter(null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        outline.setRoundRect(this.delta, this.alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.juliet;
        if (colorStateList == null || !colorStateList.isStateful()) {
            ColorStateList colorStateList2 = this.hotel;
            if ((colorStateList2 != null && colorStateList2.isStateful()) || super.isStateful()) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        bravo(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.hotel;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        Paint paint = this.bravo;
        if (colorForState != paint.getColor()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            paint.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.juliet;
        if (colorStateList2 != null && (mode = this.kilo) != null) {
            this.india = alpha(colorStateList2, mode);
            return true;
        }
        return z2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.bravo.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.bravo.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        this.juliet = colorStateList;
        this.india = alpha(colorStateList, this.kilo);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        this.kilo = mode;
        this.india = alpha(this.juliet, mode);
        invalidateSelf();
    }
}
