package F;

import a0.C0366t;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;

/* renamed from: F.r0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0152r0 {
    public static final float alpha = H.f.alpha;
    public static final float bravo = H.l.alpha;
    public static final androidx.compose.foundation.layout.M charlie;

    static {
        float f5 = AbstractC0173x0.charlie;
        float f10 = 0;
        charlie = new androidx.compose.foundation.layout.M(f5, f10, f5, f10);
    }

    public static C0156s0 alpha(InterfaceC0581m interfaceC0581m) {
        O o5 = (O) ((C0585q) interfaceC0581m).kilo(Q.alpha);
        C0156s0 c0156s0 = o5.magenta;
        if (c0156s0 == null) {
            C0156s0 c0156s02 = new C0156s0(Q.charlie(o5, H.k.golf), Q.charlie(o5, H.k.hotel), Q.charlie(o5, H.k.india), C0366t.bravo(H.k.alpha, Q.charlie(o5, H.k.delta)), C0366t.bravo(H.k.bravo, Q.charlie(o5, H.k.echo)), C0366t.bravo(H.k.charlie, Q.charlie(o5, H.k.foxtrot)));
            o5.magenta = c0156s02;
            return c0156s02;
        }
        return c0156s0;
    }
}
