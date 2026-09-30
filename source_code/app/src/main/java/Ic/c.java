package Ic;

import Jb.ah;
import Xd.l;
import Xe.j;
import androidx.compose.runtime.G;
import cb.C0837b;
import com.app.network.network.models.ActionType;
import com.app.network.network.models.Root;
import ff.C1717b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.ab;
import kotlin.reflect.jvm.internal.impl.types.al;
import kotlin.reflect.jvm.internal.impl.types.ap;
import kotlin.reflect.jvm.internal.impl.types.ax;
import of.C2257l;
import pe.InterfaceC2345u;
import se.AbstractC2858h;
import se.AbstractC2864n;
import se.AbstractC2870t;

/* loaded from: classes2.dex */
public final class c implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;
    public final /* synthetic */ Object red;

    public /* synthetic */ c(kotlin.e eVar, Object obj, int i4) {
        this.alpha = i4;
        this.purple = eVar;
        this.red = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                ((Function1) this.purple).invoke((Root) this.red);
                return Unit.INSTANCE;
            case 1:
                ((Function1) this.purple).invoke(Integer.valueOf(((ah) this.red).alpha));
                return Unit.INSTANCE;
            case 2:
                ((Function1) this.purple).invoke((ActionType) this.red);
                return Unit.INSTANCE;
            case 3:
                ((l) this.purple).invoke(((C0837b) this.red).echo, Boolean.valueOf(!r0.delta));
                return Unit.INSTANCE;
            case 4:
                al.purple.getClass();
                al alVar = al.red;
                ap tango = ((AbstractC2858h) this.red).tango();
                List list = Collections.EMPTY_LIST;
                G g2 = new G(1, this);
                C1717b NO_LOCKS = ff.l.echo;
                Intrinsics.delta(NO_LOCKS, "NO_LOCKS");
                return ab.delta(new j(NO_LOCKS, g2), list, alVar, tango, false);
            default:
                C2257l c2257l = new C2257l();
                Iterator it = ((AbstractC2870t) this.red).mike().iterator();
                while (it.hasNext()) {
                    c2257l.add(((InterfaceC2345u) it.next()).delta((ax) this.purple));
                }
                return c2257l;
        }
    }

    public /* synthetic */ c(AbstractC2864n abstractC2864n, Object obj, int i4) {
        this.alpha = i4;
        this.red = abstractC2864n;
        this.purple = obj;
    }
}
