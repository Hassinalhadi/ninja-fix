package ef;

import ge.v;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import qe.InterfaceC2466b;
import qe.InterfaceC2472h;
import s6.E7;
import s6.K4;

/* renamed from: ef.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1653a implements InterfaceC2472h {
    public static final /* synthetic */ v[] purple;
    public final ff.i alpha;

    static {
        kotlin.jvm.internal.v vVar = kotlin.jvm.internal.u.alpha;
        purple = new v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(C1653a.class), "annotations", "getAnnotations()Ljava/util/List;"))};
    }

    public C1653a(ff.l storageManager, Function0 function0) {
        Intrinsics.echo(storageManager, "storageManager");
        this.alpha = storageManager.bravo(function0);
    }

    @Override // qe.InterfaceC2472h
    public final boolean D(Ne.c cVar) {
        return E7.delta(this, cVar);
    }

    @Override // qe.InterfaceC2472h
    public final InterfaceC2466b gray(Ne.c cVar) {
        return E7.charlie(this, cVar);
    }

    @Override // qe.InterfaceC2472h
    public boolean isEmpty() {
        return ((List) K4.alpha(this.alpha, purple[0])).isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return ((List) K4.alpha(this.alpha, purple[0])).iterator();
    }
}
