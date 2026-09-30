package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;

/* loaded from: classes2.dex */
public final class f extends g7.i {
    public static final /* synthetic */ int B = 0;
    public e A;

    @Override // g7.i
    public final void golf(Canvas canvas) {
        if (this.A.romeo.isEmpty()) {
            super.golf(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.A.romeo);
        } else {
            canvas.clipRect(this.A.romeo, Region.Op.DIFFERENCE);
        }
        super.golf(canvas);
        canvas.restore();
    }

    @Override // g7.i, android.graphics.drawable.Drawable
    public final Drawable mutate() {
        this.A = new e(this.A);
        return this;
    }

    public final void yankee(float f5, float f10, float f11, float f12) {
        RectF rectF = this.A.romeo;
        if (f5 == rectF.left && f10 == rectF.top && f11 == rectF.right && f12 == rectF.bottom) {
            return;
        }
        rectF.set(f5, f10, f11, f12);
        invalidateSelf();
    }
}
