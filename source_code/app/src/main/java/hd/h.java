package hd;

import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;

/* loaded from: classes2.dex */
public final class h extends vd.d {
    public final /* synthetic */ int alpha = 0;
    public final Long bravo;
    public final sd.e charlie;
    public final /* synthetic */ Object delta;

    public h(Dd.f fVar, sd.e eVar, Object obj) {
        this.delta = obj;
        sd.n nVar = ((C2226c) fVar.alpha).charlie;
        List list = sd.q.alpha;
        String K6 = nVar.K("Content-Length");
        this.bravo = K6 != null ? Long.valueOf(Long.parseLong(K6)) : null;
        if (eVar == null) {
            sd.e eVar2 = sd.b.alpha;
            eVar = sd.b.bravo;
        }
        this.charlie = eVar;
    }

    @Override // vd.e
    public final Long alpha() {
        switch (this.alpha) {
            case 0:
                return this.bravo;
            default:
                return this.bravo;
        }
    }

    @Override // vd.e
    public final sd.e bravo() {
        switch (this.alpha) {
            case 0:
                return this.charlie;
            default:
                return this.charlie;
        }
    }

    @Override // vd.d
    public final io.ktor.utils.io.t echo() {
        Object obj = this.delta;
        switch (this.alpha) {
            case 0:
                return (io.ktor.utils.io.t) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                Cf.e eVar = vf.ao.alpha;
                Cf.d context = Cf.d.purple;
                Id.a pool = Id.b.alpha;
                Intrinsics.echo(inputStream, "<this>");
                Intrinsics.echo(context, "context");
                Intrinsics.echo(pool, "pool");
                return new Hd.e(new Gf.b(inputStream), context);
        }
    }

    public h(C2226c c2226c, sd.e eVar, Object obj) {
        this.delta = obj;
        sd.n nVar = c2226c.charlie;
        List list = sd.q.alpha;
        String K6 = nVar.K("Content-Length");
        this.bravo = K6 != null ? Long.valueOf(Long.parseLong(K6)) : null;
        if (eVar == null) {
            sd.e eVar2 = sd.b.alpha;
            eVar = sd.b.bravo;
        }
        this.charlie = eVar;
    }
}
