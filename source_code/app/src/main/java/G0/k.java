package G0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes3.dex */
public final class k extends CharacterStyle {
    public final boolean alpha;
    public final boolean bravo;

    public k(boolean z2, boolean z10) {
        this.alpha = z2;
        this.bravo = z10;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setUnderlineText(this.alpha);
        textPaint.setStrikeThruText(this.bravo);
    }
}
