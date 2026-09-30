package G0;

import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class e extends MetricAffectingSpan {
    public final float alpha;

    public e(float f5) {
        this.alpha = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.alpha);
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        textPaint.setLetterSpacing(this.alpha);
    }
}
