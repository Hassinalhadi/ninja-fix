package androidx.appcompat.widget;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.Log;
import android.widget.TextView;
import com.airbnb.lottie.compose.LottieConstants;

/* loaded from: classes3.dex */
public abstract class H {
    public static StaticLayout alpha(CharSequence charSequence, Layout.Alignment alignment, int i4, int i5, TextView textView, TextPaint textPaint, L l10) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i4);
        StaticLayout.Builder hyphenationFrequency = obtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
        if (i5 == -1) {
            i5 = LottieConstants.IterateForever;
        }
        hyphenationFrequency.setMaxLines(i5);
        try {
            l10.alpha(obtain, textView);
        } catch (ClassCastException unused) {
            Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
        }
        return obtain.build();
    }
}
