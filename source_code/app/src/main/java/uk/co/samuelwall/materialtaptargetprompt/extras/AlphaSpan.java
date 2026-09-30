package uk.co.samuelwall.materialtaptargetprompt.extras;

import android.graphics.Color;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

/* loaded from: classes.dex */
class AlphaSpan extends CharacterStyle {
    private final float mValue;

    public AlphaSpan(float f5) {
        this.mValue = f5;
    }

    @Override // android.text.style.CharacterStyle
    public void updateDrawState(TextPaint textPaint) {
        textPaint.setAlpha((int) (textPaint.getAlpha() * this.mValue));
        textPaint.bgColor = Color.argb((int) (Color.alpha(textPaint.bgColor) * this.mValue), Color.red(textPaint.bgColor), Color.green(textPaint.bgColor), Color.blue(textPaint.bgColor));
    }
}
