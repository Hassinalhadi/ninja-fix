package bx;

import android.view.ViewConfiguration;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.C0797w;
import t0.AbstractC2901T;

/* loaded from: classes3.dex */
public abstract class L {
    public static final float alpha = ViewConfiguration.getScrollFriction();

    public static final C0797w alpha(InterfaceC0581m interfaceC0581m) {
        C0585q c0585q = (C0585q) interfaceC0581m;
        Q0.d dVar = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
        boolean delta = c0585q.delta(dVar.alpha());
        Object jade = c0585q.jade();
        if (delta || jade == C0580l.alpha) {
            jade = new C0797w(new androidx.core.widget.f(dVar));
            c0585q.f(jade);
        }
        return (C0797w) jade;
    }
}
