package lf;

import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import s6.AbstractC2814x6;

/* loaded from: classes2.dex */
public abstract class v extends AbstractC2814x6 {
    public static final List bravo;

    static {
        Ne.f fVar = w.india;
        o oVar = o.echo;
        C2085k c2085k = new C2085k(fVar, new InterfaceC2079e[]{oVar, new ae(1)});
        C2085k c2085k2 = new C2085k(w.juliet, new InterfaceC2079e[]{oVar, new ae(2)}, s.alpha);
        Ne.f fVar2 = w.alpha;
        n nVar = n.charlie;
        ae aeVar = new ae(2);
        n nVar2 = n.bravo;
        C2085k c2085k3 = new C2085k(fVar2, new InterfaceC2079e[]{oVar, nVar, aeVar, nVar2});
        C2085k c2085k4 = new C2085k(w.bravo, new InterfaceC2079e[]{oVar, nVar, new ae(3), nVar2});
        C2085k c2085k5 = new C2085k(w.charlie, new InterfaceC2079e[]{oVar, nVar, new ae(), nVar2});
        C2085k c2085k6 = new C2085k(w.golf, new InterfaceC2079e[]{oVar});
        Ne.f fVar3 = w.foxtrot;
        af afVar = af.echo;
        y yVar = y.charlie;
        C2085k c2085k7 = new C2085k(fVar3, new InterfaceC2079e[]{oVar, afVar, nVar, yVar});
        Ne.f fVar4 = w.hotel;
        af afVar2 = af.delta;
        C2085k c2085k8 = new C2085k(fVar4, new InterfaceC2079e[]{oVar, afVar2});
        C2085k c2085k9 = new C2085k(w.kilo, new InterfaceC2079e[]{oVar, afVar2});
        C2085k c2085k10 = new C2085k(w.lima, new InterfaceC2079e[]{oVar, afVar2, yVar});
        C2085k c2085k11 = new C2085k(w.papa, new InterfaceC2079e[]{oVar, afVar, nVar});
        C2085k c2085k12 = new C2085k(w.quebec, new InterfaceC2079e[]{oVar, afVar, nVar});
        C2085k c2085k13 = new C2085k(w.delta, new InterfaceC2079e[]{o.delta}, t.alpha);
        C2085k c2085k14 = new C2085k(w.echo, new InterfaceC2079e[]{oVar, aa.charlie, afVar, nVar});
        C2085k c2085k15 = new C2085k(w.sierra, new InterfaceC2079e[]{oVar, afVar, nVar});
        C2085k c2085k16 = new C2085k(w.romeo, new InterfaceC2079e[]{oVar, afVar2});
        C2085k c2085k17 = new C2085k(CollectionsKt.listOf(w.november, w.oscar), new InterfaceC2079e[]{oVar}, u.alpha);
        C2085k c2085k18 = new C2085k(w.tango, new InterfaceC2079e[]{oVar, ac.charlie, afVar, nVar});
        Regex regex = w.mike;
        InterfaceC2079e[] interfaceC2079eArr = {oVar, afVar2};
        C2083i additionalChecks = C2083i.alpha;
        Intrinsics.echo(regex, "regex");
        Intrinsics.echo(additionalChecks, "additionalChecks");
        bravo = CollectionsKt.listOf(c2085k, c2085k2, c2085k3, c2085k4, c2085k5, c2085k6, c2085k7, c2085k8, c2085k9, c2085k10, c2085k11, c2085k12, c2085k13, c2085k14, c2085k15, c2085k16, c2085k17, c2085k18, new C2085k(null, regex, null, additionalChecks, (InterfaceC2079e[]) Arrays.copyOf(interfaceC2079eArr, 2)));
    }
}
