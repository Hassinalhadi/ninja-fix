package com.google.android.material.internal;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class u {
    public CharSequence alpha;
    public final TextPaint bravo;
    public final int charlie;
    public int delta;
    public boolean kilo;
    public v mike;
    public Layout.Alignment echo = Layout.Alignment.ALIGN_NORMAL;
    public int foxtrot = LottieConstants.IterateForever;
    public float golf = 0.0f;
    public float hotel = 1.0f;
    public int india = 1;
    public boolean juliet = true;
    public TextUtils.TruncateAt lima = null;

    public u(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.alpha = charSequence;
        this.bravo = textPaint;
        this.charlie = i4;
        this.delta = charSequence.length();
    }

    public final StaticLayout alpha() {
        TextDirectionHeuristic textDirectionHeuristic;
        if (this.alpha == null) {
            this.alpha = "";
        }
        int max = Math.max(0, this.charlie);
        CharSequence charSequence = this.alpha;
        int i4 = this.foxtrot;
        TextPaint textPaint = this.bravo;
        if (i4 == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.lima);
        }
        int min = Math.min(charSequence.length(), this.delta);
        this.delta = min;
        if (this.kilo && this.foxtrot == 1) {
            this.echo = Layout.Alignment.ALIGN_OPPOSITE;
        }
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
        obtain.setAlignment(this.echo);
        obtain.setIncludePad(this.juliet);
        if (this.kilo) {
            textDirectionHeuristic = TextDirectionHeuristics.RTL;
        } else {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        }
        obtain.setTextDirection(textDirectionHeuristic);
        TextUtils.TruncateAt truncateAt = this.lima;
        if (truncateAt != null) {
            obtain.setEllipsize(truncateAt);
        }
        obtain.setMaxLines(this.foxtrot);
        float f5 = this.golf;
        if (f5 != 0.0f || this.hotel != 1.0f) {
            obtain.setLineSpacing(f5, this.hotel);
        }
        if (this.foxtrot > 1) {
            obtain.setHyphenationFrequency(this.india);
        }
        v vVar = this.mike;
        if (vVar != null) {
            obtain.setBreakStrategy(((TextInputLayout) ((a4.u) vVar).purple).f8203n.getBreakStrategy());
        }
        return obtain.build();
    }
}
