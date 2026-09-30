package hf;

import Xe.n;
import ff.l;
import gf.C1791f;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.av;
import kotlin.reflect.jvm.internal.impl.types.ax;
import pe.AbstractC2340p;
import pe.InterfaceC2330f;
import pe.InterfaceC2336l;
import pe.an;
import pe.ao;
import qe.C2471g;
import se.C2859i;
import se.C2861k;

/* renamed from: hf.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1851a extends C2861k {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C1851a(Ne.f fVar) {
        super(r2, fVar, 3, 1, r6, l.echo);
        i iVar = i.alpha;
        c cVar = i.bravo;
        List emptyList = CollectionsKt.emptyList();
        ao aoVar = an.magenta;
        C2859i c2859i = new C2859i(this, null, C2471g.alpha, true, 1, aoVar);
        c2859i.n0(CollectionsKt.emptyList(), AbstractC2340p.delta);
        String str = c2859i.getName().alpha;
        Intrinsics.delta(str, "errorConstructor.name.toString()");
        e bravo = i.bravo(9, str, "");
        h hVar = h.f12735o;
        c2859i.yellow = new f(i.delta(hVar, new String[0]), bravo, hVar, CollectionsKt.emptyList(), false, new String[0]);
        cyan(bravo, ab.oscar(c2859i), c2859i);
    }

    @Override // se.AbstractC2852b
    /* renamed from: crimson */
    public final InterfaceC2330f delta(ax substitutor) {
        Intrinsics.echo(substitutor, "substitutor");
        return this;
    }

    @Override // se.AbstractC2852b, pe.ap
    public final InterfaceC2336l delta(ax substitutor) {
        Intrinsics.echo(substitutor, "substitutor");
        return this;
    }

    @Override // se.AbstractC2852b, se.y
    public final n foxtrot(av avVar, C1791f c1791f) {
        String str = getName().alpha;
        Intrinsics.delta(str, "name.toString()");
        return i.bravo(9, str, avVar.toString());
    }

    @Override // se.C2861k
    public final String toString() {
        String bravo = getName().bravo();
        Intrinsics.delta(bravo, "name.asString()");
        return bravo;
    }
}
