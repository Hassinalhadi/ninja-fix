package n;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* renamed from: n.A, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2121A implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ K purple;

    public /* synthetic */ C2121A(K k6, int i4) {
        this.alpha = i4;
        this.purple = k6;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                this.purple.bravo(((Z.b) obj).alpha);
                return Unit.INSTANCE;
            default:
                m0.r rVar = (m0.r) obj;
                this.purple.echo(m0.q.golf(rVar, false));
                rVar.alpha();
                return Unit.INSTANCE;
        }
    }
}
