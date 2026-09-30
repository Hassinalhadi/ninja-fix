package com.airbnb.lottie.utils;

import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import com.airbnb.lottie.utils.OffscreenLayer;

/* loaded from: classes3.dex */
public class DropShadow {
    private int color;
    private float dx;
    private float dy;
    private float radius;
    private float[] vecs;

    public DropShadow() {
        this.radius = 0.0f;
        this.dx = 0.0f;
        this.dy = 0.0f;
        this.color = 0;
    }

    public void applyTo(Paint paint) {
        if (Color.alpha(this.color) > 0) {
            paint.setShadowLayer(Math.max(this.radius, Float.MIN_VALUE), this.dx, this.dy, this.color);
        } else {
            paint.clearShadowLayer();
        }
    }

    public void applyWithAlpha(int i4, Paint paint) {
        int mixOpacities = Utils.mixOpacities(Color.alpha(this.color), MiscUtils.clamp(i4, 0, 255));
        if (mixOpacities > 0) {
            paint.setShadowLayer(Math.max(this.radius, Float.MIN_VALUE), this.dx, this.dy, Color.argb(mixOpacities, Color.red(this.color), Color.green(this.color), Color.blue(this.color)));
        } else {
            paint.clearShadowLayer();
        }
    }

    public int getColor() {
        return this.color;
    }

    public float getDx() {
        return this.dx;
    }

    public float getDy() {
        return this.dy;
    }

    public float getRadius() {
        return this.radius;
    }

    public void multiplyOpacity(int i4) {
        this.color = Color.argb(Math.round((MiscUtils.clamp(i4, 0, 255) * Color.alpha(this.color)) / 255.0f), Color.red(this.color), Color.green(this.color), Color.blue(this.color));
    }

    public boolean sameAs(DropShadow dropShadow) {
        if (this.radius == dropShadow.radius && this.dx == dropShadow.dx && this.dy == dropShadow.dy && this.color == dropShadow.color) {
            return true;
        }
        return false;
    }

    public void setColor(int i4) {
        this.color = i4;
    }

    public void setDx(float f5) {
        this.dx = f5;
    }

    public void setDy(float f5) {
        this.dy = f5;
    }

    public void setRadius(float f5) {
        this.radius = f5;
    }

    public void transformBy(Matrix matrix) {
        if (this.vecs == null) {
            this.vecs = new float[2];
        }
        float[] fArr = this.vecs;
        fArr[0] = this.dx;
        fArr[1] = this.dy;
        matrix.mapVectors(fArr);
        float[] fArr2 = this.vecs;
        this.dx = fArr2[0];
        this.dy = fArr2[1];
        this.radius = matrix.mapRadius(this.radius);
    }

    public void applyTo(OffscreenLayer.ComposeOp composeOp) {
        if (Color.alpha(this.color) > 0) {
            composeOp.shadow = this;
        } else {
            composeOp.shadow = null;
        }
    }

    public void applyWithAlpha(int i4, OffscreenLayer.ComposeOp composeOp) {
        DropShadow dropShadow = new DropShadow(this);
        composeOp.shadow = dropShadow;
        dropShadow.multiplyOpacity(i4);
    }

    public DropShadow(float f5, float f10, float f11, int i4) {
        this.radius = f5;
        this.dx = f10;
        this.dy = f11;
        this.color = i4;
        this.vecs = null;
    }

    public DropShadow(DropShadow dropShadow) {
        this.radius = 0.0f;
        this.dx = 0.0f;
        this.dy = 0.0f;
        this.color = 0;
        this.radius = dropShadow.radius;
        this.dx = dropShadow.dx;
        this.dy = dropShadow.dy;
        this.color = dropShadow.color;
        this.vecs = null;
    }
}
