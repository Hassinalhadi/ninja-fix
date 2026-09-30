package z;

import F.C0089b0;
import F.Z;
import a0.C0366t;
import a0.ao;
import bz.f0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import s0.AbstractC2557q;

/* loaded from: classes3.dex */
public final /* synthetic */ class n implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0089b0 purple;

    public /* synthetic */ n(C0089b0 c0089b0, int i4) {
        this.alpha = i4;
        this.purple = c0089b0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C0089b0 c0089b0 = this.purple;
        switch (this.alpha) {
            case 0:
                if (((z) AbstractC2557q.echo(c0089b0, aa.alpha)) == null) {
                    E.b bVar = c0089b0.yellow;
                    if (bVar != null) {
                        c0089b0.c(bVar);
                    }
                    c0089b0.yellow = null;
                } else if (c0089b0.yellow == null) {
                    Z z2 = new Z(2, c0089b0);
                    n nVar = new n(c0089b0, 1);
                    f0 f0Var = E.l.alpha;
                    E.b bVar2 = new E.b(c0089b0.silver, c0089b0.teal, c0089b0.white, z2, nVar);
                    c0089b0.b(bVar2);
                    c0089b0.yellow = bVar2;
                }
                return Unit.INSTANCE;
            default:
                long j5 = ((C0366t) AbstractC2557q.echo(c0089b0, g.alpha)).alpha;
                if (((C3449c) AbstractC2557q.echo(c0089b0, AbstractC3450d.alpha)).delta()) {
                    if (ao.romeo(j5) > 0.5d) {
                        return aa.delta;
                    }
                    return aa.echo;
                }
                return aa.foxtrot;
        }
    }
}
