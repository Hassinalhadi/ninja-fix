package G0;

import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.style.MetricAffectingSpan;

/* loaded from: classes3.dex */
public final class b extends MetricAffectingSpan {
    public final /* synthetic */ int alpha;
    public final Object purple;

    public /* synthetic */ b(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        switch (this.alpha) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.purple);
                return;
            default:
                textPaint.setTypeface((Typeface) this.purple);
                return;
        }
    }

    @Override // android.text.style.MetricAffectingSpan
    public final void updateMeasureState(TextPaint textPaint) {
        switch (this.alpha) {
            case 0:
                textPaint.setFontFeatureSettings((String) this.purple);
                return;
            default:
                textPaint.setTypeface((Typeface) this.purple);
                return;
        }
    }
}
