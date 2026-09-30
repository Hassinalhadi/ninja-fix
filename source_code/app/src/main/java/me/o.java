package me;

import ff.C1717b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.ab;
import oe.C2240k;
import pe.AbstractC2340p;
import pe.C2339o;
import pe.InterfaceC2345u;
import se.C2859i;
import se.aa;
import se.ao;

/* loaded from: classes2.dex */
public abstract class o {
    public static final aa alpha;

    static {
        hf.i iVar = hf.i.alpha;
        C2240k c2240k = new C2240k(hf.i.bravo, n.echo, 1);
        Ne.f foxtrot = n.foxtrot.foxtrot();
        C1717b c1717b = ff.l.echo;
        aa aaVar = new aa(c2240k, foxtrot, c1717b);
        aaVar.f13709a = 4;
        C2339o c2339o = AbstractC2340p.echo;
        if (c2339o != null) {
            aaVar.f13710b = c2339o;
            List juliet = ab.juliet(ao.d0(aaVar, 2, Ne.f.echo("T"), 0, c1717b));
            if (aaVar.f13712d == null) {
                ArrayList arrayList = new ArrayList(juliet);
                aaVar.f13712d = arrayList;
                aaVar.f13711c = new kotlin.reflect.jvm.internal.impl.types.l(aaVar, arrayList, aaVar.e, aaVar.f13713f);
                Set set = Collections.EMPTY_SET;
                if (set != null) {
                    Iterator it = set.iterator();
                    while (it.hasNext()) {
                        ((C2859i) ((InterfaceC2345u) it.next())).yellow = aaVar.oscar();
                    }
                    alpha = aaVar;
                    return;
                }
                aa.victor(13);
                throw null;
            }
            throw new IllegalStateException("Type parameters are already set for " + aaVar.getName());
        }
        aa.victor(9);
        throw null;
    }
}
