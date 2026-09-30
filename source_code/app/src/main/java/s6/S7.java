package s6;

import android.content.Context;

/* loaded from: classes2.dex */
public final class S7 implements M7 {
    public final I7.l alpha;
    public final I7.l bravo;
    public final K7 charlie;

    public S7(Context context, K7 k72) {
        this.charlie = k72;
        C5.a aVar = C5.a.echo;
        E5.s.bravo(context);
        E5.q charlie = E5.s.alpha().charlie(aVar);
        if (C5.a.delta.contains(new B5.c("json"))) {
            this.alpha = new I7.l(new R7(charlie, 0));
        }
        this.bravo = new I7.l(new R7(charlie, 1));
    }

    @Override // s6.M7
    public final void alpha(L7 l72) {
        B5.a aVar;
        B5.a aVar2;
        K7 k72 = this.charlie;
        int i4 = k72.bravo;
        B5.d dVar = B5.d.purple;
        B5.d dVar2 = B5.d.alpha;
        int i5 = k72.bravo;
        if (i4 == 0) {
            I7.l lVar = this.alpha;
            if (lVar != null) {
                E5.r rVar = (E5.r) lVar.get();
                B0.a aVar3 = (B0.a) l72;
                if (aVar3.bravo != 0) {
                    aVar2 = new B5.a(aVar3.quebec(i5), dVar2, null);
                } else {
                    aVar2 = new B5.a(aVar3.quebec(i5), dVar, null);
                }
                rVar.alpha(aVar2, new A8.a(9));
                return;
            }
            return;
        }
        E5.r rVar2 = (E5.r) this.bravo.get();
        B0.a aVar4 = (B0.a) l72;
        if (aVar4.bravo != 0) {
            aVar = new B5.a(aVar4.quebec(i5), dVar2, null);
        } else {
            aVar = new B5.a(aVar4.quebec(i5), dVar, null);
        }
        rVar2.alpha(aVar, new A8.a(9));
    }
}
