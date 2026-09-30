package androidx.compose.foundation.text.handwriting;

import T.p;
import T.s;
import androidx.compose.ui.input.pointer.StylusHoverIconModifierElement;
import kotlin.jvm.functions.Function0;
import s0.r;
import v.AbstractC3164c;

/* loaded from: classes3.dex */
public abstract class a {
    public static final r alpha;

    static {
        float f5 = 40;
        float f10 = 10;
        alpha = new r(f10, f5, f10, f5);
    }

    public static final s alpha(boolean z2, boolean z10, Function0 function0) {
        s sVar = p.alpha;
        if (z2 && AbstractC3164c.alpha) {
            if (z10) {
                sVar = new StylusHoverIconModifierElement(alpha);
            }
            return sVar.then(new StylusHandwritingElement(function0));
        }
        return sVar;
    }
}
