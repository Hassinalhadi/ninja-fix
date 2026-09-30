package com.bumptech.glide.load.engine;

/* loaded from: classes3.dex */
public final class g implements com.bumptech.glide.load.data.d {
    public final Object alpha;
    public final /* synthetic */ d purple;

    public /* synthetic */ g(d dVar, Object obj) {
        this.purple = dVar;
        this.alpha = obj;
    }

    @Override // com.bumptech.glide.load.data.d
    public void bravo(Exception exc) {
        aa aaVar = (aa) this.purple;
        J3.q qVar = (J3.q) this.alpha;
        J3.q qVar2 = aaVar.white;
        if (qVar2 != null && qVar2 == qVar) {
            aa aaVar2 = (aa) this.purple;
            J3.q qVar3 = (J3.q) this.alpha;
            i iVar = aaVar2.purple;
            c cVar = aaVar2.yellow;
            com.bumptech.glide.load.data.e eVar = qVar3.charlie;
            iVar.alpha(cVar, exc, eVar, eVar.charlie());
        }
    }

    @Override // com.bumptech.glide.load.data.d
    public void echo(Object obj) {
        aa aaVar = (aa) this.purple;
        J3.q qVar = (J3.q) this.alpha;
        J3.q qVar2 = aaVar.white;
        if (qVar2 != null && qVar2 == qVar) {
            aa aaVar2 = (aa) this.purple;
            J3.q qVar3 = (J3.q) this.alpha;
            k kVar = aaVar2.alpha.papa;
            if (obj != null && kVar.alpha(qVar3.charlie.charlie())) {
                aaVar2.teal = obj;
                aaVar2.purple.oscar(2);
            } else {
                i iVar = aaVar2.purple;
                E3.f fVar = qVar3.alpha;
                com.bumptech.glide.load.data.e eVar = qVar3.charlie;
                iVar.bravo(fVar, obj, eVar, eVar.charlie(), aaVar2.yellow);
            }
        }
    }
}
