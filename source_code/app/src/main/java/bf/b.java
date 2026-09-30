package bf;

/* loaded from: classes3.dex */
public final class b {
    public final float alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;

    public b(float f5, float f10, float f11, float f12) {
        this.alpha = f5;
        this.bravo = f10;
        this.charlie = f11;
        this.delta = f12;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (Float.floatToIntBits(this.alpha) == Float.floatToIntBits(bVar.alpha) && Float.floatToIntBits(this.bravo) == Float.floatToIntBits(bVar.bravo) && Float.floatToIntBits(this.charlie) == Float.floatToIntBits(bVar.charlie) && Float.floatToIntBits(this.delta) == Float.floatToIntBits(bVar.delta)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((Float.floatToIntBits(this.alpha) ^ 1000003) * 1000003) ^ Float.floatToIntBits(this.bravo)) * 1000003) ^ Float.floatToIntBits(this.charlie)) * 1000003) ^ Float.floatToIntBits(this.delta);
    }

    public final String toString() {
        return "ImmutableZoomState{zoomRatio=" + this.alpha + ", maxZoomRatio=" + this.bravo + ", minZoomRatio=" + this.charlie + ", linearZoom=" + this.delta + "}";
    }
}
