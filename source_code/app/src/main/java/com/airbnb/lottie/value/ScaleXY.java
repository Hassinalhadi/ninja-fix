package com.airbnb.lottie.value;

/* loaded from: classes3.dex */
public class ScaleXY {
    private float scaleX;
    private float scaleY;

    public ScaleXY(float f5, float f10) {
        this.scaleX = f5;
        this.scaleY = f10;
    }

    public boolean equals(float f5, float f10) {
        if (this.scaleX == f5 && this.scaleY == f10) {
            return true;
        }
        return false;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    public void set(float f5, float f10) {
        this.scaleX = f5;
        this.scaleY = f10;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public ScaleXY() {
        this(1.0f, 1.0f);
    }
}
