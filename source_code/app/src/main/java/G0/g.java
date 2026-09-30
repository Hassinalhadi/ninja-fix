package G0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;

/* loaded from: classes3.dex */
public final class g implements LineHeightSpan {
    public final float alpha;

    public g(float f5) {
        this.alpha = f5;
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i4, int i5, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        if (fontMetricsInt.descent - fontMetricsInt.ascent <= 0) {
            return;
        }
        int ceil = (int) Math.ceil(fontMetricsInt.descent * ((r4 * 1.0f) / r3));
        fontMetricsInt.descent = ceil;
        fontMetricsInt.ascent = ceil - ((int) Math.ceil(this.alpha));
    }
}
