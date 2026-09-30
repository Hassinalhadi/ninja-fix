package G0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class a extends MetricAffectingSpan {
    public final /* synthetic */ int alpha;
    public final float purple;

    public /* synthetic */ a(float f5, int i4) {
        this.alpha = i4;
        this.purple = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.alpha) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.purple);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.purple);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.alpha) {
            case 0:
                textPaint.baselineShift += (int) Math.ceil(textPaint.ascent() * this.purple);
                return;
            default:
                textPaint.setTextSkewX(textPaint.getTextSkewX() + this.purple);
                return;
        }
    }
}
