package t6;

import android.view.inputmethod.ExtractedText;
import kotlin.text.StringsKt;

/* loaded from: classes2.dex */
public abstract class N2 {
    public static final ExtractedText alpha(I0.aa aaVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = aaVar.alpha.purple;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j5 = aaVar.bravo;
        extractedText.selectionStart = D0.am.foxtrot(j5);
        extractedText.selectionEnd = D0.am.echo(j5);
        extractedText.flags = !StringsKt.black(aaVar.alpha.purple, '\n') ? 1 : 0;
        return extractedText;
    }

    public static float bravo(float f5, float f10, float f11) {
        return (f11 * f10) + ((1.0f - f11) * f5);
    }
}
