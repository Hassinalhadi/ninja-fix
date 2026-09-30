package F0;

import android.text.TextPaint;
import s6.I4;

/* loaded from: classes3.dex */
public final class b extends I4 {
    public final CharSequence alpha;
    public final TextPaint purple;

    public b(CharSequence charSequence, TextPaint textPaint) {
        this.alpha = charSequence;
        this.purple = textPaint;
    }

    @Override // s6.I4
    public final int alpha(int i4) {
        int textRunCursor;
        CharSequence charSequence = this.alpha;
        textRunCursor = this.purple.getTextRunCursor(charSequence, 0, charSequence.length(), false, i4, 0);
        return textRunCursor;
    }

    @Override // s6.I4
    public final int bravo(int i4) {
        int textRunCursor;
        CharSequence charSequence = this.alpha;
        textRunCursor = this.purple.getTextRunCursor(charSequence, 0, charSequence.length(), false, i4, 2);
        return textRunCursor;
    }
}
