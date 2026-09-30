package s6;

/* loaded from: classes2.dex */
public final class X7 {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;

    public X7(float f5, float f10, float f11, float f12) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
    }

    public final float alpha() {
        if (bravo()) {
            return (this.delta - this.bravo) * (this.charlie - this.alpha);
        }
        return 0.0f;
    }

    public final boolean bravo() {
        float f5 = this.alpha;
        if (f5 >= 0.0f) {
            float f10 = this.charlie;
            if (f5 < f10 && f10 <= 1.0f) {
                float f11 = this.bravo;
                if (f11 >= 0.0f) {
                    float f12 = this.delta;
                    if (f11 < f12 && f12 <= 1.0f) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X7) {
            X7 x72 = (X7) obj;
            if (Float.floatToIntBits(this.alpha) == Float.floatToIntBits(x72.alpha) && Float.floatToIntBits(this.bravo) == Float.floatToIntBits(x72.bravo) && Float.floatToIntBits(this.charlie) == Float.floatToIntBits(x72.charlie) && Float.floatToIntBits(this.delta) == Float.floatToIntBits(x72.delta) && Float.floatToIntBits(0.0f) == Float.floatToIntBits(0.0f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((Float.floatToIntBits(this.alpha) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.bravo)) * 1000003) ^ Float.floatToIntBits(this.charlie)) * 1000003) ^ Float.floatToIntBits(this.delta)) * 1000003) ^ Float.floatToIntBits(0.0f);
    }

    public final String toString() {
        return "PredictedArea{xMin=" + this.alpha + ", yMin=" + this.bravo + ", xMax=" + this.charlie + ", yMax=" + this.delta + ", confidenceScore=0.0}";
    }
}
