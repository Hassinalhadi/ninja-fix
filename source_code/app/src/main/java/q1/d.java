package q1;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class d {
    public final TextPaint alpha;
    public final TextDirectionHeuristic bravo;
    public final int charlie;
    public final int delta;

    public d(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i4, int i5) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = com.bumptech.glide.load.resource.bitmap.f.hotel(textPaint).setBreakStrategy(i4);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i5);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.alpha = textPaint;
        this.bravo = textDirectionHeuristic;
        this.charlie = i4;
        this.delta = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        if (r0 == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
    
        if (r2.getTypeface() != null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
    
        if (r4.getTypeface() == null) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r6.bravo != r7.bravo) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b7, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ae, code lost:
    
        if (r2.getTypeface().equals(r4.getTypeface()) != false) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0092, code lost:
    
        if (r2.getTextLocale().equals(r4.getTextLocale()) == false) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        LocaleList textLocales;
        LocaleList textLocales2;
        boolean equals;
        if (obj != this) {
            if (obj instanceof d) {
                d dVar = (d) obj;
                int i4 = Build.VERSION.SDK_INT;
                if (this.charlie == dVar.charlie && this.delta == dVar.delta) {
                    TextPaint textPaint = this.alpha;
                    float textSize = textPaint.getTextSize();
                    TextPaint textPaint2 = dVar.alpha;
                    if (textSize == textPaint2.getTextSize() && textPaint.getTextScaleX() == textPaint2.getTextScaleX() && textPaint.getTextSkewX() == textPaint2.getTextSkewX() && textPaint.getLetterSpacing() == textPaint2.getLetterSpacing() && TextUtils.equals(textPaint.getFontFeatureSettings(), textPaint2.getFontFeatureSettings()) && textPaint.getFlags() == textPaint2.getFlags()) {
                        if (i4 >= 24) {
                            textLocales = textPaint.getTextLocales();
                            textLocales2 = textPaint2.getTextLocales();
                            equals = textLocales.equals(textLocales2);
                        }
                    }
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        LocaleList textLocales;
        TextDirectionHeuristic textDirectionHeuristic = this.bravo;
        int i4 = Build.VERSION.SDK_INT;
        int i5 = this.delta;
        int i10 = this.charlie;
        TextPaint textPaint = this.alpha;
        if (i4 >= 24) {
            Float valueOf = Float.valueOf(textPaint.getTextSize());
            Float valueOf2 = Float.valueOf(textPaint.getTextScaleX());
            Float valueOf3 = Float.valueOf(textPaint.getTextSkewX());
            Float valueOf4 = Float.valueOf(textPaint.getLetterSpacing());
            Integer valueOf5 = Integer.valueOf(textPaint.getFlags());
            textLocales = textPaint.getTextLocales();
            return Objects.hash(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i10), Integer.valueOf(i5));
        }
        return Objects.hash(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i10), Integer.valueOf(i5));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb2 = new StringBuilder("{");
        StringBuilder sb3 = new StringBuilder("textSize=");
        TextPaint textPaint = this.alpha;
        sb3.append(textPaint.getTextSize());
        sb2.append(sb3.toString());
        sb2.append(", textScaleX=" + textPaint.getTextScaleX());
        sb2.append(", textSkewX=" + textPaint.getTextSkewX());
        int i4 = Build.VERSION.SDK_INT;
        sb2.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb2.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i4 >= 24) {
            StringBuilder sb4 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb4.append(textLocales);
            sb2.append(sb4.toString());
        } else {
            sb2.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb2.append(", typeface=" + textPaint.getTypeface());
        if (i4 >= 26) {
            StringBuilder sb5 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb5.append(fontVariationSettings);
            sb2.append(sb5.toString());
        }
        sb2.append(", textDir=" + this.bravo);
        sb2.append(", breakStrategy=" + this.charlie);
        sb2.append(", hyphenationFrequency=" + this.delta);
        sb2.append("}");
        return sb2.toString();
    }

    public d(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.alpha = textPaint;
        textDirection = params.getTextDirection();
        this.bravo = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.charlie = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.delta = hyphenationFrequency;
    }
}
