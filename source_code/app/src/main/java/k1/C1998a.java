package k1;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.Gravity;

/* renamed from: k1.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1998a extends Drawable {
    public final Bitmap alpha;
    public final int bravo;
    public final BitmapShader echo;
    public float golf;
    public boolean kilo;
    public final int lima;
    public final int mike;
    public final int charlie = 119;
    public final Paint delta = new Paint(3);
    public final Matrix foxtrot = new Matrix();
    public final Rect hotel = new Rect();
    public final RectF india = new RectF();
    public boolean juliet = true;

    public C1998a(Resources resources, Bitmap bitmap) {
        this.bravo = 160;
        if (resources != null) {
            this.bravo = resources.getDisplayMetrics().densityDpi;
        }
        this.alpha = bitmap;
        if (bitmap != null) {
            int i4 = this.bravo;
            this.lima = bitmap.getScaledWidth(i4);
            this.mike = bitmap.getScaledHeight(i4);
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.echo = new BitmapShader(bitmap, tileMode, tileMode);
            return;
        }
        this.mike = -1;
        this.lima = -1;
        this.echo = null;
    }

    public final void alpha(int i4, int i5, int i10, Rect rect, Rect rect2) {
        Gravity.apply(i4, i5, i10, rect, rect2, 0);
    }

    public final void bravo() {
        this.kilo = true;
        this.juliet = true;
        this.golf = Math.min(this.mike, this.lima) / 2;
        this.delta.setShader(this.echo);
        invalidateSelf();
    }

    public final void charlie(float f5) {
        if (this.golf == f5) {
            return;
        }
        boolean z2 = false;
        this.kilo = false;
        if (f5 > 0.05f) {
            z2 = true;
        }
        Paint paint = this.delta;
        if (z2) {
            paint.setShader(this.echo);
        } else {
            paint.setShader(null);
        }
        this.golf = f5;
        invalidateSelf();
    }

    public final void delta() {
        if (this.juliet) {
            boolean z2 = this.kilo;
            Rect rect = this.hotel;
            if (z2) {
                int min = Math.min(this.lima, this.mike);
                alpha(this.charlie, min, min, getBounds(), this.hotel);
                int min2 = Math.min(rect.width(), rect.height());
                rect.inset(Math.max(0, (rect.width() - min2) / 2), Math.max(0, (rect.height() - min2) / 2));
                this.golf = min2 * 0.5f;
            } else {
                alpha(this.charlie, this.lima, this.mike, getBounds(), this.hotel);
            }
            RectF rectF = this.india;
            rectF.set(rect);
            BitmapShader bitmapShader = this.echo;
            if (bitmapShader != null) {
                Matrix matrix = this.foxtrot;
                matrix.setTranslate(rectF.left, rectF.top);
                float width = rectF.width();
                Bitmap bitmap = this.alpha;
                matrix.preScale(width / bitmap.getWidth(), rectF.height() / bitmap.getHeight());
                bitmapShader.setLocalMatrix(matrix);
                this.delta.setShader(bitmapShader);
            }
            this.juliet = false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Bitmap bitmap = this.alpha;
        if (bitmap == null) {
            return;
        }
        delta();
        Paint paint = this.delta;
        if (paint.getShader() == null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.hotel, paint);
            return;
        }
        RectF rectF = this.india;
        float f5 = this.golf;
        canvas.drawRoundRect(rectF, f5, f5, paint);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.delta.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        return this.delta.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.mike;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.lima;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Bitmap bitmap;
        if (this.charlie != 119 || this.kilo || (bitmap = this.alpha) == null || bitmap.hasAlpha() || this.delta.getAlpha() < 255 || this.golf > 0.05f) {
            return -3;
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        delta();
        outline.setRoundRect(this.hotel, this.golf);
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        if (this.kilo) {
            this.golf = Math.min(this.mike, this.lima) / 2;
        }
        this.juliet = true;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        Paint paint = this.delta;
        if (i4 != paint.getAlpha()) {
            paint.setAlpha(i4);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.delta.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z2) {
        this.delta.setDither(z2);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setFilterBitmap(boolean z2) {
        this.delta.setFilterBitmap(z2);
        invalidateSelf();
    }
}
