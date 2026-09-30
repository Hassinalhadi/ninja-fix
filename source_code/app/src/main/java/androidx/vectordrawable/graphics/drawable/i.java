package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Paint;

/* loaded from: classes3.dex */
public final class i extends l {
    public B0.a delta;
    public float echo;
    public B0.a foxtrot;
    public float golf;
    public float hotel;
    public float india;
    public float juliet;
    public float kilo;
    public Paint.Cap lima;
    public Paint.Join mike;
    public float november;

    @Override // androidx.vectordrawable.graphics.drawable.k
    public final boolean alpha() {
        if (!this.foxtrot.golf() && !this.delta.golf()) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // androidx.vectordrawable.graphics.drawable.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean bravo(int[] iArr) {
        boolean z2;
        B0.a aVar;
        B0.a aVar2 = this.foxtrot;
        boolean z10 = false;
        if (aVar2.golf()) {
            ColorStateList colorStateList = (ColorStateList) aVar2.delta;
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (colorForState != aVar2.bravo) {
                aVar2.bravo = colorForState;
                z2 = true;
                aVar = this.delta;
                if (aVar.golf()) {
                    ColorStateList colorStateList2 = (ColorStateList) aVar.delta;
                    int colorForState2 = colorStateList2.getColorForState(iArr, colorStateList2.getDefaultColor());
                    if (colorForState2 != aVar.bravo) {
                        aVar.bravo = colorForState2;
                        z10 = true;
                    }
                }
                return z2 | z10;
            }
        }
        z2 = false;
        aVar = this.delta;
        if (aVar.golf()) {
        }
        return z2 | z10;
    }

    public float getFillAlpha() {
        return this.hotel;
    }

    public int getFillColor() {
        return this.foxtrot.bravo;
    }

    public float getStrokeAlpha() {
        return this.golf;
    }

    public int getStrokeColor() {
        return this.delta.bravo;
    }

    public float getStrokeWidth() {
        return this.echo;
    }

    public float getTrimPathEnd() {
        return this.juliet;
    }

    public float getTrimPathOffset() {
        return this.kilo;
    }

    public float getTrimPathStart() {
        return this.india;
    }

    public void setFillAlpha(float f5) {
        this.hotel = f5;
    }

    public void setFillColor(int i4) {
        this.foxtrot.bravo = i4;
    }

    public void setStrokeAlpha(float f5) {
        this.golf = f5;
    }

    public void setStrokeColor(int i4) {
        this.delta.bravo = i4;
    }

    public void setStrokeWidth(float f5) {
        this.echo = f5;
    }

    public void setTrimPathEnd(float f5) {
        this.juliet = f5;
    }

    public void setTrimPathOffset(float f5) {
        this.kilo = f5;
    }

    public void setTrimPathStart(float f5) {
        this.india = f5;
    }
}
