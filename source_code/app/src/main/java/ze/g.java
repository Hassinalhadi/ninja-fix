package ze;

import B9.ab;
import ge.v;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;
import me.m;
import s6.K4;
import ve.C3193e;

/* loaded from: classes2.dex */
public final class g extends b {
    public static final /* synthetic */ v[] golf;
    public final ff.i foxtrot;

    static {
        kotlin.jvm.internal.v vVar = u.alpha;
        golf = new v[]{vVar.hotel(new o(vVar.bravo(g.class), "allValueArguments", "getAllValueArguments()Ljava/util/Map;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C3193e c3193e, ab c3) {
        super(c3, c3193e, m.mike);
        Intrinsics.echo(c3, "c");
        this.foxtrot = ((Be.a) c3.purple).alpha.bravo(f.alpha);
    }

    @Override // ze.b, qe.InterfaceC2466b
    public final Map bravo() {
        return (Map) K4.alpha(this.foxtrot, golf[0]);
    }
}
