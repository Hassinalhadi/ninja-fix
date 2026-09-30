package G0;

import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes3.dex */
public final class j extends CharacterStyle {
    public final int alpha;
    public final float bravo;
    public final float charlie;
    public final float delta;

    public j(float f5, float f10, float f11, int i4) {
        this.alpha = i4;
        this.bravo = f5;
        this.charlie = f10;
        this.delta = f11;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        textPaint.setShadowLayer(this.delta, this.bravo, this.charlie, this.alpha);
    }
}
