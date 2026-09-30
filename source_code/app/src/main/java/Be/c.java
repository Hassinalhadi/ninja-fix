package Be;

import A0.p;
import B9.ab;
import Pf.u;
import ff.j;
import java.util.Iterator;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import me.m;
import pf.AbstractC2360j;
import pf.C2355e;
import pf.C2361k;
import pf.C2364n;
import pf.InterfaceC2358h;
import qe.InterfaceC2466b;
import qe.InterfaceC2472h;
import s6.E7;
import ve.C3193e;

/* loaded from: classes2.dex */
public final class c implements InterfaceC2472h {
    public final ab alpha;
    public final Ee.b purple;
    public final boolean red;
    public final j silver;

    public c(ab c3, Ee.b annotationOwner, boolean z2) {
        Intrinsics.echo(c3, "c");
        Intrinsics.echo(annotationOwner, "annotationOwner");
        this.alpha = c3;
        this.purple = annotationOwner;
        this.red = z2;
        this.silver = ((a) c3.purple).alpha.delta(new p(2, this));
    }

    @Override // qe.InterfaceC2472h
    public final boolean D(Ne.c cVar) {
        return E7.delta(this, cVar);
    }

    @Override // qe.InterfaceC2472h
    public final InterfaceC2466b gray(Ne.c fqName) {
        InterfaceC2466b interfaceC2466b;
        Intrinsics.echo(fqName, "fqName");
        Ee.b bVar = this.purple;
        C3193e alpha = bVar.alpha(fqName);
        if (alpha != null && (interfaceC2466b = (InterfaceC2466b) this.silver.invoke(alpha)) != null) {
            return interfaceC2466b;
        }
        Ne.f fVar = ze.c.alpha;
        return ze.c.alpha(fqName, bVar, this.alpha);
    }

    @Override // qe.InterfaceC2472h
    public final boolean isEmpty() {
        if (this.purple.getAnnotations().isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Ee.b bVar = this.purple;
        C2364n oscar = AbstractC2360j.oscar(CollectionsKt.beige(bVar.getAnnotations()), this.silver);
        Ne.f fVar = ze.c.alpha;
        return new C2355e(AbstractC2360j.hotel(AbstractC2360j.kilo(ArraysKt.tango(new InterfaceC2358h[]{oscar, new u(1, ze.c.alpha(m.mike, bVar, this.alpha))})), new C2361k(1)));
    }
}
