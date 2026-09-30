package s6;

import android.graphics.PorterDuff;
import android.view.inputmethod.ExtractedText;
import j1.EnumC1927a;
import kotlin.text.StringsKt;

/* renamed from: s6.x5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2813x5 {
    public static PorterDuff.Mode alpha(EnumC1927a enumC1927a) {
        if (enumC1927a == null) {
            return null;
        }
        switch (enumC1927a.ordinal()) {
            case 0:
                return PorterDuff.Mode.CLEAR;
            case 1:
                return PorterDuff.Mode.SRC;
            case 2:
                return PorterDuff.Mode.DST;
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
                return PorterDuff.Mode.DST_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 10:
                return PorterDuff.Mode.DST_ATOP;
            case 11:
                return PorterDuff.Mode.XOR;
            case 12:
                return PorterDuff.Mode.ADD;
            case 13:
                return PorterDuff.Mode.MULTIPLY;
            case 14:
                return PorterDuff.Mode.SCREEN;
            case 15:
                return PorterDuff.Mode.OVERLAY;
            case 16:
                return PorterDuff.Mode.DARKEN;
            case 17:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    public static final ExtractedText bravo(I0.aa aaVar) {
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
}
