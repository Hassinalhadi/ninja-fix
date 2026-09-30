package E0;

import android.os.Build;
import android.text.BoringLayout;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.MetricAffectingSpan;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;

/* loaded from: classes3.dex */
public final class l {
    public final CharSequence alpha;
    public final TextPaint bravo;
    public final int charlie;
    public float delta = Float.NaN;
    public float echo = Float.NaN;
    public BoringLayout.Metrics foxtrot;
    public boolean golf;
    public CharSequence hotel;

    public l(CharSequence charSequence, TextPaint textPaint, int i4) {
        this.alpha = charSequence;
        this.bravo = textPaint;
        this.charlie = i4;
    }

    public final BoringLayout.Metrics alpha() {
        BoringLayout.Metrics metrics;
        if (!this.golf) {
            TextDirectionHeuristic alpha = s.alpha(this.charlie);
            int i4 = Build.VERSION.SDK_INT;
            CharSequence charSequence = this.alpha;
            TextPaint textPaint = this.bravo;
            if (i4 >= 33) {
                metrics = c.juliet(charSequence, textPaint, alpha);
            } else if (!alpha.isRtl(charSequence, 0, charSequence.length())) {
                metrics = BoringLayout.isBoring(charSequence, textPaint, null);
            } else {
                metrics = null;
            }
            this.foxtrot = metrics;
            this.golf = true;
        }
        return this.foxtrot;
    }

    public final CharSequence bravo() {
        CharacterStyle[] characterStyleArr;
        CharSequence charSequence = this.hotel;
        if (charSequence == null) {
            CharSequence charSequence2 = this.alpha;
            if (charSequence2 instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence2;
                if (o.foxtrot(spanned, CharacterStyle.class) && (characterStyleArr = (CharacterStyle[]) spanned.getSpans(0, charSequence2.length(), CharacterStyle.class)) != null && characterStyleArr.length != 0) {
                    Lf.h golf = x.golf(characterStyleArr);
                    SpannableString spannableString = null;
                    while (golf.hasNext()) {
                        CharacterStyle characterStyle = (CharacterStyle) golf.next();
                        if (!(characterStyle instanceof MetricAffectingSpan)) {
                            if (spannableString == null) {
                                spannableString = new SpannableString(charSequence2);
                            }
                            spannableString.removeSpan(characterStyle);
                        }
                    }
                    if (spannableString != null) {
                        charSequence2 = spannableString;
                    }
                }
            }
            this.hotel = charSequence2;
            return charSequence2;
        }
        Intrinsics.checkNotNull(charSequence);
        return charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x004f, code lost:
    
        if (E0.o.foxtrot(r2, G0.e.class) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0057, code lost:
    
        if (r3.getLetterSpacing() == 0.0f) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float charlie() {
        int i4;
        if (!Float.isNaN(this.delta)) {
            return this.delta;
        }
        BoringLayout.Metrics alpha = alpha();
        if (alpha != null) {
            i4 = alpha.width;
        } else {
            i4 = -1;
        }
        float f5 = i4;
        TextPaint textPaint = this.bravo;
        if (f5 < 0.0f) {
            f5 = (float) Math.ceil(Layout.getDesiredWidth(bravo(), 0, bravo().length(), textPaint));
        }
        if (f5 != 0.0f) {
            CharSequence charSequence = this.alpha;
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                if (!o.foxtrot(spanned, G0.f.class)) {
                }
                f5 += 0.5f;
            }
        }
        this.delta = f5;
        return f5;
    }
}
