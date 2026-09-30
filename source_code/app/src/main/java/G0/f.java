package G0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class f extends MetricAffectingSpan {
    public final float alpha;

    public f(float f5) {
        this.alpha = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.alpha / textScaleX);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        float textScaleX = textPaint.getTextScaleX() * textPaint.getTextSize();
        if (textScaleX == 0.0f) {
            return;
        }
        textPaint.setLetterSpacing(this.alpha / textScaleX);
    }
}
