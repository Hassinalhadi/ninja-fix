package oe;

import B9.K;
import bx.C0769g;
import df.C1622a;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.collections.u;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import of.AbstractC2262q;
import pe.InterfaceC2321ad;
import pe.InterfaceC2325ah;
import s1.C2576i;
import s6.AbstractC2826z0;
import se.z;

/* renamed from: oe.o, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2244o implements InterfaceC2325ah {
    public final ff.l alpha;
    public final z bravo;
    public K charlie;
    public final ff.j delta;

    public C2244o(ff.l lVar, C2576i c2576i, z zVar) {
        this.alpha = lVar;
        this.bravo = zVar;
        this.delta = lVar.delta(new C0769g(3, this));
    }

    @Override // pe.InterfaceC2325ah
    public final boolean alpha(Ne.c fqName) {
        InterfaceC2321ad charlie;
        Intrinsics.echo(fqName, "fqName");
        ff.j jVar = this.delta;
        Object obj = jVar.purple.get(fqName);
        if (obj != null && obj != ff.k.purple) {
            charlie = (InterfaceC2321ad) jVar.invoke(fqName);
        } else {
            charlie = charlie(fqName);
        }
        if (charlie == null) {
            return true;
        }
        return false;
    }

    @Override // pe.InterfaceC2325ah
    public final void bravo(Ne.c fqName, ArrayList arrayList) {
        Intrinsics.echo(fqName, "fqName");
        AbstractC2262q.alpha(arrayList, this.delta.invoke(fqName));
    }

    public final df.c charlie(Ne.c fqName) {
        InputStream alpha;
        Intrinsics.echo(fqName, "fqName");
        if (!fqName.hotel(me.n.india)) {
            alpha = null;
        } else {
            C1622a.mike.getClass();
            alpha = df.d.alpha(C1622a.alpha(fqName));
        }
        if (alpha == null) {
            return null;
        }
        return AbstractC2826z0.charlie(fqName, this.alpha, this.bravo, alpha);
    }

    @Override // pe.InterfaceC2325ah
    public final Collection kilo(Ne.c fqName, Function1 nameFilter) {
        Intrinsics.echo(fqName, "fqName");
        Intrinsics.echo(nameFilter, "nameFilter");
        return u.alpha;
    }
}
