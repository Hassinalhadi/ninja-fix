package od;

import hd.an;
import java.util.Map;
import java.util.Set;
import kotlin.collections.u;
import kotlin.jvm.internal.Intrinsics;
import sd.af;
import sd.o;
import sd.s;
import vf.a0;

/* renamed from: od.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2227d {
    public final af alpha;
    public final s bravo;
    public final o charlie;
    public final vd.e delta;
    public final a0 echo;
    public final zd.i foxtrot;
    public final Set golf;

    public C2227d(af afVar, s method, o oVar, vd.e eVar, a0 executionContext, zd.i attributes) {
        Set keySet;
        Intrinsics.echo(method, "method");
        Intrinsics.echo(executionContext, "executionContext");
        Intrinsics.echo(attributes, "attributes");
        this.alpha = afVar;
        this.bravo = method;
        this.charlie = oVar;
        this.delta = eVar;
        this.echo = executionContext;
        this.foxtrot = attributes;
        Map map = (Map) attributes.echo(fd.h.alpha);
        this.golf = (map == null || (keySet = map.keySet()) == null) ? u.alpha : keySet;
    }

    public final Object alpha() {
        an anVar = an.alpha;
        Map map = (Map) this.foxtrot.echo(fd.h.alpha);
        if (map != null) {
            return map.get(anVar);
        }
        return null;
    }

    public final String toString() {
        return "HttpRequestData(url=" + this.alpha + ", method=" + this.bravo + ')';
    }
}
