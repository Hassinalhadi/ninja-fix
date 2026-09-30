package I0;

import D0.am;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h {
    public aa alpha;
    public i bravo;

    /* JADX WARN: Multi-variable type inference failed */
    public final aa alpha(List list) {
        long bravo;
        g gVar;
        am amVar = null;
        try {
            int size = list.size();
            int i4 = 0;
            am amVar2 = null;
            while (i4 < size) {
                try {
                    gVar = (g) list.get(i4);
                } catch (Exception e) {
                    e = e;
                    amVar = amVar2;
                }
                try {
                    gVar.alpha(this.bravo);
                    i4++;
                    amVar2 = gVar;
                } catch (Exception e4) {
                    e = e4;
                    amVar = gVar;
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb3.append(((F0.e) this.bravo.white).kilo());
                    sb3.append(", composition=");
                    sb3.append(this.bravo.charlie());
                    sb3.append(", selection=");
                    i iVar = this.bravo;
                    sb3.append((Object) am.hotel(D0.ae.bravo(iVar.purple, iVar.red)));
                    sb3.append("):");
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    CollectionsKt.magenta(list, sb2, "\n", null, null, new Cb.ad(11, amVar, this), 60);
                    String sb4 = sb2.toString();
                    Intrinsics.delta(sb4, "toString(...)");
                    throw new RuntimeException(sb4, e);
                }
            }
            i iVar2 = this.bravo;
            iVar2.getClass();
            D0.g gVar2 = new D0.g(((F0.e) iVar2.white).toString());
            i iVar3 = this.bravo;
            long bravo2 = D0.ae.bravo(iVar3.purple, iVar3.red);
            am amVar3 = new am(bravo2);
            if (!am.golf(this.alpha.bravo)) {
                amVar = amVar3;
            }
            if (amVar != null) {
                bravo = amVar.alpha;
            } else {
                bravo = D0.ae.bravo(am.echo(bravo2), am.foxtrot(bravo2));
            }
            aa aaVar = new aa(gVar2, bravo, this.bravo.charlie());
            this.alpha = aaVar;
            return aaVar;
        } catch (Exception e5) {
            e = e5;
        }
    }
}
