package G0;

import android.graphics.Paint;
import android.text.style.LineHeightSpan;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class h implements LineHeightSpan {
    public final float alpha;
    public final int bravo;
    public final boolean charlie;
    public final boolean delta;
    public final float echo;
    public final boolean foxtrot;
    public int golf = RecyclerView.UNDEFINED_DURATION;
    public int hotel = RecyclerView.UNDEFINED_DURATION;
    public int india = RecyclerView.UNDEFINED_DURATION;
    public int juliet = RecyclerView.UNDEFINED_DURATION;
    public int kilo;
    public int lima;

    public h(float f5, int i4, boolean z2, boolean z10, float f10, boolean z11) {
        this.alpha = f5;
        this.bravo = i4;
        this.charlie = z2;
        this.delta = z10;
        this.echo = f10;
        this.foxtrot = z11;
        if ((0.0f <= f10 && f10 <= 1.0f) || f10 == -1.0f) {
            return;
        }
        J0.a.bravo("topRatio should be in [0..1] range or -1");
    }

    @Override // android.text.style.LineHeightSpan
    public final void chooseHeight(CharSequence charSequence, int i4, int i5, int i10, int i11, Paint.FontMetricsInt fontMetricsInt) {
        boolean z2;
        int i12;
        int i13;
        double ceil;
        int i14 = fontMetricsInt.descent;
        int i15 = fontMetricsInt.ascent;
        if (i14 - i15 > 0) {
            boolean z10 = true;
            if (i4 == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (i5 != this.bravo) {
                z10 = false;
            }
            boolean z11 = this.delta;
            boolean z12 = this.charlie;
            if (z2 && z10 && z12 && z11) {
                return;
            }
            if (this.golf == Integer.MIN_VALUE) {
                int i16 = i14 - i15;
                int ceil2 = (int) Math.ceil(this.alpha);
                int i17 = ceil2 - i16;
                if (this.foxtrot && i17 <= 0) {
                    int i18 = fontMetricsInt.ascent;
                    this.hotel = i18;
                    int i19 = fontMetricsInt.descent;
                    this.india = i19;
                    this.golf = i18;
                    this.juliet = i19;
                    this.kilo = 0;
                    this.lima = 0;
                } else {
                    float f5 = this.echo;
                    if (f5 == -1.0f) {
                        f5 = Math.abs(fontMetricsInt.ascent) / (fontMetricsInt.descent - fontMetricsInt.ascent);
                    }
                    if (i17 <= 0) {
                        ceil = Math.ceil(i17 * f5);
                    } else {
                        ceil = Math.ceil((1.0f - f5) * i17);
                    }
                    int i20 = (int) ceil;
                    int i21 = fontMetricsInt.descent;
                    int i22 = i20 + i21;
                    this.india = i22;
                    int i23 = i22 - ceil2;
                    this.hotel = i23;
                    if (z12) {
                        i23 = fontMetricsInt.ascent;
                    }
                    this.golf = i23;
                    if (z11) {
                        i22 = i21;
                    }
                    this.juliet = i22;
                    this.kilo = fontMetricsInt.ascent - i23;
                    this.lima = i22 - i21;
                }
            }
            if (z2) {
                i12 = this.golf;
            } else {
                i12 = this.hotel;
            }
            fontMetricsInt.ascent = i12;
            if (z10) {
                i13 = this.juliet;
            } else {
                i13 = this.india;
            }
            fontMetricsInt.descent = i13;
        }
    }
}
