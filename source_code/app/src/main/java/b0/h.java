package b0;

import bv.aa;

/* loaded from: classes3.dex */
public abstract class h {
    public static final aa alpha;

    static {
        q qVar = d.echo;
        int i4 = qVar.charlie;
        g gVar = new g(qVar, qVar, 1);
        l lVar = d.xray;
        int i5 = lVar.charlie << 6;
        int i10 = qVar.charlie;
        int i11 = i5 | i10;
        g gVar2 = new g(qVar, lVar, 0);
        int i12 = (i10 << 6) | lVar.charlie;
        g gVar3 = new g(lVar, qVar, 0);
        aa aaVar = bv.o.alpha;
        aa aaVar2 = new aa();
        aaVar2.hotel(i4 | (i4 << 6), gVar);
        aaVar2.hotel(i11, gVar2);
        aaVar2.hotel(i12, gVar3);
        alpha = aaVar2;
    }
}
