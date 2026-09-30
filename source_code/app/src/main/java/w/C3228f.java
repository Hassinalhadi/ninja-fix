package w;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import n.C2146v;
import n.ax;
import s0.AbstractC2555o;
import t0.InterfaceC2937r0;
import t0.U;

/* renamed from: w.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3228f implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C3230h purple;

    public /* synthetic */ C3228f(C3230h c3230h, int i4) {
        this.alpha = i4;
        this.purple = c3230h;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        InterfaceC2937r0 interfaceC2937r0;
        switch (this.alpha) {
            case 0:
                AbstractC2555o.delta(this.purple);
                return Unit.INSTANCE;
            case 1:
                this.purple.f14004c.juliet(true);
                return Boolean.TRUE;
            case 2:
                this.purple.f14004c.foxtrot(true);
                return Boolean.TRUE;
            case 3:
                this.purple.f14004c.hotel();
                return Boolean.TRUE;
            case 4:
                AbstractC2555o.delta(this.purple);
                return Unit.INSTANCE;
            case 5:
                this.purple.f14004c.quebec();
                return Boolean.TRUE;
            case 6:
                C3230h c3230h = this.purple;
                C2146v c2146v = c3230h.teal.whiskey;
                int i4 = c3230h.f14005d.echo;
                c2146v.getClass();
                c2146v.purple.romeo.bravo(i4);
                return Boolean.TRUE;
            default:
                C3230h c3230h2 = this.purple;
                ax axVar = c3230h2.teal;
                Y.s sVar = c3230h2.e;
                boolean z2 = c3230h2.white;
                if (!axVar.bravo()) {
                    Y.s.bravo(sVar);
                } else if (!z2 && (interfaceC2937r0 = axVar.charlie) != null) {
                    ((U) interfaceC2937r0).bravo();
                }
                return Boolean.TRUE;
        }
    }
}
