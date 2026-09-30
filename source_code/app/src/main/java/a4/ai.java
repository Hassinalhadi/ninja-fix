package a4;

import android.graphics.RectF;

/* loaded from: classes3.dex */
public final class ai {
    public float charlie;
    public float delta;
    public float echo;
    public float foxtrot;
    public float golf;
    public float hotel;
    public float india;
    public float juliet;
    public final RectF alpha = new RectF();
    public final RectF bravo = new RectF();
    public float kilo = 1.0f;
    public float lima = 1.0f;

    public static float alpha(float f5, float f10, float f11, float f12) {
        return Math.max(Math.abs(f5 - f11), Math.abs(f10 - f12));
    }

    public static boolean golf(float f5, float f10, float f11, float f12, float f13, float f14) {
        if (f5 > f11 && f5 < f13 && f10 > f12 && f10 < f14) {
            return true;
        }
        return false;
    }

    public final float bravo() {
        float f5 = this.foxtrot;
        float f10 = this.juliet / this.lima;
        if (f5 > f10) {
            return f10;
        }
        return f5;
    }

    public final float charlie() {
        float f5 = this.echo;
        float f10 = this.india / this.kilo;
        if (f5 > f10) {
            return f10;
        }
        return f5;
    }

    public final float delta() {
        float f5 = this.delta;
        float f10 = this.hotel / this.lima;
        if (f5 < f10) {
            return f10;
        }
        return f5;
    }

    public final float echo() {
        float f5 = this.charlie;
        float f10 = this.golf / this.kilo;
        if (f5 < f10) {
            return f10;
        }
        return f5;
    }

    public final RectF foxtrot() {
        RectF rectF = this.bravo;
        rectF.set(this.alpha);
        return rectF;
    }
}
