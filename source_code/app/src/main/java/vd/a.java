package vd;

import Pd.i;
import io.ktor.utils.io.ag;
import kotlin.Unit;
import sd.v;
import yd.h;

/* loaded from: classes2.dex */
public final class a extends e {
    public final h alpha;
    public final sd.e bravo;

    public a(h hVar, sd.e eVar) {
        this.alpha = hVar;
        this.bravo = eVar;
    }

    @Override // vd.e
    public final Long alpha() {
        return null;
    }

    @Override // vd.e
    public final sd.e bravo() {
        return this.bravo;
    }

    @Override // vd.e
    public final v delta() {
        return null;
    }

    public final Object echo(ag agVar, i iVar) {
        Object invoke = this.alpha.invoke(agVar, iVar);
        if (invoke == Od.a.alpha) {
            return invoke;
        }
        return Unit.INSTANCE;
    }
}
