package X6;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import g7.m;
import g7.n;
import g7.o;
import j1.AbstractC1928b;
import s6.G7;

/* loaded from: classes2.dex */
public final class a extends Drawable {
    public final Paint bravo;
    public float hotel;
    public int india;
    public int juliet;
    public int kilo;
    public int lima;
    public int mike;
    public m oscar;
    public ColorStateList papa;
    public final o alpha = n.alpha;
    public final Path charlie = new Path();
    public final Rect delta = new Rect();
    public final RectF echo = new RectF();
    public final RectF foxtrot = new RectF();
    public final P3.b golf = new P3.b(this);
    public boolean november = true;

    public a(m mVar) {
        this.oscar = mVar;
        Paint paint = new Paint(1);
        this.bravo = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2 = this.november;
        Paint paint = this.bravo;
        Rect rect = this.delta;
        if (z2) {
            copyBounds(rect);
            float height = this.hotel / rect.height();
            paint.setShader(new LinearGradient(0.0f, rect.top, 0.0f, rect.bottom, new int[]{AbstractC1928b.bravo(this.india, this.mike), AbstractC1928b.bravo(this.juliet, this.mike), AbstractC1928b.bravo(AbstractC1928b.delta(this.juliet, 0), this.mike), AbstractC1928b.bravo(AbstractC1928b.delta(this.lima, 0), this.mike), AbstractC1928b.bravo(this.lima, this.mike), AbstractC1928b.bravo(this.kilo, this.mike)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP));
            this.november = false;
        }
        float strokeWidth = paint.getStrokeWidth() / 2.0f;
        copyBounds(rect);
        RectF rectF = this.echo;
        rectF.set(rect);
        g7.d dVar = this.oscar.echo;
        RectF rectF2 = this.foxtrot;
        rectF2.set(getBounds());
        float min = Math.min(dVar.alpha(rectF2), rectF.width() / 2.0f);
        m mVar = this.oscar;
        rectF2.set(getBounds());
        if (mVar.foxtrot(rectF2)) {
            rectF.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(rectF, min, min, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        return this.golf;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (this.hotel > 0.0f) {
            return -3;
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        m mVar = this.oscar;
        RectF rectF = this.foxtrot;
        rectF.set(getBounds());
        if (mVar.foxtrot(rectF)) {
            g7.d dVar = this.oscar.echo;
            rectF.set(getBounds());
            outline.setRoundRect(getBounds(), dVar.alpha(rectF));
            return;
        }
        Rect rect = this.delta;
        copyBounds(rect);
        RectF rectF2 = this.echo;
        rectF2.set(rect);
        m mVar2 = this.oscar;
        Path path = this.charlie;
        this.alpha.alpha(mVar2, null, 1.0f, rectF2, null, path);
        G7.charlie(outline, path);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        m mVar = this.oscar;
        RectF rectF = this.foxtrot;
        rectF.set(getBounds());
        if (mVar.foxtrot(rectF)) {
            int round = Math.round(this.hotel);
            rect.set(round, round, round, round);
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        ColorStateList colorStateList = this.papa;
        if ((colorStateList != null && colorStateList.isStateful()) || super.isStateful()) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        this.november = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.papa;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.mike)) != this.mike) {
            this.november = true;
            this.mike = colorForState;
        }
        if (this.november) {
            invalidateSelf();
        }
        return this.november;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        this.bravo.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.bravo.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
