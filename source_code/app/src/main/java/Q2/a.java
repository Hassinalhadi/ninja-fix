package Q2;

import Y2.g;
import android.content.res.ColorStateList;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import androidx.vectordrawable.graphics.drawable.c;
import ao.ad;
import java.util.ArrayList;
import s6.E6;
import s6.J4;

/* loaded from: classes3.dex */
public final class a extends Drawable implements Drawable.Callback, Animatable {

    /* renamed from: a, reason: collision with root package name */
    public int f1912a;
    public final g alpha;

    /* renamed from: b, reason: collision with root package name */
    public int f1913b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f1914c;

    /* renamed from: d, reason: collision with root package name */
    public final Drawable f1915d;
    public final int purple;
    public final boolean red;
    public final ArrayList silver = new ArrayList();
    public final int teal;
    public final int white;
    public long yellow;

    public a(Drawable drawable, g gVar, int i4, boolean z2) {
        Integer num;
        Integer num2;
        this.alpha = gVar;
        this.purple = i4;
        this.red = z2;
        if (drawable != null) {
            num = Integer.valueOf(drawable.getIntrinsicWidth());
        } else {
            num = null;
        }
        this.teal = alpha(null, num);
        if (drawable != null) {
            num2 = Integer.valueOf(drawable.getIntrinsicHeight());
        } else {
            num2 = null;
        }
        this.white = alpha(null, num2);
        this.f1912a = 255;
        this.f1914c = null;
        Drawable mutate = drawable != null ? drawable.mutate() : null;
        this.f1915d = mutate;
        if (i4 > 0) {
            Drawable drawable2 = this.f1914c;
            if (drawable2 != null) {
                drawable2.setCallback(this);
            }
            if (mutate != null) {
                mutate.setCallback(this);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("durationMillis must be > 0.");
    }

    public final int alpha(Integer num, Integer num2) {
        int i4;
        int i5 = -1;
        if ((num != null && num.intValue() == -1) || (num2 != null && num2.intValue() == -1)) {
            return -1;
        }
        if (num != null) {
            i4 = num.intValue();
        } else {
            i4 = -1;
        }
        if (num2 != null) {
            i5 = num2.intValue();
        }
        return Math.max(i4, i5);
    }

    public final void bravo() {
        this.f1913b = 2;
        this.f1914c = null;
        ArrayList arrayList = this.silver;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((c) arrayList.get(i4)).onAnimationEnd(this);
        }
    }

    public final void charlie(Drawable drawable, Rect rect) {
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth > 0 && intrinsicHeight > 0) {
            int width = rect.width();
            int height = rect.height();
            double bravo = E6.bravo(intrinsicWidth, intrinsicHeight, width, height, this.alpha);
            double d4 = 2;
            int charlie = Zd.a.charlie((width - (intrinsicWidth * bravo)) / d4);
            int charlie2 = Zd.a.charlie((height - (bravo * intrinsicHeight)) / d4);
            drawable.setBounds(rect.left + charlie, rect.top + charlie2, rect.right - charlie, rect.bottom - charlie2);
            return;
        }
        drawable.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        boolean z2;
        int save;
        Drawable drawable;
        int i4 = this.f1913b;
        if (i4 == 0) {
            Drawable drawable2 = this.f1914c;
            if (drawable2 != null) {
                drawable2.setAlpha(this.f1912a);
                save = canvas.save();
                try {
                    drawable2.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        Drawable drawable3 = this.f1915d;
        if (i4 == 2) {
            if (drawable3 != null) {
                drawable3.setAlpha(this.f1912a);
                save = canvas.save();
                try {
                    drawable3.draw(canvas);
                    return;
                } finally {
                }
            }
            return;
        }
        double uptimeMillis = (SystemClock.uptimeMillis() - this.yellow) / this.purple;
        double bravo = J4.bravo(uptimeMillis, 0.0d, 1.0d);
        int i5 = this.f1912a;
        int i10 = (int) (bravo * i5);
        if (this.red) {
            i5 -= i10;
        }
        if (uptimeMillis >= 1.0d) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2 && (drawable = this.f1914c) != null) {
            drawable.setAlpha(i5);
            save = canvas.save();
            try {
                drawable.draw(canvas);
            } finally {
            }
        }
        if (drawable3 != null) {
            drawable3.setAlpha(i10);
            save = canvas.save();
            try {
                drawable3.draw(canvas);
            } finally {
            }
        }
        if (z2) {
            bravo();
        } else {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f1912a;
    }

    @Override // android.graphics.drawable.Drawable
    public final ColorFilter getColorFilter() {
        ColorFilter colorFilter;
        int i4 = this.f1913b;
        if (i4 != 0) {
            Drawable drawable = this.f1915d;
            if (i4 != 1) {
                if (i4 == 2 && drawable != null) {
                    return drawable.getColorFilter();
                }
                return null;
            }
            if (drawable != null && (colorFilter = drawable.getColorFilter()) != null) {
                return colorFilter;
            }
            Drawable drawable2 = this.f1914c;
            if (drawable2 != null) {
                return drawable2.getColorFilter();
            }
            return null;
        }
        Drawable drawable3 = this.f1914c;
        if (drawable3 != null) {
            return drawable3.getColorFilter();
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.white;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.teal;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f1914c;
        int i4 = this.f1913b;
        if (i4 == 0) {
            if (drawable != null) {
                return drawable.getOpacity();
            }
            return -2;
        }
        Drawable drawable2 = this.f1915d;
        if (i4 == 2) {
            if (drawable2 != null) {
                return drawable2.getOpacity();
            }
            return -2;
        }
        if (drawable != null && drawable2 != null) {
            return Drawable.resolveOpacity(drawable.getOpacity(), drawable2.getOpacity());
        }
        if (drawable != null) {
            return drawable.getOpacity();
        }
        if (drawable2 != null) {
            return drawable2.getOpacity();
        }
        return -2;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        if (this.f1913b == 1) {
            return true;
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f1914c;
        if (drawable != null) {
            charlie(drawable, rect);
        }
        Drawable drawable2 = this.f1915d;
        if (drawable2 != null) {
            charlie(drawable2, rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        boolean z2;
        boolean z10;
        Drawable drawable = this.f1914c;
        if (drawable != null) {
            z2 = drawable.setLevel(i4);
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f1915d;
        if (drawable2 != null) {
            z10 = drawable2.setLevel(i4);
        } else {
            z10 = false;
        }
        if (!z2 && !z10) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        boolean z2;
        boolean z10;
        Drawable drawable = this.f1914c;
        if (drawable != null) {
            z2 = drawable.setState(iArr);
        } else {
            z2 = false;
        }
        Drawable drawable2 = this.f1915d;
        if (drawable2 != null) {
            z10 = drawable2.setState(iArr);
        } else {
            z10 = false;
        }
        if (!z2 && !z10) {
            return false;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j5) {
        scheduleSelf(runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (i4 >= 0 && i4 < 256) {
            this.f1912a = i4;
            return;
        }
        throw new IllegalArgumentException(ad.zulu(i4, "Invalid alpha: ").toString());
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f1914c;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        }
        Drawable drawable2 = this.f1915d;
        if (drawable2 != null) {
            drawable2.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i4) {
        Drawable drawable = this.f1914c;
        if (drawable != null) {
            drawable.setTint(i4);
        }
        Drawable drawable2 = this.f1915d;
        if (drawable2 != null) {
            drawable2.setTint(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintBlendMode(BlendMode blendMode) {
        Drawable drawable = this.f1914c;
        if (drawable != null) {
            drawable.setTintBlendMode(blendMode);
        }
        Drawable drawable2 = this.f1915d;
        if (drawable2 != null) {
            drawable2.setTintBlendMode(blendMode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f1914c;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        }
        Drawable drawable2 = this.f1915d;
        if (drawable2 != null) {
            drawable2.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f1914c;
        if (drawable != null) {
            drawable.setTintMode(mode);
        }
        Drawable drawable2 = this.f1915d;
        if (drawable2 != null) {
            drawable2.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        Animatable animatable;
        Object obj = this.f1914c;
        Animatable animatable2 = null;
        if (obj instanceof Animatable) {
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.start();
        }
        Object obj2 = this.f1915d;
        if (obj2 instanceof Animatable) {
            animatable2 = (Animatable) obj2;
        }
        if (animatable2 != null) {
            animatable2.start();
        }
        if (this.f1913b != 0) {
            return;
        }
        this.f1913b = 1;
        this.yellow = SystemClock.uptimeMillis();
        ArrayList arrayList = this.silver;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((c) arrayList.get(i4)).onAnimationStart(this);
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        Animatable animatable;
        Object obj = this.f1914c;
        Animatable animatable2 = null;
        if (obj instanceof Animatable) {
            animatable = (Animatable) obj;
        } else {
            animatable = null;
        }
        if (animatable != null) {
            animatable.stop();
        }
        Object obj2 = this.f1915d;
        if (obj2 instanceof Animatable) {
            animatable2 = (Animatable) obj2;
        }
        if (animatable2 != null) {
            animatable2.stop();
        }
        if (this.f1913b != 2) {
            bravo();
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }
}
