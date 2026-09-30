package Wf;

import android.content.res.Configuration;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import t0.AbstractC2901T;

/* loaded from: classes2.dex */
public final class s {
    public static r alpha(C0585q c0585q) {
        boolean z2;
        aj ajVar;
        d dVar;
        c0585q.purple(1808039825);
        K0.a alpha = K0.d.alpha.delta().alpha();
        if ((((Configuration) c0585q.kilo(AndroidCompositionLocals_androidKt.alpha)).uiMode & 48) == 32) {
            z2 = true;
        } else {
            z2 = false;
        }
        Q0.d dVar2 = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
        c0585q.purple(1697237979);
        boolean golf = c0585q.golf(alpha) | c0585q.hotel(z2) | c0585q.golf(dVar2);
        Object jade = c0585q.jade();
        if (golf || jade == C0580l.alpha) {
            n nVar = new n(alpha.alpha.getLanguage());
            p pVar = new p(alpha.alpha.getCountry());
            aj.alpha.getClass();
            if (z2) {
                ajVar = aj.red;
            } else {
                ajVar = aj.purple;
            }
            W8.a aVar = d.purple;
            float alpha2 = dVar2.alpha();
            aVar.getClass();
            double d4 = alpha2;
            if (d4 <= 0.75d) {
                dVar = d.red;
            } else if (d4 <= 1.0d) {
                dVar = d.silver;
            } else if (d4 <= 1.5d) {
                dVar = d.teal;
            } else if (d4 <= 2.0d) {
                dVar = d.white;
            } else if (d4 <= 3.0d) {
                dVar = d.yellow;
            } else {
                dVar = d.f2236a;
            }
            jade = new r(nVar, pVar, ajVar, dVar);
            c0585q.f(jade);
        }
        r rVar = (r) jade;
        c0585q.quebec(false);
        c0585q.quebec(false);
        return rVar;
    }
}
