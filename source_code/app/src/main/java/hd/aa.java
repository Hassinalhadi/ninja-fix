package hd;

import java.nio.charset.Charset;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import od.C2226c;
import s6.Q4;
import t6.AbstractC2981d2;
import t6.AbstractC2991f2;

/* loaded from: classes2.dex */
public final class aa extends Pd.i implements Xd.m {
    public /* synthetic */ C2226c alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ Charset silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa(String str, Charset charset, Nd.c cVar) {
        super(3, cVar);
        this.red = str;
        this.silver = charset;
    }

    @Override // Xd.m
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        aa aaVar = new aa(this.red, this.silver, (Nd.c) obj3);
        aaVar.alpha = (C2226c) obj;
        aaVar.purple = obj2;
        return aaVar.invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        sd.e eVar;
        Charset charset;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C2226c c2226c = this.alpha;
        Object obj2 = this.purple;
        rg.b bVar = ad.alpha;
        sd.n nVar = c2226c.charlie;
        List list = sd.q.alpha;
        String K6 = nVar.K("Accept-Charset");
        sd.aa aaVar = c2226c.alpha;
        if (K6 == null) {
            StringBuilder sb2 = new StringBuilder("Adding Accept-Charset=");
            String value = this.red;
            sb2.append(value);
            sb2.append(" to ");
            sb2.append(aaVar);
            ad.alpha.hotel(sb2.toString());
            sd.n nVar2 = c2226c.charlie;
            nVar2.getClass();
            Intrinsics.echo(value, "value");
            nVar2.V(value);
            List J4 = nVar2.J("Accept-Charset");
            J4.clear();
            J4.add(value);
        }
        if (obj2 instanceof String) {
            sd.e bravo = AbstractC2991f2.bravo(c2226c);
            if (bravo != null) {
                if (!Intrinsics.areEqual(bravo.silver, sd.d.alpha.silver)) {
                    return null;
                }
            }
            String str = (String) obj2;
            if (bravo == null) {
                eVar = sd.d.alpha;
            } else {
                eVar = bravo;
            }
            if (bravo == null || (charset = AbstractC2981d2.alpha(bravo)) == null) {
                charset = this.silver;
            }
            ad.alpha.hotel("Sending request body to " + aaVar + " as text/plain with charset " + charset);
            Intrinsics.echo(eVar, "<this>");
            Intrinsics.echo(charset, "charset");
            return new vd.f(str, eVar.amber(Q4.charlie(charset)));
        }
        return null;
    }
}
