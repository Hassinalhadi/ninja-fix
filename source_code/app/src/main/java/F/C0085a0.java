package F;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import s0.AbstractC2557q;

/* renamed from: F.a0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0085a0 extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C0089b0 purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0085a0(C0089b0 c0089b0, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c0089b0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i4 = 0;
        C0089b0 c0089b0 = this.purple;
        switch (this.alpha) {
            case 0:
                return K1.alpha;
            default:
                if (((J1) AbstractC2557q.echo(c0089b0, L1.bravo)) == null) {
                    E.b bVar = c0089b0.yellow;
                    if (bVar != null) {
                        c0089b0.c(bVar);
                    }
                } else if (c0089b0.yellow == null) {
                    Z z2 = new Z(i4, c0089b0);
                    C0085a0 c0085a0 = new C0085a0(c0089b0, i4);
                    bz.f0 f0Var = E.l.alpha;
                    E.b bVar2 = new E.b(c0089b0.silver, c0089b0.teal, c0089b0.white, z2, c0085a0);
                    c0089b0.b(bVar2);
                    c0089b0.yellow = bVar2;
                }
                return Unit.INSTANCE;
        }
    }
}
