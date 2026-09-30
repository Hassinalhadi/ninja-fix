package E5;

import B9.C0058p;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class r {
    public final i alpha;
    public final String bravo;
    public final B5.c charlie;
    public final B5.e delta;
    public final s echo;

    public r(i iVar, String str, B5.c cVar, B5.e eVar, s sVar) {
        this.alpha = iVar;
        this.bravo = str;
        this.charlie = cVar;
        this.delta = eVar;
        this.echo = sVar;
    }

    public final void alpha(B5.a aVar, B5.g gVar) {
        i iVar = this.alpha;
        String str = this.bravo;
        if (str != null) {
            B5.e eVar = this.delta;
            if (eVar != null) {
                B5.c cVar = this.charlie;
                s sVar = this.echo;
                i bravo = iVar.bravo(aVar.bravo);
                C0058p c0058p = new C0058p();
                c0058p.delta = new HashMap();
                c0058p.foxtrot = Long.valueOf(sVar.alpha.getTime());
                c0058p.golf = Long.valueOf(sVar.bravo.getTime());
                c0058p.bravo = str;
                c0058p.echo = new l(cVar, (byte[]) eVar.apply(aVar.alpha));
                c0058p.charlie = null;
                B5.b bVar = aVar.charlie;
                if (bVar != null) {
                    c0058p.hotel = bVar.alpha;
                }
                h charlie = c0058p.charlie();
                J5.a aVar2 = (J5.a) sVar.charlie;
                aVar2.getClass();
                aVar2.bravo.execute(new B2.j(aVar2, bravo, gVar, charlie, 1));
                return;
            }
            throw new NullPointerException("Null transformer");
        }
        throw new NullPointerException("Null transportName");
    }
}
