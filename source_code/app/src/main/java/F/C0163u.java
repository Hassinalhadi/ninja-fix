package F;

import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.InterfaceC0539e;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import kotlin.Unit;
import kotlin.jvm.internal.Lambda;
import t6.AbstractC3087z;

/* renamed from: F.u, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0163u extends Lambda implements Xd.l {
    public final /* synthetic */ androidx.compose.foundation.layout.G alpha;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ P.d f1199c;
    public final /* synthetic */ float purple;
    public final /* synthetic */ M2 red;
    public final /* synthetic */ P.d silver;
    public final /* synthetic */ D0.an teal;
    public final /* synthetic */ boolean white;
    public final /* synthetic */ P.d yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0163u(androidx.compose.foundation.layout.G g2, float f5, M2 m22, P.d dVar, D0.an anVar, boolean z2, P.d dVar2, P.d dVar3) {
        super(2);
        this.alpha = g2;
        this.purple = f5;
        this.red = m22;
        this.silver = dVar;
        this.teal = anVar;
        this.white = z2;
        this.yellow = dVar2;
        this.f1199c = dVar3;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC0539e interfaceC0539e;
        InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
        if ((((Number) obj2).intValue() & 3) == 2) {
            C0585q c0585q = (C0585q) interfaceC0581m;
            if (c0585q.bronze()) {
                c0585q.ochre();
                return Unit.INSTANCE;
            }
        }
        T.s golf = androidx.compose.foundation.layout.V.golf(AbstractC3087z.bravo(AbstractC0538d.azure(T.p.alpha, this.alpha)), 0.0f, this.purple, 1);
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        boolean golf2 = c0585q2.golf(null);
        Object jade = c0585q2.jade();
        if (golf2 || jade == C0580l.alpha) {
            jade = new C0159t(0);
            c0585q2.f(jade);
        }
        S1 s12 = (S1) jade;
        M2 m22 = this.red;
        J1.e eVar = AbstractC0542h.echo;
        if (this.white) {
            interfaceC0539e = eVar;
        } else {
            interfaceC0539e = AbstractC0542h.alpha;
        }
        P.d dVar = this.yellow;
        P.d dVar2 = this.f1199c;
        ag.foxtrot(golf, s12, m22.charlie, m22.delta, m22.echo, this.silver, this.teal, 1.0f, eVar, interfaceC0539e, 0, false, dVar, dVar2, c0585q2, 113246208, 3126);
        return Unit.INSTANCE;
    }
}
