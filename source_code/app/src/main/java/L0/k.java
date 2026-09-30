package L0;

import D0.o;
import D0.q;
import a0.AbstractC0362p;
import a0.InterfaceC0364r;
import a0.ar;
import android.text.TextPaint;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class k {
    public static final l alpha = new l(false);

    public static final void alpha(o oVar, InterfaceC0364r interfaceC0364r, AbstractC0362p abstractC0362p, float f5, ar arVar, O0.l lVar, c0.e eVar) {
        ArrayList arrayList = oVar.hotel;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            q qVar = (q) arrayList.get(i4);
            qVar.alpha.golf(interfaceC0364r, abstractC0362p, f5, arVar, lVar, eVar);
            interfaceC0364r.mike(0.0f, qVar.alpha.bravo());
        }
    }

    public static final void bravo(TextPaint textPaint, float f5) {
        if (!Float.isNaN(f5)) {
            if (f5 < 0.0f) {
                f5 = 0.0f;
            }
            if (f5 > 1.0f) {
                f5 = 1.0f;
            }
            textPaint.setAlpha(Math.round(f5 * 255));
        }
    }
}
