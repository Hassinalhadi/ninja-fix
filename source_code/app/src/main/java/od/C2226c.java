package od;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import qd.C2464b;
import sd.aa;
import sd.n;
import sd.s;
import t6.AbstractC3006i2;
import tg.k;
import vf.a0;
import vf.ad;
import zd.C3509a;

/* renamed from: od.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2226c {
    public final aa alpha = new aa();
    public s bravo = s.bravo;
    public final n charlie = new G3.a(10);
    public Object delta = C2464b.alpha;
    public a0 echo = ad.foxtrot();
    public final zd.i foxtrot = new zd.i();

    public final void alpha(Ed.a aVar) {
        zd.i iVar = this.foxtrot;
        if (aVar != null) {
            iVar.foxtrot(h.alpha, aVar);
            return;
        }
        C3509a key = h.alpha;
        iVar.getClass();
        Intrinsics.echo(key, "key");
        iVar.delta().remove(key);
    }

    public final void bravo(C2226c builder) {
        Intrinsics.echo(builder, "builder");
        this.echo = builder.echo;
        this.bravo = builder.bravo;
        this.delta = builder.delta;
        C3509a c3509a = h.alpha;
        zd.i other = builder.foxtrot;
        alpha((Ed.a) other.echo(c3509a));
        aa aaVar = builder.alpha;
        aa aaVar2 = this.alpha;
        AbstractC3006i2.delta(aaVar2, aaVar);
        List list = aaVar2.hotel;
        Intrinsics.echo(list, "<set-?>");
        aaVar2.hotel = list;
        k.alpha(this.charlie, builder.charlie);
        zd.i iVar = this.foxtrot;
        Intrinsics.echo(iVar, "<this>");
        Intrinsics.echo(other, "other");
        for (C3509a c3509a2 : CollectionsKt.z(other.delta().keySet())) {
            Intrinsics.charlie(c3509a2, "null cannot be cast to non-null type io.ktor.util.AttributeKey<kotlin.Any>");
            iVar.foxtrot(c3509a2, other.charlie(c3509a2));
        }
    }
}
