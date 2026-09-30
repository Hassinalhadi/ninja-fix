package N0;

import B2.q;
import L0.k;
import Z.e;
import a0.aq;
import android.graphics.Shader;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ad;
import androidx.compose.runtime.ax;

/* loaded from: classes3.dex */
public final class b extends CharacterStyle implements UpdateAppearance {
    public final aq alpha;
    public final float purple;
    public final ax red = C0564b.zulu(new e(9205357640488583168L));
    public final ad silver = C0564b.quebec(new q(14, this));

    public b(aq aqVar, float f5) {
        this.alpha = aqVar;
        this.purple = f5;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        k.bravo(textPaint, this.purple);
        textPaint.setShader((Shader) this.silver.getValue());
    }
}
