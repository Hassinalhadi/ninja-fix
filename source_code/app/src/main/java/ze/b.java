package ze;

import B9.ab;
import com.clevertap.android.sdk.Constants;
import ge.v;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.types.ae;
import kotlin.reflect.jvm.internal.impl.types.y;
import pe.an;
import qe.InterfaceC2466b;
import s6.K4;
import ve.C3193e;

/* loaded from: classes2.dex */
public class b implements InterfaceC2466b, Ae.h {
    public static final /* synthetic */ v[] echo;
    public final Ne.c alpha;
    public final an bravo;
    public final ff.i charlie;
    public final Ee.a delta;

    static {
        kotlin.jvm.internal.v vVar = u.alpha;
        echo = new v[]{vVar.hotel(new o(vVar.bravo(b.class), Constants.KEY_TYPE, "getType()Lorg/jetbrains/kotlin/types/SimpleType;"))};
    }

    public b(ab c3, C3193e c3193e, Ne.c fqName) {
        an anVar;
        Ee.a aVar;
        Intrinsics.echo(c3, "c");
        Intrinsics.echo(fqName, "fqName");
        this.alpha = fqName;
        Be.a aVar2 = (Be.a) c3.purple;
        if (c3193e != null) {
            anVar = aVar2.juliet.alpha(c3193e);
        } else {
            anVar = an.magenta;
        }
        this.bravo = anVar;
        this.charlie = aVar2.alpha.bravo(new qa.j(13, c3, this));
        if (c3193e != null) {
            aVar = (Ee.a) CollectionsKt.gray(c3193e.bravo());
        } else {
            aVar = null;
        }
        this.delta = aVar;
    }

    @Override // qe.InterfaceC2466b
    public final Ne.c alpha() {
        return this.alpha;
    }

    @Override // qe.InterfaceC2466b
    public Map bravo() {
        return t.alpha;
    }

    @Override // qe.InterfaceC2466b
    public final an echo() {
        return this.bravo;
    }

    @Override // qe.InterfaceC2466b
    public final y getType() {
        return (ae) K4.alpha(this.charlie, echo[0]);
    }
}
