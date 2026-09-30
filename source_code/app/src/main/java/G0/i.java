package G0;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.style.ReplacementSpan;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class i extends ReplacementSpan {
    public Paint.FontMetricsInt alpha;
    public int purple;
    public int red;
    public boolean silver;

    public final Paint.FontMetricsInt alpha() {
        Paint.FontMetricsInt fontMetricsInt = this.alpha;
        if (fontMetricsInt != null) {
            return fontMetricsInt;
        }
        Intrinsics.lima("fontMetrics");
        throw null;
    }

    public final int bravo() {
        if (!this.silver) {
            J0.a.bravo("PlaceholderSpan is not laid out yet.");
        }
        return this.red;
    }

    @Override // android.text.style.ReplacementSpan
    public final void draw(Canvas canvas, CharSequence charSequence, int i4, int i5, float f5, int i10, int i11, int i12, Paint paint) {
    }

    @Override // android.text.style.ReplacementSpan
    public final int getSize(Paint paint, CharSequence charSequence, int i4, int i5, Paint.FontMetricsInt fontMetricsInt) {
        this.silver = true;
        paint.getTextSize();
        this.alpha = paint.getFontMetricsInt();
        if (alpha().descent <= alpha().ascent) {
            J0.a.alpha("Invalid fontMetrics: line height can not be negative.");
        }
        this.purple = (int) Math.ceil(0.0f);
        this.red = (int) Math.ceil(0.0f);
        if (fontMetricsInt != null) {
            fontMetricsInt.ascent = alpha().ascent;
            fontMetricsInt.descent = alpha().descent;
            fontMetricsInt.leading = alpha().leading;
            if (fontMetricsInt.ascent > (-bravo())) {
                fontMetricsInt.ascent = -bravo();
            }
            fontMetricsInt.top = Math.min(alpha().top, fontMetricsInt.ascent);
            fontMetricsInt.bottom = Math.max(alpha().bottom, fontMetricsInt.descent);
        }
        if (!this.silver) {
            J0.a.bravo("PlaceholderSpan is not laid out yet.");
        }
        return this.purple;
    }
}
