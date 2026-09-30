package E1;

import Tf.ah;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import r6.u;

/* loaded from: classes3.dex */
public final class e extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ f purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(f fVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = fVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                f fVar = this.purple;
                ah ahVar = (ah) fVar.charlie.invoke();
                if (Uf.f.alpha(ahVar) != -1) {
                    return u.bravo(ahVar.alpha.romeo(), true);
                }
                throw new IllegalStateException(("OkioStorage requires absolute paths, but did not get an absolute path from producePath = " + fVar.charlie + ", instead got " + ahVar).toString());
            default:
                g7.f fVar2 = f.foxtrot;
                f fVar3 = this.purple;
                synchronized (fVar2) {
                    f.echo.remove(((ah) fVar3.delta.getValue()).alpha.romeo());
                }
                return Unit.INSTANCE;
        }
    }
}
