package m;

import Q0.n;
import a0.ao;
import a0.as;
import g.AbstractC1719b;

/* renamed from: m.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC2088a implements as {
    public final InterfaceC2089b alpha;
    public final InterfaceC2089b bravo;
    public final InterfaceC2089b charlie;
    public final InterfaceC2089b delta;

    public AbstractC2088a(InterfaceC2089b interfaceC2089b, InterfaceC2089b interfaceC2089b2, InterfaceC2089b interfaceC2089b3, InterfaceC2089b interfaceC2089b4) {
        this.alpha = interfaceC2089b;
        this.bravo = interfaceC2089b2;
        this.charlie = interfaceC2089b3;
        this.delta = interfaceC2089b4;
    }

    public static /* synthetic */ AbstractC2088a charlie(AbstractC2088a abstractC2088a, C2091d c2091d, C2091d c2091d2, C2091d c2091d3, int i4) {
        InterfaceC2089b interfaceC2089b = c2091d;
        if ((i4 & 1) != 0) {
            interfaceC2089b = abstractC2088a.alpha;
        }
        InterfaceC2089b interfaceC2089b2 = abstractC2088a.bravo;
        InterfaceC2089b interfaceC2089b3 = c2091d2;
        if ((i4 & 4) != 0) {
            interfaceC2089b3 = abstractC2088a.charlie;
        }
        return abstractC2088a.bravo(interfaceC2089b, interfaceC2089b2, interfaceC2089b3, c2091d3);
    }

    @Override // a0.as
    public final ao alpha(long j5, n nVar, Q0.d dVar) {
        float alpha = this.alpha.alpha(j5, dVar);
        float alpha2 = this.bravo.alpha(j5, dVar);
        float alpha3 = this.charlie.alpha(j5, dVar);
        float alpha4 = this.delta.alpha(j5, dVar);
        float charlie = Z.e.charlie(j5);
        float f5 = alpha + alpha4;
        if (f5 > charlie) {
            float f10 = charlie / f5;
            alpha *= f10;
            alpha4 *= f10;
        }
        float f11 = alpha2 + alpha3;
        if (f11 > charlie) {
            float f12 = charlie / f11;
            alpha2 *= f12;
            alpha3 *= f12;
        }
        if (alpha < 0.0f || alpha2 < 0.0f || alpha3 < 0.0f || alpha4 < 0.0f) {
            AbstractC1719b.alpha("Corner size in Px can't be negative(topStart = " + alpha + ", topEnd = " + alpha2 + ", bottomEnd = " + alpha3 + ", bottomStart = " + alpha4 + ")!");
        }
        return delta(j5, alpha, alpha2, alpha3, alpha4, nVar);
    }

    public abstract AbstractC2088a bravo(InterfaceC2089b interfaceC2089b, InterfaceC2089b interfaceC2089b2, InterfaceC2089b interfaceC2089b3, InterfaceC2089b interfaceC2089b4);

    public abstract ao delta(long j5, float f5, float f10, float f11, float f12, n nVar);
}
